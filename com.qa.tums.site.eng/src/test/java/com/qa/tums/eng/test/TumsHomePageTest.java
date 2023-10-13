package com.qa.tums.eng.test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsHomePage;
import com.qa.tums.eng.pages.TumsSymptomsPage;
import com.qa.tums.eng.util.ExtentManager;
import com.qa.tums.eng.util.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TumsHomePageTest extends BaseClass{
	
	TumsHomePage hp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("homepagePreprodUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("homepageLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyCookie() throws Exception {
		hp = new TumsHomePage();
		switchingTab(firstTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBannerLearMore() throws Exception{
		switchingTab(firstTab);
		hp.ClickBannerLearnMore();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.ClickBannerLearnMore();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for banner learn more:"+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBannerProductPage() throws Exception{
		switchingTab(firstTab);
		hp.clickBannerProductPage();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickBannerProductPage();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Banner Product Page"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyvideoStreaming() throws Exception{
		switchingTab(firstTab);
		hp.clickVideoStreming();
		System.out.println("Video is verified in the preprod url");
		switchingTab(secondTab);
		hp.clickVideoStreming();
		System.out.println("Video is verified in the live url");
	}
	
	
	@Test(priority = 4)
	private void verifyProductBuyNow() throws Exception{
		switchingTab(firstTab);
		hp.clickProductBuyNow();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickProductBuyNow();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product Buy Now"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		hp.clickCookieBtn();
		hp.clickYoutubeVideo();
		System.out.println("Video is verified in the preprod url");
		switchingTab(secondTab);
		hp.clickYoutubeVideo();
		System.out.println("Video is verified in the live url");
	}

	@Test(priority = 6)
	private void verifyPrdtLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		hp.clickLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn more one :"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyPrdtLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn more Two :"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyFindOutWhy() throws Exception{
		switchingTab(firstTab);
		hp.clickFindOutWhy();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickFindOutWhy();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Out Why :"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyPrdtLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		hp.clickLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		hp.clickLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for learn more Three :"+compareTwoText);
	}
	
	
	
	
	

}
