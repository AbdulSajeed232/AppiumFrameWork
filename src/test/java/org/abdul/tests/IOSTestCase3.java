package org.abdul.tests;

import org.abdul.TestUtils.IOSAppSetup;
import org.abdul.pageObjects.iOS.KitCatalogPage;
import org.testng.annotations.Test;

public class IOSTestCase3 extends IOSAppSetup {

	@Test
	public void openUIKitCatalog() {

		System.out.println("Its working");
		KitCatalogPage newPage = new KitCatalogPage(driver);
		newPage.clickActivityIndicatorTitle();

	}

}
