import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		Ghost ghost1 = frame.addGhost(new Location(1, 2), "1", Color.RED);
		Ghost ghost2 = frame.addGhost(new Location(1, 10), "2", Color.GREEN);
		
		assertTrue(ghost1.attack());
		assertFalse(ghost2.attack());
		
		pacman.myLoc.x = 10;
		pacman.myLoc.y = 10;
		
		assertFalse(ghost1.attack());
		assertFalse(ghost2.attack());
		
		pacman.myLoc.x = 1;
		pacman.myLoc.y = 1;
		ghost2.myLoc.x = 2;
		ghost2.myLoc.y = 1;
		
		assertTrue(ghost1.attack());
		assertTrue(ghost2.attack());
	}
}
