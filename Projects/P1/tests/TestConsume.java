import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	private static final int MAX_X = 25;
	private static final int MAX_Y = 24;
	private static final int MAX_COOKIES = 263;
	
	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		
		int consumedCookies = 0;
		for (int x = 0; x < MAX_X; x++) {
			for (int y = 0; y < MAX_Y; y++) {
				pacman.myLoc.x = x;
				pacman.myLoc.y = y;
				
				if (pacman.consume() != null)
					consumedCookies++;
			}
		}
		
		assertTrue(consumedCookies == MAX_COOKIES);
	}
}
