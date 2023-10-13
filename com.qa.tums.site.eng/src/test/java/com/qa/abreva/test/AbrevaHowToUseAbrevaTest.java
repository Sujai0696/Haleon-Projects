package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaHowToUseAbrevaPage;
import com.qa.baseClass.BaseClass;

public class AbrevaHowToUseAbrevaTest extends BaseClass{
	
	AbrevaHowToUseAbrevaPage htua;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		htua = new AbrevaHowToUseAbrevaPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("howToUseAbrevaPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("howToUseAbrevaLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		htua.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAccordionOne() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionOne();
		System.out.println("Accordion One Successfully verified in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyAccordionTwo() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionTwo();
		System.out.println("Accordion Two Successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyAccordionThree() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionThree();
		System.out.println("Accordion Three Successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyAccordionFour() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionFour();
		System.out.println("Accordion Four Successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyAccordionFive() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionFive();
		System.out.println("Accordion Five Successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyAccordionSix() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionSix();
		System.out.println("Accordion Six Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionSix();
		System.out.println("Accordion Six Successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyAccordionSeven() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionSeven();
		System.out.println("Accordion Seven Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionSeven();
		System.out.println("Accordion Seven Successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAccordionEight() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionEight();
		System.out.println("Accordion Eight Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionEight();
		System.out.println("Accordion Eight Successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAccordionNine() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionNine();
		System.out.println("Accordion Nine Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionNine();
		System.out.println("Accordion Nine Successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAccordionTen() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionTen();
		System.out.println("Accordion Ten Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionTen();
		System.out.println("Accordion Ten Successfully verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyAccordionEleven() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionEleven();
		System.out.println("Accordion Eleven Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionEleven();
		System.out.println("Accordion Eleven Successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyAccordionTweleve() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionTweleve();
		System.out.println("Accordion Tweleve Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionTweleve();
		System.out.println("Accordion Tweleve Successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyAccordionThirteen() throws Exception{
		switchingTab(firstTab);
		htua.clickAccordionThirteen();
		System.out.println("Accordion Thirteen Successfully verified in the Preprod URL");
		switchingTab(secondTab);
		htua.clickAccordionThirteen();
		System.out.println("Accordion Thirteen Successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyGetcoupon() throws Exception{
		switchingTab(firstTab);
		htua.clickGetcoupon();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		htua.clickGetcoupon();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Get coupon: "+compareTwoText);
	}
	
	
	@Test(priority =15)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		htua.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		htua.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
