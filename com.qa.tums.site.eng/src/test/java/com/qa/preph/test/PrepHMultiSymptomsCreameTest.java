package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHMultiSymptomsCreamePage;

public class PrepHMultiSymptomsCreameTest extends BaseClass{
	
	PrepHMultiSymptomsCreamePage pm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pm=new PrepHMultiSymptomsCreamePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdMultisymptomsCreameUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveMultisymptomsCreameUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pm.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}											
	 @Test(priority=2,enabled=true)
		public void verifyProductsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonProductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonProductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ProductsBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyMultisymptomsBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonMultisymptomsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonMultisymptomsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MultiSymptomsBreadcrumbs:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifyFullProductLabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonFullProductLabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonFullProductLabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FullProductLabel:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonBuyNowButton();
	        System.out.println("Verified BuyNow Button on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonBuyNowButton();
	        System.out.println("Verified BuyNow Button on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonCoupons();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonCoupons();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyEnlargeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonEnlarge();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonEnlarge();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Enlarge:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifyYouTubeDisplayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonYouTubeBtn();
	        System.out.println("Verified  YouTube Video is Played successfully on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonYouTubeBtn();
	        System.out.println("Verified  YouTube Video is Played successfully on Live Url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyLearnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonLearnmore();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonLearnmore();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Learnmore:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonBenefits();
	        System.out.println("Verified Benefits is present on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonBenefits();
	        System.out.println("Verified Benefits is present on Live Url");
		}					
	 @Test(priority=11,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonSizes();
	        System.out.println("Verified Sizes is present on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonSizes();
	        System.out.println("Verified Sizes is present on Live Url");
		}						
	 @Test(priority=12,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonApplication();
	        System.out.println("Verified Application is present on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonApplication();
	        System.out.println("Verified Application is present on Live Url");
		}				
	 @Test(priority=13,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonWarning();
	        System.out.println("Verified Warning is present on Preprod Url");
	        switchingTab(secondTab);
	        pm.clickonWarning();
	        System.out.println("Verified Warning is present on Live Url");
		}						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
