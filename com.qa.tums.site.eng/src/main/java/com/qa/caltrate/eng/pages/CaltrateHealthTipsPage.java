package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateHealthTipsPage extends BaseClass{
	
	public CaltrateHealthTipsPage() {
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
	
	@FindBy(xpath = "//div[@class='box component section flex cols-d-2 cols-m-1 flex-row max-content-width p-d-y-2 p-m-1 s-d-3 anchor-box even col-xs-12']")
	private static WebElement featuredArticleOne;
	
	@FindBy(xpath = "//span[@class='external']//ancestor::a[normalize-space()='Health Tips']")
	private static WebElement featuredArticleTwo;
	
	@FindBy(xpath = "//a[@href='/bone-health-central/health-tips/add-cup-milk-your-favorite-soup-boost-calcium/']")
	private static WebElement featuredArticleThree;
	
	
	
	
	@FindBy(xpath = "//h4[normalize-space()='WORK YOUR UPPER BODY WITH YARD WORK!']//ancestor::div[@class='box component section p-m-b-1 anchor-box first odd col-xs-12']")
	private static WebElement readMoreOne;
	
	@FindBy(xpath = "//h4[normalize-space()='ACTIVATE YOUR MUSCLES WITH ANKLE WEIGHTS DURING A POWER WALK!']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreTwo;
	
	@FindBy(xpath = "//h4[normalize-space()='PUMPKIN SEEDS CAN HELP SUPPORT BONE HEALTH!']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreThree;
	
	@FindBy(xpath = "//h4[normalize-space()='USE MILK AND ADD ALMONDS TO OATMEAL FOR A BOOST OF CALCIUM!']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreFour;
	
	@FindBy(xpath = "//h4[normalize-space()='CONVERT PERCENTAGE OF CALCIUM TO MILLIGRAMS BY ADDING A ZERO!']//ancestor::div[@class='box component section p-m-b-1 anchor-box odd col-xs-12']")
	private static WebElement readMoreFive;
	
	@FindBy(xpath = "//h4[normalize-space()='MAKE A BREAKFAST BANANA SPLIT TO GET MORE CALCIUM!']//ancestor::div[@class='box component section p-m-b-1 anchor-box even col-xs-12']")
	private static WebElement readMoreSix;
	
	@FindBy(xpath = "//h4[normalize-space()='SESAME SEEDS ARE A GOOD SOURCE OF CALCIUM!']//ancestor::div[@class='box component section p-d-b-2 p-m-b-1 anchor-box odd last col-xs-12']")
	private static WebElement readMoreSeven;
	
	
	
	
	
	
	
	
	
	
	
	
	
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

}
