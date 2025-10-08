package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");// if execute application in guest mode the notification is blocked
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
//			 driver.get("https://www.facebook.com/");
//			 driver.manage().window().maximize();
//			 driver.close();

		// locate driver and send values

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();// because it is button is the present
		//to get the title of the page
		String Title=driver.getTitle();
		System.out.println(Title);
		//to wait the page to avoid socket exception
		Thread.sleep(3000);
		
		//to close the browser	
		 driver.close();
	}

}
