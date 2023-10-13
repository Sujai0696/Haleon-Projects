package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidProductsChewyDelightsPage;
import com.qa.tums.eng.pages.TumsAntacidProductsSugarFreePage;

public class TumsAntacidProductsChewyDelightsTest extends BaseClass{
	
	TumsAntacidProductsChewyDelightsPage cd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsChewyDelightsPreprodUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsChewyDelightsLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		cd = new TumsAntacidProductsChewyDelightsPage();
		switchingTab(firstTab);
		cd.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		cd.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		cd.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		cd.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		cd.clickWriteAReview();
		System.out.println("Write a review verified in the Preprod URL");
		switchingTab(secondTab);
		cd.clickWriteAReview();
		System.out.println("Write a review verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		cd.clickBuyNow();
		System.out.println("Buynow verified in the Preprod URL");
		switchingTab(secondTab);
		cd.clickBuyNow();
		System.out.println("Buynow verified in the live URL");
	}
	
	@Test(priority = 5)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		cd.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabNavigationOne() throws Exception{
		switchingTab(firstTab);
		cd.clickTabNavOne();
		System.out.println("Tab nav one is verified in the preprod url");
		switchingTab(secondTab);
		cd.clickTabNavOne();
		System.out.println("Tab nav one is verified in the live url");
	}
	
	@Test(priority = 7)
	private void verifyTabNavigationTwo() throws Exception{
		switchingTab(firstTab);
		cd.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the preprod url");
		switchingTab(secondTab);
		cd.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the live url");
	}
	
	@Test(priority = 8)
	private void verifyTabNavigationThree() throws Exception{
		switchingTab(firstTab);
		cd.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the preprod url");
		switchingTab(secondTab);
		cd.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the live url");
	}
	
	@Test(priority = 9)
	private void verifyTabNavigationFour() throws Exception{
		switchingTab(firstTab);
		cd.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the preprod url");
		switchingTab(secondTab);
		cd.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the live url");
	}
	
	@Test(priority = 10)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		cd.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyYoutube() throws Exception{
		switchingTab(firstTab);
		cd.clickYoutube();
		System.out.println("Youtube verified in the Preprod URL");
		switchingTab(secondTab);
		cd.clickYoutube();
		System.out.println("Youtube verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		cd.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickReadMore();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for read more :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyPrdtOne() throws Exception{
		switchingTab(firstTab);
		cd.clickPrdtOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickPrdtOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product one :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyPrdtTwo() throws Exception{
		switchingTab(firstTab);
		cd.clickPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickPrdtTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Two :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyPrdtThree() throws Exception{
		switchingTab(firstTab);
		cd.clickPrdtThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		cd.clickPrdtThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Three :"+compareTwoText);
	}

}
