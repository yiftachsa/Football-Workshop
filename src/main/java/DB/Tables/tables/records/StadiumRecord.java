/*
 * This file is generated by jOOQ.
 */
package DB.Tables.tables.records;


import DB.Tables.tables.Stadium;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StadiumRecord extends UpdatableRecordImpl<StadiumRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1720561523;

    /**
     * Setter for <code>fwdb.stadium.stadium_id</code>.
     */
    public void setStadiumId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>fwdb.stadium.stadium_id</code>.
     */
    public Integer getStadiumId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>fwdb.stadium.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fwdb.stadium.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fwdb.stadium.location</code>.
     */
    public void setLocation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>fwdb.stadium.location</code>.
     */
    public String getLocation() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Stadium.STADIUM.STADIUM_ID;
    }

    @Override
    public Field<String> field2() {
        return Stadium.STADIUM.NAME;
    }

    @Override
    public Field<String> field3() {
        return Stadium.STADIUM.LOCATION;
    }

    @Override
    public Integer component1() {
        return getStadiumId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getLocation();
    }

    @Override
    public Integer value1() {
        return getStadiumId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getLocation();
    }

    @Override
    public StadiumRecord value1(Integer value) {
        setStadiumId(value);
        return this;
    }

    @Override
    public StadiumRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StadiumRecord value3(String value) {
        setLocation(value);
        return this;
    }

    @Override
    public StadiumRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StadiumRecord
     */
    public StadiumRecord() {
        super(Stadium.STADIUM);
    }

    /**
     * Create a detached, initialised StadiumRecord
     */
    public StadiumRecord(Integer stadiumId, String name, String location) {
        super(Stadium.STADIUM);

        set(0, stadiumId);
        set(1, name);
        set(2, location);
    }
}