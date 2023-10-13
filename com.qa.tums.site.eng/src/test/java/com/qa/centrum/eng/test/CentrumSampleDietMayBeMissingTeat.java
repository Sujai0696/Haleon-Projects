package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.CentrumDietMayBeMissingPage;

public class CentrumSampleDietMayBeMissingTeat extends BaseClass{
	
	CentrumDietMayBeMissingPage dm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/articles/food-and-nutrition/what-your-diet-may-be-missing/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/articles/food-and-nutrition/what-your-diet-may-be-missing/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		dm = new CentrumDietMayBeMissingPage();
		switchingTab(firstTab);
		dm.clickCookieBtn();
		dm.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the preprod URL");
		switchingTab(secondTab);
		dm.clickCookieBtn();
		dm.clickGigyaForm();
		System.out.println("Cookie Pop-up and Gigya form verified in the live URL");
	}
	
	@Test(priority = 1)
	private void verifyVitaminCImmuneSupport() throws Exception {
		switchingTab(firstTab);
		dm.clickVitaminCImmuneSupport();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickVitaminCImmuneSupport();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vitamin C Immune Support :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyVitaminCAntioxidantAbilities() throws Exception {
		switchingTab(firstTab);
		dm.clickVitaminCAntioxidantAbilities();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickVitaminCAntioxidantAbilities();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vitamin C Antioxidant Abilities :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyVitaminDLinkOne() throws Exception {
		switchingTab(firstTab);
		dm.clickVitaminDLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickVitaminDLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vitamin D Link One :"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyVitaminDLinkTwo() throws Exception {
		switchingTab(firstTab);
		dm.clickVitaminDLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickVitaminDLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vitamin D Link Two :"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyVitaminELinkVerifyImmuneFunction() throws Exception {
		switchingTab(firstTab);
		dm.clickVitaminELinkImmuneFunction();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickVitaminELinkImmuneFunction();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Immune Function :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyMagnesiumBalancedDiet() throws Exception {
		switchingTab(firstTab);
		dm.clickMagnesiumLinkBalancedDiet();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickMagnesiumLinkBalancedDiet();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Magnesium Balanced Diet:"+compareTwoText);
	}
	
	
	@Test(priority = 7)
    private void verifyShowReference() throws Exception {
        switchingTab(firstTab);
        dm.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the PREPROD URL");
        switchingTab(secondTab);
        dm.clickShowReference();
        System.out.println("Show Refrence and Hide reference verified in the LIVE URL");
    }
	
	
	@Test(priority = 8)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		dm.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		dm.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		dm.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		dm.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		dm.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		dm.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		dm.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyBreadcrumbFour() throws Exception {
		switchingTab(firstTab);
		dm.clickBreadcrumbFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadcrumbFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Four :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBreadcrumbFive() throws Exception {
		switchingTab(firstTab);
		dm.clickBreadcrumbFive();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		dm.clickBreadcrumbFive();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Five :"+compareTwoText);
	}
	
}
