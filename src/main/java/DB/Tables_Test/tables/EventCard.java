/*
 * This file is generated by jOOQ.
 */
package DB.Tables_Test.tables;


import DB.Tables_Test.FwdbTest;
import DB.Tables_Test.Keys;
import DB.Tables_Test.enums.EventCardType;
import DB.Tables_Test.tables.records.EventCardRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class EventCard extends TableImpl<EventCardRecord> {

    private static final long serialVersionUID = 1324569745;

    /**
     * The reference instance of <code>fwdb_test.event_card</code>
     */
    public static final EventCard EVENT_CARD = new EventCard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventCardRecord> getRecordType() {
        return EventCardRecord.class;
    }

    /**
     * The column <code>fwdb_test.event_card.event_id</code>.
     */
    public final TableField<EventCardRecord, Integer> EVENT_ID = createField(DSL.name("event_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>fwdb_test.event_card.game_id</code>.
     */
    public final TableField<EventCardRecord, Integer> GAME_ID = createField(DSL.name("game_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>fwdb_test.event_card.offender_name</code>.
     */
    public final TableField<EventCardRecord, String> OFFENDER_NAME = createField(DSL.name("offender_name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>fwdb_test.event_card.type</code>.
     */
    public final TableField<EventCardRecord, EventCardType> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(DB.Tables_Test.enums.EventCardType.class), this, "");

    /**
     * The column <code>fwdb_test.event_card.minute</code>.
     */
    public final TableField<EventCardRecord, Integer> MINUTE = createField(DSL.name("minute"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>fwdb_test.event_card</code> table reference
     */
    public EventCard() {
        this(DSL.name("event_card"), null);
    }

    /**
     * Create an aliased <code>fwdb_test.event_card</code> table reference
     */
    public EventCard(String alias) {
        this(DSL.name(alias), EVENT_CARD);
    }

    /**
     * Create an aliased <code>fwdb_test.event_card</code> table reference
     */
    public EventCard(Name alias) {
        this(alias, EVENT_CARD);
    }

    private EventCard(Name alias, Table<EventCardRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventCard(Name alias, Table<EventCardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> EventCard(Table<O> child, ForeignKey<O, EventCardRecord> key) {
        super(child, key, EVENT_CARD);
    }

    @Override
    public Schema getSchema() {
        return FwdbTest.FWDB_TEST;
    }

    @Override
    public Identity<EventCardRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EVENT_CARD;
    }

    @Override
    public UniqueKey<EventCardRecord> getPrimaryKey() {
        return Keys.KEY_EVENT_CARD_PRIMARY;
    }

    @Override
    public List<UniqueKey<EventCardRecord>> getKeys() {
        return Arrays.<UniqueKey<EventCardRecord>>asList(Keys.KEY_EVENT_CARD_PRIMARY);
    }

    @Override
    public List<ForeignKey<EventCardRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventCardRecord, ?>>asList(Keys.FK_EVENT_CARD_GAME, Keys.FK__PLAYER_CARD);
    }

    public Game game() {
        return new Game(this, Keys.FK_EVENT_CARD_GAME);
    }

    public Player player() {
        return new Player(this, Keys.FK__PLAYER_CARD);
    }

    @Override
    public EventCard as(String alias) {
        return new EventCard(DSL.name(alias), this);
    }

    @Override
    public EventCard as(Name alias) {
        return new EventCard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventCard rename(String name) {
        return new EventCard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventCard rename(Name name) {
        return new EventCard(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, EventCardType, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}