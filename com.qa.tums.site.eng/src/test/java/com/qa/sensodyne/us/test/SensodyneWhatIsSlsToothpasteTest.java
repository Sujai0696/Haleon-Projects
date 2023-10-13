package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneWhatIsSlsToothpastePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneWhatIsSlsToothpasteTest extends BaseClass{

	
	SensodyneWhatIsSlsToothpastePage st;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whatIsSlsToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("whatIsSlsToothpasteLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		st = new SensodyneWhatIsSlsToothpastePage();
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
	private void verifySensodyneExtra() throws Exception{
		switchingTab(firstTab);
		st.clickSensodyneExtra();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensodyneExtra();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Extra: "+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifySensodyneToothpaste() throws Exception{
		switchingTab(firstTab);
		st.clickSensodyneToothpaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensodyneToothpaste();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Toothpaste: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyManageSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		st.clickManageSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickManageSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Manage Sensitive Teeth: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifySensodyneToothpasteWithoutSls() throws Exception{
		switchingTab(firstTab);
		st.clickSensodyneToothpasteWithoutSls();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickSensodyneToothpasteWithoutSls();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Toothpaste Without Sls: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 6)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 7)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 8)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		st.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		st.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		st.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb: "+compareTwoText);
	}
}
