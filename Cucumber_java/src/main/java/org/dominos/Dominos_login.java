package org.dominos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dominos_login {
	
public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;

}
