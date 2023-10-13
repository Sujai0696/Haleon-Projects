package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneBleedingGumsAndSensitivityPage  extends BaseClass{

	public SensodyneBleedingGumsAndSensitivityPage() {
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

	@FindBy(xpath = "//a[text()='A twinge of pain']")
	private static WebElement twingeOfPain;

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

	@FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum'])[1]")
	private static WebElement sensodyneSensitivityAndGum;

	@FindBy(xpath = "//*[@href='/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/']//self::a[text()='Learn More']")
	private static WebElement learnMore;
	
	@FindBy(xpath = "(//a[text()='Sensodyne Sensitivity & Gum'])[2]")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "(//a[@href='/en-us/oral-health-tips/gum-health/sensitivity-and-gum-ingredients/'])[3]")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Symptoms of Sensitive Teeth']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Oral Health Tips']")
	private static WebElement relatedArticleFour;
	
	


	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(cookieClose));
		} catch (Exception e) {
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



	public void clickTwingeOfPain() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(twingeOfPain);
		clickElementUsingJavaScript(twingeOfPain);
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
	}

	public void clickSensodyneSensitivityAndGumLink()throws Exception {
		visibilityOf(sensodyneSensitivityAndGum);
		scrollDownUsingElement(sensodyneSensitivityAndGum);
		clickElementUsingJavaScript(sensodyneSensitivityAndGum);
	}

	public void clickLearnMoreLink() throws Exception {
		scrollDownUsingElement(learnMore);
		clickElementUsingJavaScript(learnMore);
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

