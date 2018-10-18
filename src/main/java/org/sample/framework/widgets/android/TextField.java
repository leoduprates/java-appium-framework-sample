package org.sample.framework.widgets.android;

import org.sample.framework.widgets.ITextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class TextField implements ITextField {

	private AppiumDriver<AndroidElement> driver;
	private WebElement element;

	public TextField(AppiumDriver<AndroidElement> driver, By by) {
		this.driver = driver;
		try {
			this.element = this.driver.findElement(by);
			System.out.println(ex);
		} catch (Exception e) {
			System.out.println(ex);
		}
	}

	public ITextField setText(String text) {
		try {
			if(this.element.isDisplayed()){
				this.element.sendKeys(text);
				System.out.println(ex);
			}
		} catch (Exception e) {
			System.out.println(ex);
		}
		return this;
	}
}
