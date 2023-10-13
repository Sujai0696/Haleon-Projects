package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltrateHeaderFrPage;

public class CaltrateHeaderFrTest extends BaseClass{
	
	CaltrateHeaderFrPage hfr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		hfr=new CaltrateHeaderFrPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_frConfig.properties").getProperty("preProdHomepagefrUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_frConfig.properties").getProperty("liveHomepagefrUrl"));
		 }
	 @Test(priority=1,enabled=true)
		public void verifyCaltrateFrLogoLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonCaltrateFrLogo();
	        System.out.println("Verify Caltrate Logo on Preprod Url");
	        switchingTab(secondTab);
	        hfr.clickonCaltrateFrLogo();
	        System.out.println("Verify Caltrate Logo on Live Url");
		}				
	 @Test(priority=2,enabled=true)
		public void verifycountrySelectorFrLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonCountrySelector();
	        System.out.println("Verify Country Selector FR on Preprod Url");
	        switchingTab(secondTab);
	        hfr.clickonCountrySelector();
	        System.out.println("Verify Country Selector FR  on Live Url");
		}		
	 @Test(priority=3,enabled=true)
		public void verifySearchIconLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonSearchIcon();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonSearchIcon();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For Search Icon:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyProduitsHeadingLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonProduitsheading();
	        System.out.println("Verify Produits Header FR on Preprod Url");
	        switchingTab(secondTab);
	        hfr.clickonProduitsheading();
	        System.out.println("Verify Produits Header FR  on Live Url");
		}		
	 @Test(priority=4,enabled=true)
		public void verifyMainProduitLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonMainproducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonMainproducts();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For Main produit:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyCaltratePlusLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickoncaltrateplus();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickoncaltrateplus();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For caltrate plus:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyCaltrateSelectLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickoncaltrateselect();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickoncaltrateselect();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For caltrate select:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickoncaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickoncaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For caltrate :"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyGeléesCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonGeléesCaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonGeléesCaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For GeléesCaltrate :"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCarrésàmâcherCaltrateLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonCarrésàmâcherCaltrate();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonCarrésàmâcherCaltrate();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For CarrésàmâcherCaltrate :"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifycaltatePLUScroquerLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickoncaltatePLUScroquer();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickoncaltatePLUScroquer();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For caltatePLUScroquer :"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyComparertouslesproduitsLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonComparertouslesproduits();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonComparertouslesproduits();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For Comparertouslesproduits :"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        hfr.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        hfr.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  For coupons :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
