package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephMedicatedportablewipesPage;

public class PrephMedicatedportablewipesTest extends BaseClass{
	
	PrephMedicatedportablewipesPage pm;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pm=new PrephMedicatedportablewipesPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdMedicatedportablewipesUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveMedicatedportablewipesUrl"));
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
	 @Test(priority=2,enabled=true)
		public void verifyMedicatedWipesBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonMedicatedwipesBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonMedicatedwipesBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MedicatedWipesBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyFullproductlabelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonFullproductlabel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonFullproductlabel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Fullproductlabel:"+compareTwoText);
		}							
	 @Test(priority=4,enabled=true)
		public void verifyBuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonBuyNow();
	        System.out.println("Verified BuyNow is displayed on Preprod url");
	        switchingTab(secondTab);
	        pm.clickonBuyNow();
	        System.out.println("Verified BuyNow is displayed on Live url");
		}							
	 @Test(priority=5,enabled=true)
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
	 @Test(priority=6,enabled=true)
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
	 @Test(priority=7,enabled=true)
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
	 @Test(priority=8,enabled=true)
		public void verifyBenefitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonBenefitsActive();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonBenefitsActive();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Benefits:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyOintmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonOintment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonOintment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment:"+compareTwoText);
		}				
	 @Test(priority=10,enabled=true)
		public void verifySoothingReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonSoothingRelief();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonSoothingRelief();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing Relief:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyCoolingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonCooling();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonCooling();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cooiling:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifySuppostoriesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonSuppostories();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonSuppostories();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Suppostories:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifySizesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonSizes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonSizes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sizes:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyApplicationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonApplication();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonApplication();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Application:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyWarningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pm.clickonWarning();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pm.clickonWarning();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Warning:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
