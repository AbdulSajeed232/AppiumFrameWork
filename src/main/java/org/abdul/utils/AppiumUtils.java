package org.abdul.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumUtils {

	private static AppiumServiceBuilder appiumServiceBuilder;
	private static AppiumDriverLocalService appiumDriverLocalService;

	// Start APPIUM Server

	public static void startAppiumServer() throws IOException {

		// Kill any activated session

		killAppiumSession();

		// Setting Global properties from Properties file

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//org//abdul//resources//data.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");

		// build AppiumService
		appiumServiceBuilder = new AppiumServiceBuilder();
		appiumServiceBuilder.withIPAddress(ipAddress);
		appiumServiceBuilder.usingPort(Integer.parseInt(port));
		appiumServiceBuilder.usingDriverExecutable(new File("/opt/homebrew/bin/node"));
		appiumServiceBuilder.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
		appiumServiceBuilder.withArgument(GeneralServerFlag.LOG_LEVEL, "debug");
		appiumServiceBuilder.withEnvironment(ImmutableMap.of("PATH", "/opt/homebrew/bin:" + System.getenv("PATH")));

		// Start the server(LocalService) with builder

		appiumDriverLocalService = AppiumDriverLocalService.buildService(appiumServiceBuilder);

		appiumDriverLocalService.start();

	}

	public static void stopAppiumServer() {

		if (appiumDriverLocalService.isRunning() && appiumDriverLocalService != null) {
			// Stop Server
			appiumDriverLocalService.stop();
		}

	}

	private static void killAppiumSession() {

		String[] command = { "/usr/bin/killall", "-KILL", "node" };
		try {
			Runtime.getRuntime().exec(command);
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public List<HashMap<String, String>> getJsonData(String JsonFilePath) throws IOException {

		// path = System.getProperty("user.dir") +
		// "src//test//java//abdul//testData//eCommerce.json

		String jsonContent = FileUtils.readFileToString(new File(JsonFilePath), StandardCharsets.UTF_8);

		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {
				});

		return data;
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonData(
				System.getProperty("user.dir") + "src//test//java//abdul//testData//eCommerce.json");

		return new Object[][] { { data.get(0) } };

	}

	public void waitForElement(WebElement ele, AppiumDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele), "text", "cart"));
	}

	public String getScreenShotPath(String testCaseName, AppiumDriver driver) throws IOException {

		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "//ExtentReports" + testCaseName + ".png";

		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}

}
