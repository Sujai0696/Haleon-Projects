package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrepHSitemapPage;

public class PrepHSitemapTest extends BaseClass{
	
	PrepHSitemapPage ps;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		 ps=new PrepHSitemapPage();
	        switchingTab(firstTab);
	        launchURL(loadConfig("preph_Config.properties").getProperty("preProdSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("preph_Config.properties").getProperty("LiveSitemapUrl"));
		 }	
	 
	 @Test(priority=0,enabled=true)
		public void verifyPreph_cookiePopupLink() throws Throwable
		{
			switchingTab(firstTab);
	        ps.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Preprod Url");
	        switchingTab(secondTab);
	        ps.clickonCookieBtn();
	        System.out.println("Verify Preph Cookie Popup on Live Url");
		}							
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHomeBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHomeBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HomeBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=2,enabled=true)
		public void verifySitemapBreadCrumbsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonSitemapBreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonSitemapBreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for SitemapBreadcrumbs:"+compareTwoText);
		}										
	 @Test(priority=3,enabled=true)
		public void verifyHomepageLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHomepage();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHomepage();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Homepage:"+compareTwoText);
		}									
	 @Test(priority=4,enabled=true)
		public void verifyFAQLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonFAQ();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonFAQ();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for FAQ:"+compareTwoText);
		}									
	 @Test(priority=5,enabled=true)
		public void verifyWheretoBuyLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonWheretobuy();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonWheretobuy();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Where to Buy:"+compareTwoText);
		}									
	 @Test(priority=6,enabled=true)
		public void verifyContactusLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonContactUs();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonContactUs();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Contact Us:"+compareTwoText);
		}							
	 @Test(priority=7,enabled=true)
		public void verifyProductsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonproducts();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonproducts();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Products:"+compareTwoText);
		}					
	 @Test(priority=8,enabled=true)
		public void verifyCoolingsprayLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonCoolingSpray();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonCoolingSpray();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cooling spray:"+compareTwoText);
		}					
	 @Test(priority=9,enabled=true)
		public void verifyCleansingCoolingwipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickoncleansingcoolingwipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickoncleansingcoolingwipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Cleansing cooling wipes:"+compareTwoText);
		}					
	 @Test(priority=10,enabled=true)
		public void verifyAntiitchingCreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonAntiitchingcreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonAntiitchingcreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Anti itching creame:"+compareTwoText);
		}					
	 @Test(priority=11,enabled=true)
		public void verifyLidocaineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonlidocaine();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonlidocaine();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lidocaine:"+compareTwoText);
		}					
	
	 @Test(priority=12,enabled=true)
		public void verifyLidocainecreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonlidocainecream();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonlidocainecream();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Lidocaine_creame:"+compareTwoText);
		}					
	 @Test(priority=13,enabled=true)
		public void verifyTotablewipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickontotablewipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickontotablewipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for totable wipes:"+compareTwoText);
		}					
	 @Test(priority=14,enabled=true)
		public void verifyOintmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonOintment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonOintment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Ointment:"+compareTwoText);
		}					
	 @Test(priority=15,enabled=true)
		public void verifyMultisymptomscreameLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonMultisymptomscreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonMultisymptomscreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for multisymptomscreame:"+compareTwoText);
		}					
	 @Test(priority=16,enabled=true)
		public void verifySuppostoriesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonSuppostories();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonSuppostories();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for suppostories:"+compareTwoText);
		}					
	 @Test(priority=17,enabled=true)
		public void verifyCoolinggelLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonCoolinggel();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonCoolinggel();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Coolinggel:"+compareTwoText);
		}					
	 @Test(priority=18,enabled=true)
		public void verifyTotablesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickontotables();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickontotables();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Totables:"+compareTwoText);
		}					
	 @Test(priority=19,enabled=true)
		public void verifyMedicatedWipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonMedicatedWipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonMedicatedWipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated wipes:"+compareTwoText);
		}					
	 @Test(priority=20,enabled=true)
		public void verifyMedicatedWipeswomenLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonMedicatedWipeswomen();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonMedicatedWipeswomen();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Medicated wipes women:"+compareTwoText);
		}					
	 @Test(priority=21,enabled=true)
		public void verifyArticlesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonArticles();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonArticles();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Articles:"+compareTwoText);
		}					
	 @Test(priority=22,enabled=true)
		public void verifyHemorroidlastLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHemorroidlast();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHemorroidlast();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Hemorroidlast:"+compareTwoText);
		}					
	 @Test(priority=23,enabled=true)
		public void verifyHemorroidbleedingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHemorroidbleeding();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHemorroidbleeding();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for HemorroidBleeding:"+compareTwoText);
		}					
	 @Test(priority=24,enabled=true)
		public void verifytellhimHemorroidLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickontellHemorroid();;
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickontellHemorroid();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same forTell hemoroid:"+compareTwoText);
		}					
	 @Test(priority=25,enabled=true)
		public void verifytreatingflareupLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickontreatingflareup();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickontreatingflareup();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for treating flareup:"+compareTwoText);
		}					
	 @Test(priority=26,enabled=true)
		public void verifyEmotionaltollLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonemotionaltoll();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonemotionaltoll();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for emotional toll:"+compareTwoText);
		}					
	 @Test(priority=27,enabled=true)
		public void verifyUsingBathroomLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonusingbathroom();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonusingbathroom();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using bathroom:"+compareTwoText);
		}					
	 @Test(priority=28,enabled=true)
		public void verifyjustformomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonjustformoms();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonjustformoms();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using just for momms:"+compareTwoText);
		}					
	 @Test(priority=29,enabled=true)
		public void verifywhatarehemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwhatarehemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwhatarehemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using what are hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=30,enabled=true)
		public void verifywhogetshemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwhogetshemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwhogetshemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using who gets hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=31,enabled=true)
		public void verifySymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonSymptoms();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonSymptoms();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using Symptoms:"+compareTwoText);
		}					
	 @Test(priority=32,enabled=true)
		public void verifywhatcauseshemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwhatcauseshemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwhatcauseshemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using what causes hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=33,enabled=true)
		public void verifyMedicalTreatmentLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonMedicalTreatment();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonMedicalTreatment();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using Medical Treatment:"+compareTwoText);
		}					
	 @Test(priority=34,enabled=true)
		public void verifyHemorrhoiddiscussionguideLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHemorrhoiddiscussionguide();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHemorrhoiddiscussionguide();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using hemorrhoid discussion guide:"+compareTwoText);
		}					
	 @Test(priority=35,enabled=true)
		public void verifyStressConstipationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonStressConstipation();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonStressConstipation();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using Stress Constipation:"+compareTwoText);
		}					
	 @Test(priority=36,enabled=true)
		public void verifycanstresscausehemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickoncanStresscausehemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickoncanStresscausehemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using can stress cause hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=37,enabled=true)
		public void verifyItchyButtLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonitchybutt();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonitchybutt();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using itchy butt:"+compareTwoText);
		}					
	 @Test(priority=38,enabled=true)
		public void verifyPacknexttripLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonpacknexttrip();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonpacknexttrip();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using pack next trip:"+compareTwoText);
		}					
	 @Test(priority=39,enabled=true)
		public void verifyeverythingneedtodoneLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickoneverythingneedtoknow();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickoneverythingneedtoknow();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for usingevery thing need to done:"+compareTwoText);
		}					
	 @Test(priority=40,enabled=true)
		public void verifysurprisingthingirriatebuttLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonsurprisingthingirritatebutt();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonsurprisingthingirritatebutt();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using surprising thing irriate butt:"+compareTwoText);
		}					
	 @Test(priority=41,enabled=true)
		public void verifyGiproblemsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickongiproblems();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickongiproblems();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using gi problems:"+compareTwoText);
		}					
	 @Test(priority=42,enabled=true)
		public void verifyCouldliftingweightcausehemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickoncouldliftingweighthemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickoncouldliftingweighthemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using could lifting weight cause hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=43,enabled=true)
		public void verifystayingregularvaccationLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonstayingregularvaccation();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonstayingregularvaccation();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using staying regular expression:"+compareTwoText);
		}					
	 @Test(priority=44,enabled=true)
		public void verifygiftssomeoneexpectingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickongiftssomeoneexpecting();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickongiftssomeoneexpecting();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using gift someone expecting:"+compareTwoText);
		}					
	 @Test(priority=45,enabled=true)
		public void verifywashinguproutineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwashinguproutine();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwashinguproutine();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using washing up routine:"+compareTwoText);
		}					
	 @Test(priority=46,enabled=true)
		public void verifyDiscomfortwhensittingLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickondiscomfortwhensitting();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickondiscomfortwhensitting();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using discomfort when sitting:"+compareTwoText);
		}					
	 @Test(priority=47,enabled=true)
		public void verifyFlareupsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonflareups();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonflareups();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using flareups:"+compareTwoText);
		}					
	 @Test(priority=48,enabled=true)
		public void verifyHemorrhoidpainLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhemorrhoidspain();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhemorrhoidspain();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using hemorrhoid pain:"+compareTwoText);
		}					
	 @Test(priority=49,enabled=true)
		public void verifyHemorrhoidmedicineLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhemorrhoidsmedicine();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhemorrhoidsmedicine();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using hemorrhoid medicine:"+compareTwoText);
		}					
	 @Test(priority=50,enabled=true)
		public void verifyHomeremediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhomeremedies();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhomeremedies();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using home remedies:"+compareTwoText);
		}					
	 @Test(priority=51,enabled=true)
		public void verifysignhemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonsignshemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonsignshemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using sign hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=52,enabled=true)
		public void verifywitchhazelhemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwitchhazelhemorrhoids();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwitchhazelhemorrhoids();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using witchhazel hemorrhoids:"+compareTwoText);
		}					
	 @Test(priority=53,enabled=true)
		public void verifyAllaboutPostpartumLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonallaboutpostpartum();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonallaboutpostpartum();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using all about postpartum:"+compareTwoText);
		}					
	 @Test(priority=54,enabled=true)
		public void verifyCanHemorrhoidpopLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickoncanhemorrhoidpopup();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickoncanhemorrhoidpopup();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using can hemorrhoid pop:"+compareTwoText);
		}					
	 @Test(priority=55,enabled=true)
		public void verifyPreventHomeRemediesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonpreventhomeremedies();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonpreventhomeremedies();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using prevent homeremedies:"+compareTwoText);
		}					
	 @Test(priority=56,enabled=true)
		public void verifyHemorrhoidwipesLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhemorrhoidwipes();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhemorrhoidwipes();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using hemorrhoid wipes:"+compareTwoText);
		}					
	 @Test(priority=57,enabled=true)
		public void verifyHighfiberdietLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhighfiberdiet();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhighfiberdiet();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using high fiber diet:"+compareTwoText);
		}					
	 @Test(priority=58,enabled=true)
		public void verifyRelieffinderLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonRelieffinder();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonRelieffinder();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for using Relief finder:"+compareTwoText);
		}					
	 @Test(priority=59,enabled=true)
		public void verifyoffersLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonoffers();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonoffers();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for usingoffers:"+compareTwoText);
		}					
	 @Test(priority=60,enabled=true)
		public void verifynewslettersignupLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonnewslettersignup();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonnewslettersignup();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for newsletter signup:"+compareTwoText);
		}					
	 @Test(priority=61,enabled=true)
		public void verifyVideosLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonvideos();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonvideos();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for videos:"+compareTwoText);
		}					
	 @Test(priority=62,enabled=true)
		public void verifyHowtoapplyOintmentgelsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhowtoapplyointmentsgels();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhowtoapplyointmentsgels();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for howtoapplyointmentgels:"+compareTwoText);
		}					
	 @Test(priority=63,enabled=true)
		public void verifyHowtoinsertPrepartionHLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhowtoinsertprepartionH();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhowtoinsertprepartionH();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for howto insert PrepartionH:"+compareTwoText);
		}					
	 @Test(priority=64,enabled=true)
		public void verifyApplicatorLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonApplicator();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonApplicator();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Applicator:"+compareTwoText);
		}					
	 @Test(priority=65,enabled=true)
		public void verifyMultisymptomscreame1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonmultisymptomscreame();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonmultisymptomscreame();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for Multi symptoms creame:"+compareTwoText);
		}					
	 @Test(priority=66,enabled=true)
		public void verifyPregancyHemorrhoidsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonPregancyHemorrhoid();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonPregancyHemorrhoid();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for PregancyHemmorhoids:"+compareTwoText);
		}					
	 @Test(priority=67,enabled=true)
		public void verifyHowtotreatHemorrhoidsymptomsLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonhowtotreathemorrhoidsymptoms();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonhowtotreathemorrhoidsymptoms();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for How to treat hemorrhoid symptoms:"+compareTwoText);
		}					
	 @Test(priority=68,enabled=true)
		public void verifyWhatareHemorrhoids1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonwhatarehemorrhoids1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonwhatarehemorrhoids1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for what are hemorrhoids 1:"+compareTwoText);
		}					
	 @Test(priority=69,enabled=true)
		public void verifyHemorrhoidruinallLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonHemorrhoidruinall();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonHemorrhoidruinall();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same for what are hemorrhoids ruinall:"+compareTwoText);
		}					
	 @Test(priority=70,enabled=true)
		public void verifydontfeelremorseLink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickondontfeelremorse();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickondontfeelremorse();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same dont feel remorse:"+compareTwoText);
		}					
	 @Test(priority=71,enabled=true)
		public void verifySitemap1Link() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonsitemap1();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonsitemap1();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  for sitemap1:"+compareTwoText);
		}					
	 @Test(priority=72,enabled=true)
		public void verifyFSAHSALink() throws Throwable
		{
		 switchingTab(firstTab);
	        ps.clickonfsahsa();
	        String preProdUrl = compareUrl(excelRead("Preph_US", 1, 0));
	        switchingTab(secondTab);
	        ps.clickonfsahsa();
	        String liveUrl = compareUrl(excelRead("Preph_US", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same  for FSAHSA:"+compareTwoText);
		}					
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
