package com.qa.quit.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.quit.pages.QuitSmokingAndAnxietyPage;

public class QuitSmokingAndAnxietyTest extends BaseClass{
	
	QuitSmokingAndAnxietyPage sa;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("quit_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sa = new QuitSmokingAndAnxietyPage();
		switchingTab(firstTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("smokingAndAnxietyPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("quit_Config.properties").getProperty("smokingAndAnxietyLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		sa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		sa.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sa.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyWholeCardImgOne() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardImgOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardImgOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardImgOne: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyWholeCardTextOne() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardTextOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardTextOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardTextOne: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyWholeCardReadMoreOne() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardReadMoreOne();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardReadMoreOne();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardreadMoreOne: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyWholecardYoutubeVideoTwo() throws Exception{
		switchingTab(firstTab);
		sa.clickWholecardYoutubeVideoTwo();
		System.out.println("YouTube Two Video verified in the preprod URL");
		switchingTab(secondTab);
		sa.clickWholecardYoutubeVideoTwo();
		System.out.println("YouTube Two Video verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyWholeCardTextTwo() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardTextTwo();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardTextTwo();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardTextTwo: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyWholecardYoutubeVideoThree() throws Exception{
		switchingTab(firstTab);
		sa.clickWholecardYoutubeVideoThree();
		System.out.println("YouTube Three Video verified in the preprod URL");
		switchingTab(secondTab);
		sa.clickWholecardYoutubeVideoThree();
		System.out.println("YouTube Three Video verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyWholeCardTextThree() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardTextThree();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardTextThree();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardTextThree: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyWholeCardImgFour() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardImgFour();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardImgFour();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardImgFour: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyWholeCardTextFour() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardTextFour();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardTextFour();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardTextFour: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyWholeCardReadMoreFour() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardReadMoreFour();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardReadMoreFour();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardreadMoreFour: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyWholeCardImgFive() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardImgFive();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardImgFive();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardImgFive: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyWholeCardTextFive() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardTextFive();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardTextFive();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardTextFive: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyWholeCardReadMoreFive() throws Exception{
		switchingTab(firstTab);
		sa.clickWholeCardReadMoreFive();
		String preProdUrl = compareUrl(excelRead("Quit", 1, 0));
		switchingTab(secondTab);
		sa.clickWholeCardReadMoreFive();
		String liveUrl = compareUrl(excelRead("Quit", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for WholeCardreadMoreFive: "+compareTwoText);
	}
	
	

}
