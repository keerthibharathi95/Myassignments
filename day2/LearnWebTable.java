package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
