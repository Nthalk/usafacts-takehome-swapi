package usafacts.galactic.spending.app.queries

import org.jooq.Record6
import org.jooq.Table
import org.jooq.impl.DSL
import org.springframework.stereotype.Component
import usafacts.galactic.spending.db.Tables.SWAPI_STARSHIP
import usafacts.galactic.spending.db.Tables.SWAPI_STARSHIP_FILM
import java.math.BigDecimal

@Component
class StarshipQueries {


    fun starships(): Table<Record6<Int, Int, BigDecimal, String, BigDecimal, BigDecimal>> {
        val firstSeenInEpisode = DSL.select(
            DSL.min(SWAPI_STARSHIP_FILM.FILM_ID).`as`("first_episode_seen_in")
        )
            .from(SWAPI_STARSHIP_FILM)
            .where(SWAPI_STARSHIP_FILM.STARSHIP_ID.eq(SWAPI_STARSHIP.STARSHIP_ID))
            .asField<Int>()
        val episode_span = DSL.select(DSL.count())
            .from(SWAPI_STARSHIP_FILM)
            .where(SWAPI_STARSHIP_FILM.STARSHIP_ID.eq(SWAPI_STARSHIP.STARSHIP_ID))
            .asField<Int>()

        return DSL.select(
            firstSeenInEpisode,
            episode_span,
            SWAPI_STARSHIP.CARGO_CAPACITY,
            SWAPI_STARSHIP.STARSHIP_CLASS,
            SWAPI_STARSHIP.COST_IN_CREDITS,
            SWAPI_STARSHIP.LENGTH
        )
            .from(SWAPI_STARSHIP)
            .where(SWAPI_STARSHIP.COST_IN_CREDITS.isNotNull)
            .asTable("starship")
    }

    /*
    with starship as (select (select min(f.film_id)
                              from swapi_starship_film f
                              where f.starship_id = s.starship_id) as first_episode_seen_in,
                             (select count(0)
                              from swapi_starship_film f
                              where f.starship_id = s.starship_id) as episodes_seen_in,
                             s.cargo_capacity,
                             s.starship_class,
                             s.cost_in_credits,
                             length                                as length
                      from swapi_starship s
                      where s.cost_in_credits is not null),
         starship_class as (select first_episode_seen_in   episode,
                                   starship.starship_class,
                                   count(0)             as total_ships,
                                   sum(cost_in_credits) as total_cost,
                                   sum(starship.length) as total_length,
                                   sum(
                                           case
                                               when starship.cargo_capacity is not null
                                                   then starship.cargo_capacity
                                               else 0 end
                                   )                    as total_cargo_capacity,
                                   sum(
                                           case
                                               when
                                                   starship.cargo_capacity is not null then cost_in_credits
                                               else 0 end
                                   )                    as total_cost_of_cargo

                            from starship
                            group by 1, 2),
         starship_class_stat as (select episode,
                                        starship_class,
                                        total_ships,
                                        total_cost,
                                        total_length,
                                        total_cargo_capacity,
                                        round(total_cost / total_ships)                   as avg_cost,
                                        round(total_length / total_ships)                 as avg_length,
                                        round(total_cargo_capacity / total_ships)         as avg_cargo_capacity,
                                        round(total_cost / total_length)                  as cost_per_length,
                                        round(total_cost_of_cargo / total_cargo_capacity) as cost_per_cargo_size
                                 from starship_class),
         episode_stat as (select episode,
                                 sum(total_ships)                total_ships,
                                 sum(total_cost)                 total_cost,
                                 sum(total_length)               total_length,
                                 sum(total_cargo_capacity)       total_cargo_capacity,
                                 round(avg(avg_cost))            avg_cost,
                                 round(avg(avg_length))          avg_average_length,
                                 round(avg(avg_cargo_capacity))  avg_average_cargo_capacity,
                                 round(avg(cost_per_length))     avg_cost_per_length,
                                 round(avg(cost_per_cargo_size)) avg_cost_per_cargo_size
                          from starship_class_stat
                          group by 1)
    select *
    from episode_stat;





     */

}
