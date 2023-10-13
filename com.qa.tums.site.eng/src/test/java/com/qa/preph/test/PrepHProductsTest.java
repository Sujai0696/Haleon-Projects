package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHProductsPage;

public class PrepHProductsTest extends BaseClass{
	
	PrepHProductsPage pp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 pp=new PrepHProductsPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdProductsUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveProductsUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        pp.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
//	 @Test(priority=1,enabled=true)
//		public void verifyHomeBreadCrumbsLink() throws Throwable
//		{
//		 switchingTab(firstTab);
//	        pp.clickonHomeBreadcrumbs();
//	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
//	        switchingTab(secondTab);
//	        pp.clickonHomeBreadcrumbs();
//	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
//	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
//		}									
	 @Test(priority=2,enabled=true)
		public void verifyMedicatedWipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMedicatedWipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonMedicatedWipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated wipes:"+compareTwoText);
		}									
	 @Test(priority=3,enabled=true)
		public void verifyMedicatedWipes_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMedicatedwipes_BuyNow();
	        System.out.println("Verified Medicated BuyNow is Present on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonMedicatedwipes_BuyNow();
	        System.out.println("Verified Medicated BuyNow is Present on Live Url");
		}						
	 @Test(priority=4,enabled=true)
		public void verifyMultisymptomscreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMultisymptomscream();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonMultisymptomscream();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Multi symptoms Creame:"+compareTwoText);
		}					
	 @Test(priority=5,enabled=true)
		public void verifyMultisymptomscream_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMultisymptomscream_BuyNow();
	        System.out.println("Verified Multisymptoms Creame  BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonMultisymptomscream_BuyNow();
	        System.out.println("Verified Multisymptoms Creame  BuyNow is Present on Live Url");
		}					
	 @Test(priority=6,enabled=true)
		public void verifyOintmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonOintment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonOintment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment:"+compareTwoText);
		}					
	 @Test(priority=7,enabled=true)
		public void verifyOintment_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonOintment_BuyNow();
	       System.out.println("Verified Ointment  BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonOintment_BuyNow();
	        System.out.println("Verified Ointment  BuyNow is Present on Live Url");
		}					
	 @Test(priority=8,enabled=true)
		public void verifyTotablesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickontotables();;
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickontotables();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Totables:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyTotables_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonTotables_BuyNow();
	       System.out.println("Verified Totables  BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonTotables_BuyNow();
	        System.out.println("Verified Totables  BuyNow is Present on Live Url");
		}				
	 @Test(priority=10,enabled=true)
		public void verifyCoolinggelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonCoolinggel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonCoolinggel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cooling gel:"+compareTwoText);
		}					
	 @Test(priority=11,enabled=true)
		public void verifyCoolinggel_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonCoolingel_BuyNow();
	        System.out.println("Verified CoolingGel  BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonCoolingel_BuyNow();
	       System.out.println("Verified CoolingGel  BuyNow is Present on Live Url");
		}					
	 @Test(priority=12,enabled=true)
		public void verifyMedicatedwipeswomenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMedicatedwipeswomen();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonMedicatedwipeswomen();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated wipes women:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyMedicatedwipeswomen_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonMedicatedwipeswomen_BuyNow();
	        System.out.println("Verified Medicated wipes women BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonMedicatedwipeswomen_BuyNow();
	        System.out.println("Verified Medicated wipes women BuyNow is Present on Live Url");
		}					
	 @Test(priority=14,enabled=true)
		public void verifySuppostoriesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSuppostories();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonSuppostories();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Suppostories:"+compareTwoText);
		}					
	 @Test(priority=15,enabled=true)
		public void verifySuppostories_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSuppostories_BuyNow();
	        System.out.println("Verified suppostories BuyNow is Present on preprod Url");
	        switchingTab(secondTab);
	        pp.clickonSuppostories_BuyNow();;
	        System.out.println("Verified Suppostories BuyNow is Present on Live Url");
		}				
	 @Test(priority=16,enabled=true)
		public void verifySoothingReliefcoolingsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonsoothingReliefcoolingsparay();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonsoothingReliefcoolingsparay();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing relief cooling spray:"+compareTwoText);
		}					
	 @Test(priority=17,enabled=true)
		public void verifySoothingReliefcoolingspray_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSoothingReliefcoolingspray_BuyNow();
	        System.out.println("Verified Soothing Relief cooling spray BuyNow is Present on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonSoothingReliefcoolingspray_BuyNow();
	        System.out.println("Verified Soothing Relief cooling spray BuyNow is Present on Live Url");
		}					
	 @Test(priority=18,enabled=true)
		public void verifySoothingReliefCleansingsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSoothingreliefcleansingspray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonSoothingreliefcleansingspray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing relief cleansing spray:"+compareTwoText);
		}					
	 @Test(priority=19,enabled=true)
		public void verifySoothingReliefcleansingspray_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSoothingReliefcleansingspray_BuyNow();
	        System.out.println("Verified Soothing Relief cleansing spray BuyNow is Present on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonSoothingReliefcleansingspray_BuyNow();
	        System.out.println("Verified Soothing Relief cleansing spray BuyNow is Present on Live Url");
		}					
	 @Test(priority=20,enabled=true)
		public void verifySoothingReliefAntiitchingcreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSoothingreliefantiitchingcream();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonSoothingreliefantiitchingcream();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Soothing relief anti itching cream:"+compareTwoText);
		}					
	 @Test(priority=21,enabled=true)
		public void verifySoothingReliefAntiitchingcream_BuynowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonSoothingReliefantiitchcream_BuyNow();
	        System.out.println("Verified Soothing Relief Anti itching cream BuyNow is Present on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonSoothingReliefantiitchcream_BuyNow();
	        System.out.println("Verified Soothing Relief Anti itching cream BuyNow is Present on Live Url");
		}					
	 @Test(priority=22,enabled=true)
		public void verifylidocaineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonLidocaine();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonLidocaine();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lidocaine:"+compareTwoText);
		}					
	 @Test(priority=23,enabled=true)
		public void verifylidocaine_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonlidocaine_BuyNow();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonlidocaine_BuyNow();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LidocaineBuyNow:"+compareTwoText);
		}					
	 @Test(priority=24,enabled=true)
		public void verifyTotablewipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickontotableswipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickontotableswipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Totables wipes:"+compareTwoText);
		}					
	 @Test(priority=25,enabled=true)
		public void verifyTotablewipes_BuyNowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonTotableswipes_BuyNow();
	        System.out.println("Verified Totable wipes  BuyNow is present on Preprod Url");
	        switchingTab(secondTab);
	        pp.clickonTotableswipes_BuyNow();
	        System.out.println("Verified Totable wipes  BuyNow is present on Live Url");
		}					
	 @Test(priority=26,enabled=true)
		public void verifyLidocainecreamLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonlidocainecream();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonlidocainecream();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LidocaineCream:"+compareTwoText);
		}					
	 @Test(priority=27,enabled=true)
		public void verifyLidocainecream_BuynowLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickonLidocaineCreame_BuyNow();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickonLidocaineCreame_BuyNow();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for LidocaineCream buynow:"+compareTwoText);
		}					
	 @Test(priority=28,enabled=true)
		public void verifyGetReliefLink() throws Throwable
		{
		 switchingTab(firstTab);
	        pp.clickongetrelief();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        pp.clickongetrelief();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for GetRelief:"+compareTwoText);
		}					
	
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
