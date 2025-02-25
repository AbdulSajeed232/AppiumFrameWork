package org.abdul.TestUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.abdul.utils.AppiumUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class IOSAppSetup extends AppiumUtils {

	protected IOSDriver driver;
	AppiumDriverLocalService Service;

	@BeforeMethod
	public void LoadApp() throws URISyntaxException, IOException {

		// Start Server
		startAppiumServer();

		// Set Capabilities
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhone 15");
		options.setPlatformVersion("17.0");
		options.setApp(System.getProperty("user.dir") + "//src//test//java//resources//UIKitCatalog.app");
		options.setWdaLaunchTimeout(Duration.ofSeconds(30));

		driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), options);

		// Asking APPIUM globally wait for 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	// Stop Appium Server

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		if (Service != null) {
			Service.stop();
		}
	}

}
