package com.qa.theraflu.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.theraflu.pages.TherafluComboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupPage;

public class TherafluComboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupTest extends BaseClass{
	
	TherafluComboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupPage bfs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		bfs = new TherafluComboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupPage();
		switchingTab(firstTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("comboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("theraflu_Config.properties").getProperty("comboDayNighttimeSevereColdReliefBerryBurstFlavorSyrupLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		bfs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		bfs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		bfs.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		bfs.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		bfs.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in PreProd URL");
		switchingTab(secondTab);
		bfs.clickBreadcrumbThree();
		System.out.println("Breadcrumb Three verified successfully in Live URL");
	}
	
	
	@Test(priority = 4)
	private void verifyWriteReview() throws Exception{
		switchingTab(firstTab);
		bfs.clickWriteReview();
		System.out.println("Write Review verified successfully in PreProd URL");
		switchingTab(secondTab);
		bfs.clickWriteReview();
		System.out.println("Write Review verified successfully in Live URL");
	}
	
	@Test(priority = 5)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		bfs.clickBuyNow();
		System.out.println("BuyNow verified successfully in PreProd URL");
		switchingTab(secondTab);
		bfs.clickBuyNow();
		System.out.println("BuyNow verified successfully in Live URL");
	}
	
	
	@Test(priority = 7)
	private void verifyImgCarousel() throws Exception{
		switchingTab(firstTab);
		bfs.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in PreProd URL");
		switchingTab(secondTab);
		bfs.clickImgCarousel();
		System.out.println("ImgCarousel verified successfully in Live URL");
	}
	
	@Test(priority = 8)
	private void verifyAllAcc() throws Exception{
		switchingTab(firstTab);
		bfs.clickAllAcc();
		System.out.println("AllAcc verified successfully in PreProd URL");
		switchingTab(secondTab);
		bfs.clickAllAcc();
		System.out.println("AllAcc verified successfully in Live URL");
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		bfs.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleOne: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		bfs.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for RelatedArticleTwo: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyFeaturedProductsOne() throws Exception{
		switchingTab(firstTab);
		bfs.clickFeaturedProductsOne();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickFeaturedProductsOne();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsOne: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedProductsTwo() throws Exception{
		switchingTab(firstTab);
		bfs.clickFeaturedProductsTwo();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickFeaturedProductsTwo();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsTwo: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedProductsThree() throws Exception{
		switchingTab(firstTab);
		bfs.clickFeaturedProductsThree();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickFeaturedProductsThree();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsThree: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyFeaturedProductsFour() throws Exception{
		switchingTab(firstTab);
		bfs.clickFeaturedProductsFour();
		String preProdUrl = compareUrl(excelRead("Theraflu_US", 1, 0));
		switchingTab(secondTab);
		bfs.clickFeaturedProductsFour();
		String liveUrl = compareUrl(excelRead("Theraflu_US", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FeaturedProductsFour: "+compareTwoText);
	}

}
