package solver;

/**
 * Enumeration of the search strategies available to the solver.
 */
public enum Strategy {
    /**
     * Breadth-First Search 
     */
    BFS,

    /**
     * Depth-First Search 
     */
    DFS,

    /**
     * Uniform Cost 
     */
    UC,

    /**
     * Greedy Best-First Search
     */
    GBF,

    /**
     * A* algorithm
     */
    AStar
}