package week3.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>(); 
		myList.add(14);
		List<Integer> yourList=new ArrayList<>();
		yourList.add(15);
		yourList.add(16);
		yourList.add(17);
		yourList.add(18);
		myList.addAll(yourList);
		System.out.println(myList);
	//	myList.removeAll(myList);
		myList.clear();
		System.out.println(myList);
		

	}

}
