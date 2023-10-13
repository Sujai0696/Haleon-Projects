package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestKlimaschutzprojektPages;

public class DrBestKlimaschutzprojektTest extends BaseClass{
	
	DrBestKlimaschutzprojektPages kp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("klimaschutzprojektPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("klimaschutzprojektLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		kp = new DrBestKlimaschutzprojektPages();
		switchingTab(firstTab);
		kp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		kp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyInterdentKidsImg()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdentKids();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdentKids();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Img:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyInterdentImg()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdent();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdent();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Img:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyGreenCleanImg()throws Exception {
		switchingTab(firstTab);
		kp.clickGreenClean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickGreenClean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Img:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyInterdentalburstenImg()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdentalburstean();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdentalburstean();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Img:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyInterdentKidsButton()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdentKidsButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdentKidsButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Kids Button:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyInterdentButton()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdentButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdentButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdent Buttton:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGreenCleanButton()throws Exception {
		switchingTab(firstTab);
		kp.clickGreenCleanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickGreenCleanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Green Clean Button:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyInterdentalburstenButton()throws Exception {
		switchingTab(firstTab);
		kp.clickInterdentalbursteanButton();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		kp.clickInterdentalbursteanButton();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Button:"+compareTwoText);
	}

}
