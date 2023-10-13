package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.DrBestForschungPage;

public class DrBestForschungTest extends BaseClass{
	
	DrBestForschungPage fp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("drbestForschungPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("drbest_deConfig.properties").getProperty("drbestForschungLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		fp = new DrBestForschungPage();
		switchingTab(firstTab);
		fp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		fp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyLinkUnder1993()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder1993();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder1993();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 1993 :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyLinkUnder2003()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder2003();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder2003();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 2003 :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyLinkUnder2006()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder2006();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder2006();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 2006 :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyLinkUnder2008()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder2008();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder2008();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 2008 :"+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyLinkUnder2013()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder2013();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder2013();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 2013 :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyInterdentalburstenLink()throws Exception {
		switchingTab(firstTab);
		fp.clickInterdentalburstenLink();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickInterdentalburstenLink();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Interdentalbursten Link :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGreenCleanLink()throws Exception {
		switchingTab(firstTab);
		fp.clickGreenCleanLink();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickGreenCleanLink();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GreenClean Link :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLinkUnder2022()throws Exception {
		switchingTab(firstTab);
		fp.clickLinkUnder2022();
		String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
		switchingTab(secondTab);
		fp.clickLinkUnder2022();
		String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Link under 2022 :"+compareTwoText);
	}
	
		

}
