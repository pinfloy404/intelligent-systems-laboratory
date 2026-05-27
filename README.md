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

## License

This repository uses the [GPLv3](https://choosealicense.com/licenses/gpl-3.0/) license.

This project has been imported from my **UCLM GitHub account** and the **Intelligent Systems course repository**, it includes modifications and corrections that are not present in the original.
