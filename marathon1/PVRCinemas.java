package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Intializing drive and launching site
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select show
		driver.findElement(By.xpath("//div[@class='date-show']/span[text()='Cinema']")).click();
		//for cinema dropdown
		//driver.findElement(By.("p-dropdown p-component p-inputwrapper p-inputwrapper-focus")).click();
		driver.findElement(By.xpath("//div[@class='quick-left']")).click();
		//p-dropdown-items-wrapper
		//div[@class='p-dropdown-items-wrapper']//span[contains(text(),'DUDE')]
		//Select dude movie
		//driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//span[contains(text(),'DUDE')]")).click();
		//p-dropdown-items-wrapper Virugambakkam 
		//select theatre
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//span[contains(text(),'Virugambakkam')]")).click();
		//select date
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(2000);
		//select movie
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//span")).click();
		Thread.sleep(2000);
		//select timing
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//span")).click();
		Thread.sleep(2000);
		//click book
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']//span[contains(text(),'Book')]")).click();
		//accept button terms and conditions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-dFVmKS YKWSW reject-terms']")).click();
		//seat selection
		driver.findElement(By.id("SL.SILVER|D:13")).click();
		//button click proceed
		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		//getting seat info
		WebElement seat_number=driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		System.out.println("seat_number"+seat_number.getText());
		//print total price
		//(//div[@class='ticket-value-ticket'])[3]
		WebElement total_price=driver.findElement(By.xpath("(//div[@class='ticket-value-ticket'])[3]"));
		System.out.println(total_price.getText());
		//click on continue button////button[@class='fb-added-btn']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//click on cross button
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//check for the title
		System.out.println(driver.getTitle());
	}

}
