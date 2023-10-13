package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHFsaHsaEligibilityPage;

public class PrepHFsaHsaEligibilityTest extends BaseClass{
	
	PrepHFsaHsaEligibilityPage pfsa;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pfsa=new PrepHFsaHsaEligibilityPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdfsahsaeligibiltyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LivefsahsaeligibiltyUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
			pfsa.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pfsa.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}													
	 @Test(priority=2,enabled=true)
		public void verifyFsaHsaEligibilityBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonFsaHsaEligibility_Breadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pfsa.clickonFsaHsaEligibility_Breadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FSAHSA_Eligibility_Breadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyflexiblesavingaccountsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonflexiblesavingaccounts();
	        System.out.println("Verified Flexible saving accounts on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonflexiblesavingaccounts();
	        System.out.println("Verified Flexible saving accounts on Live Url");
		}						
	 @Test(priority=4,enabled=true)
		public void verifyPrepartionProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonPrepartionProducts();
	        System.out.println("Verified Prepartion Products on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonPrepartionProducts();
	        System.out.println("Verified Prepartion Products on Live Url");
		}						
	 @Test(priority=5,enabled=true)
		public void verifyPrepartionHSAProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonPrepartionHSAProducts();
	        System.out.println("Verified Prepartion HSA Products on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonPrepartionHSAProducts();
	        System.out.println("Verified Prepartion HSA Products on Live Url");
		}						
	 @Test(priority=6,enabled=true)
		public void verifyMoreFAQCenterLink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonmoreFAQCenter();
	        System.out.println("Verified More FAQ Center on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonmoreFAQCenter();
	        System.out.println("Verified More FAQ Center on Live Url");
		}						
	
	 @Test(priority=7,enabled=true)
		public void verifyFrequentlyaskedFSAHSALink() throws Throwable
		{
		 switchingTab(firstTab);
		 pfsa.clickonFrequentlyaskedFAQ();
	        System.out.println("Verified Frequently asked FSAHSA on Preprod Url");
	        switchingTab(secondTab);
	        pfsa.clickonFrequentlyaskedFAQ();
	        System.out.println("Verified Frequently asked FSAHSA on Live Url");
		}						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
