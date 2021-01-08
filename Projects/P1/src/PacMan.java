import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

import com.sun.jdi.Location;

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
		ArrayList<Location> moves = get_valid_moves();
		// Check for at least a single valid move
		if(moves != null && !moves.isEmpty()) {
			// Pick the first one, easily changeable
			myLoc = moves.get(0);
			return true;
		} else {
			// Pacman cannot move!
			return false;
		}
	}

	public boolean is_ghost_in_range() {
		return false;
	}

	public JComponent consume() {
 		return null;
	}
}
