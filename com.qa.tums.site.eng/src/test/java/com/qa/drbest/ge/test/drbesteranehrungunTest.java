package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbesteranehrungunPage;


public class drbesteranehrungunTest extends BaseClass{
	
	drbesteranehrungunPage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbesteranehrungunPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbesternaehrungundzaehneUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbesternaehrungundzaehneUrl"));
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
		public void verifydrbestSlide1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide1();
	        System.out.println("Verify drbest Slide1 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide1();
	        System.out.println("Verify drbestSlide1 on Live Url");
		}						
	 @Test(priority=2,enabled=true)
		public void verifydrbestSlide2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide2();
	        System.out.println("Verify drbest Slide2 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide2();
	        System.out.println("Verify drbestSlide2 on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifydrbestSlide3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide3();
	        System.out.println("Verify drbest Slide3 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide3();
	        System.out.println("Verify drbestSlide3 on Live Url");
		}				
	 @Test(priority=4,enabled=true)
		public void verifydrbestSlide4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide4();
	        System.out.println("Verify drbest Slide4 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide4();
	        System.out.println("Verify drbestSlide4 on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifydrbestSlide5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide5();
	        System.out.println("Verify drbest Slide5 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide5();
	        System.out.println("Verify drbestSlide5 on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifydrbestSlide6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide6();
	        System.out.println("Verify drbest Slide6 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide6();
	        System.out.println("Verify drbestSlide6 on Live Url");
		}			
	 @Test(priority=7,enabled=true)
		public void verifydrbestSlide7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide7();
	        System.out.println("Verify drbest Slide7 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide7();
	        System.out.println("Verify drbestSlide7 on Live Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifydrbestSlide8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.ClickonSlide8();
	        System.out.println("Verify drbest Slide8 on Preprod Url");
	        switchingTab(secondTab);
	        dh.ClickonSlide8();
	        System.out.println("Verify drbestSlide8 on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimed:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimed Product:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationPolimedBuyNow();
	        System.out.println("Verify the VibrationPolimedBuyNow on preprod url");
	        switchingTab(secondTab);
	        dh.ClickonVibrationPolimedBuyNow();
	        System.out.println("Verify the VibrationPolimedBuyNow on Live url");
		}		
	 @Test(priority=12,enabled=true)
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
	 @Test(priority=13,enabled=true)
		public void verifyAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonAtemfrischProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonAtemfrischProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AtemfrischProduct:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyAtemfrischBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonAtemfrischBuyNow();
	        System.out.println("Verify the AtemfrischBuyNow on preprod url");
	        switchingTab(secondTab);
	        dh.ClickonAtemfrischBuyNow();
	        System.out.println("Verify the VAtemfrischBuyNow on Live url");
		}		
	 @Test(priority=15,enabled=true)
		public void verifyMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiExpert:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonMultiExpertBuyNow();
	        System.out.println("Verify the MultiExpertBuyNow on preprod url");
	        switchingTab(secondTab);
	        dh.ClickonMultiExpertBuyNow();
	        System.out.println("Verify the MultiExpertBuyNow on Live url");
		}		
	 @Test(priority=17,enabled=true)
		public void verifyArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonArticle1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonArticle1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article1:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyRelatedLink1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonLink1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonLink1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link1:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonArticle2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonArticle2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article2:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyRelatedLink2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonLink2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonLink2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link2:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonArticle3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonArticle3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article3:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyRelatedLink3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonLink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonLink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
