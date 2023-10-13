package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenealldaysymptomreliefPage;

public class biotenealldaysymptomreliefTest extends BaseClass{
	
	biotenealldaysymptomreliefPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenealldaysymptomreliefPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBioteneAlldaysymptomreliefUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBioteneAlldaysymptomreliefUrl"));
		 }	
	 @Test(priority=0,enabled=true)
		public void verifyBiotenecookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Preprod URL");
	        switchingTab(secondTab);
	        bd.clickonCookieBtn();
	        bd.clickonEmailBtn();
	        System.out.println("Cookie Button and Email Pop-up successfully verified in the Live URL");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}						
	 @Test(priority=2,enabled=true)
		public void verifyLivingdrymouthLinkbreadcrumbs() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonlivingdrymouthBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LivingdrymouthBreadcrumbs:"+compareTwoText);
		}							
	 @Test(priority=3,enabled=true)
		public void verifydaydoingbetterbreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondaydoingbetterBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondaydoingbetterBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for daydoingbetter_Breadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=4,enabled=true)
		public void verifyOralRinseMouthwashLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonOralRinseMouthwash();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonOralRinseMouthwash();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for oralrinsemouthwash:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyMoisturizingsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonMoisturizingspray();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonMoisturizingspray();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Moisturizingspray:"+compareTwoText);
		}			
	 @Test(priority=6,enabled=true)
		public void verifyOralBalancemoisyurizinggelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonOralbalanceMoisturizinggel();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonOralbalanceMoisturizinggel();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for OralBalanceMoisturizingGel:"+compareTwoText);
		}			
	 @Test(priority=7,enabled=true)
		public void verifyTakequizLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTakequiz();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTakequiz();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for takequiz:"+compareTwoText);
		}			
	 @Test(priority=8,enabled=true)
		public void verifyReadmoreLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReadmore();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReadmore();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore:"+compareTwoText);
		}			
	 @Test(priority=9,enabled=true)
		public void verifyReadmore2Link() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonReadmore2();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonReadmore2();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Readmore2:"+compareTwoText);
		}			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
