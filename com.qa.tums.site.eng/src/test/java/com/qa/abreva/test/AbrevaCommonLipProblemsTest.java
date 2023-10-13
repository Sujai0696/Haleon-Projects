package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaCommonLipProblemsPage;
import com.qa.baseClass.BaseClass;

public class AbrevaCommonLipProblemsTest extends BaseClass{
	
	AbrevaCommonLipProblemsPage clp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		clp = new AbrevaCommonLipProblemsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("commonLipProblemsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("commonLipProblemsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		clp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		clp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		clp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdSores() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkFeverBlisters() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkFeverBlisters();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkFeverBlisters();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Fever Blisters: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkColdSoresCanSpread() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkColdSoresCanSpread();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkColdSoresCanSpread();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sores Can Spread: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkPersonToPersonContactLikeKissing() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkPersonToPersonContactLikeKissing();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkPersonToPersonContactLikeKissing();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Person To Person Contact Like Kissing: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkAbrevaColdSoreCream() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkAbrevaColdSoreCream();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkAbrevaColdSoreCream();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cold Sore Cream: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkDryLips() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkDryLips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkDryLips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Dry Lips: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkAvoidingExposingYourLipsToTheSun() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkAvoidingExposingYourLipsToTheSun();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkAvoidingExposingYourLipsToTheSun();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Avoiding Exposing Your Lips To The Sun: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkWinterMonths() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkWinterMonths();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkWinterMonths();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Winter Months: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkArticlesOnManagingLipHealthFromAbreva() throws Exception{
		switchingTab(firstTab);
		clp.clickHyperLinkArticlesOnManagingLipHealthFromAbreva();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickHyperLinkArticlesOnManagingLipHealthFromAbreva();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Articles On Managing Lip Health From Abreva: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		clp.clickReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		clp.clickReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		clp.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		clp.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}


}
