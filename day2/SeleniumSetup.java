package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver(); 
		// driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.close();
		 
	}

}
