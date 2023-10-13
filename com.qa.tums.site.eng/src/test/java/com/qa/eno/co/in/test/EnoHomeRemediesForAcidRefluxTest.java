package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoHomeRemediesForAcidRefluxPage;

public class EnoHomeRemediesForAcidRefluxTest extends BaseClass{
	
	EnoHomeRemediesForAcidRefluxPage hr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		hr = new EnoHomeRemediesForAcidRefluxPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("homeRemediesForAcidRefluxPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("homeRemediesForAcidRefluxLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyHereLink() throws Exception{
		switchingTab(firstTab);
		hr.clickHereLink();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickHereLink();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Here Link : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		hr.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hr.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	
	@Test(priority = 3)
	private void verifyRefluxOrGredImg() throws Exception{
		switchingTab(firstTab);
		hr.clickRefluxOrGredImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickRefluxOrGredImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Reflux Or Gred Img : "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyRefluxOrGredText() throws Exception{
		switchingTab(firstTab);
		hr.clickRefluxOrGredText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickRefluxOrGredText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Reflux Or Gred Text : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRefluxOrGredPara() throws Exception{
		switchingTab(firstTab);
		hr.clickRefluxOrGredPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickRefluxOrGredPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Reflux Or Gred Para : "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyLivingLifeAcidityFreeImg() throws Exception{
		switchingTab(firstTab);
		hr.clickLivingLifeAcidityFreeImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickLivingLifeAcidityFreeImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Img : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyLivingLifeAcidityFreeText() throws Exception{
		switchingTab(firstTab);
		hr.clickLivingLifeAcidityFreeText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickLivingLifeAcidityFreeText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Img : "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyLivingLifeAcidityFreePara() throws Exception{
		switchingTab(firstTab);
		hr.clickLivingLifeAcidityFreePara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hr.clickLivingLifeAcidityFreePara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Free Para : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		hr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		hr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	hr.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	hr.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	hr.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	hr.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
