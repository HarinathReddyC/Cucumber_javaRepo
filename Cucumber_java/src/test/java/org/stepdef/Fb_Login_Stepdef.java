package org.stepdef;

import org.Baseclass.BaseClass;
import org.fb_pom.Fb_Login_Pom;
import org.fb_runner.Fb_Login_runner;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_Login_Stepdef extends BaseClass {
	WebDriver driver = Fb_Login_runner.driver;

	Fb_Login_Pom fb = new Fb_Login_Pom(driver);
	
	@Given("user launch the url and maximizing")
	public void user_launch_the_url_and_maximizing() {
		url(driver, "https://www.fb.com");
		maximize(driver);
	}
	
	
	@When("i enter the valid username")
	public void i_enter_the_valid_username() {
		toSendValues(fb.getEmail(), "java");
		
	}
	
	
	@When("i enter the password")
	public void i_enter_the_password() {
		toSendValues(fb.getPassword(), "1234574");
	}
	
	
	@Then("i click on the login button")
	public void i_click_on_the_login_button() {
		toClick(fb.getLogin());
		
	}

}
