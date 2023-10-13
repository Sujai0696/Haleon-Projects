package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephCausesOfHemorrhoidsPage;

public class PrephCausesOfHemorrhoidsTest extends BaseClass{
	
	PrephCausesOfHemorrhoidsPage coh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		coh = new PrephCausesOfHemorrhoidsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("causesOfHemorrhoidsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("causesOfHemorrhoidsLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		coh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		coh.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		coh.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		coh.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		coh.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Live URL");
		switchingTab(secondTab);
		coh.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three is verified successfully in Preprod URL");
	}

	
	@Test(priority = 4)
	private void verifyHyperLinkHemorrhids() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkHemorrhids();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkHemorrhids();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkHemorrhids: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkFlareUp() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkFlareUp();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkFlareUp();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkFlareUp: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkStrainingDueToChronic() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkStrainingDueToChronic();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkStrainingDueToChronic();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkStrainingDueToChronic: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkPregnancy() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkPregnancy();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkPregnancy();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkPregnancy: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkExertingYourself() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkExertingYourself();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkExertingYourself();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkExertingYourself: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkFibrousFood() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkFibrousFood();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkFibrousFood();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkFibrousFood: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkRightProducts() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkRightProducts();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkRightProducts();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for hyperLinkRightProducts: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkHealthyLivingBlog() throws Exception{
		switchingTab(firstTab);
		coh.clickHyperLinkHealthyLivingBlog();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickHyperLinkHealthyLivingBlog();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkHealthyLivingBlog: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for : "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleThree: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyRelatedArticleReadMoreOne() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleReadMoreOne();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyRelatedArticleReadMoreTwo() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleReadMoreTwo();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleReadMoreTwo();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreTwo: "+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyRelatedArticleReadMoreThree() throws Exception{
		switchingTab(firstTab);
		coh.clickRelatedArticleReadMoreThree();
		String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
		switchingTab(secondTab);
		coh.clickRelatedArticleReadMoreThree();
		String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleReadMoreThree: "+compareTwoText);
	}
	
	
	
	
	
}
