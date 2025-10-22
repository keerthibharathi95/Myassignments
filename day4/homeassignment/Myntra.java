package week3.day4.homeassignment;

import java.time.Duration;
import java.util.List;

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
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags", Keys.ENTER);
		WebElement men_radio = driver.findElement(By.xpath("//ul[@class='gender-list']//li//input"));
		driver.executeScript("arguments[0].click()", men_radio);
		try {
			Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		WebElement Laptop_bag = driver
				.findElement(By.xpath("//ul[@class='categories-list']//input[@value='Laptop Bag']"));
		driver.executeScript("arguments[0].click()", Laptop_bag);
		List<WebElement> listItems = driver.findElements(By.xpath("//ul[@class='results-base']/li"));
		int numberOfLaptop = listItems.size();
		System.out.println("Number of Laptop   " + numberOfLaptop);
		// click on brand more
		driver.findElement(By.className("brand-more")).click();
		List<WebElement> brandList = driver.findElements(By.xpath("//ul[@class='FilterDirectory-list']//li"));
		System.out.println("The list of ");
		for (int i = 0; i < brandList.size(); i++) {
			// Get the text content of the label element, which is the brand name
			String brandName = brandList.get(i).getText();

			// The text often includes the count in parentheses, so we'll clean it up
			// Check if the text is not empty and print it
			if (!brandName.isEmpty()&& (brandName.length())>1) {
				// Only take the part of the text before the count (e.g., "Abelardo De Moda
				// (50)" -> "Abelardo De Moda")
				if (brandName.contains("(")) {
					brandName = brandName.substring(0, brandName.lastIndexOf('(')).trim();
				}
				System.out.println(brandName);
			}
		}
	}

}
