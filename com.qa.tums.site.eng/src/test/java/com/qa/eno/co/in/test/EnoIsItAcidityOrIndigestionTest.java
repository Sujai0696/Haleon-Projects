package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoAcidityRefluxOrGerdPage;
import com.qa.eno.co.in.pages.EnoIsItAcidityOrIndigestionPage;

public class EnoIsItAcidityOrIndigestionTest extends BaseClass{
	
	EnoIsItAcidityOrIndigestionPage ai;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		ai = new EnoIsItAcidityOrIndigestionPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("isItAcidityOrIndigestionPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("isItAcidityOrIndigestionLiveUrl"));
	}

	
	@Test(priority = 0)
	private void verifyEnoHereLink() throws Exception{
		switchingTab(firstTab);
		ai.clickEnoHereLink();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickEnoHereLink();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Here link : "+compareTwoText);
	}
	
	@Test(priority = 1)
	private void verifyYourEveryday() throws Exception{
		switchingTab(firstTab);
		ai.clickYourEveryday();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickYourEveryday();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Your Everyday : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFindOutHereLink() throws Exception{
		switchingTab(firstTab);
		ai.clickFindOutHereLink();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickFindOutHereLink();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out Here Link : "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		ai.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ai.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyLivingLifeAcidityImg() throws Exception{
		switchingTab(firstTab);
		ai.clickLivingLifeAcidityImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickLivingLifeAcidityImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Img : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyLivingLifeAcidityText() throws Exception{
		switchingTab(firstTab);
		ai.clickLivingLifeAcidityText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickLivingLifeAcidityText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Text : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyLivingLifeAcidityPara() throws Exception{
		switchingTab(firstTab);
		ai.clickLivingLifeAcidityPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickLivingLifeAcidityPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Para : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyUnderstandingDigestiveWellnessImg() throws Exception{
		switchingTab(firstTab);
		ai.clickUnderstandingDigestiveWellnessImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickUnderstandingDigestiveWellnessImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Digestive Wellness Img : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyUnderstandingDigestiveWellnessText() throws Exception{
		switchingTab(firstTab);
		ai.clickUnderstandingDigestiveWellnessText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickUnderstandingDigestiveWellnessText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Digestive Wellness Text : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyUnderstandingDigestiveWellnessPara() throws Exception{
		switchingTab(firstTab);
		ai.clickUnderstandingDigestiveWellnessPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ai.clickUnderstandingDigestiveWellnessPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Digestive Wellness para : "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ai.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ai.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	ai.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	ai.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	ai.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	ai.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
}
