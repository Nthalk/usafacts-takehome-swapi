/*
 * This file is generated by jOOQ.
 */
package usafacts.galactic.spending.db.tables.pojos;


import java.math.BigDecimal;

import usafacts.galactic.spending.db.tables.interfaces.IEpisodeStat;


/**
 * The table <code>episode_stat</code>.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class EpisodeStat implements IEpisodeStat {

    private static final long serialVersionUID = 1L;

    private Integer episode;
    private Integer totalShips;
    private BigDecimal totalCost;
    private BigDecimal totalLength;
    private BigDecimal totalCargoCapacity;
    private BigDecimal avgCost;
    private BigDecimal avgAverageLength;
    private BigDecimal avgAverageCargoCapacity;
    private BigDecimal avgCostPerLength;
    private BigDecimal avgCostPerCargoSize;

    public EpisodeStat() {}

    public EpisodeStat(IEpisodeStat value) {
        this.episode = value.getEpisode();
        this.totalShips = value.getTotalShips();
        this.totalCost = value.getTotalCost();
        this.totalLength = value.getTotalLength();
        this.totalCargoCapacity = value.getTotalCargoCapacity();
        this.avgCost = value.getAvgCost();
        this.avgAverageLength = value.getAvgAverageLength();
        this.avgAverageCargoCapacity = value.getAvgAverageCargoCapacity();
        this.avgCostPerLength = value.getAvgCostPerLength();
        this.avgCostPerCargoSize = value.getAvgCostPerCargoSize();
    }

    public EpisodeStat(
        Integer episode,
        Integer totalShips,
        BigDecimal totalCost,
        BigDecimal totalLength,
        BigDecimal totalCargoCapacity,
        BigDecimal avgCost,
        BigDecimal avgAverageLength,
        BigDecimal avgAverageCargoCapacity,
        BigDecimal avgCostPerLength,
        BigDecimal avgCostPerCargoSize
    ) {
        this.episode = episode;
        this.totalShips = totalShips;
        this.totalCost = totalCost;
        this.totalLength = totalLength;
        this.totalCargoCapacity = totalCargoCapacity;
        this.avgCost = avgCost;
        this.avgAverageLength = avgAverageLength;
        this.avgAverageCargoCapacity = avgAverageCargoCapacity;
        this.avgCostPerLength = avgCostPerLength;
        this.avgCostPerCargoSize = avgCostPerCargoSize;
    }

    /**
     * Getter for <code>episode_stat.episode</code>.
     */
    @Override
    public Integer getEpisode() {
        return this.episode;
    }

    /**
     * Setter for <code>episode_stat.episode</code>.
     */
    @Override
    public EpisodeStat setEpisode(Integer episode) {
        this.episode = episode;
        return this;
    }

    /**
     * Getter for <code>episode_stat.total_ships</code>.
     */
    @Override
    public Integer getTotalShips() {
        return this.totalShips;
    }

    /**
     * Setter for <code>episode_stat.total_ships</code>.
     */
    @Override
    public EpisodeStat setTotalShips(Integer totalShips) {
        this.totalShips = totalShips;
        return this;
    }

    /**
     * Getter for <code>episode_stat.total_cost</code>.
     */
    @Override
    public BigDecimal getTotalCost() {
        return this.totalCost;
    }

    /**
     * Setter for <code>episode_stat.total_cost</code>.
     */
    @Override
    public EpisodeStat setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    /**
     * Getter for <code>episode_stat.total_length</code>.
     */
    @Override
    public BigDecimal getTotalLength() {
        return this.totalLength;
    }

    /**
     * Setter for <code>episode_stat.total_length</code>.
     */
    @Override
    public EpisodeStat setTotalLength(BigDecimal totalLength) {
        this.totalLength = totalLength;
        return this;
    }

    /**
     * Getter for <code>episode_stat.total_cargo_capacity</code>.
     */
    @Override
    public BigDecimal getTotalCargoCapacity() {
        return this.totalCargoCapacity;
    }

    /**
     * Setter for <code>episode_stat.total_cargo_capacity</code>.
     */
    @Override
    public EpisodeStat setTotalCargoCapacity(BigDecimal totalCargoCapacity) {
        this.totalCargoCapacity = totalCargoCapacity;
        return this;
    }

    /**
     * Getter for <code>episode_stat.avg_cost</code>.
     */
    @Override
    public BigDecimal getAvgCost() {
        return this.avgCost;
    }

    /**
     * Setter for <code>episode_stat.avg_cost</code>.
     */
    @Override
    public EpisodeStat setAvgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
        return this;
    }

    /**
     * Getter for <code>episode_stat.avg_average_length</code>.
     */
    @Override
    public BigDecimal getAvgAverageLength() {
        return this.avgAverageLength;
    }

    /**
     * Setter for <code>episode_stat.avg_average_length</code>.
     */
    @Override
    public EpisodeStat setAvgAverageLength(BigDecimal avgAverageLength) {
        this.avgAverageLength = avgAverageLength;
        return this;
    }

    /**
     * Getter for <code>episode_stat.avg_average_cargo_capacity</code>.
     */
    @Override
    public BigDecimal getAvgAverageCargoCapacity() {
        return this.avgAverageCargoCapacity;
    }

    /**
     * Setter for <code>episode_stat.avg_average_cargo_capacity</code>.
     */
    @Override
    public EpisodeStat setAvgAverageCargoCapacity(BigDecimal avgAverageCargoCapacity) {
        this.avgAverageCargoCapacity = avgAverageCargoCapacity;
        return this;
    }

    /**
     * Getter for <code>episode_stat.avg_cost_per_length</code>.
     */
    @Override
    public BigDecimal getAvgCostPerLength() {
        return this.avgCostPerLength;
    }

    /**
     * Setter for <code>episode_stat.avg_cost_per_length</code>.
     */
    @Override
    public EpisodeStat setAvgCostPerLength(BigDecimal avgCostPerLength) {
        this.avgCostPerLength = avgCostPerLength;
        return this;
    }

    /**
     * Getter for <code>episode_stat.avg_cost_per_cargo_size</code>.
     */
    @Override
    public BigDecimal getAvgCostPerCargoSize() {
        return this.avgCostPerCargoSize;
    }

    /**
     * Setter for <code>episode_stat.avg_cost_per_cargo_size</code>.
     */
    @Override
    public EpisodeStat setAvgCostPerCargoSize(BigDecimal avgCostPerCargoSize) {
        this.avgCostPerCargoSize = avgCostPerCargoSize;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EpisodeStat other = (EpisodeStat) obj;
        if (this.episode == null) {
            if (other.episode != null)
                return false;
        }
        else if (!this.episode.equals(other.episode))
            return false;
        if (this.totalShips == null) {
            if (other.totalShips != null)
                return false;
        }
        else if (!this.totalShips.equals(other.totalShips))
            return false;
        if (this.totalCost == null) {
            if (other.totalCost != null)
                return false;
        }
        else if (!this.totalCost.equals(other.totalCost))
            return false;
        if (this.totalLength == null) {
            if (other.totalLength != null)
                return false;
        }
        else if (!this.totalLength.equals(other.totalLength))
            return false;
        if (this.totalCargoCapacity == null) {
            if (other.totalCargoCapacity != null)
                return false;
        }
        else if (!this.totalCargoCapacity.equals(other.totalCargoCapacity))
            return false;
        if (this.avgCost == null) {
            if (other.avgCost != null)
                return false;
        }
        else if (!this.avgCost.equals(other.avgCost))
            return false;
        if (this.avgAverageLength == null) {
            if (other.avgAverageLength != null)
                return false;
        }
        else if (!this.avgAverageLength.equals(other.avgAverageLength))
            return false;
        if (this.avgAverageCargoCapacity == null) {
            if (other.avgAverageCargoCapacity != null)
                return false;
        }
        else if (!this.avgAverageCargoCapacity.equals(other.avgAverageCargoCapacity))
            return false;
        if (this.avgCostPerLength == null) {
            if (other.avgCostPerLength != null)
                return false;
        }
        else if (!this.avgCostPerLength.equals(other.avgCostPerLength))
            return false;
        if (this.avgCostPerCargoSize == null) {
            if (other.avgCostPerCargoSize != null)
                return false;
        }
        else if (!this.avgCostPerCargoSize.equals(other.avgCostPerCargoSize))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.episode == null) ? 0 : this.episode.hashCode());
        result = prime * result + ((this.totalShips == null) ? 0 : this.totalShips.hashCode());
        result = prime * result + ((this.totalCost == null) ? 0 : this.totalCost.hashCode());
        result = prime * result + ((this.totalLength == null) ? 0 : this.totalLength.hashCode());
        result = prime * result + ((this.totalCargoCapacity == null) ? 0 : this.totalCargoCapacity.hashCode());
        result = prime * result + ((this.avgCost == null) ? 0 : this.avgCost.hashCode());
        result = prime * result + ((this.avgAverageLength == null) ? 0 : this.avgAverageLength.hashCode());
        result = prime * result + ((this.avgAverageCargoCapacity == null) ? 0 : this.avgAverageCargoCapacity.hashCode());
        result = prime * result + ((this.avgCostPerLength == null) ? 0 : this.avgCostPerLength.hashCode());
        result = prime * result + ((this.avgCostPerCargoSize == null) ? 0 : this.avgCostPerCargoSize.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EpisodeStat (");

        sb.append(episode);
        sb.append(", ").append(totalShips);
        sb.append(", ").append(totalCost);
        sb.append(", ").append(totalLength);
        sb.append(", ").append(totalCargoCapacity);
        sb.append(", ").append(avgCost);
        sb.append(", ").append(avgAverageLength);
        sb.append(", ").append(avgAverageCargoCapacity);
        sb.append(", ").append(avgCostPerLength);
        sb.append(", ").append(avgCostPerCargoSize);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEpisodeStat from) {
        setEpisode(from.getEpisode());
        setTotalShips(from.getTotalShips());
        setTotalCost(from.getTotalCost());
        setTotalLength(from.getTotalLength());
        setTotalCargoCapacity(from.getTotalCargoCapacity());
        setAvgCost(from.getAvgCost());
        setAvgAverageLength(from.getAvgAverageLength());
        setAvgAverageCargoCapacity(from.getAvgAverageCargoCapacity());
        setAvgCostPerLength(from.getAvgCostPerLength());
        setAvgCostPerCargoSize(from.getAvgCostPerCargoSize());
    }

    @Override
    public <E extends IEpisodeStat> E into(E into) {
        into.from(this);
        return into;
    }
}