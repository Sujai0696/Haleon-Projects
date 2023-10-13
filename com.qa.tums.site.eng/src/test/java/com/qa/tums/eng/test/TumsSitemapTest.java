package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsSitemapPages;

public class TumsSitemapTest extends BaseClass{
	
	TumsSitemapPages ts;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("tumsConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}
	 @BeforeMethod
	    private void launchingTheUrl() throws IOException, Exception {
		ts=new TumsSitemapPages();
	        switchingTab(firstTab);
	        launchURL(loadConfig("tumsConfig.properties").getProperty("preProdTumsSitemapUrl"));
			switchingTab(secondTab);
			launchURL(loadConfig("tumsConfig.properties").getProperty("liveTumsSitemapUrl"));
		 }
	 @Test(priority=0,enabled=true)
		public void verifyCookieLink() throws Throwable
		{
			switchingTab(firstTab);
	        ts.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Preprod Url");
	        switchingTab(secondTab);
	        ts.clickCookieBtn();
	       System.out.println("Verify Cookie Btn on Live Url");
		}
	 @Test(priority=1,enabled=true)
		public void verifyHomeBreadcrumbsLink() throws Throwable
		{
			
			switchingTab(firstTab);
	        ts.clickonhomebreadcrumbs();
	        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
	        switchingTab(secondTab);
	        ts.clickonhomebreadcrumbs();
	        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
	        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
		}		
	@Test(priority=2,enabled=true)
	public void verifySitemapBreadcrumbsLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonsitemapbreadcrumbs();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonsitemapbreadcrumbs();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=3,enabled=true)
	public void verifyTumshomeLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickontumshome();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickontumshome();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=4,enabled=true)
	public void verifyHeartburn101Link() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburn101();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburn101();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=5,enabled=true)
	public void verifysymptomsLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonsymptoms();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonsymptoms();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=6,enabled=true)
	public void verifysignsevereburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonsignseverburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonsignseverburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=7,enabled=true)
	public void verifyheartburnfeellikeLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnfeellike();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnfeellike();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=8,enabled=true)
	public void verifyheartburnnightLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnnight();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnnight();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=9,enabled=true)
	public void verifyknowacidrefluxLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonknowacidreflux();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonknowacidreflux();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=10,enabled=true)
	public void verifyheartburntriggersLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburntriggers();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburntriggers();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=11,enabled=true)
	public void verifysevensurprisingheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonsevensurprisingheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonsevensurprisingheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=12,enabled=true)
	public void verifyheartburnchecklistLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnshecklist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnshecklist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=13,enabled=true)
	public void verifyacidrefluxGERDLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonacidrefluxvGERDlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonacidrefluxvGERDlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=13,enabled=true)
	public void verifyheartburnindigestionLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnindigestionlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnindigestionlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=14,enabled=true)
	public void verifyfoodcausesheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonfoodcausesheartburn();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonfoodcausesheartburn();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=15,enabled=true)
	public void verifyupsetstomachLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonupsetstomachlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonupsetstomachlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=16,enabled=true)
	public void verifysymptomstreatmentLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonsymptomstreatmentlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonsymptomstreatmentlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=17,enabled=true)
	public void verifyquickheartburnreliefLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonquickheartburnrelieflist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonquickheartburnrelieflist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=18,enabled=true)
	public void verifyreduceheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonreduceheartburnlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonreduceheartburnlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=19,enabled=true)
	public void verifyindigestionremediesLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonindigestionremedieslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonindigestionremedieslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=20,enabled=true)
	public void verifyTumsrightproductLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsrightproductlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsrightproductlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=21,enabled=true)
	public void verifygasreliefLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickongasrelieflist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickongasrelieflist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	@Test(priority=22,enabled=true)
	public void verifyheartburnexerciseLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnexerciselist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnexerciselist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=23,enabled=true)
	public void verifynaturalremediesheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonnaturalremediesheartburnlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonnaturalremediesheartburnlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=24,enabled=true)
	public void verifyimprovesguthealthLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonimprovesguthealthlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonimprovesguthealthlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=25,enabled=true)
	public void verifyguthealthfoodLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonguthealthfoodlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonguthealthfoodlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=26,enabled=true)
	public void verifyhowtumworkLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonhowtumworklist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonhowtumworklist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=27,enabled=true)
	public void verifywhyantacidworkLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonwhyantacidworklist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonwhyantacidworklist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=28,enabled=true)
	public void verifylifestylechangesreduceheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonlifestylechangesheartburnlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonlifestylechangesheartburnlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	@Test(priority=29,enabled=true)
	public void verifyheartburndietLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburndietlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburndietlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=30,enabled=true)
	public void verifyheartburnremediesLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonheartburnreliefhomeremedieslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonheartburnreliefhomeremedieslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=31,enabled=true)
	public void verifyfivewaysrelievestressLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonfivewaysrelievestresslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonfivewaysrelievestresslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=32,enabled=true)
	public void verifychoosecounterheartburnmedicationLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonchoosecounterheartburnmedicationlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonchoosecounterheartburnmedicationlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=33,enabled=true)
	public void verifystressheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonstressheartburnlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonstressheartburnlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=34,enabled=true)
	public void verifyTumspregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsPregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsPregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=35,enabled=true)
	public void verifyRemediesheartburnduringpregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonRemediesheartburnduringpregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonRemediesheartburnduringpregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=36,enabled=true)
	public void verifyProbioticduringpregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonProbioticduringpregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonProbioticduringpregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=37,enabled=true)
	public void verifyPregancySymptomsheartburnLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonPregancysymptomsheartburnlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonPregancysymptomsheartburnlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=38,enabled=true)
	public void verifyFoodtoeatduringpregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonFoodtoeatduringpregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonFoodtoeatduringpregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=39,enabled=true)
	public void verifyCausesHeaartburnduringpregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonCausesheartburnduringPregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonCausesheartburnduringPregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	@Test(priority=40,enabled=true)
	public void verifyHealthupregancytipsLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonHealthypregancyTipslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonHealthypregancyTipslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=41,enabled=true)
	public void verifyWomendealtpregancyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonwomendealtpregancylist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonwomendealtpregancylist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=42,enabled=true)
	public void verifyEarlypregancysignLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonearlypregancysignlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonearlypregancysignlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=43,enabled=true)
	public void verifyaboutTumsLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonaboutTumslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonaboutTumslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=44,enabled=true)
	public void verifyProductselectorLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonProductselectorlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonProductselectorlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=45,enabled=true)
	public void verifyTumsNaturalLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsnaturallist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsnaturallist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=46,enabled=true)
	public void verifyChewybitesLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonChewybiteslist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonChewybiteslist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=47,enabled=true)
	public void verifyChewybitescoolingsensationLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonChewybitescoolingsensationlist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonChewybitescoolingsensationlist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=48,enabled=true)
	public void verifyChewybitesgasreliefLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonChewybitesgasrelieflist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonChewybitesgasrelieflist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=49,enabled=true)
	public void verifyAntacidsugarfreeLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonAntacidsugarfreelist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonAntacidsugarfreelist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	@Test(priority=50,enabled=true)
	public void verifyAntacidsmoothiesLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonAntacidsmoothiesist();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonAntacidsmoothiesist();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=51,enabled=true)
	public void verifyAntacidchewybitesLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonAntacidchewydelight();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonAntacidchewydelight();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=52,enabled=true)
	public void verifyTumsultraLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsultra();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsultra();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=53,enabled=true)
	public void verifyTumsextraLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsextra();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsextra();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=54,enabled=true)
	public void verifyTumsregularLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonTumsregular();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonTumsregular();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=55,enabled=true)
	public void verifyCouponsLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickoncoupons();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickoncoupons();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=56,enabled=true)
	public void verifyFAQLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonFAQ();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonFAQ();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=57,enabled=true)
	public void verifyContactusLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonContactus();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonContactus();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=58,enabled=true)
	public void verifyWheretobuyLink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonwheretobuy();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonwheretobuy();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	@Test(priority=59,enabled=true)
	public void verifyHSAorFSALink() throws Throwable
	{
		
		switchingTab(firstTab);
        ts.clickonhsaorfsa();
        String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
        switchingTab(secondTab);
        ts.clickonhsaorfsa();
        String liveUrl = compareUrl(excelRead("Tums", 1, 1));
        boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
        System.out.println("Preprod URL and Live URL are same :"+compareTwoText);
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
