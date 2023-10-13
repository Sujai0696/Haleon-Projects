package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneShouldYouRinseAfterBrushingPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneShouldYouRinseAfterBrushingTest extends BaseClass{
	
	SensodyneShouldYouRinseAfterBrushingPage ab;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("shouldYouRinseAfterBrushingPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("shouldYouRinseAfterBrushingLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		ab = new SensodyneShouldYouRinseAfterBrushingPage();
		switchingTab(firstTab);
		ab.clickCookieBtn();
		ab.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		ab.clickCookieBtn();
		ab.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		ab.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBrushTooManyTimes() throws Exception{
		switchingTab(firstTab);
		ab.clickBrushTooManyTimes();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickBrushTooManyTimes();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Brush Too Many Times: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifySensodyneCompleteProtection() throws Exception{
		switchingTab(firstTab);
		ab.clickSensodyneCompleteProtection();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickSensodyneCompleteProtection();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Complete Protection: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyOralHealthTips() throws Exception{
		switchingTab(firstTab);
		ab.clickOralHealthTips();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickOralHealthTips();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips: "+compareTwoText);
	}
	
	
	@Test(priority = 5)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ab.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ab.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 7)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ab.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 8)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ab.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ab.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}

}
