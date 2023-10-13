package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHsignsofhemorrhoidsPage;

public class PrepHsignsofhemorrhoidsTest extends BaseClass{
	
	
	PrepHsignsofhemorrhoidsPage phr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 phr=new PrepHsignsofhemorrhoidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdsignsofhemorrhoidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LivesignsofhemorrhoidsUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
			phr.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        phr.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 phr.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=2,enabled=true)
		public void verifyArticleBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 phr.clickonArticleBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonArticleBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ArticleBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifysignhemorrhoidsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 phr.clickonsignhemorrhoidsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonsignhemorrhoidsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for signhemorrhoids_Breadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=4,enabled=true)
		public void verifyReadMore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        phr.clickonReadMore1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonReadMore1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyReadMore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        phr.clickonReadMore2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonReadMore2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyReadMore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        phr.clickonReadMore3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        phr.clickonReadMore3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}					
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
