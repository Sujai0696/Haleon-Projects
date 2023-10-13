package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestPlastikfreiPage;

public class DrBestPlastikfreiTest extends BaseClass{
	
	DrBestPlastikfreiPage pp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("plastikfreiPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("plastikfreiLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		pp = new DrBestPlastikfreiPage();
		switchingTab(firstTab);
		pp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		pp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyInterdentKidsImg()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdentKids();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdentKids();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Img:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyInterdentImg()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdent();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdent();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Img:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyGreenCleanImg()throws Exception {
		switchingTab(firstTab);
		pp.clickGreenClean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickGreenClean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Img:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyInterdentalburstenImg()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdentalburstean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdentalburstean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Img:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyInterdentKidsButton()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdentKidsButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdentKidsButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Button:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyInterdentButton()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdentButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdentButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Buttton:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGreenCleanButton()throws Exception {
		switchingTab(firstTab);
		pp.clickGreenCleanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickGreenCleanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Button:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyInterdentalburstenButton()throws Exception {
		switchingTab(firstTab);
		pp.clickInterdentalbursteanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		pp.clickInterdentalbursteanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Button:"+compareTwoText);
	}


}
