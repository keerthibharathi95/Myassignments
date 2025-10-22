package week3.day4.homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListIntersect {
	public static void main(String[] args) {
		Integer Array1[] = { 3, 2, 11, 4, 6, 7 };
		Integer Array2[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> myList1 = Arrays.asList(Array1);
		List<Integer> myList2 = Arrays.asList(Array2);
		Collections.sort(myList1);
		Collections.sort(myList2);
		for (int i = 0; i < myList1.size(); i++) {
			if (myList1.contains(myList2.get(i))) {
				System.out.println(myList2.get(i));
			}
		}

	}

}
