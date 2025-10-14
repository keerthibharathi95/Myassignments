package week3.day2.single.inheritance;

public class SeleniumTestData extends TestData {
	public static void enterUserName() {
		System.out.println("The username");
	}
	public static void enterPassword() {
		System.out.println("The password");
	}
	public static void main(String[] args) {
		SeleniumTestData obj=new SeleniumTestData();
		obj.navigateToHomePage();
		obj.enterPassword();
	}

}
