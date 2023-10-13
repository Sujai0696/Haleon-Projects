package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenedrymouthnighttimePage;

public class biotenedrymouthnighttimeTest extends BaseClass{
	
	biotenedrymouthnighttimePage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenedrymouthnighttimePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenedrymouthnighttimeUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenedrymouthnighttimeUrl"));
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
		public void verifyLivingwithdrymouthbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonLivingwithdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonLivingwithdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Livingwithdrymouth_Breadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifyManagingSymptomsnightbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonManagingsymptomsnight_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonManagingsymptomsnight_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MangingSymptomsnight_Breadcrumbs:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyCopedrymouthNighttime() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCopedrymouth_nighttime();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCopedrymouth_nighttime();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cope drymouth Nighttime:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyAnxietyatNight() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAnxietyatnight();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonAnxietyatnight();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Anxietyat night:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyManagingAnxiety() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonManagingAnxiety();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonManagingAnxiety();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managing anxiety:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyGoodbedtime() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonGoodbedtime();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonGoodbedtime();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Good bed time:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifywakeupdrymouth() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonwakeupdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonwakeupdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for wake up dry mouth:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
