package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInWhiterTeethProductsPage;

public class SensodyneInWhiterTeethProductsTest extends BaseClass{
	
	SensodyneInWhiterTeethProductsPage wtp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		wtp = new	SensodyneInWhiterTeethProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("whiterTeethProductsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("whiterTeethProductsLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyPrdtCardText() throws Exception{
		switchingTab(firstTab);
		wtp.clickPrdtCardText();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		wtp.clickPrdtCardText();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardText: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyPrdtCardImg() throws Exception{
		switchingTab(firstTab);
		wtp.clickPrdtCardImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		wtp.clickPrdtCardImg();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for PrdtCardImg: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyPrdtCardBuyNow() throws Exception{
		switchingTab(firstTab);
		wtp.clickPrdtCardBuyNow();
		System.out.println("Product Card Buy Now verified successfully in Preprod URL");
		switchingTab(secondTab);
		wtp.clickPrdtCardBuyNow();
		System.out.println("Product Card Buy Now verified successfully in Live URL");
	}
	
	@Test(priority = 4)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		wtp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		wtp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for FindYourStore: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyHyperLinkFreshBreath() throws Exception{
		switchingTab(firstTab);
		wtp.clickHyperLinkFreshBreath();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		wtp.clickHyperLinkFreshBreath();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for HyperLinkFreshBreath: "+compareTwoText);
	}

}
