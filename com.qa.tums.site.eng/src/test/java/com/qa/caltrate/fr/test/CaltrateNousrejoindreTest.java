package com.qa.caltrate.fr.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.fr.pages.CaltrateNousrejoindrePage;

public class CaltrateNousrejoindreTest extends BaseClass{
	
	CaltrateNousrejoindrePage co;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrate_frConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		co=new CaltrateNousrejoindrePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrate_frConfig.properties").getProperty("preProdNousrejoindreUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrate_frConfig.properties").getProperty("LiveNousrejoindreUrl"));
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
		public void verifyNousrejoindreBreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        co.clickonNousejoindrebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate-fr", 1, 0));
	        switchingTab(secondTab);
	        co.clickonNousejoindrebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate-fr", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  for Nousrejoindre Breadcrumbs:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
