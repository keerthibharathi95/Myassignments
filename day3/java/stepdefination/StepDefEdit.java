package stepdefination;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefEdit extends BaseClass {
	@Given("Click on Edit lead")
	public void click_on_edit_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number edit")
	public void enter_the_phone_number_edit() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@When("Click on Find Leads edit")
	public void click_on_find_leads_edit() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Wait for edit")
	public void waitingforedit() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@When("Select first name from the list")
	public void select_first_name_from_the_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click on Edit button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("Update Companyname")
	public void update_companyname() {		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@When("Click on EditSubmit button")
	public void clickonEditbutton() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Edit lead operation successful")
	public void edit_lead_operation_successful() {
		System.out.println("Edit lead operation successfully");
	}
	@But("Edit lead operation failed")
	public void edit_lead_operation_failed() {
	  System.out.println("Operation failed"); 
	}

}
