package Cucumber.Cucumber;



import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class User_Details {
	int i;
	@Given("^I open the facebook URL$")
	public void i_open_the_facebook_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("open application URL");
	}

@Given("^fill up the new account form with the following data$")
public void fill_up_the_new_account_form_with_the_following_data(DataTable pr) throws Throwable {
	List<Map<String,String>> list=pr.asMaps(String.class,String.class);
	for(i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).get("First Name")+" "+list.get(i).get("Last Name")+" "+list.get(i).get("Password")+" "+list.get(i).get("Gender"));
		System.out.println("\n");
	}
	
	
   
   
}
}
