package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneWhiteningSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneWhiteningSensitiveTeethTest extends BaseClass{

	SensodyneWhiteningSensitiveTeethPage st;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whiteningSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whiteningSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		st = new SensodyneWhiteningSensitiveTeethPage();
		switchingTab(firstTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		st.clickCookieBtn();
		st.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}

	@Test(priority = 1)
	private void verifyLearnHow() throws Exception{
		switchingTab(firstTab);
		st.clickLearnHow();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickLearnHow();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn how: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyMythVsTruthLink() throws Exception{
		switchingTab(firstTab);
		st.clickMythVsTruthLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickMythVsTruthLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for myth vs truth: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifySensitivityAfterATrip() throws Exception{
		switchingTab(firstTab);
		st.clickSensitivityAfterATrip();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensitivityAfterATrip();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity after a trip: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyGetHelpfulTips() throws Exception{
		switchingTab(firstTab);
		st.clickGetHelpfulTips();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickGetHelpfulTips();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity get helpful tips: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySensitiveTeethPainReleif() throws Exception{
		switchingTab(firstTab);
		st.clickSensitiveTeethPainReleif();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensitiveTeethPainReleif();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity sensitive teeth pain releif: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHowToHelpSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		st.clickHowToHelpSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickHowToHelpSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for how to help sensitive teeth: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifySensodyneTrueWhite() throws Exception{
		switchingTab(firstTab);
		st.clickSensodyneTrueWhite();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensodyneTrueWhite();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensodyne true white: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyTeethSensitiveToSugar() throws Exception{
		switchingTab(firstTab);
		st.clickTeethSensitiveToSugar();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickTeethSensitiveToSugar();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for teeth sensitive to sugar: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyFindTheRightToothPaste() throws Exception{
		switchingTab(firstTab);
		st.clickFindTheRightToothPaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickFindTheRightToothPaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find the right tooth paste: "+compareTwoText);
	}
	
}
