package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevacoldsorestagesPage;

public class AbrevacoldsorestagesTest extends BaseClass{
	
	AbrevacoldsorestagesPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevacoldsorestagesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevacoldsorestagesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevacoldsorestagesUrl"));
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
		public void verifyManagingLipHealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManaginglipHealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManaginglipHealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing lip health:"+compareTwoText);
		}									
	 @Test(priority=2,enabled=true)
		public void verifyDealingcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonDealingcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonDealingcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dealing cold sores:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyLipCareLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcare();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcare();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LipCare:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyStressColdsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonStresscoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonStresscoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stress Cold Sore:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyLipProblemLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonLipProblem();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonLipProblem();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LipProblem:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyAloveracoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAloveracolssore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAloveracolssore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Alovera cold sore:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyRecurringcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonRecurringcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonRecurringcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Recurring cold sore:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifyBackcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonbacksore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonbacksore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Back cold sore:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyColdsoretriggersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdsoretriggers();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdsoretriggers();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold sore triggers:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyAbrevaCreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevacReam();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevacReam();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevaCreame:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyLipCare1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonLipCare1();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonLipCare1();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LipCare1:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyWeatherWinterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWeatherWinter();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWeatherWinter();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Weather Winter:"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifyColdSoreConfidenceLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonColdSoreConfidence();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonColdSoreConfidence();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sore Confidence:"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyKnockoutchappedlipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonknockoutchappedlips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonknockoutchappedlips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Knock out Chapped lips:"+compareTwoText);
		}			
	 @Test(priority=15,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}			
	 @Test(priority=16,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
