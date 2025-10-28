package week4.day3.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import week3.day2.home.assignment_inheritance.WebElement;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		//click on shop by category
		
		driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]")).click();
		Thread.sleep(2000);
		
		//a[contains(.,'Foodgrains')]
	    org.openqa.selenium.WebElement food = driver.findElement(By.xpath("//a[contains(.,'Foodgrains')]"));
		Actions act= new Actions(driver);
		act.moveToElement(food).perform();
	}

}
