package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephlidocainecreamPage;

public class PrephlidocainecreamTest extends BaseClass{
	
	PrephlidocainecreamPage plc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 plc=new PrephlidocainecreamPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdlidocainecreamUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LivelidocainecreamUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        plc.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}												
	 @Test(priority=3,enabled=true)
		public void verifylidocainecreamBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonlidocaineBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonlidocaineBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for lidocainecreame_Breadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=4,enabled=true)
		public void verifyFullproductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonfullproductlabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonfullproductlabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Fullproduct label:"+compareTwoText);
		}							
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonBuyNowBtn();
	        System.out.println("Verified BuyNow button is displayed on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonBuyNowBtn();
	        System.out.println("Verified BuyNow button is displayed on Live Url");
		}							
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeViewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Live Url");
		}					
	 @Test(priority=8,enabled=true)
		public void verifyYouTubeBtnLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonYouTubeBtn();
	        System.out.println("Verified YouTube button  on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonYouTubeBtn();
	        System.out.println("Verified YouTube button on Live Url");
		}					
	 @Test(priority=9,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        plc.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for learnmore:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Live Url");
		}					
	 @Test(priority=11,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Live Url");
		}					
	 @Test(priority=12,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Live Url");
		}					
	 @Test(priority=13,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        plc.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        plc.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Live Url");
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
