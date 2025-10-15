package week3.day3;

public class CheckPalindrome {
	public static void checkForPalindrome(String string) {
		String givenText = string;

		string.trim();
		string = string.replaceAll("\\s", "");
		string = string.replaceAll("[^a-zA-Z]", "");
		string = string.toLowerCase();
		String string_Reverse = new StringBuilder(string).reverse().toString();
		
		if (string.equals(string_Reverse)) {
			System.out.println(givenText +" is Palindrome");
		}else {
			System.out.println(givenText +" is not a Palindrome");
		}
	
	}

	public static void main(String[] args) {
		checkForPalindrome("A man, a plan, a canal: Panama");
		checkForPalindrome("race a car");
		checkForPalindrome("");
	}
}
