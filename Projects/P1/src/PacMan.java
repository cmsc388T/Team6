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

		ArrayList<Location> newLoc = new ArrayList<Location>();
		
		if(!this.myMap.getLoc(this.myLoc.shift(1,0)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(1,0));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(-1,0)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(-1,0));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(0,1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(0,1));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(0,-1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(0,-1));
		}
		return newLoc;	

	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
