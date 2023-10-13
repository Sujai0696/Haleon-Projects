package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenelivingdrymouthPage;

public class biotenelivingdrymouthTest extends BaseClass{
	
	biotenelivingdrymouthPage bl;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bl=new biotenelivingdrymouthPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenelivingdrymouthUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenelivingdrymouthUrl"));
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
		public void verifyLivingwithdrymouthBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonLivingwithdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonLivingwithdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingwithdrymouthBreadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyManagingDrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonManagingdrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonManagingdrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Managingdrymouth_learnmore:"+compareTwoText);
		}				
	
	 @Test(priority=4,enabled=true)
		public void verifyCaringforSomeone_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCaringforsomeone_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonCaringforsomeone_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CaringforSomeone_learnmore:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyDiabetescausesdrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonDiabetescauseDrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonDiabetescauseDrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diabetescausedrymouth_learnmore:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyAsthmaAllergiesdrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonAsthmaAllergiesdrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonAsthmaAllergiesdrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AsthmaAllergiesdrymouth_learnmore:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyCancerTreatmentdrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonCancertreatmentdrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonCancertreatmentdrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CancerTreatmentdrymouth_learnmore:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifydrymouthTips_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickondrymouthTips_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickondrymouthTips_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthTips_learnmore:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyHowtouseMouthwash_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonHowtousemouthwash_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonHowtousemouthwash_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HowtouseMouthwash_learnmore:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyDrymouthThroatRelated_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bl.clickonDrymouthThroatRelated_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bl.clickonDrymouthThroatRelated_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DrymouththroatRelated_learnmore:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
