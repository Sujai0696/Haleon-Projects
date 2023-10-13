package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFlossingTipsforDentist_Pages;

public class SensodyneFlossingTipsforDentist_Test extends BaseClass{
	
	SensodyneFlossingTipsforDentist_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneFlossingTipsforDentist_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneFlossingTipsforDentistUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneFlossingTipsforDentistUrl"));
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
	    private void VerifyArticleList_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnArticleList();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnArticleList();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }					
	 @Test(priority = 2, enabled = true)
	    private void VerifyToothSensitivityExperience_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothsensitivityExperience();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnToothsensitivityExperience();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 3, enabled = true)
	    private void VerifySensodyneRapidRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneRapidRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneRapidRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 4, enabled = true)
	    private void Verifycausetoothpain_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncausetoothpain();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncausetoothpain();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
	    private void VerifySensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyne();
	         waitForPageLoadJava();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyne();
	         waitForPageLoadJava();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void VerifyRelatedArticle1_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyRelatedArticle2_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyRelatedArticle3_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle3();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle3();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 9, enabled = true)
	    private void VerifyRelatedArticle4_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRelatedArticle4();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRelatedArticle4();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
