package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneFallSoupRecipesPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneFallSoupRecipesTest extends BaseClass{
	
	SensodyneFallSoupRecipesPage fs;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("fallSoupRecipesPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("fallSoupRecipesLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		fs = new SensodyneFallSoupRecipesPage();
		switchingTab(firstTab);
		fs.clickCookieBtn();
		fs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		fs.clickCookieBtn();
		fs.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	
	@Test(priority = 1)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		fs.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for back to the article list: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBucketListTummy() throws Exception{
		switchingTab(firstTab);
		fs.clickBucketListTummy();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		fs.clickBucketListTummy();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for bucket list tummy: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyFiberLink() throws Exception{
		switchingTab(firstTab);
		fs.clickFiberLink();
		String preProdUrl = getCurrentUrl();
		switchingTab(secondTab);
		fs.clickFiberLink();
		String liveUrl = getCurrentUrl();
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Fiber Link: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifySensodyneRapidReleif() throws Exception{
		switchingTab(firstTab);
		fs.clickSensodyneRapidReleif();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickSensodyneRapidReleif();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Rapid Releif: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifySensodyne() throws Exception{
		switchingTab(firstTab);
		fs.clickSensodyne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickSensodyne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne : "+compareTwoText);
	}
//	
//	@Test(priority = 6)
//	private void verifyRoastedButternutSquashSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickRoastedButternutSquashSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickRoastedButternutSquashSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Roasted Butternut Squash Soup: "+compareTwoText);
//	}
//	
//	@Test(priority = 7)
//	private void verifySimpleCauliflowerSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickSimpleCauliflowerSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickSimpleCauliflowerSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Simple Cauliflower Soup: "+compareTwoText);
//	}
//	
//	@Test(priority = 8)
//	private void verifyPumpkinAppleSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickPumpkinAppleSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickPumpkinAppleSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Pumpkin Apple Soup: "+compareTwoText);
//	}
//	
//	@Test(priority = 9)
//	private void verifyBroccoliAndKaleSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickBroccoliAndKaleSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickBroccoliAndKaleSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Broccoli And Kale Soup: "+compareTwoText);
//	}
//	
//	@Test(priority = 10)
//	private void verifyButternutSquashSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickButternutSquashSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickButternutSquashSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Butternut Squash Soup: "+compareTwoText);
//	}
//	
//	@Test(priority = 11)
//	private void verifyHealthifiedBroccoli() throws Exception{
//		switchingTab(firstTab);
//		fs.clickHealthifiedBroccoli();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickHealthifiedBroccoli();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Healthified Broccoli: "+compareTwoText);
//	}
//	
//	@Test(priority = 12)
//	private void verifyCarrotAppleSoup() throws Exception{
//		switchingTab(firstTab);
//		fs.clickCarrotAppleSoup();
//		String preProdUrl = getCurrentUrl();
//		switchingTab(secondTab);
//		fs.clickCarrotAppleSoup();
//		String liveUrl = getCurrentUrl();
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Carrot Apple Soup: "+compareTwoText);
//	}
	
	
	@Test(priority = 13)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		fs.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 14)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		fs.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 15)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		fs.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 16)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		fs.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		fs.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
}
