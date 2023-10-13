package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneShouldYouChangeToothpasteBrands extends BaseClass{
	public SensodyneShouldYouChangeToothpasteBrands() {
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
	
	@FindBy(xpath = "//a[text()='Dental Expressions']")
	private static WebElement DentalExpressions;
	
	@FindBy(xpath = "//a[text()='brushing style']")
	private static WebElement brushingStyle;
	
	@FindBy(xpath = "//a[text()='brushing twice a day for about two minutes']")
	private static WebElement BrushingTwiceADayForAboutTwoMinutes;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement Sensodyne;
	
	@FindBy(xpath = "//a[text()='Oral Health Tips We Should All Be Following']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Health Issues To Address Right Away']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Do Your Teeth Hurt When It's Cold Out?']")
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
	public void clickDentalExpressions() throws Exception {
		moveToElement(DentalExpressions);
		elementClick(DentalExpressions);
	}
	public void clickbrushingStyle() throws Exception {
		moveToElement(brushingStyle);
		elementClick(brushingStyle);
	}
	public void clickBrushingTwiceADayForAboutTwoMinutes() throws Exception {
		moveToElement(BrushingTwiceADayForAboutTwoMinutes);
		elementClick(BrushingTwiceADayForAboutTwoMinutes);
	}
	public void clickSensodyneRapidRelief() throws Exception {
		moveToElement(SensodyneRapidRelief);
		elementClick(SensodyneRapidRelief);
	}
	public void clickSensodyne() throws Exception {
		moveToElement(Sensodyne);
		elementClick(Sensodyne);
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
