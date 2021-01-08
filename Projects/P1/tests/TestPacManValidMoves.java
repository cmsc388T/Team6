import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		//Creating A Map 
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(2, 2)); //Creates PacMan at location x, y

		//Start The Game
		frame.startGame();


		ArrayList<Location> test = new ArrayList<Location>();
		test.add(new Location(9, 12));
		test.add(new Location(10, 11));
		test.add(new Location(10, 12));
		for (int counter = 0; counter < test.size(); counter++) { 
			System.out.println("1"); 		      
        	System.out.println(test.get(counter).hashCode()); 		
      	}   
		ArrayList<Location> test2 = pacman.get_valid_moves();
		for (int counter = 0; counter < test2.size(); counter++) { 
			System.out.println("2"); 		      
        	System.out.println(test2.get(counter).hashCode()); 		
      	}  
		assertEquals(test,pacman.get_valid_moves());	
		System.out.println(pacman.get_valid_moves());
		//return null;
	}
}
