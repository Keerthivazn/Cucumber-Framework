package org.stepdefinition;

import org.helper.BaseClass;
import org.junit.Assert;
import org.pom.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenariosDefnition extends BaseClass {

	PojoClass p;

	@Given("To launch the chrome browser and hit the url")
	public void to_launch_the_chrome_browser_and_hit_the_url() {
		BrowserLaunch();
		LaunchUrl("https://www.facebook.com/");
	}

	@When("To pass the valid username in the{string} username text field")
	public void to_pass_the_valid_username_in_the_username_text_field(String username) {
		p = new PojoClass();
		fillTextBox(p.getFbtxtemail(), username);
	}

	@When("To pass the Invalid password in the {string} password text field")
	public void to_pass_the_Invalid_password_in_the_password_text_field(String password) {
		p = new PojoClass();
		Assert.assertTrue(false);
		fillTextBox(p.getFbtxtpass(), password);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		btnClick(p.getFbloginclick());
	}

	@Then("to close the chrome browser")
	public void to_close_the_chrome_browser() {

	}

}
