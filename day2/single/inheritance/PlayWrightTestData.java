package week3.day2.single.inheritance;

public class PlayWrightTestData extends TestData {
	public static void enterUserName() {
		System.out.println("The username");
	}
	public static void enterPassword() {
		System.out.println("The password");
	}
	public static void main(String[] args) {
		PlayWrightTestData obj =new PlayWrightTestData();
		obj.enterCredentials();
		obj.enterUserName();
	}
	
	
}
