package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinControlAciditybusyLifestylePage;

public class enocoinControlAciditybusyLifestyleTest extends BaseClass{
	
	enocoinControlAciditybusyLifestylePage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinControlAciditybusyLifestylePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinControlAciditybusyLifestyleUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("LiveenoinControlAciditybusyLifestyleUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyLivingLifeAcidityFreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivingLifeAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivingLifeAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingLifeAcidityFree:"+compareTwoText);
		}					
	 @Test(priority=2,enabled=true)
		public void verifyWhatIsEnoLink() throws Throwable
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
	 @Test(priority=3,enabled=true)
		public void verifyDealingwithAcidityNightLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonDealingwithAcidityNight();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonDealingwithAcidityNight();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DealingwithAcidity Night:"+compareTwoText);
		}		
	 @Test(priority=4,enabled=true)
		public void verifyUnderstandingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandingAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandingAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for UnderstandingAcidity:"+compareTwoText);
		}		
	 @Test(priority=5,enabled=true)
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
	 @Test(priority=6,enabled=true)
		public void verifyAcidityorRefluxorgerdLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonAcidityorRefluxorgerd();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AcidityorRefluxorgerd:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyConstantAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonConstantAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonConstantAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forConstantAcidity:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifyReferencesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonReferences();
	        System.out.println("Verified References  Successfully on Preprod Url");
	        switchingTab(secondTab);
	        eh.clickonReferences();
	        System.out.println("Verified References Successfully on  Live Url");
		}		
	 @Test(priority=9,enabled=true)
		public void verifyWhatisEno1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhatisEno1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhatisEno1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for whatisEno1:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyWhydoesStomachHurtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonWhydoesStomachHurt1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonWhydoesStomachHurt1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for WhyDoesStomachHurt1:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
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
