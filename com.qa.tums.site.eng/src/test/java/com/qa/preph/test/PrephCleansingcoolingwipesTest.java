package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephCleansingcoolingwipesPage;

public class PrephCleansingcoolingwipesTest extends BaseClass{
	
	PrephCleansingcoolingwipesPage prw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 prw=new PrephCleansingcoolingwipesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdCleansingCoolingwipesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveCleansingCoolingwipesUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        prw.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=3,enabled=true)
		public void verifyCleansingCoolingWipesBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonCleansingcoolingwipesBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonCleansingcoolingwipesBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cleansing cooling wipes:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyFullProductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonfullproductlabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonfullproductlabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Full Product Label:"+compareTwoText);
		}						
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonBuyNowbtn();
	        System.out.println("Verified BuyNow  Button is present on Preprod url");
	        switchingTab(secondTab);
	        prw.clickonBuyNowbtn();
	        System.out.println("Verified BuyNow  Button is present on Live url");
		}						
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeViewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Live Url");
		}					
	 @Test(priority=8,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        prw.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for learnmore:"+compareTwoText);
		}							
	 @Test(priority=9,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Live Url");
		}					
	 @Test(priority=10,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Live Url");
		}					
	 @Test(priority=11,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Live Url");
		}					
	 @Test(priority=12,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        prw.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        prw.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Live Url");
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
