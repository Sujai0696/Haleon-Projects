package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestBiokunststoffPage;

public class DrBestBiokunststoffTest extends BaseClass{
	
	DrBestBiokunststoffPage bp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("biokunststoffPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("biokunststoffLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		bp = new DrBestBiokunststoffPage();
		switchingTab(firstTab);
		bp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		bp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyLinkOne()throws Exception {
		switchingTab(firstTab);
		bp.clickLinkOne();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickLinkOne();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link One:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyInterdentKidsImg()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentKids();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentKids();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Img:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyInterdentImg()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdent();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdent();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Img:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyGreenCleanImg()throws Exception {
		switchingTab(firstTab);
		bp.clickGreenClean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickGreenClean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Img:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyInterdentalburstenImg()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentalburstean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentalburstean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Img:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyInterdentKidsButton()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentKidsButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentKidsButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Button:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyInterdentButton()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Buttton:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyGreenCleanButton()throws Exception {
		switchingTab(firstTab);
		bp.clickGreenCleanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickGreenCleanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Button:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyInterdentalburstenButton()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentalbursteanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentalbursteanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Button:"+compareTwoText);
	}

}
