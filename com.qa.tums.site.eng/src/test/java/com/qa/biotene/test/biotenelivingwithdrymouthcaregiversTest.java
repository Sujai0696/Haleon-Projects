package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenelivingwithdrymouthcaregiversPage;

public class biotenelivingwithdrymouthcaregiversTest extends BaseClass{
	
	biotenelivingwithdrymouthcaregiversPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenelivingwithdrymouthcaregiversPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneLivingwithdrymouthcaregiversUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneLivingwithdrymouthcaregiversUrl"));
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
		public void verifyLivingdrymouthLinkbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingdrymouthBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifyCaregiversbreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCaregiversBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCaregiversBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for caregivers_Breadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=4,enabled=true)
		public void verifyDrymouthsymptomscaregiversLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthsymptoms_theymayhave();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthsymptoms_theymayhave();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthsymptoms:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyDrymouthRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthRemedies();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthRemedies();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthRemedies:"+compareTwoText);
		}					
	 @Test(priority=6,enabled=true)
		public void verifycausesdrymouthcaregiversLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCausesdrymouthcaregivers();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCausesdrymouthcaregivers();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for causesdrymouthgivers:"+compareTwoText);
		}					
	
	 @Test(priority=7,enabled=true)
		public void verifyQuizcaregiversLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonQuizcaregivers();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonQuizcaregivers();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Quizcaregivers:"+compareTwoText);
		}					
	 @Test(priority=8,enabled=true)
		public void verifyCaregiverbasketLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCaregiverBasket();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCaregiverBasket();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for caregivers Basket:"+compareTwoText);
		}					
	
	 @Test(priority=9,enabled=true)
		public void verifyChronicIllnessLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonChronicIllness();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonChronicIllness();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for chronic Illnesst:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
