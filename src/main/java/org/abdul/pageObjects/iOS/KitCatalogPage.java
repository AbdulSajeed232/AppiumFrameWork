package org.abdul.pageObjects.iOS;

import org.abdul.utils.IOSActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class KitCatalogPage extends IOSActions {

	IOSDriver driver;

	public KitCatalogPage(IOSDriver driver) {

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name =='UIKitCatalog'`]")
	private WebElement uIKitCatalogHeader;

	@iOSXCUITFindBy(accessibility = "Activity Indicators")
	private WebElement activityIndicatorsTitle;

	@iOSXCUITFindBy(accessibility = "Alert Views")
	private WebElement alertViewsTitle;

	@iOSXCUITFindBy(accessibility = "Buttons")
	private WebElement buttonsTitle;

	@iOSXCUITFindBy(accessibility = "Date Picker")
	private WebElement datePickerTitle;

	@iOSXCUITFindBy(accessibility = "Image View")
	private WebElement imageViewTitle;

	@iOSXCUITFindBy(accessibility = "Page Control")
	private WebElement pageControlTitle;

	@iOSXCUITFindBy(accessibility = "Picker View")
	private WebElement pickerViewTitle;

	@iOSXCUITFindBy(accessibility = "Progress Views")
	private WebElement progressViewsTitle;

	@iOSXCUITFindBy(accessibility = "Search")
	private WebElement SearchTitle;

	@iOSXCUITFindBy(accessibility = "Segmented Controls")
	private WebElement segmentedControlsTitle;

	@iOSXCUITFindBy(accessibility = "Sliders")
	private WebElement slidersTitle;

	@iOSXCUITFindBy(accessibility = "Stack Views")
	private WebElement stackViewsTitle;

	@iOSXCUITFindBy(accessibility = "Steppers")
	private WebElement steppersTitle;

	@iOSXCUITFindBy(accessibility = "Switches")
	private WebElement switchesTitle;

	@iOSXCUITFindBy(accessibility = "Text Fields")
	private WebElement textFieldsTitle;

	@iOSXCUITFindBy(accessibility = "Text View")
	private WebElement textViewTitle;

	@iOSXCUITFindBy(accessibility = "Toolbars")
	private WebElement toolbarsTitle;

	@iOSXCUITFindBy(accessibility = "Web View")
	private WebElement webViewTitle;

	public void clickActivityIndicatorTitle() {

		activityIndicatorsTitle.click();
		System.out.println("Activity Indicator is clicked");
	}

}
