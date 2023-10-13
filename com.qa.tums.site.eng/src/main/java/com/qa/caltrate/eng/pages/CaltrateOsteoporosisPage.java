package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateOsteoporosisPage extends BaseClass{
	
	public CaltrateOsteoporosisPage() {
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
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Osteoporosis']")
	private static WebElement featuredArticleThree;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Articles']")
	private static WebElement featuredArticleFour;
	
	@FindBy(xpath = "//*[text()='READ MORE']//self::a[@href='/bone-health-central/articles/calcium-vitamin-d-supporting-your-bone-health/']")
	private static WebElement featuredArticleFive;
	
	
	
	
	@FindBy(xpath = "//h4[normalize-space()='OSTEOPOROSIS: HELP REDUCE THE RISK']//ancestor::div[@class='box component section p-m-b-1 anchor-box first odd col-xs-12']")
	private static WebElement readMoreOne;
	
	@FindBy(xpath = "//h4[normalize-space()='THE STORY OF YOUR BONES: CALCIUM AT EVERY AGE']//ancestor::div[@class='box component section p-d-b-2 p-m-b-1 anchor-box even last col-xs-12']")
	private static WebElement readMoreTwo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreTwo);
		clickElementUsingJavaScript(readMoreTwo);
	}
	
	

}
