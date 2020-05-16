/*
 * This file is generated by jOOQ.
 */
package DB.Tables.tables;


import DB.Tables.Keys;
import DB.Tables.Testdb;
import DB.Tables.tables.records.TabletestRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Tabletest extends TableImpl<TabletestRecord> {

    private static final long serialVersionUID = -78569642;

    /**
     * The reference instance of <code>testdb.tabletest</code>
     */
    public static final Tabletest TABLETEST = new Tabletest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TabletestRecord> getRecordType() {
        return TabletestRecord.class;
    }

    /**
     * The column <code>testdb.tabletest.A</code>.
     */
    public final TableField<TabletestRecord, Integer> A = createField(DSL.name("A"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>testdb.tabletest.B</code>.
     */
    public final TableField<TabletestRecord, String> B = createField(DSL.name("B"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>testdb.tabletest.C</code>.
     */
    public final TableField<TabletestRecord, LocalDate> C = createField(DSL.name("C"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * Create a <code>testdb.tabletest</code> table reference
     */
    public Tabletest() {
        this(DSL.name("tabletest"), null);
    }

    /**
     * Create an aliased <code>testdb.tabletest</code> table reference
     */
    public Tabletest(String alias) {
        this(DSL.name(alias), TABLETEST);
    }

    /**
     * Create an aliased <code>testdb.tabletest</code> table reference
     */
    public Tabletest(Name alias) {
        this(alias, TABLETEST);
    }

    private Tabletest(Name alias, Table<TabletestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tabletest(Name alias, Table<TabletestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tabletest(Table<O> child, ForeignKey<O, TabletestRecord> key) {
        super(child, key, TABLETEST);
    }

    @Override
    public Schema getSchema() {
        return Testdb.TESTDB;
    }

    @Override
    public UniqueKey<TabletestRecord> getPrimaryKey() {
        return Keys.KEY_TABLETEST_PRIMARY;
    }

    @Override
    public List<UniqueKey<TabletestRecord>> getKeys() {
        return Arrays.<UniqueKey<TabletestRecord>>asList(Keys.KEY_TABLETEST_PRIMARY);
    }

    @Override
    public Tabletest as(String alias) {
        return new Tabletest(DSL.name(alias), this);
    }

    @Override
    public Tabletest as(Name alias) {
        return new Tabletest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tabletest rename(String name) {
        return new Tabletest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tabletest rename(Name name) {
        return new Tabletest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, LocalDate> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
