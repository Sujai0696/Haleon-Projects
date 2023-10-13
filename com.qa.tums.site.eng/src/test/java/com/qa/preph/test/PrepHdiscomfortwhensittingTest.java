package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHdiscomfortwhensittingPage;

public class PrepHdiscomfortwhensittingTest extends BaseClass{
	
	PrepHdiscomfortwhensittingPage pd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pd=new PrepHdiscomfortwhensittingPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdDiscomfortwhilesittingUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveDiscomfortwhilesittingUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pd.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pd.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=2,enabled=true)
		public void verifyArticleBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonArticleBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonArticleBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ArticleBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifyDiscomfortwhilesittingBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonDiscomfortwhilesittingBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonDiscomfortwhilesittingBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Discomfortwhilesitting_Breadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyCommoncausesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickoncommoncause();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickoncommoncause();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Common Causes:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyFindReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonFindRelief();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonFindRelief();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Find Relief:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyHemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonHemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonHemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyTreatingCreamPrepHLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonTreatingCreamePrepH();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonTreatingCreamePrepH();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Treating Creame PrepH:"+compareTwoText);
		}					
	 @Test(priority=8,enabled=true)
		public void verifyRelieveSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonRelieveSymptoms();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonRelieveSymptoms();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for RelieveSymptoms:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyReadMore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonReadMore1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	       pd.clickonReadMore1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore1:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyReadMore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonReadMore2();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonReadMore2();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}					
	 @Test(priority=11,enabled=true)
		public void verifyReadMore3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        pd.clickonReadMore3();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pd.clickonReadMore3();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore3:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
