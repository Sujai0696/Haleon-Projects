package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateVitaminDPage;

public class CaltrateVitaminDTest extends BaseClass{
	
	CaltrateVitaminDPage cv;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cv=new CaltrateVitaminDPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdCaltrateVitaminDUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("LiveCaltrateVitaminDUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cv.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadCrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cv.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadCrumbs :"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateVitaminDBreadCrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickonCaltrateVitaminDBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cv.clickonCaltrateVitaminDBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateVitaminDBreadCrumbs :"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickonBuyNow();
	        System.out.println("Verify BuyNow  is successfully on Preprod Url");
	        switchingTab(secondTab);
	        cv.clickonBuyNow();
	       System.out.println("Verify BuyNow  is successfully on Live Url");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cv.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifySeeallProductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cv.clickonSeeAllproducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cv.clickonSeeAllproducts();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SeeallProducts:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCouponsProductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        
	        String preProdUrl = cv.clickonCouponsproducts();
	        System.out.println(preProdUrl);
	        switchingTab(secondTab);
	        
	        String liveUrl = cv.clickonCouponsproducts();
	        System.out.println(liveUrl);
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CouponsProducts:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
