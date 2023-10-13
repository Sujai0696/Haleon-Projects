package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHhemorroidallfunPage;

public class PrepHhemorroidallfunTest extends BaseClass{
	
	PrepHhemorroidallfunPage pis;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pis=new PrepHhemorroidallfunPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdhemorroidallfunUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LivehemorroidallfunUrl"));
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
		public void verifyHemorroidruinallBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonHemorroidruinallbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonHemorroidruinallbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HemorroidruinallBreadCrumbs:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyHemorroidruinallVideoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonVideoHemorroidRuinall();
	        System.out.println("Verified the Display of Video is played successfully on Preprod url");
	        switchingTab(secondTab);
	        pis.clickonVideoHemorroidRuinall();
	        System.out.println("Verified the Display of Video is played successfully on Live url");
		}					
	 @Test(priority=5,enabled=true)
		public void verifyRelatedVideos1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideos1:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyRelatedVideos2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideos2:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyRelatedVideos3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pis.clickonRelatedVideo3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pis.clickonRelatedVideo3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelatedVideos3:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
