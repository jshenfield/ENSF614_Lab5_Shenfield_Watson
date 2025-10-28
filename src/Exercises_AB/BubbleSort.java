/* ENSF 614 - Lab 5 Exercise A and B
 * File Name: BubbleSort.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

package src.Exercises_AB;

import java.util.ArrayList;

public class BubbleSort<E extends Number & Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(ArrayList<Item<E>> array) {
		int n = array.size();
		boolean swapped; // check if swap occurred

		for (int i = 0; i < n - 1; i++) { // for each value
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) { // search up until the value
				E a = array.get(j).getItem();
				E b = array.get(j + 1).getItem();

				if (a.compareTo(b) > 0) { // swap if needed
					Item<E> temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
					swapped = true;
				}
			}

			// if no swaps needed, break
			if (!swapped)

				break;
		}
	}
}
