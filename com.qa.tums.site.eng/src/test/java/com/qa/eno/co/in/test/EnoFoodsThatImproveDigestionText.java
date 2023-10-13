package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoFoodsThatImproveDigestionPage;

public class EnoFoodsThatImproveDigestionText extends BaseClass{

	EnoFoodsThatImproveDigestionPage id;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		id = new EnoFoodsThatImproveDigestionPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("foodsThatImproveDigestionPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("foodsThatImproveDigestionLiveUrl"));
	}

	@Test(priority = 0)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		id.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		id.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}

	@Test(priority = 1)
	private void verifyUnderstandDigestiveWellnessImg() throws Exception{
		switchingTab(firstTab);
		id.clickUnderstandDigestiveWellnessImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickUnderstandDigestiveWellnessImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understand Digestive Wellness Img : "+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyUnderstandDigestiveWellnessText() throws Exception{
		switchingTab(firstTab);
		id.clickUnderstandDigestiveWellnessText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickUnderstandDigestiveWellnessText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understand Digestive Wellness Text : "+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyUnderstandDigestiveWellnessPara() throws Exception{
		switchingTab(firstTab);
		id.clickUnderstandDigestiveWellnessPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickUnderstandDigestiveWellnessPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Understand Digestive Wellness Para : "+compareTwoText);
	}


	@Test(priority = 4)
	private void verifyWhatIsEnoImg() throws Exception{
		switchingTab(firstTab);
		id.clickWhatIsEnoImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickWhatIsEnoImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Img : "+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyWhatIsEnoText() throws Exception{
		switchingTab(firstTab);
		id.clickWhatIsEnoText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickWhatIsEnoText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Text : "+compareTwoText);
	}

	@Test(priority = 6)
	private void verifyWhatIsEnoPara() throws Exception{
		switchingTab(firstTab);
		id.clickWhatIsEnoPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickWhatIsEnoPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for What Is Eno Para : "+compareTwoText);
	}

	@Test(priority = 7)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		id.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		id.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}

	@Test(priority = 8, enabled = true)
	private void verifyPrevious() throws Throwable {
		switchingTab(firstTab);
		id.clickonPrevious();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickonPrevious();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 9, enabled = true)
	private void verifyNext() throws Throwable {
		switchingTab(firstTab);
		id.clickonNext();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		id.clickonNext();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}


}
