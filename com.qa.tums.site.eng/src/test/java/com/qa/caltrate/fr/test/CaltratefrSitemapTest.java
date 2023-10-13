package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltratefrSitemapPage;

public class CaltratefrSitemapTest extends BaseClass{
	
	CaltratefrSitemapPage co;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		co=new CaltratefrSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_frConfig.properties").getProperty("preProdCaltratefrSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_frConfig.properties").getProperty("LiveCaltratefrSitemapUrl"));
		 }	
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonHomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonHomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Home Breadcrumbs:"+compareTwoText);
		}					
	 @Test(priority=2,enabled=true)
		public void verifyProduitsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonproduits();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonproduits();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Produits:"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyCaltrateplusLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoncaltrateplus();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickoncaltrateplus();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caltrateplus:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyCaltrateVitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoncaltrateVitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickoncaltrateVitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateVitaminD:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyCaltrateselectLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoncaltrateselect();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickoncaltrateselect();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltrateSelect:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoncaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickoncaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caltrate:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyGeleesCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonGeelescaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonGeelescaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GeleesCaltrate:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCarrésmâcherCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCarrésmâcherCaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCarrésmâcherCaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CarrésmâcherCaltrate:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCaltratePLUScroquerLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCaltratePLUScroquer();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCaltratePLUScroquer();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaltratePLUScroquer:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for coupons:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyNousrejoindreLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonNousrejoindre();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonNousrejoindre();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Nousrejoindre:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
