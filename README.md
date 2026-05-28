# Intelligent Systems Laboratory

A project to automatically solve the Rush Hour game from Intelligent Systems Laboratory.

## Usage

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

This project was made step by step, so arguments correspond to parts of the project that was made sequentially.

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

| Option | Arguments | Description | Returns |
| --- | --- | --- | --- |
| `--whereis` | `[letter]` | Asks where is a vehicle | $(x_1, y_1) (x_2, y_2)$ |
| `--howmany` | :x: | Asks for total number of vehicles | **12** |
| `--size` | `[letter]` | Asks for vehicle size | **2** or **3** |
| `--what` | `[row,column]` | Asks what vehicle is at postion | **A-Z** or **o** |

## License

This repository uses the [GPLv3](https://choosealicense.com/licenses/gpl-3.0/) license.

This project has been imported from my **UCLM GitHub account** and the **Intelligent Systems course repository**, it includes modifications and corrections that are not present in the original.
