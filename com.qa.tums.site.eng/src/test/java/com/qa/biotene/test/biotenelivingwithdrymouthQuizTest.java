package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenelivingwithdrymouthQuizPage;

public class biotenelivingwithdrymouthQuizTest extends BaseClass {

	biotenelivingwithdrymouthQuizPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenelivingwithdrymouthQuizPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneLivingwithdrymouthcaregiversQuizUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneLivingwithdrymouthcaregiversQuizUrl"));
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
		public void verifyQuizLovedonesbreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonQuizlovedonesBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonQuizlovedonesBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Quizlovedones_Breadcrumbs:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
		public void verifylovedonesdailymedicationsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonLovedonedailymedications();
	        System.out.println("Verified loved ones text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonLovedonedailymedications();
	        System.out.println("Verified loved ones text on Live Url");
		}		
	 @Test(priority=6,enabled=true)
		public void verifyUndegoingCancerTreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonUndergoingcancertreatment();
	        System.out.println("Verified Undergoing cancer Treatment text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonUndergoingcancertreatment();
	        System.out.println("Verified Undergoing cancer Treatment text on Live Url");
		}		
	 @Test(priority=7,enabled=true)
		public void verifydotheyhaveDiabetesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDohaveDiabetes();
	        System.out.println("Verified Do they have Diabetes text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonDohaveDiabetes();
	        System.out.println("Verified Do they have Diabetes text on Live Url");
		}		
	 @Test(priority=8,enabled=true)
		public void verifyInhalersorAsthmaLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonInhalersorAsthma();
	        System.out.println("Verified Inhaler or Asthma text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonInhalersorAsthma();
	        System.out.println("Verified Inhaler or Asthma  text on Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyDotheysmokeAlcholLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDotheysmokeAlchol();
	        System.out.println("Verified Do they smoke Alchol text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonDotheysmokeAlchol();
	        System.out.println("Verified Do they smoke Alchol  text on Live Url");
		}		
	 @Test(priority=10,enabled=true)
		public void verifyAretheyFrequentlyThirstyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAreTheyFrequentlyThirsty();
	        System.out.println("Verified Are they Frequently Thirsty text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonAreTheyFrequentlyThirsty();
	        System.out.println("Verified Are they Frequently Thirsty  text on Live Url");
		}		
	 @Test(priority=11,enabled=true)
		public void verifyTongueorlipsdryLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTongueorlipsdry();
	        System.out.println("Verified Tongue or Thirsty text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonTongueorlipsdry();
	        System.out.println("Verified Tongue or Thirsty   text on Live Url");
		}		
	 @Test(priority=12,enabled=true)
		public void verifyDotheywakeupnightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDotheywakeupnight();
	        System.out.println("Verified Do they wake up night text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonDotheywakeupnight();
	        System.out.println("Verified Do they wake up night text on Live Url");
		}		
	 @Test(priority=13,enabled=true)
		public void verifyHalitosisLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHalitosis();
	        System.out.println("Verified Halitosis text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonHalitosis();
	        System.out.println("Verified Halitosis text on Live Url");
		}		
	 @Test(priority=14,enabled=true)
		public void verifyDifficultydryfoodsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDifficultydryfoods();
	        System.out.println("Verified Difficulty dry foods text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonDifficultydryfoods();
	        System.out.println("Verified Difficulty dry foods text on Live Url");
		}		
	
	 @Test(priority=15,enabled=true)
		public void verifyThankYouLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonThankYou();
	        System.out.println("Verified Thank you text on Preprod Url");
	        switchingTab(secondTab);
	        bd.clickonThankYou();
	        System.out.println("Verified Thank you text on Live Url");
		}		
	 @Test(priority=16,enabled=true)
		public void verifyRelievedrymouthNightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonRelieveSymptomsdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonRelieveSymptomsdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Relieve dry mouth symptoms:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifyLearnaboutSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonLearnaboutSymptoms();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonLearnaboutSymptoms();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Learn about Symptoms:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyFreshenBadbreatheLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonFreshenbadBreathe();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonFreshenbadBreathe();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Freshen bad Breathe:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
