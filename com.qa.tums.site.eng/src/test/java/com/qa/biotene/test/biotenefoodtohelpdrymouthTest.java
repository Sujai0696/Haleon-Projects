package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenefoodtohelpdrymouthPage;

public class biotenefoodtohelpdrymouthTest extends BaseClass{
	
	biotenefoodtohelpdrymouthPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenefoodtohelpdrymouthPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenefoodtohelpdrymouthUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenefoodtohelpdrymouthUrl"));
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
		public void verifyImpactOralHealthbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonImpactOralHealthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonImpactOralHealthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ImpactOralHealth_Breadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=3,enabled=true)
		public void verifyFoodthatcanhelpdrymouthbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonFoodthatcanhelpdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonFoodthatcanhelpdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for foodthat can help dry mouth_Breadcrumbs:"+compareTwoText);
		}					
	 @Test(priority=4,enabled=true)
		public void verifydrymouth() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouth:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifySalvia() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSalvia();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSalvia();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Salvia:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifyDrinkingwater() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrinkingwater();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrinkingwater();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Drinking water:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyOralRinseMouthwash() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonOralRinsemouthwash();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonOralRinsemouthwash();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for OralRinseMouth wash:"+compareTwoText);
		}				
	 @Test(priority=8,enabled=true)
		public void verifyGentleOralRinse() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonGentleOralRinse();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonGentleOralRinse();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Gentle Oral Rinse:"+compareTwoText);
		}				
	 @Test(priority=9,enabled=true)
		public void verifyDrymouthLozenges() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthLozenge();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthLozenge();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DryMouthLozenges:"+compareTwoText);
		}				
	 @Test(priority=10,enabled=true)
		public void verifyBioteneMoisturizingspray() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBiotenemoisturizungSpray();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBiotenemoisturizungSpray();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Biotene moisturizing spray:"+compareTwoText);
		}				
	 @Test(priority=11,enabled=true)
		public void verifyBestpicnicfood() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbestpicnicfood();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbestpicnicfood();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Best picnic food:"+compareTwoText);
		}				
	 @Test(priority=12,enabled=true)
		public void verifyLivingwithdrymouth() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonlivingwithdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonlivingwithdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Living with dry mouth:"+compareTwoText);
		}				
	 @Test(priority=13,enabled=true)
		public void verifyMeditationwithdrymouth() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonMeditationdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonMeditationdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Meditation with dry mouth:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
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
	 @Test(priority=15,enabled=true)
		public void verifyShopnow() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonShopnow();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonShopnow();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Shop now:"+compareTwoText);
		}				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
