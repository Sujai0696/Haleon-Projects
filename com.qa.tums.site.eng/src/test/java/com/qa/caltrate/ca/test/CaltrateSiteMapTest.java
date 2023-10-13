package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltrateSiteMapPage;

public class CaltrateSiteMapTest extends BaseClass{
	
	CaltrateSiteMapPage cs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cs=new CaltrateSiteMapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdCaltrateSiteMapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("LiveCaltrateSiteMapUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyProductLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonProducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonProducts();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Product:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyCaltratePlusLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltratePlus();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltratePlus();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltratePlus:"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateVitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltrateVitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltrateVitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateVitaminD:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyCaltrateSelectLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltrateSelect();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltrateSelect();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateSelect :"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caltrate:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyCaltrateGummiesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltrategummies();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltrategummies();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateGummies:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCaltratesoftchewsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltratesoftchew();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltratesoftchew();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caltratesoftchews:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCaltratepluschewablesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickonCaltratepluschewables();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickonCaltratepluschewables();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caltratepluschewables:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickoncoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickoncoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyContactUsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cs.clickoncontactus();
	        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
	        switchingTab(secondTab);
	        cs.clickoncontactus();
	        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ContactUs :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
