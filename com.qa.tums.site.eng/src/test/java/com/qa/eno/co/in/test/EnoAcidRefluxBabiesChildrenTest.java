package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoAcidRefluxBabiesChildrenPage;

public class EnoAcidRefluxBabiesChildrenTest extends BaseClass{
	
	EnoAcidRefluxBabiesChildrenPage ar;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		ar = new EnoAcidRefluxBabiesChildrenPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("acidRefluxBabiesChildrenPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("acidRefluxBabiesChildrenLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		ar.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		ar.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyWhyDoesYourStomachHurtImg() throws Exception{
		switchingTab(firstTab);
		ar.clickWhyDoesYourStomachHurtImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickWhyDoesYourStomachHurtImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Why Does Your Stomach Hurt Img : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyWhyDoesYourStomachHurtText() throws Exception{
		switchingTab(firstTab);
		ar.clickWhyDoesYourStomachHurtText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickWhyDoesYourStomachHurtText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Why Does Your Stomach Hurt Text : "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWhyDoesYourStomachHurtPara() throws Exception{
		switchingTab(firstTab);
		ar.clickWhyDoesYourStomachHurtPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickWhyDoesYourStomachHurtPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Why Does Your Stomach Hurt Para : "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyHomeRemediesForIndigestionImg() throws Exception{
		switchingTab(firstTab);
		ar.clickHomeRemediesForIndigestionImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickHomeRemediesForIndigestionImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Home Remedies For Indigestion Img : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHomeRemediesForIndigestionText() throws Exception{
		switchingTab(firstTab);
		ar.clickHomeRemediesForIndigestionText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickHomeRemediesForIndigestionText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Home Remedies For Indigestion Text : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHomeRemediesForIndigestionPara() throws Exception{
		switchingTab(firstTab);
		ar.clickHomeRemediesForIndigestionPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		ar.clickHomeRemediesForIndigestionPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Home Remedies For Indigestion Para : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		ar.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		ar.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	ar.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	ar.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	ar.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	ar.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	

}
