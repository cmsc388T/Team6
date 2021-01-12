# Team 6 Project 1 - Pacman
This is the CMSC388T Winter 21 - Team 6 Pacman project.

## Team Members
- Alejandro Rigau
- Zachary Dodge
- Jeffrey Jiang
- Samuel Markey

## Image of our Pacman Game


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

### consume()

- **Description of implementation**: This method either returns the JComponent of the cookie consumed or it returns null, if there is no cookie to consume where pacman is. The method uses a method from the Map class called eatCookie() and returns the value from that method.

- **Description of tests**: In order to test this, Pacman is added to the board at a certain starting location. Pacman is then moved throughout the whole board while calling the consume method, and the number of cookies is added up and compared to the max amount of cookies on the board.

### is_ghost_in_range()

- **Description of implementation**: This method returns true if Pacman is in attack range of any ghosts, and false otherwise. PacMan is in attack range of a ghost if there is a ghost within (x ± 1, y ± 1) of Pacman's location.

- **Description of tests**: To test this, Pacman and a ghost are added to the game at various locations. Some placements involve the Pacman being in attack range of the ghost, and some involve Pacman not being in range of the ghost.

### move()

- **Description of implementation**: This method uses get_valid_moves to find random moves that Pacman can make, and then randomly selects on of these moves and changes Pacman's position to a new location while returning true. If Pacman can make no moves, this method will return false and not move Pacman.

- **Description of tests**: For this test, I set Pacman to a location and recorded what moves were available. I moved Pacman and check to ensure that it either moved and had a different list of available moves, or did not move and had the same available moves(which should be an empty list).

## Part 1b - Ghost Class

### get_valid_moves()

- **Description of implementation**: This method returns all the valid moves that Ghost can make given his current position. We did it by using the Map.getLoc function to check if all of the positions around the Ghost contain a wall or not. If it contains a wall, do not add the position to the available locations array. 

- **Description of tests**: To test this, we created a list of known moves that the Ghost should be able to make at a specific position and then compared it to the output from the function at that specific location. 

### attack()

- **Description of implementation**: This method returns a boolean which is true if a ghost attacked Pacman and false otherwise. This method calls a method in the Ghost class called is_pacman_in_range() and if that method returns true, then the method Map.attack() is called to attack Pacman.

- **Description of tests**: In order to test this, Pacman and two ghosts are added to the board. They are then put in various locations where the ghosts should and should not be able to attack Pacman, and the attack method is called and the output tested.

### is_pacman_in_range()

- **Description of implementation**: This method returns true if Pacman is in attack range of this ghost, and false otherwise. PacMan is in attack range of this ghost if Pacman is found within (x ± 1, y ± 1) of this ghost's location.

- **Description of tests**: To test this, Pacman and a ghost are added to the game at various locations. Some placements involve the Pacman being in attack range of the ghost, and some involve Pacman not being in range of the ghost.

### move

- **Description of implementation**: This method uses get_valid_moves to find random moves that the Ghost can make, and then randomly selects on of these moves and changes the Ghost's position to a new location while returning true. If the Ghost can make no moves, this method will return false and not move the Ghost.

- **Description of tests**: For this test, I set a Ghost to a location and recorded what moves were available. I moved the Ghost and check to ensure that it either moved and had a different list of available moves, or did not move and had the same available moves(which should be an empty list).

## Map Class

### getLoc(Location loc)

- **Description of implementation**: This method returns a HashSet containing the objects that are in the given location. To do this, we use the field.get() function to see what objects are in that place in the field. 

- **Description of tests**: To test it, we added the Pacman to a location and a Ghost to another location where we would then compare the returned HashSet from that location to the expected HashSet.

### eatCookie()

- **Description of implementation**: This method returns the JComponent of the cookie whose name is entered. It also removes the cookie from the field and other varibles in the Map class, while incrementing the cookie counter.

- **Description of tests**: In order to test this, a map is created and the eatCookie() method is run on all parts of the field. If the map returns a cookie a counter is incremented and at the end that counter is tested aganist the known amount of cookies.

### attack(String name)

- **Description of implementation**: This method sets the field gameOver to true and returns true if the ghost specified by the argument successfully attacks Pacman, and returns false otherwise. The ghost successfully attacks Pacman if Pacman is in attack range of the ghost.

- **Description of tests**: To test this, Pacman and a ghost are added to the game at various locations. Some placements involve the Pacman being in attack range of the ghost, and some involve Pacman not being in range of the ghost.

### move(String name, Location loc, Type type)

- **Description of implementation**: This method is responsible for moving components all over the board. It takes a name, location, and type. It will move the component with that name to the specified location and add that type to the field.

- **Description of tests**: To test this I simply added Pacman into the frame, moved it to a desired location then ensured that it no longer existed in the old location as well as existed in the new location.
