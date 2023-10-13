package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.VoltarengelHomePage;

public class VoltarengelHomeTest extends BaseClass{
	
	VoltarengelHomePage hp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hp = new VoltarengelHomePage();
		switchingTab(firstTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("homePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("voltarengel_Config.properties").getProperty("homeLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Pop-up successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBreadcrumbFour() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkLiveWithArthritis() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkLiveWithArthritis();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkLiveWithArthritis();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Live With Arthritis: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkDiscomfort() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkDiscomfort();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkDiscomfort();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Discomfort: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkRelief() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkRelief();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkRelief();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Relief: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkEasingPain() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkEasingPain();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkEasingPain();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Easing Pain: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkExercise() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkExercise();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkExercise();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link Exercise: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkEatAHealthyDiet() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkEatAHealthyDiet();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkEatAHealthyDiet();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Hyper Link EatAHealthyDiet: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		hp.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		hp.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
	
	@Test(priority = 12)
	private void verifyShowTranscript() throws Exception{
		switchingTab(firstTab);
		hp.clickShowTranscript();
		System.out.println("Show Transcript verified in the preprod URL");
		switchingTab(secondTab);
		hp.clickShowTranscript();
		System.out.println("Show Transcript verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyShowReference() throws Exception{
		switchingTab(firstTab);
		hp.clickShowReference();
		System.out.println("Show reference verified in the preprod URL");
		switchingTab(secondTab);
		hp.clickShowReference();
		System.out.println("Show reference verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More One: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Read More Two: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyGetCoupons() throws Exception{
		switchingTab(firstTab);
		hp.clickGetCoupons();
		String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
		switchingTab(secondTab);
		hp.clickGetCoupons();
		String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupons: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		hp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		hp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
