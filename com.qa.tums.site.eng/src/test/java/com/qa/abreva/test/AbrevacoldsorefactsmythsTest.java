package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevacoldsorefactsmythsPage;

public class AbrevacoldsorefactsmythsTest extends BaseClass{
	
	AbrevacoldsorefactsmythsPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevacoldsorefactsmythsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevasorefactsmythsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevasorefactsmythsUrl"));
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
		public void verifyFightingcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfightingcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfightingcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Fighting Cold sore:"+compareTwoText);
		}					
	 @Test(priority=11,enabled=true)
		public void verifyHomeRemeediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonHomeRemedies();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonHomeRemedies();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Home Remedies:"+compareTwoText);
		}					
	 @Test(priority=12,enabled=true)
		public void verifyColdSoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sores:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyMyth1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth1();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth1();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=14,enabled=true)
		public void verifyMyth2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth2();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth2();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=15,enabled=true)
		public void verifyMyth3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth3();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth3();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=16,enabled=true)
		public void verifyMyth4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth4();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth4();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=17,enabled=true)
		public void verifyMyth5Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth5();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth5();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=18,enabled=true)
		public void verifyMyth6Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth6();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth6();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=19,enabled=true)
		public void verifyMyth7Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth7();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth7();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	
	 @Test(priority=20,enabled=true)
		public void verifyMyth8Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth8();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth8();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=21,enabled=true)
		public void verifyMyth9Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth9();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth9();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=22,enabled=true)
		public void verifyMyth10Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth10();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth10();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
		}					
	 @Test(priority=23,enabled=true)
		public void verifyMyth11Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonMyth11();
	        System.out.println("Verified Accordion Successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonMyth11();
	        System.out.println("Verified Accordion Successfully on LiveUrl");
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
	        System.out.println("Preprod URL and Live URL are same for Write Review:"+compareTwoText);
		}				
	 @Test(priority=25,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	       System.out.println("Verified BuyNow is displayed successfully on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
