package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnRelativeXpath {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//input[@name='username']
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
		usernameField.sendKeys("DemoSalesManager");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		
	}

}
