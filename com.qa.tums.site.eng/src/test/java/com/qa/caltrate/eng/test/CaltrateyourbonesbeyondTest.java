package com.qa.caltrate.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.caltrate.eng.pages.CaltrateyourbonesbeyondPage;

public class CaltrateyourbonesbeyondTest extends BaseClass{

	CaltrateyourbonesbeyondPage cc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("caltrateConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		cc=new CaltrateyourbonesbeyondPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("caltrateConfig.properties").getProperty("preProdCaltrateyourBonesBeyondUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("caltrateConfig.properties").getProperty("LiveCaltrateyourBonesBeyondUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
		 switchingTab(firstTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie in preprod url");
	        switchingTab(secondTab);
	        cc.clickCookieBtn();
	        System.out.println("Cookie  in Live url");
		}		
	 @Test(priority=1,enabled=true)
		public void verifyhomebreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonHomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonHomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=2,enabled=true)
		public void verifyBoneHealthCentralbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonbonehealthcentralbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonbonehealthcentralbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}						
	 @Test(priority=3,enabled=true)
		public void verifyInteractiveToolsbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonInteractiveToolbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonInteractiveToolbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=4,enabled=true)
		public void verifyCaltrateyourbonesbeyondbreadcrumbsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCaltrateyourbonesbeyondbreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCaltrateyourbonesbeyondbreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=5,enabled=true)
		public void verifyHormonesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonHormones();
	        System.out.println("Verify Hormones on preprod url");
	        switchingTab(secondTab);
	        cc.clickonHormones();
	        System.out.println("Verify Hormones on Live url");
		}				
	 @Test(priority=6,enabled=true)
		public void verifyTeethLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonTeeth();
	        System.out.println("Verify Teeth on preprod url");
	        switchingTab(secondTab);
	        cc.clickonTeeth();
	        System.out.println("Verify Teeth on Live url");
		}				
	 @Test(priority=7,enabled=true)
		public void verifyTeethMusclesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonMuscles();
	        System.out.println("Verify Muscles on preprod url");
	        switchingTab(secondTab);
	        cc.clickonMuscles();
	        System.out.println("Verify Muscles on Live url");
		}				
	 @Test(priority=8,enabled=true)
		public void verifyNervesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonNerves();
	        System.out.println("Verify Nerves on preprod url");
	        switchingTab(secondTab);
	        cc.clickonNerves();
	        System.out.println("Verify Nerves on Live url");
		}			
	 @Test(priority=9,enabled=true)
		public void verifyEnzymesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonEnzymes();
	        System.out.println("Verify Enzymes on preprod url");
	        switchingTab(secondTab);
	        cc.clickonEnzymes();
	        System.out.println("Verify Enzymes on Live url");
		}			
	 @Test(priority=10,enabled=true)
		public void verifyearlylifebonesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonearlybonebuliding();
	        System.out.println("Verify early bones  on preprod url");
	        switchingTab(secondTab);
	        cc.clickonearlybonebuliding();
	        System.out.println("Verify early bones on Live url");
		}			
	 @Test(priority=11,enabled=true)
		public void verifyMaintainingBoneStrengthLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonMaintaingBoneStrength();
	        System.out.println("Verify Maintaining BoneStrength  on preprod url");
	        switchingTab(secondTab);
	        cc.clickonMaintaingBoneStrength();
	        System.out.println("Verify Maintaing BoneStrength  on Live url");
		}			
	 @Test(priority=12,enabled=true)
		public void verifyBloodClothingLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonBloodClothing();
	        System.out.println("Verify Blood Clothing  on preprod url");
	        switchingTab(secondTab);
	        cc.clickonBloodClothing();
	        System.out.println("Verify Blood Clothing  on Live url");
		}			
	 @Test(priority=13,enabled=true)
		public void verifycalciumcarbonateImgLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumcarbonateImg();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumcarbonateImg();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	
	 @Test(priority=14,enabled=true)
		public void verifycalciumcarbonateLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumcarbonate();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumcarbonate();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=15,enabled=true)
		public void verifycalciumcarbonateFindOutLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonFindout();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonFindout();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=16,enabled=true)
		public void verifycalciumsoftchewproductLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncaltratesoftchewproduct();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncaltratesoftchewproduct();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}				
	 @Test(priority=17,enabled=true)
		public void verifyAllArticlesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllArticles();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllArticles();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyAllRecipesLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllRecipes();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllRecipes();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=19,enabled=true)
		public void verifyAllHealthTipsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllHealthTips();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllHealthTips();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyAllInteractivetoolsLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonAllInteractiveTools();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonAllInteractiveTools();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifyCalciumCarbonateViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonCalciumcarbonateView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonCalciumcarbonateView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyVitaminDViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonvitaminDView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonvitaminDView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	 @Test(priority=23,enabled=true)
		public void verifyOestoporosisViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickonOsteoporsisView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickonOsteoporsisView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifycalciumSupplementsViewLink() throws Throwable
		{
			switchingTab(firstTab);
	        cc.clickoncalciumsupplementsView();
	        String preProdUrl = compareUrl(excelRead("Caltrate", 1, 0));
	        switchingTab(secondTab);
	        cc.clickoncalciumsupplementsView();
	        String liveUrl = compareUrl(excelRead("Caltrate", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
