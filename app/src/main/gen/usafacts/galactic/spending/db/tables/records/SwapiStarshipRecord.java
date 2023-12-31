/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db.tables.records;


import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;

import usafacts.galactic.spending.db.tables.SwapiStarship;
import usafacts.galactic.spending.db.tables.interfaces.ISwapiStarship;


/**
 * The table <code>swapi_starship</code>.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SwapiStarshipRecord extends UpdatableRecordImpl<SwapiStarshipRecord> implements Record19<Integer, String, String, String, BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, String, String, LocalDateTime, LocalDateTime, String, Integer, Integer>, ISwapiStarship {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>swapi_starship.starship_id</code>.
     */
    @Override
    public SwapiStarshipRecord setStarshipId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.starship_id</code>.
     */
    @Override
    public Integer getStarshipId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>swapi_starship.name</code>.
     */
    @Override
    public SwapiStarshipRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.name</code>.
     */
    @Size(max = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>swapi_starship.model</code>.
     */
    @Override
    public SwapiStarshipRecord setModel(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.model</code>.
     */
    @Size(max = 255)
    @Override
    public String getModel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>swapi_starship.manufacturer</code>.
     */
    @Override
    public SwapiStarshipRecord setManufacturer(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.manufacturer</code>.
     */
    @Size(max = 255)
    @Override
    public String getManufacturer() {
        return (String) get(3);
    }

    /**
     * Setter for <code>swapi_starship.cost_in_credits</code>.
     */
    @Override
    public SwapiStarshipRecord setCostInCredits(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.cost_in_credits</code>.
     */
    @Override
    public BigDecimal getCostInCredits() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>swapi_starship.length</code>.
     */
    @Override
    public SwapiStarshipRecord setLength(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.length</code>.
     */
    @Override
    public BigDecimal getLength() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>swapi_starship.max_atmosphering_speed</code>.
     */
    @Override
    public SwapiStarshipRecord setMaxAtmospheringSpeed(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.max_atmosphering_speed</code>.
     */
    @Size(max = 255)
    @Override
    public String getMaxAtmospheringSpeed() {
        return (String) get(6);
    }

    /**
     * Setter for <code>swapi_starship.crew</code>.
     */
    @Override
    public SwapiStarshipRecord setCrew(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.crew</code>.
     */
    @Size(max = 255)
    @Override
    public String getCrew() {
        return (String) get(7);
    }

    /**
     * Setter for <code>swapi_starship.passengers</code>.
     */
    @Override
    public SwapiStarshipRecord setPassengers(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.passengers</code>.
     */
    @Size(max = 255)
    @Override
    public String getPassengers() {
        return (String) get(8);
    }

    /**
     * Setter for <code>swapi_starship.cargo_capacity</code>.
     */
    @Override
    public SwapiStarshipRecord setCargoCapacity(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.cargo_capacity</code>.
     */
    @Override
    public BigDecimal getCargoCapacity() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>swapi_starship.consumables</code>.
     */
    @Override
    public SwapiStarshipRecord setConsumables(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.consumables</code>.
     */
    @Size(max = 255)
    @Override
    public String getConsumables() {
        return (String) get(10);
    }

    /**
     * Setter for <code>swapi_starship.hyperdrive_rating</code>.
     */
    @Override
    public SwapiStarshipRecord setHyperdriveRating(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.hyperdrive_rating</code>.
     */
    @Size(max = 255)
    @Override
    public String getHyperdriveRating() {
        return (String) get(11);
    }

    /**
     * Setter for <code>swapi_starship.MGLT</code>.
     */
    @Override
    public SwapiStarshipRecord setMglt(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.MGLT</code>.
     */
    @Size(max = 255)
    @Override
    public String getMglt() {
        return (String) get(12);
    }

    /**
     * Setter for <code>swapi_starship.starship_class</code>.
     */
    @Override
    public SwapiStarshipRecord setStarshipClass(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.starship_class</code>.
     */
    @Size(max = 255)
    @Override
    public String getStarshipClass() {
        return (String) get(13);
    }

    /**
     * Setter for <code>swapi_starship.created</code>.
     */
    @Override
    public SwapiStarshipRecord setCreated(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.created</code>.
     */
    @Override
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>swapi_starship.edited</code>.
     */
    @Override
    public SwapiStarshipRecord setEdited(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.edited</code>.
     */
    @Override
    public LocalDateTime getEdited() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>swapi_starship.url</code>.
     */
    @Override
    public SwapiStarshipRecord setUrl(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.url</code>.
     */
    @Size(max = 255)
    @Override
    public String getUrl() {
        return (String) get(16);
    }

    /**
     * Setter for <code>swapi_starship.first_seen_in_episode</code>.
     */
    @Override
    public SwapiStarshipRecord setFirstSeenInEpisode(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.first_seen_in_episode</code>.
     */
    @Override
    public Integer getFirstSeenInEpisode() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>swapi_starship.episode_span</code>.
     */
    @Override
    public SwapiStarshipRecord setEpisodeSpan(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>swapi_starship.episode_span</code>.
     */
    @Override
    public Integer getEpisodeSpan() {
        return (Integer) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, String, String, String, BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, String, String, LocalDateTime, LocalDateTime, String, Integer, Integer> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Integer, String, String, String, BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, String, String, LocalDateTime, LocalDateTime, String, Integer, Integer> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SwapiStarship.SWAPI_STARSHIP.STARSHIP_ID;
    }

    @Override
    public Field<String> field2() {
        return SwapiStarship.SWAPI_STARSHIP.NAME;
    }

    @Override
    public Field<String> field3() {
        return SwapiStarship.SWAPI_STARSHIP.MODEL;
    }

    @Override
    public Field<String> field4() {
        return SwapiStarship.SWAPI_STARSHIP.MANUFACTURER;
    }

    @Override
    public Field<BigDecimal> field5() {
        return SwapiStarship.SWAPI_STARSHIP.COST_IN_CREDITS;
    }

    @Override
    public Field<BigDecimal> field6() {
        return SwapiStarship.SWAPI_STARSHIP.LENGTH;
    }

    @Override
    public Field<String> field7() {
        return SwapiStarship.SWAPI_STARSHIP.MAX_ATMOSPHERING_SPEED;
    }

    @Override
    public Field<String> field8() {
        return SwapiStarship.SWAPI_STARSHIP.CREW;
    }

    @Override
    public Field<String> field9() {
        return SwapiStarship.SWAPI_STARSHIP.PASSENGERS;
    }

    @Override
    public Field<BigDecimal> field10() {
        return SwapiStarship.SWAPI_STARSHIP.CARGO_CAPACITY;
    }

    @Override
    public Field<String> field11() {
        return SwapiStarship.SWAPI_STARSHIP.CONSUMABLES;
    }

    @Override
    public Field<String> field12() {
        return SwapiStarship.SWAPI_STARSHIP.HYPERDRIVE_RATING;
    }

    @Override
    public Field<String> field13() {
        return SwapiStarship.SWAPI_STARSHIP.MGLT;
    }

    @Override
    public Field<String> field14() {
        return SwapiStarship.SWAPI_STARSHIP.STARSHIP_CLASS;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return SwapiStarship.SWAPI_STARSHIP.CREATED;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return SwapiStarship.SWAPI_STARSHIP.EDITED;
    }

    @Override
    public Field<String> field17() {
        return SwapiStarship.SWAPI_STARSHIP.URL;
    }

    @Override
    public Field<Integer> field18() {
        return SwapiStarship.SWAPI_STARSHIP.FIRST_SEEN_IN_EPISODE;
    }

    @Override
    public Field<Integer> field19() {
        return SwapiStarship.SWAPI_STARSHIP.EPISODE_SPAN;
    }

    @Override
    public Integer component1() {
        return getStarshipId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getModel();
    }

    @Override
    public String component4() {
        return getManufacturer();
    }

    @Override
    public BigDecimal component5() {
        return getCostInCredits();
    }

    @Override
    public BigDecimal component6() {
        return getLength();
    }

    @Override
    public String component7() {
        return getMaxAtmospheringSpeed();
    }

    @Override
    public String component8() {
        return getCrew();
    }

    @Override
    public String component9() {
        return getPassengers();
    }

    @Override
    public BigDecimal component10() {
        return getCargoCapacity();
    }

    @Override
    public String component11() {
        return getConsumables();
    }

    @Override
    public String component12() {
        return getHyperdriveRating();
    }

    @Override
    public String component13() {
        return getMglt();
    }

    @Override
    public String component14() {
        return getStarshipClass();
    }

    @Override
    public LocalDateTime component15() {
        return getCreated();
    }

    @Override
    public LocalDateTime component16() {
        return getEdited();
    }

    @Override
    public String component17() {
        return getUrl();
    }

    @Override
    public Integer component18() {
        return getFirstSeenInEpisode();
    }

    @Override
    public Integer component19() {
        return getEpisodeSpan();
    }

    @Override
    public Integer value1() {
        return getStarshipId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getModel();
    }

    @Override
    public String value4() {
        return getManufacturer();
    }

    @Override
    public BigDecimal value5() {
        return getCostInCredits();
    }

    @Override
    public BigDecimal value6() {
        return getLength();
    }

    @Override
    public String value7() {
        return getMaxAtmospheringSpeed();
    }

    @Override
    public String value8() {
        return getCrew();
    }

    @Override
    public String value9() {
        return getPassengers();
    }

    @Override
    public BigDecimal value10() {
        return getCargoCapacity();
    }

    @Override
    public String value11() {
        return getConsumables();
    }

    @Override
    public String value12() {
        return getHyperdriveRating();
    }

    @Override
    public String value13() {
        return getMglt();
    }

    @Override
    public String value14() {
        return getStarshipClass();
    }

    @Override
    public LocalDateTime value15() {
        return getCreated();
    }

    @Override
    public LocalDateTime value16() {
        return getEdited();
    }

    @Override
    public String value17() {
        return getUrl();
    }

    @Override
    public Integer value18() {
        return getFirstSeenInEpisode();
    }

    @Override
    public Integer value19() {
        return getEpisodeSpan();
    }

    @Override
    public SwapiStarshipRecord value1(Integer value) {
        setStarshipId(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value3(String value) {
        setModel(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value4(String value) {
        setManufacturer(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value5(BigDecimal value) {
        setCostInCredits(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value6(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value7(String value) {
        setMaxAtmospheringSpeed(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value8(String value) {
        setCrew(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value9(String value) {
        setPassengers(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value10(BigDecimal value) {
        setCargoCapacity(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value11(String value) {
        setConsumables(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value12(String value) {
        setHyperdriveRating(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value13(String value) {
        setMglt(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value14(String value) {
        setStarshipClass(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value15(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value16(LocalDateTime value) {
        setEdited(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value17(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value18(Integer value) {
        setFirstSeenInEpisode(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord value19(Integer value) {
        setEpisodeSpan(value);
        return this;
    }

    @Override
    public SwapiStarshipRecord values(Integer value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, String value7, String value8, String value9, BigDecimal value10, String value11, String value12, String value13, String value14, LocalDateTime value15, LocalDateTime value16, String value17, Integer value18, Integer value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISwapiStarship from) {
        setStarshipId(from.getStarshipId());
        setName(from.getName());
        setModel(from.getModel());
        setManufacturer(from.getManufacturer());
        setCostInCredits(from.getCostInCredits());
        setLength(from.getLength());
        setMaxAtmospheringSpeed(from.getMaxAtmospheringSpeed());
        setCrew(from.getCrew());
        setPassengers(from.getPassengers());
        setCargoCapacity(from.getCargoCapacity());
        setConsumables(from.getConsumables());
        setHyperdriveRating(from.getHyperdriveRating());
        setMglt(from.getMglt());
        setStarshipClass(from.getStarshipClass());
        setCreated(from.getCreated());
        setEdited(from.getEdited());
        setUrl(from.getUrl());
        setFirstSeenInEpisode(from.getFirstSeenInEpisode());
        setEpisodeSpan(from.getEpisodeSpan());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ISwapiStarship> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SwapiStarshipRecord
     */
    public SwapiStarshipRecord() {
        super(SwapiStarship.SWAPI_STARSHIP);
    }

    /**
     * Create a detached, initialised SwapiStarshipRecord
     */
    public SwapiStarshipRecord(Integer starshipId, String name, String model, String manufacturer, BigDecimal costInCredits, BigDecimal length, String maxAtmospheringSpeed, String crew, String passengers, BigDecimal cargoCapacity, String consumables, String hyperdriveRating, String mglt, String starshipClass, LocalDateTime created, LocalDateTime edited, String url, Integer firstSeenInEpisode, Integer episodeSpan) {
        super(SwapiStarship.SWAPI_STARSHIP);

        setStarshipId(starshipId);
        setName(name);
        setModel(model);
        setManufacturer(manufacturer);
        setCostInCredits(costInCredits);
        setLength(length);
        setMaxAtmospheringSpeed(maxAtmospheringSpeed);
        setCrew(crew);
        setPassengers(passengers);
        setCargoCapacity(cargoCapacity);
        setConsumables(consumables);
        setHyperdriveRating(hyperdriveRating);
        setMglt(mglt);
        setStarshipClass(starshipClass);
        setCreated(created);
        setEdited(edited);
        setUrl(url);
        setFirstSeenInEpisode(firstSeenInEpisode);
        setEpisodeSpan(episodeSpan);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SwapiStarshipRecord
     */
    public SwapiStarshipRecord(usafacts.galactic.spending.db.tables.pojos.SwapiStarship value) {
        super(SwapiStarship.SWAPI_STARSHIP);

        if (value != null) {
            setStarshipId(value.getStarshipId());
            setName(value.getName());
            setModel(value.getModel());
            setManufacturer(value.getManufacturer());
            setCostInCredits(value.getCostInCredits());
            setLength(value.getLength());
            setMaxAtmospheringSpeed(value.getMaxAtmospheringSpeed());
            setCrew(value.getCrew());
            setPassengers(value.getPassengers());
            setCargoCapacity(value.getCargoCapacity());
            setConsumables(value.getConsumables());
            setHyperdriveRating(value.getHyperdriveRating());
            setMglt(value.getMglt());
            setStarshipClass(value.getStarshipClass());
            setCreated(value.getCreated());
            setEdited(value.getEdited());
            setUrl(value.getUrl());
            setFirstSeenInEpisode(value.getFirstSeenInEpisode());
            setEpisodeSpan(value.getEpisodeSpan());
            resetChangedOnNotNull();
        }
    }
}
