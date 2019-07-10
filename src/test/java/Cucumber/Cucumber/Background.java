package Cucumber.Cucumber;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {
	@Given("^Browser must be present in the system$")
	public void browser_must_be_present_in_the_system() throws Throwable {
	   System.out.println("chrome must be installed");
	    
	}

	@When("^user opens the application in the browser$")
	public void user_opens_the_application_in_the_browser() throws Throwable {
	   
		 System.out.println("open testme url in chrome");
	}

	@Then("^Testme opens in the browser$")
	public void testme_opens_in_the_browser() throws Throwable {
		 System.out.println("user in testme page!!!!!");
	   
	}

	@Given("^User must be already registered$")
	public void user_must_be_already_registered() throws Throwable {
		 System.out.println("Registered Successfully!!!!!");
	
	}

	@When("^user enter the correct credential$")
	public void user_enter_the_correct_credential() throws Throwable {
		 System.out.println("Login Successfully!!!");
	    
	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		 System.out.println("User in home");
	  
	}

	@Given("^user must have search option$")
	public void user_must_have_search_option() throws Throwable {
		 System.out.println("product searched");
	  
	}

	@When("^search for the product with name$")
	public void search_for_the_product_with_name() throws Throwable {
		 System.out.println("Park Avenue Deodrant");
	  
	}

	@Then("^searched product detail must be displayed in page$")
	public void searched_product_detail_must_be_displayed_in_page() throws Throwable {
		 System.out.println("Product Displayed Successfully");
	    
	} 


}
