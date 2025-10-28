/* ENSF 614 - Lab 5 Exercise A and B
 * File Name: InsertionSort.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

package src.Exercises_AB;

import java.util.ArrayList;

public class InsertionSort<E extends Number & Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(ArrayList<Item<E>> array) {
		int n = array.size();

		for (int i = 1; i < n; i++) {
			Item<E> keyItem = array.get(i); // current value
			E keyValue = keyItem.getItem();

			int j = i - 1;

			// search for place to insert keyValue
			while (j >= 0 && array.get(j).getItem().compareTo(keyValue) > 0) {
				array.set(j + 1, array.get(j));
				j--;
			}

			array.set(j + 1, keyItem);
		}
	}
}
