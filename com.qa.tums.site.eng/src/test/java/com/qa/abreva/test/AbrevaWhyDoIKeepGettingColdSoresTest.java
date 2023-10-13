package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaWhyDoIKeepGettingColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaWhyDoIKeepGettingColdSoresTest extends BaseClass{
	
	AbrevaWhyDoIKeepGettingColdSoresPage gcs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		gcs = new AbrevaWhyDoIKeepGettingColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whyDoIKeepGettingColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("whyDoIKeepGettingColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		gcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		gcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHyperLinkAvoidSpreadingTheVirus() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkAvoidSpreadingTheVirus();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkAvoidSpreadingTheVirus();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Avoid Spreading The Virus: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHyperLinkTheCOldSoreVirus() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkTheCOldSoreVirus();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkTheCOldSoreVirus();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink The COld Sore Virus: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHyperLinkANumberOfTriggers() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkANumberOfTriggers();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkANumberOfTriggers();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink A Number Of Triggers: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHyperLinkStress() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkStress();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkStress();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Stress: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkAvoidOralContactLikeKissing() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkAvoidOralContactLikeKissing();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkAvoidOralContactLikeKissing();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Avoid Oral Contact Like Kissing: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHyperLinkColdSoreBlisters() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkColdSoreBlisters();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkColdSoreBlisters();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sore Blisters: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHyperLinkSunAndColdSores() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkSunAndColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkSunAndColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Sun And Cold Sores: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyHyperLinkRelaxationTechniquesForManaging() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkRelaxationTechniquesForManaging();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkRelaxationTechniquesForManaging();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Relaxation Techniques For Managing: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyHyperLinkSurvivingADentistVisit() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkSurvivingADentistVisit();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkSurvivingADentistVisit();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Surviving A Dentist Visit: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyHyperLinkTheFascinatingConnection() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkTheFascinatingConnection();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkTheFascinatingConnection();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink The Fascinating Connection: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyHyperLinkReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		gcs.clickHyperLinkReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		gcs.clickHyperLinkReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		gcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		gcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}

}
