import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
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

		ArrayList<Location> newLoc = new ArrayList<Location>();

		// cartesian
		if (!this.myMap.getLoc(this.myLoc.shift(1, 0)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(1, 0));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(-1, 0)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(-1, 0));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(0, 1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(0, 1));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(0, -1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(0, -1));
		}

		// diagonal
		if (!this.myMap.getLoc(this.myLoc.shift(1, 1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(1, 1));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(-1, -1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(-1, -1));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(-1, 1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(-1, 1));
		}
		if (!this.myMap.getLoc(this.myLoc.shift(1, -1)).contains(Map.Type.WALL)) {
			newLoc.add(this.myLoc.shift(1, -1));
		}

		return newLoc;
	}

	public boolean move() {
		ArrayList<Location> moves = get_valid_moves();
		// Check for at least a single valid move
		if (moves != null && !moves.isEmpty()) {
			// Pick random for fun
			myLoc = moves.get((int) (Math.random() * moves.size()));
			myMap.move(myName, myLoc, Map.Type.PACMAN);
			return true;
		} else {
			// Pacman cannot move!
			return false;
		}
	}

	public boolean is_ghost_in_range() {
		for (int x = myLoc.x - 1; x <= myLoc.x + 1; x++) {
			for (int y = myLoc.y - 1; y <= myLoc.y + 1; y++) {
				HashSet<Map.Type> loc = myMap.getLoc(new Location(x, y));
				if (loc != null && loc.contains(Map.Type.GHOST)) {
					return true;
				}
			}
		}

		return false;
	}

	public JComponent consume() {
		return myMap.eatCookie("tok_x" + myLoc.x + "_y" + myLoc.y);
	}
}
