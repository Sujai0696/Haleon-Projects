package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenerelievedrymouthsymptomsPage;

public class biotenerelievedrymouthsymptomsTest extends BaseClass{
	
	biotenerelievedrymouthsymptomsPage bl;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bl=new biotenerelievedrymouthsymptomsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenerelievedrymouthsymptomsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenerelievedrymouthsymptomsUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bl.clickonCookieBtn();
	        bl.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bl.clickonCookieBtn();
	        bl.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyLivingdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonlivingdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonlivingdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingdrymouthBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyfindingReliefSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonfindingReliefsymptomsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonfindingReliefsymptomsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FindingReliefsymptomsBreadcrumbs:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyBad_BreathLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonbad_breath();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonbad_breath();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for bad_breath:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifyCarousel_dot1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCarouseldot_1();
	        System.out.println("Verified the Carousel_1 on Preprod Url");
	        switchingTab(secondTab);
	        bl.clickonCarouseldot_1();
	        System.out.println("Verified the Carousel_1 on Live Url");
		}		
	 @Test(priority=6,enabled=true)
		public void verifyCarousel_dot2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCarouseldot_2();
	        System.out.println("Verified the Carousel_2 on Preprod Url");
	        switchingTab(secondTab);
	        bl.clickonCarouseldot_2();
	        System.out.println("Verified the Carousel_2 on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifyCarousel_dot3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCarouseldot_3();
	        System.out.println("Verified the Carousel_3 on Preprod Url");
	        switchingTab(secondTab);
	        bl.clickonCarouseldot_3();
	        System.out.println("Verified the Carousel_3 on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyCarousel_dot4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCarouseldot_4();
	        System.out.println("Verified the Carousel_4 on Preprod Url");
	        switchingTab(secondTab);
	        bl.clickonCarouseldot_4();
	        System.out.println("Verified the Carousel_4 on Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyCarousel_dot5Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCarouseldot_5();
	        System.out.println("Verified the Carousel_5 on Preprod Url");
	        switchingTab(secondTab);
	        bl.clickonCarouseldot_5();
	        System.out.println("Verified the Carousel_5 on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyTakeQuizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonTakeQuiz();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonTakeQuiz();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for TakeQuiz:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyReadMoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonReadMore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonReadMore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadMore:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyReadMore1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonReadMore1();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonReadMore1();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ReadMore1:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
