package org.abdul.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions extends AppiumUtils {

	AndroidDriver driver;

	public AndroidActions(AndroidDriver driver) {
		this.driver = driver;
	}

	public void longPressAction(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementid", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void scrollToText(WebElement ele) {

		AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ele\"));");

	}

	public void swipe(WebElement ele, String direction) {

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementid",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));
	}

	public void dragAndDrop(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementid", ((RemoteWebElement) ele).getId(), "endX", 100, "endY", 100));

	}

	public void touchAndHold(WebElement ele) {

		Map<String, Object> params = new HashMap<>();
		params.put("element", ((RemoteWebElement) ele).getId());
		params.put("duration", 5);

		driver.executeScript("mobile: touchAndHold", params);

	}

}
