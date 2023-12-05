/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import usafacts.galactic.spending.db.DefaultSchema;
import usafacts.galactic.spending.db.Keys;
import usafacts.galactic.spending.db.tables.records.SwapiStarshipRecord;


/**
 * The table <code>swapi_starship</code>.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SwapiStarship extends TableImpl<SwapiStarshipRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>swapi_starship</code>
     */
    public static final SwapiStarship SWAPI_STARSHIP = new SwapiStarship();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SwapiStarshipRecord> getRecordType() {
        return SwapiStarshipRecord.class;
    }

    /**
     * The column <code>swapi_starship.starship_id</code>.
     */
    public final TableField<SwapiStarshipRecord, Integer> STARSHIP_ID = createField(DSL.name("starship_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>swapi_starship.name</code>.
     */
    public final TableField<SwapiStarshipRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.model</code>.
     */
    public final TableField<SwapiStarshipRecord, String> MODEL = createField(DSL.name("model"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.manufacturer</code>.
     */
    public final TableField<SwapiStarshipRecord, String> MANUFACTURER = createField(DSL.name("manufacturer"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.cost_in_credits</code>.
     */
    public final TableField<SwapiStarshipRecord, BigDecimal> COST_IN_CREDITS = createField(DSL.name("cost_in_credits"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>swapi_starship.length</code>.
     */
    public final TableField<SwapiStarshipRecord, BigDecimal> LENGTH = createField(DSL.name("length"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>swapi_starship.max_atmosphering_speed</code>.
     */
    public final TableField<SwapiStarshipRecord, String> MAX_ATMOSPHERING_SPEED = createField(DSL.name("max_atmosphering_speed"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.crew</code>.
     */
    public final TableField<SwapiStarshipRecord, String> CREW = createField(DSL.name("crew"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.passengers</code>.
     */
    public final TableField<SwapiStarshipRecord, String> PASSENGERS = createField(DSL.name("passengers"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.cargo_capacity</code>.
     */
    public final TableField<SwapiStarshipRecord, BigDecimal> CARGO_CAPACITY = createField(DSL.name("cargo_capacity"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>swapi_starship.consumables</code>.
     */
    public final TableField<SwapiStarshipRecord, String> CONSUMABLES = createField(DSL.name("consumables"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.hyperdrive_rating</code>.
     */
    public final TableField<SwapiStarshipRecord, String> HYPERDRIVE_RATING = createField(DSL.name("hyperdrive_rating"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.MGLT</code>.
     */
    public final TableField<SwapiStarshipRecord, String> MGLT = createField(DSL.name("MGLT"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.starship_class</code>.
     */
    public final TableField<SwapiStarshipRecord, String> STARSHIP_CLASS = createField(DSL.name("starship_class"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.created</code>.
     */
    public final TableField<SwapiStarshipRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>swapi_starship.edited</code>.
     */
    public final TableField<SwapiStarshipRecord, LocalDateTime> EDITED = createField(DSL.name("edited"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>swapi_starship.url</code>.
     */
    public final TableField<SwapiStarshipRecord, String> URL = createField(DSL.name("url"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>swapi_starship.first_seen_in_episode</code>.
     */
    public final TableField<SwapiStarshipRecord, Integer> FIRST_SEEN_IN_EPISODE = createField(DSL.name("first_seen_in_episode"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>swapi_starship.episode_span</code>.
     */
    public final TableField<SwapiStarshipRecord, Integer> EPISODE_SPAN = createField(DSL.name("episode_span"), SQLDataType.INTEGER, this, "");

    private SwapiStarship(Name alias, Table<SwapiStarshipRecord> aliased) {
        this(alias, aliased, null);
    }

    private SwapiStarship(Name alias, Table<SwapiStarshipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>swapi_starship</code> table reference
     */
    public SwapiStarship(String alias) {
        this(DSL.name(alias), SWAPI_STARSHIP);
    }

    /**
     * Create an aliased <code>swapi_starship</code> table reference
     */
    public SwapiStarship(Name alias) {
        this(alias, SWAPI_STARSHIP);
    }

    /**
     * Create a <code>swapi_starship</code> table reference
     */
    public SwapiStarship() {
        this(DSL.name("swapi_starship"), null);
    }

    public <O extends Record> SwapiStarship(Table<O> child, ForeignKey<O, SwapiStarshipRecord> key) {
        super(child, key, SWAPI_STARSHIP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<SwapiStarshipRecord> getPrimaryKey() {
        return Keys.SWAPI_STARSHIP__SWAPI_STARSHIP_PK;
    }

    @Override
    public SwapiStarship as(String alias) {
        return new SwapiStarship(DSL.name(alias), this);
    }

    @Override
    public SwapiStarship as(Name alias) {
        return new SwapiStarship(alias, this);
    }

    @Override
    public SwapiStarship as(Table<?> alias) {
        return new SwapiStarship(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SwapiStarship rename(String name) {
        return new SwapiStarship(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SwapiStarship rename(Name name) {
        return new SwapiStarship(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SwapiStarship rename(Table<?> name) {
        return new SwapiStarship(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, String, String, String, BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, String, String, LocalDateTime, LocalDateTime, String, Integer, Integer> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super Integer, ? super String, ? super String, ? super String, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super Integer, ? super String, ? super String, ? super String, ? super BigDecimal, ? super BigDecimal, ? super String, ? super String, ? super String, ? super BigDecimal, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}