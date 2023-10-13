package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenedrymouthrelieftipsPage;

public class biotenedrymouthrelieftipsTest extends BaseClass{
	
	biotenedrymouthrelieftipsPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenedrymouthrelieftipsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenedrymouthRelieftipsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenedrymouthRelieftipsUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyLivingdrymouthLinkbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingdrymouthBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyTipsBiotenebreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTipsbioteneBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTipsbioteneBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for tipsbiotene_Breadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=4,enabled=true)
		public void verifydobetterthisyearbreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbetteryearBiotene();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbetteryearBiotene();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for betteryear_Breadcrumbs:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyDailyRoutineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondailyroutine();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondailyroutine();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DailyRoutine:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifynonirratingFluroideLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonnonirratingFluroide();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonnonirratingFluroide();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for nonirratingFluroide:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyReadmore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReadmore1();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReadmore1();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyReadmore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReadmore2();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReadmore2();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifyReadmore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReadmore3();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReadmore3();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
