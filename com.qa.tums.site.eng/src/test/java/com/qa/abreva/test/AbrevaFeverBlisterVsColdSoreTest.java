package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaFeverBlisterVsColdSorePage;
import com.qa.baseClass.BaseClass;

public class AbrevaFeverBlisterVsColdSoreTest extends BaseClass{
	
	
	AbrevaFeverBlisterVsColdSorePage fbcs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fbcs = new AbrevaFeverBlisterVsColdSorePage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("feverBlisterVsColdSorePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("feverBlisterVsColdSoreLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		fbcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		fbcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	

	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		fbcs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkColdSore() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkColdSore();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkColdSore();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkLipCareTips() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkFeverBlistersAreHighlyContagious() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkFeverBlistersAreHighlyContagious();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkFeverBlistersAreHighlyContagious();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Fever Blisters Ar eHighly Contagious: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkFirstExperiencingTheTingling() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkFirstExperiencingTheTingling();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkFirstExperiencingTheTingling();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink First Experiencing The Tingling: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkAbrevaCreamOne() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkAbrevaCreamOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkAbrevaCreamOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream One: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkAbrevaCreamTwo() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkAbrevaCreamTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkAbrevaCreamTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream Two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkTriggerSuchAsAColdOrFlu() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkTriggerSuchAsAColdOrFlu();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkTriggerSuchAsAColdOrFlu();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Trigger Such As A Cold Or Flu: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkExcessiveSunshine() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkExcessiveSunshine();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkExcessiveSunshine();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Excessive Sunshine: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkColdWeather() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkColdWeather();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkColdWeather();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Weather: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkStress() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkStress();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkStress();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Stress: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyHyperLinkGettingPlentyOfRest() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkGettingPlentyOfRest();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkGettingPlentyOfRest();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Getting Plenty Of Rest: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyHyperLinkManagingColdSoreTriggers() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkManagingColdSoreTriggers();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkManagingColdSoreTriggers();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink ManagingColdSoreTriggers: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyHyperLinkTreatTheBlister() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkTreatTheBlister();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkTreatTheBlister();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Treat The Blister: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyHyperLinkAbrevaCreamThree() throws Exception{
		switchingTab(firstTab);
		fbcs.clickHyperLinkAbrevaCreamThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickHyperLinkAbrevaCreamThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cream Three: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyWholeCardSecOne() throws Exception{
		switchingTab(firstTab);
		fbcs.clickWholeCardSecOne();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickWholeCardSecOne();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink whole Card Sec One: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyWholeCardSecTwo() throws Exception{
		switchingTab(firstTab);
		fbcs.clickWholeCardSecTwo();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickWholeCardSecTwo();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Two: "+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifyWholeCardSecThree() throws Exception{
		switchingTab(firstTab);
		fbcs.clickWholeCardSecThree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickWholeCardSecThree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Whole Card Sec Three: "+compareTwoText);
	}
	
	@Test(priority = 19)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		fbcs.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		fbcs.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	@Test(priority = 20)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		fbcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		fbcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	

}
