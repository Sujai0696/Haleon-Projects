package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenedrymouthHealthImpactPage;

public class biotenedrymouthHealthImpactTest extends BaseClass{
	
	biotenedrymouthHealthImpactPage bw;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bw=new biotenedrymouthHealthImpactPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenedrymouthHealthImpactUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenedrymouthHealthImpactUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bw.clickonCookieBtn();
	        bw.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bw.clickonCookieBtn();
	        bw.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyImpactonOralHealthBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonImpactonOralHealthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonImpactonOralHealthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ImpactonBreadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyReliefcare_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonReliefCare_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonReliefCare_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reliefcare_learnmore:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyUnderstandingdeymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonUnderstandingdrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonUnderstandingdrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understandingdrymouth_learnmore:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyDrymouthDiagnosis_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonDrymouthDiagnosis_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonDrymouthDiagnosis_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthDiagnosis_learnmore:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifywhatisSalvia_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonwhatisSalvia_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonwhatisSalvia_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatisSalvia_learnmore:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyNaturalRemediesdrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonNaturalRemedies_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonNaturalRemedies_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for NaturalRemedies_learnmore:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyFoodhelpdrymouth_learnmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bw.clickonFoodhelpdrymouth_learnmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bw.clickonFoodhelpdrymouth_learnmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FoodHelpdrymouth_learnmore:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
