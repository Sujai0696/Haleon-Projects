package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneMouthwashForSensitiveTeeth extends BaseClass {
	public SensodyneMouthwashForSensitiveTeeth() {
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

	@FindBy(xpath = "//a[text()='Sensodyne Sensitive Care Toothbrush']")
	private static WebElement SensodyneSensitiveCareToothbrush;
	
	@FindBy(xpath = "//a[text()='toothpaste for sensitive teeth.']")
	private static WebElement toothpasteforsensitiveteeth;
	
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
		} catch (NoSuchElementException e) {

		}
	}
	public void clickOnSensodyneSensitiveCareToothbrush() throws Exception {
		moveToElement(SensodyneSensitiveCareToothbrush);
		elementClick(SensodyneSensitiveCareToothbrush);
	}
	public void clicktoothpasteforsensitiveteeth() throws Exception {
		moveToElement(toothpasteforsensitiveteeth);
		elementClick(toothpasteforsensitiveteeth);
	}
	public void clickWhereToBuySensodyneToothpaste() throws Exception {
		moveToElement(WhereToBuySensodyneToothpaste);
		elementClick(WhereToBuySensodyneToothpaste);
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
