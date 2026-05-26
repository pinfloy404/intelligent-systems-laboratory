package main;

import level.Question;
import level.Verify;
import solver.Solver;
import solver.Strategy;
import successor.Successors;

/**
 * Handles the Rush Hour program command-line options.
 * Processes arguments and executes the corresponding operations.
 */
public class Options {
    private String[] args;
    private String level;

    /**
     * Constructor for the Options class.
     * 
     * @param args Command-line arguments.
     */
    public Options(String[] args) {
        this.args = args;
    }

    /**
     * Verifies that the arguments are valid.
     * 
     * @return true if the arguments are valid, false otherwise.
     */
    public boolean checkArgs() {
        if (args.length == 0) {
            return false;
        }

        if (args.length < 2) {
            return false;
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].isEmpty()) {
                return false;
            }

            if (args[i].contentEquals("-s")) {
                level = args[++i].trim();
            }
        }

        return true;
    }

    /**
     * Runs the level verification option.
     * 
     * @return Verification error code.
     */
    public String verifyOption() {
        Verify verify = new Verify(level);
        return String.valueOf(verify.verifyLevel());
    }

    /**
     * Runs the level question option.
     * 
     * @return Answer to the question.
     */
    public String questionOption() {
        String questionText = args[3].trim(), questionTextArg = (args.length > 4) ? args[4].trim() : null;

        Question question = new Question(level, questionText, questionTextArg);
        return String.valueOf(question.questionLevel());
    }

    /**
     * Runs the successor generation option.
     * 
     * @return Successor list as a string.
     */
    public String successorsOption() {
        Successors successors = new Successors(level);
        successors.buildSuccessorsList();
        return successors.showSuccessors();
    }

    /**
     * Runs the solver option.
     * 
     * @return Solution path and statistics.
     */
    public String solverOption() {
        Strategy strategy = null;
        int maxDepth = 0, heuristicSelector = 0;
        boolean stats = false;

        for (int i = 3; i < args.length; i++) {
            try {
                switch (args[i]) {
                    case "--depth":
                        maxDepth = Integer.parseInt(args[++i].trim());
                        break;

                    case "--strategy":
                        strategy = Strategy.valueOf(args[++i].trim());
                        break;

                    case "--heuristic":
                        heuristicSelector = Integer.parseInt(args[++i].trim());
                        break;

                    case "--stats":
                        stats = true;
                        break;

                    default:
                        return "Invalid arguments! -> " + args[i];
                }
            } catch (Exception e) {
                return "Nop! -> " + e.getMessage();
            }
        }

        Solver solver = null;

        switch (strategy) {
            case BFS:
            case DFS:
            case UC:
                solver = new Solver(level, maxDepth, strategy, stats);
                break;

            case GBF:
            case AStar:
                solver = new Solver(level, strategy, heuristicSelector, stats);
                break;

            default:
                return "Invalid strategy! -> " + strategy;
        }

        solver.gameSolver();
        return solver.showSolutionWay(true);
    }
}