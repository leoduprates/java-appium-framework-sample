package org.sample.framework.widgets.android;

import org.sample.framework.widgets.ISwipe;
import org.openqa.selenium.Dimension;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe implements ISwipe{

	private AppiumDriver<AndroidElement> driver;
	public static final String RIGTH = "right";
	public static final String LEFT = "left";

	public Swipe(AppiumDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public ISwipe horizontal(String orientation) {
		ScreenShot.capture(this.driver);
		Dimension size = driver.manage().window().getSize();
		int startX = (int) (size.width * 0.70);
		int startY = size.height / 2;
		int endX = (int) (size.width * 0.30);

		if(orientation.equals("right")) {
			driver.swipe(startX, startY, endX, startY, 3000);
		}

		if(orientation.equals("left")) {
			driver.swipe(endX, startY, startX, startY, 3000);
		}

		return this;
	}

	public ISwipe vertical(String orientation) {
		ScreenShot.capture(this.driver);
		Dimension size = driver.manage().window().getSize();
		int startY = (int) (size.height * 0.80);
		int startX = size.width / 2;
		int endY = (int) (size.height * 0.20);

		if(orientation.equals("right")) {
			driver.swipe(startX, startY, startX, endY, 3000);
		}

		if(orientation.equals("left")) {
			driver.swipe(startX, endY, startX, startY, 3000);
		}

		return this;
	}
}
