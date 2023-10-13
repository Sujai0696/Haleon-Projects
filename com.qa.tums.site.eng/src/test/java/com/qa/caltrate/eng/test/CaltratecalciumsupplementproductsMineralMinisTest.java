package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltratecalciumsupplementproductsMineralMinisPage;

public class CaltratecalciumsupplementproductsMineralMinisTest extends BaseClass {

	CaltratecalciumsupplementproductsMineralMinisPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltratecalciumsupplementproductsMineralMinisPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltratecalciumsupplementsproductsMineralMinisUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltratecalciumsupplementsproductsMineralMinisUrl"));
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
		public void verifyCaltrateplusmineralminisbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrateplusmineralminisbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrateplusmineralminisbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyBuYnowLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrateplusmineralminisbuyNow();
	        System.out.println("Verify BuyNow on Preprod Url");
	        switchingTab(secondTab);
	        cc.clickonCaltrateplusmineralminisbuyNow();
	       System.out.println("Verify BuyNow on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifygetcouponsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyTastingTabletLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickontastingtablet();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickontastingtablet();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyCaltratemineralchewablesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratemineralchewables();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratemineralchewables();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyCaltratemineralchewables_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratemineralchewables_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratemineralchewables_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyCaltrate600d3Link() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyCaltrate600d3_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltrate600d3_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltrate600d3_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyCalciumgummybitesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumgummybites();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumgummybites();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyCalciumgummybites_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumgummybites_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumgummybites_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=13,enabled=true)
		public void verifyCaltratesoftchewsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratesoftchews();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratesoftchews();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=14,enabled=true)
		public void verifyCaltratesoftchews_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratesoftchews_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratesoftchews_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=15,enabled=true)
		public void verifyCaltratesplusMineralsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratesplusmMinerals();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratesplusmMinerals();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyCaltratesplusMinerals_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratesplusmMinerals_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratesplusmMinerals_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyViewAllproductsLink() throws Throwable
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
	 @Test(priority=18,enabled=true)
		public void verifyVitaminDLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonVitaminD();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonVitaminD();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyVitaminD_imgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonVitaminD_img();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonVitaminD_img();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
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
