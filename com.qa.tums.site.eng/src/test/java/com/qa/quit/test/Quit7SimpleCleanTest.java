package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.Quit7SimpleCleanPage;

public class Quit7SimpleCleanTest extends BaseClass{
	
	Quit7SimpleCleanPage sc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sc = new Quit7SimpleCleanPage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("7SimpleCleanPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("7SimpleCleanLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLink() throws Exception{
		switchingTab(firstTab);
		sc.clickBannerImgLink();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sc.clickBannerImgLink();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLink: "+compareTwoText);
	}
	
	@Test(priority = 2 )
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		sc.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sc.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sc.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		sc.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sc.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkThree: "+compareTwoText);
	}
	
}
