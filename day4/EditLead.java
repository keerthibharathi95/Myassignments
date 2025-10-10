package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
		//Click CreateLead button
		driver.findElement(By.linkText("Create Lead")).click();
		//xpath  //input[@id='createLeadForm_firstName']
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jayabharathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Balasubramanian");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
	  
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerti@gmail.com");
		WebElement dd=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select obj=new Select(dd);
		obj.selectByVisibleText("United States");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Very good");
		driver.findElement(By.name("submitButton")).click();
		String Title=driver.getTitle();
		System.out.println("Title"+Title);
		
		}

}
