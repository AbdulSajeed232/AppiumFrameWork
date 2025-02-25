package org.abdul.pageObjects.android.viewPage;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TabsPage {

	AndroidDriver driver;

	public TabsPage(AndroidDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

}
