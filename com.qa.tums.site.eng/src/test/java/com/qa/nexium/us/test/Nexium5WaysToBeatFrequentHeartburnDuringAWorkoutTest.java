package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutPage;

public class Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutTest extends BaseClass{
	
	Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutPage hbdw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hbdw = new Nexium5WaysToBeatFrequentHeartburnDuringAWorkoutPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("5WaysToBeatFrequentHeartburnDuringAWorkoutPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("5WaysToBeatFrequentHeartburnDuringAWorkoutLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hbdw.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hbdw.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hbdw.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hbdw.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hbdw.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		hbdw.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		hbdw.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTomatoes() throws Exception{
		switchingTab(firstTab);
		hbdw.clickHyperLinkTomatoes();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickHyperLinkTomatoes();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Tomatoes: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkCarbonatedBeverages() throws Exception{
		switchingTab(firstTab);
		hbdw.clickHyperLinkCarbonatedBeverages();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickHyperLinkCarbonatedBeverages();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Carbonated Beverages: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkAcidRefluxSymptoms() throws Exception{
		switchingTab(firstTab);
		hbdw.clickHyperLinkAcidRefluxSymptoms();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickHyperLinkAcidRefluxSymptoms();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Acid Reflux Symptoms: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		hbdw.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		hbdw.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		hbdw.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyWholeCardSecFour() throws Exception{
		switchingTab(firstTab);
		hbdw.clickWholeCardSecFour();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		hbdw.clickWholeCardSecFour();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Four: "+compareTwoText);
	}
	
	
	

}
