package org.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void toClick(WebElement e) {
		e.click();
				
	}
	
	public static void toSendValues(WebElement s, String v) {
		s.sendKeys(v);

	}
	
	
}
