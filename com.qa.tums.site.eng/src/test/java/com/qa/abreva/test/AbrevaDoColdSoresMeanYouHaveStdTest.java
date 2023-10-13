package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaDoColdSoresMeanYouHaveStdPage;
import com.qa.baseClass.BaseClass;

public class AbrevaDoColdSoresMeanYouHaveStdTest extends BaseClass{
	
	
	AbrevaDoColdSoresMeanYouHaveStdPage dcsm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dcsm = new AbrevaDoColdSoresMeanYouHaveStdPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("doColdSoresMeanYouHaveStdPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("doColdSoresMeanYouHaveStdLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dcsm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dcsm.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		dcsm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkHsvVirus() throws Exception{
		switchingTab(firstTab);
		dcsm.clickHyperLinkHsvVirus();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickHyperLinkHsvVirus();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink HsvVirus: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkFeverBlisters() throws Exception{
		switchingTab(firstTab);
		dcsm.clickHyperLinkFeverBlisters();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickHyperLinkFeverBlisters();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink FeverBlisters: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkManagingLipHealth() throws Exception{
		switchingTab(firstTab);
		dcsm.clickHyperLinkManagingLipHealth();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickHyperLinkManagingLipHealth();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink ManagingLipHealth: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkStressAndColdSores() throws Exception{
		switchingTab(firstTab);
		dcsm.clickHyperLinkStressAndColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickHyperLinkStressAndColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink StressAndColdSores: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkAbrevaProducts() throws Exception{
		switchingTab(firstTab);
		dcsm.clickHyperLinkAbrevaProducts();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickHyperLinkAbrevaProducts();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink AbrevaProducts: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		dcsm.clickReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		dcsm.clickReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		dcsm.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		dcsm.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
