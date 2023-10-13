package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneSensitivityToColdPage;
import com.qa.tums.eng.util.Retry;

public class SensodyneSensitivityToColdTest extends BaseClass{
	
	SensodyneSensitivityToColdPage sc;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensitivityToColdPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("sensitivityToColdLiveUrl"));
	}

	@Test(priority = 0, retryAnalyzer = Retry.class)
	private void cookieButton() throws Exception {
		sc = new SensodyneSensitivityToColdPage();
		switchingTab(firstTab);
		sc.clickCookieBtn();
		sc.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
		switchingTab(secondTab);
		sc.clickCookieBtn();
		sc.clickGigyaForm();
		System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 1)
	private void verifyToothEnamel() throws Exception{
		switchingTab(firstTab);
		sc.clickToothEnamel();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickToothEnamel();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for tooth enamel: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyToothSensitivity() throws Exception{
		switchingTab(firstTab);
		sc.clickToothSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickToothSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for tooth Sensitivity: "+compareTwoText);
	}
	
	
	@Test(priority = 3)
	private void verifyToothSensitivityYoutubeLink() throws Exception{
		switchingTab(firstTab);
		sc.clickToothSensitivityYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in PreProd Url");
		switchingTab(secondTab);
		sc.clickToothSensitivityYoutubeLink();
		System.out.println("Tooth sensitivity youtube video has verified in live Url");
	}

	@Test(priority = 4)
	private void verifyIngredients() throws Exception{
		switchingTab(firstTab);
		sc.clickIngredients();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickIngredients();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Ingredients: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyFindWhichSensodyne() throws Exception{
		switchingTab(firstTab);
		sc.clickFindWhichSensodyne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickFindWhichSensodyne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Which Sensodyne: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyProductTextOne() throws Exception{
		switchingTab(firstTab);
		sc.clickProductTextOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductTextOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text One:"+compareTwoText);
	}


	@Test(priority = 7)
	private void verifyProductTextTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickProductTextTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductTextTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Two:"+compareTwoText);
	}

	@Test(priority = 8)
	private void verifyProductTextThree() throws Exception{
		switchingTab(firstTab);
		sc.clickProductTextThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductTextThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Three:"+compareTwoText);
	}

	@Test(priority = 9)
	private void verifyProductTextFour() throws Exception{
		switchingTab(firstTab);
		sc.clickProductTextFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductTextFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Text Four:"+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyProductImageOne() throws Exception{
		switchingTab(firstTab);
		sc.clickProductImageOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductImageOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image One:"+compareTwoText);
	}

	@Test(priority = 11)
	private void verifyProductImageTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickProductImageTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductImageTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Two:"+compareTwoText);
	}

	@Test(priority = 12)
	private void verifyProductImageThree() throws Exception{
		switchingTab(firstTab);
		sc.clickProductImageThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductImageThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Three:"+compareTwoText);
	}

	@Test(priority = 13)
	private void verifyProductImageFour() throws Exception{
		switchingTab(firstTab);
		sc.clickProductImageFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductImageFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for product Image Four:"+compareTwoText);
	}
	
	
	@Test(priority = 14)
	private void verifyBuyNowOne() throws Exception{
		switchingTab(firstTab);
		sc.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the preprod Url");
		switchingTab(secondTab);
		sc.clickBuyNowOne();
		System.out.println("Write a buy now button one verified successfully in the live Url");
	}

	@Test(priority = 15)
	private void verifyBuyNowTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the preprod Url");
		switchingTab(secondTab);
		sc.clickBuyNowTwo();
		System.out.println("Write a buy now button Two verified successfully in the live Url");
	}

	@Test(priority = 16)
	private void verifyBuyNowThree() throws Exception{
		switchingTab(firstTab);
		sc.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the preprod Url");
		switchingTab(secondTab);
		sc.clickBuyNowThree();
		System.out.println("Write a buy now button three verified successfully in the live Url");
	}

	@Test(priority = 17)
	private void verifyBuyNowFour() throws Exception{
		switchingTab(firstTab);
		sc.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the preprod Url");
		switchingTab(secondTab);
		sc.clickBuyNowFour();
		System.out.println("Write a buy now button Four verified successfully in the live Url");
	}
	
	@Test(priority = 18)
	private void verifyProductCardLearnMoreOne() throws Exception{
		switchingTab(firstTab);
		sc.clickProductCardLearnMoreOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductCardLearnMoreOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more one :"+compareTwoText);
	}

	@Test(priority = 19)
	private void verifyProductCardLearnMoreTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickProductCardLearnMoreTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductCardLearnMoreTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more two :"+compareTwoText);
	}

	@Test(priority = 20)
	private void verifyProductCardLearnMoreThree() throws Exception{
		switchingTab(firstTab);
		sc.clickProductCardLearnMoreThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductCardLearnMoreThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more three :"+compareTwoText);
	}

	@Test(priority = 21)
	private void verifyProductCardLearnMoreFour() throws Exception{
		switchingTab(firstTab);
		sc.clickProductCardLearnMoreFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickProductCardLearnMoreFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Products card learn more Four :"+compareTwoText);
	}
	
	@Test(priority = 22)
	private void verifyRadioButtonOne() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonOne();
		System.out.println("Radio Button one is verified in the live Url");
	}
	
	@Test(priority = 23)
	private void verifyRadioButtonTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonTwo();
		System.out.println("Radio Button two is verified in the live Url");
	}
	
	@Test(priority = 24)
	private void verifyRadioButtonThree() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonThree();
		System.out.println("Radio Button three is verified in the live Url");
	}
	
	@Test(priority = 25)
	private void verifyRadioButtonFour() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonFour();
		System.out.println("Radio Button four is verified in the live Url");
	}
	
	@Test(priority = 26)
	private void verifyRadioButtonFive() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonFive();
		System.out.println("Radio Button five is verified in the live Url");
	}
	
	@Test(priority = 27)
	private void verifyRadioButtonSix() throws Exception{
		switchingTab(firstTab);
		sc.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the preprod Url");
		switchingTab(secondTab);
		sc.clickRadioButtonSix();
		System.out.println("Radio Button Six is verified in the live Url");
	}
	
	@Test(priority = 28)
	private void verifyRelatedArticleOne() throws Exception{
		switchingTab(firstTab);
		sc.clickRelatedArticleOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickRelatedArticleOne();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article one: "+compareTwoText);
	}
	

	@Test(priority = 29)
	private void verifyRelatedArticleTwo() throws Exception{
		switchingTab(firstTab);
		sc.clickRelatedArticleTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickRelatedArticleTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article two: "+compareTwoText);
	}
	

	@Test(priority = 30)
	private void verifyRelatedArticleThree() throws Exception{
		switchingTab(firstTab);
		sc.clickRelatedArticleThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickRelatedArticleThree();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article three: "+compareTwoText);
	}
	

	@Test(priority = 31)
	private void verifyRelatedArticleFour() throws Exception{
		switchingTab(firstTab);
		sc.clickRelatedArticleFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickRelatedArticleFour();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article Four: "+compareTwoText);
	}
	
	@Test(priority = 32)
	private void verifyBreadCrumb() throws Exception{
		switchingTab(firstTab);
		sc.clickBreadCrumb();
		String preProdUrl = compareUrl(excelRead("Sensodyne", 1, 0));
		switchingTab(secondTab);
		sc.clickBreadCrumb();
		String liveUrl = compareUrl(excelRead("Sensodyne", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Bread Crumb: "+compareTwoText);
	}
	
	
}
