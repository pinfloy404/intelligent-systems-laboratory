# Intelligent Systems Laboratory

![java](https://img.shields.io/badge/Java-25-orange)
![doc](https://img.shields.io/badge/Docs-Javadoc-yellow)
![test](https://img.shields.io/badge/Tests-JUnit_6-green)
![gpl](https://img.shields.io/badge/License-GPLv3-blue)
![uclm](https://img.shields.io/badge/University-UCLM-red)

A Java implementation that solves Rush Hour game using graph search algorithms.pinfloy404/intelligent-systems-laboratory

Developed for the Intelligent Systems course Laboratory.

## Overview

This repository contains a **Java 25** project that automatically solves [Rush Hour](https://en.wikipedia.org/w/index.php?title=Rush_Hour_(puzzle)&oldid=1305962117) game using **graph search algorithms** methods like **BFS**, **DFS**, **UCS**, **GBF** or **A\*** according to the **course** specifications.

The game is a **puzzle** where a main vehicle has to exit the board, moving the other vehicles in a sequence that unlocks a path for the main vehicle to finally exit and complete the puzzle.

This project includes **commands** for verifying game level, retrieving information about it, creating a list of steps to complete it and solving it directly using one of the graph searches mentioned.

## Usage

This project can be executed following these instructions:

```bash
#   Clones repository
git clone https://github.com/pinfloy404/intelligent-systems-laboratory.git

#   Accesses to directory
cd intelligent-systems-laboratory
```

```bash
#   Compiles all .java files (Linux / macOS)
javac -d bin --source-path src:test -cp "lib/*" $(find src test -name "*.java")
```

```powershell
#   Compiles all .java files (Windows / PowerShell)
javac -d bin --source-path "src;test" -cp "lib/*" (Get-ChildItem -Recurse src,test -Filter *.java | ForEach-Object { $_.FullName })
```

```bash
#   Creates .jar file from compiled .java files
jar --create --file rush-hour.jar --main-class main.Main -C bin .
```

```bash
#   Executes .jar file
java -jar rush-hour.jar [args...]
```

Or you can download the last version compiled directly from [**Releases**](https://github.com/pinfloy404/intelligent-systems-laboratory/releases/).

## Commands

This project is structured in four incremental stages, each introducing new functionality. Each command corresponds to different parts of the project, which were developed sequentially.

### Part One

#### verify

```bash
java -jar rush-hour.jar verify -s [level]
```

This command verifies that string level is valid following this rules:

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

This command returns values depending on what option is selected:

| Option | Argument | Description | Returns |
| --- | --- | --- | --- |
| `--whereis` | `[letter]` | Asks where is a vehicle | $(x_1, y_1) (x_2, y_2)$ |
| `--howmany` | :x: | Asks for total number of vehicles | **12** |
| `--size` | `[letter]` | Asks for vehicle size | **2** or **3** |
| `--what` | `[row,column]` | Asks what vehicle is at position | **A-Z** or **o** |

### Part Two

#### successors

```bash
java -jar rush-hour.jar successors -s [level]
```

This command returns all valid moves and level states to successfully solve the game. The list is returned with this tuple:

$$
\langle action, state, cost \rangle
$$

- Action: Vehicle movement, follows this format: `[A-Z][+-][0-6]`
- State: Current level state after action
- Cost: Cost of the movement, it's calculated as $6 - \text{Action Movement}$

#### question II

Two additional options are avaliable:

| Option | Argument | Description | Returns |
| --- | --- | --- | --- |
| `--goal` | :x: | Asks if level is completed | **TRUE** or **FALSE** |
| `--move` | `[actions...]` | Returns level state after movements | Level state |

### Part Three

#### solver

```bash
java -jar rush-hour.jar solver -s [level] [strategy] [option] [option-args]
```

This command solves the game with **graph search**, returning the sequence of nodes that leads to solution with the following format:

`[id, father node id, action, state, cost, depth, heuristic, value]`

To search in the nodes, this project includes the following strategies:

| Strategy | Node value | Description |
| --- | --- | --- |
| [BFS](https://en.wikipedia.org/w/index.php?title=Breadth-first_search&oldid=1354179802) | Depth | Explores nodes level by level |
| [DFS](https://en.wikipedia.org/w/index.php?title=Depth-first_search&oldid=1338987378) | $-Depth$ (Negative depth) | Explores nodes depth-first |
| [UC](https://en.wikipedia.org/w/index.php?title=Dijkstra%27s_algorithm&oldid=1352136800#Practical_optimizations_and_infinite_graphs) | Cost | Expands nodes with the lowest cumulative cost |

These strategy searches includes the following options:

| Option | Argument | Description |
| --- | --- | --- |
| `--depth` | `[depth]` | Maximum depth |
| `--stats` | :x: | Returns different stats from the execution |

> [!WARNING]
> *--depth* is mandatory in **DFS**.

*stats* flag returns the following values:

| Name | Full name | Description |
| --- | --- | --- |
| ET | Estimated Time | Returns time execution in *milliseconds* |
| TN | Total Nodes | Returns the total number of generated nodes |
| EN | Expanded Nodes | Returns the total number of expanded nodes |
| CN | Cut Nodes | Returns the total number of discarded nodes |
| DF | Depth Final | Returns the depth of goal node |

### Part Four

#### solver II

Two additional strategies are avaliable:

| Strategy | Node value | Description |
| --- | --- | --- |
| [GBF](https://en.wikipedia.org/w/index.php?title=Best-first_search&oldid=1303126800) | Heuristic | Expands nodes with the lowest heuristic |
| [A*](https://en.wikipedia.org/w/index.php?title=A*_search_algorithm&oldid=1352790550) | $Cost + Heuristic$ | Expands nodes with the lowest cost and heuristic |

These strategy searches **require** the following option:

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
| 2 | $h_2(n) = h_0(n) + h_1(n)$ (combination of both) |

## Javadoc

This project contains [Javadoc](https://docs.oracle.com/en/java/javase/25/javadoc/index.html) comments documenting all Java classes. Generating documentation can be done using the following command:

```bash
javadoc -d docs -sourcepath src $(find src -name "*.java")
```

The generated documentation it's at `docs/index.html`, or by opening it directly with one of these commands depending on which *operating system* is in use:

| Operating System | Command |
| --- | --- |
| Windows | `start docs/index.html` |
| macOS | `open docs/index.html` |
| Linux | `xdg-open docs/index.html` |

## Testing

This project contains a testing module made in [JUnit 6](https://junit.org/) located at `test` folder. These tests checks that project works successfully according to **course** specifications. Executing tests can be done using the following commands:

```bash
#   Executes all tests
java -jar lib/junit-platform-console-standalone-6.1.0.jar execute -cp rush-hour.jar --scan-classpath
```

```bash
#   Executes Part One Tests
java -jar lib/junit-platform-console-standalone-6.1.0.jar execute -cp rush-hour.jar --select-class test.VerifyTest --select-class test.QuestionTest
```

```bash
#   Executes Part Two Tests
java -jar lib/junit-platform-console-standalone-6.1.0.jar execute -cp rush-hour.jar --select-class test.SuccessorsTest
```

```bash
#   Executes Part Three Tests
java -jar lib/junit-platform-console-standalone-6.1.0.jar execute -cp rush-hour.jar --select-class test.SolverFirstTest
```

```bash
#   Executes Part Four Tests
java -jar lib/junit-platform-console-standalone-6.1.0.jar execute -cp rush-hour.jar --select-class test.SolverSecondTest
```

## Example

This example solves the game using **A\* algorithm** with $h_2(n)$ and showing run stats:

```bash
java -jar rush-hour.jar solver -s oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo --strategy AStar --heuristic 2 --stats
```

```bash
[0,none,___,oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo,0,0,6,6]
[1,0,A+1,oBBBKMCCoIKMoAAILoGDDJLoGoHJEEFFHooo,5,1,5,10]
[9,1,C+1,oBBBKMoCCIKMoAAILoGDDJLoGoHJEEFFHooo,10,2,5,15]
[60,9,G+3,GBBBKMGCCIKMoAAILooDDJLoooHJEEFFHooo,13,3,5,18]
[188,60,D-1,GBBBKMGCCIKMoAAILoDDoJLoooHJEEFFHooo,18,4,5,23]
[541,188,H+1,GBBBKMGCCIKMoAAILoDDHJLoooHJEEFFoooo,23,5,5,28]
[...]
ET: 386
TN: 142104
EN: 13330
CN: 117496
DF: 39
```

## License

This repository uses the [GPLv3](https://choosealicense.com/licenses/gpl-3.0/) license.

This project has been imported from my **UCLM GitHub account** and the **Intelligent Systems course repository**, it includes modifications and corrections that are not present in the original.
