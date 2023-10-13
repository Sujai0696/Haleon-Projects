package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoAcidityRefluxOrGerdPage;

public class EnoAcidityRefluxOrGerdTest extends BaseClass{

	EnoAcidityRefluxOrGerdPage arg;


	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();

	}

	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		arg = new EnoAcidityRefluxOrGerdPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("acidityRefluxOrGerdPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("acidityRefluxOrGerdLiveUrl"));
	}

	@Test(priority = 0)
	private void verifyEnoHereLink() throws Exception{
		switchingTab(firstTab);
		arg.clickEnoHereLink();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickEnoHereLink();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Eno Here link : "+compareTwoText);
	}

	@Test(priority = 1)
	private void verifyReferences() throws Exception{
		switchingTab(firstTab);
		arg.clickReferences();
		System.out.println("References is successfully verified in the Preprod URL");
		switchingTab(secondTab);
		arg.clickReferences();
		System.out.println("References is successfully verified in the Live URL");
	}

	@Test(priority = 2)
	private void verifyLivingLifeAcidityImg() throws Exception{
		switchingTab(firstTab);
		arg.clickLivingLifeAcidityImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickLivingLifeAcidityImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Img : "+compareTwoText);
	}

	@Test(priority = 3)
	private void verifyLivingLifeAcidityText() throws Exception{
		switchingTab(firstTab);
		arg.clickLivingLifeAcidityText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickLivingLifeAcidityText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Text : "+compareTwoText);
	}

	@Test(priority = 4)
	private void verifyLivingLifeAcidityPara() throws Exception{
		switchingTab(firstTab);
		arg.clickLivingLifeAcidityPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickLivingLifeAcidityPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Living Life Acidity Para : "+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyGasReliefImg() throws Exception{
		switchingTab(firstTab);
		arg.clickGasReliefImg();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickGasReliefImg();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Img : "+compareTwoText);
	}

	@Test(priority = 6)
	private void verifyGasReliefText() throws Exception{
		switchingTab(firstTab);
		arg.clickGasReliefText();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickGasReliefText();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Text : "+compareTwoText);
	}

	@Test(priority = 7)
	private void verifyGasReliefPara() throws Exception{
		switchingTab(firstTab);
		arg.clickGasReliefPara();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickGasReliefPara();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Gas Relief Para : "+compareTwoText);
	}


	@Test(priority = 8)
	private void verifyDidyouKnowSection()throws Exception {
		switchingTab(firstTab);
		arg.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the preprod URL");
		switchingTab(secondTab);
		arg.clickDidYouKnowSection();
		System.out.println("Did you know section is verified in the live URL");
	}

	@Test(priority = 9, enabled = true)
	private void verifyPrevious() throws Throwable {
		switchingTab(firstTab);
		arg.clickonPrevious();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickonPrevious();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	private void verifyNext() throws Throwable {
		switchingTab(firstTab);
		arg.clickonNext();
		String preProdUrl = compareUrl(excelRead("eno_co_in", 1, 0));
		switchingTab(secondTab);
		arg.clickonNext();
		String liveUrl = compareUrl(excelRead("eno_co_in", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same  :" + compareTwoText);
	}
}
