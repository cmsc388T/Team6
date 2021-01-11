import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		// Vertical
		for (int x = myLoc.x, y = myLoc.y - 1; y <= myLoc.y + 1; y++) {
			HashSet<Map.Type> loc = myMap.getLoc(new Location(x, y));
			if (loc != null && loc.contains(Map.Type.GHOST)) {
				return true;
			}
		}
		
		// Horizontal
		for (int y = myLoc.y, x = myLoc.x - 1; x <= myLoc.x + 1; x++) {
			HashSet<Map.Type> loc = myMap.getLoc(new Location(x, y));
			if (loc != null && loc.contains(Map.Type.GHOST)) {
				return true;
			}
		}
		
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
