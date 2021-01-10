import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
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

	public boolean is_pacman_in_range() { 
		for (int x = myLoc.x - 1; x <= myLoc.x + 1; x++) {
			for (int y = myLoc.y - 1; y <= myLoc.y + 1; y++) {
				if (myMap.getLoc(new Location(x, y)).contains(Map.Type.PACMAN)) {
					return true;
				}
			}
		}
		
		return false;
	}

	public boolean attack() {
		return false;
	}
}
