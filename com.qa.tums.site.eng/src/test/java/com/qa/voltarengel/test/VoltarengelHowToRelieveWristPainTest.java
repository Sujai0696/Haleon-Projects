package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelHowToRelieveWristPainPage;

public class VoltarengelHowToRelieveWristPainTest extends BaseClass{
	
	VoltarengelHowToRelieveWristPainPage rwp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rwp = new VoltarengelHowToRelieveWristPainPage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("howToRelieveWristPainPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("howToRelieveWristPainLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		rwp.clickCookieBtn();
		rwp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		rwp.clickCookieBtn();
		rwp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		rwp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		rwp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		rwp.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkWristPain() throws Exception{
		switchingTab(firstTab);
		rwp.clickHyperLinkWristPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickHyperLinkWristPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link WristPain: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyHyperLinkFlexibilityExercises() throws Exception{
		switchingTab(firstTab);
		rwp.clickHyperLinkFlexibilityExercises();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickHyperLinkFlexibilityExercises();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Flexibility Exercises: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkVoltarenArthritisPainGel() throws Exception{
		switchingTab(firstTab);
		rwp.clickHyperLinkVoltarenArthritisPainGel();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickHyperLinkVoltarenArthritisPainGel();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Arthritis PainGel: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkArthritisRelief() throws Exception{
		switchingTab(firstTab);
		rwp.clickHyperLinkArthritisRelief();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickHyperLinkArthritisRelief();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Voltaren Arthritis PainGel: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		rwp.clickShowReference();
		System.out.println("Show reference verified in the preprod URL");
		switchingTab(secondTab);
		rwp.clickShowReference();
		System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		rwp.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		rwp.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More Two: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		rwp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		rwp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		rwp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		rwp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	

}
