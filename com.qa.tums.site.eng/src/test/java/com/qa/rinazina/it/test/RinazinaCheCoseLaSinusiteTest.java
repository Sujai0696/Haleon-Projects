package com.qa.rinazina.it.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.rinazina.it.pages.RinazinaCheCoseLaSinusitePage;

public class RinazinaCheCoseLaSinusiteTest extends BaseClass{
	
	RinazinaCheCoseLaSinusitePage ls;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("rinazina_itConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("cheCoseLaSinusitePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("rinazina_itConfig.properties").getProperty("cheCoseLaSinusiteLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		ls = new RinazinaCheCoseLaSinusitePage();
		switchingTab(firstTab);
		ls.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ls.clickCookieBtn();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ls.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ls.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ls.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the preprod URL");
		switchingTab(secondTab);
		ls.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is successfully verified in the Live URL");
	}

	@Test(priority = 4)
	private void verifySprayDecongestionanteLink() throws Exception{
		switchingTab(firstTab);
		ls.clickSprayDecongestionanteLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickSprayDecongestionanteLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Spray Decongestionante Link :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyPerSaperneDiLink() throws Exception{
		switchingTab(firstTab);
		ls.clickPerSaperneDiLink();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickPerSaperneDiLink();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Per Saperne Di Link :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyArticleOne() throws Exception{
		switchingTab(firstTab);
		ls.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyArticleTwo() throws Exception{
		switchingTab(firstTab);
		ls.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyArticleThree() throws Exception{
		switchingTab(firstTab);
		ls.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleFour() throws Exception{
		switchingTab(firstTab);
		ls.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Rinazina_it", 1, 0));
		switchingTab(secondTab);
		ls.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Rinazina_it", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
}
