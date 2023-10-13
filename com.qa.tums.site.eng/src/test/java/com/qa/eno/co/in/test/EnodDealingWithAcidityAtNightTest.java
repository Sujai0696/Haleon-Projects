package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnodDealingWithAcidityAtNightPage;

public class EnodDealingWithAcidityAtNightTest extends BaseClass{
	
	EnodDealingWithAcidityAtNightPage an;
	

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		an = new EnodDealingWithAcidityAtNightPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("dealingWithAcidityAtNightPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("dealingWithAcidityAtNightLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyReachOutForEnoHereLink() throws Exception{
		switchingTab(firstTab);
		an.clickReachOutForEnoHereLink();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickReachOutForEnoHereLink();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Reach Out For Eno Here Link : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyFindOutMoreHereLinkOne() throws Exception{
		switchingTab(firstTab);
		an.clickFindOutMoreHereLinkOne();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickFindOutMoreHereLinkOne();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out More Here Link One : "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFindOutMoreHereLinkTwo() throws Exception{
		switchingTab(firstTab);
		an.clickFindOutMoreHereLinkTwo();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickFindOutMoreHereLinkTwo();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out More Here Link Two : "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		an.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		an.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyLivingLifeAcidityFreeImg() throws Exception{
		switchingTab(firstTab);
		an.clickLivingLifeAcidityFreeImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickLivingLifeAcidityFreeImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Img : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyLivingLifeAcidityFreeText() throws Exception{
		switchingTab(firstTab);
		an.clickLivingLifeAcidityFreeText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickLivingLifeAcidityFreeText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Img : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLivingLifeAcidityFreePara() throws Exception{
		switchingTab(firstTab);
		an.clickLivingLifeAcidityFreePara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickLivingLifeAcidityFreePara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Para : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyConstantAcidityImg() throws Exception{
		switchingTab(firstTab);
		an.clickConstantAcidityImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickConstantAcidityImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Constant Acidity Img : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyConstantAcidityText() throws Exception{
		switchingTab(firstTab);
		an.clickConstantAcidityText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickConstantAcidityText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Constant Acidity Text : "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyConstantAcidityPara() throws Exception{
		switchingTab(firstTab);
		an.clickConstantAcidityPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		an.clickConstantAcidityPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Constant Acidity Img : "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		an.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		an.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 12, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	an.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	an.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 13, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	an.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	an.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
}
