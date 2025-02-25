package org.abdul.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class IOSActions extends AppiumUtils {

	IOSDriver driver;

	public IOSActions(IOSDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void LongPressAction(WebElement ele) {

		Map<String, Object> params = new HashMap<>();
		params.put("element", ((RemoteWebElement) ele).getId());
		params.put("duration", 20);

		driver.executeScript("mobile: touchAndHold", params);

	}

	public void Scroll(WebElement ele) throws InterruptedException {

		Map<String, Object> params = new HashMap<>();
		params.put("element", ((RemoteWebElement) ele).getId());
		params.put("direction", "down");

		driver.executeScript("mobile: scroll", params);
		Thread.sleep(2000);

	}

	public void Slide(WebElement ele) {

		Map<String, Object> params = new HashMap<>();

		params.put("direction", "left");
		driver.executeScript("mobile: swipe", params);

	}

	public void Dropdown(String ele) {

		Map<String, Object> params = new HashMap<>();

		params.put("element", ele);

	}

}
