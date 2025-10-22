package week3.day4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class AmazonClassroom {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> priceElements = driver.findElements(By.className("a-price-whole"));
		List<String> priceTexts = priceElements.stream()
			    .map(WebElement::getText) // Gets the text from each WebElement
			    .collect(Collectors.toList());
		priceTexts.sort(null);
		priceTexts.sort(Comparator.naturalOrder());

		// 4. Print the sorted values
		for (String amountValue : priceTexts) {
		    System.out.println(amountValue);
		}
		
		
	}

}
