package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		//ext-gen240__ext-gen254
		WebElement elementToRemove =driver.findElement(By.cssSelector("table.x-grid3-row-table tr:first-child"));
		//Cast the WebDriver instance to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3. Execute the JavaScript to remove the element
		// The arguments[0] refers to the 'elementToRemove' object passed as the second argument.
		js.executeScript("arguments[0].remove();", elementToRemove);
	}
	
}
