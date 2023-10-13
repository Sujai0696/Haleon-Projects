package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneTeethSensitiveSugar_Page;

public class SensodyneTeethSensitiveSugar_Test extends BaseClass{
	
	SensodyneTeethSensitiveSugar_Page st;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 st=new SensodyneTeethSensitiveSugar_Page();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneTeethSensitiveSugarUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneTeethSensitiveSugarUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	 @Test(priority = 1, enabled = true)
	    private void VerifySensitiveTeethSugar_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnTeethSensitiveSugar();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnTeethSensitiveSugar();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyHomeIconBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnHomeIcon_bread();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnHomeIcon_bread();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyUnderstandingSensitivityBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnUnderstandingSensitivity_bread();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnUnderstandingSensitivity_bread();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyTeethSensitiveSugarBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnTeethSensitiveSugar_bread();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnTeethSensitiveSugar_bread();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyToothSensitivity_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnToothSensitivity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnToothSensitivity();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyAboutSensitiveIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnAboutSensitiveIngredients();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnAboutSensitiveIngredients();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifySensodyneMultiAction_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnmultiAction();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnmultiAction();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }

		/*
		 * @Test(priority = 8, enabled = true) private void
		 * VerifyOralHealthTips_Button() throws Exception { switchingTab(firstTab);
		 * st.clickOnOralHealthTips(); String preProdUrl =
		 * compareUrl(excelRead("Sensodyne", 1, 0)); switchingTab(secondTab);
		 * st.clickOnOralHealthTips(); String liveUrl =
		 * compareUrl(excelRead("Sensodyne", 1, 1)); boolean compareTwoText =
		 * compareTwoText(preProdUrl, liveUrl);
		 * System.out.println("Preprod URL and Live URL are same :"+compareTwoText); }
		 */
	 @Test(priority = 8, enabled = true)
	    private void VerifyOralHealthTipsLink_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnOralHealthTipsLink();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnOralHealthTipsLink();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifyBrushYourTeethLink_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnBrushYourTeethLink();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnBrushYourTeethLink();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifySensitiveBadTeethLink_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnSensitiveTeethBadThingLink();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnSensitiveTeethBadThingLink();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifyKnowAboutSensitiveTeethLink_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnKnowAboutSensitiveTeethLink();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnKnowAboutSensitiveTeethLink();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
