package org.neo4j.ogm.driver.impl.model;

import org.neo4j.ogm.api.model.RowStatistics;

import java.util.Collection;

/**
 * Encapsulates {@link StatisticsModel} and row data returned by a query.
 * @author Luanne Misquitta
 */
public class RowStatisticsModel implements RowStatistics {

    private Collection<Object> rows;
    private StatisticsModel stats;

    public StatisticsModel getStats() {
        return stats;
    }

    public void setRows(Collection<Object> rows) {
        this.rows = rows;
    }

    public void setStats(StatisticsModel stats) {
        this.stats = stats;
    }

    public Collection<Object> getRows() {
        return rows;
    }
}