package week3.day4.homeassignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array1[] = { 1, 2, 3, 4, 10, 6, 8 };
		Arrays.sort(array1);

		for (int i = 0; i < array1.length-1; i++) {
			
				if ((array1[i] + 1) != array1[i + 1]) {
					
				System.out.println("The missing number in arrays are  "+(array1[i]+1));

				}
			

		}

	}

}
