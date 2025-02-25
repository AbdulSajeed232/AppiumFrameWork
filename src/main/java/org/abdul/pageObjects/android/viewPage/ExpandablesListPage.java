package org.abdul.pageObjects.android.viewPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExpandablesListPage {

	AndroidDriver driver;

	public ExpandablesListPage(AndroidDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
	private WebElement customAdapter;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Cursor (People)']")
	private WebElement cursor;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Simple Adapter']")
	private WebElement simpleAdapter;

}
