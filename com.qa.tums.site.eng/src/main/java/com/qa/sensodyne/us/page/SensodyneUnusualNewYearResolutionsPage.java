package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneUnusualNewYearResolutionsPage extends BaseClass{
	
	public SensodyneUnusualNewYearResolutionsPage() {
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
	
	@FindBy(xpath = "//a[text()='recommends that your toothbrush has soft bristles']")
	private static WebElement takeControlOfToothSensitivityLinkOne;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief Toothpaste']")
	private static WebElement takeControlOfToothSensitivityLinkTwo;
	
	@FindBy(xpath = "//a[text()='improve overall health']")
	private static WebElement teachYourselfSomethingLink;
	
	@FindBy(xpath = "//a[text()='can mess up melatonin production']")
	private static WebElement readABookLink;
	
	@FindBy(xpath = "//div[@class='image component section zglazyload related-box col-xs-12 RelatedArticle3 fixed-component']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//div[@class='image component section zglazyload related-box col-xs-12 RelatedArticle1 fixed-component']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//div[@class='image component section zglazyload related-box col-xs-12 RelatedArticle2 fixed-component']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//div[@class='image component section zglazyload related-box col-xs-12 RelatedArticle4 fixed-component']")
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
	
	public void clickTakeControlOfToothSensitivityLinkOne() throws Exception{
		scrollDownUsingElement(takeControlOfToothSensitivityLinkOne);
		clickElementUsingJavaScript(takeControlOfToothSensitivityLinkOne);
		waitForPageLoadJava();
	}
	
	public void clickTakeControlOfToothSensitivityLinkTwo() throws Exception{
		scrollDownUsingElement(takeControlOfToothSensitivityLinkTwo);
		clickElementUsingJavaScript(takeControlOfToothSensitivityLinkTwo);
		waitForPageLoadJava();
	}
	
	
	public void clickTeachYourselfSomethingLink() throws Exception{
		scrollDownUsingElement(teachYourselfSomethingLink);
		clickElementUsingJavaScript(teachYourselfSomethingLink);
		waitForPageLoadJava();
	}
	
	public void clickReadABookLink() throws Exception{
		scrollDownUsingElement(readABookLink);
		clickElementUsingJavaScript(readABookLink);
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
