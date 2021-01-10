import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		//Creating A Map 
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(2, 2)); //Creates PacMan at location x, y

		//Start The Game
		frame.startGame();


		ArrayList<Location> test = new ArrayList<Location>();
		test.add(new Location(10, 11));
		test.add(new Location(9, 12));
		test.add(new Location(10, 12));

		ArrayList<Location> validMoves = ghost.get_valid_moves();

		assertTrue(validMoves.size() == 3);  
		
		assertTrue(test.get(0).equals(validMoves.get(0)));	
		assertTrue(test.get(1).equals(validMoves.get(1)));	
		assertTrue(test.get(2).equals(validMoves.get(2)));
	}
}
