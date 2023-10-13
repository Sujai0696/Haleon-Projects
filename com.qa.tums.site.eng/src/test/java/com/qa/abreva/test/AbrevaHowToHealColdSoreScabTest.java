package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaHowToHealColdSoreScabPage;
import com.qa.baseClass.BaseClass;

public class AbrevaHowToHealColdSoreScabTest extends BaseClass{
	
	AbrevaHowToHealColdSoreScabPage hcss;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hcss = new AbrevaHowToHealColdSoreScabPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("howToHealColdSoreScabPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("howToHealColdSoreScabLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hcss.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hcss.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hcss.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdSoreOutbreak() throws Exception{
		switchingTab(firstTab);
		hcss.clickHyperLinkColdSoreOutbreak();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickHyperLinkColdSoreOutbreak();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore Out break: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkSpreadingTheColdSoreVirus() throws Exception{
		switchingTab(firstTab);
		hcss.clickHyperLinkSpreadingTheColdSoreVirus();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickHyperLinkSpreadingTheColdSoreVirus();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Spreading The Cold Sore Virus: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkDealingWithColdSores() throws Exception{
		switchingTab(firstTab);
		hcss.clickHyperLinkDealingWithColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickHyperLinkDealingWithColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Dealing With Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkManagingYourLipHealth() throws Exception{
		switchingTab(firstTab);
		hcss.clickHyperLinkManagingYourLipHealth();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickHyperLinkManagingYourLipHealth();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Managing Your Lip Health: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkCommonColdSoreQuestions() throws Exception{
		switchingTab(firstTab);
		hcss.clickHyperLinkCommonColdSoreQuestions();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickHyperLinkCommonColdSoreQuestions();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Common Cold Sore Questions: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		hcss.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		hcss.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		hcss.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		hcss.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
