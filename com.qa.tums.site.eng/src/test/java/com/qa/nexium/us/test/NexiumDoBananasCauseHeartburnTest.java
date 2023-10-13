package com.qa.nexium.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.nexium.us.pages.NexiumDoBananasCauseHeartburnPage;

public class NexiumDoBananasCauseHeartburnTest extends BaseClass{
	
	NexiumDoBananasCauseHeartburnPage bch;
	 
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("nexiumUS_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		bch = new NexiumDoBananasCauseHeartburnPage();
		switchingTab(firstTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("doBananasCauseHeartburnPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("nexiumUS_Config.properties").getProperty("doBananasCauseHeartburnLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		bch.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		bch.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		bch.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		bch.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		bch.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		bch.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
		switchingTab(secondTab);
		bch.clickBreadcrumbFour();
		System.out.println("Breadcrumb Four verified sucessfully in the preprod URL");
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkWhenYouExperienceHearburn() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkWhenYouExperienceHearburn();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkWhenYouExperienceHearburn();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink When You Experience Hearburn: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkSpicyFoods() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkSpicyFoods();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkSpicyFoods();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Spicy Foods: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkAvoidEatingRightBeforeYourBedtime() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkAvoidEatingRightBeforeYourBedtime();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkAvoidEatingRightBeforeYourBedtime();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Avoid Eating Right Before Your Bedtime: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkClearMinis() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkClearMinis();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkClearMinis();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Clear Minis: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkTablets() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkTablets();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkTablets();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Tablets: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkCapsules() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkCapsules();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkCapsules();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Capsules: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkNexium24Hr() throws Exception{
		switchingTab(firstTab);
		bch.clickHyperLinkNexium24Hr();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickHyperLinkNexium24Hr();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Nexium 24 Hr: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		bch.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		bch.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		bch.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyWholeCardSecFour() throws Exception{
		switchingTab(firstTab);
		bch.clickWholeCardSecFour();
		String preProdUrl = compareUrl(excelRead("Nexium_US", 1, 0));
		switchingTab(secondTab);
		bch.clickWholeCardSecFour();
		String liveUrl = compareUrl(excelRead("Nexium_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec Four: "+compareTwoText);
	}
}	
