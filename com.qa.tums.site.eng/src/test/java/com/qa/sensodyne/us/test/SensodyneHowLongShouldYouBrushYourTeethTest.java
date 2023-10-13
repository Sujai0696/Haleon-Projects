package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneHowLongShouldYouBrushYourTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneHowLongShouldYouBrushYourTeethTest extends BaseClass{

	
	SensodyneHowLongShouldYouBrushYourTeethPage hl;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("howLongShouldYouBrushyourTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("howLongShouldYouBrushyourTeethLiveUrl"));
	}
	
	

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		hl = new SensodyneHowLongShouldYouBrushYourTeethPage();
		switchingTab(firstTab);
		hl.clickCookieBtn();
		hl.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		hl.clickCookieBtn();
		hl.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifySensodyneSensitiveCare() throws Exception{
		switchingTab(firstTab);
		hl.clickSensodyneSensitiveCare();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickSensodyneSensitiveCare();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensodyne sensitive care: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyOralHealthTips() throws Exception{
		switchingTab(firstTab);
		hl.clickOralHealthTips();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickOralHealthTips();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyRecognizingSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		hl.clickRecognizingSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickRecognizingSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Recognizing Sensitive Teeth: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWhiteningSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		hl.clickWhiteningSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickWhiteningSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Whitening Sensitive Teeth: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		hl.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		hl.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 7)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		hl.clickRelatedArticleThree();	
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 8)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		hl.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hl.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
	
}
