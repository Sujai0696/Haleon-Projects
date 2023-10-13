package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneIsHavingSensitiveTeethBad;

public class SensodyneIsHavingSensitiveTeethBadTest extends BaseClass{
SensodyneIsHavingSensitiveTeethBad sih;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneIsHavingSensitivePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneIsHavingSensitiveLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	sih =new SensodyneIsHavingSensitiveTeethBad();
	switchingTab(firstTab);
	sih.clickCookieBtn();
	sih.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	sih.clickCookieBtn();
	sih.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}
	@Test(priority = 3)
	private void verifyBackToTheArticleList() throws Exception{
		switchingTab(firstTab);
		sih.clickBackToTheArticleList();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickBackToTheArticleList();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifySensodyneRapidRelief() throws Exception{
		switchingTab(firstTab);
		sih.clickSensodyneRapidRelief();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickSensodyneRapidRelief();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyFiveOralHealthTipsEveryoneShouldFollow() throws Exception{
		switchingTab(firstTab);
		sih.clickFiveOralHealthTipsEveryoneShouldFollow();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickFiveOralHealthTipsEveryoneShouldFollow();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyCanYouBrushYourTeethTooHard() throws Exception{
		switchingTab(firstTab);
		sih.clickCanYouBrushYourTeethTooHard();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickCanYouBrushYourTeethTooHard();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyDoYourTeethHurtWhenItsColdOut() throws Exception{
		switchingTab(firstTab);
		sih.clickDoYourTeethHurtWhenItsColdOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickDoYourTeethHurtWhenItsColdOut();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyWhatToKnowAboutSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		sih.clickWhatToKnowAboutSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		sih.clickWhatToKnowAboutSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Get Coupon:"+compareTwoText);
	}
	
	

}
