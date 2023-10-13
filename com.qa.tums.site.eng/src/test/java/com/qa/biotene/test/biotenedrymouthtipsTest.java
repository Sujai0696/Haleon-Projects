package com.qa.biotene.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.biotene.pages.biotenedrymouthtipsPage;

public class biotenedrymouthtipsTest extends BaseClass{
	
	biotenedrymouthtipsPage bd;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("biotene_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 bd=new biotenedrymouthtipsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("biotene_Config.properties").getProperty("preProdBiotenedrymouthtipsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("biotene_Config.properties").getProperty("LiveBiotenedrymouthtipsUrl"));
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
		public void verifyTipsBiotenebreadcrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTipsbioteneBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTipsbioteneBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for tipsbiotene_Breadcrumbs:"+compareTwoText);
		}									
	 @Test(priority=4,enabled=true)
		public void verifyHealthyTipsAgingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonEastTipsHealthyAging();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonEastTipsHealthyAging();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for EasyTipsHealthAging:"+compareTwoText);
		}									
	 @Test(priority=5,enabled=true)
		public void verifyMakechickenbrothLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonmakechickenbroth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonmakechickenbroth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for makechickenbroth:"+compareTwoText);
		}		
	 @Test(priority=6,enabled=true)
		public void verifyTeasRelaxtionLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTeasRelaxtion();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTeasRelaxtion();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for TeasRelaxation:"+compareTwoText);
		}		
	 @Test(priority=7,enabled=true)
		public void verifyBenefitsHydratedLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBenfitsHydrated();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBenfitsHydrated();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BenefitsHydrated:"+compareTwoText);
		}		
	 @Test(priority=8,enabled=true)
		public void verifydehydrationSymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDehydrationSymptoms();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDehydrationSymptoms();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for dehydration Symptoms:"+compareTwoText);
		}		
	
	 @Test(priority=9,enabled=true)
		public void verifyAlcholdrymouthLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonAlcholdrymouth();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonAlcholdrymouth();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for AlcholdryMouth:"+compareTwoText);
		}		
	 @Test(priority=10,enabled=true)
		public void verifyCaffenineworseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCaffenieworks();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCaffenieworks();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Caffenineworse:"+compareTwoText);
		}		
	 @Test(priority=11,enabled=true)
		public void verifyDaydoingbetterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDaydoingbetter();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDaydoingbetter();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Daydoingbetter:"+compareTwoText);
		}		
	 @Test(priority=12,enabled=true)
		public void verifyDrymouthreallylikeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickondrymouthreallylike();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickondrymouthreallylike();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DryMouthReallyLike:"+compareTwoText);
		}		
	 @Test(priority=13,enabled=true)
		public void verifyHealthPriorityLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonTipsHealthPriority();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonTipsHealthPriority();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for TipsPriority:"+compareTwoText);
		}		
	
	 @Test(priority=14,enabled=true)
		public void verifyPlanTravelComfortableLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonplancomfortable();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonplancomfortable();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for plancomfortable:"+compareTwoText);
		}		
	 @Test(priority=15,enabled=true)
		public void verifyPumpkinReciepeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonpumpkinReceipe();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonpumpkinReceipe();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for pumpkinReciepe:"+compareTwoText);
		}		
	 @Test(priority=16,enabled=true)
		public void verifyInfusedwaterReciepeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonInfusedWaterReceipe();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonInfusedWaterReceipe();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for InfusedwaterReciepe:"+compareTwoText);
		}		
	 @Test(priority=17,enabled=true)
		public void verifySoupReciepeLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonFallInspiredsoupReceipe();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonFallInspiredsoupReceipe();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SoupReciepe:"+compareTwoText);
		}		
	 @Test(priority=18,enabled=true)
		public void verifyCocunutwaterLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonCocunutwater();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonCocunutwater();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for CocunutWater:"+compareTwoText);
		}		
	 @Test(priority=19,enabled=true)
		public void verifyHydratingsummerfruitsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHydratingsummerfruits();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHydratingsummerfruits();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hydratingsummerefruits:"+compareTwoText);
		}		
	 @Test(priority=20,enabled=true)
		public void verifyPicnicFoodLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonPicnicFood();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonPicnicFood();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PicnicFood:"+compareTwoText);
		}		
	 @Test(priority=21,enabled=true)
		public void verifydrymouthRoadLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonDryMouthRoad();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonDryMouthRoad();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for DryMouthRoad:"+compareTwoText);
		}		
	 @Test(priority=22,enabled=true)
		public void verifyHealthyPackingListLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonHealthypackingList();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonHealthypackingList();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Healthypackinglist:"+compareTwoText);
		}		
	 @Test(priority=23,enabled=true)
		public void verifyBenefitsWalkingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBenefitswalking();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBenefitswalking();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BenefitsWalking:"+compareTwoText);
		}		
	 @Test(priority=24,enabled=true)
		public void verifyBecomeAdvocateLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbecomeAdvocate();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbecomeAdvocate();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for BecomeAdvocate:"+compareTwoText);
		}		
	 @Test(priority=25,enabled=true)
		public void verifyVacationsummerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonVacationSummer();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonVacationSummer();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for VacationSummer:"+compareTwoText);
		}		
	 @Test(priority=26,enabled=true)
		public void verifyBeachbetterthisSummerLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonbeachbetterSummer();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonbeachbetterSummer();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Beachbettersummer:"+compareTwoText);
		}		
	 @Test(priority=27,enabled=true)
		public void verifyBetterthisyearLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonBetterthisYear();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonBetterthisYear();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Betterthisyear:"+compareTwoText);
		}		
	 @Test(priority=28,enabled=true)
		public void verifySymptomsmissingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        bd.clickonSymptomsmissing();
	        String preProdUrl = compareUrl(excelRead("Biotene_US", 1, 0));
	        switchingTab(secondTab);
	        bd.clickonSymptomsmissing();
	        String liveUrl = compareUrl(excelRead("Biotene_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SymptomsMissing:"+compareTwoText);
		}		
	
	
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	

}
