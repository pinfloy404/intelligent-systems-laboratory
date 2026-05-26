package level;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import successor.Successors;
import vehicle.Vehicle;
import vehicle.Vehicles;

/**
 * Allows performing different types of queries about the level state,
 * such as vehicle location, quantity, size, and goal state verification.
 */
public class Question {
    private String level, question, questionArg;
    private Vehicles vehicles;

    /**
     * Constructor for the Question class.
     *
     * @param level A 36-character string representing the 6x6 game board.
     * @param question Type of query to perform (--whereis, --howmany, --size, --what, --goal, --move).
     * @param questionArg Additional argument for the query (can be null depending on query type).
     */
    public Question(String level, String question, String questionArg) {
        this.level = level;
        this.question = question;
        this.questionArg = questionArg;

        vehicles = new Vehicles(level);
    }

    /**
     * Processes and executes the query based on the specified type.
     * Delegates execution to the corresponding private method based on query type.
     *
     * @return String with the answer to the query, or error message if the type is invalid.
     */
    public String questionLevel() {
        switch (question) {
            case "--whereis":
                return whereIs();

            case "--howmany":
                return howMany();

            case "--size":
                return size();

            case "--what":
                return what();

            case "--goal":
                return goal();

            case "--move":
                return move();

            default:
                return "Invalid question! -> " + question;
        }
    }

    /**
     * Finds and returns all positions of a specific vehicle on the board.
     * The vehicle is identified by the letter in questionArg.
     * 
     * @return String with all coordinates (i,j) where the vehicle is located,
     *         or message indicating it is an empty cell if the argument is 'o'.
     */
    private String whereIs() {
        char letter = questionArg.charAt(0);

        if (letter == 'o') {
            return "Empty cell! :(";
        }

        String location = "";

        for (Vehicle vehicle : vehicles.getVehicles()) {
            if (vehicle.getVehicleLetter() == letter) {
                for (Integer position : vehicle.getPositions()) {
                    int i = position / 6, j = position % 6;
                    
                    location += "(" + i + "," + j + ")";
                }
            }
        }

        return location;
    }

    /**
     * Counts the total number of unique vehicles present in the level.
     * 
     * @return String with the number of distinct vehicles on the board.
     */
    private String howMany() {
        return String.valueOf(vehicles.getVehicles().size());
    }

    /**
     * Calculates the size (number of cells) of a specific vehicle.
     * The vehicle is identified by the letter in questionArg.
     * 
     * @return String with the number of cells occupied by the vehicle,
     *         or error message if the vehicle does not exist or the argument is empty.
     */
    private String size() {
        if (questionArg.isEmpty()) {
            return "Empty argument! :(";
        }

        int size = 0;

        for (Vehicle vehicle : vehicles.getVehicles()) {
            if (vehicle.getVehicle().contains(questionArg)) {
                size = vehicle.getPositions().size();
            }
        }

        return (size == 0) ? "Vehicle doesn't exists! -> " + questionArg : String.valueOf(size);
    }

    /**
     * Identifies what element (vehicle or empty space) is at a specific position on the board.
     * The position is specified in questionArg with format "row,column".
     * 
     * @return String with the character at the specified position (vehicle letter or 'o' for empty),
     *         or error message if the position is invalid or the format is incorrect.
     */
    private String what() {
        if (questionArg.isEmpty()) {
            return "Empty argument! :(";
        }

        String[] positions = questionArg.split(",");
        int x = 0, y = 0;

        if (positions.length != 2) {
            return "Invalid positions! -> " + questionArg;
        }

        x = Integer.parseInt(positions[0]);
        y = Integer.parseInt(positions[1]);

        if ((x < 0 || x >= 6) || (y < 0 || y >= 6)) {
            return "Invalid position! -> (" + x + ", " + y + ")";
        }

        return String.valueOf(level.charAt((x * 6) + y));
    }

    /**
     * Verifies if the level has reached the goal state (winning objective).
     * The goal is achieved when vehicle 'A' is at the exit position (row 2, column 5).
     * 
     * @return "TRUE" if vehicle A is at the goal position, "FALSE" otherwise.
     */
    private String goal() {
        return String.valueOf(vehicles.isGoal(level)).toUpperCase();
    }

    /**
     * Processes and executes a sequence of moves on the board vehicles.
     * Moves are specified in questionArg with format: "LetterOperatorNumber" (e.g., "A+1", "B-2").
     * Supports multiple moves separated by commas.
     * 
     * @return String representing the new board state after applying the moves,
     *         or error message if the argument is empty or has incorrect format.
     */
    private String move() {
        if (questionArg.isEmpty()) {
            return "Empty argument! :(";
        }

        List<String> moves = new ArrayList<>();

        Pattern pattern = Pattern.compile("([A-Z][+-]\\d)");
        Matcher matcher = pattern.matcher(questionArg);
        
        while (matcher.find()) {
            moves.add(matcher.group(1));
        }

        if (moves.isEmpty()) {
            return "Invalid move! -> " + questionArg;
        }

        Successors successors = new Successors(level);
        
        String state = level;

        for (String move : moves) {
            char vehicleLetter = move.charAt(0), operation = move.charAt(1);
            int moveCounter = Integer.parseInt(String.valueOf(move.charAt(2)));

            state = successors.questionMove(state, vehicleLetter, operation, moveCounter);
        }

        return state;
    }
}