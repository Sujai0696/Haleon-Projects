package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidProductsSugarFreePage;

public class TumsAntacidProductsSugarFreeTest extends BaseClass{
	
	TumsAntacidProductsSugarFreePage sf;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsSugarFreePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsSugarFreeLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		sf = new TumsAntacidProductsSugarFreePage();
		switchingTab(firstTab);
		sf.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		sf.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		sf.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		sf.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		sf.clickWriteAReview();
		System.out.println("Write a review verified in the Preprod URL");
		switchingTab(secondTab);
		sf.clickWriteAReview();
		System.out.println("Write a review verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		sf.clickBuyNow();
		System.out.println("Buynow verified in the Preprod URL");
		switchingTab(secondTab);
		sf.clickBuyNow();
		System.out.println("Buynow verified in the live URL");
	}
	
	@Test(priority = 5)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		sf.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabNavigationOne() throws Exception{
		switchingTab(firstTab);
		sf.clickTabNavOne();
		System.out.println("Tab nav one is verified in the preprod url");
		switchingTab(secondTab);
		sf.clickTabNavOne();
		System.out.println("Tab nav one is verified in the live url");
	}
	
	@Test(priority = 7)
	private void verifyTabNavigationTwo() throws Exception{
		switchingTab(firstTab);
		sf.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the preprod url");
		switchingTab(secondTab);
		sf.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the live url");
	}
	
	@Test(priority = 8)
	private void verifyTabNavigationThree() throws Exception{
		switchingTab(firstTab);
		sf.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the preprod url");
		switchingTab(secondTab);
		sf.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the live url");
	}
	
	@Test(priority = 9)
	private void verifyTabNavigationFour() throws Exception{
		switchingTab(firstTab);
		sf.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the preprod url");
		switchingTab(secondTab);
		sf.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the live url");
	}
	
	@Test(priority = 10)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		sf.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyYoutube() throws Exception{
		switchingTab(firstTab);
		sf.clickYoutube();
		System.out.println("Youtube verified in the Preprod URL");
		switchingTab(secondTab);
		sf.clickYoutube();
		System.out.println("Youtube verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		sf.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickReadMore();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for read more :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyPrdtOne() throws Exception{
		switchingTab(firstTab);
		sf.clickPrdtOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickPrdtOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product one :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyPrdtTwo() throws Exception{
		switchingTab(firstTab);
		sf.clickPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickPrdtTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Two :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyPrdtThree() throws Exception{
		switchingTab(firstTab);
		sf.clickPrdtThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		sf.clickPrdtThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Three :"+compareTwoText);
	}
	
	
	

}
