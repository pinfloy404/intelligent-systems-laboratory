package solver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import successor.Successor;
import successor.Successors;
import vehicle.Vehicle;
import vehicle.Vehicles;

/**
 * Rush Hour game solver using different search strategies.
 * Implements informed and uninformed search algorithms to find the solution
 * path from an initial state to the goal state.
 */
public class Solver {
    private String level;
    private Strategy strategy;
    private int maxDepth;
    private int heurisitcSelector;

    private List<Node> solutionWay;
    private Stats stats;
    private Vehicles vehicles;
    private int lastID;
    private boolean fringeEmpty;

    /**
     * Constructor for non-heuristic strategies (BFS, DFS, UC).
     * 
     * @param level     Initial board state as a 36-character string.
     * @param maxDepth  Maximum search depth (0 for unlimited).
     * @param strategy  Search strategy to use (BFS, DFS, or UC).
     * @param showStats true to collect and display execution statistics.
     */
    public Solver(String level, int maxDepth, Strategy strategy, boolean showStats) {
        this.level = level;
        this.maxDepth = maxDepth;
        this.strategy = strategy;

        solverWarmUp(showStats);
    }

    /**
     * Constructor for heuristic strategies (GBF, A*).
     * 
     * @param level     Initial board state as a 36-character string.
     * @param strategy  Search strategy to use (GBF or AStar).
     * @param heuristicSelector Heuristic selector: 0 (distance), 1 (blockers), 2 (both).
     * @param showStats true to collect and display execution statistics.
     */
    public Solver(String level, Strategy strategy, int heuristicSelector, boolean showStats) {
        this.level = level;
        this.strategy = strategy;
        this.heurisitcSelector = heuristicSelector;

        solverWarmUp(showStats);
    }

    /**
     * Initializes the solver data structures.
     * Prepares the solution list, counters, and statistics.
     * 
     * @param showStats true to initialize the statistics object.
     */
    private void solverWarmUp(boolean showStats) {
        solutionWay = new ArrayList<>();
        lastID = 0;
        fringeEmpty = false;

        if (showStats) {
            stats = new Stats();
        }

        vehicles = new Vehicles(level);
    }

    /**
     * Runs the Rush Hour solver.
     * Finds the solution path from the initial state to the goal state using
     * the configured strategy. Measures execution time if statistics are
     * enabled and reconstructs the solution path from the goal node to the
     * initial node.
     */
    public void gameSolver() {
        Node goalNode = null;
        long initTime = 0;

        if (stats != null) {
            initTime = System.nanoTime();
        }

        goalNode = graphSearch();

        if (stats != null) {
            long endTime = System.nanoTime();
            stats.setEstimatedTime(endTime - initTime);
        }

        if (goalNode != null) {
            Node currentNode = goalNode;
            solutionWay.clear();

            while (currentNode != null) {
                solutionWay.add(0, currentNode);
                currentNode = currentNode.getFather();
            }
        }
    }

    /**
     * Implements the graph search algorithm.
     * Uses a priority queue to manage the frontier and a set of visited states
     * to avoid cycles. For DFS, it uses a depth map to allow re-exploration of
     * states at a lower depth.
     * 
     * @return Goal node if a solution is found, null if the queue becomes empty
     *         without a solution.
     */
    private Node graphSearch() {
        PriorityQueue<Node> fringe = new PriorityQueue<>();

        Map<String, Integer> visitedDepths = new HashMap<>();
        Set<String> visitedStates = new HashSet<>();

        Node initialNode = null;

        if (strategy == Strategy.BFS || strategy == Strategy.DFS || strategy == Strategy.UC) {
            initialNode = new Node(lastID++, null, "___", level, 0, 0, 0, 0);
        }

        if (strategy == Strategy.GBF || strategy == Strategy.AStar) {
            int heuristic = calculateHeuristic(level);
            initialNode = new Node(lastID++, null, "___", level, 0, 0, heuristic, heuristic);
        }

        fringe.add(initialNode);

        if (stats != null) {
            stats.setTotalNodes(stats.getTotalNodes() + 1);
        }

        while (true) {
            if (fringe.isEmpty()) {
                fringeEmpty = true;
                return null;
            }

            Node node = fringe.poll();

            String nodeState = node.getState();
            int nodeDepth = node.getDepth();

            if (vehicles.isGoal(nodeState)) {
                return node;
            }

            boolean expand = false;

            if (strategy == Strategy.DFS) {
                Integer depth = visitedDepths.get(nodeState);

                if ((depth == null) || (nodeDepth < depth)) {
                    visitedDepths.put(nodeState, nodeDepth);
                    expand = true;
                }
            } else if (!visitedStates.contains(nodeState)) {
                visitedStates.add(nodeState);
                expand = true;
            }

            if (expand && ((maxDepth == 0) || (Integer.valueOf(nodeDepth) < maxDepth))) {
                fringe.addAll(expandNodes(node));
            } else if (stats != null) {
                stats.setPrunedNodes(stats.getPrunedNodes() + 1);
            }
        }
    }

    /**
     * Expands a node by generating all of its successors.
     * Computes evaluation values according to the selected strategy:
     * BFS (depth), DFS (negative depth), UC (cost),
     * GBF (heuristic), A* (cost + heuristic).
     * 
     * @param father Parent node to expand.
     * @return List of generated child nodes with their computed values.
     */
    private List<Node> expandNodes(Node father) {
        List<Node> expandedNodes = new ArrayList<>();

        Successors successors = new Successors(father.getState());
        successors.buildSuccessorsList();

        int depth = father.getDepth() + 1;

        if ((stats != null) && (depth > stats.getMaxDepthReached())) {
            stats.setMaxDepthReached(depth);
        }

        for (Successor successor : successors.getSuccessorsList()) {
            String action = successor.getAction(), state = successor.getState();

            int value = 0, cost = father.getCost() + successor.getCost();
            int heuristic = calculateHeuristic(state);

            switch (strategy) {
                case BFS:
                    value = depth;
                    break;

                case DFS:
                    value = -depth;
                    break;

                case UC:
                    value = cost;
                    break;

                case GBF:
                    value = heuristic;
                    break;

                case AStar:
                    value = cost + heuristic;
                    break;
            }

            if (strategy == Strategy.BFS || strategy == Strategy.DFS || strategy == Strategy.UC) {
                expandedNodes.add(
                        new Node(lastID++, father, action, state, cost, depth, 0, value));
            }

            if (strategy == Strategy.GBF || strategy == Strategy.AStar) {
                expandedNodes.add(new Node(lastID++, father, action, state, cost, depth,
                        heuristic, value));
            }
        }

        if (stats != null) {
            stats.setExpandedNodes(stats.getExpandedNodes() + 1);
            stats.setTotalNodes(stats.getTotalNodes() + expandedNodes.size());
        }

        return expandedNodes;
    }

    /**
     * Calculates the heuristic value for a given state.
     * Implements three heuristics:
     * - Heuristic 0: Distance from vehicle A to the exit (remaining columns)
     * - Heuristic 1: Number of vehicles blocking vehicle A
     * - Heuristic 2: Sum of Heuristic 0 + Heuristic 1 (combination of both)
     * 
     * @param currentState Board state as a 36-character string.
     * @return Heuristic value according to the configured selector (0, 1, or 2).
     */
    private int calculateHeuristic(String currentState) {
        vehicles.updatePositions(currentState);

        int positionA = currentState.lastIndexOf('A'), vehicleARow = positionA / 6,
                vehicleAColumn = positionA % 6;

        int heuristic0 = 5 - vehicleAColumn, heuristic1 = 0;

        for (Vehicle vehicle : vehicles.getVehicles()) {
            if (vehicle.getVehicle().contains("A")) {
                continue;
            }

            for (int position : vehicle.getPositions()) {
                int vehicleRow = position / 6, vehicleColumn = position % 6;

                if ((vehicleRow == vehicleARow) && (vehicleColumn > vehicleAColumn)) {
                    heuristic1++;
                    break;
                }
            }
        }

        switch (heurisitcSelector) {
            case 0:
                return heuristic0;

            case 1:
                return heuristic1;

            case 2:
                return heuristic0 + heuristic1;

            default:
                return -1;
        }
    }

    /**
     * Generates a string representation of the solution path.
     * Includes all nodes from the initial state to the goal state,
     * and optionally the execution statistics.
     * 
     * @param showTime true to include execution time in the statistics.
     * @return String with the path nodes and statistics, or "Empty queue." if there is no solution.
     */
    public String showSolutionWay(boolean showTime) {
        StringBuilder wayBuilder = new StringBuilder();

        if (fringeEmpty) {
            wayBuilder.append("Empty fringe! :(");
        } else {
            for (Node node : solutionWay) {
                wayBuilder.append(node.toString()).append(System.lineSeparator());
            }

            if (stats != null) {
                if (showTime) {
                    wayBuilder.append(stats.toString());
                } else {
                    wayBuilder.append(stats.toStringWithoutTime());
                }
            }

        }

        return wayBuilder.toString().trim();
    }
}