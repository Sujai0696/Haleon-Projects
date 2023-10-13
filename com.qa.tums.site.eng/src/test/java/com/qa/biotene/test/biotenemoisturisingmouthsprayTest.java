package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenemoisturisingmouthsprayPage;

public class biotenemoisturisingmouthsprayTest extends BaseClass{
	
	biotenemoisturisingmouthsprayPage bl;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bl=new biotenemoisturisingmouthsprayPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneMoisturisingmouthsprayUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneMoisturisingmouthsprayUrl"));
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
		public void verifyBioteneproductsBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonBioteneproductsBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonBioteneproductsBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BioteneproductsBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyBioteneMoisturizingproductsBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonBiotenemoisturizingBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonBiotenemoisturizingBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Biotenemousturizingproducts_Breadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyReviewLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonReview();
	        System.out.println("Review is verified successfully on preprod url");
	        switchingTab(secondTab);
	        bl.clickonReview();
	        System.out.println("Review is verified successfully on Live url");
		}	
	 @Test(priority=5,enabled=true)
		public void verifyLearnMoreOneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreOne();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreOne();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreOne:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyLearnMoreTwoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreTwo();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreTwo();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreTwo:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyLearnMoreThreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreThree();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreThree();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreThree:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyLearnMoreFourLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreFour();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreFour();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreFour:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyLearnMoreFiveLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreFive();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreFive();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreFive:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyLearnMoreSixLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreSix();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreSix();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreSix:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyLearnMoreSevenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickLearnMoreSeven();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickLearnMoreSeven();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LearnMoreSeven:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyPreviousAndNextArrowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickPreviousAndNextArrow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickPreviousAndNextArrow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PreviousAndNextArrow:"+compareTwoText);
		}			
	 
	 @Test(priority=13,enabled=true)
		public void verifyGetcouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonGetcoupons();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonGetcoupons();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for getcoupons:"+compareTwoText);
		}				
	
	 @Test(priority=14,enabled=true)
		public void verifytakequizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonTakequiz();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonTakequiz();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for takequiz:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyShopnowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonShopnow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonShopnow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Shopnow:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
