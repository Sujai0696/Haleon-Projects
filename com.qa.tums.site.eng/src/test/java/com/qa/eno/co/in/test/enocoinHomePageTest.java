package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.enocoinHomePagePage;

public class enocoinHomePageTest extends BaseClass{
	
	enocoinHomePagePage eh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 eh=new enocoinHomePagePage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("eno_co_inConfig.properties").getProperty("preProdenoinHomepageUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("eno_co_inConfig.properties").getProperty("liveenoinHomepageUrl"));
		 }					
	 @Test(priority=1,enabled=true)
		public void verifyHowEnoWorksBanner1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHowEnoWorks1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHowEnoWorks1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How EnoWork Banner1:"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyHowEnoWorksBanner2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHowEnoWorks2();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHowEnoWorks2();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How EnoWork Banner2:"+compareTwoText);
		}			
	 @Test(priority=3,enabled=true)
		public void verifyHowEnoWorksBanner3Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHowEnoWorks3();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHowEnoWorks3();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How EnoWork Banner3:"+compareTwoText);
		}			
	 @Test(priority=4,enabled=true)
		public void verifyInitialSymptomsAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonInitialSymptomsAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonInitialSymptomsAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Initial Symptoms Acidity:"+compareTwoText);
		}			
	 @Test(priority=5,enabled=true)
		public void verifyUnderstadingAcidityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonUnderstandAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonUnderstandAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Understanding Acidity:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyHomeRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHomeRemediesAcidity();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHomeRemediesAcidity();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeRemedies:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyHeartBurnPregancyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonHeartburnPregancy();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonHeartburnPregancy();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HeartBurnPregancy:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyGasReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonGasRelief();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonGasRelief();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GasRelief:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyLivingAcidityfreeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonLivingAcidityFree();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonLivingAcidityFree();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Living Acididty Free:"+compareTwoText);
		}			
	 @Test(priority=10,enabled=true)
		public void verifyAcidityorIndigestioneLink() throws Throwable
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
	 @Test(priority=11,enabled=true)
		public void verifyStomachHeartLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonStomachHeart();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonStomachHeart();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Stomach Heart:"+compareTwoText);
		}			
	
	 //eno sliderss//
	 
	 @Test(priority=12,enabled=true)
		public void verifyEnoRegular1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoRegular1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoRegular1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoRegular:"+compareTwoText);
		}								
	 @Test(priority=13,enabled=true)
		public void verifyEnoLemon1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoLemon1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoLemon1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoLemon1:"+compareTwoText);
		}				
	 @Test(priority=14,enabled=true)
		public void verifyEnoOrange1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoOrange1();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoOrange1();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoOrange1:"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifyEnoCola1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoCola();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoCola();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoCola1:"+compareTwoText);
		}			
	 @Test(priority=16,enabled=true)
		public void verifyEnoAjawain1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoAjawin();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoAjawin();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoAjawin1:"+compareTwoText);
		}			
	 @Test(priority=17,enabled=true)
		public void verifyEnoMausambi1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoMausambi();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoMausambi();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoMausambi1:"+compareTwoText);
		}			
	 @Test(priority=18,enabled=true)
		public void verifyEnoLemonBottleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoLemonBottle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoLemonBottle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoLemonBottle1:"+compareTwoText);
		}			
	 @Test(priority=19,enabled=true)
		public void verifyEnoRegularBottleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoRegularBottle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoRegularBottle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoRegularBottle1:"+compareTwoText);
		}			
	 @Test(priority=20,enabled=true)
		public void verifyEnoOrangeBottleLink() throws Throwable
		{
		 switchingTab(firstTab);
	        eh.clickonEnoOrangeBottle();
	        String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	        switchingTab(secondTab);
	        eh.clickonEnoOrangeBottle();
	        String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EnoOrangeBottle1:"+compareTwoText);
		}			
	
	//next slider//
	 @Test(priority=21,enabled=true)
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
