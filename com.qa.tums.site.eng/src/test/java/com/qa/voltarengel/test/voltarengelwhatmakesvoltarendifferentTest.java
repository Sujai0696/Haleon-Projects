package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelwhatmakesvoltarendifferentPage;

public class voltarengelwhatmakesvoltarendifferentTest extends BaseClass{
	
	voltarengelwhatmakesvoltarendifferentPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelwhatmakesvoltarendifferentPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdwhatmakesvoltarendifferentUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LivewhatmakesvoltarendifferentUrl"));
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
	    private void Verifyaboutvoltaren_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonaboutvoltarenBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for aboutVoltarenBreadcrumbs:"+compareTwoText);
	    }						
	 @Test(priority = 3, enabled = true)
	    private void VerifyWhatmakesVoltarenDifferent_breadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonWhatmakesvoltarendifferent_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonWhatmakesvoltarendifferent_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for WhatmakevoltarenDifferent_Breadcrumbs:"+compareTwoText);
	    }						
	 @Test(priority =4, enabled = true)
	    private void VerifyReadFAQs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonReadFAQs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonReadFAQs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Read FAQs:"+compareTwoText);
	    }			
	 @Test(priority =5, enabled = true)
	    private void VerifyOTCArthristMedications_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonOTCArthristMedications();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonOTCArthristMedications();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for OTC Arthrist pain gel:"+compareTwoText);
	    }			
	 @Test(priority =6, enabled = true)
	    private void VerifyHowOTCArthristpaincreamworks_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowOTCArthristcreamgelworks();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHowOTCArthristcreamgelworks();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for HowOTC Arthrist pain creamgel works:"+compareTwoText);
	    }			
	 @Test(priority =7, enabled = true)
	    private void VerifyOTCDeclofenacgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonOTCDeclofenacgel();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonOTCDeclofenacgel();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for OTC Arthrist pain creamgel worksDeclofenac gel:"+compareTwoText);
	    }			
	 @Test(priority =8, enabled = true)
	    private void VerifyTylenolAlternative_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickontylenolAlternative();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickontylenolAlternative();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for Tylenol Alternative:"+compareTwoText);
	    }			
	 @Test(priority =9, enabled = true)
	    private void VerifyVoltarenEmulgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenEmulgel();
	         System.out.println("Verified VoltarenEmulgel on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarenEmulgel();
	         System.out.println("Verified VoltarenEmulgel on Live Url Successfully");
	    }			
	 @Test(priority =10, enabled = true)
	    private void VerifyVoltarenArthristPainGel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristPaingel();
	         System.out.println("Verified Voltaren Arthrist paingel on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristPaingel();
	         System.out.println("Verified Voltaren Arthrist paingel on Live Url Successfully");
	    }			
	 @Test(priority =11, enabled = true)
	    private void VerifyVoltarendifferentAspercreme_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarendifferentAspercreme();
	         System.out.println("Verified Voltaren different Aspercreme on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarendifferentAspercreme();
	         System.out.println("Verified Voltaren different Aspercreme on Live Url Successfully");
	    }			
	
	 @Test(priority =12, enabled = true)
	    private void VerifyVoltarendifferentSalonpas_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarendifferentSalonpas();
	         System.out.println("Verified Voltaren different Salonpas on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarendifferentSalonpas();
	         System.out.println("Verified Voltaren different Salonpas on Live Url Successfully");
	    }			
	 @Test(priority =13, enabled = true)
	    private void VerifyVoltarendifferentIcyHot_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarendifferenticyhot();
	         System.out.println("Verified Voltaren different Icyhot on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarendifferenticyhot();
	         System.out.println("Verified Voltaren different Icyhot on Live Url Successfully");
	    }			
	 @Test(priority =14, enabled = true)
	    private void VerifyVoltarendifferfromTropicalpain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarendifferfromtropicalpain();
	         System.out.println("Verified Voltaren differ from Tropical pain on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarendifferfromtropicalpain();
	         System.out.println("Verified Voltaren differ from Tropical pain on Live Url Successfully");
	    }			
	 @Test(priority =15, enabled = true)
	    private void VerifyVoltarendifferfromTropicalBengay_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarendifferfromtropicalBengay();
	         System.out.println("Verified Voltaren differ from Tropical Bengay on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarendifferfromtropicalBengay();
	         System.out.println("Verified Voltaren differ from Tropical Bengay  on Live Url Successfully");
	    }			
	 @Test(priority =16, enabled = true)
	    private void VerifyVoltarenArthristvsDiclofenac_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristpainvsDiclofenac();
	         System.out.println("Verified Voltaren Arthrist pain vs Diclofenac on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristpainvsDiclofenac();
	         System.out.println("Verified Voltaren Arthrist pain vs Diclofenac  on Live Url Successfully");
	    }			
	 @Test(priority =17, enabled = true)
	    private void VerifyVoltarenArthristvsVoltarol_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristpainvsvoltarol();
	         System.out.println("Verified Voltaren Arthrist pain vs Voltarol on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristpainvsvoltarol();
	         System.out.println("Verified Voltaren Arthrist pain vs Voltarol  on Live Url Successfully");
	    }			
	 @Test(priority =18, enabled = true)
	    private void VerifyVoltarenArthristdifferfromprescriptiongel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristdifferfromprescription();
	         System.out.println("Verified Voltaren Arthrist pain differ from prescription pain gell on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristdifferfromprescription();
	         System.out.println("Verified Voltaren Arthrist pain differ from prescription pain gell  on Live Url Successfully");
	    }			
	 @Test(priority =19, enabled = true)
	    private void VerifySeemoreFAQs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSeemoreFAQ();
	         System.out.println("Verified See more FAQ on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonSeemoreFAQ();
	         System.out.println("Verified See more FAQ  on Live Url Successfully");
	    }			
	 @Test(priority =20, enabled = true)
	    private void VerifyBuyNow_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow on Preprod Url Successfully");
	         switchingTab(secondTab);
	         vn.clickonBuyNow();
	         System.out.println("Verified BuyNow  on Live Url Successfully");
	    }			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
