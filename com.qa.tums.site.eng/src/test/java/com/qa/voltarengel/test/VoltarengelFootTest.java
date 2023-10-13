package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelFootPage;

public class VoltarengelFootTest extends BaseClass{
	
	VoltarengelFootPage fp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fp = new VoltarengelFootPage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("footPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("footLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		fp.clickCookieBtn();
		fp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		fp.clickCookieBtn();
		fp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		fp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		fp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		fp.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		fp.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkArthritisPain() throws Exception{
		switchingTab(firstTab);
		fp.clickHyperLinkArthritisPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickHyperLinkArthritisPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Arthritis Pain: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkVoltarenArthritisPainGel() throws Exception{
		switchingTab(firstTab);
		fp.clickHyperLinkVoltarenArthritisPainGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickHyperLinkVoltarenArthritisPainGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Arthritis Pain Gel: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		fp.clickShowReference();
		System.out.println("Show reference verified in the preprod URL");
		switchingTab(secondTab);
		fp.clickShowReference();
		System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		fp.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More One: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		fp.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More Two: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		fp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		fp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		fp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		fp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
