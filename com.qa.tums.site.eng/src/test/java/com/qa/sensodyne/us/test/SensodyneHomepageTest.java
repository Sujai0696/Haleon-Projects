package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneHomepagePage;
import com.qa.tums.eng.util.Retry;

public class SensodyneHomepageTest extends BaseClass{

	SensodyneHomepagePage hp;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("preProdHomepageUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("liveHomepageUrl"));
	}

	@Test(priority = 0, enabled = true, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		hp = new SensodyneHomepagePage();
		switchingTab(firstTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		hp.clickCookieBtn();
		hp.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}

	@Test(priority = 1)
	private void verifyViewProducts() throws Exception{
		switchingTab(firstTab);
		hp.clickViewProducts();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickViewProducts();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for View Products:"+compareTwoText);
	}

	@Test(priority = 2)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		hp.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text One:"+compareTwoText);
	}


	@Test(priority = 3)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Two:"+compareTwoText);
	}

	@Test(priority = 4)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		hp.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Three:"+compareTwoText);
	}

	@Test(priority = 5)
	private void verifyProductTextFour() throws Exception{
		switchingTab(firstTab);
		hp.clickProductTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Four:"+compareTwoText);
	}

	@Test(priority = 6)
	private void verifyProductImageOne() throws Exception{
		switchingTab(firstTab);
		hp.clickProductImageOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductImageOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image One:"+compareTwoText);
	}

	@Test(priority = 7)
	private void verifyProductImageTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickProductImageTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductImageTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Two:"+compareTwoText);
	}

	@Test(priority = 8)
	private void verifyProductImageThree() throws Exception{
		switchingTab(firstTab);
		hp.clickProductImageThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductImageThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Three:"+compareTwoText);
	}

	@Test(priority = 9)
	private void verifyProductImageFour() throws Exception{
		switchingTab(firstTab);
		hp.clickProductImageFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductImageFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Four:"+compareTwoText);
	}

	@Test(priority = 10)
	private void verifyRatingSummaryOne() throws Exception{
		switchingTab(firstTab);
		boolean preProd = hp.displayRatingSummaryOne();
		Assert.assertTrue(preProd);
		System.out.println("Rating summary one is dispalyed in the preprod Url");
		switchingTab(secondTab);
		boolean live = hp.displayRatingSummaryOne();
		Assert.assertTrue(live);
		System.out.println("Rating summary one is dispalyed in the live Url");
	}

	@Test(priority = 11)
	private void verifyRatingSummaryTwo() throws Exception{
		switchingTab(firstTab);
		boolean preProd = hp.displayRatingSummaryTwo();
		Assert.assertTrue(preProd);
		System.out.println("Rating summary two is dispalyed in the preprod Url");
		switchingTab(secondTab);
		boolean live = hp.displayRatingSummaryTwo();
		Assert.assertTrue(live);
		System.out.println("Rating summary two is dispalyed in the live Url");
	}

	@Test(priority = 12)
	private void verifyRatingSummaryThree() throws Exception{
		switchingTab(firstTab);
		boolean preProd = hp.displayRatingSummaryThree();
		Assert.assertTrue(preProd);
		System.out.println("Rating summary Three is dispalyed in the preprod Url");
		switchingTab(secondTab);
		boolean live = hp.displayRatingSummaryThree();
		Assert.assertTrue(live);
		System.out.println("Rating summary Three is dispalyed in the live Url");
	}

	@Test(priority = 13)
	private void verifyRatingSummaryFour() throws Exception{
		switchingTab(firstTab);
		boolean preProd = hp.displayRatingSummaryFour();
		Assert.assertTrue(preProd);
		System.out.println("Rating summary Four is dispalyed in the preprod Url");
		switchingTab(secondTab);
		boolean live = hp.displayRatingSummaryFour();
		Assert.assertTrue(live);
		System.out.println("Rating summary Four is dispalyed in the live Url");
	}

	@Test(priority = 14)
	private void verifyWriteAReviewOne() throws Exception{
		switchingTab(firstTab);
		hp.clickWriteAReviewOne();
		System.out.println("Write a review button one verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickWriteAReviewOne();
		System.out.println("Write a review button one verified successfully in the live Url");
	}

	@Test(priority = 15)
	private void verifyWriteAReviewTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickWriteAReviewTwo();
		System.out.println("Write a review button Two verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickWriteAReviewTwo();
		System.out.println("Write a review button Two verified successfully in the live Url");
	}

	@Test(priority = 16)
	private void verifyWriteAReviewThree() throws Exception{
		switchingTab(firstTab);
		hp.clickWriteAReviewThree();
		System.out.println("Write a review button Three verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickWriteAReviewThree();
		System.out.println("Write a review button Three verified successfully in the live Url");
	}

	@Test(priority = 17)
	private void verifyWriteAReviewFour() throws Exception{
		switchingTab(firstTab);
		hp.clickWriteAReviewFour();
		System.out.println("Write a review button Four verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickWriteAReviewFour();
		System.out.println("Write a review button Four verified successfully in the live Url");
	}

	@Test(priority = 18)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		hp.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the live Url");
	}

	@Test(priority = 19)
	private void verifyBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the live Url");
	}

	@Test(priority = 20)
	private void verifyBuyNowThree() throws Exception{
		switchingTab(firstTab);
		hp.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the live Url");
	}

	@Test(priority = 21)
	private void verifyBuyNowFour() throws Exception{
		switchingTab(firstTab);
		hp.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the preprod Url");
		switchingTab(secondTab);
		hp.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the live Url");
	}

	@Test(priority = 22)
	private void verifyProductCardLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		hp.clickProductCardLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductCardLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more one :"+compareTwoText);
	}

	@Test(priority = 23)
	private void verifyProductCardLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickProductCardLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductCardLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more two :"+compareTwoText);
	}

	@Test(priority = 24)
	private void verifyProductCardLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		hp.clickProductCardLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductCardLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more three :"+compareTwoText);
	}

	@Test(priority = 25)
	private void verifyProductCardLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		hp.clickProductCardLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickProductCardLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more Four :"+compareTwoText);
	}

	@Test(priority = 26)
	private void verifyDentistRecommendedLearMore() throws Exception{
		switchingTab(firstTab);
		hp.clickDentistRecommendedLearMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickDentistRecommendedLearMore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for dentist recommended learn more:"+compareTwoText);
	}

	@Test(priority = 27)
	private void verifySensitivityAndGumLearnMore() throws Exception{
		switchingTab(firstTab);
		hp.clickSensitivityAndGumLearnMoreImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickSensitivityAndGumLearnMoreImg();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitivity and gum learn more:"+compareTwoText);
	}

	@Test(priority = 28)
	private void verifyRapiReliefLearnMore() throws Exception{
		switchingTab(firstTab);
		hp.clickRapiReliefLearnMoreImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickRapiReliefLearnMoreImg();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for rapid releif learn more:"+compareTwoText);
	}

	@Test(priority = 29)
	private void verifySensitiveCareToothBrushLearnMore() throws Exception{
		switchingTab(firstTab);
		hp.clickSensitiveCareToothBrushLearnMoreImg();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickSensitiveCareToothBrushLearnMoreImg();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for sensitive care tooth brush learn more:"+compareTwoText);
	}

	@Test(priority = 30)
	private void verifyFindYourStore() throws Exception{
		switchingTab(firstTab);
		hp.clickFindYourStore();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickFindYourStore();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for find your store :"+compareTwoText);
	}

	@Test(priority = 31)
	private void verifyGetYourCoupon() throws Exception{
		switchingTab(firstTab);
		hp.clickGetYourCoupon();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickGetYourCoupon();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for get your coupon :"+compareTwoText);
	}

	@Test(priority = 32)
	private void verifyExploreOurProducts() throws Exception{
		switchingTab(firstTab);
		hp.clickExploreOurProducts();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickExploreOurProducts();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for explore our products :"+compareTwoText);
	}

	@Test(priority = 33)
	private void verifyToothSensitivityYoutubeLink() throws Exception{
		switchingTab(firstTab);
		hp.clickToothSensitivityYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		hp.clickToothSensitivityYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in live Url");
	}

	@Test(priority = 34)
	private void verifyFindOut() throws Exception{
		switchingTab(firstTab);
		String preProdUrl = hp.clickFindOut();
		System.out.println("Find out redirected in the preprod Url");
		switchingTab(secondTab);
		String liveUrl = hp.clickFindOut();
		System.out.println("Find out redirected in the live Url");
		System.out.println(preProdUrl);
		System.out.println(liveUrl);
		Assert.assertEquals(preProdUrl, liveUrl);
	}

	@Test(priority = 35)
	private void verifyReadOurTips() throws Exception{
		switchingTab(firstTab);
		hp.clickReadOurTips();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickReadOurTips();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for read our tips:"+compareTwoText);
	}

	@Test(priority = 36)
	private void verifyCheckThemOut() throws Exception{
		switchingTab(firstTab);
		hp.clickCheckThemOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickCheckThemOut();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for check them out :"+compareTwoText);
	}

	@Test(priority = 37)
	private void verifySensitivityDevelopYoutubeLink() throws Exception{
		switchingTab(firstTab);
		hp.clickSensitivityDevelopYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		hp.clickSensitivityDevelopYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in live Url");
	}

	
	@Test(priority = 38)
	private void verifyCommonQuestionOne() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionOne();
		System.out.println("Common Question One is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionOne();
		System.out.println("Common Question One is verified in the live Url");
		
	}
	
	@Test(priority = 39)
	private void verifyCommonQuestionTwo() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionTwo();
		System.out.println("Common Question Two is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionTwo();
		System.out.println("Common Question Two is verified in the live Url");
		
	}
	
	@Test(priority = 40)
	private void verifyCommonQuestionThree() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionThree();
		System.out.println("Common Question Three is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionThree();
		System.out.println("Common Question Three is verified in the live Url");
		
	}
	
	@Test(priority = 41)
	private void verifyCommonQuestionFour() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionFour();
		System.out.println("Common Question Four is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionFour();
		System.out.println("Common Question Four is verified in the live Url");
		
	}


	@Test(priority = 42)
	private void verifyCommonQuestionFive() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionFive();
		System.out.println("Common Question Five is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionFive();
		System.out.println("Common Question Five is verified in the live Url");
	}
	
	@Test(priority = 43)
	private void verifyCommonQuestionSix() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionSix();
		System.out.println("Common Question Six is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionSix();
		System.out.println("Common Question Six is verified in the live Url");
	}
	
	@Test(priority = 44)
	private void verifyCommonQuestionSeven() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionSeven();
		System.out.println("Common Question Seven is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionSeven();
		System.out.println("Common Question Seven is verified in the live Url");
	}
	
	@Test(priority = 45)
	private void verifyCommonQuestionEight() throws Exception{
		switchingTab(firstTab);
		hp.clickCommonQuestionEight();
		System.out.println("Common Question Eight is verified in the PreProd Url");
		switchingTab(secondTab);
		hp.clickCommonQuestionEight();
		System.out.println("Common Question Eight is verified in the live Url");
	}
	
	
//	@Test(priority = 46)
//	private void verifyCommonQuestionNine() throws Exception{
//		switchingTab(firstTab);
//		hp.clickCommonQuestionNine();
//		System.out.println("Common Question Nine is verified in the PreProd Url");
//		switchingTab(secondTab);
//		hp.clickCommonQuestionNine();
//		System.out.println("Common Question Nine is verified in the live Url");
//	}
//	
//	@Test(priority = 47)
//	private void verifyCommonQuestionTen() throws Exception{
//		switchingTab(firstTab);
//		hp.clickCommonQuestionTen();
//		System.out.println("Common Question Ten is verified in the PreProd Url");
//		switchingTab(secondTab);
//		hp.clickCommonQuestionTen();
//		System.out.println("Common Question Ten is verified in the live Url");
//	}
	
	@Test(priority = 48)
	private void verifySeeMoreQuestions() throws Exception{
		switchingTab(firstTab);
		hp.clickSeeMoreQuestions();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		hp.clickSeeMoreQuestions();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for see more Questions :"+compareTwoText);
	}
	
	
	
	
}

