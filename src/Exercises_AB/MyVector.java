/* ENSF 614 - Lab 5 Exercise A and B
 * File Name: MyVector.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

package src.Exercises_AB;

import java.util.ArrayList;

public class MyVector<E extends Number & Comparable<E>> {

	private ArrayList<Item<E>> storageM;
	private Sorter<E> sorter;

	// list length constructor
	public MyVector(int x) {
		storageM = new ArrayList<>(x);

	}

	// copy constructor
	public MyVector(ArrayList<E> arr) {
		storageM = new ArrayList<>(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			E element = arr.get(i); // get the value
			storageM.add(new Item<>(element)); // wrap as an Item
		}
	}

	public void add(Item<E> value) {
		storageM.add(value);
	}

	public void setSortStrategy(Sorter<E> s) {
		sorter = s;

	}

	public void performSort() {
		sorter.sort(storageM);

	}

	public void display() {
		System.out.print("[ ");

		for (int i = 0; i < storageM.size(); i++) {
			System.out.print(storageM.get(i).getItem() + " "); // assuming Item<E> has getValue()
		}

		System.out.println("]");

	}
}
