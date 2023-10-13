package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneRitualstoReduceStress_Pages;

public class SensodyneRitualstoReduceStress_Test extends BaseClass{

	SensodyneRitualstoReduceStress_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneRitualstoReduceStress_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneRitualstoReduceStressUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneRitualstoReduceStressUrl"));
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
	    private void VerifyNightyBasis_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnNightybasis();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnNightybasis();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 3, enabled = true)
	    private void VerifyHealthissues_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnHealthIssues();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnHealthIssues();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 4, enabled = true)
	    private void Verifysleepdisruptor_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsleepdisruptor();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsleepdisruptor();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 5, enabled = true)
	    private void VerifyNicole_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnNicole();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnNicole();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifyReduceAnxiety_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnReduceAnxietyStress();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnReduceAnxietyStress();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 7, enabled = true)
	    private void VerifyRapidRelief_Button() throws Exception {
		     switchingTab(firstTab);
		     Thread.sleep(1000);
	         sp.clickOnRapidRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         Thread.sleep(1000);
	         sp.clickOnRapidRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 8, enabled = true)
	    private void VerifyInterfaceSleep_Button() throws Exception {
		     switchingTab(firstTab);
		     Thread.sleep(1000);
	         sp.clickOnInterfaceSleep();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         Thread.sleep(1000);
	         sp.clickOnInterfaceSleep();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 9, enabled = true)
	    private void VerifyRelatedArticle1_Button() throws Exception {
		     switchingTab(firstTab);
		     Thread.sleep(1000);
	         sp.clickOnRelatedArticle1();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         Thread.sleep(1000);
	         sp.clickOnRelatedArticle1();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 10, enabled = true)
	    private void VerifyRelatedArticle2_Button() throws Exception {
		     switchingTab(firstTab);
		     Thread.sleep(1000);
	         sp.clickOnRelatedArticle2();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         Thread.sleep(1000);
	         sp.clickOnRelatedArticle2();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 11, enabled = true)
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
	 @Test(priority = 12, enabled = true)
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
