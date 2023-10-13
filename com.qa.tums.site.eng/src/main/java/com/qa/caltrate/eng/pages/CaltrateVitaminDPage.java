package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateVitaminDPage extends BaseClass{
	
	public CaltrateVitaminDPage() {
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
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Calcium Supplements Articles']")
	private static WebElement featuredArticleThree;
	
	@FindBy(xpath = "//a[text()='READ MORE']//self::a[@href='/bone-health-central/articles/trust-calcium-supplements-help-fill-your-nutritional-gap/']")
	private static WebElement featuredArticleFour;
	
	
	
	@FindBy(xpath = "//h4[normalize-space()='THE STORY OF YOUR BONES: CALCIUM AT EVERY AGE']//ancestor::div[@class='box component section p-m-b-1 anchor-box first odd col-xs-12']")
	private static WebElement readMoreOne;
	
	@FindBy(xpath = "//h4[normalize-space()='CALCIUM & VITAMIN D: SUPPORTING YOUR BONE HEALTH']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreTwo;
	
	@FindBy(xpath = "//h4[normalize-space()='OSTEOPOROSIS: HELP REDUCE THE RISK']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreThree;
	
	@FindBy(xpath = "//h4[normalize-space()='THE SURGEON GENERAL’S REPORT ON BONE HEALTH']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreFour;
	
	@FindBy(xpath = "//h4[normalize-space()='VITAMIN D: WHAT YOU NEED TO KNOW']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreFive;
	
	@FindBy(xpath = "//h4[normalize-space()='SUMMER STRONG SHAKE']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreSix;
	
	@FindBy(xpath = "//h4[normalize-space()='SALMON CAKES']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreSeven;
	
	@FindBy(xpath = "//a[@href='/bone-health-central/tools/caltrate-beyond-bones/']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreEight;
	
	@FindBy(xpath = "//h4[normalize-space()='VITAMIN D DEFICIENCY']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreNine;
	
	@FindBy(xpath = "//a[@href='/bone-health-central/articles/benefits-vitamind3/']//ancestor::div[@class='box component section p-m-b-1 anchor-box even last col-xs-12']")
	private static WebElement readMoreTen;
	
	
	
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
	
	public void clickReadMoreThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreThree);
		clickElementUsingJavaScript(readMoreThree);
	}
	
	public void clickReadMoreFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreFour);
		clickElementUsingJavaScript(readMoreFour);
	}
	
	public void clickReadMoreFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreFive);
		clickElementUsingJavaScript(readMoreFive);
	}
	
	public void clickReadMoreSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreSix);
		clickElementUsingJavaScript(readMoreSix);
	}
	
	public void clickReadMoreSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreSeven);
		clickElementUsingJavaScript(readMoreSeven);
	}
	
	public void clickReadMoreEight() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreEight);
		clickElementUsingJavaScript(readMoreEight);
	}
	
	public void clickReadMoreNine() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreNine);
		clickElementUsingJavaScript(readMoreNine);
	}
	
	public void clickReadMoreTen() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreTen);
		clickElementUsingJavaScript(readMoreTen);
	}

}
