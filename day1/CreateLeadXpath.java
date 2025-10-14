package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadXpath {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		// filling accountname from grandparent grandchild relation
		driver.findElement(By.xpath("//form[@id='createAccountForm']//input[@id='accountName']"))
				.sendKeys("System Automation Tester");
		// filling localname with sibling relation
		driver.findElement(By.xpath("//span[text()='Local Name']/parent::td/following-sibling::td/input"))
				.sendKeys("Bharathi");
		
		// Create Lead Button Click
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
