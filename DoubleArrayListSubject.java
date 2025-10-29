/* ENSF 614 - Lab 5 Exercise C
 * File Name: DoubleArrayListSubject.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

import java.util.ArrayList;


public class DoubleArrayListSubject implements Subject {

	
	private ArrayList<Double> data;
	private ArrayList<Observer> observers;

	
	
	DoubleArrayListSubject() {
        data = new ArrayList<>();
        observers = new ArrayList<>();
	}
	
	
	@Override
	public void registerObserver(Observer o) {
	    if (o == null || observers.contains(o)) {
	    	return;
	    }
        observers.add(o);
        o.update(data);
	}

	@Override
	public void removeObserver(Observer o) {
        observers.remove(o);		
	}

	@Override
	public void notifyAllObservers() {
		for( Observer o : observers) {
			o.update(new ArrayList<>(data));
		}
	}
	
	public void addData(double val) {
		data.add(val);
		notifyAllObservers();
	}
	
	public void setData(double val, int index) {
		data.set(index, val);
		notifyAllObservers();
	}
	
	public void populate(double[] vals) {
		data.clear();
		for(double v : vals) {
			data.add(v);
		}
		notifyAllObservers();
	}
	
	public void remove(Observer o) {
		observers.remove(o);
	}


	public void display() {
	    System.out.println("Current data: " + data);		
	}

}
