/*
 * This file is generated by jOOQ.
 */
package DB.Tables;


import DB.Tables.tables.Tabletest;
import DB.Tables.tables.records.TabletestRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>testdb</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TabletestRecord> KEY_TABLETEST_PRIMARY = UniqueKeys0.KEY_TABLETEST_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<TabletestRecord> KEY_TABLETEST_PRIMARY = Internal.createUniqueKey(Tabletest.TABLETEST, "KEY_tabletest_PRIMARY", new TableField[] { Tabletest.TABLETEST.A }, true);
    }
}
