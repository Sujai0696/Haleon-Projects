package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaspreadingcoresoresPage;

public class AbrevaspreadingcoresoresTest extends BaseClass{
	
	AbrevaspreadingcoresoresPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevaspreadingcoresoresPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaSpreadingcoldsoresUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaSpreadingcoldsoresUrl"));
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
		public void verifyReadTipsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadtips();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadtips();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cold Sores Teens:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyReadmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonReadmore();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonReadmore();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonBuyNow();
	        System.out.println("Verified BuyNow is displayed successfully on Preprod Url");
	        switchingTab(secondTab);
	        ac.clickonBuyNow();;
	        System.out.println("Verified BuyNow is displayed successfully on Live Url");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
