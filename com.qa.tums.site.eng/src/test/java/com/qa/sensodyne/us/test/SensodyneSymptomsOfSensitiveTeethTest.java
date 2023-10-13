package com.qa.sensodyne.us.test;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSymptomsOfSensitiveTeethPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneSymptomsOfSensitiveTeethTest extends BaseClass{
	
	SensodyneSymptomsOfSensitiveTeethPage ss;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("symptomsOfSensitiveTeethPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("symptomsOfSensitiveTeethLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		ss = new SensodyneSymptomsOfSensitiveTeethPage();
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
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		ss.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyWhyDoMyTeethHurtLink() throws Exception{
		switchingTab(firstTab);
		ss.clickWhyDoMyTeethHurtLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickWhyDoMyTeethHurtLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for why do my teeth hurt link: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyTeethWhiteningLink() throws Exception{
		switchingTab(firstTab);
		ss.clickTeethWhiteningLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickTeethWhiteningLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for teeth whitening Link: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBrushingAndFlossingLink() throws Exception{
		switchingTab(firstTab);
		ss.clickBrushingAndFlossingLink();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickBrushingAndFlossingLink();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for brushing and flossing link: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyDentalProcedures() throws Exception {
		switchingTab(firstTab);
		ss.clickDentalProcedures();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickDentalProcedures();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for dental procedures link: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyCavitiesAndToothDecay() throws Exception{
		switchingTab(firstTab);
		ss.clickCavitiesAndToothDecay();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickCavitiesAndToothDecay();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for cavities and tooth cavities: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyTakeQuiz() throws Exception{
		switchingTab(firstTab);
		ss.clickTakeQuiz();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		ss.clickTakeQuiz();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for take quiz: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ss.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for realted article one: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ss.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for realted article Two: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ss.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for realted article three: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ss.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		ss.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for realted article Four: "+compareTwoText);
	}
	
	

	
}
