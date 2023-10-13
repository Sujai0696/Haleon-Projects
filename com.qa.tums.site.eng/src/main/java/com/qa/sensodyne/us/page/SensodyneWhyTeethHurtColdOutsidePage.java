package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneWhyTeethHurtColdOutsidePage extends BaseClass{
	
	public SensodyneWhyTeethHurtColdOutsidePage() {
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
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Back to the article list']")
	private static WebElement backToArticleList;
	
	@FindBy(xpath = "//a[text()='dental pain']")
	private static WebElement ifYourTeethLinkOne;
	
	@FindBy(xpath = "//a[text()='Dr. Gregg Michael Festa, DDS']")
	private static WebElement ifYourTeethLinkTwo;
	
	@FindBy(xpath = "//a[text()='gum recession']")
	private static WebElement ifYourTeethLinkThree;
	
	@FindBy(xpath = "//a[normalize-space()='According to a study of US adults 25+']")
	private static WebElement livingWithToothSensitivityLinkOne;
	
	@FindBy(xpath = "//a[text()='tooth sensitivity']")
	private static WebElement livingWithToothSensitivityLinkTwo;
	
	@FindBy(xpath = "//a[text()='brushing too hard or brushing with a hard-bristled toothbrush']")
	private static WebElement livingWithToothSensitivityLinkThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief toothpaste']")
	private static WebElement howToFixToothSensitivity;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be A Bad Thing?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement relatedArticleFour;
	
	
	
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
	
	public void clickBackToTheArticleList() throws Exception{
		scrollDownUsingElement(backToArticleList);
		clickElementUsingJavaScript(backToArticleList);
	}

	public void clickIfYourTeethLinkOne() throws Exception{
		scrollDownUsingElement(ifYourTeethLinkOne);
		clickElementUsingJavaScript(ifYourTeethLinkOne);
		waitForPageLoadJava();
	}
	
	public void clickIfYourTeethLinkTwo() throws Exception{
		scrollDownUsingElement(ifYourTeethLinkTwo);
		clickElementUsingJavaScript(ifYourTeethLinkTwo);
		waitForPageLoadJava();
	}
	
	public void clickIfYourTeethLinkThree() throws Exception{
		scrollDownUsingElement(ifYourTeethLinkThree);
		clickElementUsingJavaScript(ifYourTeethLinkThree);
		waitForPageLoadJava();
	}
	
	public void clickLivingWithToothSensitivityLinkOne() throws Exception{
		scrollDownUsingElement(livingWithToothSensitivityLinkOne);
		clickElementUsingJavaScript(livingWithToothSensitivityLinkOne);
		waitForPageLoadJava();
	}
	
	public void clickLivingWithToothSensitivityLinkTwo() throws Exception{
		scrollDownUsingElement(livingWithToothSensitivityLinkTwo);
		clickElementUsingJavaScript(livingWithToothSensitivityLinkTwo);
		waitForPageLoadJava();
	}
	
	public void clickLivingWithToothSensitivityLinkThree() throws Exception{
		scrollDownUsingElement(livingWithToothSensitivityLinkThree);
		clickElementUsingJavaScript(livingWithToothSensitivityLinkThree);
		waitForPageLoadJava();
	}
	
	public void clickHowToFixToothSensitivityLink() throws Exception{
		scrollDownUsingElement(howToFixToothSensitivity);
		clickElementUsingJavaScript(howToFixToothSensitivity);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleOne() throws Exception{
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleThree() throws Exception{
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleFour() throws Exception{
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
		waitForPageLoadJava();
	}
}
