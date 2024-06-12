package org.dominos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Vegpizza {

	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='VEG PIZZA'])[1]")
	private WebElement vegpizza;

	@FindBy(xpath = "(//*[text()='Margherita'])[1]")
	private WebElement margherita;
	
	@FindBy(xpath = "(//*[text()='Primavera Gourmet-Pizza'])[1]")
	private WebElement primavera_gourmet_Pizza;
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getVegpizza() {
		return vegpizza;
	}
	
	
	
}
