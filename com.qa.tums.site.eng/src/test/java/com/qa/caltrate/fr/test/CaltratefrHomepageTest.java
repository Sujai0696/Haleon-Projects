package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltratefrHomepagePage;

public class CaltratefrHomepageTest extends BaseClass{
	
	
	CaltratefrHomepagePage chfr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		chfr=new CaltratefrHomepagePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_frConfig.properties").getProperty("preProdHomepagefrUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_frConfig.properties").getProperty("liveHomepagefrUrl"));
		 }
	
	 @Test(priority=1,enabled=true)
		public void verifyBannerImageLink() throws Throwable
		{
		 switchingTab(firstTab);
	        chfr.clickonBannerImage();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        chfr.clickonBannerImage();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Banner image :"+compareTwoText);
		}					
	 @Test(priority=2,enabled=true)
		public void verifyBannerImage1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        chfr.clickonBannerImage1();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        chfr.clickonBannerImage1();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Banner image1 :"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyCouponsfrLink() throws Throwable
		{
			switchingTab(firstTab);
	        chfr.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        chfr.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons Fr :"+compareTwoText);
		}					
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
