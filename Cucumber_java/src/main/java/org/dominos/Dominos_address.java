package org.dominos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dominos_address {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[text()='ORDER ONLINE NOW']")
	private WebElement orderonlinenow;

	
	@FindBy(className ="srch-cnt-srch-inpt")
	private WebElement enteryourdeliveraddress ;
	
	@FindBy(xpath="//*[text()='Chennai, Tamil Nadu, India']")
	private WebElement selectaddress;
	
	
	public WebElement getorderonlinenow() {
		return orderonlinenow;
	}

	public WebElement getenteryourdeliveraddress() {
		return enteryourdeliveraddress;
		
	}
	
	public WebElement getselectaddress() {
		return selectaddress;
		
	}
	
	
}
