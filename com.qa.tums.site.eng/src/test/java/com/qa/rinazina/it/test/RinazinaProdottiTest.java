package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaProdottiPage;

public class RinazinaProdottiTest extends BaseClass{
	
	RinazinaProdottiPage pp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("prodottiPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("prodottiLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		pp = new RinazinaProdottiPage();
		switchingTab(firstTab);
		pp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		pp.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		pp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickBreadcrumbTwo();
		System.out.println("Breadcrumb Two is successfully verified in the preprod URL");
		switchingTab(secondTab);
		pp.clickBreadcrumbTwo();
		System.out.println("Breadcrumb Two is successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyMedicinaliProductOne() throws Exception{
		switchingTab(firstTab);
		pp.clickMedicinaliProductOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickMedicinaliProductOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Medicinali ProductOne :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyMedicinaliProductTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickMedicinaliProductTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickMedicinaliProductTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Medicinali ProductTwo :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyMedicinaliProductThree() throws Exception{
		switchingTab(firstTab);
		pp.clickMedicinaliProductThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickMedicinaliProductThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Medicinali ProductThree :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyMedicinaliProductFour() throws Exception{
		switchingTab(firstTab);
		pp.clickMedicinaliProductFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickMedicinaliProductFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Medicinali ProductFour :"+compareTwoText);
	}
	
	
	@Test(priority = 7)
	private void verifyFindOutMoreOne() throws Exception{
		switchingTab(firstTab);
		pp.clickFindOutMoreOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickFindOutMoreOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out More One :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyProdottiSenzaProductOne() throws Exception{
		switchingTab(firstTab);
		pp.clickProdottiSenzaProductOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickProdottiSenzaProductOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Prodotti Senza Product One :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyProdottiSenzaProductTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickProdottiSenzaProductTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickProdottiSenzaProductTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Prodotti Senza Product Two :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyProdottiSenzaProductThree() throws Exception{
		switchingTab(firstTab);
		pp.clickProdottiSenzaProductThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickProdottiSenzaProductThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Prodotti Senza Product Three :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyFindOutMoreTwo() throws Exception{
		switchingTab(firstTab);
		pp.clickFindOutMoreTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		pp.clickFindOutMoreTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out More Two :"+compareTwoText);
	}
	
	

}
