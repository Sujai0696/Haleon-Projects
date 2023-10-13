package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestBambusInterdentPage;

public class drbestBambusInterdentTest extends BaseClass{
	
	drbestBambusInterdentPage dk;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dk=new drbestBambusInterdentPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestBambusInterdentUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestBambusInterdentUrl"));
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
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}			
//	 @Test(priority=3,enabled=true)
//		public void verifyReview1Link() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        dk.clickonReview1();
//	       System.out.println("Verified Display of Review1 on Preprod Url");
//	        switchingTab(secondTab);
//	        dk.clickonReview1();
//	        System.out.println("Verified Display of Review1 on Live Url");
//		}							
	 @Test(priority=3,enabled=true)
		public void verifyBambusInterdentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonBambusInterdent();
	       System.out.println("Verified Display of BambusInterdent on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonBambusInterdent();
	        System.out.println("Verified Display of BambusInterdent on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyWarumgibtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWarumgibt();
	       System.out.println("Verified Display of Warumgibt on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWarumgibt();
	        System.out.println("Verified Display of Warumgibt on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyWietragtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWietragt();
	       System.out.println("Verified Display of Wietragt on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWietragt();
	        System.out.println("Verified Display of Wietragt on Live Url");
		}		
	 @Test(priority=6,enabled=true)
		public void verifyWasuntermmitLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWasunterimmt();
	       System.out.println("Verified Display of Wasunermmit on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWasunterimmt();
	        System.out.println("Verified Display of Wasunermmit on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyWoherstammtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWoherstammt();
	       System.out.println("Verified Display of Woherstammt on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWoherstammt();
	        System.out.println("Verified Display of Woherstammt on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyWiestelltLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWiestellt();
	       System.out.println("Verified Display of Wiestellt on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWiestellt();
	        System.out.println("Verified Display of Wiestellt on Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyFordertLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonFordert();
	       System.out.println("Verified Display of Fordert on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonFordert();
	        System.out.println("Verified Display of Fordert on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyWiekannLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWiekann();
	       System.out.println("Verified Display of Wiekann on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWiekann();
	        System.out.println("Verified Display of Wiekann on Live Url");
		}		
	 @Test(priority=11,enabled=true)
		public void verifyWorausLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWoraus();
	       System.out.println("Verified Display of Woraus on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWoraus();
	        System.out.println("Verified Display of Woraus on Live Url");
		}		
	 @Test(priority=12,enabled=true)
		public void verifyWassMussLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWassmuss();
	       System.out.println("Verified Display of WassMuss on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWassmuss();
	        System.out.println("Verified Display of WassMuss on Live Url");
		}		
	 @Test(priority=13,enabled=true)
		public void verifyWarumhatLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dk.clickonWarumhat();
	       System.out.println("Verified Display of Warumhat on Preprod Url");
	        switchingTab(secondTab);
	        dk.clickonWarumhat();
	        System.out.println("Verified Display of Warumhat on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
