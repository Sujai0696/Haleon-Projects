package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephHemorrhoidSymptomsPage;

public class PrephHemorrhoidSymptomsTest extends BaseClass{
	
	PrephHemorrhoidSymptomsPage hs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hs = new PrephHemorrhoidSymptomsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidSymptomsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidSymptomsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hs.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hs.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Live URL");
		switchingTab(secondTab);
		hs.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Preprod URL");
	}

	
	@Test(priority = 4)
	private void verifyHyperLinkInrernalOrExternal() throws Exception{
		switchingTab(firstTab);
		hs.clickHyperLinkInrernalOrExternal();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickHyperLinkInrernalOrExternal();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkInrernalOrExternal: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkTheEmotionalToll() throws Exception{
		switchingTab(firstTab);
		hs.clickHyperLinkTheEmotionalToll();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickHyperLinkTheEmotionalToll();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkTheEmotionalToll: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		hs.clickRelatedArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hs.clickRelatedArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreThree: "+compareTwoText);
	}

}
