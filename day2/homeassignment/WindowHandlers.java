package week4.day2.homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		// Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on the contact button
		driver.findElement(By.xpath("//div/a[text()='Contacts']")).click();
		// click on Merge contacts
		driver.findElement(By.xpath("//a[contains(text(), 'Merge')]")).click();
		// from contacts widget
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Thread.sleep(2000);
		// get the window handlers
		Set<String> getWindows = driver.getWindowHandles();
		List<String> getWindowsList = new ArrayList<String>(getWindows);
		for (int i = 0; i < getWindowsList.size(); i++) {
			System.out.println(getWindowsList.get(i));
		}

		driver.switchTo().window(getWindowsList.get(1));
		//check for find contacts title
		String Title = driver.getTitle();
		System.out.println(Title);
		// click the first contact
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td//a[text()='DemoContact1']")).click();
		driver.switchTo().window(getWindowsList.get(0));
		Thread.sleep(2000);
		// to contacts widget		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		System.out.println("To window opened");
		Thread.sleep(2000);
		// get the window handlers
		Set<String> getWindowsTo = driver.getWindowHandles();
		List<String> getWindowsListTo = new ArrayList<String>(getWindowsTo);
		for (int i = 0; i < getWindowsListTo.size(); i++) {
			System.out.println(getWindowsListTo.get(i));
		}

		driver.switchTo().window(getWindowsListTo.get(1));
		String Title_To = driver.getTitle();
		System.out.println(Title_To+"Tooo");
		// click the second contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		//shift driver focus to parent window
		driver.switchTo().window(getWindowsListTo.get(0));
		//Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//alert handling
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("Driver get Title");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
