package week3.day3.home.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1, 4,3,2,8, 6, 7};
		Arrays.sort(numbers);
		
		for(int i=0;i<numbers.length;i++) {
			 i=i+1;
			
			if(i+1 != numbers[i]) {
				System.out.println("The missed value is  "+ i);
				break;
			}
		}

	}

}
