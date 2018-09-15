package Grid;

/**
 * TowerTiles are the components of the tower
 * 
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-03-23
 */

public class TowerTile extends Tile{

	/**
	 * Place tower on the map
	 * 
	 * @param x		X-coordinate related to the one of Map
	 * @param y		Y-coordinate related to the one of Map
	 */
	public TowerTile(int x, int y) {
		super(x, y);
		
		super.setType("Tower!!!");
	}
	
	/**
	 * Print out the content of the TowerTile
	 */
	public String toString(){
		return super.getType();
	}
}
