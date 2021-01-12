import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		
		PacMan pacman = frame.addPacMan(new Location (0, 0));
		Ghost ghost = frame.addGhost(new Location(2, 2), "clyde", Color.orange);
		assertFalse(pacman.is_ghost_in_range());
		
		// Vertical
		pacman.myLoc.x = 5;
		pacman.myLoc.y = 5;
		ghost.myLoc.x = 5;
		ghost.myLoc.y = 6;
		frame.getMap().move("pacman", pacman.myLoc, Map.Type.PACMAN);
		frame.getMap().move("clyde", ghost.myLoc, Map.Type.GHOST);
		assertTrue(pacman.is_ghost_in_range());
		
		// Horizontal
		pacman.myLoc.x = 5;
		pacman.myLoc.y = 5;
		ghost.myLoc.x = 6;
		ghost.myLoc.y = 5;
		frame.getMap().move("pacman", pacman.myLoc, Map.Type.PACMAN);
		frame.getMap().move("clyde", ghost.myLoc, Map.Type.GHOST);
		assertTrue(pacman.is_ghost_in_range());
		
		// Diagonal
		pacman.myLoc.x = 5;
		pacman.myLoc.y = 5;
		ghost.myLoc.x = 6;
		ghost.myLoc.y = 6;
		frame.getMap().move("pacman", pacman.myLoc, Map.Type.PACMAN);
		frame.getMap().move("clyde", ghost.myLoc, Map.Type.GHOST);
		assertTrue(pacman.is_ghost_in_range());
	}
}
