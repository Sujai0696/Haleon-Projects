package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestBambusPage;

public class DrBestBambusTest extends BaseClass{
	
	DrBestBambusPage bp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("bambusPreprodUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("bambusLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		bp = new DrBestBambusPage();
		switchingTab(firstTab);
		bp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		bp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
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
	
	@Test(priority = 2)
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
	
	@Test(priority = 3)
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
	
	@Test(priority = 4)
	private void verifyInterdentButton()throws Exception {
		switchingTab(firstTab);
		bp.clickInterdentButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		bp.clickInterdentButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Button:"+compareTwoText);
	}

}
