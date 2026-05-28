# Intelligent Systems Laboratory

A project to automatically solve the Rush Hour game from Intelligent Systems Laboratory.

## What does?

This repository contains a project in *Java 25* to resolve automatically the game [**Rush Hour**](https://en.wikipedia.org/w/index.php?title=Rush_Hour_(puzzle)&oldid=1305962117) using **graph search** methods like **BFS**, **DFS**, **UCS**, **GBF** or **A\*** in the most efficent and optimized way predefined by the **course**.

The game is a puzzle where a main vehicle has to exit the board, moving the other vehicles in a sequence that unlocks a path for the main vehicle to finally exit and complete the puzzle.

This project contains a part for verifying game level, get information about it, get a list of steps to resolve it and resolve it directly using one of the graph searches mentioned.

## Usage

This project can be executed following these instructions:

> [!WARNING]
> This project was done in **Java 25**.

```bash
#   Clone repository

git clone https://github.com/pinfloy404/intelligent-systems-laboratory.git

#   Access to directory

cd intelligent-systems-laboratory

#   Compile all .java files

javac -d bin --source-path src $(find src -name "*.java")

#   Create .jar file from compiled .java files

jar --create --file rush-hour.jar -C bin .

#   Execute .jar file

java -jar rush-hour.jar [args...]
```

## Arguments

This project was carried out in stages, so arguments correspond to different parts of the project, which were developed sequentially.

### Part One

#### verify

```bash
java -jar rush-hour.jar verify -s [level]
```

This argument verifies that string level is valid following this rules:

| Rule | Description | Code |
| --- | --- | --- |
| Correct | Level is correct | 0 |
| Invalid size | Level is not **36** characters long | 1 |
| Invalid characters | Level contains characters besides **A-Z** or **o** | 2 |
| Invalid level | Vehicle *A* is missing | 3 |
| Invalid row | Vehicle *A* must be placed at **row 2** | 4 |
| Invalid orientation | Vehicle *A* must be horizontal | 5 |
| Invalid size | Vehicle size must be 2 or 3 units long | 6 |
| Invalid shape | Vehicles must be linear or not duplicated | 7 |

#### question

```bash
java -jar rush-hour.jar question -s [level] [option] [option-arg]
```

This arguments returns values depending on what option is selected:

| Option | Argument | Description | Returns |
| --- | --- | --- | --- |
| `--whereis` | `[letter]` | Asks where is a vehicle | $(x_1, y_1) (x_2, y_2)$ |
| `--howmany` | :x: | Asks for total number of vehicles | **12** |
| `--size` | `[letter]` | Asks for vehicle size | **2** or **3** |
| `--what` | `[row,column]` | Asks what vehicle is at postion | **A-Z** or **o** |

### Part Two

#### successors

```bash
java -jar rush-hour.jar successors -s [level]
```

This argument returns a list of successors, this list contains all the moves to successfully complete the game. The list is returned with this tuple:

$$
\langle action, state, cost \rangle
$$

- Action: Vehicle movement, follows this format: `[A-Z][+-][0-6]`
- State: Current level state after action
- Cost: Cost of the movement, it's calculated as $6 - \text{Action Movement}$

#### question II

This argument gets 2 more arguments:

| Option | Argument | Description | Returns |
| --- | --- | --- | --- |
| `--goal` | :x: | Asks if level is completed | **TRUE** or **FALSE** |
| `--move` | `[actions...]` | Returns level state after movements | Level state |

### Part Three

#### solve

```bash
java -jar rush-hour.jar solve -s [level] [strategy] [option] [option-args]
```

This argument resolves the game with **graph search**, creating and returning a list of nodes with the solution way with the following format:

`[id, father node id, action, state, cost, depth, heuristic, value]`

To search in the nodes, this project includes the following strategies:

| Strategy | Node value | Description |
| --- | --- | --- |
| [BFS](https://en.wikipedia.org/w/index.php?title=Breadth-first_search&oldid=1354179802) | Depth | Explore nodes level by level |
| [DFS](https://en.wikipedia.org/w/index.php?title=Depth-first_search&oldid=1338987378) | $-Depth$ (Negative depth) | Explore nodes depth-first |
| [UC](https://en.wikipedia.org/w/index.php?title=Dijkstra%27s_algorithm&oldid=1352136800#Practical_optimizations_and_infinite_graphs) | Cost | Expands nodes with the lowest cumulative cost |

With strategy searches, these includes the following options:

| Option | Argument | Description |
| --- | --- | --- |
| `--depth` | `[depth]` | Maximum depth |
| `--stats` | :x: | Returns different stats from the execution |

> [!WARNING]
> *--depth* is mandatory in **DFS**.

*stats* argument returns the following values:

| Name | Full name | Description |
| --- | --- | --- |
| ET | Estimated Time | Returns time execution in *milliseconds* |
| TN | Total Nodes | Returns the total number of generated nodes |
| EN | Expanded Nodes | Returns the total number of expaned nodes |
| CN | Cutted Nodes | Returns the total number of discarded nodes |
| DF | Depth Final | Returns the depth of goal node |

### Part Four

#### solve II

This argument gets 2 more strategies:

| Strategy | Node value | Description |
| --- | --- | --- |
| [GBF](https://en.wikipedia.org/w/index.php?title=Best-first_search&oldid=1303126800) | Heuristic | Expands nodes with the lowest heuristic |
| [A*](https://en.wikipedia.org/w/index.php?title=A*_search_algorithm&oldid=1352790550) | $Cost + Heuristic$ | Expands nodes with the lowest cost and heuristic |

These strategy searches **requires** the following option:

| Option | Argument | Description |
| --- | --- | --- |
| `--heuristic` | `[heuristic]` | Selects an heuristic |

> [!WARNING]
> *--heuristic* is mandatory with these strategies.

Heuristics are predefined, in the project there are 3 heuristics:

| Heuristic | Description |
| --- | --- |
| 0 | Distance from vehicle *A* to the exit (remaining columns) |
| 1 | Number of vehicles blocking vehicle *A* |
| 2 | Sum of Heuristic 0 + Heuristic 1 (combination of both) |

## License

This repository uses the [GPLv3](https://choosealicense.com/licenses/gpl-3.0/) license.

This project has been imported from my **UCLM GitHub account** and the **Intelligent Systems course repository**, it includes modifications and corrections that are not present in the original.
