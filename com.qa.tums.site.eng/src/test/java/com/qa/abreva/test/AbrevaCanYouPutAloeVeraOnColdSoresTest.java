package com.qa.abreva.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.abreva.pages.AbrevaCanYouPutAloeVeraOnColdSoresPage;
import com.qa.baseClass.BaseClass;

public class AbrevaCanYouPutAloeVeraOnColdSoresTest extends BaseClass{
	
	AbrevaCanYouPutAloeVeraOnColdSoresPage avcs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Abreva_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		avcs = new AbrevaCanYouPutAloeVeraOnColdSoresPage();
		switchingTab(firstTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("canYouPutAloeVeraOnColdSoresPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("Abreva_Config.properties").getProperty("canYouPutAloeVeraOnColdSoresLiveUrl"));
	}

	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		avcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		avcs.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyHyperLinkHelpingHealColdSores() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkHelpingHealColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkHelpingHealColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Helping Heal Cold Sores: "+compareTwoText);
	}
	

	@Test(priority = 2)
	private void verifyHyperLinkColdSores() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkColdSores();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkColdSores();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Cold Sores: "+compareTwoText);
	}
	

	@Test(priority = 3)
	private void verifyHyperLinkAbrevaColdSoreCream() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkAbrevaColdSoreCream();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkAbrevaColdSoreCream();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Abreva Cold Sore Cream: "+compareTwoText);
	}
	

	@Test(priority = 4)
	private void verifyHyperLinkHowToStayTriggerFree() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkHowToStayTriggerFree();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkHowToStayTriggerFree();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink How To Stay Trigger Free: "+compareTwoText);
	}
	

	@Test(priority = 5)
	private void verifyHyperLinkRelaxationTechniques() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkRelaxationTechniques();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkRelaxationTechniques();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Relaxation Techniques: "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyHyperLinkTheConnectionBetweenHormones() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkTheConnectionBetweenHormones();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkTheConnectionBetweenHormones();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink The Connection Between Hormones: "+compareTwoText);
	}
	

	@Test(priority = 7)
	private void verifyHyperLinkHowToNavigateACold() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkHowToNavigateACold();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkHowToNavigateACold();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink How To Navigate A Cold: "+compareTwoText);
	}
	

	@Test(priority = 8)
	private void verifyHyperLinkReadOurLipCareTips() throws Exception{
		switchingTab(firstTab);
		avcs.clickHyperLinkReadOurLipCareTips();
		String preProdUrl = compareUrl(excelRead("Abreva", 1, 0));
		switchingTab(secondTab);
		avcs.clickHyperLinkReadOurLipCareTips();
		String liveUrl = compareUrl(excelRead("Abreva", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLink Read Our Lip Care Tips: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		avcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the preprod URL");
		switchingTab(secondTab);
		avcs.clickBuyNow();
		System.out.println("Buy Now Button verified in the Live URL");
	}
	

}
