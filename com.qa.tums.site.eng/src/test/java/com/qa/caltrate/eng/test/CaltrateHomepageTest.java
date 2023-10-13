package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateHomepage;

public class CaltrateHomepageTest extends BaseClass{
	
	CaltrateHomepage hp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("caltrateHomepagePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("caltrateConfig.properties").getProperty("caltrateHomepageLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		hp = new CaltrateHomepage();
		switchingTab(firstTab);
		hp.clickCookieBtn();
//		hp.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
//		hp.clickGigyaForm();
		System.out.println("Cookie Button clicked successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBannerCarouselLinkOne() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerCarouselLinkOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerCarouselLinkOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner carousel Link One :"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerCarouselLinkTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerCarouselLinkTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerCarouselLinkTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner carousel Link Two :"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBannerCarouselLinkThree() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerCarouselLinkThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerCarouselLinkThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner carousel Link Three :"+compareTwoText);
	}

	
	@Test(priority = 4)
	private void verifyBannerCarouselLinkFour() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerCarouselLinkFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerCarouselLinkFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner carousel Link Four :"+compareTwoText);
	}

	
	@Test(priority = 5)
	private void verifyBannerCarouselLinkFive() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerCarouselLinkFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerCarouselLinkFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner carousel Link Five :"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyOurProductsOne() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductOne();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductOne();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product One :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyOurProductsTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductTwo();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductTwo();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product Two :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyOurProductsThree() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductThree();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductThree();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product Three :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyOurProductsFour() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductFour();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductFour();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product Four :"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyOurProductsFive() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductFive();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductFive();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product Five :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyOurProductsSix() throws Exception{
		switchingTab(firstTab);
		hp.clickOurProductSix();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickOurProductSix();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Our Product Six :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifySeeAllProducts() throws Exception{
		switchingTab(firstTab);
		hp.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for See All Products :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyLearnMore() throws Exception{
		switchingTab(firstTab);
		hp.clickLearnMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickLearnMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Learn More :"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyAllTips() throws Exception{
		switchingTab(firstTab);
		hp.clickAllTips();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickAllTips();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for All Tips :"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyViewRecipes() throws Exception{
		switchingTab(firstTab);
		hp.clickViewRecipes();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickViewRecipes();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View Recipes :"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyBoneHealthReadMore() throws Exception{
		switchingTab(firstTab);
		hp.clickBoneHealthReadMore();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickBoneHealthReadMore();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bone Health ReadMore :"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyReadArticle() throws Exception{
		switchingTab(firstTab);
		hp.clickReadArticle();
		String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
		switchingTab(secondTab);
		hp.clickReadArticle();
		String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Read Article :"+compareTwoText);
	}
	


}
