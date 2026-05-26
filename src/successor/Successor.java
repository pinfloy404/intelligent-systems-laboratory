package successor;

/**
 * Represents a successor state in the Rush Hour game.
 * Contains the action performed, the resulting state, and the cost of the move.
 */
public class Successor {
    private String action, state;
    private int cost;

    /**
     * Constructor for the Successor class.
     * 
     * @param action Description of the move performed (e.g., "A+1", "B-2").
     * @param state String representing the new board state.
     * @param cost Cost of the move.
     */
    public Successor(String action, String state, int cost) {
        this.action = action;
        this.state = state;
        this.cost = cost;
    }

    /**
     * Gets the action of the successor.
     * 
     * @return String with the description of the move.
     */
    public String getAction() {
        return action;
    }

    /**
     * Gets the resulting state.
     * 
     * @return String representing the board after the move.
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the cost of the move.
     * 
     * @return Integer representing the cost.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Returns a string representation of the successor.
     * 
     * @return String with the format: "[action,state,cost]".
     */
    @Override
    public String toString() {
        return "[" + action + "," + state + "," + cost + "]";
    }
}