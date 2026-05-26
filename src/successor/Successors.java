package successor;

import java.util.ArrayList;
import java.util.List;

import vehicle.Vehicle;
import vehicle.Vehicles;

/**
 * Generates the successor states (possible moves) from a given
 * board state.
 */
public class Successors {
    private String initialState;
    private Vehicles vehicles;

    private List<Successor> successorsList;

    /**
     * Constructs an instance of Successors.
     * 
     * @param initialState The text string that represents the current state of the
     *                     board.
     */
    public Successors(String initialState) {
        this.initialState = initialState;

        successorsList = new ArrayList<>();

        vehicles = new Vehicles(initialState);
    }

    /**
     * Returns the list of successors generated.
     * 
     * @return A list of Successor objects, where each represents
     *         a successor with its move, the new board state, and the cost.
     */
    public List<Successor> getSuccessorsList() {
        return successorsList;
    }

    /**
     * Generates the list of all possible successor moves for the current
     * board state.
     * Identifies each vehicle, determines its orientation (horizontal or vertical)
     * and calculates all valid moves it can perform.
     */
    public void buildSuccessorsList() {
        vehicles.updatePositions(initialState);

        List<Vehicle> vehicleList = vehicles.getVehicles();
        vehicleList.sort((v1, v2) -> v1.getVehicle().compareTo(v2.getVehicle()));

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getOrientation() == 1) {
                createSuccessor(vehicle, initialState, false);
                createSuccessor(vehicle, initialState, true);
            } else {
                createSuccessor(vehicle, initialState, true);
                createSuccessor(vehicle, initialState, false);
            }
        }
    }

    /**
     * Creates all possible successors for a vehicle in a specific direction.
     * 
     * @param vehicle Vehicle to move.
     * @param currentState Current state of the board.
     * @param direction Direction of movement (true: forward/down, false: backward/up).
     */
    private void createSuccessor(Vehicle vehicle, String currentState, boolean direction) {
        List<Integer> positions = new ArrayList<>(vehicle.getPositions());
        int moves = 0;

        while (true) {
            int first = positions.getFirst(), last = positions.getLast(),
                    orientation = vehicle.getOrientation();
            int step = (orientation == 0) ? 1 : 6, next = (direction == true) ? last + step : first - step;

            if (!isValidMove(orientation, first, next, currentState.length())) {
                break;
            }

            char nextLetter = currentState.charAt(next);

            if (nextLetter == 'o') {
                StringBuilder stateBuilder = new StringBuilder(currentState);
                char vehicleLetter = vehicle.getVehicleLetter();

                stateBuilder.setCharAt(next, vehicleLetter);
                stateBuilder.setCharAt((direction == true) ? first : last, 'o');

                int displacement = (direction == true) ? step : -step;

                for (int i = 0; i < positions.size(); i++) {
                    positions.set(i, positions.get(i) + displacement);
                }

                String symbol = (orientation == 0) ? ((direction == true) ? "+" : "-")
                        : ((direction == true) ? "-" : "+");
                String action = vehicleLetter + symbol + (++moves), state = stateBuilder.toString();

                successorsList.add(new Successor(action, state, (6 - moves)));

                currentState = state;
            } else {
                break;
            }
        }
    }

    /**
     * Executes a specific move on a vehicle on the board.
     * 
     * @param state Current state of the board.
     * @param vehicleLetter Letter of the vehicle to move.
     * @param operation Move operator ('+' or '-').
     * @param moves Number of positions to move.
     * @return New board state or null if the move is invalid.
     */
    public String questionMove(String state, char vehicleLetter, char operation, int moves) {
        vehicles.updatePositions(state);

        Vehicle vehicle = null;

        for (Vehicle v : vehicles.getVehicles()) {
            if (v.getVehicleLetter() == vehicleLetter) {
                vehicle = v;
                break;
            }
        }

        if (vehicle == null) {
            return null;
        }

        List<Integer> positionsBuilder = vehicle.getPositions();

        while (moves > 0) {
            int first = positionsBuilder.getFirst(), last = positionsBuilder.getLast(),
                    orientation = vehicle.getOrientation();

            int direction = (operation == '+') ? (orientation == 0 ? 1 : -1) : (orientation == 0 ? -1 : 1);
            int step = (orientation == 0) ? 1 : 6, next = (direction == 1) ? last + step : first - step;

            if (!isValidMove(orientation, first, next, state.length())) {
                return null;
            }

            char nextLetter = state.charAt(next);

            if (nextLetter == 'o') {
                StringBuilder stateBuilder = new StringBuilder(state);

                stateBuilder.setCharAt(next, vehicleLetter);
                stateBuilder.setCharAt((direction == 1) ? first : last, 'o');

                int displacement = (direction == 1) ? step : -step;

                for (int i = 0; i < positionsBuilder.size(); i++) {
                    positionsBuilder.set(i, positionsBuilder.get(i) + displacement);
                }

                state = stateBuilder.toString();
            }

            moves--;
        }

        return state;
    }

    /**
     * Validates if a move is possible: within limits and in the same
     * row/column.
     * 
     * @param orientation Vehicle orientation (0: horizontal, 1: vertical).
     * @param first       Initial position of the vehicle.
     * @param next        Next position to verify.
     * @param length      Length of the board state.
     * @return true if the move is valid, false otherwise.
     */
    private boolean isValidMove(int orientation, int first, int next, int length) {
        if ((next < 0) || (next >= length)) {
            return false;
        }

        if ((orientation == 0) && ((next / 6) != (first / 6))) {
            return false;
        }

        if ((orientation == 1) && ((next % 6) != (first % 6))) {
            return false;
        }

        return true;
    }

    /**
     * Returns a string representation of the successor list.
     * Each successor is formatted as "[move, state, cost]".
     * 
     * @return A string with all the successors generated, each on a new
     *         line.
     */
    public String showSuccessors() {
        StringBuilder successorsListText = new StringBuilder();

        for (Successor successor : successorsList) {
            successorsListText.append((successor != null) ? successor.toString() : null).append(System.lineSeparator());
        }

        return successorsListText.toString().trim();
    }
}