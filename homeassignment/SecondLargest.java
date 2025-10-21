package week3.day4.homeassignment;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array1[]=  {3, 2, 11, 4, 6, 7};
		int secondLargest=0;
		Arrays.sort(array1);
		List <Integer> intList=Arrays.asList(array1);
		for(int i=0;i<intList.size()-1;i++) {
			secondLargest=intList.get(i);
		}
		System.out.println("The second Largest number is  "+secondLargest);
	}

}
