package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.yaml.snakeyaml.tokens.FlowEntryToken;

import com.qa.baseClass.BaseClass;

public class CaltrateHomepage extends BaseClass{
	
	public CaltrateHomepage() {
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
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section h5-v1-hero-banner first odd')]//ancestor::li[@class='active']")
	private static WebElement bannerCarouselActive;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section h5-v1-hero-banner first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='2']")
	private static WebElement bannerCarouselClickTwo;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section h5-v1-hero-banner first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='3']")
	private static WebElement bannerCarouselClickThree;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section h5-v1-hero-banner first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='4']")
	private static WebElement bannerCarouselClickFour;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section h5-v1-hero-banner first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='5']")
	private static WebElement bannerCarouselClickFive;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd is-active first lslide active']//ancestor::a[text()='FIND A STORE']")
	private static WebElement bannerCarouselLinkOne;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix even lslide active']//ancestor::a[text()='READ MORE']")
	private static WebElement bannerCarouselLinkTwo;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd lslide active']//ancestor::a[text()='READ MORE']")
	private static WebElement bannerCarouselLinkThree;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix even lslide active']//ancestor::a[text()='LEARN MORE']")
	private static WebElement bannerCarouselLinkFour;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd last lslide active']//ancestor::a[text()='LEARN MORE']")
	private static WebElement bannerCarouselLinkFive;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section carousel-cq first odd')]//ancestor::li[@class='active']")
	private static WebElement ourProductCarouselActive;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section carousel-cq first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='2']")
	private static WebElement ourProductCarouselClickTwo;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section carousel-cq first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='3']")
	private static WebElement ourProductCarouselClickThree;
	
	@FindBy(xpath = "//div[contains(@class,'carousel component section carousel-cq first odd')]//ancestor::ul[@class='lSPager lSpg']//ancestor::li[normalize-space()='4']")
	private static WebElement ourProductCarouselClickFour;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd is-active first common-question-slide lslide active']//ancestor::a[@href='/calcium-supplement-products/600d3-plus-minerals/']")
	private static WebElement ourProductOne;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix even common-question-slide lslide']//ancestor::a[@href='/calcium-supplement-products/600d3-plus-minerals-chewables/']")
	private static WebElement ourProductTwo;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd common-question-slide lslide']//ancestor::a[@href='/calcium-supplement-products/600d3-plus-minerals-minis/']")
	private static WebElement ourProductThree;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix even common-question-slide lslide']//ancestor::a[@href='/calcium-supplement-products/600d3/']")
	private static WebElement ourProductFour;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix odd common-question-slide lslide']//ancestor::a[@href='/calcium-supplement-products/600d3-soft-chews/']")
	private static WebElement ourProductFive;
	
	@FindBy(xpath = "//li[@class='carousel-slide clearfix even last common-question-slide lslide']//ancestor::a[@href='/calcium-supplement-products/gummy-bites/']")
	private static WebElement ourProductSix;
	
	@FindBy(xpath = "//a[normalize-space()='SEE ALL PRODUCTS']")
	private static WebElement seeAllProducts;
	
	@FindBy(xpath = "//div[@class='image component section m-m-b-1 p-d-2 switchable-image anchor-box card-icon-title-text first odd']")
	private static WebElement learnMore;
	
	@FindBy(xpath = "//div[@class='image component section m-m-b-1 p-d-2 switchable-image anchor-box card-icon-title-text even last']")
	private static WebElement allTips;
	
	@FindBy(xpath = "//a[normalize-space()='VIEW RECIPES']")
	private static WebElement viewRecipes;
	
	@FindBy(xpath = "//h3[text()='BONE HEALTH']//following::a[text()='READ MORE']")
	private static WebElement boneHealthReadMore;
	
	@FindBy(xpath = "//a[normalize-space()='READ ARTICLE']")
	private static WebElement readArticle;
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickBannerCarouselLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerCarouselActive)) {
			scrollDownUsingElement(bannerCarouselLinkOne);
			clickElementUsingJavaScript(bannerCarouselLinkOne);
		} else {
			throw new Exception("Banner carousel One is not Active");
		}
	}
	
	public void clickBannerCarouselLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bannerCarouselClickTwo);
		clickElementUsingJavaScript(bannerCarouselClickTwo);
		if (isElementPresent(bannerCarouselActive)) {
			scrollDownUsingElement(bannerCarouselLinkTwo);
			clickElementUsingJavaScript(bannerCarouselLinkTwo);
		} else {
			throw new Exception("Banner carousel Two is not Active");
		}
	}
	
	public void clickBannerCarouselLinkThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bannerCarouselClickThree);
		clickElementUsingJavaScript(bannerCarouselClickThree);
		if (isElementPresent(bannerCarouselActive)) {
			scrollDownUsingElement(bannerCarouselLinkThree);
			clickElementUsingJavaScript(bannerCarouselLinkThree);
		} else {
			throw new Exception("Banner carousel Three is not Active");
		}
	}
	
	public void clickBannerCarouselLinkFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bannerCarouselClickFour);
		clickElementUsingJavaScript(bannerCarouselClickFour);
		if (isElementPresent(bannerCarouselActive)) {
			scrollDownUsingElement(bannerCarouselLinkFour);
			clickElementUsingJavaScript(bannerCarouselLinkFour);
		} else {
			throw new Exception("Banner carousel Four is not Active");
		}
	}
	
	public void clickBannerCarouselLinkFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(bannerCarouselClickFive);
		clickElementUsingJavaScript(bannerCarouselClickFive);
		if (isElementPresent(bannerCarouselActive)) {
			scrollDownUsingElement(bannerCarouselLinkFive);
			clickElementUsingJavaScript(bannerCarouselLinkFive);
		} else {
			throw new Exception("Banner carousel Five is not Active");
		}
	}
	
	public void clickOurProductOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductOne);
			clickElementUsingJavaScript(ourProductOne);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	public void clickOurProductTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductTwo);
			clickElementUsingJavaScript(ourProductTwo);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	public void clickOurProductThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductThree);
			clickElementUsingJavaScript(ourProductThree);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	
	public void clickOurProductFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ourProductCarouselClickTwo);
		clickElementUsingJavaScript(ourProductCarouselClickTwo);
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductFour);
			clickElementUsingJavaScript(ourProductFour);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	public void clickOurProductFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ourProductCarouselClickThree);
		clickElementUsingJavaScript(ourProductCarouselClickThree);
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductFive);
			clickElementUsingJavaScript(ourProductFive);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	public void clickOurProductSix() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ourProductCarouselClickFour);
		clickElementUsingJavaScript(ourProductCarouselClickFour);
		if (isElementPresent(ourProductCarouselActive)) {
			scrollDownUsingElement(ourProductSix);
			clickElementUsingJavaScript(ourProductSix);
		} else {
			throw new Exception("our product carosuel is not active");
		}
	}
	
	public void clickSeeAllProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeAllProducts);
		clickElementUsingJavaScript(seeAllProducts);
	}
	
	public void clickLearnMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMore);
		clickElementUsingJavaScript(learnMore);
	}
	
	public void clickAllTips() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(allTips);
		clickElementUsingJavaScript(allTips);
	}
	
	public void clickViewRecipes() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(viewRecipes);
		clickElementUsingJavaScript(viewRecipes);
	}
	
	public void clickBoneHealthReadMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(boneHealthReadMore);
		clickElementUsingJavaScript(boneHealthReadMore);
	}
	
	public void clickReadArticle() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readArticle);
		clickElementUsingJavaScript(readArticle);
	}

}
