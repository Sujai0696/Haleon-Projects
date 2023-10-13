package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.bioteneHeaderPage;

public class bioteneHeaderTest extends BaseClass{
	
	bioteneHeaderPage bh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bh=new bioteneHeaderPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("liveHomepageUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bh.clickonCookieBtn();
	        bh.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bh.clickonCookieBtn();
	        bh.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyFindRightProductLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonFindtheRightProduct();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonFindtheRightProduct();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FindRightProduct:"+compareTwoText);
		}		
	 @Test(priority=2,enabled=true)
		public void verifySaveNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonSaveNow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonSaveNow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SaveNow:"+compareTwoText);
		}		
	 @Test(priority=3,enabled=true)
		public void verifyShopNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonShopNow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonShopNow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ShopNow:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifySearchIconLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonSearchIcon();
	        System.out.println("Verified Search Icon Successfully on Preprod Url");
	        switchingTab(secondTab);
	        bh.ClickonSearchIcon();
	        System.out.println("Verified Search Icon Successfully on Live Url");
		}		
	 @Test(priority=5,enabled=true)
		public void verifyBioteneLogoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonBioteneLogo();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonBioteneLogo();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BioteneLogo:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyWhatisdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonWhatisdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonWhatisdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Whatisdrymouth:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyBioteneProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonBioteneProducts();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonBioteneProducts();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BioteneProducts:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyLivingwithdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonLivingwithdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonLivingwithdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Livingwithdrymouth:"+compareTwoText);
		}		
	 @Test(priority=9,enabled=true)
		public void verifySelfAssesmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bh.ClickonSelfAssesment();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bh.ClickonSelfAssesment();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SelfAssesment:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
