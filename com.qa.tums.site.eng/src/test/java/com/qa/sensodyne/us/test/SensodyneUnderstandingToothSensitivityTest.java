package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneUnderstandingToothSensitivityPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneUnderstandingToothSensitivityTest extends BaseClass{
	
	
	SensodyneUnderstandingToothSensitivityPage ut;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("understandingToothSensitivityPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("understandingToothSensitivityLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		ut = new SensodyneUnderstandingToothSensitivityPage();
		switchingTab(firstTab);
		ut.clickCookieBtn();
		ut.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ut.clickCookieBtn();
		ut.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifySensitivityToCold() throws Exception{
		switchingTab(firstTab);
		ut.clickSensitivityToCold();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickSensitivityToCold();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensitivity To Cold: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyNewCavity() throws Exception{
		switchingTab(firstTab);
		ut.clickNewCavity();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickNewCavity();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for New Cavity: "+compareTwoText);
	}
	
	

	@Test(priority = 3)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ut.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 4)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ut.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 5)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ut.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ut.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		ut.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ut.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb: "+compareTwoText);
	}

}
