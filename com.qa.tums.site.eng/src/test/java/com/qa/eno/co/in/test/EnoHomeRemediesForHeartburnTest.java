package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoHomeRemediesForHeartburnPage;

public class EnoHomeRemediesForHeartburnTest extends BaseClass{
	
	EnoHomeRemediesForHeartburnPage hrh;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		hrh = new EnoHomeRemediesForHeartburnPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("homeRemediesForHeartburnPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("homeRemediesForHeartburnLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		hrh.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		hrh.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyHeartburnDuringPregnancyImg() throws Exception{
		switchingTab(firstTab);
		hrh.clickHeartburnDuringPregnancyImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickHeartburnDuringPregnancyImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Heartburn During Pregnancy Img : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyHeartburnDuringPregnancyText() throws Exception{
		switchingTab(firstTab);
		hrh.clickHeartburnDuringPregnancyText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickHeartburnDuringPregnancyText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Heartburn During Pregnancy Text : "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHeartburnDuringPregnancyPara() throws Exception{
		switchingTab(firstTab);
		hrh.clickHeartburnDuringPregnancyPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickHeartburnDuringPregnancyPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Heartburn During Pregnancy Para : "+compareTwoText);
	}
	

	@Test(priority = 4)
	private void verifyWhatIsEnoImg() throws Exception{
		switchingTab(firstTab);
		hrh.clickWhatIsEnoImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickWhatIsEnoImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Img : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWhatIsEnoText() throws Exception{
		switchingTab(firstTab);
		hrh.clickWhatIsEnoText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickWhatIsEnoText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Text : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWhatIsEnoPara() throws Exception{
		switchingTab(firstTab);
		hrh.clickWhatIsEnoPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		hrh.clickWhatIsEnoPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Para : "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		hrh.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		hrh.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 10, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	hrh.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	hrh.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 11, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	hrh.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	hrh.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
