/* ENSF 614 - Lab 5 Exercise A and B
 * File Name: Item.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

package src.Exercises_AB;

class Item<E extends Number & Comparable<E>> {
	private E item;

	public Item(E value) {
		item = value;
	}

	public void setItem(E value) {
		item = value;
	}

	public E getItem() {
		return item;
	}
}
