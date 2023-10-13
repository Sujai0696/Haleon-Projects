package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaCreamPage;


public class AbrevaCreamTest extends BaseClass{
	
	AbrevaCreamPage ah;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ah=new AbrevaCreamPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaCreamUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaCreamUrl"));
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
		public void verifyAbrevaproductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaproducts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaproducts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Products:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyAbrevaCreameworksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaCreamWorks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaCreamWorks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Creame works:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyUseAbrevaCreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonUseAbrevaCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonUseAbrevaCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Use Abreva Creame :"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyAbrevaReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Use Abreva Reviews :"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyDealingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonDealingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonDealingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Use Dealing cold sores :"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyCausescoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonCausesColdSores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonCausesColdSores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Use Causes cold sores :"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyHowTheyspreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonHowtheyspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonHowtheyspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How they spread :"+compareTwoText);
		}					
	 @Test(priority=8,enabled=true)
		public void verifyBestwaytreatthemLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBestwaytreatthem();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonBestwaytreatthem();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Bestway treat them :"+compareTwoText);
		}	
	 @Test(priority=9,enabled=true)
		public void verifyArrow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonArrow1();;
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonArrow1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Arrow1 Displayed :"+compareTwoText);
		}
	 @Test(priority=10,enabled=true)
		public void verifyArrow2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonArrow2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonArrow2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Arrow2 Displayed :"+compareTwoText);
		}
	 
	 @Test(priority=11,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuynow();
	        System.out.println("Verified BuyNow is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonBuynow();
	       System.out.println("Verified BuyNow is Displayed on Live Url");
		}				
	 @Test(priority=12,enabled=true)
		public void verifyWriteReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonWriteReview();
	        System.out.println("Verified Write Review is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonWriteReview();
	       System.out.println("Verified Write Review is Displayed on Live Url");
		}				
	 @Test(priority=13,enabled=true)
		public void verifyAbrevaCreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaCreame();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaCreame();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Creame :"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyNaturalRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonNaturalRemedies();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonNaturalRemedies();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Natural Remedies :"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyDiffcoldsorePimpleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonDiffColdsorePimple();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonDiffColdsorePimple();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diff Cold Sore Pimples :"+compareTwoText);
		}				
	 @Test(priority=16,enabled=true)
		public void verifyConcealColdSoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonConcealColdsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonConcealColdsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ConsealColdSore :"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyBuyAbrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuyAbreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonBuyAbreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BuyAbreva :"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyAbrevaCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonAbrevaCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonAbrevaCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Coupons:"+compareTwoText);
		}				
	 @Test(priority=19,enabled=true)
		public void verifyUsingAbrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonUsingAbrevaCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonUsingAbrevaCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forUsing AbrevaCream:"+compareTwoText);
		}				
	 @Test(priority=20,enabled=true)
		public void verifyReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reviews:"+compareTwoText);
		}				
	 @Test(priority=21,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonContactUs();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonContactUs();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ContactUs:"+compareTwoText);
		}				
	 @Test(priority=22,enabled=true)
		public void verifyHowitWorksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonHowitWorks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonHowitWorks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HowitWorks:"+compareTwoText);
		}				
	 @Test(priority=23,enabled=true)
		public void verifyHowtouseitLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonHowtouseit();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonHowtouseit();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How to Use It:"+compareTwoText);
		}				
	 @Test(priority=24,enabled=true)
		public void verifyReviewArticleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonReviewArticle();;
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonReviewArticle();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review Article:"+compareTwoText);
		}				
	 @Test(priority=25,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ah.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get Coupons:"+compareTwoText);
		}				
	 @Test(priority=26,enabled=true)
		public void verifyBuyNowArticleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ah.clickonBuynowArticle();
	        System.out.println("Verified BuyNow Article is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ah.clickonBuynowArticle();
	       System.out.println("Verified BuyNow Article is Displayed on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
