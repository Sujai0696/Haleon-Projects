package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestBambusInterdentkidsPage;

public class drbestBambusInterdentkidsTest extends BaseClass{
	
	drbestBambusInterdentkidsPage db;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 db=new drbestBambusInterdentkidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestBambusInterdentkidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestBambusInterdentkidsUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        db.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonReview();
	       System.out.println("Verified Display of Review on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonReview();
	        System.out.println("Verified Display of Review on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonReview1();
	       System.out.println("Verified Display of Review1 on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonReview1();
	        System.out.println("Verified Display of Review1 on Live Url");
		}								
	 @Test(priority=3,enabled=true)
		public void verifyWasunterscheidietLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWasunterscheidiet();
	        System.out.println("Verified Display of Wasunterscheidiet on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWasunterscheidiet();
	        System.out.println("Verified Display of Wasunterscheidiet on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyWarumLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWarum();
	        System.out.println("Verified Display of Warum on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWarum();
	        System.out.println("Verified Display of Warum on Live Url");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyWietragtLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWietragt();
	        System.out.println("Verified Display of Wietragt on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWietragt();
	        System.out.println("Verified Display of Wietragt on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyWasunternimmtLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWasunternimmt();
	        System.out.println("Verified Display of Wasunternimmt  on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWasunternimmt();
	        System.out.println("Verified Display of Wasunternimmt  on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyWoherstammtLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWoherstammt();
	        System.out.println("Verified Display of Woherstammt  on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWoherstammt();
	        System.out.println("Verified Display of Woherstammt  on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyWiestelltLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWiestellt();
	        System.out.println("Verified Display of Wiestellt on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWiestellt();
	        System.out.println("Verified Display of Wiestellt on Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyFordertLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonFordert();
	        System.out.println("Verified Display of Fordert on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonFordert();
	        System.out.println("Verified Display ofFordert on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifywiekannLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWiekann();
	        System.out.println("Verified Display of Wiekann on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWiekann();
	        System.out.println("Verified Display of Wiekann on Live Url");
		}		
	 @Test(priority=11,enabled=true)
		public void verifyWorausbestehtLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWorausbesteht();
	        System.out.println("Verified Display of Worausbesteht on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWorausbesteht();
	        System.out.println("Verified Display of Worausbesteht on Live Url");
		}		
	 @Test(priority=12,enabled=true)
		public void verifyWassmussLink() throws Throwable
		{
		 	switchingTab(firstTab);
	        db.clickonWassmuss();
	        System.out.println("Verified Display of Wassmuss on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWassmuss();
	        System.out.println("Verified Display of Wassmuss on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
