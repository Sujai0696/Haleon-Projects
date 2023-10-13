package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneIngredients_Pages;


public class SensodyneIngredients_Test extends BaseClass {
	
	SensodyneIngredients_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneIngredients_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneIngredientsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneIngredientsUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sp.clickCookieBtn();
		sp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	 @Test(priority = 1, enabled = true)
	    private void VerifySensodyneIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnAboutSensodyneIngredients();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnAboutSensodyneIngredients();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifySensodyneIngredientsBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnAboutSensodyneIngredientsBreadCrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnAboutSensodyneIngredientsBreadCrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyFootNote1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyFootNote2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyDeepCleanToothPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepCleanToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDeepCleanToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyTrueWhite_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneTrueWhite();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneTrueWhite();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifyEssentialCare_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnEssentialCare();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnEssentialCare();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 
	 @Test(priority = 8, enabled = true)
	    private void VerifyRapidRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifyCompleteProtection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncompleteprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncompleteprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyRepairProtectToothPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairProtectToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairProtectToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifySensitovityGum_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitivityGum();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitivityGum();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void VerifySensodyneDeepClean_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneDeepClean();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneDeepClean();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void VerifySensodyneFullProtection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneFullProtection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneFullProtection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifySensodyneRapidRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneRapidRelief4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneRapidRelief4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 15, enabled = true)
	    private void VerifySensodyneDeepClean4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneDeepClean4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneDeepClean4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifySensodyneCompleteProtection3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneCompleteProtection3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneCompleteProtection3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifySensodyneRepairProtect3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneRepairProtect3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneRepairProtect3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 18, enabled = true)
	    private void VerifySensodyneTrueWhite3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneTrueWhite3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneTrueWhite3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
	    private void VerifySensodyneExtraWhitening3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneExtraWhitening3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneExtraWhitening3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 20, enabled = true)
	    private void VerifyFootnote4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootnote4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootnote4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 21, enabled = true)
	    private void VerifyDeepCleanToothpaste5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDeepCleanToothPaste5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDeepCleanToothPaste5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 22, enabled = true)
	    private void VerifyRapidReliefMintToothPaste5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefToothPaste5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefToothPaste5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 23, enabled = true)
	    private void VerifyCompleteProtection4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnCompleteProtectionToothpaste4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnCompleteProtectionToothpaste4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 24, enabled = true)
	    private void VerifyRepairProtectToothpaste4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRepairProtectToothPaste4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRepairProtectToothPaste4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 25, enabled = true)
	    private void VerifyFootNote5_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 26, enabled = true)
	    private void VerifyFootNote6_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote6();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote6();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 27, enabled = true)
	    private void VerifyWhiteExtraFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnWhiteExtraFreash();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnWhiteExtraFreash();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 28, enabled = true)
	    private void VerifyExtraWhiteningToothpaste4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnExtraWhiteningToothPaste4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnExtraWhiteningToothPaste4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }

		/*
		 * @Test(priority = 29, enabled = true) private void VerifyPronamel_Button()
		 * throws Exception { switchingTab(firstTab); sp.clickOnPronamel(); String
		 * preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		 * switchingTab(secondTab); sp.clickOnPronamel(); String liveUrl =
		 * compareUrl(excelRead("Sensodyne", 1, 1)); boolean compareTwoText =
		 * compareTwoText(preProdUrl, liveUrl);
		 * System.out.println("Preprod URL and Live URL are same :"+compareTwoText); }
		 */
	 @Test(priority = 30, enabled = true)
	    private void VerifyFootNote7_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote7();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote7();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 31, enabled = true)
	    private void VerifyFootNote8_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnFootNote8();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnFootNote8();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 32, enabled = true)
	    private void VerifyYouTubePlayer1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYouTubePlayer1();
	        System.out.println("PreProd Youtube Video");
	         switchingTab(secondTab);
	         sp.clickOnYouTubePlayer1();
	        System.out.println("Live YouTube Video");
	    }
	 @Test(priority = 33, enabled = true)
	    private void VerifyYouTubePlayer2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnYouTubePlayer1();
	        System.out.println("PreProd Youtube Video");
	         switchingTab(secondTab);
	         sp.clickOnYouTubePlayer1();
	        System.out.println("Live YouTube Video");
	    }
	 @Test(priority = 34, enabled = true)
	    private void VerifyArticle1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 35, enabled = true)
	    private void VerifyArticle2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 36, enabled = true)
	    private void VerifyArticle3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 37, enabled = true)
	    private void VerifyArticle4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticle4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticle4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 38, enabled = true)
	    private void VerifySensodyneHelp_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneHelp();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneHelp();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 39, enabled = true)
	    private void VerifySensodyneWork_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneWork();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneWork();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	

}
