package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateBoneHealthCentralPage extends BaseClass{
	
	public CaltrateBoneHealthCentralPage() {
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
	
	@FindBy(xpath = "//li[@class='odd first navigation-item navigation-level1 page-articles filter-item-js']//ancestor::a[text()='Articles ']")
	private static WebElement navTopicOne;
	
	@FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-recipes filter-item-js']//ancestor::a[normalize-space()='Recipes']")
	private static WebElement navTopicTwo;
	
	@FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-tools filter-item-js']//ancestor::a[normalize-space()='Interactive Tools']")
	private static WebElement navTopicThree;
	
	@FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-health-tips filter-item-js']//ancestor::a[normalize-space()='Health Tips']")
	private static WebElement navTopicFour;
	
	@FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-vitamin-d filter-item-js']//ancestor::a[normalize-space()='Vitamin D']")
	private static WebElement navTopicFive;
	
	@FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-osteoporosis filter-item-js']//ancestor::a[normalize-space()='Osteoporosis']")
	private static WebElement navTopicSix;
	
	@FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-calcium-supplements filter-item-js']//ancestor::a[normalize-space()='Calcium Supplements']")
	private static WebElement navTopicSeven;
	
	@FindBy(xpath = "//li[@class='even last navigation-item navigation-level1 page-calcium-and-calcium-carbonate filter-item-js']//ancestor::a[normalize-space()='Calcium and Calcium Carbonate']")
	private static WebElement navTopicEight;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Calcium and Calcium Carbonate']")
	private static WebElement featuredArticleOne;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Vitamin D']")
	private static WebElement featuredArticleTwo;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Calcium Supplements']")
	private static WebElement featuredArticleThree;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='Articles']")
	private static WebElement featuredArticleFour;
	
	@FindBy(xpath = "//div[@class='richText component section text-left-d text-center-m odd col-xs-12']//following::a[normalize-space()='READ ARTICLE']")
	private static WebElement featuredArticleFive;
	
	@FindBy(xpath = "//*[@class='btn-default']//self::a[@href='/bone-health-central/recipes/summer-strong-shake/']")
	private static WebElement viewRecipes;
	
	@FindBy(xpath = "//a[normalize-space()='MORE HEALTH TIPS']")
	private static WebElement moreHealthTips;
	
	@FindBy(xpath = "//a[normalize-space()='READ MORE']")
	private static WebElement readMore;
	
	
	
	
	
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
	
	public void clickNavTopicOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicOne);
		clickElementUsingJavaScript(navTopicOne);
	}
	
	public void clickNavTopicTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicTwo);
		clickElementUsingJavaScript(navTopicTwo);
	}
	
	public void clickNavTopicThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicThree);
		clickElementUsingJavaScript(navTopicThree);
	}
	
	public void clickNavTopicFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicFour);
		clickElementUsingJavaScript(navTopicFour);
	}
	
	public void clickNavTopicFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicFive);
		clickElementUsingJavaScript(navTopicFive);
	}
	
	public void clickNavTopicSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicSix);
		clickElementUsingJavaScript(navTopicSix);
	}
	
	public void clickNavTopicSeven() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicSeven);
		clickElementUsingJavaScript(navTopicSeven);
	}
	
	public void clickNavTopicEight() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(navTopicEight);
		clickElementUsingJavaScript(navTopicEight);
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
	
	public void clickViewRecipes() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewRecipes);
		clickElementUsingJavaScript(viewRecipes);
	}
	
	public void clickMoreHealthTips() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(moreHealthTips);
		clickElementUsingJavaScript(moreHealthTips);
	}
	
	public void clickReadMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMore);
		clickElementUsingJavaScript(readMore);
	}
	
	

}
