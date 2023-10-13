package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsSymptomsPage;
import com.qa.tums.eng.pages.TumsWhatDoesHeartburnFeelLikePage;

public class TumsWhatDoesHeartBurnFeelLikeTest extends BaseClass{
	
	TumsWhatDoesHeartburnFeelLikePage hfl;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("whatDoesHearburnFeelLikePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("whatDoesHearburnFeelLikeLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		hfl = new TumsWhatDoesHeartburnFeelLikePage();
		switchingTab(firstTab);
		hfl.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		hfl.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		hfl.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hfl.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		hfl.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hfl.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		hfl.clickYoutube();
		System.out.println("Youtube verified in the preprod Url");
		switchingTab(secondTab);
		hfl.clickYoutube();
		System.out.println("Youtube verified in the live Url");
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		hfl.clickHyperlinkOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hfl.clickHyperlinkOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyper link one:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		hfl.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hfl.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyper link two :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		hfl.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hfl.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	

}
