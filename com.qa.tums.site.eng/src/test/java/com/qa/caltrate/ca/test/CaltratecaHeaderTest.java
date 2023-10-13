package com.qa.caltrate.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.ca.pages.CaltratecaHeaderPage;


public class CaltratecaHeaderTest extends BaseClass {
	
	CaltratecaHeaderPage ch;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ch=new CaltratecaHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_caConfig.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_caConfig.properties").getProperty("liveHomepageUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyCaltrateLogosLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickoncaltrateslogo();
	        System.out.println("Verify Caltrate Logo on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickoncaltrateslogo();
	        System.out.println("Verify Caltrate Logo on Live Url");
		}							
	
	 @Test(priority=2,enabled=true)
		public void verifycountryselectorLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonCountrySelector();
	        System.out.println("Verify Country selector on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickonCountrySelector();
	        System.out.println("Verify Country selector  on Live Url");
		}				
	 @Test(priority=3,enabled=true)
		public void verifysearchIconLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonSearchIcon();
	        System.out.println("Verify Search Icon on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickonSearchIcon();
	        System.out.println("Verify Search Icon on Live Url");
		}				
	
	 @Test(priority=4,enabled=true)
		public void verifyProductsHeaderLink() throws Throwable
		{
			switchingTab(firstTab);
	        ch.clickonproducts();
	        System.out.println("Verify Products visible  on Preprod Url");
	        switchingTab(secondTab);
	        ch.clickonproducts();
	        System.out.println("Verify Products visible  on Live Url");
		}		
		 @Test(priority=5,enabled=true)
			public void verifyProductsMainLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickonproductMain();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickonproductMain();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for products main:"+compareTwoText);
			}		
		 @Test(priority=6,enabled=true)
			public void verifyCaltrateplusLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltrateplus();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltrateplus();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate plus:"+compareTwoText);
			}		
		 @Test(priority=7,enabled=true)
			public void verifyVitaminDLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickonvitaminD();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickonvitaminD();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for vitaminD:"+compareTwoText);
			}		
		 @Test(priority=8,enabled=true)
			public void verifyCaltrateselectLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltrateselect();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltrateselect();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate select:"+compareTwoText);
			}		
		 @Test(priority=9,enabled=true)
			public void verifyCaltrateLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltrate();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltrate();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate :"+compareTwoText);
			}		
		 @Test(priority=10,enabled=true)
			public void verifyCaltrategummiesLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltrategummies();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltrategummies();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate gummies :"+compareTwoText);
			}		
		 @Test(priority=11,enabled=true)
			public void verifyCaltratesoftchewsLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltratesoftchews();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltratesoftchews();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate softchews :"+compareTwoText);
			}		
		 @Test(priority=11,enabled=true)
			public void verifyCaltratepluschewablesLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickoncaltratepluschewables();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickoncaltratepluschewables();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for caltrate plus chewables :"+compareTwoText);
			}		
		 @Test(priority=12,enabled=true)
			public void verifyCompareAllProductsLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickonCompareAllproducts();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickonCompareAllproducts();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for Compare All Products :"+compareTwoText);
			}		
		 @Test(priority=13,enabled=true)
			public void verifyCouponsLink() throws Throwable
			{
				switchingTab(firstTab);
		        ch.clickonCoupons();
		        String preProdUrl = compareUrl(excelRead("Caltrate-ca", 1, 0));
		        switchingTab(secondTab);
		        ch.clickonCoupons();
		        String liveUrl = compareUrl(excelRead("Caltrate-ca", 1, 1));
		        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		        System.out.println("Preprod URL and Live URL are same for Coupons :"+compareTwoText);
			}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	

}
