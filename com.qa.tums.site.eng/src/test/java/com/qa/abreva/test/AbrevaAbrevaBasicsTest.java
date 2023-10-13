package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaAbrevaBasicsPage;
import com.qa.baseClass.BaseClass;

public class AbrevaAbrevaBasicsTest extends BaseClass{
	
	AbrevaAbrevaBasicsPage ab;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ab = new AbrevaAbrevaBasicsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("abrevaBasicsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("abrevaBasicsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ab.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAccordionSix() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionSix();
		System.out.println("Accordion Six Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionSix();
		System.out.println("Accordion Six Successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAccordionSeven() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionSeven();
		System.out.println("Accordion Seven Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionSeven();
		System.out.println("Accordion Seven Successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAccordionEight() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionEight();
		System.out.println("Accordion Eight Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionEight();
		System.out.println("Accordion Eight Successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAccordionNine() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionNine();
		System.out.println("Accordion Nine Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ab.clickAccordionNine();
		System.out.println("Accordion Nine Successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAccordionEightHyperLink() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionEightHyperLink();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ab.clickAccordionEightHyperLink();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Accordion Eight: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyAccordionNineHyperLink() throws Exception{
		switchingTab(firstTab);
		ab.clickAccordionNineHyperLink();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ab.clickAccordionNineHyperLink();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Accordion Nine: "+compareTwoText);
	}
	
	
	
	@Test(priority = 12)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		ab.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		ab.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	
	@Test(priority =13)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		ab.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		ab.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
}

