package org.abdul.TestUtils;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.abdul.pageObjects.android.viewPage.DemosStartPage;
import org.abdul.utils.AppiumUtils;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidAppSetup extends AppiumUtils {

	AndroidDriver driver;
	AppiumDriverLocalService Service;

	public AndroidAppSetup(AndroidDriver driver) {
		this.driver = driver;
	}

	@Test
	public void LoadApp() throws URISyntaxException, IOException {

		// Start APPIUM Server
		startAppiumServer();

		// Set Capabilities //
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AkhilEmulator");
		options.setApp(System.getProperty("user.dir") + "//src//test//java//resources//ApiDemos-debug.apk");

		driver = new AndroidDriver(new URI("127.0.0.1").toURL(), options);

		// Asking APPIUM globally wait for 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

		// AUTOMATIONS ACTIONS //

		DemosStartPage demosStartPage = new DemosStartPage(driver);

		demosStartPage.getHeaderApiDemos();
		demosStartPage.printTitlesOfDemos();
		demosStartPage.selectContentsTitle("Content");

	}

}
