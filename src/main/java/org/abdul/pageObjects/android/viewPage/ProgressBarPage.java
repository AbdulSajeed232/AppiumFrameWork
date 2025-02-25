package org.abdul.pageObjects.android.viewPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProgressBarPage {

	AndroidDriver driver;

	public ProgressBarPage(AndroidDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
	private List<WebElement> progressBarTitles;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Incremental']")
	private WebElement incremental;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Smooth']")
	private WebElement smooth;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Dialogs']")
	private WebElement dialogs;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='4. In Title Bar']")
	private WebElement InTitleBar;

	public void getProgressBarOptions() {
		for (WebElement title : progressBarTitles) {
			System.out.println(title);
		}

	}

	public void selectIncrementalTitle(String TitleName) {

		incremental.click();
		System.out.println("Incremental is selected");

	}

}
