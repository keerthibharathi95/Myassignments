package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// modal alert

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.sendKeys("Bharathi");
		alert1.accept();
		
	}

}
