package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.abreva.pages.AbrevaCouponsPage;

public class AbrevaCouponsTest extends BaseClass{
	
	AbrevaCouponsPage ac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ac=new AbrevaCouponsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("abreva_Config.properties").getProperty("preProdAbrevaCouponsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("abreva_Config.properties").getProperty("LiveAbrevaCouponsUrl"));
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
		public void verifyAbrevaproductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAbrevaproducts();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAbrevaproducts();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Abreva Products:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyAboutcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonAboutcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonAboutcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for About cold sores:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyManagingLipHealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonManagingliphealth();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonManagingliphealth();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing lip health:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonFAQ();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonFAQ();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQ:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyGetRidofcoldsoresLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonGetridofcoldsores();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonGetridofcoldsores();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get Rid of coldSores:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyWheretoBuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ac.clickonWheretobuy();
	        String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
	        switchingTab(secondTab);
	        ac.clickonWheretobuy();
	        String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Where to Buy:"+compareTwoText);
		}					
	
//	 @Test(priority=7,enabled=true)
//		public void verifyBuyNowLink() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        ac.clickonBuyNow();
//	       System.out.println("Verified the BuyNow is displayed Successfully on Preprod Url");
//	        switchingTab(secondTab);
//	        ac.clickonBuyNow();
//	        System.out.println("Verified the BuyNow is displayed Successfully on Live Url");
//		}					
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
