package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.bioteneSitemapPage;


public class bioteneSitemapTest extends BaseClass{
	
	bioteneSitemapPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new bioteneSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneSitemapUrl"));
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
		public void verifySitemapBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSitemapBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSitemapBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SitemapBreadcrumbs:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifybiodentistRecommendedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbiodentistrecommended();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbiodentistrecommended();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for biodentistrecommended:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifywhatisdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonwhatisdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonwhatisdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatisdrymouth:"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifymediationcauseReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonmediationcausesRelief();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonmediationcausesRelief();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for MediationcauseRelief:"+compareTwoText);
		}				
	 @Test(priority=6,enabled=true)
		public void verifyCottonmouthcausesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickoncottonmouth_causes();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickoncottonmouth_causes();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cottonmouth_cause:"+compareTwoText);
		}				
	 @Test(priority=7,enabled=true)
		public void verifydrymouthRecognizeitLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthrecognize();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthrecognize();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthRecognizeit:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyMedicationXerostamiaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonmedicationxerostomia();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonmedicationxerostomia();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medixerostamia:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifySjogrensyndromeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonsjogrenesyndrome();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonsjogrenesyndrome();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sjogrensyndrome:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifySclerdermaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSclerderma();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSclerderma();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sclerderma:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyDiabetesMelletusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDiabetesMelletus();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDiabetesMelletus();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DiabetesMellletus:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyparkinsonDiseaseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonparkinsondisease();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonparkinsondisease();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for parkinsondisease:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifySymptomsReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSymptomsrelief();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSymptomsrelief();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for symptomsrelief:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyeffectsoralhealthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickoneffectsoralhealth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickoneffectsoralhealth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for symptomsrelief:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifySymptomsReliefcareLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSymptomsreliefcare();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSymptomsreliefcare();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for symptomsreliefcare:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyunderstandingoptionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonunderstandingreliefoptions();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonunderstandingreliefoptions();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for understandingoptions:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyDiagnoisedhealthprofesstionalLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDiagnoisedHealthprofesstional();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDiagnoisedHealthprofesstional();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Diagnoisedhealthprofesstional:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifywhatissalviaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonwhatissalvia();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonwhatissalvia();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatissalvia:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifynaturalremediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonnaturalremedies();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonnaturalremedies();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for naturalremides:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyfoodhelpdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonfoodhelpdrymouth();      
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonfoodhelpdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for foodhelpdrymouth:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifymouthrinsemouthwashLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonmouthrinsemouthwash();     
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonmouthrinsemouthwash();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for mouthrinsemouthwash:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyfreshoriginalmintLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonfreshoriginalmint();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonfreshoriginalmint();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for freshoriginalmint:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifygentlemintFluroideLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickongentlemintfluroide();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickongentlemintfluroide();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for gentlefluroide:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyAlcholfreemoisturingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonalcholfreemoisturizing();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonalcholfreemoisturizing();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for alcholfreemoisturizing:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyoralbalancemoisturizinggelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonoralbalancemoisturizinggel();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonoralbalancemoisturizinggel();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for oralbalancemoisturizinggel:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyBiotenedrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbiotenedrymouthgentle();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbiotenedrymouthgentle();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for biotenedrymouthgentle:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyBiotenesugarfreelozengesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbiotenesugarfreelozenges();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbiotenesugarfreelozenges();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for biotenesugarfreelozenges:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifyAlcholfreeoralRinseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAlcholfreeoralRinse();    
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonAlcholfreeoralRinse();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AlcholfreeoralRinse:"+compareTwoText);
		}		
	 @Test(priority=29,enabled=true)
		public void verifyWriteReview1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview1();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview1();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review1:"+compareTwoText);
		}		
	 @Test(priority=30,enabled=true)
		public void verifyWriteReview2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview2();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview2();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review2:"+compareTwoText);
		}		
	 @Test(priority=31,enabled=true)
		public void verifyWriteReview3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview3();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview3();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review3:"+compareTwoText);
		}		
	 @Test(priority=32,enabled=true)
		public void verifyWriteReview4Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview4();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview4();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review4:"+compareTwoText);
		}		
	 @Test(priority=33,enabled=true)
		public void verifyWriteReview5Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview5();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview5();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review5:"+compareTwoText);
		}		
	 @Test(priority=34,enabled=true)
		public void verifyWriteReview6Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonWriteReview6();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonWriteReview6();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Review6:"+compareTwoText);
		}		
	 @Test(priority=35,enabled=true)
		public void verifylivingfulllifeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonlivingfulllife();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonlivingfulllife();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for livingfulllife:"+compareTwoText);
		}		
	 @Test(priority=36,enabled=true)
		public void verifyReliefremediesdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReliefremediesdrymouth();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReliefremediesdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Reliefremediesdrymouth:"+compareTwoText);
		}		
	 @Test(priority=37,enabled=true)
		public void verifymouthwashbadbreatheLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonmouthwashbadbreathe();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonmouthwashbadbreathe();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Mouthwashbadbreathe:"+compareTwoText);
		}		
	 @Test(priority=38,enabled=true)
		public void verifydrymouthdrinkingwaterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthafterdrinkingwater();   
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthafterdrinkingwater();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthdrinkingwater:"+compareTwoText);
		}		
	 @Test(priority=39,enabled=true)
		public void verifydrymouthsymptomsnightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthsymptomsnight(); 
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthsymptomsnight();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthsymptomsnight:"+compareTwoText);
		}		
	 @Test(priority=40,enabled=true)
		public void verifydrymouthsymptomslabordayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthsymptomslaborday();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthsymptomslaborday();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for drymouthsymptomslaborday:"+compareTwoText);
		}		
	 @Test(priority=41,enabled=true)
		public void verifyhandytipslearningLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonhandytipslearning();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonhandytipslearning();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for handytipslearning:"+compareTwoText);
		}		
	 @Test(priority=42,enabled=true)
		public void verifyGetRelieffromsymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickongetrelieffromsymptoms();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickongetrelieffromsymptoms();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetRelieffromsymptoms:"+compareTwoText);
		}		
	 @Test(priority=43,enabled=true)
		public void verifyAlldaysymptomsdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAlldaydrymouthSymptoms();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonAlldaydrymouthSymptoms();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Alldaysymptomsdrymouth:"+compareTwoText);
		}		
	 @Test(priority=44,enabled=true)
		public void verifySymptomswhileTravelingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSymptomswhileTraveling();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSymptomswhileTraveling();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SymptomswhileTraveling:"+compareTwoText);
		}		
	 @Test(priority=45,enabled=true)
		public void verifyBeachbagReliefdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBeachbagreliefdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBeachbagreliefdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BeachbagReliefdrymouth:"+compareTwoText);
		}		
	 @Test(priority=46,enabled=true)
		public void verifyUnderstandinglinkbetweencancerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonUnderstandinglinkbetweencancer();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonUnderstandinglinkbetweencancer();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understanding link between Cancer:"+compareTwoText);
		}		
	 @Test(priority=47,enabled=true)
		public void verifyManagingDiabitesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonManagingDiabites();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonManagingDiabites();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ManagingDiabietes:"+compareTwoText);
		}		
	 @Test(priority=48,enabled=true)
		public void verifyAsthmaRespiratoryLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAsthmaRespiratory();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonAsthmaRespiratory();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AsthmaRespiratorys:"+compareTwoText);
		}		
	 @Test(priority=49,enabled=true)
		public void verifyDrymouthMedicationsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDrymouthMedications();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDrymouthMedications();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DryMouthMedications:"+compareTwoText);
		}		
	 @Test(priority=50,enabled=true)
		public void verifyCareGiversLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCaregivers();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCaregivers();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caregivers:"+compareTwoText);
		}		
	 @Test(priority=51,enabled=true)
		public void verifyQuizLovedOnesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonQuizLovedones();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonQuizLovedones();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for QuizLovedOnes:"+compareTwoText);
		}		
	 @Test(priority=52,enabled=true)
		public void verifyManagingSymptomsNightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonManagingSymptomsNight();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonManagingSymptomsNight();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ManagingSymptomsNight:"+compareTwoText);
		}		
	 @Test(priority=53,enabled=true)
		public void verifyHowtouseMouthwashLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHowtouseMouthwash();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHowtouseMouthwash();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HowtouseMouthwash:"+compareTwoText);
		}		
	 @Test(priority=54,enabled=true)
		public void verifyDrymouthThroatRelatedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthThroatRelated();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthThroatRelated();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DryMouthThroatRelated:"+compareTwoText);
		}		
	 @Test(priority=55,enabled=true)
		public void verifyDoihavedrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDoihavedrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDoihavedrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Do ihaveDry mouth:"+compareTwoText);
		}		
	 @Test(priority=56,enabled=true)
		public void verifyDentistRecommendedDryMouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDentistRecommendedDrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDentistRecommendedDrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Do ihaveDry mouthDentistRecommended DryMouth:"+compareTwoText);
		}		
	 @Test(priority=57,enabled=true)
		public void verifyContactUsDrymouthProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonContactUsDryMouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonContactUsDryMouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Do Contact us dry mouth:"+compareTwoText);
		}		
	 @Test(priority=58,enabled=true)
		public void verifyFrequentlyAskedQuestionsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonFrequentlyAskedQuestions();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonFrequentlyAskedQuestions();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Frequently Asked questions:"+compareTwoText);
		}		
	 @Test(priority=59,enabled=true)
		public void verifyBioteneSitemapArticlesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBioteneSitemapArticles();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBioteneSitemapArticles();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BioteneSitemapArticles:"+compareTwoText);
		}		
	 @Test(priority=60,enabled=true)
		public void verifySavenowwithBioteneProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSavenowwithBioteneProductsHelp();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSavenowwithBioteneProductsHelp();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SaveNowWithBioteneProducts:"+compareTwoText);
		}		
	 @Test(priority=61,enabled=true)
		public void verifySitemapLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSitemap();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSitemap();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Sitemap:"+compareTwoText);
		}		
	 @Test(priority=62,enabled=true)
		public void verifyUsingFSAHSALink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonUsingFSAHSA();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonUsingFSAHSA();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FSAHSA:"+compareTwoText);
		}		
	 @Test(priority=63,enabled=true)
		public void verifyThankyouBioteneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonthankyouBiotene();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonthankyouBiotene();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ThankYouBiotene:"+compareTwoText);
		}		
	 @Test(priority=64,enabled=true)
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
	 @Test(priority=65,enabled=true)
		public void verifyGetCouponsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonGetCoupons();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonGetCoupons();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetCoupons:"+compareTwoText);
		}		
	 
	 @Test(priority=66,enabled=true)
		public void verifyShopNowLink() throws Throwable
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
