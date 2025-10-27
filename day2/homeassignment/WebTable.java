package week4.day2.homeassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		// Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://finance.yahoo.com/markets/crypto/all/");
		String Cryptoname = "";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='yf-1onk3zf bd']//tbody/tr"));
		System.out.println(rows.size());
		for (int i = 1; i < rows.size(); i++) {
			System.out.println("Inside for"+i);
			WebElement Cryptonamedriver = driver.findElement(By.xpath("//table[@class='yf-1onk3zf bd']//tbody/tr[" + i + "]/td[2]"));
			Cryptoname = Cryptonamedriver.getText();
			System.out.println("It is One of the List of CryptoCurrencies in market" + Cryptoname);

		}

	}

}
