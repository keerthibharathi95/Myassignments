package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBooImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("Guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Jayabharathi");
		driver.findElement(By.name("lastname")).sendKeys("Balasubramanian");
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select obj_date=new Select(date);
		obj_date.selectByIndex(4);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select obj_month=new Select(month);
		obj_month.selectByIndex(4);
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select obj_year=new Select(year);
		obj_year.selectByIndex(4);
		////input[@type='text' and @name='username']
		driver.findElement(By.xpath("//input[@type='radio' and @id='sex' and @name='sex' and @value='1']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("Jayabharathi@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Balasubramanian");
		driver.findElement(By.name("websubmit")).click();

	}

}
