package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.messages.types.Duration;

public class DeleteLeadWithId {

	public static void main(String[] args) throws InterruptedException {
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
		// Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// Click on phone
		driver.findElement(By.linkText("Phone")).click();
		
		WebElement leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String Lead_verify = leadID.getText();
		// Click on the First lead Id
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		// Delete the record
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		// Click on FindLeads
		WebElement findLeads = driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']"));

		findLeads.click();
		// Click on Name and ID
		driver.findElement(By.xpath("//input[@id='ext-gen246']"));
		// Click on Lead ID box
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).click();
		// Check for LeadID
		driver.findElement(By.id("ext-gen246")).sendKeys(Lead_verify);
		// Click on FindLead
		driver.findElement(By.xpath("//table//tbody//tr//td//table[@id='ext-gen242']")).click();

	}

}
