package solver;

import java.util.concurrent.TimeUnit;

/**
 * Stores and manages the solver execution statistics.
 * Includes execution time, total nodes, expanded nodes, pruned nodes, and
 * maximum depth reached.
 */
public class Stats {
    private long estimatedTime;
    private int totalNodes, prunedNodes, expandedNodes, maxDepthReached;

    /**
     * Constructor for the Stats class.
     * Initializes all statistics to zero.
     */
    public Stats() {
        estimatedTime = 0;
        totalNodes = 0;
        prunedNodes = 0;
        expandedNodes = 0;
        maxDepthReached = 0;
    }

    /**
     * Gets the estimated execution time.
     * 
     * @return Time in nanoseconds.
     */
    public long getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the estimated execution time.
     * 
     * @param estimatedTime Time in nanoseconds.
     */
    public void setEstimatedTime(long estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    /**
     * Gets the total number of generated nodes.
     * 
     * @return Total number of nodes.
     */
    public int getTotalNodes() {
        return totalNodes;
    }

    /**
     * Sets the total number of generated nodes.
     * 
     * @param totalNodes Total number of nodes.
     */
    public void setTotalNodes(int totalNodes) {
        this.totalNodes = totalNodes;
    }

    /**
     * Gets the number of pruned nodes (not expanded).
     * 
     * @return Number of pruned nodes.
     */
    public int getPrunedNodes() {
        return prunedNodes;
    }

    /**
     * Sets the number of pruned nodes.
     * 
     * @param prunedNodes Number of pruned nodes.
     */
    public void setPrunedNodes(int prunedNodes) {
        this.prunedNodes = prunedNodes;
    }

    /**
     * Gets the number of expanded nodes.
     * 
     * @return Number of expanded nodes.
     */
    public int getExpandedNodes() {
        return expandedNodes;
    }

    /**
     * Sets the number of expanded nodes.
     * 
     * @param expandedNodes Number of expanded nodes.
     */
    public void setExpandedNodes(int expandedNodes) {
        this.expandedNodes = expandedNodes;
    }

    /**
     * Gets the maximum depth reached.
     * 
     * @return Maximum depth.
     */
    public int getMaxDepthReached() {
        return maxDepthReached;
    }

    /**
     * Sets the maximum depth reached.
     * 
     * @param maxDepthReached Maximum depth.
     */
    public void setMaxDepthReached(int maxDepthReached) {
        this.maxDepthReached = maxDepthReached;
    }

    /**
     * Returns the statistics without including the execution time.
     * 
     * @return String with the formatted statistics.
     */
    public String toStringWithoutTime() {
        return "TN: " + totalNodes + "\nEN: " + expandedNodes
                + "\nCN: " + prunedNodes + "\nDF: " + maxDepthReached;
    }

    /**
     * Returns a complete representation of the statistics.
     * 
     * @return String with all statistics including time.
     */
    @Override
    public String toString() {
        return "ET: " + TimeUnit.NANOSECONDS.toMillis(estimatedTime) + "\nTN: " + totalNodes + "\nEN: " + expandedNodes
                + "\nCN: " + prunedNodes + "\nDF: " + maxDepthReached;
    }
}