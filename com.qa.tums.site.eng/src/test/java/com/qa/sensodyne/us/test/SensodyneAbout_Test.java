package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneAbout_Pages;

public class SensodyneAbout_Test extends BaseClass{
	
	SensodyneAbout_Pages sa;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sa=new SensodyneAbout_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneAboutUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneAboutUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sa.clickCookieBtn();
		sa.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sa.clickCookieBtn();
		sa.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	 @Test(priority = 1, enabled = true)
	    private void VerifyTreatingSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnAboutSensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnAboutSensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyHomeBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnAboutHomeBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnAboutHomeBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifySensodyneAboutBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnAboutSensodyne_Breadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnAboutSensodyne_Breadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyPainRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnPainRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnPainRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyFootNote1_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyFootNote2_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifyProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnProducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnProducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifySensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnSensitiveTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnSensitiveTeeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifyIngredientsWork_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnIngredientsWork();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnIngredientsWork();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyFootNote3_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifySymptonsSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnSensitiveTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnSensitiveTeeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 12, enabled = true)
	    private void VerifyFootNote_3_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote_3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote_3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 13, enabled = true)
	    private void VerifyFootNote4_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 14, enabled = true)
	    private void VerifyFootNote5_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnFootNote5();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnFootNote5();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 15, enabled = true)
	    private void VerifyRelieveToothSensitiveHere_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnRelieveToothSensitiveHere();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnRelieveToothSensitiveHere();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifyRightToothPaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnRightToothPaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnRightToothPaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifyGetCoupons_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnGetCoupons();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnGetCoupons();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 18, enabled = true)
	    private void VerifyExploreProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnExploreProducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnExploreProducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 19, enabled = true)
	    private void VerifySensodyneToothPsetes_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnSensodyneToothPastes();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnSensodyneToothPastes();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 20, enabled = true)
	    private void VerifySensitiveTeeths_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnSensitiveTeeths();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnSensitiveTeeths();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 21, enabled = true)
	    private void VerifyArticle1_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 22, enabled = true)
	    private void VerifyArticle2_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 23, enabled = true)
	    private void VerifyArticle3_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnArticle3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnArticle3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 24, enabled = true)
	    private void VerifyArticle4_Button() throws Exception {
		     switchingTab(firstTab);
	         sa.clickOnArticle4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sa.clickOnArticle4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
