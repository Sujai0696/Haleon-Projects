package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinUnderstandingDigestiveWellnessPage;

public class enocoinUnderstandingDigestiveWellnessTest extends BaseClass{
	
	enocoinUnderstandingDigestiveWellnessPage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinUnderstandingDigestiveWellnessPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinUnderstandingDigestiveWellnessUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinUnderstandingDigestiveWellnessUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyAcidityRefluxorgerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityReluxorGerd:"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonunderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonunderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}				
	 @Test(priority=3,enabled=true)
		public void verifyControlAcidityLifestyleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonControlAcidityLifestyle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonControlAcidityLifestyle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for ControlAcidityLifestyle:"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyLivingLifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivingLifeAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivingLifeAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcisityFree:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyWhatisEnoLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatisEno();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisEno();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatisEno:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifywhydoesStomachHurtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonwhydoesstomachhurt();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonwhydoesstomachhurt();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Whydoesstomachhurt:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyAcidityorIndigestionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityorIndigestion();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityorIndigestion();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorIndigestion:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyUnderstandingAcidity_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingAcidity_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingAcidity_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity_here:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyHomeRemedies_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemedies_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemedies_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies_here:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyHomeRemediesAcidity_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemediesAcidity_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemediesAcidity_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemediesAcidity_here:"+compareTwoText);
		}			
	 @Test(priority=11,enabled=true)
		public void verifyWhatisEno_hereLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonwhatisEno_here();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonwhatisEno_here();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatiseno_here:"+compareTwoText);
		}			
	 @Test(priority=12,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on preprod Url");
	        switchingTab(secondTab);
	        eh.clickonReferences();
	       System.out.println("Verified References Successfully on preprod Url");
		}			
	 @Test(priority=13,enabled=true)
		public void verifyLivinglifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivingLifeAcidityFree1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivingLifeAcidityFree1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivinglifeAcidityfree1:"+compareTwoText);
		}		
	 @Test(priority=14,enabled=true)
		public void verifyGasRelief1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonGasRelief1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonGasRelief1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for gasRelief1:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyDidyouKnowSectionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the preprod URL");
	        switchingTab(secondTab);
	        eh.clickonDidYouKnowSection();
	        System.out.println("Did you know section is verified in the Live URL");
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
