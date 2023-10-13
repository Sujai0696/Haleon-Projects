package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateHeaderPage;

public class CaltrateHeaderTest extends BaseClass{
	
	CaltrateHeaderPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltrateHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("liveHomepageUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie in preprod url");
	        switchingTab(secondTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie  in Live url");
		}		
	 @Test(priority=1,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}					
	 @Test(priority=2,enabled=true)
		public void verifyWheretoBuyLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonWheretobuy();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonWheretobuy();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateLogoLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltratelogo();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltratelogo();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyCaltrateUSALink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrateUSA();
	        System.out.println("Verify USA on Preprod URL");
	        switchingTab(secondTab);
	        cc.clickonCaltrateUSA();
	       System.out.println("Verify USA on Live URL");
		}				
	 @Test(priority=5,enabled=true)
		public void verifyCaltrateSearchIconLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltratesearch();
	        System.out.println("Verify Caltrate Search Button on Preprod URL");
	        switchingTab(secondTab);
	        cc.clickonCaltratesearch();
	       System.out.println("Verify Caltrate Search Button on Live URL");
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
