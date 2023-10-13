package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestKinderjuniorzahnPage;


public class drbestKinderjuniorzahnTest extends BaseClass{
	
	drbestKinderjuniorzahnPage dp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dp=new drbestKinderjuniorzahnPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestKinderjuniorzahnUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestKinderjuniorzahnUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dp.clickonReview1();
	       System.out.println("Verified Display of Review1 on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonReview1();
	        System.out.println("Verified Display of Review1 on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyMilchzahnLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonMilchzahn();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonMilchzahn();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Milchzahn:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyMilchzahnProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonMilchzahnProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonMilchzahnProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MilchzahnProduct:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyMilchzahnBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonMilchzahnBuyNow();
	       System.out.println("MilchzahnBuyNow is Verified on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonMilchzahnBuyNow();
	        System.out.println("MilchzahnBuyNow is Verified on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyPawPatrolLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonPawPatrol();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonPawPatrol();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PawPatrol:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyPawPatrolProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonPawPatrolProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonPawPatrolProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PawPatrol Product:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyPawPatrolBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonPawPatrolBuyNow();
	        System.out.println("Verified PawPatrolBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonPawPatrolBuyNow();
	        System.out.println("Verified PawPatrolBuyNow on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCoolKidsLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonCoolKids();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonCoolKids();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PawPatrol Product:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCoolKidsProductLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonCoolKidsProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dp.clickonCoolKidsProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CoolKids Product:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCoolKidsBuyNowLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        dp.clickonCoolKidsBuyNow();
	        System.out.println("Verified CoolKidsBuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dp.clickonCoolKidsBuyNow();
	        System.out.println("Verified CoolKidsBuyNow on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
