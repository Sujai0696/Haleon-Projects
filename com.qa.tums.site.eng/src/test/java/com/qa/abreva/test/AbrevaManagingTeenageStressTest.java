package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaManagingTeenageStressPage;
import com.qa.baseClass.BaseClass;

public class AbrevaManagingTeenageStressTest extends BaseClass{
	
	AbrevaManagingTeenageStressPage mts;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		mts = new AbrevaManagingTeenageStressPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("managingTeenageStressPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("managingTeenageStressLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		mts.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		mts.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		mts.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdSores() throws Exception{
		switchingTab(firstTab);
		mts.clickHyperLinkColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickHyperLinkColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkWaysToRelax() throws Exception{
		switchingTab(firstTab);
		mts.clickHyperLinkWaysToRelax();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickHyperLinkWaysToRelax();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Ways To Relax: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkRegularExercise() throws Exception{
		switchingTab(firstTab);
		mts.clickHyperLinkRegularExercise();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickHyperLinkRegularExercise();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Regular Exercise: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkAbrevaColdSoreCream() throws Exception{
		switchingTab(firstTab);
		mts.clickHyperLinkAbrevaColdSoreCream();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickHyperLinkAbrevaColdSoreCream();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cold Sore Cream: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkSleep() throws Exception{
		switchingTab(firstTab);
		mts.clickHyperLinkSleep();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickHyperLinkSleep();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sleep: "+compareTwoText);
	}
	
	
	
	@Test(priority = 7)
	private void verifyReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		mts.clickReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		mts.clickReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read Our Lip Care Tips: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		mts.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		mts.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
