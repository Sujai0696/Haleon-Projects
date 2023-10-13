package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneSensitivityToColdPage extends BaseClass{
	
	public SensodyneSensitivityToColdPage() {
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
	
	@FindBy(xpath = "//strong[text()='tooth enamel can wear down']")
	private static WebElement toothEnamel;
	
	@FindBy(xpath = "//a[text()='tooth sensitivity']")
	private static WebElement toothSensitivity;
	
	@FindBy(xpath = "//div[@class='title-content']")
	private static WebElement btnYoutube;
	
	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement youtubePauseIcon;
	
	@FindBy(xpath = "//a[text()='ingredients']")
	private static WebElement ingredients;
	
	@FindBy(xpath = "//a[text()='Find which Sensodyne toothpaste is right for you']")
	private static WebElement findWhichSensodyne;
	
	@FindBy(xpath = "//a[text()='Sensodyne Repair & Protect Deep Repair Whitening Toothpaste']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Whitening Toothpaste']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[text()='Sensitivity & Gum Whitening Toothpaste']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening Toothpaste']")
	private static WebElement productTextFour;
	
	@FindBy(xpath = "//img[@title='Sensodyne Repair & Protect Deep Repair Whitening Toothpaste']")
	private static WebElement productImageOne;
	
	@FindBy(xpath = "//img[@title='Sensodyne Rapid Relief Whitening Toothpaste']")
	private static WebElement productImageTwo;
	
	@FindBy(xpath = "//img[@title='Sensodyne Sensitivity & Gum Whitening Toothpaste']")
	private static WebElement productImageThree;
	
	@FindBy(xpath = "//img[@title='Sensodyne Extra Whitening Toothpaste']")
	private static WebElement productImageFour;
	
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
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, Whitening 3.4 oz']")
	private static WebElement buyNowTextOne;
	
	@FindBy(xpath = "//h2[text()='Rapid Relief, Whitening 3.4 oz']")
	private static WebElement buyNowTextTwo;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Whitening 3.4 oz']")
	private static WebElement buyNowTextThree;
	
	@FindBy(xpath = "//h2[text()='Extra Whitening, 4.0 oz']")
	private static WebElement buyNowTextFour;
	
	@FindBy(xpath = "(//a[@id='learnmore1'])[1]")
	private static WebElement productCardLearnMoreOne;

	@FindBy(xpath = "(//a[@id='learnmore1'])[2]")
	private static WebElement productCardLearnMoreTwo;

	@FindBy(xpath = "(//a[@id='learnmore1'])[3]")
	private static WebElement productCardLearnMoreThree;

	@FindBy(xpath = "(//a[@id='learnmore1'])[4]")
	private static WebElement productCardLearnMoreFour;
	
	
	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Hot']")
	private static WebElement radioButtonOne;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Cold']")
	private static WebElement radioButtonTwo;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Sweet']")
	private static WebElement radioButtonThree;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Sour']")
	private static WebElement radioButtonFour;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Spicy']")
	private static WebElement radioButtonFive;

	@FindBy(xpath = "//div[@class='gigya-multi-choice-item']//following::label[text()='Other']")
	private static WebElement radioButtonSix;

	@FindBy(xpath = "//input[@class='gigya-input-radio fd-radio gigya-valid']")
	private static WebElement radioActive;

	@FindBy(xpath = "(//input[@class='gigya-input-text'])[2]")
	private static WebElement txtEmailAddress;

	@FindBy(xpath = "(//input[@class='gigya-input-submit'])[2]")
	private static WebElement btnSubmit;

	@FindBy(xpath = "//input[@disabled='true']")
	private static WebElement submitVerification;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Tips for Tooth Sensitivity to Hot']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement relatedArticleFour;
	
	@FindBy(xpath = "//a[text()='How to Deal with Tooth Sensitivity to Cold']")
	private static WebElement breadCrumb;
	
	
	
	public void clickCookieBtn() throws Exception {
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
	
	
	public void clickToothEnamel() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(toothEnamel);
		clickElementUsingJavaScript(toothEnamel);
		pageLoad();
	}
	
	public void clickToothSensitivity() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(toothSensitivity);
		clickElementUsingJavaScript(toothSensitivity);
		pageLoad();
	}
	
	public void clickToothSensitivityYoutubeLink() throws Exception{
		waitForPageLoadJava();
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
		pageLoad();
	}
	
	public void clickIngredients() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ingredients);
		clickElementUsingJavaScript(ingredients);
		pageLoad();
	}
	
	public void clickFindWhichSensodyne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findWhichSensodyne);
		clickElementUsingJavaScript(findWhichSensodyne);
		pageLoad();
	}
	
	
	public void clickProductTextOne() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productTextOne);
		scrollDownUsingElement(productTextOne);
		clickElementUsingJavaScript(productTextOne);
		pageLoad();
	}

	public void clickProductTextTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productTextTwo);
		scrollDownUsingElement(productTextTwo);
		clickElementUsingJavaScript(productTextTwo);
		pageLoad();
	}

	public void clickProductTextThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productTextThree);
		scrollDownUsingElement(productTextThree);
		clickElementUsingJavaScript(productTextThree);
		pageLoad();
	}

	public void clickProductTextFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productTextFour);
		scrollDownUsingElement(productTextFour);
		clickElementUsingJavaScript(productTextFour);
		pageLoad();
	}
	
	public void clickProductImageOne() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productImageOne);
		scrollDownUsingElement(productImageOne);
		clickElementUsingJavaScript(productImageOne);
		pageLoad();
		
	}

	public void clickProductImageTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productImageTwo);
		scrollDownUsingElement(productImageTwo);
		clickElementUsingJavaScript(productImageTwo);
		pageLoad();
	}

	public void clickProductImageThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productImageThree);
		scrollDownUsingElement(productImageThree);
		clickElementUsingJavaScript(productImageThree);
		pageLoad();
	}

	public void clickProductImageFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productImageFour);
		scrollDownUsingElement(productImageFour);
		clickElementUsingJavaScript(productImageFour);
		pageLoad();
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
		waitForPageLoadJava();
		visibilityOf(productCardLearnMoreOne);
		scrollDownUsingElement(productCardLearnMoreOne);
		clickElementUsingJavaScript(productCardLearnMoreOne);
		pageLoad();
	}

	public void clickProductCardLearnMoreTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productCardLearnMoreTwo);
		scrollDownUsingElement(productCardLearnMoreTwo);
		clickElementUsingJavaScript(productCardLearnMoreTwo);
		pageLoad();
	}

	public void clickProductCardLearnMoreThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productCardLearnMoreThree);
		scrollDownUsingElement(productCardLearnMoreThree);
		clickElementUsingJavaScript(productCardLearnMoreThree);
		pageLoad();
	}

	public void clickProductCardLearnMoreFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(productCardLearnMoreFour);
		scrollDownUsingElement(productCardLearnMoreFour);
		clickElementUsingJavaScript(productCardLearnMoreFour);
		pageLoad();
	}
	
	public void clickRadioButtonOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonOne);
		clickElementUsingJavaScript(radioButtonOne);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
		pageLoad();
	}

	public void clickRadioButtonTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonTwo);
		clickElementUsingJavaScript(radioButtonTwo);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonThree);
		clickElementUsingJavaScript(radioButtonThree);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
		pageLoad();
	}

	public void clickRadioButtonFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonFour);
		clickElementUsingJavaScript(radioButtonFour);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
		pageLoad();
	}

	public void clickRadioButtonFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonFive);
		clickElementUsingJavaScript(radioButtonFive);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
		pageLoad();
	}

	public void clickRadioButtonSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(radioButtonSix);
		clickElementUsingJavaScript(radioButtonSix);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
		pageLoad();
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
		pageLoad();
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
		waitForPageLoadJava();
		pageLoad();
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
		pageLoad();
	}
	
	public void clickRelatedArticleFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
		pageLoad();
	}
	
	public void clickBreadCrumb() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumb);
		clickElementUsingJavaScript(breadCrumb);
		pageLoad();
	}
}
