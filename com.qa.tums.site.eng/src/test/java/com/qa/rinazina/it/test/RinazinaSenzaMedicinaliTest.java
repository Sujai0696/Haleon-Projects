package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaSenzaMedicinaliPage;

public class RinazinaSenzaMedicinaliTest extends BaseClass{
	
	RinazinaSenzaMedicinaliPage sm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty(""));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty(""));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		sm = new RinazinaSenzaMedicinaliPage();
		switchingTab(firstTab);
		sm.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sm.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		sm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		sm.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		sm.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		sm.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the preprod URL");
		switchingTab(secondTab);
		sm.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the Live URL");
	}

}
