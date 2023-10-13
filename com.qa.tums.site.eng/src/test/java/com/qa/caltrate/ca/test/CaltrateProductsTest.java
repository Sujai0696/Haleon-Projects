package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateProductsPage;


public class CaltrateProductsTest extends BaseClass{
	
	CaltrateProductsPage cp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cp=new CaltrateProductsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdCaltrateProductsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("LiveCaltrateProductsUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadCrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadCrumbs :"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonCaltrateBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickonCaltrateBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateBreadCrumbs:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonBuyNow();
	        System.out.println("Verify BuyNow on preprod Url");
	        switchingTab(secondTab);
	        cp.clickonBuyNow();
	       System.out.println("Verify BuyNow on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifygetcouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for getcoupons :"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifySeeAllProductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonseeAllProducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickonseeAllProducts();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SeeAllProducts:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyProductsCouponLink() throws Throwable
		{
			switchingTab(firstTab);
	        cp.clickonProductsCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cp.clickonProductsCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsCoupon:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
