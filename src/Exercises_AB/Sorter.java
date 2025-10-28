/* ENSF 614 - Lab 5 Exercise A and B
 * File Name: Sorter.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield & William Watson
 * Submission Date: Oct 29, 2025
 */

// Interface class for my sorter classes

package src.Exercises_AB;

import java.util.ArrayList;

public interface Sorter<E extends Number & Comparable<E>> {

	void sort(ArrayList<Item<E>> array); // function definition to be overridden

}
