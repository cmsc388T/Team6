import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();

		// initialize pacman
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		
		// move to new location
		map.move("pacman", new Location(5, 5), Map.Type.PACMAN);

		// check old and new spots for updates
		assertTrue(map.getLoc(new Location(5, 5)).contains(Map.Type.PACMAN));
		assertFalse(map.getLoc(new Location(1, 1)).contains(Map.Type.PACMAN));
	}
}
