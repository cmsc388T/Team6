import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		
		// Not in range
		PacMan pacman = frame.addPacMan(new Location(0, 0));
		Ghost ghost = frame.addGhost(new Location(5, 5), "clyde", Color.orange);
		assertFalse(ghost.is_pacman_in_range());
		
		// Vertical
		pacman.myLoc.x = 6;
		pacman.myLoc.y = 6;
		ghost.myLoc.x = 6;
		ghost.myLoc.y = 5;
		assertTrue(ghost.is_pacman_in_range());
		
		// Horizontal
		pacman.myLoc.x = 6;
		pacman.myLoc.y = 6;
		ghost.myLoc.x = 5;
		ghost.myLoc.y = 6;
		assertTrue(ghost.is_pacman_in_range());
		
		// Diagonal
		pacman.myLoc.x = 6;
		pacman.myLoc.y = 6;
		ghost.myLoc.x = 5;
		ghost.myLoc.y = 5;
		assertTrue(ghost.is_pacman_in_range());
	}
}

