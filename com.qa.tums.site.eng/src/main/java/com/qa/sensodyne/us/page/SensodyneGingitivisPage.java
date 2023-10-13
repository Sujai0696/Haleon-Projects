package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneGingitivisPage extends BaseClass{
	
	public SensodyneGingitivisPage() {
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
	
	@FindBy(xpath = "//a[text()='noticing blood often when you brush']")
	private static WebElement noticingtBlood;
	
	@FindBy(xpath = "//a[text()='gingivitis is treatable and reversible.']")
	private static WebElement gingitivis;
	
	@FindBy(xpath = "//a[text()='oral hygiene']")
	private static WebElement oralHygiene;
	
	@FindBy(xpath = "//a[text()='flossing at least once a day']")
	private static WebElement flossingAtLeast;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity & Gum']")
	private static WebElement sensodyneSensitivityGum;
	
	@FindBy(xpath = "//a[text()='Sensitivity & Gum Mint Toothpaste']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[text()='Sensitivity & Gum Fresh & Clean Toothpaste']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[text()='Sensitivity & Gum Whitening Toothpaste']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//img[@title='Sensodyne Sensitivity & Gum Mint Toothpaste']")
	private static WebElement productImageOne;
	
	@FindBy(xpath = "//img[@title='Sensodyne Sensitivity & Gum Fresh & Clean Toothpaste']")
	private static WebElement productImageTwo;
	
	@FindBy(xpath = "//img[@title='Sensodyne Sensitivity & Gum Whitening Toothpaste']")
	private static WebElement productImageThree;
	
	@FindBy(xpath = "(//span[@class='ps-button-label'])[1]")
	private static WebElement btnBuyNowOne;
	
	@FindBy(xpath = "(//span[@class='ps-button-label'])[2]")
	private static WebElement btnBuyNowTwo;
	
	@FindBy(xpath = "(//span[@class='ps-button-label'])[3]")
	private static WebElement btnBuyNowThree;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
	private static WebElement buyNowTextOne;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Clean & Fresh 3.4 oz']")
	private static WebElement buyNowTextTwo;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Whitening 3.4 oz']")
	private static WebElement buyNowTextThree;
	
	@FindBy(xpath = "(//a[@id='learnmore1'])[1]")
	private static WebElement productCardLearnMoreOne;

	@FindBy(xpath = "(//a[@id='learnmore1'])[2]")
	private static WebElement productCardLearnMoreTwo;

	@FindBy(xpath = "(//a[@id='learnmore1'])[3]")
	private static WebElement productCardLearnMoreThree;
	
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

	@FindBy(xpath = "//a[text()='Is It a Cavity or Sensitive Teeth?']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='That Shock of Pain Could Be Tooth Sensitivity']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Two Benefits. One Toothpaste.']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Bleeding Gums and Sensitivity']")
	private static WebElement relatedArticleFour;
	
	@FindBy(xpath = "//a[text()='How to Treat Gingivitis']")
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
	
	
	public void clickNoticingBlood() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(noticingtBlood);
		clickElementUsingJavaScript(noticingtBlood);
		pageLoad();
	}
	
	public void clickGingitivis() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(gingitivis);
		clickElementUsingJavaScript(gingitivis);
		pageLoad();
	}
	
	public void clickOralHygiene() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(oralHygiene);
		clickElementUsingJavaScript(oralHygiene);
		pageLoad();
	}
	
	public void clickFlossingAtLeast() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(flossingAtLeast);
		clickElementUsingJavaScript(flossingAtLeast);
		pageLoad();
	}
	
	public void clickSensodyneSensitivityGum() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneSensitivityGum);
		clickElementUsingJavaScript(sensodyneSensitivityGum);
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
