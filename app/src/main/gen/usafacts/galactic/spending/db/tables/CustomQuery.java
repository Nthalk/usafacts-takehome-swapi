/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db.tables;


import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
import usafacts.galactic.spending.db.tables.records.CustomQueryRecord;


/**
 * The table <code>custom_query</code>.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CustomQuery extends TableImpl<CustomQueryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>custom_query</code>
     */
    public static final CustomQuery CUSTOM_QUERY = new CustomQuery();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomQueryRecord> getRecordType() {
        return CustomQueryRecord.class;
    }

    /**
     * The column <code>custom_query.query_id</code>.
     */
    public final TableField<CustomQueryRecord, Integer> QUERY_ID = createField(DSL.name("query_id"), SQLDataType.INTEGER.identity(true), this, "");

    /**
     * The column <code>custom_query.name</code>.
     */
    public final TableField<CustomQueryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>custom_query.description</code>.
     */
    public final TableField<CustomQueryRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>custom_query.query</code>.
     */
    public final TableField<CustomQueryRecord, String> QUERY = createField(DSL.name("query"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>custom_query.table_name</code>.
     */
    public final TableField<CustomQueryRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>custom_query.created_at</code>.
     */
    public final TableField<CustomQueryRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field(DSL.raw("current_timestamp"), SQLDataType.LOCALDATETIME)), this, "");

    private CustomQuery(Name alias, Table<CustomQueryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomQuery(Name alias, Table<CustomQueryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>custom_query</code> table reference
     */
    public CustomQuery(String alias) {
        this(DSL.name(alias), CUSTOM_QUERY);
    }

    /**
     * Create an aliased <code>custom_query</code> table reference
     */
    public CustomQuery(Name alias) {
        this(alias, CUSTOM_QUERY);
    }

    /**
     * Create a <code>custom_query</code> table reference
     */
    public CustomQuery() {
        this(DSL.name("custom_query"), null);
    }

    public <O extends Record> CustomQuery(Table<O> child, ForeignKey<O, CustomQueryRecord> key) {
        super(child, key, CUSTOM_QUERY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<CustomQueryRecord, Integer> getIdentity() {
        return (Identity<CustomQueryRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomQueryRecord> getPrimaryKey() {
        return Keys.CUSTOM_QUERY__PK_CUSTOM_QUERY;
    }

    @Override
    public CustomQuery as(String alias) {
        return new CustomQuery(DSL.name(alias), this);
    }

    @Override
    public CustomQuery as(Name alias) {
        return new CustomQuery(alias, this);
    }

    @Override
    public CustomQuery as(Table<?> alias) {
        return new CustomQuery(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomQuery rename(String name) {
        return new CustomQuery(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomQuery rename(Name name) {
        return new CustomQuery(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomQuery rename(Table<?> name) {
        return new CustomQuery(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
