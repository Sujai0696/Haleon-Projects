package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHinsertsuppositoryPage;

public class PrepHinsertsuppositoryTest extends BaseClass{
	
	PrepHinsertsuppositoryPage pis;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pis=new PrepHinsertsuppositoryPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdInsertsuppositryUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveInsertsuppositryUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pis.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pis.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=2,enabled=true)
		public void verifyVideoBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonVideo_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonVideo_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Video_Breadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=3,enabled=true)
		public void verifyPrepartionHsuppository_BreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonPrepartionHsuppository_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonPrepartionHsuppository_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PrepartionHsuppository_Breadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=4,enabled=true)
		public void verifyVideosPrepartionHsuppostoryLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pis.clickonCookieBtn();
	        pis.clickonVideoDisplayInsertPrepartionH();
	       System.out.println("Verified the Display of Video is played successfully on Preprod url");
	        switchingTab(secondTab);
	        pis.clickonCookieBtn();
	        pis.clickonVideoDisplayInsertPrepartionH();
	       System.out.println("Verified the Display of Video is played successfully on Live url");
		}							
	 @Test(priority=5,enabled=true)
		public void verifySuppostoriesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonSuppostories();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonSuppostories();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Suppostories:"+compareTwoText);
		}				
	
	 @Test(priority=6,enabled=true)
		public void verifyPhysicalActivityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonPhysicalActivity();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonPhysicalActivity();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Physical Activity:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifyRelatedVideo1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideo1:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifyRelatedVideo2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideo2:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyRelatedVideo3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideo3:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
