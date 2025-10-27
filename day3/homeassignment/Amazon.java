package week4.day3.homeassignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);;
		//price of first phone
		String firstPhonePrice=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-row a-size-base a-color-base']//a//span")).getText();
		System.out.println("The price of first phone is "+firstPhonePrice);
		//rating of first phone
		
		WebElement firstRating=driver.findElement(By.xpath("//div[@class='a-row a-size-small']//span//i"));
		Actions act=new Actions(driver);
		act.moveToElement(firstRating).perform();
		act.click().perform();
		
		//first link text click
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
		//change driver focus to child window 
		Set<String> window= driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(window);
		driver.switchTo().window(windowList.get(1));
		//snapshot
		WebElement childKey = driver.findElement(By.xpath("(//span[@class='a-declarative']//img)[2]"));
		File source= childKey.getScreenshotAs(OutputType.FILE);
		File target = new File("./data/Sample3.png");
		FileUtils.copyFile(source, target);
		
		
	}

}
