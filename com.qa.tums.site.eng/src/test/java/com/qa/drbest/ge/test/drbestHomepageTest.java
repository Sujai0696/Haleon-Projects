package com.qa.drbest.ge.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.drbest.ge.pages.drbestHomepagePage;

public class drbestHomepageTest extends BaseClass{
	
	drbestHomepagePage dh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("drbest_deConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 dh=new drbestHomepagePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("drbest_deConfig.properties").getProperty("preProddrbestHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("drbest_deConfig.properties").getProperty("livedrbestHomepageUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifydrbestcookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonCookieBtn();
	        System.out.println("Verify drbest Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyCarouselOneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonCarouselOneProductcard();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonCarouselOneProductcard();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CarouselOne:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifyCarouselTwoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonCarouselTwoProductcard();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonCarouselTwoProductcard();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CarouselTwo:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyCarouselThreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonCarouselThreeProductcard();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonCarouselThreeProductcard();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CarouselThree:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyCarouselFourLink() throws Throwable
		{
		 switchingTab(firstTab);
	        dh.clickonCarouselFourProductcard();
	        String preProdUrl = compareUrl(excelRead("drbest-de", 1, 0));
	        switchingTab(secondTab);
	        dh.clickonCarouselFourProductcard();
	        String liveUrl = compareUrl(excelRead("drbest-de", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CarouselFour:"+compareTwoText);
		}
	 
	 @Test(priority=5,enabled=true)
		public void verifyQuiz1Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz1();
	        System.out.println("Verify drbest Quiz on Live Url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyQuiz2Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz2();
	        System.out.println("Verify drbest Quiz2 on Live Url");
		}				
	 @Test(priority=7,enabled=true)
		public void verifyQuiz3Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz3();
	        System.out.println("Verify drbest Quiz3 on Live Url");
		}				
	 @Test(priority=8,enabled=true)
		public void verifyQuiz4Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz4();
	        System.out.println("Verify drbest Quiz4 on Live Url");
		}				
	 @Test(priority=9,enabled=true)
		public void verifyQuiz5Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz5();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}				
	 @Test(priority=10,enabled=true)
		public void verifyQuiz6Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz6();
	        System.out.println("Verify drbest Quiz5 on Live Url");
		}
	 @Test(priority=11,enabled=true)
		public void verifyQuiz7Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz7();
	        System.out.println("Verify drbest Quiz7 on Live Url");
		}	
	 @Test(priority=12,enabled=true)
		public void verifyQuiz8Link() throws Throwable
		{
			switchingTab(firstTab);
	        dh.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Preprod Url");
	        switchingTab(secondTab);
	        dh.clickonQuiz8();
	        System.out.println("Verify drbest Quiz8 on Live Url");
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	

}
