package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephOintmentPage;

public class PrephOintmentTest extends BaseClass{
	
	PrephOintmentPage po;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 po=new PrephOintmentPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdOintmentUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveOintmentUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        po.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=3,enabled=true)
		public void verifyOintmentBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonOintmentBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonOintmentBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment_Breadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=4,enabled=true)
		public void verifyFullProductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonFullProductLabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonFullProductLabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FullpRoductLabel:"+compareTwoText);
		}								
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonBuyNowBtn();
	        System.out.println("Verified BuyNow is Present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonBuyNowBtn();
	        System.out.println("Verified BuyNow is Present on Live  Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}								
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeViewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonEnlargeView();
	        System.out.println("Verified Enlargeview is Present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonEnlargeView();
	        System.out.println("Verified Enlargeview is Present on Live  Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifyYouTubeDisplayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonYouTubeBtn();
	        System.out.println("Verified  YouTube Video is Played successfully on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonYouTubeBtn();
	        System.out.println("Verified  YouTube Video is Played successfully on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        po.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Learnmore:"+compareTwoText);
		}						
	 @Test(priority=10,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonBenefits();
	        System.out.println("Verified Benefits is present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonBenefits();
	        System.out.println("Verified Benefits is present on Live Url");
		}						
	 @Test(priority=11,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonSizes();
	        System.out.println("Verified Sizes is present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonSizes();
	        System.out.println("Verified Sizes is present on Live Url");
		}						
	 @Test(priority=12,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonApplication();
	        System.out.println("Verified Application is present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonApplication();
	        System.out.println("Verified Application is present on Live Url");
		}						
	 @Test(priority=13,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        po.clickonWarning();
	        System.out.println("Verified Warning is present on Preprod Url");
	        switchingTab(secondTab);
	        po.clickonWarning();
	        System.out.println("Verified Warning is present on Live Url");
		}						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
