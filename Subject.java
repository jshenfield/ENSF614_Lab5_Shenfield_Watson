/* ENSF 614 - Lab 5 Exercise C
 * File Name: Subject.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyAllObservers();
}
