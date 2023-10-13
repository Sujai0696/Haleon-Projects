package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateCalciumsupplementproductsPage;


public class CaltrateCalciumsupplementproductsTest extends BaseClass{
	
	CaltrateCalciumsupplementproductsPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltrateCalciumsupplementproductsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltrateCalciumsupplementproductsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltrateCalciumsupplementproductsUrl"));
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
		public void verifyCaltrate600D3Link() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyCaltrate600D3_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyCaltrate600D3_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3_BuyNow();
	      System.out.println("Verify BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3_BuyNow();
	        System.out.println("Verify BuyNow on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCaltrate600D3softchewsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3softchews();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3softchews();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCaltrate600D3softchews_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3softchews_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3softchews_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCaltrate600D3softchews_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3softchews_BuyNow();
	      System.out.println("Verify BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3softchews_BuyNow();
	        System.out.println("Verify BuyNow on Live Url");
		}			
	 @Test(priority=9,enabled=true)
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
	 @Test(priority=10,enabled=true)
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
	 @Test(priority=11,enabled=true)
		public void verifyCaltrategummybites_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrategummybites_BuyNow();
	      System.out.println("Verify BuyNow  for Caltrate gummy bites on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrategummybites_BuyNow();
	        System.out.println("Verify BuyNow  for Caltrate gummy bites on live Url");
		}			
	 @Test(priority=12,enabled=true)
		public void verifyCaltrate600D3MineralsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Minerals();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Minerals();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyCaltrate600D3Minerals_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Minerals_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Minerals_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyCaltrate600D3Minerals_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Minerals_BuyNow();
	      System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Minerals_BuyNow();
	        System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals on live Url");
		}			
	 @Test(priority=15,enabled=true)
		public void verifyCaltrate600D3MineralsChewablesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Mineralschewables();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Mineralschewables();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyCaltrate600D3MineralsChewables_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Mineralschewables_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Mineralschewables_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyCaltrate600D3MineralsChewables_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3Mineralschewables_BuyNow();
	      System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals chewables on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3Mineralschewables_BuyNow();
	        System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals chewables on live Url");
		}			
	 @Test(priority=18,enabled=true)
		public void verifyCaltrate600D3MineralsMinisLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3MineralsMinis();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3MineralsMinis();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyCaltrate600D3MineralsMinis_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3MineralsMinis_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3MineralsMinis_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}	
	 @Test(priority=20,enabled=true)
		public void verifyCaltrate600D3MineralsMinis_BuyNowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600D3MineralsMinis_BuyNow();
	      System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals Minis on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrate600D3MineralsMinis_BuyNow();
	        System.out.println("Verify BuyNow  for Caltrate 600D3 Minerals Minis on live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
