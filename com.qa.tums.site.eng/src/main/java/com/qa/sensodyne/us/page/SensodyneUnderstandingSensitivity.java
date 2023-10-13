package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneUnderstandingSensitivity extends BaseClass {
	public SensodyneUnderstandingSensitivity() {
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

	@FindBy(xpath = "(//a[@title='Understanding Sensitivity'])[1]")
	private static WebElement UnderstandingSensitivity;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[1]")
	private static WebElement HomeIcon_Bread;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even last is-current ']//a)[1]")
	private static WebElement UnderstandingSestivity_Bread;
	
	@FindBy(xpath = "//a[text()='whitening sensitive teeth']")
	private static WebElement WhiteningSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpastes for tooth sensitivity relief']")
	private static WebElement SensodyneToothpastesForToothSensitivityRelief;
	
	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensodyne Repair & Protect Deep Repair Whitening Toothpaste']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensodyne Rapid Relief Whitening Toothpaste']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensitivity & Gum Whitening Toothpaste']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//p[text()='Sensodyne']//following::a[text()='Sensodyne Extra Whitening Toothpaste']")
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
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Extra Fresh']")
	private static WebElement SensodyneRapidReliefExtraFresh;

	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Extra Fresh']")
	private static WebElement SensodyneRapidReliefMint;
	
	@FindBy(xpath = "(//a[text()='Terms & Conditions'])[1]")
	private static WebElement TermsCondition;
	
	@FindBy(xpath = "(//a[text()='Privacy Policy'])[1]")
	private static WebElement PrivacyPolicy;
	
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
	
	@FindBy(xpath = "//a[text()='Take the Quiz']")
	private static WebElement TakeTheQuiz;
	
	@FindBy(xpath = "//a[text()='where to buy Sensodyne toothpaste']")
	private static WebElement WhereToBuySensodyneToothpaste;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Products'])")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Symptoms of Sensitive Teeth']")
	private static WebElement relatedArticleFour;

	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() throws Exception {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
//			visibilityOf(gigyaClose);
//			Assert.assertTrue(elementIsDisplayed(gigyaClose));
		} catch (NoSuchElementException e) {

		}
	}
	public void clickOnUnderstandingSensitivity() throws Exception {
		moveToElement(UnderstandingSensitivity);
		elementClick(UnderstandingSensitivity);
	}

	public void clickHomeIcon() throws Exception {
		moveToElement(HomeIcon_Bread);
		clickElementUsingJavaScript(HomeIcon_Bread);
	}
	public void clickUnderstandingSensitivity_bread() throws Exception {
		moveToElement(UnderstandingSestivity_Bread);
		clickElementUsingJavaScript(HomeIcon_Bread);
	}
	public void clickWhiteningSensitiveTeeth() throws Exception {
		moveToElement(WhiteningSensitiveTeeth);
		clickElementUsingJavaScript(WhiteningSensitiveTeeth);
	}
	public void clickSensodyneToothpastesForToothSensitivityRelief() throws Exception {
		moveToElement(SensodyneToothpastesForToothSensitivityRelief);
		clickElementUsingJavaScript(SensodyneToothpastesForToothSensitivityRelief);
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
	public void clickSensodyneRapidReliefMint() throws Exception {
		moveToElement(SensodyneRapidReliefMint);
		clickElementUsingJavaScript(SensodyneRapidReliefMint);
	}
	public void clickSensodyneRapidReliefExtraFresh() throws Exception {
		moveToElement(SensodyneRapidReliefExtraFresh);
		clickElementUsingJavaScript(SensodyneRapidReliefExtraFresh);
	}
	public void clickTakeTheQuiz() throws Exception {
		moveToElement(TakeTheQuiz);
		clickElementUsingJavaScript(TakeTheQuiz);
	}
	public void clickRadioButtonOne() throws Exception{
		scrollDownUsingElement(radioButtonOne);
		clickElementUsingJavaScript(radioButtonOne);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonTwo() throws Exception{
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
		scrollDownUsingElement(radioButtonThree);
		clickElementUsingJavaScript(radioButtonThree);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonFour() throws Exception{
		scrollDownUsingElement(radioButtonFour);
		clickElementUsingJavaScript(radioButtonFour);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonFive() throws Exception{
		scrollDownUsingElement(radioButtonFive);
		clickElementUsingJavaScript(radioButtonFive);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}

	public void clickRadioButtonSix() throws Exception{
		scrollDownUsingElement(radioButtonSix);
		clickElementUsingJavaScript(radioButtonSix);
		Assert.assertTrue(elementIsDisplayed(radioActive));
		if (txtEmailAddress.isDisplayed()) {
			elementSendKeys(txtEmailAddress, "abc@gmail.com");
		}
		clickElementUsingJavaScript(btnSubmit);
		Assert.assertTrue(elementIsDisplayed(submitVerification));
	}
	public void clickWhereToBuySensodyneToothpaste() throws Exception {
		moveToElement(WhereToBuySensodyneToothpaste);
		clickElementUsingJavaScript(WhereToBuySensodyneToothpaste);
	}
	public void clickRealatedArticleOne() throws Exception{
		visibilityOf(relatedArticleOne);
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
	}
	
	public void clickRealatedArticleTwo() throws Exception{
		visibilityOf(relatedArticleTwo);
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
	}
	
	public void clickRealatedArticleThree() throws Exception{
		visibilityOf(relatedArticleThree);
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
	}
	
	public void clickRealatedArticleFour() throws Exception{
		visibilityOf(relatedArticleFour);
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
	}


}
