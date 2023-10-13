package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevamanaginglipcarePage;

public class AbrevamanaginglipcareTest extends BaseClass{
	
	AbrevamanaginglipcarePage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevamanaginglipcarePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevamanaginglipcareUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevamanaginglipcareUrl"));
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
//	 @Test(priority=8,enabled=true)
//		public void verifyTinglepollLink() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        ac.clickonTinglepoll();
//	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
//	        switchingTab(secondTab);
//	        ac.clickonTinglepoll();
//	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
//	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	        System.out.println("Preprod URL and Live URL are same for Tinglepoll:"+compareTwoText);
//		}			
	
	 @Test(priority=8,enabled=true)
		public void verifyChappedlipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonchappedlips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonchappedlips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Chapped lips:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyWheregetcoldsoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonwheregetcoldsore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonwheregetcoldsore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whereto get cold sore:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyAbrevavscompetionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevavscompetion();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevavscompetion();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AbrevavsCompetion:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyLipcareliphealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcareliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcareliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lipcareliphealth:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyFuelyourlipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfuelyourlips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfuelyourlips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for fuel your lips:"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifylysinecoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlysinecoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlysinecoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lysine cold sores:"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyfoodhealthylipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonfoodhealthylips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonfoodhealthylips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for food healthy lips:"+compareTwoText);
		}			
	 @Test(priority=15,enabled=true)
		public void verifybumpsonlipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonbumpsonlips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonbumpsonlips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for bumps on lips:"+compareTwoText);
		}			
	 @Test(priority=16,enabled=true)
		public void verifynottouchfaceLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonnottouchface();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonnottouchface();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same fornot touch face:"+compareTwoText);
		}			
	 @Test(priority=17,enabled=true)
		public void verifytakequizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickontakequiz();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickontakequiz();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for take quiz:"+compareTwoText);
		}			
	 @Test(priority=18,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
