package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneDoYouNeedToFloss extends BaseClass{
	public SensodyneDoYouNeedToFloss() {
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

	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement BackToTheArticleList;
	
	@FindBy(xpath = "//a[text()='oral health care']")
	private static WebElement OralHealthCare;
	
	@FindBy(xpath = "//a[text()='brushing']")
	private static WebElement Brushing;
	
	@FindBy(xpath = "//a[text()='Sensodyne site']")
	private static WebElement SensodyneSite;
	
	@FindBy(xpath = "//a[text()='A Dentist’s Tips on Flossing']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='What To Do About Tooth Sensitivity']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Unusual Resolutions To Make This Year']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Fall Treats And Your Oral Health']")
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
	public void clickOnBackToTheArticleList() throws Exception {
		moveToElement(BackToTheArticleList);
		elementClick(BackToTheArticleList);
	}
	public void clickOralHealthCare() throws Exception {
		moveToElement(OralHealthCare);
		elementClick(OralHealthCare);
	}
	public void clickBrushing() throws Exception {
		moveToElement(Brushing);
		elementClick(Brushing);
	}
	public void clickSensodyneSite() throws Exception {
		moveToElement(SensodyneSite);
		elementClick(SensodyneSite);
	}
	public void clickrelatedArticleOne() throws Exception {
		moveToElement(relatedArticleOne);
		elementClick(relatedArticleOne);
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
