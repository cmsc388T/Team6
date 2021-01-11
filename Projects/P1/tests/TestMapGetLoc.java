import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;


public class TestMapGetLoc extends TestCase{


	public void testMapGetLoc() throws FileNotFoundException{
		//Creating A Map 
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(9, 12), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(9, 11)); //Creates PacMan at location x, y

		HashSet<Map.Type> check = new HashSet<Map.Type>();
		check.add(Map.Type.PACMAN);

		HashSet<Map.Type> check2 = new HashSet<Map.Type>();
		check2.add(Map.Type.GHOST);

		HashSet<Map.Type> location = frame.getMap().getLoc(new Location(9, 11));

		HashSet<Map.Type> location2 = frame.getMap().getLoc(new Location(9, 12));

		assertEquals(check, location);	
		assertEquals(check2, location2);	
	}
}
