package vehicle;

import java.util.List;

/**
 * Represents a vehicle on the Rush Hour game board.
 * Each vehicle has a position, orientation, and an identifying letter.
 */
public class Vehicle {
    private List<Integer> positions;
    private String vehicle;
    private int orientation;
    char vehicleLetter;

    /**
     * Constructor for the Vehicle class.
     * 
     * @param positions List of positions occupied by the vehicle on the board.
     * @param vehicle String representing the vehicle (formed by its letter repeated).
     * @param orientation Vehicle orientation (0: horizontal, 1: vertical, -1: undefined).
     */
    public Vehicle(List<Integer> positions, String vehicle, int orientation) {
        this.positions = positions;
        this.vehicle = vehicle;
        this.orientation = orientation;

        vehicleLetter = vehicle.charAt(0);
    }

    /**
     * Gets the list of vehicle positions.
     * 
     * @return List of integers with the occupied positions.
     */
    public List<Integer> getPositions() {
        return positions;
    }

    /**
     * Sets the positions of the vehicle.
     * 
     * @param positions New list of positions.
     */
    public void setPositions(List<Integer> positions) {
        this.positions = positions;
    }

    /**
     * Gets the string representation of the vehicle.
     * 
     * @return String formed by the vehicle's letter repeated.
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Gets the vehicle orientation.
     * 
     * @return 0 for horizontal, 1 for vertical, -1 for undefined.
     */
    public int getOrientation() {
        return orientation;
    }

    /**
     * Gets the identifying letter of the vehicle.
     * 
     * @return Character that identifies the vehicle.
     */
    public char getVehicleLetter() {
        return vehicleLetter;
    }

    /**
     * Returns a string representation of the vehicle.
     * 
     * @return String with the format: "letter -> positions - orientation".
     */
    @Override
    public String toString() {
        String orientationText = "";

        switch (orientation) {
            case 0:
                orientationText = "HZ";
                break;

            case 1:
                orientationText = "VT";
                break;

            case -1:
                orientationText = ":)";
        }

        return vehicle + " -> " + positions + " - " + orientationText;
    }
}