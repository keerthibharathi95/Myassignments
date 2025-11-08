package hookimplementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClass{
	@Before
	public void preCondition() {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("guest");
	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	//Create Lead
	
	//Edit Lead
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	
		
	}
	@After
	public void postConditon() {
		driver.quit();
		
	}
	

}
