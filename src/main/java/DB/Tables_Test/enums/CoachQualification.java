/*
 * This file is generated by jOOQ.
 */
package DB.Tables_Test.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum CoachQualification implements EnumType {

    MAIN_COACH("MAIN_COACH"),

    SECOND_COACH("SECOND_COACH"),

    JUNIOR_COACH("JUNIOR_COACH");

    private final String literal;

    private CoachQualification(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "coach_qualification";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}