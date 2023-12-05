/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import usafacts.galactic.spending.db.tables.CustomQuery;
import usafacts.galactic.spending.db.tables.SwapiStarship;
import usafacts.galactic.spending.db.tables.SwapiStarshipFilm;
import usafacts.galactic.spending.db.tables.records.CustomQueryRecord;
import usafacts.galactic.spending.db.tables.records.SwapiStarshipFilmRecord;
import usafacts.galactic.spending.db.tables.records.SwapiStarshipRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in the
 * default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomQueryRecord> CUSTOM_QUERY__PK_CUSTOM_QUERY = Internal.createUniqueKey(CustomQuery.CUSTOM_QUERY, DSL.name("pk_custom_query"), new TableField[] { CustomQuery.CUSTOM_QUERY.QUERY_ID }, true);
    public static final UniqueKey<SwapiStarshipRecord> SWAPI_STARSHIP__SWAPI_STARSHIP_PK = Internal.createUniqueKey(SwapiStarship.SWAPI_STARSHIP, DSL.name("swapi_starship_pk"), new TableField[] { SwapiStarship.SWAPI_STARSHIP.STARSHIP_ID }, true);
    public static final UniqueKey<SwapiStarshipFilmRecord> SWAPI_STARSHIP_FILM__SWAPI_STARSHIP_FILM_PK = Internal.createUniqueKey(SwapiStarshipFilm.SWAPI_STARSHIP_FILM, DSL.name("swapi_starship_film_pk"), new TableField[] { SwapiStarshipFilm.SWAPI_STARSHIP_FILM.STARSHIP_ID, SwapiStarshipFilm.SWAPI_STARSHIP_FILM.FILM_ID }, true);
}
