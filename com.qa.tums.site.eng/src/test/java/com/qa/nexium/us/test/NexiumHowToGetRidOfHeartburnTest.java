package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumHowToGetRidOfHeartburnPage;

public class NexiumHowToGetRidOfHeartburnTest extends BaseClass{
	
	NexiumHowToGetRidOfHeartburnPage grh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		grh = new NexiumHowToGetRidOfHeartburnPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howToGetRidOfHeartburnPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("howToGetRidOfHeartburnLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		grh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		grh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		grh.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		grh.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		grh.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		grh.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkSymptomsOfHeartburn() throws Exception{
		switchingTab(firstTab);
		grh.clickHyperLinkSymptomsOfHeartburn();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickHyperLinkSymptomsOfHeartburn();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Symptoms Of Heartburn: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkHeartburnAtNight() throws Exception{
		switchingTab(firstTab);
		grh.clickHyperLinkHeartburnAtNight();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickHyperLinkHeartburnAtNight();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Heartburn At Night: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkProtonPumpInhibitor() throws Exception{
		switchingTab(firstTab);
		grh.clickHyperLinkProtonPumpInhibitor();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickHyperLinkProtonPumpInhibitor();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Proton Pump Inhibitor: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkNexium24Hr() throws Exception{
		switchingTab(firstTab);
		grh.clickHyperLinkNexium24Hr();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		grh.clickHyperLinkNexium24Hr();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Nexium 24 Hr: "+compareTwoText);
	}

}
