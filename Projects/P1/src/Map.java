import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location

		// find associated component
		if(name != null) {
			JComponent component = components.get(name);
			Location location = locations.get(name);
			if(component != null && location != null && loc != null && type != null) {
				// remove type and name from types and locations
				HashSet<Type> types = field.get(location);
				if(types != null) {

				}
				locations.remove(name);
				// move the component
				component.setLocation(loc.x, loc.y);
				// add type to new location
				locations.put(name, loc);
				types = field.get(loc);
				if(types != null) {
					types.add(type);
				}
				return true;
			}
		}
			// something is wrong
			return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		if (field.get(loc) == null) {
			return emptySet;
    } else {
			return field.get(loc);
		}
	}

	public boolean attack(String Name) {
		//update gameOver
		Location pacLoc = locations.get("pacman");
		Location ghostLoc = locations.get(Name);
		
		if (pacLoc != null && ghostLoc != null) {
			if (Math.abs(pacLoc.x - ghostLoc.x) <= 1
			&& Math.abs(pacLoc.y - ghostLoc.y) <= 1) {
				return gameOver = true;
			}
		}
		
		return false;
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		
		if (locations.containsKey(name) && components.containsKey(name)) {
			Location cookieLoc = locations.get(name);
			
			if (field.get(cookieLoc).contains(Type.COOKIE)) {
				JComponent cookie = components.get(name);
				
				locations.remove(cookieLoc);
				components.remove(cookie);
				field.get(cookieLoc).remove(Type.COOKIE);
				cookies++;
				
				return cookie;
			}
		}
		
		return new CookieComponent(-1, -1, 1);
	}
}
