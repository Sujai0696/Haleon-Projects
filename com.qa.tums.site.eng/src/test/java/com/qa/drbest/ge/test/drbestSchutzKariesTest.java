package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestSchutzKariesPage;

public class drbestSchutzKariesTest extends BaseClass{
	
	drbestSchutzKariesPage ds;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ds=new drbestSchutzKariesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestSchutzKariesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestSchutzKariesUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ds.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ds.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}									
	 @Test(priority=1,enabled=true)
		public void verifyXZwischenzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonXZwischenzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonXZwischenzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwischenzahn:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyXZwischenzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonXZwischenzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonXZwischenzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for XZwischenzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyXZwischenzahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonXZwischenzahntBuyNow();
	        System.out.println("Verify XZwischenzahnBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        ds.ClickonXZwischenzahntBuyNow();
	        System.out.println("Verify XZwischenzahnBuyNow on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyVibrationPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonVibrationPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Polimed:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonVibrationPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration Polimed Product:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationPolimedBuyNow();
	        System.out.println("Verify VibrationPolimedBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        ds.ClickonVibrationPolimedBuyNow();
	        System.out.println("Verify VibrationPolimedBuyNow on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationMultiExpertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationMultiExpert();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonVibrationMultiExpert();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpert:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyVibrationMultiExpertProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationMultiExpertProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonVibrationMultiExpertProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Vibration MultiExpert Product:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyVibrationMultiExpertBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonVibrationMultiExpertBuyNow();
	        System.out.println("Verify  VibrationMultiExpertBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        ds.ClickonVibrationMultiExpertBuyNow();
	        System.out.println("Verify VibrationMultiExpertBuyNow  on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyArticle1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonArticle1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonArticle1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article1:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyRelatedLink1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonLink1();    
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonLink1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link1:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyArticle2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonArticle2(); 
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonArticle2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article2:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyRelatedLink2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonLink2();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonLink2();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link2:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyArticle3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonArticle3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonArticle3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Article3:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyRelatedLink3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ds.ClickonRelatedLink3();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        ds.ClickonRelatedLink3();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Link3:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
