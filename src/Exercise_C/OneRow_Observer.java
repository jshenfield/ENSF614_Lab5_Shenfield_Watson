/* ENSF 614 - Lab 5 Exercise C
 * File Name: OneRow_Observer.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */


import java.util.ArrayList;

public class OneRow_Observer implements Observer {

    private ArrayList<Double> data;
    private Subject subject;
    
    public OneRow_Observer(Subject subject) {
    	this.subject = subject;
    	this.data = new ArrayList<>();
    	subject.registerObserver(this);
    }

	@Override
	public void update(ArrayList<Double> data) {
		// TODO Auto-generated method stub
		this.data = new ArrayList<>(data);
		display();
	}

	private void display() {
		
		System.out.println("Notification to One-Row Table Observer: Data Changed:");
		
		int length = data.size();
		
		for(int i = 0; i < length; i++) {
			System.out.print(data.get(i) + ", ");
		}
		System.out.println();
		System.out.println();
	}
}
