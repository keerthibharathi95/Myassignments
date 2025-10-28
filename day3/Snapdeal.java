package week4.day3.homeassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Training Shoes')]")))
				.click();

		
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
		if (isSortedCorrectly == true) {
			System.out.println("Sorted correctly");
		}
		Thread.sleep(2000);
		// price range from 500 to 700
		// shoe filter - by cost with from cost
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500");

		// shoe filter - by cost with to cost
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("700");
		// click on go button
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		// color filter
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']")).click();

		//
		// applying filter it
		System.out.println("The selected filters are:");
		String filter1=driver.findElement(By.xpath("((//div[@class='filters'])[1]/div)")).getText();
		System.out.println(filter1);
		Thread.sleep(2000);
		String filter2=driver.findElement(By.xpath("((//div[@class='filters'])[1]/div)[2]")).getText();
		System.out.println(filter2);
		

		/* mover hover on first resulting training shoes
		Thread.sleep(5000);
		WebElement moveHover = driver.findElement(By.xpath("//a//img[@class='product-image wooble']"));
		act.moveToElement(moveHover).perform();*/
		
		//price and discount
		String price=driver.findElement(By.xpath("//div[@class='lfloat marR10']/span[2]")).getText();
		System.out.println("The price of the shoe: "+price);
		String discount=driver.findElement(By.xpath("//div[@class='product-discount']/span")).getText();
		System.out.println("The Discount for the shoe is: "+discount);
		//snapshot
		WebElement snap=driver.findElement(By.xpath("//div[@class='product-row js-product-list centerCardAfterLoadWidgets dp-click-widgets']"));
		File srcFile = snap.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./data/myFirstShoe.png");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("My first shoe snap");
		
		driver.close();
		driver.quit();

}}
