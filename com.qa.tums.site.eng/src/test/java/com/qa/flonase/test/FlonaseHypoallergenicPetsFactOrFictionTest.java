package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseHypoallergenicPetsFactOrFictionPage;

public class FlonaseHypoallergenicPetsFactOrFictionTest extends BaseClass{
	
	FlonaseHypoallergenicPetsFactOrFictionPage ff;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ff = new FlonaseHypoallergenicPetsFactOrFictionPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("hypoallergenicPetsFactOrFictionPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty("hypoallergenicPetsFactOrFictionLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ff.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ff.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	
	@Test(priority = 6)
	private void verifyHyperLinkOne() throws Exception{
		switchingTab(firstTab);
		ff.clickHyperLinkOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		ff.clickHyperLinkOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkOne: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyTagsLinksOne() throws Exception{
		switchingTab(firstTab);
		ff.clickTagsLinksOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		ff.clickTagsLinksOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksOne: "+compareTwoText);
	}
	
	
	@Test(priority = 12)
	private void verifyTagsLinksTwo() throws Exception{
		switchingTab(firstTab);
		ff.clickTagsLinksTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		ff.clickTagsLinksTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksTwo: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		ff.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		ff.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}

}
