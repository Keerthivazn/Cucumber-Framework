package org.stepdefinition;

import org.helper.BaseClass;
import org.junit.Assert;
import org.pom.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonDefinition extends BaseClass{

	PojoClass p;
	
	@Given("User To  Launch browser and hit url of the application")
	public void user_To_Launch_browser_and_hit_url_of_the_application() {
		BrowserLaunch();
		LaunchUrl("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
	}

	
	@When("To pass the valid username in the corresponding field")
	public void toPassTheValidUsernameInTheCorrespondingField() {
		p =new PojoClass();
		fillTextBox(p.getAmazonuser(), "keerthivenkat259@gmail.com");
	}

	@When("To click the ctnue button")
	public void toClickTheCtnueButton() {
		p = new PojoClass();
		btnClick(p.getAmazonctnue());
	}

	@When("To pass the valid password in the corresponding field")
	public void toPassTheValidPasswordInTheCorrespondingField() {
		p=new PojoClass();
		Assert.assertTrue(false);
		fillTextBox(p.getAmazonpass(), "123456");
	}

	@When("To click the Signin button")
	public void toClickTheSigninButton() {
		p=new PojoClass();
		btnClick(p.getAmazonsignin());
	}

	@Then("To close the browser")
	public void toCloseTheBrowser() {
		closeBrowser();
	}

	@When("To pass the balnk username in the corresponding field")
	public void toPassTheBalnkUsernameInTheCorrespondingField() {
		p =new PojoClass();
		fillTextBox(p.getAmazonuser(), "keerthivenkat259@gmail.com");
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
		p = new PojoClass();
		btnClick(p.getAmazonctnue());
	}

	@When("To pass the blank password in the corresponding field")
	public void toPassTheBlankPasswordInTheCorrespondingField() {
		p=new PojoClass();
		fillTextBox(p.getAmazonpass(), "123456");
	}

	@When("To click the Signin button in the application")
	public void toClickTheSigninButtonInTheApplication() {
		p=new PojoClass();
		btnClick(p.getAmazonsignin());
	}

	@Then("To close the browser of amazon")
	public void toCloseTheBrowserOfAmazon() {
	    closeBrowser();
	}


}
