package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbDailyCareExtraFreshToothpastePage;

public class SensodyneEnGbDailyCareExtraFreshToothpasteTest extends BaseClass{
	
	SensodyneEnGbDailyCareExtraFreshToothpastePage dcet;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		dcet = new	SensodyneEnGbDailyCareExtraFreshToothpastePage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("dailyCareExtraFreshToothpastePreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("dailyCareExtraFreshToothpasteLiveUrl"));
	}
	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		dcet.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		dcet.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		dcet.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		dcet.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyBreadcrumbThree() throws Exception{
		switchingTab(firstTab);
		dcet.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyBuyNow() throws Exception{
		switchingTab(firstTab);
		dcet.clickBuyNow();
		System.out.println("Buy Now Verified in the Preprod URL");
		switchingTab(secondTab);
		dcet.clickBuyNow();
		System.out.println("Buy Now Verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyYoutubeVideo() throws Exception{
		switchingTab(firstTab);
		dcet.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the preprod URL");
		switchingTab(secondTab);
		dcet.clickYoutubeVideo();
		System.out.println("YouTube Video verified in the Live URL");
	}
	
	
	
	@Test(priority = 11)
	private void verifyTabSection() throws Exception{
		switchingTab(firstTab);
		dcet.clickTabSection();
		System.out.println("Tab section is verified in the PreProd Url");
		switchingTab(secondTab);
		dcet.clickTabSection();
		System.out.println("Tab section is verified in the Live Url");
	}
	
	@Test(priority = 12)
	private void verifyMostPopularProductOne() throws Exception{
		switchingTab(firstTab);
		dcet.clickMostPopularProductOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickMostPopularProductOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product One: "+compareTwoText);
	}
	
	@Test(priority = 13)
	private void verifyMostPopularProductTwo() throws Exception{
		switchingTab(firstTab);
		dcet.clickMostPopularProductTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickMostPopularProductTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Two: "+compareTwoText);
	}
	
	@Test(priority = 14)
	private void verifyMostPopularProductThree() throws Exception{
		switchingTab(firstTab);
		dcet.clickMostPopularProductThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickMostPopularProductThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Three: "+compareTwoText);
	}
	
	@Test(priority = 15)
	private void verifyMostPopularProductFour() throws Exception{
		switchingTab(firstTab);
		dcet.clickMostPopularProductFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickMostPopularProductFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Most Popular Product Four: "+compareTwoText);
	}
	
	
	@Test(priority = 16)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		dcet.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		dcet.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Store:"+compareTwoText);
	}

}
