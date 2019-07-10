package Cucumber.Cucumber;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestCucumber {
	String str;
	@Given("^when the user prints parthiban$")
	public void when_the_user_prints_parthiban() throws Throwable {
	    str="Parthiban";
	}

	@Then("^parthiban diplay in console$")
	public void parthiban_diplay_in_console() throws Throwable {
		System.out.println(str);
	    
	}
}
