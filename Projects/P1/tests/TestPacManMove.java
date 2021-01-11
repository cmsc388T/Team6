import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();

		PacMan pacman = frame.addPacMan(new Location(1,1));

		// ensure proper move responses
		ArrayList<Location> oldMoves = pacman.get_valid_moves();
		if(oldMoves != null) {
			if(pacman.move()) {
				// moved, should have different moves now
				assertFalse(pacman.get_valid_moves().equals(oldMoves));
			} else {
				// didnt move, same moves as last turn
				assertTrue(pacman.get_valid_moves().equals(oldMoves));
			}
		} else {
			// fails because get_valid_moves is not implemented
			assertTrue(false);
		}
	}
}
