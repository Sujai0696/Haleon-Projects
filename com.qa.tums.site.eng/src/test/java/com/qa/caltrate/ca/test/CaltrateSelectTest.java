package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateSelectPage;

public class CaltrateSelectTest extends BaseClass{
	
	CaltrateSelectPage ch;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ch=new CaltrateSelectPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdCaltrateSelectUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("LiveCaltrateSelectUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadCrumbs:"+compareTwoText);
		}					
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadCrumbs:"+compareTwoText);
		}				
	
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateBuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonCaltrateBuyNow();
	       System.out.println("Verify BuyNow on Preprod URL");
	        switchingTab(secondTab);
	        ch.clickonCaltrateBuyNow();
	        System.out.println("Verify BuyNow on Live URL");
		}				
	 @Test(priority=4,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifySeeAllProductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonAllProducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickonAllProducts();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SeeAllProducts:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	       
	        String preProdUrl = ch.clickonCoupons();
	        System.out.println(preProdUrl);
	        switchingTab(secondTab);
	       
	        String  liveUrl=ch.clickonCoupons();
	       System.out.println(liveUrl);
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
