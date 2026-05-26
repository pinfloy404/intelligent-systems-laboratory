package vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the collection of vehicles in a level of the Rush Hour game.
 * Extracts and organizes all vehicles from the board state.
 */
public class Vehicles {
    private String level;

    private List<Vehicle> vehicles;

    /**
     * Constructor for the Vehicles class.
     * 
     * @param level String representing the board state.
     */
    public Vehicles(String level) {
        this.level = level;

        createVehicleList();
    }

    /**
     * Gets the list of vehicles in the level.
     * 
     * @return List of Vehicle objects.
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * Creates the list of vehicles by extracting them from the board state.
     * Identifies each unique vehicle and determines its orientation.
     */
    private void createVehicleList() {
        vehicles = new ArrayList<>();
        
        StringBuilder levelBuilder = new StringBuilder(level);

        for (int i = 0; i < levelBuilder.length(); i++) {
            char letter = levelBuilder.charAt(i);

            if (letter == 'o') {
                continue;
            }

            List<Integer> positions = new ArrayList<>();
            String vehicle = "";

            String vehicleLetter = String.valueOf(letter);
            int index = levelBuilder.indexOf(vehicleLetter);

            while (index != -1) {
                positions.add(index);
                vehicle += vehicleLetter;

                levelBuilder.setCharAt(index, 'o');

                int aux = index;

                index = levelBuilder.indexOf(vehicleLetter);

                if (((index - aux) != 1) && ((index - aux) != 6)) {
                    break;
                }
            }

            vehicles.add(new Vehicle(positions, vehicle, calculateOrientation(positions)));
        }
    }

    /**
     * Calculates the orientation of a vehicle based on its positions.
     * 
     * @param positions List of vehicle positions.
     * @return 0 for horizontal, 1 for vertical, -1 if it has only one position.
     */
    private int calculateOrientation(List<Integer> positions) {
        if (positions.size() == 1) {
            return -1;
        }

        return ((positions.get(1) - positions.getFirst()) < 2) ? 0 : 1;
    }

    /**
     * Verifies if the state represents a winning configuration.
     * The game is won when vehicle 'A' reaches the position (2, 5).
     * 
     * @param state String representing the board state.
     * @return true if vehicle 'A' is at the goal position, false otherwise.
     */
    public boolean isGoal(String state) {
        int position = state.lastIndexOf("A"), row = position / 6, col = position % 6;
        return (row == 2) && (col == 5);
    }

    /**
     * Updates the positions of all vehicles based on the given state.
     * 
     * @param state The text string representing the current board state.
     */
    public void updatePositions(String state) {
        for (Vehicle vehicle : vehicles) {
            List<Integer> updatedPositions = new ArrayList<>();

            for (int i = 0; i < state.length(); i++) {
                if (state.charAt(i) == vehicle.getVehicleLetter()) {
                    updatedPositions.add(i);
                }
            }

            vehicle.setPositions(updatedPositions);
        }
    }
}