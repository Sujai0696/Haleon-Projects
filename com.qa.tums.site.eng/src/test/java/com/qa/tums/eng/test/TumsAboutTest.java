package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAboutPage;

public class TumsAboutTest extends BaseClass{
	
	TumsAboutPage ap;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("aboutPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("aboutLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		ap = new TumsAboutPage();
		switchingTab(firstTab);
		ap.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		ap.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		ap.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		ap.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink One:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkTwo() throws Exception{
		switchingTab(firstTab);
		ap.clickHyperLinkTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickHyperLinkTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Two:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkThree() throws Exception{
		switchingTab(firstTab);
		ap.clickHyperLinkThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickHyperLinkThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Three:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkFour() throws Exception{
		switchingTab(firstTab);
		ap.clickHyperLinkFour();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickHyperLinkFour();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Four:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkFive() throws Exception{
		switchingTab(firstTab);
		ap.clickHyperLinkFive();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickHyperLinkFive();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Five:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		ap.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickReadMore();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read More:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		ap.clickShowReference();
		System.out.println("Show refernce is verified in the preprod URL");
		switchingTab(secondTab);
		ap.clickShowReference();
		System.out.println("Show refernce is verified in the live URL");
	}
	
	@Test(priority = 9)
	private void verifyPrdtOne() throws Exception{
		switchingTab(firstTab);
		ap.clickPrdtOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickPrdtOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product one:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyPrdtTwo() throws Exception{
		switchingTab(firstTab);
		ap.clickPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickPrdtTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product two:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		ap.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ap.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}


}
