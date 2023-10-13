package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltratecalciumcarbonatecitratePage;


public class CaltratecalciumcarbonatecitrateTest extends BaseClass{
	
	CaltratecalciumcarbonatecitratePage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltratecalciumcarbonatecitratePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltrateCalciumcarbonatecitrateUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltrateCalciumcarbonatecitrateUrl"));
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
		public void verifyBonehealthcentralbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonBonehealthcentralbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonBonehealthcentralbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}					
	 @Test(priority=3,enabled=true)
		public void verifyArticlesbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonArticlebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonArticlebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifycalciumcarbonatecitratebreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumcarbonatecitratebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumcarbonatecitratebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyCalciumcarbonateTagLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumcarbonateTag();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumcarbonateTag();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyCalciumSupplementTagLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumsupplementsTag();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumsupplementsTag();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyArticleTagLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonArticleTag();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonArticleTag();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyQuickHealthTipLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonQuickhealthTip();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonQuickhealthTip();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyViewTipsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonViewTip();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonViewTip();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyQuickHealthTipsImageLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonQuickHealthTipsImage();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonQuickHealthTipsImage();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCaltrate600d3MineralsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrate600d3Minerals();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrate600d3Minerals();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyAllArticlesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllArticles();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllArticles();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyAllRecipesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllRecipes();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllRecipes();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=13,enabled=true)
		public void verifyAllHealthTipsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllHealthTips();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllHealthTips();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyAllInteractivetoolsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllInteractiveTools();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllInteractiveTools();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyCalciumCarbonateViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumcarbonateView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumcarbonateView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyVitaminDViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonvitaminDView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonvitaminDView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=17,enabled=true)
		public void verifyOestoporosisViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonOsteoporsisView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonOsteoporsisView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifycalciumSupplementsViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumsupplementsView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumsupplementsView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
