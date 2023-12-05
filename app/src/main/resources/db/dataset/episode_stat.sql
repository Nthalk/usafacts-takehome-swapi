drop table if exists episode_stat;
create table episode_stat
(
    episode                    integer,
    total_ships                integer,
    total_cost                 numeric,
    total_length               numeric,
    total_cargo_capacity       numeric,
    avg_cost                   numeric,
    avg_average_length         numeric,
    avg_average_cargo_capacity numeric,
    avg_cost_per_length        numeric,
    avg_cost_per_cargo_size    numeric
);
insert into episode_stat
select *
from (with starship as (select first_seen_in_episode,
                               episode_span,
                               s.cargo_capacity,
                               s.starship_class,
                               s.cost_in_credits,
                               length as length
                        from swapi_starship s
                        where s.cost_in_credits is not null),
           starship_class as (select first_seen_in_episode   episode,
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
      from episode_stat);
