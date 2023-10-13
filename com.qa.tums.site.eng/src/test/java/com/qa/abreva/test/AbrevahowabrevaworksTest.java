package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevahowabrevaworksPage;

public class AbrevahowabrevaworksTest extends BaseClass{
	
	AbrevahowabrevaworksPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevahowabrevaworksPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevahowabrevacreamworksUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevahowabrevacreamworksUrl"));
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
		public void verifyHowAbrevaWorksLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonHowAbrevaWorks();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonHowAbrevaWorks();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How Abreva Works:"+compareTwoText);
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
	        System.out.println("Preprod URL and Live URL are same for Use Abreva Cream:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyAbrevaReviewsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReviews();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReviews();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reviews:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifySoreComingonLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonSoreComingon();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonSoreComingon();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sore Coming On:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifygetridcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickongetridcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickongetridcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get rid cold sore:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyYouTubeDisplayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonYouTube();
	        System.out.println("Verified Youtube played successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonYouTube();
	        System.out.println("Verified Youtube played successfully on Live Url");
		}				
	 @Test(priority=8,enabled=true)
		public void verifyArrow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonArrow1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonArrow1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Arrow1:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyArrow2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonArrow2();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonArrow2();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Arrow2:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get Coupons:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
