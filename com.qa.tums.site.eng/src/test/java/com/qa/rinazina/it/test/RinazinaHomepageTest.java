package com.qa.rinazina.it.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaHomepagePage;

public class RinazinaHomepageTest extends BaseClass{
	
	RinazinaHomepagePage hp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("rinazinaHomepagePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("rinazinaHomepageLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		hp = new RinazinaHomepagePage();
		switchingTab(firstTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyCarouselTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickCarouselTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickCarouselTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for carousel Product Two :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyCarouselThree() throws Exception{
		switchingTab(firstTab);
		hp.clickCarouselThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickCarouselThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for carousel Product Three :"+compareTwoText);
	}
	
//	@Test(priority = 3)
//	private void verifyCarouselOne() throws Exception{
//		switchingTab(firstTab);
//		hp.clickCarouselOne();
//		System.out.println("Carousel One is successfully verified in the Preprod URL");
//		switchingTab(secondTab);
//		hp.clickCarouselOne();
//		System.out.println("Carousel One is successfully verified in the Live URL");
//	}
	
	@Test(priority = 4)
	private void verifyTravoLink() throws Exception{
		switchingTab(firstTab);
		hp.clickTravoLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickTravoLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Travo Link:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyMedicinaliLink() throws Exception{
		switchingTab(firstTab);
		hp.clickMedicinaliLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickMedicinaliLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Medicinali Link:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProdottiSenzaMedicinaliLink() throws Exception{
		switchingTab(firstTab);
		hp.clickProdottiSenzaMedicinaliLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickProdottiSenzaMedicinaliLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Prodotti Senza Medicinali Link:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleLinkOne() throws Exception{
		switchingTab(firstTab);
		hp.clickArticleLinkOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickArticleLinkOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleLinkTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickArticleLinkTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickArticleLinkTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleLinkThree() throws Exception{
		switchingTab(firstTab);
		hp.clickArticleLinkThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickArticleLinkThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleLinkFour() throws Exception{
		switchingTab(firstTab);
		hp.clickArticleLinkFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		hp.clickArticleLinkFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	

}
