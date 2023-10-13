package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaHomepagePage;

public class AbrevaHomepageTest extends BaseClass{
	
	AbrevaHomepagePage ah;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ah=new AbrevaHomepagePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("liveHomepageUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyRinazinacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ah.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyAbrevaCreame1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaCreame1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaCreame1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevaCreame1:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyAbrevaCreame2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaCreame2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaCreame2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevaCreame2:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyDealingwithcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonDealingwithcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonDealingwithcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing with cold sores:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyColdsoreTreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonColdsoreTreatment();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonColdsoreTreatment();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore treatment:"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyAbrevacreame3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevacreame3();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevacreame3();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevaCreame3:"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Learnmore:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyCarousel1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonCarousel1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonCarousel1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carousel1:"+compareTwoText);
		}						
	 @Test(priority=8,enabled=true)
		public void verifyCarousel2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonCarousel2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonCarousel2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Carousel2:"+compareTwoText);
		}						
	 @Test(priority=9,enabled=true)
		public void verifyGetTouchcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonGetTouchcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonGetTouchcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetTouch Cold Sores:"+compareTwoText);
		}						
	 @Test(priority=10,enabled=true)
		public void verifyReadReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonReadReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonReadReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadReviews:"+compareTwoText);
		}						
	 @Test(priority=11,enabled=true)
		public void verifyRelatedArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonRelatedArticle1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonRelatedArticle1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article1:"+compareTwoText);
		}						
	 @Test(priority=12,enabled=true)
		public void verifyRelatedArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonRelatedArticle2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonRelatedArticle2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article2:"+compareTwoText);
		}						
	 @Test(priority=13,enabled=true)
		public void verifyRelatedArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonRelatedArticle3();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonRelatedArticle3();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related Article3:"+compareTwoText);
		}						
	 @Test(priority=14,enabled=true)
		public void verifyGetAbrevaCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonGetAbrevaCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonGetAbrevaCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get Abreva Coupons:"+compareTwoText);
		}						
	 @Test(priority=15,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuyNow();
	        System.out.println("Verified Buy Now is Displayed Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonBuyNow();
	        System.out.println("Verified Buy Now is Displayed Successfully on Live Url");
		}						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
