package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoGasReliefPage;
import com.qa.eno.co.in.pages.EnoHomeRemediesForHeartburnPage;

public class EnoGasReliefTest extends BaseClass{
	
	EnoGasReliefPage gr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		gr = new EnoGasReliefPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("gasReliefPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("gasReliefLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		gr.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		gr.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyUnderstandingAcidityImg() throws Exception{
		switchingTab(firstTab);
		gr.clickUnderstandingAcidityImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickUnderstandingAcidityImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Acidity Img : "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyUnderstandingAcidityText() throws Exception{
		switchingTab(firstTab);
		gr.clickUnderstandingAcidityText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickUnderstandingAcidityText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Acidity Text : "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyUnderstandingAcidityPara() throws Exception{
		switchingTab(firstTab);
		gr.clickUnderstandingAcidityPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickUnderstandingAcidityPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understanding Acidity Para : "+compareTwoText);
	}
	

	@Test(priority = 4)
	private void verifyWhatIsEnoImg() throws Exception{
		switchingTab(firstTab);
		gr.clickWhatIsEnoImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickWhatIsEnoImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Img : "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWhatIsEnoText() throws Exception{
		switchingTab(firstTab);
		gr.clickWhatIsEnoText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickWhatIsEnoText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Text : "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyWhatIsEnoPara() throws Exception{
		switchingTab(firstTab);
		gr.clickWhatIsEnoPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		gr.clickWhatIsEnoPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Para : "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		gr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		gr.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyPrevious() throws Throwable {
	switchingTab(firstTab);
	gr.clickonPrevious();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	gr.clickonPrevious();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
	
	@Test(priority = 9, enabled = true)
	private void verifyNext() throws Throwable {
	switchingTab(firstTab);
	gr.clickonNext();
	String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
	switchingTab(secondTab);
	gr.clickonNext();
	String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

}
