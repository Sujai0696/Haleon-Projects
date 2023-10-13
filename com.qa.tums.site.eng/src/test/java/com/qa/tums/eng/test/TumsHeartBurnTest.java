package com.qa.tums.eng.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.pages.TumsAboutHeartBurnPage;
import com.qa.tums.eng.pages.TumsSymptomsPage;
import com.qa.tums.eng.util.Retry;

public class TumsHeartBurnTest extends BaseClass {

	TumsAboutHeartBurnPage ah;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("aboutHeartburnPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("tumsConfig.properties").getProperty("aboutHeartburnLiveUrl"));
	}
	
	@Test(priority = 0, enabled = true)
	private void verifyAnacidsTumsLink() throws Exception {
		ah = new TumsAboutHeartBurnPage();
		switchingTab(firstTab);
		ah.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Preprod URL");
		switchingTab(secondTab);
		ah.clickCookieBtn();
		System.out.println("Cookie Button is verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadCrumbHome() throws Exception{
		switchingTab(firstTab);
		ah.clickBreadCrumbHome();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickBreadCrumbHome();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb Home:"+compareTwoText);
	}
	
	
	@Test(priority = 2)
	private void verifyHeartburnSymptoms() throws Exception{
		switchingTab(firstTab);
		ah.clickHearburnSymptoms();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickHearburnSymptoms();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for heartburn symptoms:"+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyHeartburnCauses() throws Exception{
		switchingTab(firstTab);
		ah.clickHeartburnCauses();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickHeartburnCauses();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for heartburn causes:"+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyFindingRelief() throws Exception{
		switchingTab(firstTab);
		ah.clickFindingRelief();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickFindingRelief();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Finding Relief:"+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyTumsAndPregnancy() throws Exception{
		switchingTab(firstTab);
		ah.clickTumsAndPregnancy();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickTumsAndPregnancy();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tums And Pregnancy:"+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyHeartburnSymptomsImg() throws Exception{
		switchingTab(firstTab);
		ah.clickHearburnSymptomsImg();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickHearburnSymptomsImg();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for heartburn symptoms Img:"+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyHeartburnCausesImg() throws Exception{
		switchingTab(firstTab);
		ah.clickHeartburnCausesImg();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickHeartburnCausesImg();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for heartburn causes Img:"+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyFindingReliefImg() throws Exception{
		switchingTab(firstTab);
		ah.clickFindingReliefImg();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickFindingReliefImg();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Finding Relief Img:"+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyTumsAndPregnancyImg() throws Exception{
		switchingTab(firstTab);
		ah.clickTumsAndPregnancyImg();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickTumsAndPregnancyImg();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tums And Pregnancy Img:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article One:"+compareTwoText);
	}
	
	@Test(priority = 11)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Two:"+compareTwoText);
	}
	
	@Test(priority = 12)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article three:"+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Four:"+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyRelatedArticleFive() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleFive();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleFive();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Five:"+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyRelatedArticleSix() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleSix();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleSix();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Six:"+compareTwoText);
	}
	
	@Test(priority = 16)
	private void verifyRelatedArticleSeven() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleSeven();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleSeven();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Seven:"+compareTwoText);
	}
	
	@Test(priority = 17)
	private void verifyRelatedArticleEight() throws Exception{
		switchingTab(firstTab);
		ah.clickRelatedArticleEight();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickRelatedArticleEight();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Related Article Eight:"+compareTwoText);
	}
	
	@Test(priority = 18)
	private void verifySeeProducts() throws Exception{
		switchingTab(firstTab);
		ah.clickSeeProducts();
		String preProdUrl = compareUrl(excelRead("Tums", 1, 0));
		switchingTab(secondTab);
		ah.clickSeeProducts();
		String liveUrl = compareUrl(excelRead("Tums", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see products:"+compareTwoText);
	}
	

}
