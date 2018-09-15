package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author		Wei Wang
 * @version		1.0
 * @since		2015-03-23
 */

public abstract class Subject {
	
	private List<IObserver> observers;

	public Subject() {
		observers = new ArrayList<IObserver>();
	}
	
	public void addObserver (IObserver o) {
		observers.add(o);
	}
	
	public void removeObserver (IObserver o) {
		observers.remove(o);
	}
	
	protected void notifyObservers() {
		for (IObserver o : observers) {
			o.update();
		}
	}
}
