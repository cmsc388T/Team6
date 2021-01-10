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
		ArrayList<Location> newLoc = new ArrayList<Location>();
		
		//cartesian
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

		//diagonal
		if(!this.myMap.getLoc(this.myLoc.shift(1,1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(1,1));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(-1,-1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(-1,-1));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(-1,1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(-1,1));
		}
		if(!this.myMap.getLoc(this.myLoc.shift(1,-1)).contains(Map.Type.WALL)){
			newLoc.add(this.myLoc.shift(1,-1));
		}
		return newLoc;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
