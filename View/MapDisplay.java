package View;

import Map.*;
import Observer.IObserver;

/**
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-03-23
 */

public class MapDisplay implements IObserver{
	
	private Map observedMap;
	
	/**
	 * Presentation of Map
	 * 
	 * @param observedMap
	 */
	public MapDisplay(Map observedMap){
		super();
		this.observedMap = observedMap;
	}

	/**
	 * Update the map
	 */
	@Override
	public void update(){
		String newMap = observedMap.getMap();
		System.out.println(newMap);
	}

}
