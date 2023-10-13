package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFAQ_Pages;

public class SensodyneFAQ_Test extends BaseClass {
	
SensodyneFAQ_Pages sp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 sp=new SensodyneFAQ_Pages ();
	        switchingTab(firstTab);
	        launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdSensodyneFAQUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveSensodyneFAQUrl"));
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
	    private void VerifyOurFAQBreadCrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnBreadcrumbsFAQ();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnBreadcrumbsFAQ();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 2, enabled = true)
	    private void VerifyOurAllTopicsList_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnAllTopics();
	        System.out.println("All Topics Displayed in Preprod URL");
	        implicitWait();
	         switchingTab(secondTab);
	         sp.clickOnAllTopics();
	         System.out.println("All Topics Displayed in Live URL");
	    }						
	 @Test(priority = 3, enabled = true)
	    private void VerifyOurSensitiveTeeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnteethsensitivity();
	         System.out.println("Teeth Sensitivity Active on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnteethsensitivity();
	         System.out.println("Teeth Sensitivity Active on Preprod URL");
	    }		
	 @Test(priority = 4, enabled = true)
	    private void Verifysensitiveteethhypersensitivity_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitiveteethhypersensitivity();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensitiveteethhypersensitivity();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }						
	 @Test(priority = 5, enabled = true)
	    private void VerifyDentin_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOndentin();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOndentin();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 
	 @Test(priority = 6, enabled = true)
	    private void VerifySensodyneToothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynetoothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynetoothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }			
	 @Test(priority = 7, enabled = true)
	    private void VerifyCausessensitiveteethhurt_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncausessensitiveteethhurt();
	        System.out.println("Causes of sensitive teeth hurt on Preprod URL");
	         switchingTab(secondTab);
	         sp.clickOncausessensitiveteethhurt();
	        System.out.println("Causes of sensitive teeth hurt on LIVE URL");
	    }			
	 @Test(priority = 8, enabled = true)
	    private void Verifysharpshockjolt_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsharpshockjolt();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsharpshockjolt();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 9, enabled = true)
	    private void Verifycauseshere_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncauses_here();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOncauses_here();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 10, enabled = true)
	    private void Verifysensitiveteethcommon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensitiveteethcommont();
	         System.out.println("Sensitive teeth common on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensitiveteethcommont();
	         System.out.println("Sensitive teeth common on Live URL");
	    }		
	 @Test(priority = 11, enabled = true)
	    private void Verifyoverbrushingcausesensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnoverbrushingcausesensitive();
	         System.out.println("Overbrushing cause on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnoverbrushingcausesensitive();
	         System.out.println("Overbrushing cause on Live URL");
	    }		
	 @Test(priority = 12, enabled = true)
	    private void Verifysignofproblem_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsignofproblem();
	         System.out.println("Signofproblem on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsignofproblem();
	         System.out.println("Signofproblem cause on Live URL");
	    }		
	 @Test(priority = 13, enabled = true)
	    private void Verifydifferentcauses_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOndifferentcauses();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOndifferentcauses();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 13, enabled = true)
	    private void Verifyhelpsensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnhelpsensitiveteeth();
	         System.out.println("Helpsensitive teeth on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnhelpsensitiveteeth();
	         System.out.println("Helpsensitive teeth on Live URL");
	    }		
	 @Test(priority = 14, enabled = true)
	    private void VerifySensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 15, enabled = true)
	    private void Verifyspeciallyferementedteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnspeciallyfermentedteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnspeciallyfermentedteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 16, enabled = true)
	    private void VerifyDentistrecommendedtoothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDentistrecommendedtoothpaste();
	         System.out.println("Dentist recommended toothpaste preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnDentistrecommendedtoothpaste();
	         System.out.println("Dentist recommended toothpaste Live URL");
	    }		
	 @Test(priority = 17, enabled = true)
	    private void VerifyDentistRecommendedSensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDentistrecommended_Sensodyne();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDentistrecommended_Sensodyne();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 18, enabled = true)
	    private void VerifyDentistRecommended_here_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnDentistrecommended_here();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnDentistrecommended_here();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 19, enabled = true)
	    private void VerifyHowsensodynetoothpasteworks_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnHowsensodynetoothpasteworks();
	         System.out.println("How sensodyne toothpaste works on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnHowsensodynetoothpasteworks();
	         System.out.println("How sensodyne toothpaste works on Live url");
	    }		
	 @Test(priority = 20, enabled = true)
	    private void VerifyWork12days_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwork12days();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwork12days();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 21, enabled = true)
	    private void VerifyFullrangeproducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfullrangeproducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfullrangeproducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 22, enabled = true)
	    private void VerifyHowlongsensodyneworks_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnHowlongsensodyneworks();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnHowlongsensodyneworks();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 23, enabled = true)
	    private void VerifySensodyneRapidrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodynerapidrelief();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnSensodynerapidrelief();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 24, enabled = true)
	    private void Verifyupto2weeks_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnupto2weeks();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnupto2weeks();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 25, enabled = true)
	    private void Verifyoftenusedsensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnoftenusedsensodyne();
	         System.out.println("Often sensodyne toothpaste used on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnoftenusedsensodyne();
	         System.out.println("Often sensodyne toothpaste used on Live url");
	    }		
	 @Test(priority = 26, enabled = true)
	    private void Verifyoftensensodynehere_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnuptooftensensodyne_here();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnuptooftensensodyne_here();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 27, enabled = true)
	    private void Verifywithmysensitiveteethagain_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwithmysensitiveteeth();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwithmysensitiveteeth();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 28, enabled = true)
	    private void Verifywithmysensitiveteethagain_here_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwithmysensitiveteeth_here();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnwithmysensitiveteeth_here();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 29, enabled = true)
	    private void Verifypreventcavities_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnpreventcavities();
	         System.out.println("prevent cavities toothpaste used on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnpreventcavities();
	         System.out.println("prevent cavities toothpaste used on Live url");
	    }		
	 @Test(priority = 30, enabled = true)
	    private void VerifyToothpasteeveryday_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnToothpasteeveryday();
	         System.out.println(" toothpaste everyday used on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnToothpasteeveryday();
	         System.out.println(" toothpaste everyday used on Live url");
	    }		
	 @Test(priority = 31, enabled = true)
	    private void Verifyactiveingredients_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnactiveingredients();
	         System.out.println(" Active ingredients on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnactiveingredients();
	         System.out.println(" Active ingredients on Live url");
	    }		
	 @Test(priority = 32, enabled = true)
	    private void VerifySensodynetoothpastefluroide_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetoothpastefluroide();
	         System.out.println(" Sensodyne toothpaste fluroide on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnsensodynetoothpastefluroide();
	         System.out.println(" Sensodyne toothpaste fluroide on Live url");
	    }		
	 @Test(priority = 33, enabled = true)
	    private void VerifySensodynetoothpastefluroide_here_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetoothpastefluroide_here();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynetoothpastefluroide_here();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 34, enabled = true)
	    private void VerifyStannusfluroide_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnStannousfluroide();
	         System.out.println(" stannus fluroide on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnStannousfluroide();
	         System.out.println(" stannus fluroide on Live url");
	    }		
	 @Test(priority = 35, enabled = true)
	    private void VerifySensodynecompleteprotection_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynecompleteprotection();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynecompleteprotection();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }	
	 @Test(priority = 36, enabled = true)
	    private void VerifySensodynerepairprotect_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerepairprotect();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerepairprotect();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 37, enabled = true)
	    private void VerifySensodynerapidrelieftoothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelieftoothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelieftoothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 38, enabled = true)
	    private void VerifySensodynesensitivitygum_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynesensitivitygum();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynesensitivitygum();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 39, enabled = true)
	    private void Verifypotassiumnitrate_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnPotassiumNitrate();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnPotassiumNitrate();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 40, enabled = true)
	    private void Verifysensodynetruewhite_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetruewhite();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynetruewhite();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 41, enabled = true)
	    private void VerifySensodyneSLS_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnSensodyneSLS();
	         System.out.println(" SensodyneSLS on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnSensodyneSLS();
	         System.out.println(" SensodyneSLS on Live url");
	    }		
	 @Test(priority = 42, enabled = true)
	    private void Verifytriclosan_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntriclosan();
	         System.out.println(" triclosan on preprod url");
	         switchingTab(secondTab);
	         sp.clickOntriclosan();
	         System.out.println(" triclosan on Live url");
	    }		
	 @Test(priority = 43, enabled = true)
	    private void Verifyglutenfree_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnglutenfree();
	         System.out.println(" gluten on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnglutenfree();
	         System.out.println(" gluten on Live url");
	    }		
	 
	 @Test(priority = 44, enabled = true)
	    private void Verifytoothpastekoshere_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntoothpastekosher();
	         System.out.println(" toothpastekosher on preprod url");
	         switchingTab(secondTab);
	         sp.clickOntoothpastekosher();
	         System.out.println(" toothpastekosher on Live url");
	    }		
	 @Test(priority = 45, enabled = true)
	    private void Verifytoothpasteexpires_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntoothpasteexpires();
	         System.out.println(" toothpaste expires on preprod url");
	         switchingTab(secondTab);
	         sp.clickOntoothpasteexpires();
	         System.out.println(" toothpaste expires on Live url");
	    }		
	 @Test(priority = 46, enabled = true)
	    private void Verifysensodynedifferentvarities_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynedifferentvarities();
	         System.out.println(" Sensodyne different varities on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnsensodynedifferentvarities();
	         System.out.println("  Sensodyne different varities on Live url");
	    }		
	 @Test(priority = 47, enabled = true)
	    private void Verifysensodynerapidrelieftoothpastework_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelieftoothpastework();
	         System.out.println(" Sensodyne rapid relief toothpaste on preprod url");
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelieftoothpastework();
	         System.out.println("  Sensodyne rapid relief toothpaste on  Live url");
	    }		
	 @Test(priority = 48, enabled = true)
	    private void Verifysensodynerapidreliefproducts_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelieftoothpasteproducts();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelieftoothpasteproducts();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 49, enabled = true)
	    private void Verifysensodynerapidrelieftoothpasterightforme_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelieftoothpasterightforme();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelieftoothpasterightforme();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 50, enabled = true)
	    private void Verifyextrafresh_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnextrafresh();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnextrafresh();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 51, enabled = true)
	    private void Verifyhowoftenrapidrelief_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynerapidrelieftoothpasteoftenoccurs();
	         System.out.println("Rapid relief button on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensodynerapidrelieftoothpasteoftenoccurs();
	         System.out.println("Rapid relief button on Live URL");
	    }		
	 @Test(priority = 52, enabled = true)
	    private void Verifyabrasivetoothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnabrasivetooyhpaste();
	         System.out.println("Abrasive toothpaste on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnabrasivetooyhpaste();
	         System.out.println("Abrasive toothpaste on Live URL");
	    }		
	 @Test(priority = 53, enabled = true)
	    private void Verifytravelsizedtube_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntravelsizedtube();
	         System.out.println("travelsized tube toothpaste on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOntravelsizedtube();
	         System.out.println("travelsized tube toothpaste on Live URL");
	    }		
	 @Test(priority = 54, enabled = true)
	    private void Verifykidssizedtoothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnkidssizedtoothpaste();
	         System.out.println("kidssized toothpaste on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnkidssizedtoothpaste();
	         System.out.println("kidssized toothpaste on Live URL");
	    }		
	 @Test(priority = 55, enabled = true)
	    private void Verifytoothpastewhitten_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOntoothpastewhiten();
	         System.out.println("toothpaste whiten on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOntoothpastewhiten();
	         System.out.println(" toothpaste whiten on Live URL");
	    }	
	 @Test(priority = 56, enabled = true)
	    private void VerifyProffestionaltoothpastewhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnprofessionalwhitetreatment();
	         System.out.println("profestionale whiten on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnprofessionalwhitetreatment();
	         System.out.println(" profestional whiten on Live URL");
	    }	
	 @Test(priority = 57, enabled = true)
	    private void Verifywhyteethsensitiveteethafterwhitening_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnwhyteethsensitiveafterwhitening();
	         System.out.println("why sensitive teeth after whitening on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnwhyteethsensitiveafterwhitening();
	         System.out.println("why sensitive teeth after whitening on Live URL");
	    }	
	 @Test(priority = 58, enabled = true)
	    private void Verifysensodynetruewhiteworks_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetruewhiteworks();
	         System.out.println("sensodyne true white on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensodynetruewhiteworks();
	         System.out.println("sensodyne true white on Live URL");
	    }	
	 @Test(priority = 59, enabled = true)
	    private void Verifysensodynetruewhiteuse_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetruewhitetoothpasteuse();
	         System.out.println("sensodyne true white  use on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensodynetruewhitetoothpasteuse();
	         System.out.println("sensodyne true white  use on Live URL");
	    }	
	 @Test(priority = 60, enabled = true)
	    private void Verifysensodynetruewhitetwice_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodynetruewhitetwice();
	         System.out.println("sensodyne true white  twice  use on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensodynetruewhitetwice();
	         System.out.println("sensodyne true white  twice use on Live URL");
	    }	
	 @Test(priority = 61, enabled = true)
	    private void Verifyenamelerosion_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnenamelerosion();
	         System.out.println("enamel erosion on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnenamelerosion();
	         System.out.println("enamel erosion on Live URL");
	    }	
	 @Test(priority = 62, enabled = true)
	    private void Verifyenamelerosion_quiz_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnenamelerosionquiz();
	         System.out.println("enamel erosion quiz on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnenamelerosionquiz();
	         System.out.println("enamel erosion  quiz on Live URL");
	    }	
	 @Test(priority = 63, enabled = true)
	    private void Verifyenamelerosion_sensodyne_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnenamelerosion_sensodyne();
	         System.out.println("enamel erosion sensodyne on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnenamelerosion_sensodyne();
	         System.out.println("enamel erosion  sensodyne on Live URL");
	    }	
	 @Test(priority = 64, enabled = true)
	    private void Verifycausesenamelwear_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncausesenamelwear();
	         System.out.println("enamel erosion wear on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOncausesenamelwear();
	         System.out.println("enamel erosion  wear on Live URL");
	    }	
	 @Test(priority = 65, enabled = true)
	    private void Verifycanenamelcausesensitiveteeth_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOncanenamelcausesensitiveteeth();
	         System.out.println("enamel erosion cause sensitive teeth on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOncanenamelcausesensitiveteeth();
	         System.out.println("enamel erosion cause sensitive teeth on Live URL");
	    }	
	 @Test(priority = 66, enabled = true)
	    private void Verifysensodyneorpronamel_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnsensodyneorpronamel();
	         System.out.println("Sensodyne or pronamel on preprod URL");
	         switchingTab(secondTab);
	         sp.clickOnsensodyneorpronamel();
	         System.out.println("Sensodyne or pronamel on Live URL");
	    }	
	 @Test(priority = 67, enabled = true)
	    private void Verifyfindyourtoothpaste_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOnfindyourtoothpaste();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOnfindyourtoothpaste();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 @Test(priority = 68, enabled = true)
	    private void Verifygetyourcoupon_Button() throws Exception {
		     switchingTab(firstTab);
	         sp.clickOngetyourcoupon();
	         String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	         switchingTab(secondTab);
	         sp.clickOngetyourcoupon();
	         String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	    }		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
