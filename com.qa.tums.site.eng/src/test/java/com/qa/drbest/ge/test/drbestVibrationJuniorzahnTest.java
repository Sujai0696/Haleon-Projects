package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestVibrationJuniorzahnPage;

public class drbestVibrationJuniorzahnTest extends BaseClass{
	
	drbestVibrationJuniorzahnPage dv;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dv=new drbestVibrationJuniorzahnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestVibrationjuniorzahnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestVibrationjuniorzahnUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dv.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}		
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonReview1();
	       System.out.println("Verified Display of Review1 on Preprod Url");
	        switchingTab(secondTab);
	        dv.clickonReview1();
	        System.out.println("Verified Display of Review1 on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyMilichzahnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonMilichzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonMilichzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Milichzahn:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyMilichzahnProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonMilichzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonMilichzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MilichzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyMilichzahnBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonMilichzahnBuyNow();
	       System.out.println("MilichzahnBuyNow is display on Preprod url");
	        switchingTab(secondTab);
	        dv.clickonMilichzahnBuyNow();
	        System.out.println("MilichzahnBuyNow is display on Live url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyPawPatrolLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonPawPatrol();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonPawPatrol();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Pawpatrol:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyPawPatrolProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonPawPatrolProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonPawPatrolProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PawpatrolProduct:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyPawPatrolBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonPawPatrolBuyNow();
	       System.out.println("PawPatrolBuyNow is display on Preprod url");
	        switchingTab(secondTab);
	        dv.clickonPawPatrolBuyNow();
	        System.out.println("PawPatrolBuyNow is display on Live url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCoolkidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonCoolkids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonCoolkids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coolkids"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyCoolkidsProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonCoolkidsProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dv.clickonCoolkidsProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolkidsProduct"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyCoolkidsBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dv.clickonCoolkidsBuyNow();
	       System.out.println("Verified  Coolkids for preprod url");
	        switchingTab(secondTab);
	        dv.clickonCoolkidsBuyNow();
	        System.out.println("Verified  Coolkids for Live url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
