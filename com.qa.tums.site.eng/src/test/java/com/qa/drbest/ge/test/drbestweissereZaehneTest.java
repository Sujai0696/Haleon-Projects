package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestweissereZaehnePage;

public class drbestweissereZaehneTest extends BaseClass{
	
	drbestweissereZaehnePage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbestweissereZaehnePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestweisserezaehneUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestweisserezaehneUrl"));
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
		public void verifyNaturelichLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonNaturelich();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonNaturelich();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Naturelich:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyPolimedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimed();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimed();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimed:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Polimedproduct:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimedBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimedBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedBuyNow:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
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
	 @Test(priority=6,enabled=true)
		public void verifyVibrationPolimedProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationPolimedProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationPolimedProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimedProduct:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyVibrationPolimedBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonVibrationPolimedBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonVibrationPolimedBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VibrationPolimedBuyNow:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyPolimedKurzkopfLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimedkurzkopf();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimedkurzkopf();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopf:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyPolimedKurzkopfProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimedkurzkopfProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimedkurzkopfProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopfProduct:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyPolimedKurzkopfBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonPolimedkurzkopfBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonPolimedkurzkopfBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PolimedKurzkopfBuyNow:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyWieentshethtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonWieentshetht();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonWieentshetht();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wieentshetht:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyWieentshetht1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonWieentshetht1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonWieentshetht1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Wieentshetht1:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyGesundeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.Clickongesunde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.Clickongesunde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyGesunde1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.Clickongesunde1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.Clickongesunde1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gesunde1:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyZurGesundeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonZurgesunde();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonZurgesunde();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZurGesunde:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyZurGesunde1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.ClickonZurgesunde1();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.ClickonZurgesunde1();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ZurGesunde1:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
