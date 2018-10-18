package org.sample.framework.widgets.android;

import org.sample.framework.widgets.IMap;
import org.sample.framework.widgets.ISwipe;
import org.sample.framework.widgets.IZoom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Map implements IMap{

	private AppiumDriver<AndroidElement> driver;
	private WebElement element;
	private By by;

	public Map(AppiumDriver<AndroidElement> driver, By by) {
		this.driver = driver;
		this.by = by;
		this.element = this.driver.findElement(by);
	}

	public IMap click() {
		Button button = new Button(this.driver, this.by);
		button.click();
		return this;
	}

	public IMap out() {
		IZoom zoom = new Zoom(this.driver, this.element);
		zoom.out();
		return this;
	}

	public IMap in() {
		IZoom zoom = new Zoom(this.driver, this.element);
		zoom.in();
		return this;
	}

	public IMap horizontal(String orientation) {
		ISwipe swipe = new Swipe(this.driver);
		swipe.horizontal(orientation);
		return this;
	}

	public IMap vertical(String orientation) {
		ISwipe swipe = new Swipe(this.driver);
		swipe.vertical(orientation);
		return null;
	}
}
