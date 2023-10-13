package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateOestoporosisMedicineEnoughPage;

public class CaltrateOestoporosisMedicineEnoughTest extends BaseClass{
	
	CaltrateOestoporosisMedicineEnoughPage co;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		co=new CaltrateOestoporosisMedicineEnoughPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltrateOestoporosisMedicineEnoughUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltrateOestoporosisMedicineEnoughUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        co.clickCookieBtn();
	        System.out.println("Cookie in preprod url");
	        switchingTab(secondTab);
	        co.clickCookieBtn();
	        System.out.println("Cookie  in Live url");
		}		
	 @Test(priority=1,enabled=true)
		public void verifyCaltrateHomeBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCaltrateHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCaltrateHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyCaltratehealthprofessionalsBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCaltrateHealthprofessionalsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCaltrateHealthprofessionalsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyOestoporosisMedicineEnoughBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonOestoporosisEnoughBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonOestoporosisEnoughBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyReduceRiskOestoporosisLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonReduceRiskOestoporosis();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonReduceRiskOestoporosis();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyFindOutHowLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonFindouthow();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonFindouthow();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAllArticlesLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonAllArticles();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonAllArticles();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyAllRecipesLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonAllRecipes();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonAllRecipes();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=8,enabled=true)
		public void verifyAllHealthTipsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonAllHealthTips();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonAllHealthTips();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyAllInteractivetoolsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonAllInteractiveTools();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonAllInteractiveTools();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCalciumCarbonateViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonCalciumcarbonateView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonCalciumcarbonateView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyVitaminDViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonvitaminDView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonvitaminDView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=12,enabled=true)
		public void verifyOestoporosisViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonOsteoporsisView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickonOsteoporsisView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifycalciumSupplementsViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickoncalciumsupplementsView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        co.clickoncalciumsupplementsView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
