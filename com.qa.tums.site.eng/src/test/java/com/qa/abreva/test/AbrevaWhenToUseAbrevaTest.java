package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.abreva.pages.AbrevaWhenToUseAbrevaPage;
import com.qa.baseClass.BaseClass;

public class AbrevaWhenToUseAbrevaTest extends BaseClass{

	
	AbrevaWhenToUseAbrevaPage wtua;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		wtua = new AbrevaWhenToUseAbrevaPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whenToUseAbrevaPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whenToUseAbrevaLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		wtua.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		wtua.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		wtua.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		wtua.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		wtua.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		wtua.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		wtua.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		wtua.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		wtua.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	
	@Test(priority = 7)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		wtua.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		wtua.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	
	
}
