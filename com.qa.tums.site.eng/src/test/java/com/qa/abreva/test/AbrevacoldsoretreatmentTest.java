package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevacoldsoretreatmentPage;

public class AbrevacoldsoretreatmentTest extends BaseClass{
	
	AbrevacoldsoretreatmentPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevacoldsoretreatmentPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevacoldsoretreatmentUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevacoldsoretreatmentUrl"));
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
		public void verifyAboutcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAboutcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAboutcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for About Cold Sores:"+compareTwoText);
		}							
	 @Test(priority=2,enabled=true)
		public void verifyColdsoresspreadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresspread();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresspread();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores spread:"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyColdsorestriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorestriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorestriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores triggers:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyColdsorestreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsorestreatment();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsorestreatment();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sores treatment:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyColdsoresMythsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresmyths();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresmyths();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold soresMyth:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyTakecarelipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontakecarelips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontakecarelips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Take care lips:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyColdsorepimplesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickoncoldsorevspimple();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickoncoldsorevspimple();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore vs pimple:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifytypescoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontypesofcoldsoresmedicine();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontypesofcoldsoresmedicine();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Typescoldsores medicine:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyColdsoresTeensLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoresteens();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoresteens();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sores Teens:"+compareTwoText);
		}				
	 @Test(priority=10,enabled=true)
		public void verifyAbrevaCreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCream();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCream();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Creame:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyManageColdsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManagecoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManagecoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Manage cold sore:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyAvoidspreadingvirusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAvoidspreadingvirus();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAvoidspreadingvirus();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Avoid spreading virus:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifyLimitActivitesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlimitActivites();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlimitActivites();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Limit Activites:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyApplyAbrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonApplyAbreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonApplyAbreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Apply Activites:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
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
	 @Test(priority=16,enabled=true)
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
	 @Test(priority=17,enabled=true)
		public void verifyBlisterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBlister();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonBlister();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Blister:"+compareTwoText);
		}				
	 @Test(priority=18,enabled=true)
		public void verifyAbrevaCreame1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaCream1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaCream1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevaCreame1:"+compareTwoText);
		}				
	 @Test(priority=19,enabled=true)
		public void verifyWheretobuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWheretobuy();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWheretobuy();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wheretobuy:"+compareTwoText);
		}				
	 @Test(priority=20,enabled=true)
		public void verifyUsingAbrevaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonUsingAbreva();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonUsingAbreva();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Using Abreva:"+compareTwoText);
		}				
	 @Test(priority=21,enabled=true)
		public void verifyLipcareTipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonLipcaretips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonLipcaretips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lip care tips:"+compareTwoText);
		}				
	 @Test(priority=22,enabled=true)
		public void verifyReviewLink() throws Throwable
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
	 @Test(priority=23,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonContactus();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonContactus();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Contactus:"+compareTwoText);
		}				
	 @Test(priority=24,enabled=true)
		public void verifyWriteReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWriteReview();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWriteReview();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WriteReview:"+compareTwoText);
		}				
	 @Test(priority=25,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow Displayed Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow Displayed Successfully on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
