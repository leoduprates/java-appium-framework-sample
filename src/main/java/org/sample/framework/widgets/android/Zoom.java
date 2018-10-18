package org.sample.framework.widgets.android;

import org.sample.framework.utils.GraphicsUtils;
import org.sample.framework.widgets.IZoom;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Zoom implements IZoom {
	private AppiumDriver<AndroidElement> driver;
	private WebElement element;

	public Zoom(AppiumDriver<AndroidElement> driver, WebElement element) {
		this.driver = driver;
		this.element = element;
	}

	public IZoom out() {
        try {
    		ScreenShot.capture(this.driver);
            Screen screen = new Screen();
    		String screenShotPath = ScreenShot.capture(this.driver);
    		GraphicsUtils.resize(screenShotPath, 390, 690);
            screen.saveScreenCapture(System.getProperty("user.dir").toString() + "\\reports\\screenshots\\");
			screen.wait(screenShotPath);
	        screen.rightClick(screenShotPath);
	        screen.rightClick(screenShotPath);
        } catch (FindFailed ex) {
			System.out.println(ex);
		}
		return this;
	}

	public IZoom in() {
		ScreenShot.capture(this.driver);
		ScreenShot.capture(this.driver);
		int x = this.element.getLocation().getX();
		int y = this.element.getLocation().getY();
		this.driver.tap(1, x, y, 100);
		this.driver.tap(1, x, y, 100);
		return this;
	}
}
