package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateFooterPage;

public class CaltrateFooterTest extends BaseClass{
	
	CaltrateFooterPage cf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cf=new CaltrateFooterPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("liveHomepageUrl"));
		 }	
	 				
	 @Test(priority=1,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        cf.clickonContactUs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cf.clickonContactUs();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ContactUs:"+compareTwoText);
		}			
	 @Test(priority=2,enabled=true)
		public void verifySiteMapLink() throws Throwable
		{
		 switchingTab(firstTab);
	        cf.clickonSiteMap();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cf.clickonSiteMap();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SiteMap:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
