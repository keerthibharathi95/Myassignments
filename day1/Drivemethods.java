package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivemethods {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		// Click and Confirm title
		driver.findElement(By.xpath("//h5//following-sibling::button[@id='j_idt88:j_idt90']")).click();
		// verify the title of the page is dashboard
		if (driver.getTitle().equals("Dashboard")) {
			System.out.println("The title of the page is Dashboard");
		} else {
			System.out.println("The title of the page is" + driver.getTitle());
		}
		// navigate back
		driver.navigate().back();
		// Button is disabled or not
		WebElement button_disable = driver.findElement(By.xpath(
				"//h5//following-sibling::button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		Boolean disable_Result = button_disable.isEnabled();
		
		System.out.println("The Button is enabled  " + disable_Result); 
		
		//Find and print the position of the button with the text ‘Submit.’ 
		WebElement submit_Location=driver.findElement(By.xpath("//button[contains(., 'Submit')]"));
		Point location=submit_Location.getLocation();
		
		System.out.println("The position of the Submit button. "+location.toString());
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement save_Button=driver.findElement(By.xpath("//button//span[text()='Save']"));
		String buttonBackgroundColor = save_Button.getCssValue("background-color");
		
		System.out.println("buttonBackgroundColor  "+buttonBackgroundColor);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement height_Width=driver.findElement(By.xpath("//h5[contains(text(),'Find the height and width of this button')]/following-sibling::button"));
		String height=height_Width.getCssValue("Height");
		System.out.println("Height  "+height);
		String Width=height_Width.getCssValue("Width");
		System.out.println("Width  "+Width);
		//close the window
		driver.close();
	}

}
