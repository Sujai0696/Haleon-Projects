package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaOralHealthTipsPage;

public class SensodyneCaOralHealthTipsTest extends BaseClass{
	
	SensodyneCaOralHealthTipsPage oht;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		oht = new	SensodyneCaOralHealthTipsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("oralHealthTipsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("oralHealthTipsLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyBannerImg() throws Exception{
		switchingTab(firstTab);
		oht.clickBannerImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickBannerImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Banner Img: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyOralHealthTipsLinkOne() throws Exception{
		switchingTab(firstTab);
		oht.clickOralHealthTipsLinkOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickOralHealthTipsLinkOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips Link One: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyOralHealthTipsLinkTwo() throws Exception{
		switchingTab(firstTab);
		oht.clickOralHealthTipsLinkTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickOralHealthTipsLinkTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips Link Two: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyOralHealthTipsLinkThree() throws Exception{
		switchingTab(firstTab);
		oht.clickOralHealthTipsLinkThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickOralHealthTipsLinkThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips Link Three: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyOralHealthTipsLinkFour() throws Exception{
		switchingTab(firstTab);
		oht.clickOralHealthTipsLinkFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickOralHealthTipsLinkFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oral Health Tips Link Four: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyFeaturedArticleOne() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article One: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyFeaturedArticleTwo() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyFeaturedArticleThree() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Three: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyFeaturedArticleFour() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Four: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyFeaturedArticleFive() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Five: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyFeaturedArticleSix() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Six: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyFeaturedArticleSeven() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Seven: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyFeaturedArticleEight() throws Exception{
		switchingTab(firstTab);
		oht.clickFeaturedArticleEight();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFeaturedArticleEight();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Featured Article Eight: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyFindTheRightToothpastebtn() throws Exception{
		switchingTab(firstTab);
		oht.clickFindTheRightToothpastebtn();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		oht.clickFindTheRightToothpastebtn();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find The Right Toothpaste btn: "+compareTwoText);
	}

}
