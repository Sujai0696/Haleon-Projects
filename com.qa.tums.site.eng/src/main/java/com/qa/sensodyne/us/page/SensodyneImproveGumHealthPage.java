package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneImproveGumHealthPage extends BaseClass{
	
	public SensodyneImproveGumHealthPage() {
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
	
	@FindBy(xpath = "//a[text()='Plaque is the sticky film of bacteria']")
	private static WebElement plaqueLink;
	
	@FindBy(xpath = "//a[text()='gingivitis']")
	private static WebElement gingivitisLink;
	
	@FindBy(xpath = "//a[text()='tooth sensitivity.']")
	private static WebElement toothSensitivity;
	
	@FindBy(xpath = "//a[text()='daily oral hygiene.']")
	private static WebElement dailyOralHygiene;
	
	@FindBy(xpath = "//a[text()='tooth sensitivity']")
	private static WebElement toothSensitivityTwo;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity & Gum']")
	private static WebElement sensodyneSensitivityGum;
	
	@FindBy(xpath = "//a[text()='two benefits, one toothpaste.']")
	private static WebElement twoBenefits;
	
	@FindBy(xpath = "//a[text()='Bleeding Gums and Sensitivity']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Sensitivity After a Trip to the Dentist']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Two Benefits. One Toothpaste.']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
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
	
	public void clickPlaqueLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(plaqueLink);
		clickElementUsingJavaScript(plaqueLink);
		pageLoad();
	}
	
	public void clickGingivitisLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(gingivitisLink);
		clickElementUsingJavaScript(gingivitisLink);
		pageLoad();
	}
	
	public void clickToothSensitivity() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(toothSensitivity);
		clickElementUsingJavaScript(toothSensitivity);
		pageLoad();
	}
	
	public void clickDailyOralHygiene() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(dailyOralHygiene);
		clickElementUsingJavaScript(dailyOralHygiene);
		pageLoad();
	}
	
	public void clickToothSensitivityTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(toothSensitivityTwo);
		clickElementUsingJavaScript(toothSensitivityTwo);
		pageLoad();
	}
	
	public void clickSensodyneSensitivityGum() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneSensitivityGum);
		clickElementUsingJavaScript(sensodyneSensitivityGum);
		pageLoad();
	}
	
	public void clickTwoBenefits() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(twoBenefits);
		clickElementUsingJavaScript(twoBenefits);
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
	
}
