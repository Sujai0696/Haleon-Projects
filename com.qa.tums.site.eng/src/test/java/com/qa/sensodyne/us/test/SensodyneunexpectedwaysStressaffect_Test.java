package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneunexpectedwaysStressaffect_Pages;

public class SensodyneunexpectedwaysStressaffect_Test extends BaseClass {
	
	SensodyneunexpectedwaysStressaffect_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneunexpectedwaysStressaffect_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneunexpectedwaysStressaffectbodyUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneunexpectedwaysStressaffectbodyUrl"));
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
	    private void VerifyLastingprojectionsBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnLastingprojectionssBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnLastingprojectionssBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifyOralHealthTipsBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOralhealthtipsBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOralhealthtipsBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 3, enabled = true)
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
	 @Test(priority = 4, enabled = true)
	    private void VerifyAssociation_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnAssociation();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnAssociation();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 5, enabled = true)
	    private void Verifylackofsleep_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnlackofsleep();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnlackofsleep();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 6, enabled = true)
	    private void Verifydonthelp_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOndonthelp();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOndonthelp();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void Verifyproperlynourshingbody_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnproperlynourshingbody();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnproperlynourshingbody();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 8, enabled = true)
	    private void Verifyexerciseroutine_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnexerciseroutine();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnexerciseroutine();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 9, enabled = true)
	    private void Verifyapproximately70percent_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnapproximately70percent();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnapproximately70percent();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 10, enabled = true)
	    private void Verifydrephraim_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOndrephraim();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOndrephraim();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 11, enabled = true)
	    private void VerifySensodynepainRelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynepainRelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynepainRelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 12, enabled = true)
	    private void VerifyStresseating_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnStresseating();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnStresseating();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
	    private void Verifyasmuchcalories_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncalories();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncalories();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 14, enabled = true)
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
	 @Test(priority = 15, enabled = true)
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
	 @Test(priority = 16, enabled = true)
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
	 @Test(priority = 17, enabled = true)
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
