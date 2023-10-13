package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephEverythingYouNeedKnowAboutHemorrhoidsPage;

public class PrephEverythingYouNeedKnowAboutHemorrhoidsTest extends BaseClass{
	
	PrephEverythingYouNeedKnowAboutHemorrhoidsPage ah;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		ah = new PrephEverythingYouNeedKnowAboutHemorrhoidsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("everythingYouNeedKnowAboutHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("everythingYouNeedKnowAboutHemorrhoidsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ah.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ah.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		ah.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		ah.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		ah.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Live URL");
		switchingTab(secondTab);
		ah.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Preprod URL");
	}

	
	@Test(priority = 4)
	private void verifyHyperLinkHemorrhoids() throws Exception{
		switchingTab(firstTab);
		ah.clickHyperLinkHemorrhoids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickHyperLinkHemorrhoids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkHemorrhoids: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkGoingToTheBathroom() throws Exception{
		switchingTab(firstTab);
		ah.clickHyperLinkGoingToTheBathroom();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickHyperLinkGoingToTheBathroom();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkGoingToTheBathroom: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreThree: "+compareTwoText);
	}

}
