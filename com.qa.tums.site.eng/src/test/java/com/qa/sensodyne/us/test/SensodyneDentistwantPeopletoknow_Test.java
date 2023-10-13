package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneDentistwantPeopletoknow_Pages;

public class SensodyneDentistwantPeopletoknow_Test extends BaseClass{
	
	SensodyneDentistwantPeopletoknow_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneDentistwantPeopletoknow_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneDentistwantPeopletoknowUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneDentistwantPeopletoknowUrl"));
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
	    private void VerifyBacktoArticleList_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBacktoArticleList();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnBacktoArticleList();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 2, enabled = true)
	    private void VerifyAcademyGeneralDentistry_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnAcademyGeneralDentistry();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnAcademyGeneralDentistry();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyloryRichter_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnLoryRichter();
	        System.out.println("Displaying Information on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnLoryRichter();
	         System.out.println("Displaying Information on Live url");
	    }
	 @Test(priority = 3, enabled = true)
	    private void VerifyTeetharePorous_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOurTeethPorous();
	        System.out.println("Displaying Information of TeethPorous on Preprod url");
	         switchingTab(secondTab);
	         sp.clickOnOurTeethPorous();
	         System.out.println("Displaying Information of TeethPorous on Live url");
	    }
	 @Test(priority = 4, enabled = true)
	    private void VerifyRapidReliefToothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnRapidReliefToothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnRapidReliefToothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 5, enabled = true)
	    private void VerifyhaveCavity_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnhaveCavity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnhaveCavity();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 6, enabled = true)
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
	 @Test(priority = 7, enabled = true)
	    private void VerifyOralHealthTipsTricks_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnOralHealthTipsTricks();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnOralHealthTipsTricks();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 8, enabled = true)
	    private void VerifyBrushTeethtoohard_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBrushteethtoohard();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnBrushteethtoohard();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 9, enabled = true)
	    private void VerifywhyTeethhurtcoldOutside_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwhyteethhurtcoldOutside();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwhyteethhurtcoldOutside();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	 @Test(priority = 10, enabled = true)
	    private void VerifyCansensitiveteethbadthing_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensitiveTeethBadThing();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensitiveTeethBadThing();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
