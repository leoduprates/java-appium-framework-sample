package org.sample.framework.widgets.android;
import org.sample.framework.widgets.IButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Button implements IButton {

	private AppiumDriver<AndroidElement> driver;
	private WebElement element;

	public Button(AppiumDriver<AndroidElement> driver, By by) {
		try {
			this.driver = driver;
			this.element = this.driver.findElement(by);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public IButton click() {
		try {
			if(this.element.isDisplayed()) {
				this.element.click();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return this;
	}

	public IButton exists() {
		try {
			if(this.element.isDisplayed() && this.element.isEnabled()) {
			} else {
				System.out.println(ex);
			}
		} catch (Exception ex) {
			System.out.println(ex);		}
		return this;
	}
}
