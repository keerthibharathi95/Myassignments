package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester07");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		System.out.println("Web Element Selected");
		Select industry_obj = new Select(industry);
		System.out.println("Industry object");
		industry_obj.selectByVisibleText("Computer Software");

		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select owner_obj = new Select(owner);
		owner_obj.selectByVisibleText("S-Corporation");

		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select source_obj = new Select(source);
		source_obj.selectByValue("LEAD_EMPLOYEE");

		WebElement market_campaign = driver.findElement(By.id("marketingCampaignId"));
		Select mc_obj = new Select(market_campaign);
		mc_obj.selectByIndex(6);

		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state_obj = new Select(state);
		state_obj.selectByValue("TX");
		System.out.println(driver.findElement(By.id("accountName")).getText());
		driver.findElement(By.className("smallSubmit")).click();
		
		
		driver.close();

	}

}
