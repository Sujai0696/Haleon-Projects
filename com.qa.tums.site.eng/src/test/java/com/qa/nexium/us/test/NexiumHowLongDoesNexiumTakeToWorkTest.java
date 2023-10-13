package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumHowLongDoesNexiumTakeToWorkPage;

public class NexiumHowLongDoesNexiumTakeToWorkTest extends BaseClass{
	
	NexiumHowLongDoesNexiumTakeToWorkPage ntw;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ntw = new NexiumHowLongDoesNexiumTakeToWorkPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howLongDoesNexiumTakeToWorkPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howLongDoesNexiumTakeToWorkLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ntw.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ntw.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ntw.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		ntw.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ntw.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		ntw.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ntw.clickBreadcrumbThree();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		ntw.clickBreadcrumbThree();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkFeelABurningPain() throws Exception{
		switchingTab(firstTab);
		ntw.clickHyperLinkFeelABurningPain();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		ntw.clickHyperLinkFeelABurningPain();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Feel A Burning Pain: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkSomeFoods() throws Exception{
		switchingTab(firstTab);
		ntw.clickHyperLinkSomeFoods();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		ntw.clickHyperLinkSomeFoods();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Some Foods: "+compareTwoText);
	}

}
