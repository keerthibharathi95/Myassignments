package week3.day4.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
		WebElement men_radio=driver.findElement(By.xpath("(//input[@value=\"men,men women\"])[1]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		men_radio.click();
	}

}
