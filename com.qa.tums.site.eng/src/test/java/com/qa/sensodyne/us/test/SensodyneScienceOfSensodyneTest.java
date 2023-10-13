package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneScienceOfSensodynePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneScienceOfSensodyneTest extends BaseClass{
	
	SensodyneScienceOfSensodynePage ss;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("scienceOfSensodynePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("scienceOfSensodyneLiveUrl"));
	}

	@Test(priority = 0, enabled = true, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		ss = new SensodyneScienceOfSensodynePage();
		switchingTab(firstTab);
		ss.clickCookieBtn();
		ss.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ss.clickCookieBtn();
		ss.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyAllAriticle() throws Exception{
		switchingTab(firstTab);
		ss.clickAllAriticle();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickAllAriticle();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for all article: "+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyWhiteningSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ss.clickWhiteningSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickWhiteningSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for whitening sensitive teeth: "+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyManagingSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ss.clickManagingSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickManagingSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for managing sensitive teeth: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifySensodyneAndInnovation() throws Exception{
		switchingTab(firstTab);
		ss.clickSensodyneAndInnovation();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickSensodyneAndInnovation();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensodyne and innovation: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRecognizingSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ss.clickRecognizingSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickRecognizingSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for recognizing sensitive teeth: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyBeyondSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ss.clickBeyondSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickBeyondSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for beyond sensitive teeth: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifySeeItInActionOne() throws Exception{
		switchingTab(firstTab);
		ss.clickSeeItInActionOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickSeeItInActionOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see it in action one: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifySeeItInActionTwo() throws Exception{
		switchingTab(firstTab);
		ss.clickSeeItInActionTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickSeeItInActionTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see it in action two: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyFindTheRightToothpaste() throws Exception{
		switchingTab(firstTab);
		ss.clickFindTheRightToothpaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickFindTheRightToothpaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find the right toothpase: "+compareTwoText);
	}
	
	
}
