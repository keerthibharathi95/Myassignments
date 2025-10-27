package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Search for Bags for boys
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys"+Keys.ENTER);
		//a-size-medium-plus a-spacing-none a-color-base a-text-bold
		//choose the items in the result
		WebElement result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span"));
		System.out.println(result.getText());
		//Choose first two brands
		
		// **Change findElements() to findElement()**
		System.out.println("Brand name");

		List<WebElement> results = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul[@id='filter-p_123']//a//span[@class='a-size-base a-color-base']")); 
		System.out.println("result located"+results.size());
		// Now 'results' is a list, and you can loop through it to process each element.
		if (!results.isEmpty()) {
			System.out.println("Result is not found");
		    System.out.println("Found " + results.size() + " elements.");
		    // Example: get the first element from the list if needed
		   
		    	 String firstElement = results.get(0).getText();
				 String secondElement = results.get(1).getText();
		    
		   
		    System.out.println("The brands are   "+firstElement+"    "+secondElement);
		}

		//sort by new arrivals
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//div[@class='a-popover-wrapper']//li)[5]")).click();
		
		//bag info
		String bagName=driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']//span")).getText();
		System.out.println("The first bag name is  "+bagName);
		//a-size-base-plus a-spacing-none a-color-base a-text-normal
		String bagInfo=driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']//span")).getText();
		System.out.println("The bag has  "+bagInfo);
		//page title
		System.out.println("The title of the webpage is   "+driver.getTitle());
		driver.close();
	}

}
