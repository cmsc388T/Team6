import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase {
	
	private static final int MAX_X = 25;
	private static final int MAX_Y = 24;
	private static final int MAX_COOKIES = 263;
	
	public void testMapEatCookie() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		Map map = frame.getMap();
		
		int consumedCookies = 0;
		for (int x = 0; x < MAX_X; x++) {
			for (int y = 0; y < MAX_Y; y++) {
				if (map.eatCookie("tok_x" + x + "_y" + y) != null)
					consumedCookies++;
			}
		}
		
		assertTrue(consumedCookies == MAX_COOKIES);
	}
}
