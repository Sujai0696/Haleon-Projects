package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAntacidProductsExtra750Page;
import com.qa.tums.eng.pages.TumsAntacidProductsSugarFreePage;

public class TumsAntacidProductsExtra750Test extends BaseClass{
	
	TumsAntacidProductsExtra750Page ep;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsExtra750PreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("antacidProductsExtra750LiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		ep = new TumsAntacidProductsExtra750Page();
		switchingTab(firstTab);
		ep.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		ep.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		ep.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyBreadCrumbOne() throws Exception{
		switchingTab(firstTab);
		ep.clickBreadCrumbOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickBreadCrumbOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb one:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWriteAReview() throws Exception{
		switchingTab(firstTab);
		ep.clickWriteAReview();
		System.out.println("Write a review verified in the Preprod URL");
		switchingTab(secondTab);
		ep.clickWriteAReview();
		System.out.println("Write a review verified in the live URL");
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		ep.clickBuyNow();
		System.out.println("Buynow verified in the Preprod URL");
		switchingTab(secondTab);
		ep.clickBuyNow();
		System.out.println("Buynow verified in the live URL");
	}
	
	@Test(priority = 5)
	private void verifyGetCoupon() throws Exception{
		switchingTab(firstTab);
		ep.clickGetCoupon();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickGetCoupon();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GetCoupon :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyTabNavigationOne() throws Exception{
		switchingTab(firstTab);
		ep.clickTabNavOne();
		System.out.println("Tab nav one is verified in the preprod url");
		switchingTab(secondTab);
		ep.clickTabNavOne();
		System.out.println("Tab nav one is verified in the live url");
	}
	
	@Test(priority = 7)
	private void verifyTabNavigationTwo() throws Exception{
		switchingTab(firstTab);
		ep.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the preprod url");
		switchingTab(secondTab);
		ep.clickTabNavTwo();
		System.out.println("Tab nav Two is verified in the live url");
	}
	
	@Test(priority = 8)
	private void verifyTabNavigationThree() throws Exception{
		switchingTab(firstTab);
		ep.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the preprod url");
		switchingTab(secondTab);
		ep.clickTabNavThree();
		System.out.println("Tab nav Three is verified in the live url");
	}
	
	@Test(priority = 9)
	private void verifyTabNavigationFour() throws Exception{
		switchingTab(firstTab);
		ep.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the preprod url");
		switchingTab(secondTab);
		ep.clickTabNavFour();
		System.out.println("Tab nav Four is verified in the live url");
	}
	
	@Test(priority = 10)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		ep.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyYoutube() throws Exception{
		switchingTab(firstTab);
		ep.clickYoutube();
		System.out.println("Youtube verified in the Preprod URL");
		switchingTab(secondTab);
		ep.clickYoutube();
		System.out.println("Youtube verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyReadMore() throws Exception{
		switchingTab(firstTab);
		ep.clickReadMore();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickReadMore();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for read more :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyPrdtOne() throws Exception{
		switchingTab(firstTab);
		ep.clickPrdtOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickPrdtOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product one :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyPrdtTwo() throws Exception{
		switchingTab(firstTab);
		ep.clickPrdtTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickPrdtTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Two :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyPrdtThree() throws Exception{
		switchingTab(firstTab);
		ep.clickPrdtThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ep.clickPrdtThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Three :"+compareTwoText);
	}

}
