package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// login
		driver.findElement(By.className("decorativeSubmit")).click();
		// CRM SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click Lead Button
		driver.findElement(By.linkText("Leads")).click();
		//Click CreateLead button
		driver.findElement(By.linkText("Create Lead")).click();
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayabharathi1");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasubramanian1");
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LTI1");
		//Title
//		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer1");
		//Create Lead Button Click
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		

	}

}
