# Team 6 Project 1 - Pacman
This is the CMSC388T Winter 21 - Team 6 Pacman project.

## Team Members
- Alejandro Rigau
- Name
- Name
- Name

## Image of our Pacman


## Usage
To run the game, simply run
```
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```
Make sure to run these commands from inside the P1 directory

javac - compiles all of the source files
java - runs the StartMenu java program
-cp - specifies the classpaths


## Part 1a - Pacman Class

### get_valid_moves()

- **Description of implementation**: This method returns all the valid moves that Pacman can make given his current position. We did it by using the Map.getLoc function to check if all of the positions around the Pacman contain a wall or not. If it contains a wall, do not add the position to the available locations array. 

- **Description of tests**: To test this, we created a list of known moves that the Pacman should be able to make at a specific position and then compared it to the output from the function at that specific location.

## Part 1b - Ghost Class

### get_valid_moves()

- **Description of implementation**: This method returns all the valid moves that Ghost can make given his current position. We did it by using the Map.getLoc function to check if all of the positions around the Ghost contain a wall or not. If it contains a wall, do not add the position to the available locations array. 
- **Description of tests**: To test this, we created a list of known moves that the Ghost should be able to make at a specific position and then compared it to the output from the function at that specific location. 

## Map Class

### getLoc(Location loc)

- **Description of implementation**: This method returns a HashSet containing the objects that are in the given location. To do this, we use the field.get() function to see what objects are in that place in the field. 
- **Description of tests**: To test it, we added the Pacman to a location and a Ghost to another location where we would then compare the returned HashSet from that location to the expected HashSet.
