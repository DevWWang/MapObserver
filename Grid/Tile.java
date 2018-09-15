package Grid;

/**
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-02-28
 */

public abstract class Tile {

	private int x, y;
	private String type;

	/**
	 * Create new Tile with given coordinates
	 * 
	 * @param x		X-coordinate of the tile
	 * @param y		Y-coordinate of the tile
	 */
	public Tile(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Assign the x position
	 * 
	 * @param x		X-coordinate
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * Assign the y position
	 * 
	 * @param y		Y-coordinate
	 */
	public void setY(int y){
		this.y = y;
	}

	public void setType(String type){
		this.type = type;
	}
	
	/**
	 * 
	 * @return x position
	 */
	public int getX(){
		return x;
	}

	/**
	 * 
	 * @return y position
	 */
	public int getY(){
		return y;
	}

	/**
	 * 
	 * @return whether the tile is a path cell or scenery cell
	 */
	public String getType(){
		return type;
	}

	public abstract String toString();
}
