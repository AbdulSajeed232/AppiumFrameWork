package org.abdul.pageObjects.android.viewPage;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RadioButtonsPage {

	AndroidDriver driver;

	public RadioButtonsPage(AndroidDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

}
