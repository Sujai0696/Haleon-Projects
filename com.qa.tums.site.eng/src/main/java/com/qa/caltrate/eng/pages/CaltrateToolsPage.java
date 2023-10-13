package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateToolsPage extends BaseClass{
	
	public CaltrateToolsPage() {
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
	
	
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Calcium and Calcium Carbonate']")
	private static WebElement featuredArticleOne;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Vitamin D']")
	private static WebElement featuredArticleTwo;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Calcium Supplements']")
	private static WebElement featuredArticleThree;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Interactive Tools']")
	private static WebElement featuredArticleFour;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m even last col-xs-12']//a[@href='/bone-health-central/tools/calcium-at-every-age/']")
	private static WebElement featuredArticleFive;
	
	
	@FindBy(xpath = "//h4[normalize-space()='CALTRATE FOR YOUR BONES AND BEYOND']//ancestor::div[contains(@class,'even last col-xs-12')]")
	private static WebElement readMoreOne;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
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
		waitForPageLoadJava();
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
	
	
	public void clickFeaturedArticleOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(featuredArticleOne);
		clickElementUsingJavaScript(featuredArticleOne);
	}
	
	public void clickFeaturedArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(featuredArticleTwo);
		clickElementUsingJavaScript(featuredArticleTwo);
	}
	
	public void clickFeaturedArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(featuredArticleThree);
		clickElementUsingJavaScript(featuredArticleThree);
	}
	
	public void clickFeaturedArticleFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(featuredArticleFour);
		clickElementUsingJavaScript(featuredArticleFour);
	}
	
	public void clickFeaturedArticleFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(featuredArticleFive);
		clickElementUsingJavaScript(featuredArticleFive);
	}
	
	public void clickReadMoreOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreOne);
		clickElementUsingJavaScript(readMoreOne);
	}

}

