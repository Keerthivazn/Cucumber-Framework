package org.pom;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
	 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement fbtxtemail;
	@CacheLookup
	@FindBys({             // Using AND Operator
		@FindBy(id="pass"),                   //t
		@FindBy(xpath="//input[@id='pass']")  //t----result=true
	})
	private WebElement fbtxtpass;
	@CacheLookup
	@FindAll({              // Using OR Operator
		@FindBy(name="login"),                   //t
		@FindBy(xpath="//button[@type='submi'")  //f------result-true
	})
	private WebElement fbloginclick;

	public WebElement getFbtxtemail() {
		return fbtxtemail;
	}

	public WebElement getFbtxtpass() {
		return fbtxtpass;
	}

	public WebElement getFbloginclick() {
		return fbloginclick;
	}
	
	
	
	
	@FindBy(id="username")
	private WebElement adactinun;
	
	@FindBys({            // AND Operator
		@FindBy(id="password"),
		@FindBy(xpath="(//input[@class='login_input'])[2]")
	})
	private WebElement adactinpw;
	
	@FindAll({         // OR Operator
		@FindBy(xpath="(//input[@class='login_button'])"),
		@FindBy(name="login")
	})
	private WebElement adactinclick;

	public WebElement getAdactinun() {
		return adactinun;
	}

	public WebElement getAdactinpw() {
		return adactinpw;
	}

	public WebElement getAdactinclick() {
		return adactinclick;
	}
	
	
	
	
	
	@FindBy(xpath="(//span[@class='blue_text'])[1]")
	private WebElement greensscd;
	
	@FindBy(xpath="(//h1[@style='font-size:22px;'])")
	private WebElement greensscup;

	public WebElement getGreensscd() { //Scrollup
		return greensscd;
	}

	public WebElement getGreensscup() { //ScrollDown
		return greensscup;
	}
	
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement flipkartuser;
	
	@FindBys({        // AND Operator
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	})
	private WebElement flipkartpass;
	
	@FindAll({      // OR Operator
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"),
		@FindBy(xpath="(//button[@type='submit'])[2]")
	})
	private WebElement flipkartclick;

	public WebElement getFlipkartuser() {
		return flipkartuser;
	}

	public WebElement getFlipkartpass() {
		return flipkartpass;
	}

	public WebElement getFlipkartclick() {
		return flipkartclick;
	}
	
	
	
	@FindBy(name="email")
	private WebElement amazonuser;
	
	@FindBys({         //AND Operator
	@FindBy(xpath="(//input[@class='a-button-input'])"),               //t
	@FindBy(xpath="(//input[@aria-labelledby='continue-announce'])")   //t
	})
	private WebElement amazonctnue;
	
	@FindAll({      //OR Operator
	@FindBy(xpath=("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")),  //true
	@FindBy(name="passwo")                                                                          //false 
	})
	private WebElement amazonpass;

	@FindAll({
		@FindBy(xpath=("//input[@type='submit']")),
		@FindBy(id="signInSubmit"),
		@FindBy(xpath=("//input[@class='a-button-input']"))
	})
	private WebElement amazonsignin;

	public WebElement getAmazonuser() {
		return amazonuser;
	}

	public WebElement getAmazonctnue() {
		return amazonctnue;
	}

	public WebElement getAmazonpass() {
		return amazonpass;
	}

	public WebElement getAmazonsignin() {
		return amazonsignin;
	}

}
