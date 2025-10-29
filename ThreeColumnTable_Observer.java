/* ENSF 614 - Lab 5 Exercise C
 * File Name: ThreeColumnTable_Observer.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */


import java.util.ArrayList;

public class ThreeColumnTable_Observer implements Observer {

    private ArrayList<Double> data;
    private Subject subject;
    
    public ThreeColumnTable_Observer(Subject subject) {
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
		
		System.out.println("Notification to Three-Column Table Observer: Data Changed:");
		
		int length = data.size();
		
		for(int i = 0; i < length; i += 3) {
			System.out.print(data.get(i) + ", ");
			
			if(i+1 < length) {
				System.out.print(data.get(i+1) + ", ");
			}
			
			if (i+2 < length) {
				System.out.print(data.get(i+2));
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
