package org.abdul.pageObjects.android.viewPage;

import java.util.List;

import org.abdul.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsPage extends AndroidActions {

	AndroidDriver driver;

	public ViewsPage(AndroidDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
	private List<WebElement> viewTitles;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
	private WebElement viewsAnimation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Auto Complete']")
	private WebElement viewsAutoComplete;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Buttons']")
	private WebElement viewButtons;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Chronometer']")
	private WebElement viewChronometer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Controls']")
	private WebElement viewControls;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Custom']")
	private WebElement viewCustom;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
	private WebElement viewDateWidgets;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
	private WebElement viewDragAndDrop;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
	private WebElement viewExpandableLists;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Focus']")
	private WebElement viewFocus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Full Screen Modes']")
	private WebElement viewFullScreenModes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gallery']")
	private WebElement viewGallery;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Game Controller Input']")
	private WebElement viewGameControllerInput;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Grid']")
	private WebElement viewGrid;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hover Events']")
	private WebElement viewHoverEvents;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ImageButton']")
	private WebElement viewImageButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ImageSwitcher']")
	private WebElement viewImageSwitcher;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ImageSwitcher']")
	private WebElement viewImageView;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Layout Animation']")
	private WebElement viewLayoutAnimation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Layouts']")
	private WebElement viewLayouts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='List']")
	private WebElement viewList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Popup Menu']")
	private WebElement viewPopupMenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Progress Bar']")
	private WebElement viewProgressBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Radio Group']")
	private WebElement viewRadioGroup;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rating Bar']")
	private WebElement viewRatingBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rotating Button']")
	private WebElement viewRotatingButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ScrollBars']")
	private WebElement viewScrollBars;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Search View']")
	private WebElement viewSearchView;

}
