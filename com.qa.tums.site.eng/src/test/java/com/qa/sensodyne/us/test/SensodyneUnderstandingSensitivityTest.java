package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneUnderstandingSensitivity;

public class SensodyneUnderstandingSensitivityTest extends BaseClass {
	SensodyneUnderstandingSensitivity sus;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdHomepageUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveHomepageUrl"));
	}
	@Test(priority = 1, enabled = true)
		private void cookieButton() throws Exception {
		sus =new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickCookieBtn();
		sus.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sus.clickCookieBtn();
		sus.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	@Test(priority = 2, enabled = true)
	private void VerifyUndestandingSensitivity() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickOnUnderstandingSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickOnUnderstandingSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 3, enabled = true)
	private void VerifyHomeIcon_Bread() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickHomeIcon();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickHomeIcon();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 4, enabled = true)
	private void VerifyUnderstandingSensitivity_Bread() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickUnderstandingSensitivity_bread();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickUnderstandingSensitivity_bread();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 5, enabled = true)
	private void VerifyWhiteningSensitiveTeeth() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickWhiteningSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickWhiteningSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 6, enabled = true)
	private void VerifySensodyneTootsusastesForToothSensitivityRelief() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickSensodyneToothpastesForToothSensitivityRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickSensodyneToothpastesForToothSensitivityRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 7, enabled = true)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		sus.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text One:"+compareTwoText);
	}


	@Test(priority = 8)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		sus.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Two:"+compareTwoText);
	}

	@Test(priority = 9)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		sus.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Three:"+compareTwoText);
	}

	@Test(priority = 10)
	private void verifyProductTextFour() throws Exception{
		switchingTab(firstTab);
		sus.clickProductTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Four:"+compareTwoText);
	}

	@Test(priority = 11)
	private void verifyProductImageOne() throws Exception{
		switchingTab(firstTab);
		sus.clickProductImageOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductImageOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image One:"+compareTwoText);
	}

	@Test(priority = 12)
	private void verifyProductImageTwo() throws Exception{
		switchingTab(firstTab);
		sus.clickProductImageTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductImageTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Two:"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyProductImageThree() throws Exception{
		switchingTab(firstTab);
		sus.clickProductImageThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductImageThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Three:"+compareTwoText);
	}

	@Test(priority = 14)
	private void verifyProductImageFour() throws Exception{
		switchingTab(firstTab);
		sus.clickProductImageFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickProductImageFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Four:"+compareTwoText);
	}

	

	@Test(priority = 15)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		sus.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the preprod Url");
		switchingTab(secondTab);
		sus.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the live Url");
	}

	@Test(priority = 16)
	private void verifyBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		sus.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the preprod Url");
		switchingTab(secondTab);
		sus.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the live Url");
	}

	@Test(priority = 17)
	private void verifyBuyNowThree() throws Exception{
		switchingTab(firstTab);
		sus.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the preprod Url");
		switchingTab(secondTab);
		sus.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the live Url");
	}

	@Test(priority = 18)
	private void verifyBuyNowFour() throws Exception{
		switchingTab(firstTab);
		sus.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the preprod Url");
		switchingTab(secondTab);
		sus.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the live Url");
	}
	@Test(priority = 19, enabled = true)
	private void VerifySensodyneRapidReliefExtraFresh() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickSensodyneRapidReliefExtraFresh();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickSensodyneRapidReliefExtraFresh();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 20, enabled = true)
	private void VerifySensodyneRapidReliefMint() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickSensodyneRapidReliefMint();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickSensodyneRapidReliefMint();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 21)
	private void verifyRadioButtonOne() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the live Url");
	}
	
	@Test(priority = 22)
	private void verifyRadioButtonTwo() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the live Url");
	}
	
	@Test(priority = 23)
	private void verifyRadioButtonThree() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the live Url");
	}
	
	@Test(priority = 24)
	private void verifyRadioButtonFour() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the live Url");
	}
	
	@Test(priority = 25)
	private void verifyRadioButtonFive() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the live Url");
	}
	
	@Test(priority = 26)
	private void verifyRadioButtonSix() throws Exception{
		switchingTab(firstTab);
		sus.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the preprod Url");
		switchingTab(secondTab);
		sus.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the live Url");
	}
	@Test(priority = 27, enabled = true)
	private void VerifyTakeTheQuiz() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickTakeTheQuiz();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickTakeTheQuiz();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 28, enabled = true)
	private void VerifyWhereToBuySensodyneToothpaste() throws Exception {
		sus = new SensodyneUnderstandingSensitivity();
		switchingTab(firstTab);
		sus.clickWhereToBuySensodyneToothpaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sus.clickWhereToBuySensodyneToothpaste();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("Preprod URL and Live URL are same :" + compareTwoText);
	}
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		sus.clickRealatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickRealatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		sus.clickRealatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickRealatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two :"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		sus.clickRealatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickRealatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three :"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		sus.clickRealatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sus.clickRealatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four :"+compareTwoText);
	}
	
	
}
