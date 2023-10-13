package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateCalciumAndCalciumCarbonatePage extends BaseClass{
	
	public CaltrateCalciumAndCalciumCarbonatePage() {
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
	
	
	
	
	@FindBy(xpath = "//h4[normalize-space()='CALCIUM CARBONATE VS CALCIUM CITRATE']//ancestor::div[@class='box component section p-m-b-1 anchor-box first odd col-xs-12']")
	private static WebElement readMoreOne;
	
	@FindBy(xpath = "//h4[normalize-space()='CALCIUM & VITAMIN D: SUPPORTING YOUR BONE HEALTH']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreTwo;
	
	@FindBy(xpath = "//h4[normalize-space()='THE SURGEON GENERAL’S REPORT ON BONE HEALTH']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreThree;
	
	@FindBy(xpath = "//h4[normalize-space()='OSTEOPOROSIS: HELP REDUCE THE RISK']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreFour;
	
	@FindBy(xpath = "//h4[normalize-space()='ARUGULA SALAD']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreFive;
	
	@FindBy(xpath = "//h4[normalize-space()='SUMMER STRONG SHAKE']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreSix;
	
	@FindBy(xpath = "//h4[normalize-space()='SALMON CAKES']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreSeven;
	
	@FindBy(xpath = "//h4[normalize-space()='KALE CHIPS']//ancestor::div[@class='box component section p-m-b-1 even col-xs-12']")
	private static WebElement readMoreEight;
	
	@FindBy(xpath = "//a[@href='/bone-health-central/tools/caltrate-beyond-bones/']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreNine;
	
	@FindBy(xpath = "//h4[normalize-space()='CHEESY CAULIFLOWER SOUP']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreTen;
	
	@FindBy(xpath = "//h4[normalize-space()='THE STORY OF YOUR BONES: CALCIUM AT EVERY AGE']//ancestor::div[@class='box component section p-d-b-2 p-m-b-1 anchor-box odd last col-xs-12']")
	private static WebElement readMoreEleven;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Bone Health Central']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item odd last is-current ']//self::li[normalize-space()='Calcium and Calcium Carbonate']")
	private static WebElement breadcrumbThree;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickReadMoreEleven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMoreEleven);
		clickElementUsingJavaScript(readMoreEleven);
	}
	
	
	
	public void clickBreadcrumbOne ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
	}
	
	public void clickBreadcrumbTwo ()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
	public void textBreadcrumbThree ()throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
			System.out.println("Breadcrumb Three is verified");
		} else {
			throw new Exception("Bredcrumb Three is not presented in the page");
		}
	}
	

}
