package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneShouldYouChangeToothpasteBrands;

public class SensodyneShouldYouChangeToothpasteBrandsTest extends BaseClass{
	SensodyneShouldYouChangeToothpasteBrands ssy;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("ShouldYouChangeToothpasteBrandsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("ShouldYouChangeToothpasteBrandsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	ssy =new SensodyneShouldYouChangeToothpasteBrands();
	switchingTab(firstTab);
	ssy.clickCookieBtn();
	ssy.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	ssy.clickCookieBtn();
	ssy.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		ssy.clickOnBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickOnBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyDentalExpressions() throws Exception{
		switchingTab(firstTab);
		ssy.clickDentalExpressions();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickDentalExpressions();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifybrushingStyle() throws Exception{
		switchingTab(firstTab);
		ssy.clickbrushingStyle();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickbrushingStyle();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyBrushingTwiceADayForAboutTwoMinutes() throws Exception{
		switchingTab(firstTab);
		ssy.clickBrushingTwiceADayForAboutTwoMinutes();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickBrushingTwiceADayForAboutTwoMinutes();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		ssy.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySensodyne() throws Exception{
		switchingTab(firstTab);
		ssy.clickSensodyne();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSensodyne();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ssy.clickRealatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssy.clickRealatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}

	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ssy.clickRealatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssy.clickRealatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two :"+compareTwoText);
	}

	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ssy.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssy.clickRealatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three :"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ssy.clickRealatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ssy.clickRealatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four :"+compareTwoText);
	}

}
