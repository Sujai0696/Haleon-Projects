package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephHemorrhoidPainPage;

public class PrephHemorrhoidPainTest extends BaseClass{
	
	PrephHemorrhoidPainPage hp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		hp = new PrephHemorrhoidPainPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidPainPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("hemorrhoidPainLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		hp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Live URL");
		switchingTab(secondTab);
		hp.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Preprod URL");
	}

	
	@Test(priority = 4)
	private void verifyHyperLinkOinment() throws Exception{
		switchingTab(firstTab);
		hp.clickHyperLinkOinment();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickHyperLinkOinment();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkOinment: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for : "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyRelatedArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		hp.clickRelatedArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		hp.clickRelatedArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreThree: "+compareTwoText);
	}

}
