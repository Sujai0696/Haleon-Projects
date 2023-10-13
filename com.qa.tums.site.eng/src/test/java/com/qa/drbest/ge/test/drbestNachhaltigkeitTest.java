package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestNachhaltigkeitPage;

public class drbestNachhaltigkeitTest extends BaseClass {
	
	drbestNachhaltigkeitPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestNachhaltigkeitPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestNachhaltigkeitUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestNachhaltigkeitUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}								
	 @Test(priority=1,enabled=true)
		public void verifyBambusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambus();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambus();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Bambus:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyBiokunstoffLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBiokunstoff();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBiokunstoff();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Biokunstuff:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyVerpackungLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonVerpackung();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonVerpackung();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Verpackung:"+compareTwoText);
		}
	 @Test(priority=4,enabled=true)
		public void verifyYouTubeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonYouTubeButton();
	        System.out.println("Verified Youtube play on preprod url");
	        switchingTab(secondTab);
	        dk.ClickonYouTubeButton();
	        System.out.println("Verified Youtube play on Live url");
		}
	 
	 
	 
	 
	 @Test(priority=5,enabled=true)
		public void verifyGreenSensitiveLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenSensitive();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenSensitive();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenSensitive:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyGreenSensitiveProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenSensitiveProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenSensitiveProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenSensitiveProduct:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyGreenSensitiveBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenSensitiveBuyNow();
	        System.out.println("Verified GreenSensitiveBuyNow on preprod Url ");
	        switchingTab(secondTab);
	        dk.ClickonGreenSensitiveBuyNow();
	        System.out.println("Verified GreenSensitiveBuyNow on Live Url ");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyBambusKidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusKids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusKids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusKids:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyBambusKidsProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusKidsProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusKidsProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusKidsProduct:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyBambusKidsBuyNOwLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusKidsBuyNow();
	        System.out.println("Verified BambusKidsBuyNOw successfully on pre prod Url");
	        switchingTab(secondTab);
	        dk.ClickonBambusKidsBuyNow();
	        System.out.println("Verified BambusKidsBuyNOw successfully on Live Url");
		}		
	 @Test(priority=11,enabled=true)
		public void verifyBambusInterdentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusInterdent();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusInterdent();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdent:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyBambusInterdentProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusInterdentProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonBambusInterdentProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BambusInterdentProduct:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyBambusInterdentBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonBambusInterdentBuyNow();
	        System.out.println("Verified BambusInterdentBuyNow on preprod url");
	        switchingTab(secondTab);
	        dk.ClickonBambusInterdentBuyNow();
	        System.out.println("Verified BambusInterdentBuyNow on Live url");
		}		
	 @Test(priority=14,enabled=true)
		public void verifyGreenCleanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenClean();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenClean();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenClean:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyGreenCleanProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenCleanProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonGreenCleanProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GreenClean Product:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyGreenCleanBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonGreenCleanBuyNow();
	       System.out.println("Verified GreenCleanBuyNow on Preprod url");
	        switchingTab(secondTab);
	        dk.ClickonGreenCleanBuyNow();
	        System.out.println("Verified GreenCleanBuyNow on Live url");
		}		
	 @Test(priority=17,enabled=true)
		public void verifyInterDentalBurstenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonInterdentalBursten();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonInterdentalBursten();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterDentalBursten:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyInterDentalBurstenProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonInterdentalBurstenProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dk.ClickonInterdentalBurstenProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InterDentalBursten Product:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyInterDentalBurstenBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.ClickonInterdentalBurstenBuyNow();
	        System.out.println("Verify InterDentalBurstenBuyNow is successfully verified on preprod url");
	        switchingTab(secondTab);
	        dk.ClickonInterdentalBurstenBuyNow();
	        System.out.println("Verify InterDentalBurstenBuyNow is successfully verified on Live url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
