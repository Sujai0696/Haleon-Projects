package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSitemap_Pages;

public class SensodyneSitemap_Test extends BaseClass{
	
	SensodyneSitemap_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new  SensodyneSitemap_Pages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneSitemapUrl"));
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
	    private void VerifySitemapBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSitemapBreadCrumbs();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSitemapBreadCrumbs();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 2, enabled = true)
	    private void VerifyUnderstandingsensitivity_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnUnderstandingsensitivity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnUnderstandingsensitivity();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 3, enabled = true)
	    private void Verifycommonsymptonssensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncommonsymptonssensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncommonsymptonssensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 4, enabled = true)
	    private void Verifycausesofsensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncausesofsensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncausesofsensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 5, enabled = true)
	    private void Verifytreatingsensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTreatingsensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTreatingsensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 6, enabled = true)
	    private void VerifyBleedinggumsensitivity_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBleedinggumsensitivity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnBleedinggumsensitivity();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 7, enabled = true)
	    private void Verifyteethsensitivesugar_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnTeethsensitivesugar();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnTeethsensitivesugar();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 8, enabled = true)
	    private void VerifyMouthwashsensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnmouthwashsensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnmouthwashsensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 9, enabled = true)
	    private void Verifyteethhurtdown_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnteethhurtwhenbite();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnteethhurtwhenbite();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 10, enabled = true)
	    private void VerifyAboutsensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnaboutsensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnaboutsensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 11, enabled = true)
	    private void VerifysensodyneIngredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodyneingredients();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodyneingredients();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 12, enabled = true)
	    private void Verifyourproducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnourproducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnourproducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 13, enabled = true)
	    private void Verifysensodynerapidrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 14, enabled = true)
	    private void VerifysensodynerapidreliefFresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidreliefFresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidreliefFresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 15, enabled = true)
	    private void VerifyRepairprotectwhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnrepairprotectwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnrepairprotectwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 16, enabled = true)
	    private void VerifySensodynerepairprotect_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynerepairprotect();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynerepairprotect();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 17, enabled = true)
	    private void VerifySensodynerepairprotect_Sensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynerepairprotect_Sensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynerepairprotect_Sensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 18, enabled = true)
	    private void VerifySensodynecompleteprotectionfresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynecompleteprotectionfresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynecompleteprotectionfresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 19, enabled = true)
	    private void VerifySensodynecompleteprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynecompleteprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynecompleteprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 20, enabled = true)
	    private void VerifySensodynetruewhitefresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynetruewhitefresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynetruewhitefresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 21, enabled = true)
	    private void VerifySensodynetruewhiteMint_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynetruewhiteMint();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynetruewhiteMint();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 22, enabled = true)
	    private void VerifySensodyneextrawhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneextrawhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyneextrawhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 23, enabled = true)
	    private void VerifySensodynedeepclean_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynedeepclean();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynedeepclean();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 24, enabled = true)
	    private void Verifyfreshmintchloride_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfreshmintfluoride();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfreshmintfluoride();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 25, enabled = true)
	    private void VerifySensodynefullprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynefullprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynefullprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 26, enabled = true)
	    private void VerifySensodynetartarcontrol_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetartarcontrol();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynetartarcontrol();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 27, enabled = true)
	    private void VerifySensodyneFreshImpact_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynefreshImpact();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynefreshImpact();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 28, enabled = true)
	    private void Verifyproductresult_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnproductresult();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnproductresult();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 29, enabled = true)
	    private void Verifyteethwhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnteethwhitening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnteethwhitening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 30, enabled = true)
	    private void Verifyfastsensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfastsensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfastsensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 31, enabled = true)
	    private void Verifyextrafreshbreath_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnextrafreshbreath();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnextrafreshbreath();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 32, enabled = true)
	    private void Verifytoothpasteremoveplague_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntoothpasteremoveplague();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOntoothpasteremoveplague();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 33, enabled = true)
	    private void Verifysensitiveteethrepair_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitiveteethrepair();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitiveteethrepair();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 34, enabled = true)
	    private void VerifyMultibenefit_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnmultibenefit();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnmultibenefit();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 35, enabled = true)
	    private void VerifySodiumLaurysulphate_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsodiumlaurylsilphatefree();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsodiumlaurylsilphatefree();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 36, enabled = true)
	    private void VerifyEnamelStraightening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnEnamelstraightening();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnEnamelstraightening();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 37, enabled = true)
	    private void VerifyRapidreliefwhiteningToothpaste_Button() throws Exception {
	     switchingTab(firstTab);
         sp.clickOnrapidreliefwhitening_toothpaste();
         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
         switchingTab(secondTab);
         sp.clickOnrapidreliefwhitening_toothpaste();
         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
    }	
	 @Test(priority = 38, enabled = true)
	    private void VerifySensodynesensitivitygumMint_Button() throws Exception {
	     switchingTab(firstTab);
      sp.clickOnSensodynesensitivitygumMint();
      String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
      switchingTab(secondTab);
      sp.clickOnSensodynesensitivitygumMint();
      String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
      boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
      System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
 }	
	 @Test(priority = 39, enabled = true)
	    private void VerifySensodynesensitivitygumWhitening_Button() throws Exception {
	     switchingTab(firstTab);
   sp.clickOnSensodynesensitivitygumWhitening();
   String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
   switchingTab(secondTab);
   sp.clickOnSensodynesensitivitygumWhitening();
   String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
   boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
   System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 
	 @Test(priority = 40, enabled = true)
	     private void VerifySensodynesensitivityCleanFresh_Button() throws Exception {
	     switchingTab(firstTab);
          sp.clickOnSensodynesensitivityCleanFresh();
          String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
         switchingTab(secondTab);
         sp.clickOnSensodynesensitivityCleanFresh();
         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
 }	
	 @Test(priority = 41, enabled = true)
     private void VerifySensodyneNourishsensitivityToothpaste_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourishsensitivitytoothpaste();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourishsensitivitytoothpaste();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 42, enabled = true)
     private void VerifySensodyneNourishsensitivityToothpaste_Review_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourishsensitivitytoothpaste_Review();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourishsensitivitytoothpaste_Review();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 43, enabled = true)
     private void VerifySensodyneNourishToothpasteHealthywhite_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourishToothpasteHealthywhite();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourishToothpasteHealthywhite();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 44, enabled = true)
     private void VerifySensodyneNourishToothpasteHealthywhite_Review_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourishToothpasteHealthywhite_Review();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourishToothpasteHealthywhite_Review();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 45, enabled = true)
     private void VerifySensodyneNaturalwhiteToothpaste_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNaturalwhiteToothpaste();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNaturalwhiteToothpaste();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 46, enabled = true)
     private void VerifySensodyneNaturalwhiteToothpaste_Review_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNaturalwhiteToothpaste_Review();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNaturalwhiteToothpaste_Review();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	
	 @Test(priority = 47, enabled = true)
     private void VerifySensodyneNourish_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourish();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourish();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 
	 @Test(priority = 48, enabled = true)
     private void VerifySensodyneNourishSensitivitytoothpastehealthywhite_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneNourishsensitivitytoothpastesHealthywhite();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneNourishsensitivitytoothpastesHealthywhite();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 
//	 @Test(priority = 49, enabled = true)
//     private void VerifySensodynesensitivitygum_Enamel_Button() throws Exception {
//     switchingTab(firstTab);
//     sp.clickOnSensodynesensitivitygum_Enamel();
//     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//     switchingTab(secondTab);
//     sp.clickOnSensodynesensitivitygum_Enamel();
//     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//}	 
	 @Test(priority = 50, enabled = true)
     private void VerifyOralHealthTips_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnOralhealthTips();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnOralhealthTips();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	 
	 @Test(priority = 51, enabled = true)
     private void VerifySensodyneInnovation_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSensodyneInnovation();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSensodyneInnovation();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	 
	 @Test(priority = 52, enabled = true)
     private void VerifySciencebehindRapidrelieftoothpaste_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSciencebehindrapidrelief();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSciencebehindrapidrelief();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	  
	 @Test(priority = 53, enabled = true)
     private void VerifyEngineeredspeed_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnEngineeredspeed();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnEngineeredspeed();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 54, enabled = true)
     private void Verifyspeedsensation_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnspeedsenation();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnspeedsenation();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	    
	 @Test(priority = 55, enabled = true)
     private void Verifybecomingfastspeed_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnbecomingfastspeed();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnbecomingfastspeed();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 56, enabled = true)
     private void Verifyskigearstyle_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnskigearstyle();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnskigearstyle();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	      
	 @Test(priority = 57, enabled = true)
     private void Verifywhiteningsensitiveteeth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnwhiteningsensitiveteeth_1();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnwhiteningsensitiveteeth_1();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	      
	 @Test(priority = 58, enabled = true)
     private void Verifywhattoknowaboutwhitening_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnwhattoknowaboutwhitening();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnwhattoknowaboutwhitening();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	       
	 @Test(priority = 59, enabled = true)
     private void Verifytipsforwhiteningteeth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOntipsforwhiteningsensitiveteeth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOntipsforwhiteningsensitiveteeth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 60, enabled = true)
     private void Verifysensodynetruewhiteingredients_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnsensodynetruewhiteingredients();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnsensodynetruewhiteingredients();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 60, enabled = true)
     private void VerifywhiteningproductsImpact_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnwhiteningproductsImpact();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnwhiteningproductsImpact();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 61, enabled = true)
     private void Verifyhowtohelpsensitiveteethafterwhitening_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnhowtohelpsensitiveteethafterwhitening();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnhowtohelpsensitiveteethafterwhitening();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 62, enabled = true)
     private void Verifysensitiveteethpainrelief_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnsensitiveteethpainrelief();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnsensitiveteethpainrelief();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 63, enabled = true)
     private void Verifyrecognizingsensitiveteeth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnrecognizingsensitiveteeth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnrecognizingsensitiveteeth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 64, enabled = true)
     private void Verifyshockpaintoothsensitivity_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnshockpaintoothsensitivity();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnshockpaintoothsensitivity();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 65, enabled = true)
     private void Verifymythvstrue_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnmythvstruth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnmythvstruth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 66, enabled = true)
     private void Verifycavityorsensitiveteeth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOncavityorsensitiveteeths();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOncavityorsensitiveteeths();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 67, enabled = true)
     private void Verifysensitivetripafterdentist_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnsensitiveareaaftertrip();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnsensitiveareaaftertrip();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	     
	 @Test(priority = 68, enabled = true)
     private void Verifysensodyneorpronamel_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnsensodyneorpronamelh();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnsensodyneorpronamelh();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 69, enabled = true)
     private void Verifymanagingsensitiveteeth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnmanagingsensitiveteeth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnmanagingsensitiveteeth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 70, enabled = true)
     private void Verifytipsfortoothsensitivityhot_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOntipsfortoothsensitivityhot();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOntipsfortoothsensitivityhot();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 71, enabled = true)
     private void Verifyhowtodealtoothsensitivitycold_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnhowtodealtoothsensitivitycold();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnhowtodealtoothsensitivitycold();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 72, enabled = true)
     private void Verifycrowntoothpain_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOncrowntoothpain();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOncrowntoothpain();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 73, enabled = true)
     private void VerifyunderstandingToothsensitivityrootcanal_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnunderstandingtoothsensitivityrootcanal();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnunderstandingtoothsensitivityrootcanal();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 74, enabled = true)
     private void Verifysensitiveteethgumhealth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnsensitiveteethgumhealth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnsensitiveteethgumhealth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 75, enabled = true)
     private void VerifyImportancegumhealth_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnImportancegumhealth();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnImportancegumhealth();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	    
	 @Test(priority = 76, enabled = true)
     private void VerifyTreatGinivitis_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnTreatGingivits();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnTreatGingivits();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 77, enabled = true)
     private void Verifytwobenefitsonetoothpaste_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOntwobenefitsonetoothpaste();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOntwobenefitsonetoothpaste();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 78, enabled = true)
     private void Verifywhatisfeeling_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnwhatisfeeling();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnwhatisfeeling();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 79, enabled = true)
     private void VerifyTipsfohealthyteethgums_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnTipsforhealthyteethgums();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnTipsforhealthyteethgums();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 80, enabled = true)
     private void Verifytoothpaincauses_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOntoothpaincauses();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOntoothpaincauses();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 81, enabled = true)
     private void Verifyflossbeforeorafter_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnflossbeforeorafter();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnflossbeforeorafter();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 82, enabled = true)
     private void VerifySLStoothpaste_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSLSToothpaste();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSLSToothpaste();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
//	 @Test(priority = 83, enabled = true)
//     private void Verifyremovetarterteeth_Button() throws Exception {
//     switchingTab(firstTab);
//     sp.clickOnremovetarterteeth();
//     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//     switchingTab(secondTab);
//     sp.clickOnremovetarterteeth();
//     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//}	 	   
	 @Test(priority = 84, enabled = true)
     private void VerifyFAQ_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnFAQ();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnFAQ();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 85, enabled = true)
     private void Verifycontactcustomersupportteam_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOncontactcustomersupportteam();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOncontactcustomersupportteam();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 86, enabled = true)
     private void Verifyaccessibility_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnaccessibility();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnaccessibility();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 87, enabled = true)
     private void VerifySitemapsensodynewebpage_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnSitemapsensodynewebpage();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnSitemapsensodynewebpage();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 88, enabled = true)
     private void Verifywheretobuy_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnwheretobuy();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnwheretobuy();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 89, enabled = true)
     private void Verifycoupons_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOncoupons();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOncoupons();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
//	 @Test(priority = 90, enabled = true)
//     private void Verifythankyou_Button() throws Exception {
//     switchingTab(firstTab);
//     sp.clickOnthankyou();
//     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//     switchingTab(secondTab);
//     sp.clickOnthankyou();
//     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
//}	 	   
	 @Test(priority = 91, enabled = true)
     private void Verifycovid19_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOncovid19();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOncovid19();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 @Test(priority = 92, enabled = true)
     private void Verifyunsubscribe_Button() throws Exception {
     switchingTab(firstTab);
     sp.clickOnunsubscribe();
     String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
     switchingTab(secondTab);
     sp.clickOnunsubscribe();
     String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
     boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
     System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
}	 	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
