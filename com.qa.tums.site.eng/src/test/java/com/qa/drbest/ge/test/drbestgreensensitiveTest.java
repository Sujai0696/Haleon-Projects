package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestgreensensitivePage;

public class drbestgreensensitiveTest extends BaseClass{
	
	drbestgreensensitivePage dg;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dg=new drbestgreensensitivePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestgreensensitiveUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("LivedrbestgreensensitiveUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyBuyNow1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonBuyNow1();
	       System.out.println("Verified Display of BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonBuyNow1();
	        System.out.println("Verified Display of BuyNow on Live Url");
		}							
	 @Test(priority=2,enabled=true)
		public void verifyFurwenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonFurwen();
	       System.out.println("Verified Display of Furwen on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonFurwen();
	        System.out.println("Verified Display of Furwen on Live Url");
		}			
	 @Test(priority=3,enabled=true)
		public void verifyWieeffizientLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWieeffizient();
	       System.out.println("Verified Display of Wieeffizient on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWieeffizient();
	        System.out.println("Verified Display of Wieeffizient on Live Url");
		}			
	 @Test(priority=4,enabled=true)
		public void verifyWiesetztLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWiesetzt();
	       System.out.println("Verified Display of Wiesetzt on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWiesetzt();
	        System.out.println("Verified Display of Wiesetzt on Live Url");
		}	
	 @Test(priority=5,enabled=true)
		public void verifyWorinLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWorin();
	       System.out.println("Verified Display of worin on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWorin();
	        System.out.println("Verified Display of worin on Live Url");
		}	
	 @Test(priority=6,enabled=true)
		public void verifyWiesoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWieso();
	       System.out.println("Verified Display of Wieso on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWieso();
	        System.out.println("Verified Display of Wieso on Live Url");
		}	
	 @Test(priority=7,enabled=true)
		public void verifyWarumLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWarum();
	       System.out.println("Verified Display of Warum on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWarum();
	        System.out.println("Verified Display of Warum on Live Url");
		}	
	 @Test(priority=8,enabled=true)
		public void verifyWorausLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWoraus();
	       System.out.println("Verified Display of Woraus on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWoraus();
	        System.out.println("Verified Display of Woraus on Live Url");
		}	
	 @Test(priority=9,enabled=true)
		public void verifyWowwirddieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWowirddie();
	       System.out.println("Verified Display of Wowwirddie on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWowirddie();
	        System.out.println("Verified Display of Wowwirddie on Live Url");
		}	
	 @Test(priority=10,enabled=true)
		public void verifyWasbedutetLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWasbedutet();
	       System.out.println("Verified Display of Wasbedutet on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWasbedutet();
	        System.out.println("Verified Display of Wasbedutet on Live Url");
		}	
	 @Test(priority=11,enabled=true)
		public void verifyWasistderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonWasistder();
	       System.out.println("Verified Display of Wasistder on Preprod Url");
	        switchingTab(secondTab);
	        dg.clickonWasistder();
	        System.out.println("Verified Display of Wasistder on Live Url");
		}	
	 @Test(priority=12,enabled=true)
		public void verifyGreencleanLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonGreenclean();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonGreenclean();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Greenclean:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyGreencleanProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonGreencleanProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonGreencleanProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Greenclean Product:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyGreencleanBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonGreenCleanBuyNow();
	        System.out.println("Verified GreencleanBuyNow on preprod url");
	        switchingTab(secondTab);
	        dg.clickonGreenCleanBuyNow();
	        System.out.println("Verified GreencleanBuyNow on  Live url");
		}		
	 @Test(priority=15,enabled=true)
		public void verifyInterdentalbursyenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonInterdentalbursten();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonInterdentalbursten();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Interdentalbursyen:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyInterdentalbursyenProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonInterdentalburstenProduct();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonInterdentalburstenProduct();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Interdentalbursyen:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyInterdentalbursyenBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dg.clickonInterdentalburstenBuyNow();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dg.clickonInterdentalburstenBuyNow();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Interdentalbursyen buyNow:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
