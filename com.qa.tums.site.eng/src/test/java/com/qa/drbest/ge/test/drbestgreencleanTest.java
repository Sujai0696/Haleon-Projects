package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestgreencleanPage;

public class drbestgreencleanTest extends BaseClass{
	
	drbestgreencleanPage db;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 db=new drbestgreencleanPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestgreencleanUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestgreencleanUrl"));
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
		public void verifyWasunterscheidietLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWasunterscheidiet();
	       System.out.println("Verified Display of Wasunterscheidiet on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWasunterscheidiet();
	        System.out.println("Verified Display of Wasunterscheidiet on Live Url");
		}						
	 @Test(priority=3,enabled=true)
		public void verifyWarumverwendentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWarumverwendent();
	       System.out.println("Verified Display of Warumverwendent on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWarumverwendent();
	        System.out.println("Verified Display of Warumverwendent on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyWiesoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWeiso();
	       System.out.println("Verified Display of Wieso on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWeiso();
	        System.out.println("Verified Display of Wieso on Live Url");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyWasgenauLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWasgenau();
	       System.out.println("Verified Display of Wasgenau on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWasgenau();
	        System.out.println("Verified Display of Wasgenau on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyWiescowirktLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWiesowirkt();
	       System.out.println("Verified Display of Wiescowirkt on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWiesowirkt();
	        System.out.println("Verified Display of Wiescowirkt on Live Url");
		}			
	 @Test(priority=7,enabled=true)
		public void verifyWasbedutetLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWasbedeutet();
	       System.out.println("Verified Display of Wasbedutet on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWasbedeutet();
	        System.out.println("Verified Display of Wasbedutet on Live Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifyWoherStammtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWoherstammt();
	       System.out.println("Verified Display of WoherStammt on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWoherstammt();
	        System.out.println("Verified Display of WoherStammt on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyWowirdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonWowird();
	       System.out.println("Verified Display of Wowird on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonWowird();
	        System.out.println("Verified Display of Wowird on Live Url");
		}			
	 @Test(priority=10,enabled=true)
		public void verifyIstdieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonIstdie();
	       System.out.println("Verified Display of Istdie on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonIstdie();
	        System.out.println("Verified Display of Istdie on Live Url");
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
		public void verifyMassenibilanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        db.clickonMassenibilan();
	       System.out.println("Verified Display of Massenibilan on Preprod Url");
	        switchingTab(secondTab);
	        db.clickonMassenibilan();
	        System.out.println("Verified Display of Massenibilan on Live Url");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
