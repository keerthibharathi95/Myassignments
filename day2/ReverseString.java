package week2.day2;

public class ReverseString {
	public static void main(String[] args) {
		String name="Bharathi";
		char[] nameArr=name.toCharArray();
		for(int i=nameArr.length-1;i>=0;i--) {
			System.out.println(nameArr[i]);
		}
	}

}
