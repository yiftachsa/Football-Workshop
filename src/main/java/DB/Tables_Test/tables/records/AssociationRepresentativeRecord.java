/*
 * This file is generated by jOOQ.
 */
package DB.Tables_Test.tables.records;


import DB.Tables_Test.tables.AssociationRepresentative;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AssociationRepresentativeRecord extends UpdatableRecordImpl<AssociationRepresentativeRecord> implements Record1<String> {

    private static final long serialVersionUID = 772975528;

    /**
     * Setter for <code>fwdb_test.association_representative.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>fwdb_test.association_representative.username</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AssociationRepresentative.ASSOCIATION_REPRESENTATIVE.USERNAME;
    }

    @Override
    public String component1() {
        return getUsername();
    }

    @Override
    public String value1() {
        return getUsername();
    }

    @Override
    public AssociationRepresentativeRecord value1(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public AssociationRepresentativeRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AssociationRepresentativeRecord
     */
    public AssociationRepresentativeRecord() {
        super(AssociationRepresentative.ASSOCIATION_REPRESENTATIVE);
    }

    /**
     * Create a detached, initialised AssociationRepresentativeRecord
     */
    public AssociationRepresentativeRecord(String username) {
        super(AssociationRepresentative.ASSOCIATION_REPRESENTATIVE);

        set(0, username);
    }
}
