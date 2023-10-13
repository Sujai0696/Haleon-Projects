package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestMundgeruchPage;

public class drbestMundgeruchTest extends BaseClass{
	
	drbestMundgeruchPage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbestMundgeruchPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestMundgeruchUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestMundgeruchUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}									
	 @Test(priority=1,enabled=true)
		public void verifyOption1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonOption1();
	        System.out.println("Verify  Option 1 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonOption1();
	        System.out.println("Verify  Option 1 on Live Url");
		}			
	 @Test(priority=2,enabled=true)
		public void verifyOption2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonOption2();
	        System.out.println("Verify  Option 2 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonOption2();
	        System.out.println("Verify  Option 2 on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyOption3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonOption3();
	        System.out.println("Verify  Option 3 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonOption3();
	        System.out.println("Verify  Option 3 on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Atemfrisch:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonAtemfrischproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonAtemfrischproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Atemfrisch product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonAtemfrischBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonAtemfrischBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischBuyNow:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationAtemfrischproduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationAtemfrischproduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch product:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationAtemfrischBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationAtemfrischBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch BuyNow:"+compareTwoText);
		}	
	 @Test(priority=10,enabled=true)
		public void verifyQuiz1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Live Url");
		}				
	 @Test(priority=11,enabled=true)
		public void verifyQuiz2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Live Url");
		}				
	 @Test(priority=12,enabled=true)
		public void verifyQuiz3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Live Url");
		}				
	 @Test(priority=13,enabled=true)
		public void verifyQuiz4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Live Url");
		}				
	 @Test(priority=14,enabled=true)
		public void verifyQuiz5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}				
	 @Test(priority=15,enabled=true)
		public void verifyQuiz6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}
	 @Test(priority=16,enabled=true)
		public void verifyQuiz7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Live Url");
		}	
	 @Test(priority=17,enabled=true)
		public void verifyQuiz8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Live Url");
		}		
	 @Test(priority=18,enabled=true)
		public void verifyParodontitisLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonParodontitis();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonParodontitis();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontitis:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyParodontitis1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonParodontitis1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonParodontitis1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Parodontitis1:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyGesundeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonGesunde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonGesunde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyGesunde1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonGesunde1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonGesunde1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde1:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyZurGesundeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonZurGesunde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonZurGesunde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZurGesunde:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyZurGesunde1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonZurGesunde1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonZurGesunde1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZurGesunde1:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
