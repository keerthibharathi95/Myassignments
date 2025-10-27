package week4.day3.homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		// Men's fashion
		WebElement menFashion = driver.findElement(By.xpath("//span[contains(.,'Men')]"));
		Actions act = new Actions(driver);
		act.moveToElement(menFashion).perform();
		act.click(menFashion);
		// switch to frame
		// driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//span[contains(.,'Sports')]")).click();
		// count of sports shoes
		String sportsShoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']"))
				.getText();
		System.out.println("The Number of sports shoes are" + sportsShoeCount.replaceAll("[()]", ""));
		// click on training shoes
		driver.findElement(By.xpath("(//div[contains(.,'Training Shoes')])[7]")).click();
		// click on sort by
		driver.findElement(By.xpath("//span[contains(.,'Sort')]")).click();
		// select low to high
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		// add explict wait till the product got refreshed
		Thread.sleep(2000);
		// get the price of all products
		List<WebElement> actualPrices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		boolean isSortedCorrectly = true;
		System.out.println("Checking " + actualPrices.size() + " prices for Low-to-High sort...");

		for (int i = 0; i < actualPrices.size() - 1; i++) {

			String currentPrice = actualPrices.get(i).getText();
			String nextPrice = actualPrices.get(i + 1).getText();
			
			currentPrice = currentPrice.replaceAll("[Rrs. ,]", "");
			nextPrice = nextPrice.replaceAll("[Rrs. ,]", "");
			
			Double currentPricedouble = Double.parseDouble(currentPrice);
			Double nextPricedouble = Double.parseDouble(nextPrice);
			// If the current price is greater than the next price, the list is NOT sorted
			if (currentPricedouble > nextPricedouble) {
				isSortedCorrectly = false;
				System.out.println("Sorting not done");
				break;
			} 
			
		}
		if(isSortedCorrectly=true) {
			System.out.println("Sorted correctly");
		}
		Thread.sleep(2000);
//		//scroll to 
//		WebElement scrolltoPrice=driver.findElement(By.xpath("//div[@class='ui-slider-range ui-widget-header ui-corner-all']"));
//		//Actions act=new Actions(driver);
//		System.out.println(scrolltoPrice.getText());
//		act.scrollToElement(scrolltoPrice).perform();
	}

}
