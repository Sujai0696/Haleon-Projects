package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevecoldsoretinglepollPage;

public class AbrevacoldsoretinglepollTest extends BaseClass{
	
	AbrevecoldsoretinglepollPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevecoldsoretinglepollPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaltinglepollUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaltinglepollUrl"));
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
		public void verifylipcareLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonlipcare();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonlipcare();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lip care:"+compareTwoText);
		}										
	
	 @Test(priority=2,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for get Coupons:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow1();
	        System.out.println("Verified BuyNow1 is Displayed on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
