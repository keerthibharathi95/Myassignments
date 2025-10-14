package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select Favorite Browser
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']//td[1]")).click();
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Select City
		WebElement city=driver.findElement(By.xpath("//label[text()='Chennai']"));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));		
		city.click();
		System.out.println("Element SEelcted");
		//reselect_c"Eheck
		city.click();
		System.out.println("Element UnSEelcted");
		//Selected Button
		WebElement selected_button=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']/parent::div/following-sibling::label)[5]"));
		String selected_button1 = selected_button.getText();
		System.out.println("The Selected button is "+selected_button1);
	
		WebElement is_Selected = driver.findElement(By.xpath("//input[@value='1-20 Years']"));
		Boolean Selected=is_Selected.isSelected();
		if(!Selected) {
			System.out.println("Inside false ");
			driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']/ancestor::div/label)[4]")).click();
			
		}
		
	}

}
