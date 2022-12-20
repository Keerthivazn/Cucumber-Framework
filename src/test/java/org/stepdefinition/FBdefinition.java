package org.stepdefinition;

import java.util.List;

import org.helper.BaseClass;
import org.pom.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBdefinition extends BaseClass {
	
	PojoClass p = new PojoClass();
	
	@Given("User has to Launch The Browser and Hit the Facebook Url Page")
	public void user_has_to_Launch_The_Browser_and_Hit_the_Facebook_Url_Page() {
		BrowserLaunch();
		LaunchUrl("https://www.facebook.com/");
	}

	@When("User has to Enter the Invalid Username in Email text Field")
	public void user_has_to_Enter_the_Invalid_Username_in_Email_text_Field(io.cucumber.datatable.DataTable d) {
	    p=new PojoClass();
	    List<String> li = d.asList();
	    fillTextBox(p.getFbtxtemail(), li.get(3));
	}

	@When("User has to Enter the Valid Password in Password Text field")
	public void user_has_to_Enter_the_Valid_Password_in_Password_Text_field(io.cucumber.datatable.DataTable d) {
	   p = new PojoClass();
	   List<List<String>> li = d.asLists();
	   fillTextBox(p.getFbtxtpass(), li.get(1).get(2));
	}

	@When("User has to Click the Login button")
	public void user_has_to_Click_the_Login_button() {
	   	p =new PojoClass();
	   	btnClick(p.getFbloginclick());
	}


	@Then("User has to  close the Browser")
	public void user_has_to_close_the_Browser() {
	    
	}



}
