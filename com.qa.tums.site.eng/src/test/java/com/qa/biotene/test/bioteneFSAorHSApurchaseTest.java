package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.bioteneFSAorHSApurchasePage;


public class bioteneFSAorHSApurchaseTest extends BaseClass{
	
	bioteneFSAorHSApurchasePage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new bioteneFSAorHSApurchasePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneFSAorHSApurchaseBioteneUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneFSAorHSApurchaseBioteneUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyFSAorHSApurchasebreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonFSAorHSApurchaseBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonFSAorHSApurchaseBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FSAorHSABreadcrumbs:"+compareTwoText);
		}								
	 @Test(priority=3,enabled=true)
		public void verifyAccordion1() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAccordion1();
	        System.out.println("Accordion is Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAccordion1();
	       System.out.println("Accordion is Verified on Live Url");
		}					
	 @Test(priority=4,enabled=true)
		public void verifyAccordion2() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAccordion2();
	        System.out.println("Accordion2 is Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAccordion2();
	       System.out.println("Accordion2 is Verified on Live Url");
		}			
	 @Test(priority=5,enabled=true)
		public void verifyAccordion3() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAccordion3();
	        System.out.println("Accordion_3 is Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAccordion3();
	       System.out.println("Accordion_3 is Verified on Live Url");
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAccordion4() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAccordion4();
	        System.out.println("Accordion_4 is Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAccordion4();
	       System.out.println("Accordion_4 is Verified on Live Url");
		}			
	 @Test(priority=7,enabled=true)
		public void verifyAccordion5() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAccordion5();
	        System.out.println("Accordion_5 is Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAccordion5();
	       System.out.println("Accordion_5 is Verified on Live Url");
		}			
	 @Test(priority=8,enabled=true)
		public void verifyTakeQuiz() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTakeQuiz();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTakeQuiz();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Take Quiz:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyGetCoupons() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Get Coupons:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyShopnow() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonShopnow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonShopnow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Shop Now:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
