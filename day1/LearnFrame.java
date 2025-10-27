package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leafground.com/frame.xhtml

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alert=driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		alert.accept();			
		driver.switchTo().defaultContent();
		

	}

}

