package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenedoihavedrymouthPage;

public class biotenedoihavedrymouthTest extends BaseClass{
	
	biotenedoihavedrymouthPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenedoihavedrymouthPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenedoihavedrymouthUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenedoihavedrymouthUrl"));
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
		public void verifySelfAssesmentBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSelfAssesmentBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSelfAssesmentBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SelfAssesmentBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyCarouselquestion1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCarousel1();
	        System.out.println("Carousel is Successfully Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonCarousel1();
	       System.out.println("Carousel is Successfully Verified on Live Url");
		}				
	 @Test(priority=4,enabled=true)
		public void verifyCarouse2question1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCarousel2();
	        System.out.println("Carousel is Successfully Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonCarousel2();
	        System.out.println("Carousel is Successfully Verified on Live Url");
		}				
	 @Test(priority=5,enabled=true)
		public void verifyCarouse3question1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCarousel3();
	        System.out.println("Carousel is Successfully Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonCarousel3();
	        System.out.println("Carousel is Successfully Verified on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyCarouse4question1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCarousel4();
	        System.out.println("Carousel is Successfully Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonCarousel4();
	        System.out.println("Carousel is Successfully Verified on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCarouse5question1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCarousel5();
	        System.out.println("Carousel is Successfully Verified on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonCarousel5();
	        System.out.println("Carousel is Successfully Verified on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyTakeQuizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickontakeQuiz();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickontakeQuiz();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for TakeQuiz:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyGetcouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickongetcoupons();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickongetcoupons();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}				
	 @Test(priority=10,enabled=true)
		public void verifyShopnowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonShopnow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonShopnow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Shopnow:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
