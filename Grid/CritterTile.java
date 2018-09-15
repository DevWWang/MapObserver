package Grid;

/**
 * CritterTile indicates where the critter's position
 * 
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-03-23
 */

public class CritterTile extends PathTile{

	/**
	 * Place tower on the map
	 * 
	 * @param x		X-coordinate related to the one of Map
	 * @param y		Y-coordinate related to the one of Map
	 */
	public CritterTile(int x, int y) {
		super(x, y);
		super.setNextTile(super.getNextTile());
		super.setType("XXXXXXXX");
	}
	
	/**
	 * Print out the content of the TowerTile
	 */
	public String toString(){
		return super.getType();
	}
}