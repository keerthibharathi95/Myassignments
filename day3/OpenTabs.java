package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRM SFA
		driver.findElement(By.linkText("CRM/SFA")).click();	
		//Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//createAccount button
		driver.findElement(By.linkText("Create Account")).click();
		//autofill account details
		//account name
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester1");
		//Number of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("12");
		//site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Create account button
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
