package com.qa.flonase.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.FlonaseFallCleaningPage;

public class FlonaseFallCleaningTest extends BaseClass{
	
	FlonaseFallCleaningPage fc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		fc = new FlonaseFallCleaningPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty(""));
		switchingTab(secondTab);
		launchURL(loadConfig("Flonase_Config.properties").getProperty(""));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		fc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		fc.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAllAcc() throws Exception{
		switchingTab(firstTab);
		fc.clickAllAcc();
		System.out.println("AllAcc verified successfully in PreProd URL");
		switchingTab(secondTab);
		fc.clickAllAcc();
		System.out.println("AllAcc verified successfully in Live URL");
	}
	
	@Test(priority = 2)
	private void verifyTagsLinksOne() throws Exception{
		switchingTab(firstTab);
		fc.clickTagsLinksOne();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		fc.clickTagsLinksOne();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksOne: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyTagsLinksTwo() throws Exception{
		switchingTab(firstTab);
		fc.clickTagsLinksTwo();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		fc.clickTagsLinksTwo();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for TagsLinksTwo: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBtnBuyNow() throws Exception{
		switchingTab(firstTab);
		fc.clickBtnBuyNow();
		String preProdUrl = compareUrl(excelRead("Flonase", 1, 0));
		switchingTab(secondTab);
		fc.clickBtnBuyNow();
		String liveUrl = compareUrl(excelRead("Flonase", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for BtnBuyNow: "+compareTwoText);
	}
	
	

}
