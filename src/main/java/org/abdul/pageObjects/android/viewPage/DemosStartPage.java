package org.abdul.pageObjects.android.viewPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DemosStartPage {

	AndroidDriver driver;

	public DemosStartPage(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
	private WebElement apiDemosHeader;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
	private List<WebElement> demosTitles;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Accessibility']")
	private WebElement accessibility;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
	private WebElement animation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App']")
	private WebElement app;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Content']")
	private WebElement content;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Graphics']")
	private WebElement graphics;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Media']")
	private WebElement media;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NFC']")
	private WebElement nfc;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='os']")
	private WebElement os;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
	private WebElement preferences;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Text']")
	private WebElement text;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	private WebElement views;

	public void getHeaderApiDemos() {
		String title = apiDemosHeader.getText();
		System.out.println(title);
	}

	public void printTitlesOfDemos() {

		for (WebElement title : demosTitles) {
			System.out.println(title.getText());
		}
	}

	public void selectContentsTitle(String TitleName) {

		views.click();
		System.out.println("View is selected");

	}

}
