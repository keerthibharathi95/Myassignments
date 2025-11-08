package stepdefination;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefDelete extends BaseClass {
	@Given("Click on Find leads Tab")
	public void click_on_find_leads_tab() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number delete")
	public void enter_the_phone_number_delete() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@When("Click on Find Leads delete")
	public void click_on_find_leads_delete() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Wait for delete")
	public void waitingfordelete() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("waiting");
	}
	
	@When("Select Second from the list")
	public void select_second_from_the_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click on the delete button")
	public void click_on_the_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Then("Delete operation successfull")
	public void delete_operation_successfull() {
	    System.out.println("Delete Operation successfull");
	}
}
