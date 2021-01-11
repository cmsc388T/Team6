import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();

		Ghost ghost = frame.addGhost(new Location(1, 1), "1", Color.RED);

		ArrayList<Location> oldMoves = ghost.get_valid_moves();
		if(oldMoves != null) {
			if(ghost.move()) {
				// successful move, should have new moves
				assertFalse(oldMoves.equals(ghost.get_valid_moves()));
			} else {
				// failed to move, same moves
				assertTrue(oldMoves.equals(ghost.get_valid_moves()));
			}
		} else {
			// fails because get_valid_moves is not implemented
			assertFalse(true);
		}
	}
}
