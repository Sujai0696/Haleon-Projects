package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.QuitEasyEverydayHabitsPage;

public class QuitEasyEverydayHabitsTest extends BaseClass{
	
	QuitEasyEverydayHabitsPage eeh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		eeh = new QuitEasyEverydayHabitsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("easyEverydayHabitsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("easyEverydayHabitsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		eeh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		eeh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLink() throws Exception{
		switchingTab(firstTab);
		eeh.clickBannerImgLink();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		eeh.clickBannerImgLink();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLink: "+compareTwoText);
	}
	
	@Test(priority = 2 )
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		eeh.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		eeh.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		eeh.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		eeh.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		eeh.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		eeh.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
	

}
