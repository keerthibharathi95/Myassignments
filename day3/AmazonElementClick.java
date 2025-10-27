package week4.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class AmazonElementClick {
	public static void main(String[] args) throws IOException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Conditions of Use & Sale
		WebElement condition=driver.findElement((By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright']//a[contains(text(), 'Conditions')]")));
		Actions act=new Actions(driver);
		act.scrollToElement(condition).perform();
		System.out.println(condition.getText());
		//copying files
		WebElement webpage=driver.findElement(By.tagName("body"));
		File elementSrc = webpage.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementSrc, new File("C:\\Screenshots\\element_only.png"));
	
	}
	

}
