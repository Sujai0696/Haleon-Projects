package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevahowtouseAbrevacreamPage;

public class AbrevahowtouseAbrevacreamTest extends BaseClass{
	
	AbrevahowtouseAbrevacreamPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevahowtouseAbrevacreamPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaHowtouseAbrevaCreamUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaHowtouseAbrevaCreamUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyAbrevacookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCookieBtn();
	        System.out.println("Verify Abreva Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyAbrevaproductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaproducts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaproducts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Products:"+compareTwoText);
		}							
	 @Test(priority=2,enabled=true)
		public void verifyhowabrevaworksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonHowabrevaworks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonHowabrevaworks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HowAbrevaWorks:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyUseAbrevacreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonUseAbrevaCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonUseAbrevaCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UseAbrevacream:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyAbrevaReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaReview();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaReview();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Reviews:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyCarousel_bannerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCarousel1();
	       
	        System.out.println("Verified Carousel displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCarousel1();
	        
	        System.out.println("Verified Carousel displayed successfully on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCarouse2_bannerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCarousel2();
	       
	        System.out.println("Verified Carousel displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCarousel2();
	        
	        System.out.println("Verified Carousel displayed successfully on Live Url");
		}			
	
	 @Test(priority=7,enabled=true)
		public void verifyCarouse3_bannerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCarousel3();
	       
	        System.out.println("Verified Carousel displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCarousel3();
	        
	        System.out.println("Verified Carousel displayed successfully on Live Url");
		}		
	 
	 @Test(priority=8,enabled=true)
		public void verifyCarouse4_bannerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonCarousel4();
	       
	        System.out.println("Verified Carousel displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonCarousel4();
	        
	        System.out.println("Verified Carousel displayed successfully on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyAbrevaCream1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCreame1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCreame1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Cream1:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyDealingColdsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing coldsores:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifySpreadingInfectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSpreadinginfection();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSpreadinginfection();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Spreading Infection:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyAbrevacream2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevacream2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevacream2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva cream2:"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifyTreatcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontreatcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontreatcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Treat cold sores:"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyTreatmentcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontreatmentcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontreatmentcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Treatment cold sores:"+compareTwoText);
		}			
	 @Test(priority=15,enabled=true)
		public void verifyAbrevacream3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevacream3();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevacream3();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva cream3:"+compareTwoText);
		}			
	 @Test(priority=16,enabled=true)
		public void verifyBuyAbrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyAbreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonBuyAbreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Buy Abreva:"+compareTwoText);
		}			
	 @Test(priority=17,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get Coupons:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
