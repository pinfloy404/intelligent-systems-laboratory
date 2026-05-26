/**
 * Package that implements search algorithms to solve the Rush Hour game.
 * 
 * <p>This package provides different search strategies to find the optimal
 * solution from an initial state to the game's goal state.</p>
 * 
 * <p>Implemented search strategies:</p>
 * <ul>
 * <li><b>BFS</b> (Breadth-First Search)</li>
 * <li><b>DFS</b> (Depth-First Search)</li>
 * <li><b>UC</b> (Uniform Cost)</li>
 * <li><b>GBF</b> (Greedy Best-First)</li>
 * <li><b>A*</b> (A-Star) with heuristic</li>
 * </ul>
 * 
 * <p>Main classes:</p>
 * <ul>
 * <li>{@link solver.Solver} - Main search engine with algorithm implementations</li>
 * <li>{@link solver.Node} - Represents a node in the search tree</li>
 * <li>{@link solver.Strategy} - Enumeration of available search strategies</li>
 * <li>{@link solver.Stats} - Collects solver execution statistics</li>
 * </ul>
 */
package solver;
