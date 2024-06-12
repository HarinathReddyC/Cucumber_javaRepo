package org.fb_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_Pom {
	
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	//stale element
	
	public Fb_Login_Pom(WebDriver driver1) {
		//Chrome browser       Webelement
		this.driver       = driver1;
		PageFactory.initElements(driver, this);
	}
	

}
