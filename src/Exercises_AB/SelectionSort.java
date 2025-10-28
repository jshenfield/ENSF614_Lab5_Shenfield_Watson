package src.Exercises_AB;

import java.util.ArrayList;

public class SelectionSort<E extends Number & Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(ArrayList<Item<E>> array) {
		int n = array.size();

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			// find smallest array element index
			for (int j = i + 1; j < n; j++) {
				E current = array.get(j).getItem();
				E smallest = array.get(minIndex).getItem();

				if (current.compareTo(smallest) < 0) {
					minIndex = j;
				}
			}

			// swap if a lesser element is found
			if (minIndex != i) {
				Item<E> temp = array.get(i);
				array.set(i, array.get(minIndex));
				array.set(minIndex, temp);
			}
		}
	}
}