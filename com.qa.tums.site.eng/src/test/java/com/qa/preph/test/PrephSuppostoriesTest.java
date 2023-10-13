package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephSuppostoriesPage;

public class PrephSuppostoriesTest extends BaseClass{
	
	PrephSuppostoriesPage ps;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ps=new PrephSuppostoriesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdSuperstoriesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveSuperstoriesUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ps.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifySuppostoriesBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonSuppostoriesBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonSuppostoriesBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SuppostoriesBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=4,enabled=true)
		public void verifyFullProductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonFullProductLabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonFullProductLabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FullProductLabel:"+compareTwoText);
		}								
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonBuyNowButton();
	        System.out.println("Verified the BuyNow Button is Present on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonBuyNowButton();
	        System.out.println("Verified the BuyNow Button is Present on Live Url");
		}	
	
	 
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeViewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Live Url");
		}					
	 @Test(priority=8,enabled=true)
		public void verifyYouTubeButtonLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonYouTubeBtn();
	        System.out.println("Verified YouTube Button on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonYouTubeBtn();
	        System.out.println("Verified YouTube button  on Live Url");
		}	
	 @Test(priority=9,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Learnmore:"+compareTwoText);
		}					
	 
	 
	 @Test(priority=10,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Live Url");
		}					
	 @Test(priority=11,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Live Url");
		}					
	 @Test(priority=12,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Live Url");
		}			
	 @Test(priority=13,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
