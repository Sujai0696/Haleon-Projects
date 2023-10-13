package com.qa.voltarengel.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.voltarengel.pages.voltarengelFAQPage;

public class voltarengelFAQTest extends BaseClass{

	voltarengelFAQPage vn;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("voltarengel_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		vn=new voltarengelFAQPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("voltarengel_Config.properties").getProperty("preProdFAQUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("voltarengel_Config.properties").getProperty("LiveFAQUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyGigyaformLink() throws Throwable
		{
		 switchingTab(firstTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	        switchingTab(secondTab);
	        vn.clickCookieBtn();
	        vn.clickGigyaForm();        
	        System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
		}			
	 @Test(priority = 1, enabled = true)
	    private void VerifyHomepagebreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHomepageBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonHomepageBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for HomepageBreadcrumbs:"+compareTwoText);
	    }			
	 @Test(priority = 2, enabled = true)
	    private void VerifyArthristvoltarenFAQbreadcrumbs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonArthiristvoltarenFAQBreadcrumbs();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonArthiristvoltarenFAQBreadcrumbs();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for ArthristVoltarenFAQBreadcrumbs:"+compareTwoText);
	    }				
	 @Test(priority = 3, enabled = true)
	    private void VerifyHowdoiknowArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowdoiknowArthrist();
	         System.out.println("Verified how do i know Arthrist on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonHowdoiknowArthrist();
	        System.out.println("Verified how do i know Arthrist on Live url");
	    }				
	 @Test(priority = 4, enabled = true)
	    private void VerifyVoltarenArthristUsed_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristUsed();
	         System.out.println("Verified Voltaren Arthrist used  on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristUsed();
	        System.out.println("Verified Voltaren Arthrist used  on Live url");
	    }				
	 @Test(priority = 5, enabled = true)
	    private void VerifyActiveIngredientspaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonActiveIngredientspaingel();
	         System.out.println("Verified Active Ingredients pain gel  on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonActiveIngredientspaingel();
	        System.out.println("Verified Active Ingredients pain gel on Live url");
	    }				
	 @Test(priority = 6, enabled = true)
	    private void VerifyCounterVoltarenArthrist_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCounterVoltarenArthrist();
	         System.out.println("Verified Counter Voltaren Arthrist on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonCounterVoltarenArthrist();
	        System.out.println("Verified Counter Voltaren Arthrist on Live url");
	    }				
	 @Test(priority = 7, enabled = true)
	    private void VerifyVoltarenArthristpaingeldifferent_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthiristpaingelDifferent();
	         System.out.println("Verified  Voltaren Arthrist paingel diiferent on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthiristpaingelDifferent();
	        System.out.println("Verified  Voltaren Arthrist paingel diiferent on Live url");
	    }			
	 @Test(priority = 8, enabled = true)
	    private void VerifyDifferencebetweentropicalnoral_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonDifferencebetweentropicalOral();
	         System.out.println("Verified  Difference between tropical and Oral on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonDifferencebetweentropicalOral();
	        System.out.println("Verified  Difference between tropical and Oral on Live url");
	    }			
	 @Test(priority = 9, enabled = true)
	    private void VerifyVoltarendifferentfromlic_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarendifferentlidocaine();          
	         System.out.println("Verified  Voltaren- different lidociane on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarendifferentlidocaine();
	        System.out.println("Verified  Voltaren- different lidociane on Live url");
	    }			
	 @Test(priority = 10, enabled = true)
	    private void VerifyVoltarenAleve_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenfromAleve();         
	         System.out.println("Verified  Voltaren- from Aleve on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenfromAleve();
	        System.out.println("Verified  Voltaren- from Aleve on Live url");
	    }
	 @Test(priority = 11, enabled = true)
	    private void VerifyVoltarendifferentTylenol_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarendifferentTylenol();        
	         System.out.println("Verified  Voltaren- differentTylenol and Youtube played  on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarendifferentTylenol();
	        System.out.println("Verified  Voltaren- differentTylenol and Youtube played  on Live url");
	    }
	 
	 
	 @Test(priority = 12, enabled = true)
	    private void VerifyVoltarenAleveEmulgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenEmulgel();        
	         System.out.println("Verified  Voltaren- Emulgel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenEmulgel();
	        System.out.println("Verified  Voltaren- Emulgel on Live url");
	    }			
	 @Test(priority = 13, enabled = true)
	    private void VerifyVoltarenArthristfeelbody_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenArthristFeelbody();        
	         System.out.println("Verified  Voltaren- Arthrist feel body on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenArthristFeelbody();
	        System.out.println("Verified  Voltaren- Arthrist feel body on Live url");
	    }			
	 @Test(priority = 14, enabled = true)
	    private void VerifyVoltarenpainstarts_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenpainstarts();        
	         System.out.println("Verified  Voltaren- pain starts on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenpainstarts();
	        System.out.println("Verified  Voltaren- pain starts on Live url");
	    }			
	 @Test(priority = 15, enabled = true)
	    private void VerifyVoltarenpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenpaingel();        
	         System.out.println("Verified  Voltaren- pain gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenpaingel();
	        System.out.println("Verified  Voltaren- pain gel on Live url");
	    }			
	 @Test(priority = 16, enabled = true)
	    private void VerifyVoltarenpaingelDiscount_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenpaingelDiscount();        
	         System.out.println("Verified  Voltaren- pain gel Discount on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonvoltarenpaingelDiscount();
	        System.out.println("Verified  Voltaren- pain gel Discount on Live url");
	    }			
	 @Test(priority = 17, enabled = true)
	    private void VerifyOpenArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonOpenvoltarenArthristgel();        
	         System.out.println("Verified  open Arthrist pain gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonOpenvoltarenArthristgel();
	        System.out.println("Verified open Arthrist pain gel on Live url");
	    }			
	 @Test(priority = 18, enabled = true)
	    private void VerifyuseVoltarenArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonUseArthristpaingel();        
	         System.out.println("Verified  Use Arthrist pain gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonUseArthristpaingel();
	        System.out.println("Verified Use Arthrist pain gel on Live url");
	    }			
	 @Test(priority = 19, enabled = true)
	    private void VerifyuseVoltarenupperlowerbody_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenupperlowerbody();       
	         System.out.println("Verified  Voltaren upper and Lower body on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenupperlowerbody();
	        System.out.println("Verified Use Arthrist pain gel on Live url");
	    }			
	 @Test(priority = 20, enabled = true)
	    private void VerifyuseVoltarenArthristshouldersHip_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristshouldership();      
	         System.out.println("Verified  Voltaren Shoulders hip on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristshouldership();
	        System.out.println("Verified Use Voltaren Shoulders hip on Live url");
	    }			
	 @Test(priority = 21, enabled = true)
	    private void VerifyVoltarenmusclepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonvoltarenArthristFeelbody();     
	         System.out.println("Verified  Voltaren Muscle pain on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenusemusclepain();
	        System.out.println("Verified Use Voltaren muscle pain on Live url");
	    }			
	 @Test(priority = 22, enabled = true)
	    private void VerifyVoltarenusekneepain_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenusekneepain();   
	         System.out.println("Verified  Voltaren use knee pain on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenusekneepain();
	        System.out.println("Verified  Voltaren use knee pain  on Live url");
	    }			
	 @Test(priority = 23, enabled = true)
	    private void VerifyVoltarenmeasuringcard_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltaremeasuringcard();  
	         System.out.println("Verified  Voltaren measuring card on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltaremeasuringcard();
	        System.out.println("Verified  Voltaren measuring card on Live url");
	    }			
	 @Test(priority = 24, enabled = true)
	    private void VerifyCorrectamountDosingcard_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonCorrectAmountDosingcard();  
	         System.out.println("Verified  Correct amount dosing  card on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonCorrectAmountDosingcard();
	        System.out.println("Verified  Correct amount dosing card on Live url");
	    }			
	 @Test(priority = 25, enabled = true)
	    private void Verifyhowoftenusedvoltarengel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowoftenusevoltarengel();  
	         System.out.println("Verified  how often used voltaren gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonHowoftenusevoltarengel();
	        System.out.println("Verified   how often used voltaren gel on Live url");
	    }			
	 @Test(priority = 26, enabled = true)
	    private void VerifyhowlonguseArthristgel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowlonguseArthristgel();  
	         System.out.println("Verified  how long used Arthrist gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonHowlonguseArthristgel();
	        System.out.println("Verified   how long used Arthrist gel on Live url");
	    }			
	 @Test(priority = 27, enabled = true)
	    private void VerifyhowlongVoltarenwork_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonHowlongvoltarentowork();  
	         System.out.println("Verified  how long Voltaren work on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonHowlongvoltarentowork();
	        System.out.println("Verified  how long Voltaren work on Live url");
	    }			
	 @Test(priority = 28, enabled = true)
	    private void VerifyMissdosevoltarengel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonMissdoseVolatrengel();  
	         System.out.println("Verified  Miss dose Voltarengel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonMissdoseVolatrengel();
	        System.out.println("Verified  Miss dose voltarengel on Live url");
	    }			
	 @Test(priority = 29, enabled = true)
	    private void Verifycanitakepainmedications_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickoncanitakepainmedications(); 
	         System.out.println("Verified  Can I Take pain Medications on Preprod url");
	         switchingTab(secondTab);
	         vn.clickoncanitakepainmedications();
	        System.out.println("Verified Can I Take pain Medications on Live url");
	    }			
	 @Test(priority = 30, enabled = true)
	    private void VerifyVoltarenArthristunder18years_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthistunder18years();
	         System.out.println("Verified  Voltaren use under 18 years on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthistunder18years();
	        System.out.println("Verified Voltaren use under 18 years on Live url");
	    }			
	 @Test(priority = 31, enabled = true)
	    private void VerifyVoltarentyleontogether_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarentylenoltogether();
	         System.out.println("Verified  Voltaren tyleon together on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarentylenoltogether();
	        System.out.println("Verified Voltaren tyleon together on Live url");
	    }			
	
	 @Test(priority = 32, enabled = true)
	    private void VerifyVoltarenAdviltogether_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenAdviltogether();
	         System.out.println("Verified  Voltaren Advil together on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenAdviltogether();
	        System.out.println("Verified Voltaren Advil together on Live url");
	    }			
	 @Test(priority = 33, enabled = true)
	    private void VerifyVoltarenAlevtogether_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenAlevtogether();
	         System.out.println("Verified  Voltaren Alev together on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenAlevtogether();
	        System.out.println("Verified Voltaren Alev together on Live url");
	    }			
	 @Test(priority = 34, enabled = true)
	    private void VerifyVoltarenifPregant_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenifPregant();
	         System.out.println("Verified  Voltaren if Preganton Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenifPregant();
	        System.out.println("Verified Voltaren if Pregant on Live url");
	    }			
	 @Test(priority = 35, enabled = true)
	    private void VerifyVoltarenbreastfeeding_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenbreastfeeding();
	         System.out.println("Verified  Voltaren breast feeding Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenbreastfeeding();
	        System.out.println("Verified Voltaren breast feeding on Live url");
	    }			
	 @Test(priority = 36, enabled = true)
	    private void VerifyVoltarenusedotherMedications_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenusedothermedications();
	         System.out.println("Verified  Voltaren used other Medications Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenusedothermedications();
	        System.out.println("Verified Voltaren used other Medications on Live url");
	    }			
	 @Test(priority = 37, enabled = true)
	    private void VerifyDoineedhandwashvoltarenpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickondoineedwashhandsVoltarenArthristpaingel();
	         System.out.println("Verified  Voltaren  Do I need voltaren paingel Preprod url");
	         switchingTab(secondTab);
	         vn.clickondoineedwashhandsVoltarenArthristpaingel();
	        System.out.println("Verified Voltaren Do I need voltaren paingel  on Live url");
	    }			
	 @Test(priority = 38, enabled = true)
	    private void VerifyVoltarenArthiristpaingeleyes_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenArthristpaingeleyes();
	         System.out.println("Verified  Voltaren  paingel eyes Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenArthristpaingeleyes();
	        System.out.println("Verified Voltaren  paingel eyes on Live url");
	    }			
	 @Test(priority = 39, enabled = true)
	    private void VerifyVoltarenNarcoticdrugs_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenNarcoticdrugs();
	         System.out.println("Verified  Voltaren  Narcotic drugs on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenNarcoticdrugs();
	        System.out.println("Verified Voltaren  Narcotic drugs on Live url");
	    }			
	 @Test(priority = 40, enabled = true)
	    private void VerifyVoltarenpaingeladdicitive_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenpaingelAddicitive();
	         System.out.println("Verified  Voltaren  pain gel Addicitive on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenpaingelAddicitive();
	        System.out.println("Verified Voltaren  pain gel Addicitive on Live url");
	    }			
	 @Test(priority = 41, enabled = true)
	    private void VerifyVoltarenpaingeldyefree_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenpaingeldyefree();
	         System.out.println("Verified  Voltaren  pain gel dye free on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenpaingeldyefree();
	        System.out.println("Verified Voltaren  pain gel dye free on Live url");
	    }			
	 @Test(priority = 42, enabled = true)
	    private void VerifyVoltarenstoreArthristpaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonVoltarenstoreArthristpaingel();
	         System.out.println("Verified  Voltaren  store Arthrist pain gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonVoltarenstoreArthristpaingel();
	        System.out.println("Verified Voltaren  store Arthrist pain gel on Live url");
	    }			
	 @Test(priority = 43, enabled = true)
	    private void VerifySafetyprofilepaingel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSafetyprofilepaingel();
	         System.out.println("Verified  Voltaren  safety profile  pain gel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonSafetyprofilepaingel();
	        System.out.println("Verified Voltaren   safety profile pain gel on Live url");
	    }			
	 @Test(priority = 44, enabled = true)
	    private void VerifySideeffectsvoltarengel_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonSideeffectsvoltarenpaingel();
	         System.out.println("Verified  Voltaren  side effects voltarengel on Preprod url");
	         switchingTab(secondTab);
	         vn.clickonSideeffectsvoltarenpaingel();
	        System.out.println("Verified Voltaren   side effects voltarengel on Live url");
	    }			
	 @Test(priority = 45, enabled = true)
	    private void VerifylearnmoreVoltarenArthristjoymovement_Button() throws Exception {
		     switchingTab(firstTab);
	         vn.clickonlearnmoreVoltarenpaingelfeelmovement();
	         String preProdUrl = compareUrl(excelRead("Voltarengel", 1, 0));
	         switchingTab(secondTab);
	         vn.clickonlearnmoreVoltarenpaingelfeelmovement();
	         String liveUrl = compareUrl(excelRead("Voltarengel", 1, 1));
	         boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	         System.out.println("Preprod URL and Live URL are same for learnmoreVoltarenpaingelfeelmovement:"+compareTwoText);
	    }			
	 
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
