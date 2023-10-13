package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneTreatingSensitiveTeeth_Pages;

public class SensodyneTreatingSensitiveTeeth_Test extends BaseClass{

	SensodyneTreatingSensitiveTeeth_Pages st;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 st=new SensodyneTreatingSensitiveTeeth_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneTreatingSensitiveTeethUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneTreatingSensitiveTeethUrl"));
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
	    private void VerifyTreatingSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnTreatingSensitiveTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnTreatingSensitiveTeeth();
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
	    private void VerifyTreatingSensitivityBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnTreatingSensitiveTeeth_bread();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnTreatingSensitiveTeeth_bread();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyFootNote1_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickOnFootnote1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickOnFootnote1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyManageDiscomfort_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonManageDiscomfort();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonManageDiscomfort();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifySensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifySensodyneToothPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifyFootNote2_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyFootNote3_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifyFootNote4_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void VerifyFootNote5_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void VerifyFootNote7_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote7();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote7();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifyFootNote8_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonFootNote8();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonFootNote8();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 15, enabled = true)
	    private void VerifySensodyneRepairWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRepairWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRepairWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifySensodyneRepairWhiteningImage_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRepairWhitening_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRepairWhitening_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifySensodyneRepairWhitening_BuyNowButton() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRepairWhitening_BuyNow();
	         System.out.println("BuyNow Displayed in PreprodUrl");
	         switchingTab(secondTab);
	         st.clickonSensodyneRepairWhitening_BuyNow();
	         System.out.println("BuyNow Displayed in LiveUrl");
	    }
	 @Test(priority = 18, enabled = true)
	    private void VerifySensodyneRepairWhiteningLearnMore_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRepairWhitening_LearnMore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRepairWhitening_LearnMore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
	    private void VerifySensodyneRapidReliefWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRapidreliefWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRapidreliefWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 20, enabled = true)
	    private void VerifySensodyneRapidReliefWhiteningImage_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRapidreliefWhitening_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRapidreliefWhitening_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 21, enabled = true)
	    private void VerifySensodyneRapidReliefWhiteningLearnMore_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneRapidreliefWhitening_LearnMore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneRapidreliefWhitening_LearnMore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 22, enabled = true)
	    private void VerifySensodyneSensitivityGumWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneSensitivityGumWhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneSensitivityGumWhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 23, enabled = true)
	    private void VerifySensodyneSensitivityGumWhiteningImage_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneSensitivityGumWhitening_Img();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneSensitivityGumWhitening_Img();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 24, enabled = true)
	    private void VerifySensodyneSensitivityGumWhiteningLearnMore_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneSensitivityGumWhitening_LearnMore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneSensitivityGumWhitening_LearnMore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 25, enabled = true)
	    private void VerifySensodyneExtraWhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneExtraWhiteningToothPaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneExtraWhiteningToothPaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 26, enabled = true)
	    private void VerifySensodyneExtraWhiteningImage_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneExtraWhiteningToothPaste_Image();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneExtraWhiteningToothPaste_Image();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 27, enabled = true)
	    private void VerifySensodyneExtraWhiteningLearnMore_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneExtraWhiteningToothPaste_LearnMore();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         st.clickonSensodyneExtraWhiteningToothPaste_LearnMore();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 28, enabled = true)
	    private void VerifySensodyneYouTube_Button() throws Exception {
		     switchingTab(firstTab);
	         st.clickonSensodyneYouTubeVideo();
	         System.out.println("Video Played in PreProd Url");
	         switchingTab(secondTab);
	         st.clickonSensodyneYouTubeVideo();
	         System.out.println("Video Played in Live Url");
	    }
	
	
	
	
	
	
	
	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
