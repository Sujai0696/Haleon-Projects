package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSymptonsSensitiveTeeth_Pages;

public class SensodyneSymptonsSensitiveTeeth_Test extends BaseClass{
	
	SensodyneSymptonsSensitiveTeeth_Pages ss;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ss=new SensodyneSymptonsSensitiveTeeth_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSymptonsSenstiveTeethUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSymptonsSenstiveTeethUrl"));
		 }
	 @Test(priority = 0, enabled = true)
		private void cookieButton() throws Exception {
		switchingTab(firstTab);
		ss.clickCookieBtn();
		ss.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ss.clickCookieBtn();
		ss.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	 @Test(priority = 1, enabled = true)
	    private void VerifyCommonSymptonsSenstiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnCommonSymptonsSenstiveTeeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnCommonSymptonsSenstiveTeeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyHomeIconBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnHomeIcon_Breadcrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnHomeIcon_Breadcrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyUnderstandingSensitivityBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnUnderStandingSensitivity_Breadcrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnUnderStandingSensitivity_Breadcrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyCommonSensitivityTeethBreadCrumb_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnCommonSymptonsSensitiveTeeth_Breadcrumb();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnCommonSymptonsSensitiveTeeth_Breadcrumb();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyHot_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnHot_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnHot_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
	    private void VerifyCold_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnCold_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnCold_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 7, enabled = true)
	    private void VerifyLearnMore_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnLearnMore_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnLearnMore_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8)
		private void verifyRadioButtonOne() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonOne();
			System.out.println("Radio Button one is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonOne();
			System.out.println("Radio Button one is verified in the live Url");
		}
		
		@Test(priority = 9)
		private void verifyRadioButtonTwo() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonTwo();
			System.out.println("Radio Button two is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonTwo();
			System.out.println("Radio Button two is verified in the live Url");
		}
		
		@Test(priority = 10)
		private void verifyRadioButtonThree() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonThree();
			System.out.println("Radio Button three is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonThree();
			System.out.println("Radio Button three is verified in the live Url");
		}
		
		@Test(priority = 11)
		private void verifyRadioButtonFour() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonFour();
			System.out.println("Radio Button four is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonFour();
			System.out.println("Radio Button four is verified in the live Url");
		}
		
		@Test(priority = 12)
		private void verifyRadioButtonFive() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonFive();
			System.out.println("Radio Button five is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonFive();
			System.out.println("Radio Button five is verified in the live Url");
		}
		
		@Test(priority = 13)
		private void verifyRadioButtonSix() throws Exception{
			switchingTab(firstTab);
			ss.clickRadioButtonSix();
			System.out.println("Radio Button Six is verified in the preprod Url");
			switchingTab(secondTab);
			ss.clickRadioButtonSix();
			System.out.println("Radio Button Six is verified in the live Url");
		}
	 @Test(priority = 14, enabled = true)
	    private void VerifyQuiz_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnQuiz_Link();
	        System.out.println("Verify Display of Quiz in Preprod Url");
	         switchingTab(secondTab);
	         ss.clickOnQuiz_Link();
	         System.out.println("Verify Display of Quiz in Prod");	    
	         }
	 @Test(priority = 15, enabled = true)
	    private void VerifyCausesSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnCausesSensitiveTeeth_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnCausesSensitiveTeeth_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 16, enabled = true)
	    private void VerifyTreatingSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnTreatingSensitiveTeeth_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnTreatingSensitiveTeeth_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 17, enabled = true)
	    private void VerifyHowSensodyneHelp_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnHowSensodyneHelp_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnHowSensodyneHelp_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 18, enabled = true)
	    private void VerifySensodyneProducts_Button() throws Exception {
		     switchingTab(firstTab);
	         ss.clickOnSensodyneProducts_Link();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         ss.clickOnSensodyneProducts_Link();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
