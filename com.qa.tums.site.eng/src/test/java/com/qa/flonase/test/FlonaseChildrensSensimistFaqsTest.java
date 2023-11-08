package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseChildrensSensimistFaqsPage;

public class FlonaseChildrensSensimistFaqsTest extends BaseClass{
	
	FlonaseChildrensSensimistFaqsPage csf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		csf = new FlonaseChildrensSensimistFaqsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("childrensSensimistFaqsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("childrensSensimistFaqsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		csf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerImgLinkOne() throws Exception{
		switchingTab(firstTab);
		csf.clickBannerImgLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickBannerImgLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerImgLinkTwo() throws Exception{
		switchingTab(firstTab);
		csf.clickBannerImgLinkTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickBannerImgLinkTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkTwo: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBannerImgLinkThree() throws Exception{
		switchingTab(firstTab);
		csf.clickBannerImgLinkThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickBannerImgLinkThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkThree: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBannerImgLinkFour() throws Exception{
		switchingTab(firstTab);
		csf.clickBannerImgLinkFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickBannerImgLinkFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFour: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyBannerImgLinkFive() throws Exception{
		switchingTab(firstTab);
		csf.clickBannerImgLinkFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickBannerImgLinkFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BannerImgLinkFive: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyAccOne() throws Exception{
		switchingTab(firstTab);
		csf.clickAccOne();
		System.out.println("Accordion one successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccOne();
		System.out.println("Accordion one successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAccTwo() throws Exception{
		switchingTab(firstTab);
		csf.clickAccTwo();
		System.out.println("Accordion Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccTwo();
		System.out.println("Accordion Two successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAccThree() throws Exception{
		switchingTab(firstTab);
		csf.clickAccThree();
		System.out.println("Accordion Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccThree();
		System.out.println("Accordion Three successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAccFour() throws Exception{
		switchingTab(firstTab);
		csf.clickAccFour();
		System.out.println("Accordion Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccFour();
		System.out.println("Accordion Four successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAccFive() throws Exception{
		switchingTab(firstTab);
		csf.clickAccFive();
		System.out.println("Accordion Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccFive();
		System.out.println("Accordion Five successfully verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyAccSix() throws Exception{
		switchingTab(firstTab);
		csf.clickAccSix();
		System.out.println("Accordion Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccSix();
		System.out.println("Accordion Six successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyAccSeven() throws Exception{
		switchingTab(firstTab);
		csf.clickAccSeven();
		System.out.println("Accordion Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccSeven();
		System.out.println("Accordion Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyAccEight() throws Exception{
		switchingTab(firstTab);
		csf.clickAccEight();
		System.out.println("Accordion Eight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccEight();
		System.out.println("Accordion Eight successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyAccNine() throws Exception{
		switchingTab(firstTab);
		csf.clickAccNine();
		System.out.println("Accordion Nine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccNine();
		System.out.println("Accordion Nine successfully verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyAccTen() throws Exception{
		switchingTab(firstTab);
		csf.clickAccTen();
		System.out.println("Accordion Ten successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccTen();
		System.out.println("Accordion Ten successfully verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyAccEleven() throws Exception{
		switchingTab(firstTab);
		csf.clickAccEleven();
		System.out.println("Accordion Eleven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccEleven();
		System.out.println("Accordion Eleven successfully verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyAccTweleve() throws Exception{
		switchingTab(firstTab);
		csf.clickAccTweleve();
		System.out.println("Accordion Tweleve successfully verified in the Preprod URL");
		switchingTab(secondTab);
		csf.clickAccTweleve();
		System.out.println("Accordion Tweleve successfully verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifyReliefProductsOne() throws Exception{
		switchingTab(firstTab);
		csf.clickReliefProductsOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickReliefProductsOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyReliefProductsTwo() throws Exception{
		switchingTab(firstTab);
		csf.clickReliefProductsTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickReliefProductsTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyReliefProductsThree() throws Exception{
		switchingTab(firstTab);
		csf.clickReliefProductsThree();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickReliefProductsThree();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsThree: "+compareTwoText);
	}
	
	@Test(priority = 21)
	private void verifyReliefProductsFour() throws Exception{
		switchingTab(firstTab);
		csf.clickReliefProductsFour();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickReliefProductsFour();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFour: "+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyReliefProductsFive() throws Exception{
		switchingTab(firstTab);
		csf.clickReliefProductsFive();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		csf.clickReliefProductsFive();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for ReliefProductsFive: "+compareTwoText);
	}
	
	
	

}
