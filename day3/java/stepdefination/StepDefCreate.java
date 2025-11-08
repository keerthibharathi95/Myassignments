package stepdefination;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefCreate extends BaseClass{
	@Given("Click on Create lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the Companyname")
	public void enter_the_companyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
	}
	@Given("Enter the Firstname")
	public void enter_the_firstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayabharathi");


	}
	@Given("Enter the Lastname")
	public void enter_the_lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
	  
	}
	@When("Click on the CreateLead Button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	   
	}
	@Then("Create Lead operation successfull")
	public void create_lead_operation_successfull() {
	  System.out.println(driver.getTitle()); 
	   
	}
	@Then("Create Lead operation failed")
	public void create_lead_operation_failed() {
	    System.out.println("Create Lead Operation failed");
	    
	}

}
