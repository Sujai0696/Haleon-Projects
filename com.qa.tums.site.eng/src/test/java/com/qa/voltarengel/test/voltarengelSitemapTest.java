package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelSitemapPage;

public class voltarengelSitemapTest extends BaseClass{
	
	voltarengelSitemapPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdvoltarengelSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LivevoltarengelSitemapUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyHomepagebreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHomepageBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHomepageBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for HomepageBreadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifySitemapbreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSitemapBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSitemapBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Sitemap_Breadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 3, enabled = true)
	    private void VerifyProfessionals_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonforprofessionals();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonforprofessionals();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Professionals_Breadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 4, enabled = true)
	    private void VerifyVoltarengel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarengel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonvoltarengel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Voltarengel:"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
	    private void VerifyAboutVoltaren_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonAboutVoltaren();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonAboutVoltaren();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for AboutVoltaren:"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyReadReviews_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadReviews();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadReviews();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Read Reviews:"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyVoltarenDifferent_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenDifferent();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonVoltarenDifferent();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Voltaren Different:"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyTestimonals_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonTestimonals();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonTestimonals();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Testimonals:"+compareTwoText);
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyWhatisArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatisArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonWhatisArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for What is Arthrist:"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifydifferenttypesArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickondifferenttypesArthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickondifferenttypesArthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for diiferent types arthrist:"+compareTwoText);
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifySymptomsArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSymptomsArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSymptomsArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Symptoms Arthiritis:"+compareTwoText);
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifyCausesArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCausesArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCausesArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Causes Arthiritis:"+compareTwoText);
	    }			
	 @Test(priority = 13, enabled = true)
	    private void VerifyIntrestingfacts_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonIntrestingfacts();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonIntrestingfacts();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Intresting facts:"+compareTwoText);
	    }			
	 @Test(priority = 14, enabled = true)
	    private void VerifyfootarthritisSymptoms_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonfootarthritissymptoms();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonfootarthritissymptoms();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for foot arthritis symptoms:"+compareTwoText);
	    }			
	 @Test(priority = 15, enabled = true)
	    private void VerifyEarlysignsarthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonEarlysignOsteoarthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonEarlysignOsteoarthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for early signs Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 16, enabled = true)
	    private void VerifyAnklearthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonAnklearthritissymptoms();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonAnklearthritissymptoms();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Ankle Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 17, enabled = true)
	    private void VerifyUnderstandingpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonUnderstandingpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonUnderstandingpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Understanding pain:"+compareTwoText);
	    }			
	 @Test(priority = 18, enabled = true)
	    private void Verifyaboutpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonAboutpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonAboutpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for About pain:"+compareTwoText);
	    }			
	 @Test(priority = 19, enabled = true)
	    private void VerifyImpactpainworld_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonImpactpainworld();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonImpactpainworld();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Impact pain world:"+compareTwoText);
	    }			
	 @Test(priority = 20, enabled = true)
	    private void VerifyWeatheraffectspain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonweatheraffectspain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonweatheraffectspain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Weather affects pain:"+compareTwoText);
	    }			
	 @Test(priority = 21, enabled = true)
	    private void VerifyMorningjointpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonMorningjointpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonMorningjointpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for morning joint  pain:"+compareTwoText);
	    }			
	 @Test(priority = 22, enabled = true)
	    private void VerifyArthristDiagnosed_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthritisDiagnosed();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthritisDiagnosed();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthrist Diagnosed:"+compareTwoText);
	    }			
	 @Test(priority = 23, enabled = true)
	    private void VerifySymptomsTreatment_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSymptomstreatment();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSymptomstreatment();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Symptoms Treatment:"+compareTwoText);
	    }			
	 @Test(priority = 24, enabled = true)
	    private void VerifySorekneecauses_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSorekneecauses();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSorekneecauses();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Sore knee causes:"+compareTwoText);
	    }			
	 @Test(priority = 25, enabled = true)
	    private void VerifyLivingwithArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingwitharthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingwitharthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for living with Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 26, enabled = true)
	    private void VerifyRelievejointpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonRelievejointpain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonRelievejointpain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Relieve joint pain:"+compareTwoText);
	    }			
	 @Test(priority = 27, enabled = true)
	    private void VerifyArthritisdiet_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthritisDiet();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthritisDiet();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthritis diet:"+compareTwoText);
	    }			
	 @Test(priority = 28, enabled = true)
	    private void VerifyLowerbackArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlowerbackarthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlowerbackarthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Lower back Arthritis:"+compareTwoText);
	    }	
	 @Test(priority = 29, enabled = true)
	    private void VerifyRelevewristpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonRelievewristArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonRelievewristArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Relieve Wrist pain:"+compareTwoText);
	    }			
	 @Test(priority = 30, enabled = true)
	    private void VerifyManagingarthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Managing Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 31, enabled = true)
	    private void VerifyKneebraces_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonKneebraces();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonKneebraces();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for knee braces:"+compareTwoText);
	    }			
	 @Test(priority = 32, enabled = true)
	    private void VerifyManagingArthritisHome_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingArthritishome();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingArthritishome();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same forManaging Arthritis home:"+compareTwoText);
	    }			
	 @Test(priority = 33, enabled = true)
	    private void VerifyManagingArthritisFamily_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingArthritisfamily();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingArthritisfamily();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same forManaging Arthritis Family:"+compareTwoText);
	    }			
	 @Test(priority = 34, enabled = true)
	    private void VerifyLivingIndependentlymanage_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlivingIndependentlymanage();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlivingIndependentlymanage();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for living Independently manage:"+compareTwoText);
	    }			
	 @Test(priority = 35, enabled = true)
	    private void VerifyManagingsocialsetting_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingsocialsetting();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingsocialsetting();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Managing social setting:"+compareTwoText);
	    }			
	 @Test(priority = 36, enabled = true)
	    private void VerifyManagingArthritiswork_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagingarthritiswork();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagingarthritiswork();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Managing arthritis work:"+compareTwoText);
	    }			
	 @Test(priority = 37, enabled = true)
	    private void VerifyPreventArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonPreventArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonPreventArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Prevent Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 38, enabled = true)
	    private void Verifyjointpainmedicines_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonjointpainmedicines();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonjointpainmedicines();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for joint pain medicines:"+compareTwoText);
	    }			
	 @Test(priority = 39, enabled = true)
	    private void VerifyOTCarthristmedication_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonOTCArthristmedication();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonOTCArthristmedication();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for OTCarthrist medication:"+compareTwoText);
	    }			
	 @Test(priority = 40, enabled = true)
	    private void VerifyTylenolalternativepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonTylenolalternativepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonTylenolalternativepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for tylenol alternative pain:"+compareTwoText);
	    }			
	
	 @Test(priority = 41, enabled = true)
	    private void VerifyHowOTCgelworks_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowotcgelworks();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHowotcgelworks();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for How OTC gel works:"+compareTwoText);
	    }			
	 @Test(priority = 42, enabled = true)
	    private void VerifyCounterDiclofenacgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickoncounterDiclofenacgel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickoncounterDiclofenacgel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for nCounter Diclofenac gel:"+compareTwoText);
	    }			
	 @Test(priority = 43, enabled = true)
	    private void Verifywhatfoodarthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonwhatfoodhavearthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonwhatfoodhavearthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for What food Arthritis have:"+compareTwoText);
	    }			
	 @Test(priority = 44, enabled = true)
	    private void VerifyArthritisHerditary_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthritisHereditary();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthritisHereditary();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthritis Herditary:"+compareTwoText);
	    }			
	 @Test(priority = 45, enabled = true)
	    private void VerifyMorningRoutineRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonMorningRoutineRelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonMorningRoutineRelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Morning Routine Relief:"+compareTwoText);
	    }			
	 @Test(priority = 46, enabled = true)
	    private void VerifyManagingpaintravelling_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonManagepaintravelling();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonManagepaintravelling();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Managing pain travelling:"+compareTwoText);
	    }			
	 @Test(priority = 47, enabled = true)
	    private void Verifylidocainearthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlidocainearthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlidocainearthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Lidocaine arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 48, enabled = true)
	    private void VerifyExercisejointpainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonExercisejointpainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonExercisejointpainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Exercise joint pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 49, enabled = true)
	    private void VerifWristexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonwristexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonwristexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Wrist Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 50, enabled = true)
	    private void Verifyhandwxercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonhandexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonhandexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Hand Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 51, enabled = true)
	    private void Verifykneeexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonkneeexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonkneeexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for knee Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 51, enabled = true)
	    private void Verifyelbowexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonelbowexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonelbowexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for elbow Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 52, enabled = true)
	    private void Verifyankleexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonankleexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonankleexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ankle Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 53, enabled = true)
	    private void Verifyfootexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonfootexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonfootexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for foot Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 54, enabled = true)
	    private void VerifyAbexercisepainrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonAbexercisepainrelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonAbexercisepainrelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Ab Exercise pain relief:"+compareTwoText);
	    }			
	 @Test(priority = 55, enabled = true)
	    private void Verifygymequipment_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickongymequipment();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickongymequipment();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for gym equipment:"+compareTwoText);
	    }			
	 @Test(priority = 56, enabled = true)
	    private void VerifyExerciseArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonexercisearthrist();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonexercisearthrist();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for exercise Arthrist:"+compareTwoText);
	    }			
	 @Test(priority = 57, enabled = true)
	    private void VerifyRelievekneepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonRelievekneepain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonRelievekneepain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Relieve knee pain:"+compareTwoText);
	    }			
	 @Test(priority = 58, enabled = true)
	    private void VerifyStandingstreches_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonStandingstreches();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonStandingstreches();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Standingstreches:"+compareTwoText);
	    }			
	 @Test(priority = 59, enabled = true)
	    private void VerifyArthritisnight_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthritisnight();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthritisnight();;
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthritis night:"+compareTwoText);
	    }			
	 @Test(priority = 60, enabled = true)
	    private void VerifyRelievearthritispain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonRelieveArthritispain();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonRelieveArthritispain();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Relieve Arthritis pain:"+compareTwoText);
	    }			
	 @Test(priority = 61, enabled = true)
	    private void VerifyNaturalRemediespainRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonNaturalremediespainRelief();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonNaturalremediespainRelief();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Natural remedies pain Relief:"+compareTwoText);
	    }			
	 @Test(priority = 62, enabled = true)
	    private void VerifyStressArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonstressarthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonstressarthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Stress arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 63, enabled = true)
	    private void VerifyEffectagingbody_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickoneffectsagingbody();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickoneffectsagingbody();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Effect aging body:"+compareTwoText);
	    }			
	 @Test(priority = 64, enabled = true)
	    private void VerifyNavigateWebsite_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonNavigatewebsite();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonNavigatewebsite();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for navigate websites:"+compareTwoText);
	    }			
	 @Test(priority = 65, enabled = true)
	    private void VerifyArthritisfriendlysite_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthritisfriendlysite();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthritisfriendlysite();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Arthritis friendly site:"+compareTwoText);
	    }			
	 @Test(priority = 66, enabled = true)
	    private void VerifyYogaArthritis_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonYogaArthritis();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonYogaArthritis();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Yoga Arthritis:"+compareTwoText);
	    }			
	 @Test(priority = 67, enabled = true)
	    private void VerifyCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCoupons();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCoupons();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Coupons:"+compareTwoText);
	    }			
	 @Test(priority = 68, enabled = true)
	    private void VerifyFaqs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonFaqs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonFaqs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Faqs:"+compareTwoText);
	    }			
	 @Test(priority = 69, enabled = true)
	    private void VerifyFsahsa_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonFsahsa();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonFsahsa();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Fsahsa:"+compareTwoText);
	    }			
	 @Test(priority = 70, enabled = true)
	    private void VerifyContactus_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonContactus();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonContactus();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Contact us:"+compareTwoText);
	    }			
	 @Test(priority = 71, enabled = true)
	    private void VerifySupportingcaregivers_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSupportingcaregivers();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSupportingcaregivers();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Supporting caregivers:"+compareTwoText);
	    }			
	 @Test(priority = 72, enabled = true)
	    private void VerifyCaregiverdepression_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCaregiverdepression();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCaregiverdepression();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Caregiver depression:"+compareTwoText);
	    }			
	 @Test(priority = 73, enabled = true)
	    private void VerifyHealthWellness_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHealthWellness();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHealthWellness();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Health Wellness:"+compareTwoText);
	    }			
	 @Test(priority = 74, enabled = true)
	    private void VerifyWhatiscaregiver_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonwhatiscaregiver();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonwhatiscaregiver();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for What is caregiver:"+compareTwoText);
	    }			
	 @Test(priority = 75, enabled = true)
	    private void VerifyCaregiverburden_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCaregivenburden();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCaregivenburden();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for caregiver burden:"+compareTwoText);
	    }			
	 @Test(priority = 76, enabled = true)
	    private void VerifyCaregiverFatigue_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCaregivenfatigue();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCaregivenfatigue();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for caregiver Fatigue:"+compareTwoText);
	    }			
	 @Test(priority = 77, enabled = true)
	    private void VerifyCaregiverburnoutstress_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCaregivenburnoutstress();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCaregivenburnoutstress();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for caregiver burnout stress:"+compareTwoText);
	    }			
	 @Test(priority = 78, enabled = true)
	    private void VerifySupportResources_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSupportResources();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonSupportResources();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Support Resources:"+compareTwoText);
	    }			
	 @Test(priority = 79, enabled = true)
	    private void VerifycaregiverSelfcaretips_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCaregiverselfcaretips();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonCaregiverselfcaretips();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Caregiver self care tips:"+compareTwoText);
	    }			
	 @Test(priority = 80, enabled = true)
	    private void Verifytipsprevention_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickontipsprevention();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickontipsprevention();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for tipsprevention:"+compareTwoText);
	    }			
	 @Test(priority = 81, enabled = true)
	    private void VerifyCaregivervscaretaker_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickoncaregivervscaretaker();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickoncaregivervscaretaker();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for caregivervscaretaker:"+compareTwoText);
	    }			
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
