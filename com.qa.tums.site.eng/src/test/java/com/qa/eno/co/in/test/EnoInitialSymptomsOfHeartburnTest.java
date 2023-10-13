package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoInitialSymptomsOfHeartburnPage;

public class EnoInitialSymptomsOfHeartburnTest extends BaseClass{

	EnoInitialSymptomsOfHeartburnPage ish;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		ish = new EnoInitialSymptomsOfHeartburnPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("initialSymptomsOfHeartburnPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("initialSymptomsOfHeartburnLiveUrl"));
	}

	@Test(priority = 0)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		ish.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ish.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}



	@Test(priority = 1)
	private void verifyHomeRemediesForIndigestionImg() throws Exception{
		switchingTab(firstTab);
		ish.clickHomeRemediesForIndigestionImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickHomeRemediesForIndigestionImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HomeRemedies For Indigestion Img : "+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyHomeRemediesForIndigestionText() throws Exception{
		switchingTab(firstTab);
		ish.clickHomeRemediesForIndigestionText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickHomeRemediesForIndigestionText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HomeRemedies For Indigestion Text : "+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyHomeRemediesForIndigestionPara() throws Exception{
		switchingTab(firstTab);
		ish.clickHomeRemediesForIndigestionPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickHomeRemediesForIndigestionPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HomeRemedies For Indigestion Img : "+compareTwoText);
	}

	@Test(priority = 4)
	private void verifyGasReliefImg() throws Exception{
		switchingTab(firstTab);
		ish.clickGasReliefImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickGasReliefImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Img : "+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyGasReliefText() throws Exception{
		switchingTab(firstTab);
		ish.clickGasReliefText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickGasReliefText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Text : "+compareTwoText);
	}

	@Test(priority = 6)
	private void verifyGasReliefPara() throws Exception{
		switchingTab(firstTab);
		ish.clickGasReliefPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickGasReliefPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Para : "+compareTwoText);
	}

	@Test(priority = 9)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ish.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ish.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}

	@Test(priority = 10, enabled = true)
	private void verifyPrevious() throws Throwable {
		switchingTab(firstTab);
		ish.clickonPrevious();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickonPrevious();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 11, enabled = true)
	private void verifyNext() throws Throwable {
		switchingTab(firstTab);
		ish.clickonNext();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ish.clickonNext();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
