package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaMedicinaliPage;

public class RinazinaMedicinaliTest extends BaseClass{
	
	RinazinaMedicinaliPage mp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("medicinaliPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("medicinaliLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		mp = new RinazinaMedicinaliPage();
		switchingTab(firstTab);
		mp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		mp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		mp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		mp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		mp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the preprod URL");
		switchingTab(secondTab);
		mp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyBannerProductLink() throws Exception{
		switchingTab(firstTab);
		mp.clickBannerProductLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickBannerProductLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Banner Product Link :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyNasoChiusoProductOne() throws Exception{
		switchingTab(firstTab);
		mp.clickNasoChiusoProductOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickNasoChiusoProductOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Naso Chiuso Product One :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyNasoChiusoProductTwo() throws Exception{
		switchingTab(firstTab);
		mp.clickNasoChiusoProductTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickNasoChiusoProductTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Naso Chiuso Product Two :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyNasoChiusoProductThree() throws Exception{
		switchingTab(firstTab);
		mp.clickNasoChiusoProductThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickNasoChiusoProductThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Naso Chiuso Product Three :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyAntiallergicaProduct() throws Exception{
		switchingTab(firstTab);
		mp.clickAntiallergicaProduct();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickAntiallergicaProduct();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Antiallergica Product :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticoliCorrelatiOne() throws Exception{
		switchingTab(firstTab);
		mp.clickArticoliCorrelatiOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickArticoliCorrelatiOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Articoli Correlati One :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticoliCorrelatiTwo() throws Exception{
		switchingTab(firstTab);
		mp.clickArticoliCorrelatiTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickArticoliCorrelatiTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Articoli Correlati Two :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticoliCorrelatiThree() throws Exception{
		switchingTab(firstTab);
		mp.clickArticoliCorrelatiThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickArticoliCorrelatiThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Articoli Correlati Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticoliCorrelatiFour() throws Exception{
		switchingTab(firstTab);
		mp.clickArticoliCorrelatiFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		mp.clickArticoliCorrelatiFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Articoli Correlati Four :"+compareTwoText);
	}
	
	
	

}
