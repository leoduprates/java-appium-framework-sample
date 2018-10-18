package org.sample.framework.widgets.android;

import org.openqa.selenium.ScreenOrientation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Rotate {

	public static void landscape(AppiumDriver<AndroidElement> driver) {
		try {
			driver.rotate(ScreenOrientation.LANDSCAPE);
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void portrait(AppiumDriver<AndroidElement> driver) {
		try {
			driver.rotate(ScreenOrientation.PORTRAIT);
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
