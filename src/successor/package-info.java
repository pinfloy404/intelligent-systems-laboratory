/**
 * Package that manages the generation of successor states in the Rush Hour game.
 * 
 * <p>This package is responsible for calculating all possible valid moves
 * from a given board state, generating the resulting states after each move.</p>
 * 
 * <p>Main functionalities:</p>
 * <ul>
 * <li>Identify valid moves for each vehicle</li>
 * <li>Generate successor states by applying moves</li>
 * <li>Calculate costs associated with each move</li>
 * <li>Validate movement constraints (board limits, collisions)</li>
 * </ul>
 * 
 * <p>Main classes:</p>
 * <ul>
 * <li>{@link successor.Successors} - Successor state generator for a given state</li>
 * <li>{@link successor.Successor} - Represents an individual successor state with its action and cost</li>
 * </ul>
 */
package successor;
