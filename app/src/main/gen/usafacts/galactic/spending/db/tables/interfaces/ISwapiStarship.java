/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db.tables.interfaces;


import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * The table <code>swapi_starship</code>.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public interface ISwapiStarship extends Serializable {

    /**
     * Setter for <code>swapi_starship.starship_id</code>.
     */
    public ISwapiStarship setStarshipId(Integer value);

    /**
     * Getter for <code>swapi_starship.starship_id</code>.
     */
    public Integer getStarshipId();

    /**
     * Setter for <code>swapi_starship.name</code>.
     */
    public ISwapiStarship setName(String value);

    /**
     * Getter for <code>swapi_starship.name</code>.
     */
    @Size(max = 255)
    public String getName();

    /**
     * Setter for <code>swapi_starship.model</code>.
     */
    public ISwapiStarship setModel(String value);

    /**
     * Getter for <code>swapi_starship.model</code>.
     */
    @Size(max = 255)
    public String getModel();

    /**
     * Setter for <code>swapi_starship.manufacturer</code>.
     */
    public ISwapiStarship setManufacturer(String value);

    /**
     * Getter for <code>swapi_starship.manufacturer</code>.
     */
    @Size(max = 255)
    public String getManufacturer();

    /**
     * Setter for <code>swapi_starship.cost_in_credits</code>.
     */
    public ISwapiStarship setCostInCredits(BigDecimal value);

    /**
     * Getter for <code>swapi_starship.cost_in_credits</code>.
     */
    public BigDecimal getCostInCredits();

    /**
     * Setter for <code>swapi_starship.length</code>.
     */
    public ISwapiStarship setLength(BigDecimal value);

    /**
     * Getter for <code>swapi_starship.length</code>.
     */
    public BigDecimal getLength();

    /**
     * Setter for <code>swapi_starship.max_atmosphering_speed</code>.
     */
    public ISwapiStarship setMaxAtmospheringSpeed(String value);

    /**
     * Getter for <code>swapi_starship.max_atmosphering_speed</code>.
     */
    @Size(max = 255)
    public String getMaxAtmospheringSpeed();

    /**
     * Setter for <code>swapi_starship.crew</code>.
     */
    public ISwapiStarship setCrew(String value);

    /**
     * Getter for <code>swapi_starship.crew</code>.
     */
    @Size(max = 255)
    public String getCrew();

    /**
     * Setter for <code>swapi_starship.passengers</code>.
     */
    public ISwapiStarship setPassengers(String value);

    /**
     * Getter for <code>swapi_starship.passengers</code>.
     */
    @Size(max = 255)
    public String getPassengers();

    /**
     * Setter for <code>swapi_starship.cargo_capacity</code>.
     */
    public ISwapiStarship setCargoCapacity(BigDecimal value);

    /**
     * Getter for <code>swapi_starship.cargo_capacity</code>.
     */
    public BigDecimal getCargoCapacity();

    /**
     * Setter for <code>swapi_starship.consumables</code>.
     */
    public ISwapiStarship setConsumables(String value);

    /**
     * Getter for <code>swapi_starship.consumables</code>.
     */
    @Size(max = 255)
    public String getConsumables();

    /**
     * Setter for <code>swapi_starship.hyperdrive_rating</code>.
     */
    public ISwapiStarship setHyperdriveRating(String value);

    /**
     * Getter for <code>swapi_starship.hyperdrive_rating</code>.
     */
    @Size(max = 255)
    public String getHyperdriveRating();

    /**
     * Setter for <code>swapi_starship.MGLT</code>.
     */
    public ISwapiStarship setMglt(String value);

    /**
     * Getter for <code>swapi_starship.MGLT</code>.
     */
    @Size(max = 255)
    public String getMglt();

    /**
     * Setter for <code>swapi_starship.starship_class</code>.
     */
    public ISwapiStarship setStarshipClass(String value);

    /**
     * Getter for <code>swapi_starship.starship_class</code>.
     */
    @Size(max = 255)
    public String getStarshipClass();

    /**
     * Setter for <code>swapi_starship.created</code>.
     */
    public ISwapiStarship setCreated(LocalDateTime value);

    /**
     * Getter for <code>swapi_starship.created</code>.
     */
    public LocalDateTime getCreated();

    /**
     * Setter for <code>swapi_starship.edited</code>.
     */
    public ISwapiStarship setEdited(LocalDateTime value);

    /**
     * Getter for <code>swapi_starship.edited</code>.
     */
    public LocalDateTime getEdited();

    /**
     * Setter for <code>swapi_starship.url</code>.
     */
    public ISwapiStarship setUrl(String value);

    /**
     * Getter for <code>swapi_starship.url</code>.
     */
    @Size(max = 255)
    public String getUrl();

    /**
     * Setter for <code>swapi_starship.first_seen_in_episode</code>.
     */
    public ISwapiStarship setFirstSeenInEpisode(Integer value);

    /**
     * Getter for <code>swapi_starship.first_seen_in_episode</code>.
     */
    public Integer getFirstSeenInEpisode();

    /**
     * Setter for <code>swapi_starship.episode_span</code>.
     */
    public ISwapiStarship setEpisodeSpan(Integer value);

    /**
     * Getter for <code>swapi_starship.episode_span</code>.
     */
    public Integer getEpisodeSpan();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISwapiStarship
     */
    public void from(ISwapiStarship from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISwapiStarship
     */
    public <E extends ISwapiStarship> E into(E into);
}