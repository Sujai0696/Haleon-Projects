package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaSensitivityAndGumReliefToothpastePage;

public class SensodyneCaSensitivityAndGumReliefToothpasteTest extends BaseClass{
	
	SensodyneCaSensitivityAndGumReliefToothpastePage sgrt;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		sgrt = new	SensodyneCaSensitivityAndGumReliefToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("sensitivityAndGumReliefToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("sensitivityAndGumReliefToothpasteLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		sgrt.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		sgrt.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		sgrt.clickBuyNow();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickBuyNow();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Buy Now: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		sgrt.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		sgrt.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifySlideSection() throws Exception{
		switchingTab(firstTab);
		sgrt.clickSlideSection();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		sgrt.clickSlideSection();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
//	@Test(priority = 6)
//	private void verifyLearnAboutSensitivityAndGumProblems() throws Exception{
//		switchingTab(firstTab);
//		sgrt.clickLearnAboutSensitivityAndGumProblems();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
//		switchingTab(secondTab);
//		sgrt.clickLearnAboutSensitivityAndGumProblems();
//		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Learn About Sensitivity And Gum Problems: "+compareTwoText);
//	}
	
	@Test(priority = 7)
	private void verifyRelatedArticleTextOne() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Text One: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyRelatedArticleTextTwo() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Text Two: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyRelatedArticleTextThree() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Text Three: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleTextFour() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Text Four: "+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleImgOne() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleImgOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleImgOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Img One: "+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleImgTwo() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleImgTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleImgTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Img Two: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleImgThree() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleImgThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleImgThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Img Three: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleImgFour() throws Exception{
		switchingTab(firstTab);
		sgrt.clickRelatedArticleImgFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		sgrt.clickRelatedArticleImgFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Img Four: "+compareTwoText);
	}
	

}
