package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephhaveitchybuttPage;

public class PrephhaveitchybuttTest extends BaseClass{
	
	PrephhaveitchybuttPage psh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 psh=new PrephhaveitchybuttPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdHaveItchyButtUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveHaveItchyButtUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        psh.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        psh.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=2,enabled=true)
		public void verifyArticleBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonArticleBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonArticleBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ArticleBreadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=3,enabled=true)
		public void verifyHaveitchybuttBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonhaveitchybuttBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonhaveitchybuttBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for haveitchybuttBreadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=4,enabled=true)
		public void verifyHemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonHemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonHemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for hemorrhoids:"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyReducingConstipationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonReducingConstipation();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonReducingConstipation();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reducing Constipation:"+compareTwoText);
		}						
	 @Test(priority=6,enabled=true)
		public void verifyOintmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonOintment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonOintment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyMedicatedwipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonMedicatedwipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonMedicatedwipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicatedwipes:"+compareTwoText);
		}						
	 @Test(priority=8,enabled=true)
		public void verifyReadMore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonReadMore1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonReadMore1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyReadMore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonReadMore2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonReadMore2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyReadMore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        psh.clickonReadMore3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        psh.clickonReadMore3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
