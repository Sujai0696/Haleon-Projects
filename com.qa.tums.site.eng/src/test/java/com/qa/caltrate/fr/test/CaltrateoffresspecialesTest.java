package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltrateoffresspecialesPage;

public class CaltrateoffresspecialesTest extends BaseClass{
	
	CaltrateoffresspecialesPage co;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		co=new CaltrateoffresspecialesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_frConfig.properties").getProperty("preProdoffresspecialesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_frConfig.properties").getProperty("LiveoffresspecialesUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsjoindreLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonHomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonHomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  Home Breadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyCouponsBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCouponsbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCouponsbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For Coupons Breadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyEconimizemaintantCardLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoneconomizemaintantCards();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickoneconomizemaintantCards();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same EconimizemaintantCard :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifydeconomiessanteHaleonLink() throws Throwable
		{
		 switchingTab(firstTab);
	        co.clickonedeconomiessantehaleon();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonedeconomiessantehaleon();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same deconomiessanteHaleon :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyCouponsImageLink() throws Throwable
		{
		 switchingTab(firstTab);
	        String preProdUrl =  co.clickonCouponsImage();
	        System.out.println(preProdUrl);
	        switchingTab(secondTab);
	        String liveUrl =  co.clickonCouponsImage();
	        System.out.println(liveUrl);
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same deconomiessanteHaleon :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
