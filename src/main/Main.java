package main;

/**
 * Program entry point that processes command-line arguments
 * and executes the available operations.
 */
public class Main {

    /**
     * Constructor for the Main class.
     * 
     * This is included to avoid the Javadoc warning.
     */
    public Main() {}

    /**
     * Main method of the program.
     * Processes command-line arguments and executes the corresponding command.
     *
     * @param args Command-line arguments:
     *             <ul>
     *             <li>args[0]: Command to execute (verify, question, successors, solver)</li>
     *             <li>args[1]: Flag "-s" followed by the level state</li>
     *             <li>args[2]: Board state (36-character string)</li>
     *             <li>args[3+]: Additional arguments depending on the command</li>
     *             </ul>
     * @throws Exception If an error occurs during execution.
     */
    public static void main(String[] args) throws Exception {
        Options options = new Options(args);

        if (!options.checkArgs()) {
            System.out.println("Incorrect arguments!");
            return;
        }

        String option = args[0].trim();

        switch (option) {
            case "verify":
                System.out.println(options.verifyOption());
                break;

            case "question":
                System.out.println(options.questionOption());
                break;

            case "successors":
                System.out.println(options.successorsOption());
                break;

            case "solver":
                System.out.println(options.solverOption());
                break;

            default:
                System.out.println("Invalid option! -> " + option);
        }
    }
}