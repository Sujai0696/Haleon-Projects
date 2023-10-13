package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneProductResultsPage;

public class SensodyneProductResultsTest extends BaseClass{
	
	SensodyneProductResultsPage pr;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("productResultsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("productResultsLiveUrl"));
	}

	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		pr = new SensodyneProductResultsPage();
		switchingTab(firstTab);
		pr.clickCookieBtn();
		pr.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		pr.clickCookieBtn();
		pr.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
//	@Test(priority = 1)
//	private void verifyProductOne() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product One:"+compareTwoText);
//	}
//	
//	@Test(priority = 2)
//	private void verifyProductTwo() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Two:"+compareTwoText);
//	}
//	
//	@Test(priority = 3)
//	private void verifyProductThree() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Three:"+compareTwoText);
//	}
//	
//	@Test(priority = 4)
//	private void verifyProductFour() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductFour();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductFour();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Four:"+compareTwoText);
//	}
//	
//	@Test(priority = 5)
//	private void verifyProductFive() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductFive();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductFive();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Five:"+compareTwoText);
//	}
//	
//	@Test(priority = 6)
//	private void verifyProductSix() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductSix();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductSix();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Six:"+compareTwoText);
//	}
//	
//	@Test(priority = 7)
//	private void verifyProductSeven() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductSeven();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductSeven();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Seven:"+compareTwoText);
//	}
//	
//	@Test(priority = 8)
//	private void verifyProductEight() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductEight();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductEight();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Eight:"+compareTwoText);
//	}
//	
//	@Test(priority = 9)
//	private void verifyProductNine() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductNine();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductNine();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Nine:"+compareTwoText);
//	}
//	
//	@Test(priority = 10)
//	private void verifyProductTen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Ten:"+compareTwoText);
//	}
//	
//	@Test(priority = 11)
//	private void verifyProductEleven() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductEleven();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductEleven();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Eleven:"+compareTwoText);
//	}
//	
//	@Test(priority = 12)
//	private void verifyProductTwelve() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwelve();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwelve();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twelve:"+compareTwoText);
//	}
//	
//	@Test(priority = 13)
//	private void verifyProductThirteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductThirteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductThirteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Thirteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 14)
//	private void verifyProductFourteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductFourteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductFourteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Fourteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 15)
//	private void verifyProductFifteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductFifteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductFifteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Fifteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 16)
//	private void verifyProductSixteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductSixteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductSixteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Sixteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 17)
//	private void verifyProductSeventeen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductSeventeen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductSeventeen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Seventeen:"+compareTwoText);
//	}
//	
//	@Test(priority = 18)
//	private void verifyProductEighteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductEighteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductEighteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Eighteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 19)
//	private void verifyProductNineteen() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductNineteen();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductNineteen();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Nineteen:"+compareTwoText);
//	}
//	
//	@Test(priority = 20)
//	private void verifyProductTwenty() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwenty();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwenty();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty:"+compareTwoText);
//	}
	
	
//	@Test(priority = 21)
//	private void verifyProductTwentyOne() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentyOne();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentyOne();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty One:"+compareTwoText);
//	}
//	
//	@Test(priority = 22)
//	private void verifyProductTwentyTwo() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentyTwo();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentyTwo();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty Two:"+compareTwoText);
//	}
//	
//	@Test(priority = 23)
//	private void verifyProductTwentyThree() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentyThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentyThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty Three:"+compareTwoText);
//	}
//	
//	@Test(priority = 24)
//	private void verifyProductTwentyFour() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentyFour();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentyFour();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty Four:"+compareTwoText);
//	}
//	
//	@Test(priority = 25)
//	private void verifyProductTwentyFive() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentyFive();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentyFive();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty Five:"+compareTwoText);
//	}
//	
//	@Test(priority = 26)
//	private void verifyProductTwentySix() throws Exception{
//		switchingTab(firstTab);
//		pr.clickProductTwentySix();
//		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
//		switchingTab(secondTab);
//		pr.clickProductTwentySix();
//		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Product Twenty Six :"+compareTwoText);
//	}
	
	
	@Test(priority = 27)
	private void verifyImageOne() throws Exception{
		switchingTab(firstTab);
		pr.clickImageOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		pr.clickImageOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Product one:"+compareTwoText);
	}
	

}
