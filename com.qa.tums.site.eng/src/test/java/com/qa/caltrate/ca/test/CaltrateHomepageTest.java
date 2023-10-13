package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateHomepagePage;

public class CaltrateHomepageTest extends BaseClass{
	
	CaltrateHomepagePage ch;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ch=new CaltrateHomepagePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("liveHomepageUrl"));
		 }
	
	 @Test(priority=1,enabled=true)
		public void verifyBannerImageLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonBannerImage();
	        System.out.println("Verify Image on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickonBannerImage();
	        System.out.println("Verify Image on Live Url");
		}					
	 @Test(priority=2,enabled=true)
		public void verifyBannerImage1Link() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonBannerImage1();
	        System.out.println("Verify Image on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickonBannerImage1();
	        System.out.println("Verify Image on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifyTryGummiesLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonTryGummies();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickonTryGummies();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifySaveNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonSavenow();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        ch.clickonSavenow();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	       
	        String preProdUrl =ch.clickongetcoupons(); 
	        System.out.println(preProdUrl);
	        switchingTab(secondTab);
	       
	        String liveUrl = ch.clickongetcoupons();
	        System.out.println(liveUrl);
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
