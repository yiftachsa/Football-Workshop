/*
 * This file is generated by jOOQ.
 */
package DB.Tables.tables;


import DB.Tables.Fwdb;
import DB.Tables.Keys;
import DB.Tables.tables.records.SystemuserRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Systemuser extends TableImpl<SystemuserRecord> {

    private static final long serialVersionUID = -186792115;

    /**
     * The reference instance of <code>fwdb.systemuser</code>
     */
    public static final Systemuser SYSTEMUSER = new Systemuser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemuserRecord> getRecordType() {
        return SystemuserRecord.class;
    }

    /**
     * The column <code>fwdb.systemuser.username</code>.
     */
    public final TableField<SystemuserRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>fwdb.systemuser.name</code>.
     */
    public final TableField<SystemuserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>fwdb.systemuser.password</code>.
     */
    public final TableField<SystemuserRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>fwdb.systemuser.email</code>.
     */
    public final TableField<SystemuserRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>fwdb.systemuser.notify_by_email</code>.
     */
    public final TableField<SystemuserRecord, Boolean> NOTIFY_BY_EMAIL = createField(DSL.name("notify_by_email"), org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * Create a <code>fwdb.systemuser</code> table reference
     */
    public Systemuser() {
        this(DSL.name("systemuser"), null);
    }

    /**
     * Create an aliased <code>fwdb.systemuser</code> table reference
     */
    public Systemuser(String alias) {
        this(DSL.name(alias), SYSTEMUSER);
    }

    /**
     * Create an aliased <code>fwdb.systemuser</code> table reference
     */
    public Systemuser(Name alias) {
        this(alias, SYSTEMUSER);
    }

    private Systemuser(Name alias, Table<SystemuserRecord> aliased) {
        this(alias, aliased, null);
    }

    private Systemuser(Name alias, Table<SystemuserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Systemuser(Table<O> child, ForeignKey<O, SystemuserRecord> key) {
        super(child, key, SYSTEMUSER);
    }

    @Override
    public Schema getSchema() {
        return Fwdb.FWDB;
    }

    @Override
    public UniqueKey<SystemuserRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEMUSER_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemuserRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemuserRecord>>asList(Keys.KEY_SYSTEMUSER_PRIMARY);
    }

    @Override
    public Systemuser as(String alias) {
        return new Systemuser(DSL.name(alias), this);
    }

    @Override
    public Systemuser as(Name alias) {
        return new Systemuser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Systemuser rename(String name) {
        return new Systemuser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Systemuser rename(Name name) {
        return new Systemuser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
