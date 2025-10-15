package week3.day3;

import java.util.Arrays;

public class LearnArray {
	public static int[] number= {3,5,5,6,7,2};
	public static int length=number.length;
		//System.out.println("the last value"+(number[length-1].);
	public static void main(String[] args) {
		System.out.println("The last value: " + number[length - 1]);	
		System.out.println("The first Value"+number[0]);
		Arrays.sort(number);
		System.out.println("The last value: " + number[length - 1]);
		for(int i=0;i<=length-1;i++) {
			System.out.println(number[i]);
		}
	}
	

}
