package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaCongestioneNasalePresistentePage;

public class RinazinaCongestioneNasalePresistenteTest extends BaseClass{
	
	RinazinaCongestioneNasalePresistentePage cnp;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("congestioneNasalePersistentePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("congestioneNasalePersistenteLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		cnp = new RinazinaCongestioneNasalePresistentePage();
		switchingTab(firstTab);
		cnp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		cnp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		cnp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		cnp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		cnp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the preprod URL");
		switchingTab(secondTab);
		cnp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyNasoChiusoLink() throws Exception{
		switchingTab(firstTab);
		cnp.clickNasoChiusoLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickNasoChiusoLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Naso Chiuso Link :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyPerSapereneDiLink() throws Exception{
		switchingTab(firstTab);
		cnp.clickPerSapereneDiLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickPerSapereneDiLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Per Saperene Di Link :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		cnp.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		cnp.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		cnp.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleFour() throws Exception{
		switchingTab(firstTab);
		cnp.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		cnp.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}

}
