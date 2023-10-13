package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneHomepagePage extends BaseClass{

	public SensodyneHomepagePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;

	@FindBy(xpath = "//*[@class='btn']//self::a[text()='View Products']")
	private static WebElement btnViewProducts;

	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Nourish Sensitivity Relief & Cavity Prevention Toothpaste']")
	private static WebElement productTextOne;

	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensitivity & Gum Mint Toothpaste']")
	private static WebElement productTextTwo;

	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Extra Whitening Toothpaste']")
	private static WebElement productTextThree;

	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensitive Care Toothbrush']")
	private static WebElement productTextFour;

	@FindBy(xpath = "//img[@title='Sensodyne Nourish Sensitivity Relief & Cavity Prevention Toothpaste']")
	private static WebElement productImageOne;

	@FindBy(xpath = "//img[@title='Sensodyne Sensitivity And Gum Mint']")
	private static WebElement productImageTwo;

	@FindBy(xpath = "//img[@title='Sensodyne Extra Whitening Toothpaste']")
	private static WebElement productImageThree;

	@FindBy(xpath = "//img[@title='Sensodyne Sensitive Care Tooth Brush']")
	private static WebElement productImageFour;

	@FindBy(xpath = "(//button[@id='ratings-summary'])[1]")
	private static WebElement displayRatingSummaryOne;

	@FindBy(xpath = "(//button[@id='ratings-summary'])[2]")
	private static WebElement displayRatingSummaryTwo;

	@FindBy(xpath = "(//button[@id='ratings-summary'])[3]")
	private static WebElement displayRatingSummaryThree;

	@FindBy(xpath = "(//button[@id='ratings-summary'])[4]")
	private static WebElement displayRatingSummaryFour;

	@FindBy(xpath = "(//button[@class='bv_button_buttonMinimalist '])[1]")
	private static WebElement writeAReviewOne;

	@FindBy(xpath = "(//button[@class='bv_button_buttonMinimalist '])[2]")
	private static WebElement writeAReviewTwo;

	@FindBy(xpath = "(//button[@class='bv_button_buttonMinimalist '])[3]")
	private static WebElement writeAReviewThree;

	@FindBy(xpath = "(//button[@class='bv_button_buttonMinimalist '])[4]")
	private static WebElement writeAReviewFour;

	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement reviewClose;

	@FindBy(xpath = "//span[text()='My Review for Nourish Healthy White']")
	private static WebElement reviewTextOne;

	@FindBy(xpath = "//span[text()='My Review for Sensitivity & Gum - Mint']")
	private static WebElement reviewTextTwo;

	@FindBy(xpath = "//span[text()='My Review for Extra Whitening']")
	private static WebElement reviewTextThree;

	@FindBy(xpath = "//span[text()='My Review for Sensodyne Sensitive Care Toothbrush']")
	private static WebElement reviewTextFour;

	@FindBy(xpath = "(//span[@class='ps-button-label'])[1]")
	private static WebElement btnBuyNowOne;

	@FindBy(xpath = "(//span[@class='ps-button-label'])[2]")
	private static WebElement btnBuyNowTwo;

	@FindBy(xpath = "(//span[@class='ps-button-label'])[3]")
	private static WebElement btnBuyNowThree;

	@FindBy(xpath = "(//span[@class='ps-button-label'])[4]")
	private static WebElement btnBuyNowFour;

	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;

	@FindBy(xpath = "//h2[text()='Sensodyne Nourish Healthy White 4.0 oz']")
	private static WebElement buyNowTextOne;

	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
	private static WebElement buyNowTextTwo;

	@FindBy(xpath = "//h2[text()='Extra Whitening, 4.0 oz']")
	private static WebElement buyNowTextThree;

	@FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
	private static WebElement buyNowTextFour;

	@FindBy(xpath = "(//a[@id='learnmore1'])[1]")
	private static WebElement productCardLearnMoreOne;

	@FindBy(xpath = "(//a[@id='learnmore1'])[2]")
	private static WebElement productCardLearnMoreTwo;

	@FindBy(xpath = "(//a[@id='learnmore1'])[3]")
	private static WebElement productCardLearnMoreThree;

	@FindBy(xpath = "(//a[@id='learnmore1'])[4]")
	private static WebElement productCardLearnMoreFour;

	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Learn More']")
	private static WebElement dentistRecommendedLearnMore;

	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']")
	private static WebElement carouselActive;

	@FindBy(xpath = "//*[@class='carousel-cover']//self::img[@alt='Bowl of ice cream and berries with Sensodyne Sensitivity & Gum logo']")
	private static WebElement sensitivityAndGumLearnMoreImg;

	@FindBy(xpath = "//*[@class='carousel-nav-item ']//self::a[@aria-label='slide 2']")
	private static WebElement carouselTwo;

	@FindBy(xpath = "//*[@class='carousel-cover']//self::img[@alt='Rapid relief toothpaste: also available in whitening']")
	private static WebElement rapidReliefLearnMoreImg;

	@FindBy(xpath = "//*[@class='carousel-nav-item ']//self::a[@aria-label='slide 3']")
	private static WebElement carouselThree;

	@FindBy(xpath = "//*[@class='carousel-cover']//self::img[@alt='Sensodyne Sensitive Care Toothbrush close-up shot and packaging']")
	private static WebElement sensitiveCareToothBrushLearnMoreImg;

	@FindBy(xpath = "//h2[text()='Shop']//following::a[text()='Find Your Store']")
	private static WebElement findYourStore;

	@FindBy(xpath = "//h2[text()='Save']//following::a[@class='save-coupon']")
	private static WebElement getYourCoupon;

	@FindBy(xpath = "//*[@href='/en-us/products/']//self::a[text()='Explore Our Products']")
	private static WebElement exploreOurProducts;

	@FindBy(xpath = "(//div[@class='title-content'])[1]")
	private static WebElement btnYoutube;

	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframeYoutube;

	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon;

	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement youtubePauseIcon;

	@FindBy(xpath = "//div[@class='quick-checkup main']")
	private static WebElement findOut;

	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/managing-sensitive-teeth/sensitivity-to-cold/']//self::a[text()='Read Our Tips']")
	private static WebElement readOurTips;

	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/managing-sensitive-teeth/sensitivity-to-hot/']//self::a[text()='Check Them Out']")
	private static WebElement checkThemOut;

	@FindBy(xpath = "(//div[@class='title-content'])[2]")
	private static WebElement btnYoutubeTwo;

	@FindBy(xpath = "//span[text()='Common Questions']")
	private static WebElement scroll;

	@FindBy(xpath = "//li[@class='active']")
	private static WebElement commonQuestionCarosuelActive;

	@FindBy(xpath = "//li[@class='item lslide active']//self::h3[text()='Does Sensodyne toothpaste help prevent cavities?']")
	private static WebElement commonQuestionOne;

	@FindBy(xpath = "//li[@class='item lslide active answered']")
	private static WebElement commonQuestionActiveOne;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='How do I get rid of my sensitive teeth?']")
	private static WebElement commonQuestionTwo;

	@FindBy(xpath = "//li[@class='item lslide answered']")
	private static WebElement commonQuestionActiveTwo;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='How can I whiten sensitive teeth?']")
	private static WebElement commonQuestionThree;

	@FindBy(xpath = "(//*[@class]//self::a[@aria-label='slide 2'])[2]")
	private static WebElement commonQuestionCarosuelTwo;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='What causes tooth sensitivity?']")
	private static WebElement commonQuestionFour;

	@FindBy(xpath = "(//*[@class]//self::a[@aria-label='slide 3'])[2]")
	private static WebElement commonQuestionCarosuelThree;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='What makes my sensitive teeth hurt?']")
	private static WebElement commonQuestionFive;

	@FindBy(xpath = "//a[@aria-label='slide 4']")
	private static WebElement commonQuestionCarosuelFour;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='Is tooth sensitivity common?']")
	private static WebElement commonQuestionSix;

	@FindBy(xpath = "//a[@aria-label='slide 5']")
	private static WebElement commonQuestionCarosuelFive;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='How does Sensodyne toothpaste work?']")
	private static WebElement commonQuestionSeven;

	@FindBy(xpath = "//a[@aria-label='slide 6']")
	private static WebElement commonQuestionCarosuelSix;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='How often should I use Sensodyne toothpaste?']")
	private static WebElement commonQuestionEight;

	@FindBy(xpath = "//a[@aria-label='slide 7']")
	private static WebElement commonQuestionCarosuelSeven;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='Does Sensodyne toothpaste help prevent cavities?']")
	private static WebElement commonQuestionNine;

	@FindBy(xpath = "//li[@class='item clone right answered']//self::h3[text()='Does Sensodyne toothpaste help prevent cavities?']")
	private static WebElement commonQuestionActiveNine;

	@FindBy(xpath = "//a[@aria-label='slide 8']")
	private static WebElement commonQuestionCarosuelEight;

	@FindBy(xpath = "//li[@class='item lslide']//self::h3[text()='How do I get rid of my sensitive teeth?']")
	private static WebElement commonQuestionTen;

	@FindBy(xpath = "//a[@class='btn btn-on-blue']")
	private static WebElement seeMoreQuestions;

	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}

	public void clickViewProducts() throws Exception{
		scrollDownUsingElement(btnViewProducts);
		clickElementUsingJavaScript(btnViewProducts);
		pageLoad();
	}

	public void clickProductTextOne() throws Exception{
		visibilityOf(productTextOne);
		scrollDownUsingElement(productTextOne);
		clickElementUsingJavaScript(productTextOne);
	}

	public void clickProductTextTwo() throws Exception{
		visibilityOf(productTextTwo);
		scrollDownUsingElement(productTextTwo);
		clickElementUsingJavaScript(productTextTwo);
	}

	public void clickProductTextThree() throws Exception{
		visibilityOf(productTextThree);
		scrollDownUsingElement(productTextThree);
		clickElementUsingJavaScript(productTextThree);
	}

	public void clickProductTextFour() throws Exception{
		visibilityOf(productTextFour);
		scrollDownUsingElement(productTextFour);
		clickElementUsingJavaScript(productTextFour);
	}

	public void clickProductImageOne() throws Exception{
		visibilityOf(productImageOne);
		scrollDownUsingElement(productImageOne);
		clickElementUsingJavaScript(productImageOne);
	}

	public void clickProductImageTwo() throws Exception{
		visibilityOf(productImageTwo);
		scrollDownUsingElement(productImageTwo);
		clickElementUsingJavaScript(productImageTwo);
	}

	public void clickProductImageThree() throws Exception{
		visibilityOf(productImageThree);
		scrollDownUsingElement(productImageThree);
		clickElementUsingJavaScript(productImageThree);
	}

	public void clickProductImageFour() throws Exception{
		visibilityOf(productImageFour);
		scrollDownUsingElement(productImageFour);
		clickElementUsingJavaScript(productImageFour);
	}

	public boolean displayRatingSummaryOne() throws Exception{
		scrollDownUsingElement(displayRatingSummaryOne);
		boolean elementIsDisplayed = elementIsDisplayed(displayRatingSummaryOne);
		return true;
	}

	public boolean displayRatingSummaryTwo() throws Exception{
		scrollDownUsingElement(displayRatingSummaryTwo);
		boolean elementIsDisplayed = elementIsDisplayed(displayRatingSummaryTwo);
		return true;
	}

	public boolean displayRatingSummaryThree() throws Exception{
		scrollDownUsingElement(displayRatingSummaryThree);
		boolean elementIsDisplayed = elementIsDisplayed(displayRatingSummaryThree);
		return true;
	}

	public boolean displayRatingSummaryFour() throws Exception{
		scrollDownUsingElement(displayRatingSummaryFour);
		boolean elementIsDisplayed = elementIsDisplayed(displayRatingSummaryFour);
		return true;
	}

	public void clickWriteAReviewOne()throws Exception {
		scrollDownUsingElement(writeAReviewOne);
		clickElementUsingJavaScript(writeAReviewOne);
		visibilityOf(reviewTextOne);
		Assert.assertTrue(elementIsDisplayed(reviewTextOne));
		clickElementUsingJavaScript(reviewClose);
	}

	public void clickWriteAReviewTwo()throws Exception {
		scrollDownUsingElement(writeAReviewTwo);
		clickElementUsingJavaScript(writeAReviewTwo);
		visibilityOf(reviewTextTwo);
		Assert.assertTrue(elementIsDisplayed(reviewTextTwo));
		clickElementUsingJavaScript(reviewClose);
	}

	public void clickWriteAReviewThree()throws Exception {
		scrollDownUsingElement(writeAReviewThree);
		clickElementUsingJavaScript(writeAReviewThree);
		visibilityOf(reviewTextThree);
		Assert.assertTrue(elementIsDisplayed(reviewTextThree));
		clickElementUsingJavaScript(reviewClose);
	}

	public void clickWriteAReviewFour()throws Exception {
		scrollDownUsingElement(writeAReviewFour);
		clickElementUsingJavaScript(writeAReviewFour);
		visibilityOf(reviewTextFour);
		Assert.assertTrue(elementIsDisplayed(reviewTextFour));
		clickElementUsingJavaScript(reviewClose);
	}

	public void clickBuyNowOne() throws Exception{
		scrollDownUsingElement(btnBuyNowOne);
		clickElementUsingJavaScript(btnBuyNowOne);
		visibilityOf(buyNowTextOne);
		Assert.assertTrue(elementIsDisplayed(buyNowTextOne));
		clickElementUsingJavaScript(buyNowClose);
	}

	public void clickBuyNowTwo() throws Exception{
		scrollDownUsingElement(btnBuyNowTwo);
		clickElementUsingJavaScript(btnBuyNowTwo);
		visibilityOf(buyNowTextTwo);
		Assert.assertTrue(elementIsDisplayed(buyNowTextTwo));
		clickElementUsingJavaScript(buyNowClose);
	}

	public void clickBuyNowThree() throws Exception{
		scrollDownUsingElement(btnBuyNowThree);
		clickElementUsingJavaScript(btnBuyNowThree);
		visibilityOf(buyNowTextThree);
		Assert.assertTrue(elementIsDisplayed(buyNowTextThree));
		clickElementUsingJavaScript(buyNowClose);
	}

	public void clickBuyNowFour() throws Exception{
		scrollDownUsingElement(btnBuyNowFour);
		clickElementUsingJavaScript(btnBuyNowFour);
		visibilityOf(buyNowTextFour);
		Assert.assertTrue(elementIsDisplayed(buyNowTextFour));
		clickElementUsingJavaScript(buyNowClose);
	}

	public void clickProductCardLearnMoreOne() throws Exception{
		visibilityOf(productCardLearnMoreOne);
		scrollDownUsingElement(productCardLearnMoreOne);
		clickElementUsingJavaScript(productCardLearnMoreOne);
	}

	public void clickProductCardLearnMoreTwo() throws Exception{
		visibilityOf(productCardLearnMoreTwo);
		scrollDownUsingElement(productCardLearnMoreTwo);
		clickElementUsingJavaScript(productCardLearnMoreTwo);
	}

	public void clickProductCardLearnMoreThree() throws Exception{
		visibilityOf(productCardLearnMoreThree);
		scrollDownUsingElement(productCardLearnMoreThree);
		clickElementUsingJavaScript(productCardLearnMoreThree);
	}

	public void clickProductCardLearnMoreFour() throws Exception{
		visibilityOf(productCardLearnMoreFour);
		scrollDownUsingElement(productCardLearnMoreFour);
		clickElementUsingJavaScript(productCardLearnMoreFour);
	}

	public void clickDentistRecommendedLearMore() throws Exception{
		visibilityOf(dentistRecommendedLearnMore);
		scrollDownUsingElement(dentistRecommendedLearnMore);
		clickElementUsingJavaScript(dentistRecommendedLearnMore);
	}

	public void clickSensitivityAndGumLearnMoreImg() throws Exception{
		visibilityOf(carouselActive);
		scrollDownUsingElement(carouselActive);
		//		if (carouselActive.isDisplayed()) {
		Assert.assertTrue(elementIsDisplayed(carouselActive));
		clickElementUsingJavaScript(sensitivityAndGumLearnMoreImg);
		//		}
	}

	public void clickRapiReliefLearnMoreImg() throws Exception{
		visibilityOf(carouselTwo);
		scrollDownUsingElement(carouselTwo);
		clickElementUsingJavaScript(carouselTwo);
		//		if (carouselActive.isDisplayed()) {
		Assert.assertTrue(elementIsDisplayed(carouselActive));
		clickElementUsingJavaScript(rapidReliefLearnMoreImg);
		//		}
	}

	public void clickSensitiveCareToothBrushLearnMoreImg() throws Exception{
		visibilityOf(carouselThree);
		scrollDownUsingElement(carouselThree);
		clickElementUsingJavaScript(carouselThree);
		//		if (carouselActive.isDisplayed()) {
		Assert.assertTrue(elementIsDisplayed(carouselActive));
		clickElementUsingJavaScript(sensitiveCareToothBrushLearnMoreImg);
		//		}
	}

	public void clickFindYourStore() throws Exception{
		scrollDownUsingElement(findYourStore);
		//		visibilityOf(findYourStore);
		clickElementUsingJavaScript(findYourStore);
	}

	public void clickGetYourCoupon() throws Exception {
		scrollDownUsingElement(getYourCoupon);
		//		visibilityOf(getYourCoupon);
		clickElementUsingJavaScript(getYourCoupon);
	}

	public void clickExploreOurProducts() throws Exception {
		scrollDownUsingElement(exploreOurProducts);
		//		visibilityOf(exploreOurProducts);
		clickElementUsingJavaScript(exploreOurProducts);
	}

	public void clickToothSensitivityYoutubeLink() throws Exception{
		scrollDownUsingElement(btnYoutube);
		clickElementUsingJavaScript(btnYoutube);
		visibilityOf(iframeYoutube);
		switchToFrameUsingElement(iframeYoutube);
		moveToElement(btnYoutubeIcon);
		actionClick(btnYoutubeIcon);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
		clickElementUsingJavaScript(btnYoutubeIcon);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();

		//		if (youtubePauseIcon.isDisplayed()) {
		//			Thread.sleep(5000);
		//			Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
		//			System.out.println("////////");
		//			actionClick(btnYoutubeIcon);
		//			System.out.println("Video is playing Successfully");
		//		}
		//		frameSwitchingToDefaultContent();
	}

	public String clickFindOut() throws Exception{
		scrollDownUsingElement(findOut);
		clickElementUsingJavaScript(findOut);
		String currentUrl = getCurrentUrl();
		return currentUrl;
	}

	public void clickReadOurTips() throws Exception {
		scrollDownUsingElement(readOurTips);
		clickElementUsingJavaScript(readOurTips);
	}

	public void clickCheckThemOut() throws Exception {
		scrollDownUsingElement(checkThemOut);
		clickElementUsingJavaScript(checkThemOut);
	}

	public void clickSensitivityDevelopYoutubeLink() throws Exception{
		waitForPageLoadJava();
		visibilityOf(btnYoutubeTwo);
		scrollDownUsingElement(btnYoutubeTwo);
		clickElementUsingJavaScript(btnYoutubeTwo);
		visibilityOf(iframeYoutube);
		switchToFrameUsingElement(iframeYoutube);
		moveToElement(btnYoutubeIcon);
		actionClick(btnYoutubeIcon);
		Thread.sleep(5000);
		Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
		clickElementUsingJavaScript(btnYoutubeIcon);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
	}

	public void clickCommonQuestionOne() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionOne);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveOne));
		clickElementUsingJavaScript(commonQuestionActiveOne);
		Assert.assertTrue(elementIsDisplayed(commonQuestionOne));
		if (commonQuestionOne.isDisplayed()) {
			System.out.println(getElementText(commonQuestionOne));
		}
	}

	public void clickCommonQuestionTwo() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionTwo);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionTwo));
		if (commonQuestionTwo.isDisplayed()) {
			System.out.println(getElementText(commonQuestionTwo));
		}
	}

	public void clickCommonQuestionThree() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionThree);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionThree));
		if (commonQuestionThree.isDisplayed()) {
			System.out.println(getElementText(commonQuestionThree));
		}
	}


	public void clickCommonQuestionFour() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelTwo);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionFour);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionFour));
		if (commonQuestionFour.isDisplayed()) {
			System.out.println(getElementText(commonQuestionFour));
		}
	}

	public void clickCommonQuestionFive() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelThree);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionFive);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionFive));
		if (commonQuestionFive.isDisplayed()) {
			System.out.println(getElementText(commonQuestionFive));
		}
	}

	public void clickCommonQuestionSix() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelFour);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionSix);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionSix));
		if (commonQuestionSix.isDisplayed()) {
			System.out.println(getElementText(commonQuestionSix));
		}
	}

	public void clickCommonQuestionSeven() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelFive);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionSeven);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionSeven));
		if (commonQuestionSeven.isDisplayed()) {
			System.out.println(getElementText(commonQuestionSeven));
		}
	}

	public void clickCommonQuestionEight() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelSix);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionEight);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveTwo));
		clickElementUsingJavaScript(commonQuestionActiveTwo);
		Assert.assertTrue(elementIsDisplayed(commonQuestionEight));
		if (commonQuestionEight.isDisplayed()) {
			System.out.println(getElementText(commonQuestionEight));
		}
	}

	public void clickCommonQuestionNine() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelSeven);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionNine);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveNine));
		clickElementUsingJavaScript(commonQuestionActiveNine);
		Assert.assertTrue(elementIsDisplayed(commonQuestionNine));
		if (commonQuestionNine.isDisplayed()) {
			System.out.println(getElementText(commonQuestionNine));
		}
	}

	public void clickCommonQuestionTen() throws Exception{
		scrollDownUsingElement(scroll);
		//		scrollDownUsingElement(commonQuestionCarosuelActive);
		clickElementUsingJavaScript(commonQuestionCarosuelEight);
		if (commonQuestionCarosuelActive.isDisplayed()) {
			clickElementUsingJavaScript(commonQuestionTen);
		}
		Assert.assertTrue(elementIsDisplayed(commonQuestionActiveNine));
		clickElementUsingJavaScript(commonQuestionActiveNine);
		Assert.assertTrue(elementIsDisplayed(commonQuestionTen));
		if (commonQuestionTen.isDisplayed()) {
			System.out.println(getElementText(commonQuestionTen));
		}
	}

	public void clickSeeMoreQuestions() throws Exception{
		scrollDownUsingElement(seeMoreQuestions);
		clickElementUsingJavaScript(seeMoreQuestions);
	}

}
