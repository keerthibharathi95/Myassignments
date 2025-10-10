package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateDropdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the system property to point to the new driver download mirror
		// System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL",
		// "https://msedgedriver.microsoft.com");

		// Now, initialize your EdgeDriver as usual
		WebDriver driver = new EdgeDriver();
		// ... rest of your code
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
		// Click CreateLead button
		driver.findElement(By.linkText("Create Lead")).click();
		// first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayabharathi_");
		// last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balasubramanian_");
		// company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LTI_");
		// source
		// Location the web element and store it in a local variable
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt = new Select(source);
		// opt.selectByVisibleText("Employee");
		opt.selectByIndex(4);
		
		
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt_market = new Select(market);
		opt_market.selectByVisibleText("Automobile");
		
		
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		System.out.println("Entered Owner");
		Select opt_owner = new Select(owner);
		opt_owner.selectByVisibleText("S-Corporation");
		
		
		// Create Lead Button Click
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
