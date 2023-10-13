package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumHowToTreatGerdPage;

public class NexiumHowToTreatGerdTest extends BaseClass{
	
	NexiumHowToTreatGerdPage htg;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		htg = new NexiumHowToTreatGerdPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howToTreatGerdPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howToTreatGerdLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		htg.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htg.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		htg.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		htg.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		htg.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		htg.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkNexium24Hr() throws Exception{
		switchingTab(firstTab);
		htg.clickHyperLinkNexium24Hr();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickHyperLinkNexium24Hr();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Nexium24Hr: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkFrequentHeartburn() throws Exception{
		switchingTab(firstTab);
		htg.clickHyperLinkFrequentHeartburn();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickHyperLinkFrequentHeartburn();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink FrequentHeartburn: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkSpicyFood() throws Exception{
		switchingTab(firstTab);
		htg.clickHyperLinkSpicyFood();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickHyperLinkSpicyFood();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink SpicyFood: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkMoreArticles() throws Exception{
		switchingTab(firstTab);
		htg.clickHyperLinkMoreArticles();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		htg.clickHyperLinkMoreArticles();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink MoreArticles: "+compareTwoText);
	}

}
