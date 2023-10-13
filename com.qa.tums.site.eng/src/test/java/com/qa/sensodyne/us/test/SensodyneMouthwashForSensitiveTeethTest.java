package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneMouthwashForSensitiveTeeth;

public class SensodyneMouthwashForSensitiveTeethTest extends BaseClass {
SensodyneMouthwashForSensitiveTeeth smf;
@BeforeClass
private void launchingTheBrowser() throws IOException, Exception {
	browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
	launchTwoUrl();
	
}
@BeforeMethod
private void launchingTheUrl() throws Exception {
	switchingTab(firstTab);
	launchURL(loadConfig("sensodyneConfig.properties").getProperty("mouthwashForSensitiveTeethPreProdUrl"));
	switchingTab(secondTab);
	launchURL(loadConfig("sensodyneConfig.properties").getProperty("mouthwashForSensitiveTeethLiveUrl"));
}
@Test(priority = 1, enabled = true)
private void cookieButton() throws Exception {
smf =new SensodyneMouthwashForSensitiveTeeth();
switchingTab(firstTab);
smf.clickCookieBtn();
smf.clickGigyaForm();
System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
switchingTab(secondTab);
smf.clickCookieBtn();
smf.clickGigyaForm();
System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
}

@Test(priority = 10)
private void verifySensodyneSensitiveCareToothbrush() throws Exception{
	switchingTab(firstTab);
	smf.clickOnSensodyneSensitiveCareToothbrush();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickOnSensodyneSensitiveCareToothbrush();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
}
@Test(priority = 10)
private void verifytoothpasteforsensitiveteeth() throws Exception{
	switchingTab(firstTab);
	smf.clicktoothpasteforsensitiveteeth();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clicktoothpasteforsensitiveteeth();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
}
@Test(priority = 10)
private void verifyWhereToBuySensodyneToothpaste() throws Exception{
	switchingTab(firstTab);
	smf.clickWhereToBuySensodyneToothpaste();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickWhereToBuySensodyneToothpaste();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
}
@Test(priority = 10)
private void verifyRelatedArticleOne() throws Exception{
	switchingTab(firstTab);
	smf.clickRealatedArticleOne();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickRealatedArticleOne();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
}

@Test(priority = 11)
private void verifyRelatedArticleTwo() throws Exception{
	switchingTab(firstTab);
	smf.clickRealatedArticleTwo();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickRealatedArticleTwo();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article two :"+compareTwoText);
}

@Test(priority = 12)
private void verifyRelatedArticleThree() throws Exception{
	switchingTab(firstTab);
	smf.clickRealatedArticleThree();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickRealatedArticleThree();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article three :"+compareTwoText);
}

@Test(priority = 13)
private void verifyRelatedArticleFour() throws Exception{
	switchingTab(firstTab);
	smf.clickRealatedArticleFour();
	String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
	switchingTab(secondTab);
	smf.clickRealatedArticleFour();
	String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
	boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
	System.out.println("PreProdUrl and LiveUrl are Same for related article Four :"+compareTwoText);
}



}
