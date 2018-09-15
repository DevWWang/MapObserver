package Driver;

import Map.*;
import View.*;

/**
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-03-23
 */

public class Driver {

	public static void main(String[] args) {
		
		//IObserver Test
		Map map = new Map();
		MapDisplay mapDisplay = new MapDisplay(map);
		map.addObserver(mapDisplay);
		
		//Map Size: width, height
		map.setMapSize(6,6);
		map.initializeMap();
		map.buildPath(map.multipleCoordinatesSplit("(0,3) (5,3)"));
		
		map.placeTower(0,0);
		
		//Critter starts to travel from the entry to exit
		map.startCritter(map.getEntry());
		
	}
}
