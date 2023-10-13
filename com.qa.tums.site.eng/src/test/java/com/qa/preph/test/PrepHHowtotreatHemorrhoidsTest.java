package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHhowtotreatHemorrhoidsPage;

public class PrepHHowtotreatHemorrhoidsTest extends BaseClass{
	
	PrepHhowtotreatHemorrhoidsPage pdf;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pdf=new PrepHhowtotreatHemorrhoidsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdHowtotreathemorrhoidsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveHowtotreathemorrhoidsUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pdf.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pdf.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=2,enabled=true)
		public void verifyVideoBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonVideo_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonVideo_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Video_Breadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=3,enabled=true)
		public void verifyhowtotreathemorrhoidBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonhowtotreathemorrhoids_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonhowtotreathemorrhoids_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forhowtotreathemorrhoids_Breadcrumbs:"+compareTwoText);
		}	
	 @Test(priority=4,enabled=true)
		public void verifyhowtotreathemorrhoidVideoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonVideohowtreathemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonVideohowtreathemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same Video on How to treat hemorrhoids:"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyReliefFinderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonReliefinder();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonReliefinder();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same Relief finder:"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyRelatedvideos1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonRelatedVideo1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonRelatedVideo1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related videos1:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyRelatedvideos2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonRelatedVideo2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonRelatedVideo2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related videos2:"+compareTwoText);
		}						
	 @Test(priority=8,enabled=true)
		public void verifyRelatedvideos3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pdf.clickonRelatedVideo3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pdf.clickonRelatedVideo3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Related videos3:"+compareTwoText);
		}						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
