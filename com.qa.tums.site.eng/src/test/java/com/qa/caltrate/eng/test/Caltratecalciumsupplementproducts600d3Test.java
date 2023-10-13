package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.Caltratecalciumsupplementproducts600d3Page;

public class Caltratecalciumsupplementproducts600d3Test extends BaseClass{
	
	Caltratecalciumsupplementproducts600d3Page cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new Caltratecalciumsupplementproducts600d3Page();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltrateCalciumsupplementproducts600d3Url"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltrateCalciumsupplementproducts600d3Url"));
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
		public void verifyhomebreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonHomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonHomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyProductsbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonProductsbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonProductsbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyCaltrate600d3ProductsbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3Productsbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3Productsbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3ProductsBuyNow();
	       System.out.println("Verify BuyNow for caltrate600d3 on preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3ProductsBuyNow();
	        System.out.println("Verify BuyNow for caltrate600d3 on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifyCaltrate600d3ProductsGetCouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3ProductsCoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3ProductsCoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyCaltrategummybitesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrategummybites();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrategummybites();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCaltrategummybites_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrategummybites_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrategummybites_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyCaltrate600d3softchewsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3softchews();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3softchews();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyCaltrate600d3softchews_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3softchews_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3softchews_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyCaltrate600d3PlusMineralMinisLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineralMins();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineralMins();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyCaltrate600d3PlusMineralMinis_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineralMins_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineralMins_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyCaltrate600d3PlusMineralLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineral();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineral();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyCaltrate600d3PlusMineral_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineral_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineral_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifyCaltrate600d3PlusMineralChewablesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineralChewables();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineralChewables();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyCaltrate600d3PlusMineralChewables_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3plusmineralChewables_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3plusmineralChewables_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=15,enabled=true)
		public void verifyViewAllProductsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonviewallproducts();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonviewallproducts();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyStorybonesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonstorybones();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonstorybones();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyStorybones_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonstorybones_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonstorybones_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyReadMoreLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonreadmore();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonreadmore();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
