package Cucumber.Cucumber;

import org.testng.annotations.Test;

import cucumber.api.java.en.When;

public class DataDriven {
	/*@When("^login using parthi(\\d+) and abc(\\d+)$")
	public void login_using_parthi_and_abc(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username and password");
		System.out.println(arg1+" "+arg2);
	   
	}*/
	@When("^login using parthi and abc(\\d+)$")
	public void login_using_parthi_and_abc(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("abcd");
		System.out.println(arg1);
	    
	}

	@When("^login using ragnar and abc(\\d+)$")
	public void login_using_ragnar_and_abc(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
