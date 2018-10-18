package org.sample.framework.widgets.android;

import org.sample.framework.widgets.ITap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Tap implements ITap {

	private AppiumDriver<AndroidElement> driver;
	private WebElement element;

	public Tap(AppiumDriver<AndroidElement> driver, By by) {
		this.driver = driver;
		try {
			this.element = this.driver.findElement(by);
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public ITap tap() {
		try {
			int x = this.element.getLocation().getX();
			int y = this.element.getLocation().getY();

			if(this.element.isDisplayed()) {
				this.driver.tap(1, x, y, 100);
				System.out.println(ex);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return this;
	}

}
