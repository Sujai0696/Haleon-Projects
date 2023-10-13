package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaWhatAntiviralColdSoreMedicationIsRightForMePage;
import com.qa.baseClass.BaseClass;

public class AbrevaWhatAntiviralColdSoreMedicationIsRightForMeTest extends BaseClass{
	
	AbrevaWhatAntiviralColdSoreMedicationIsRightForMePage rfm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		rfm = new AbrevaWhatAntiviralColdSoreMedicationIsRightForMePage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whatAntiviralColdSoreMedicationIsRightForMePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whatAntiviralColdSoreMedicationIsRightForMeLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		rfm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		rfm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerLinkOne() throws Exception{
		switchingTab(firstTab);
		rfm.clickBannerLinkOne();
		System.out.println("Banner Link One is selected in the PreProd URL");
		switchingTab(secondTab);
		rfm.clickBannerLinkOne();
		System.out.println("Banner Link One is selected in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyBannerLinkTwo() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkTwo();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkTwo();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Two: "+compareTwoText);
//	}
//	
//	@Test(priority = 2)
//	private void verifyBannerLinkThree() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkThree();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkThree();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Three: "+compareTwoText);
//	}
//	
//	@Test(priority = 3)
//	private void verifyBannerLinkFour() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkFour();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkFour();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Four: "+compareTwoText);
//	}
//	
//	@Test(priority = 4)
//	private void verifyBannerLinkFive() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkFive();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkFive();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Five: "+compareTwoText);
//	}
//	
//	@Test(priority = 5)
//	private void verifyBannerLinkSix() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkSix();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkSix();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Six: "+compareTwoText);
//	}
//	
//	@Test(priority = 6)
//	private void verifyBannerLinkSeven() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBannerLinkSeven();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBannerLinkSeven();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Banner Link Seven: "+compareTwoText);
//	}
//	
//	@Test(priority = 7)
//	private void verifyBreadcrumbOne() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBreadcrumbOne();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickBreadcrumbOne();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
//	}
//	
//	
//	@Test(priority = 8)
//	private void verifyHyperLinkAbreva() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickHyperLinkAbreva();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickHyperLinkAbreva();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva: "+compareTwoText);
//	}
//	
//	@Test(priority = 9)
//	private void verifyHyperLinkColdSoreMedications() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickHyperLinkColdSoreMedications();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickHyperLinkColdSoreMedications();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore Medications: "+compareTwoText);
//	}
//	
//	@Test(priority = 10)
//	private void verifyHyperLinkHealOnTheirOwn() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickHyperLinkHealOnTheirOwn();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickHyperLinkHealOnTheirOwn();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Heal On Their Own: "+compareTwoText);
//	}
//	
//	@Test(priority = 11)
//	private void verifyHyperLinkConsultYourDoctor() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickHyperLinkConsultYourDoctor();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickHyperLinkConsultYourDoctor();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Consult Your Doctor: "+compareTwoText);
//	}
//	
//	@Test(priority = 12)
//	private void verifyReadOurLipCareTips() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickReadOurLipCareTips();
//		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//		switchingTab(secondTab);
//		rfm.clickReadOurLipCareTips();
//		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Read Our Lip Care Tips: "+compareTwoText);
//	}
//	
//	
//	@Test(priority = 13)
//	private void verifyBuyNow() throws Exception{
//		switchingTab(firstTab);
//		rfm.clickBuyNow();
//		System.out.println("Buy Now Button verified in the preprod URL");
//		switchingTab(secondTab);
//		rfm.clickBuyNow();
//		System.out.println("Buy Now Button verified in the Live URL");
//	}
	
	

}
