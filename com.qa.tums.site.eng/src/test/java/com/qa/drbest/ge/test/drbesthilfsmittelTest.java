package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbesthilfsmittelPage;

public class drbesthilfsmittelTest extends BaseClass {
	
	drbesthilfsmittelPage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbesthilfsmittelPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbesthilfsmittelUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbesthilfsmittelUrl"));
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
	 @Test(priority=2,enabled=true)
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
	 @Test(priority=3,enabled=true)
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
	 @Test(priority=4,enabled=true)
		public void verifyVibrationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibration();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibration();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationBuyNow:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationAtemfrischLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibratioAtemfrisch();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibratioAtemfrisch();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationAtemfrischProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibratioAtemfrischProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibratioAtemfrischProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationAtemfrisch product:"+compareTwoText);
		}		
	 
	 @Test(priority=9,enabled=true)
		public void verifyVibrationAtemfrischBuynowLink() throws Throwable
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
		public void verifyVibrationMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibratioMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibratioMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpert:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyVibrationMultiExpertProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibratioMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibratioMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpert product:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyVibrationMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationMultiExpertBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationMultiExpertBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationMultiExpert BuyNow:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyRuttelnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonRutteln();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonRutteln();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rutteln:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyRutteln1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonRutteln1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonRutteln1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Rutteln1:"+compareTwoText);
		}		
	 
	 @Test(priority=15,enabled=true)
		public void verifyWiebekommeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonWiebekomme();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonWiebekomme();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wiebekomme:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyWiebekomme1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonWiebekomme1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonWiebekomme1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wiebekomme1:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyDieschleichendeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonDieschleichende();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonDieschleichende();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dieschleichende:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyDieschleichende1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonDieschleichende1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonDieschleichende1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Dieschleichende1:"+compareTwoText);
		}		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
