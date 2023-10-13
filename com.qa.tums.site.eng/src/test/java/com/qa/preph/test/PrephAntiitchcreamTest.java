package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephAntiitchcreamPage;

public class PrephAntiitchcreamTest extends BaseClass{
	
	PrephAntiitchcreamPage pac;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pac=new PrephAntiitchcreamPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdAntiitchcreamUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveAntiitchcreamUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pac.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=3,enabled=true)
		public void verifyAntiitchcreamBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonantiitchcream_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonantiitchcream_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Anti itch cream:"+compareTwoText);
		}						
	 @Test(priority=4,enabled=true)
		public void verifyFullProductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonfullproductlabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonfullproductlabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Full Product Label:"+compareTwoText);
		}							
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonBuyNowbtn();
	        System.out.println("Verified BuyNow  Button is present on Preprod url");
	        switchingTab(secondTab);
	        pac.clickonBuyNowbtn();
	        System.out.println("Verified BuyNow  Button is present on Live url");
		}						
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}						
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeViewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonEnlargeView();
	        System.out.println("Verified Enlarge View Displayed Successfully with ZoomIn and Out on Live Url");
		}				
	 @Test(priority=8,enabled=true)
		public void verifyYouTubeButtonLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonYouTubeBtn();
	        System.out.println("Verified YouTube Button on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonYouTubeBtn();
	        System.out.println("Verified YouTube button  on Live Url");
		}	
	 @Test(priority=9,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pac.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for learnmore:"+compareTwoText);
		}							
	 @Test(priority=10,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonBenefits();
	        System.out.println("Verified Benefits tab Button  is present on Live Url");
		}					
	 @Test(priority=11,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonSizes();
	        System.out.println("Verified Sizes tab Button  is present on Live Url");
		}					
	 @Test(priority=12,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonApplication();
	        System.out.println("Verified Application tab Button  is present on Live Url");
		}					
	 @Test(priority=13,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pac.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Preprod Url");
	        switchingTab(secondTab);
	        pac.clickonWarning();
	        System.out.println("Verified Warning tab Button  is present on Live Url");
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
