package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumReplaceTomatoesInYourDishesPage;

public class NexiumReplaceTomatoesInYourDishesTest extends BaseClass{
	
	NexiumReplaceTomatoesInYourDishesPage rtyd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rtyd = new NexiumReplaceTomatoesInYourDishesPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("replaceTomatoesInYourDishesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("replaceTomatoesInYourDishesLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		rtyd.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		rtyd.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		rtyd.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		rtyd.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		rtyd.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		rtyd.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		rtyd.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkCausesYourSymptoms() throws Exception{
		switchingTab(firstTab);
		rtyd.clickHyperLinkCausesYourSymptoms();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickHyperLinkCausesYourSymptoms();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Causes Your Symptoms: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		rtyd.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		rtyd.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		rtyd.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyWholeCardSecFour() throws Exception{
		switchingTab(firstTab);
		rtyd.clickWholeCardSecFour();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		rtyd.clickWholeCardSecFour();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Four: "+compareTwoText);
	}

}
