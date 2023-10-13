package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestErwachsenePage;


public class drbestErwachseneTest extends BaseClass{
	
	drbestErwachsenePage dg;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dg=new drbestErwachsenePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestErwachseneUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestErwachseneUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}								
	 @Test(priority=1,enabled=true)
		public void verifyYouTubeLink() throws Throwable
		{
			switchingTab(firstTab);
	        dg.Clickonyoutubebtn();
	        System.out.println("Verify drbest YouTube play on Preprod Url");
	        switchingTab(secondTab);
	        dg.Clickonyoutubebtn();
	        System.out.println("Verify drbest YouTube play  on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimed:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimedProduct:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationPolimedBuyNoe();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationPolimedBuyNoe();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimedBuyNow:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpert:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationMultiExpertProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpertProduct:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonVibrationMultiExpertBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonVibrationMultiExpertBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpertBuyNow:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyXZwischenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonXZwischenzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonXZwischenzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwischenzahn:"+compareTwoText);
		}		
	
	 @Test(priority=9,enabled=true)
		public void verifyXZwischenzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonXZwischenzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonXZwischenzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwischenzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyXZwischenzahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonXZwischenzahnBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonXZwischenzahnBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwischenzahnBuyNow:"+compareTwoText);
		}	
	 @Test(priority=11,enabled=true)
		public void verifyQuiz1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Live Url");
		}				
	 @Test(priority=12,enabled=true)
		public void verifyQuiz2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Live Url");
		}				
	 @Test(priority=13,enabled=true)
		public void verifyQuiz3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Live Url");
		}				
	 @Test(priority=14,enabled=true)
		public void verifyQuiz4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Live Url");
		}				
	 @Test(priority=15,enabled=true)
		public void verifyQuiz5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}				
	 @Test(priority=16,enabled=true)
		public void verifyQuiz6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}
	 @Test(priority=17,enabled=true)
		public void verifyQuiz7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Live Url");
		}	
	 @Test(priority=18,enabled=true)
		public void verifyQuiz8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Live Url");
		}			
	 @Test(priority=19,enabled=true)
		public void verifyGesundeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonGesunde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonGesunde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyGesunde1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonGesunde1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonGesunde1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde1:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyWiebekommeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonWieBekomme();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonWieBekomme();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WieBekomme:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyWiebekomme1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonWieBekomme1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonWieBekomme1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WieBekomme1:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyZahnpflegeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonZahnpflege();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonZahnpflege();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnpflege:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyZahnpflege1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.ClickonZahnpflege1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.ClickonZahnpflege1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Zahnpflege1:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
