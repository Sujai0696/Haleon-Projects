package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaNoseColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaNoseColdSoresTest extends BaseClass{
	
	AbrevaNoseColdSoresPage ncs;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ncs = new AbrevaNoseColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("noseColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("noseColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ncs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ncs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ncs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkAbrevaCream() throws Exception{
		switchingTab(firstTab);
		ncs.clickHyperLinkAbrevaCream();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickHyperLinkAbrevaCream();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkWhatColdSoresAre() throws Exception{
		switchingTab(firstTab);
		ncs.clickHyperLinkWhatColdSoresAre();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickHyperLinkWhatColdSoresAre();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink What Cold Sores Are: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkHowToKeepYourSelfHealthy() throws Exception{
		switchingTab(firstTab);
		ncs.clickHyperLinkHowToKeepYourSelfHealthy();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickHyperLinkHowToKeepYourSelfHealthy();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink How To Keep Your Self Healthy: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkHowToDealWithColdSores() throws Exception{
		switchingTab(firstTab);
		ncs.clickHyperLinkHowToDealWithColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickHyperLinkHowToDealWithColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink How To Deal With Cold Sores: "+compareTwoText);
	}
	
	
	@Test(priority = 6)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		ncs.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ncs.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		ncs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		ncs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	
	

}
