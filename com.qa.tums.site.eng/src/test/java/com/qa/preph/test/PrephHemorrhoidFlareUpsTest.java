package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephHemorrhoidFlareUpsPage;

public class PrephHemorrhoidFlareUpsTest extends BaseClass{
	
	PrephHemorrhoidFlareUpsPage hfu;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hfu = new PrephHemorrhoidFlareUpsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidFlareUpsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidFlareUpsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hfu.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hfu.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hfu.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hfu.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hfu.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Live URL");
		switchingTab(secondTab);
		hfu.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Preprod URL");
	}

	
	@Test(priority = 4)
	private void verifyHyperLinkSymptomsOfAFlareUp() throws Exception{
		switchingTab(firstTab);
		hfu.clickHyperLinkSymptomsOfAFlareUp();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickHyperLinkSymptomsOfAFlareUp();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkSymptomsOfAFlareUp: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkPreparationHProducts() throws Exception{
		switchingTab(firstTab);
		hfu.clickHyperLinkPreparationHProducts();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickHyperLinkPreparationHProducts();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkPreparationHProducts: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkMedicatedWipes() throws Exception{
		switchingTab(firstTab);
		hfu.clickHyperLinkMedicatedWipes();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickHyperLinkMedicatedWipes();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkMedicatedWipes: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkHomeTreatments() throws Exception{
		switchingTab(firstTab);
		hfu.clickHyperLinkHomeTreatments();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickHyperLinkHomeTreatments();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkHomeTreatments: "+compareTwoText);
	}
	
	
	@Test(priority = 8)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		hfu.clickRelatedArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hfu.clickRelatedArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreThree: "+compareTwoText);
	}
	
	

}
