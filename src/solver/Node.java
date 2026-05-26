package solver;

/**
 * Represents a node in the Rush Hour solver search tree.
 * Contains information about the state, cost, depth, and heuristic.
 */
public class Node implements Comparable<Node> {
    private Node father;
    private int id, cost, value, depth, heuristic;
    private String state, action;

    /**
     * Constructor for the Node class.
     * 
     * @param id        Unique node identifier.
     * @param father    Parent node in the search tree.
     * @param action    Action that generated this node.
     * @param state     Board state at this node.
     * @param cost      Accumulated cost from the initial node.
     * @param depth     Node depth in the tree.
     * @param heuristic Heuristic value.
     * @param value     Node evaluation value (used for ordering).
     */
    public Node(int id, Node father, String action, String state, int cost, int depth, int heuristic, int value) {
        this.id = id;
        this.father = father;
        this.action = action;
        this.state = state;
        this.cost = cost;
        this.depth = depth;
        this.heuristic = heuristic;
        this.value = value;
    }

    /**
     * Gets the parent node.
     * 
     * @return Parent node or null if this is the initial node.
     */
    public Node getFather() {
        return father;
    }

    /**
     * Gets the node identifier.
     * 
     * @return Node ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the accumulated cost.
     * 
     * @return Cost from the initial node.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Gets the node evaluation value.
     * 
     * @return Value used to order the priority queue.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the node depth.
     * 
     * @return Depth in the search tree.
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Gets the heuristic value.
     * 
     * @return Heuristic value.
     */
    public int getHeuristic() {
        return heuristic;
    }

    /**
     * Gets the board state.
     * 
     * @return String representing the state.
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the action that generated this node.
     * 
     * @return String with the action description.
     */
    public String getAction() {
        return action;
    }

    /**
     * Returns a string representation of the node.
     * 
     * @return String formatted as:
     *         "[id,father,action,state,cost,depth,heuristic,value]".
     */
    @Override
    public String toString() {
        return "[" + id + "," + (father != null ? father.getId() : "none") + "," + action + "," + state + "," + cost
                + "," + depth + "," + heuristic + "," + value + "]";
    }

    /**
     * Compares this node with another one for ordering.
     * 
     * @param node Node to compare against.
     * @return Negative if this node is smaller, positive if it is larger, 0 if
     *         they are equal.
     */
    @Override
    public int compareTo(Node node) {
        int compare = Integer.compare(this.value, node.value);

        if (compare == 0) {
            return Integer.compare(this.id, node.id);
        }

        return compare;
    }
}