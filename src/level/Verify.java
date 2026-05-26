package level;

import java.util.HashSet;
import java.util.Set;

import vehicle.Vehicle;
import vehicle.Vehicles;

/**
 * Validates that the board complies with all game rules:
 * correct size, valid characters, main vehicle present and correctly positioned,
 * vehicles with valid sizes and no duplicates.
 */
public class Verify {
    private String level;
    private Vehicles vehicles;

    /**
     * Constructor for the Verify class.
     * 
     * @param level A 36-character string representing the 6x6 board to verify.
     */
    public Verify(String level) {
        this.level = level;
        
        vehicles = new Vehicles(level);
    }

    /**
     * Verifies if the provided level is valid according to the Rush Hour game rules.
     * Executes all validations in sequential order.
     * 
     * @return Integer error code:
     *         <ul>
     *         <li>0 - Valid level (no errors)</li>
     *         <li>1 - Incorrect size (must be exactly 36 characters for 6x6 board)</li>
     *         <li>2 - Invalid characters (only uppercase letters A-Z and 'o' for empty are allowed)</li>
     *         <li>3 - Main vehicle 'A' does not exist</li>
     *         <li>4 - Vehicle 'A' is not in the correct row (must be in row 2)</li>
     *         <li>5 - Vehicle 'A' has incorrect size (must occupy exactly 2 horizontal positions)</li>
     *         <li>6 - There are vehicles with invalid size (only vehicles with 2 or 3 cells are allowed)</li>
     *         <li>7 - There are duplicate vehicles (same identifying letter used multiple times)</li>
     *         </ul>
     */
    public int verifyLevel() {
        int positionA = level.indexOf("A");

        if (level.length() != 36) {
            return 1;
        }

        if (!level.matches("^[A-Zo]+$")) {
            return 2;
        }

        if (!level.contains("A")) {
            return 3;
        }

        if (((positionA / 6) - 1) != 1) {
            return 4;
        }

        if (level.charAt(positionA + 1) != 'A') {
            return 5;
        }

        if (verifyDuplicates()) {
            return 7;
        }

        if (!verifyVehicle()) {
            return 6;
        }

        return 0;
    }

    /**
     * Verifies that all vehicles on the board have valid sizes.
     * Each vehicle must occupy exactly 2 or 3 consecutive cells (horizontally or vertically).
     * 
     * @return true if all vehicles have valid size (2 or 3 cells),
     *         false if any vehicle has invalid size.
     */
    private boolean verifyVehicle() {
        for (Vehicle vehicle : vehicles.getVehicles()) {
            int size = vehicle.getPositions().size();

            if (size < 2) {
                return false;
            }

            if (size > 3) {
                return false;
            }
        }

        return true;
    }

    /**
     * Verifies that there are no duplicate vehicles in the level.
     * Each vehicle's identifying letter must appear in only one vehicle.
     * 
     * @return true if duplicates are detected (error), false if all vehicles are unique (correct).
     */
    private boolean verifyDuplicates() {
        Set<Character> letters = new HashSet<>();

        for (Vehicle vehicle : vehicles.getVehicles()) {
            if (!letters.add(vehicle.getVehicleLetter())) {
                return true;
            }
        }

        return false;
    }
}