package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephCausesOfHemorrhoidsPage extends BaseClass{
	
	public PrephCausesOfHemorrhoidsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Articles']//self::a[@href='/learn-more/']")
	private static WebElement breadcrumbTwo;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' What Causes Hemorrhoids and How Can You Treat Them? ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='Hemorrhoids']//self::a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement hyperLinkHemorrhids;
	
	@FindBy(xpath = "//a[text()='flare-up']//self::a[@href='/learn-more/hemorrhoid-flare-ups/']")
	private static WebElement hyperLinkFlareUp;
	
	@FindBy(xpath = "//a[text()='Straining due to chronic constipation']//self::a[@href='/learn-more/stress-and-constipation/']")
	private static WebElement hyperLinkStrainingDueToChronic;
	
	@FindBy(xpath = "//a[text()='Pregnancy']//self::a[@href='/learn-more/just-for-moms/']")
	private static WebElement hyperLinkPregnancy;
	
	@FindBy(xpath = "//a[text()='Exerting yourself with heavy lifting']//self::a[@href='/learn-more/could-lifting-weights-give-you-hemorrhoids/']")
	private static WebElement hyperLinkExertingYourself;
	
	@FindBy(xpath = "//a[text()='Fibrous foods']//self::a[@href='/learn-more/hemorrhoid-diet/']")
	private static WebElement hyperLinkFibrousFood;
	
	@FindBy(xpath = "//a[text()='right products']//self::a[@href='/products/']")
	private static WebElement hyperLinkRightProducts;
	
	@FindBy(xpath = "//a[text()='healthy living blog']//self::a[@href='/learn-more/#healthy-living']")
	private static WebElement hyperLinkHealthyLivingBlog;
	
	@FindBy(xpath = "//a[text()='The Emotional Toll of Hemorrhoids']//self::a[@href='/learn-more/emotional-toll-of-hemorrhoids/']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='What Are Hemorrhoids?']//self::a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='6 Reasons You Have an Itchy Butt']//self::a[@href='/learn-more/6-reasons-you-have-itchy-butt/']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='emotional-toll-link']")
	private static WebElement relatedArticleReadMoreOne;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='what-are-hemorrhoids-link']")
	private static WebElement relatedArticleReadMoreTwo;
	
	@FindBy(xpath = "//button[text()='READ MORE']//self::button[@id='itchy-butt-link']")
	private static WebElement relatedArticleReadMoreThree;
	
	
	
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}

	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkHemorrhids() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHemorrhids)) {
			scrollDownUsingElement(hyperLinkHemorrhids);
			clickElementUsingJavaScript(hyperLinkHemorrhids);
			pageLoad();
			System.out.println("hyperLinkHemorrhids clicked successfully");
		} else {
			System.out.println("hyperLinkHemorrhids is not presented in the page");
			throw new Exception("hyperLinkHemorrhids is not presented in the page");
		}
	}
	
	public void clickHyperLinkFlareUp() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFlareUp)) {
			scrollDownUsingElement(hyperLinkFlareUp);
			clickElementUsingJavaScript(hyperLinkFlareUp);
			pageLoad();
			System.out.println("hyperLinkFlareUp clicked successfully");
		} else {
			System.out.println("hyperLinkFlareUp is not presented in the page");
			throw new Exception("hyperLinkFlareUp is not presented in the page");
		}
	}
	
	public void clickHyperLinkStrainingDueToChronic() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkStrainingDueToChronic)) {
			scrollDownUsingElement(hyperLinkStrainingDueToChronic);
			clickElementUsingJavaScript(hyperLinkStrainingDueToChronic);
			pageLoad();
			System.out.println("hyperLinkStrainingDueToChronic clicked successfully");
		} else {
			System.out.println("hyperLinkStrainingDueToChronic is not presented in the page");
			throw new Exception("hyperLinkStrainingDueToChronic is not presented in the page");
		}
	}
	
	public void clickHyperLinkPregnancy() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkPregnancy)) {
			scrollDownUsingElement(hyperLinkPregnancy);
			clickElementUsingJavaScript(hyperLinkPregnancy);
			pageLoad();
			System.out.println("hyperLinkPregnancy clicked successfully");
		} else {
			System.out.println("hyperLinkPregnancy is not presented in the page");
			throw new Exception("hyperLinkPregnancy is not presented in the page");
		}
	}
	
	public void clickHyperLinkExertingYourself() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkExertingYourself)) {
			scrollDownUsingElement(hyperLinkExertingYourself);
			clickElementUsingJavaScript(hyperLinkExertingYourself);
			pageLoad();
			System.out.println("hyperLinkExertingYourself clicked successfully");
		} else {
			System.out.println("hyperLinkExertingYourself is not presented in the page");
			throw new Exception("hyperLinkExertingYourself is not presented in the page");
		}
	}
	
	public void clickHyperLinkFibrousFood() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFibrousFood)) {
			scrollDownUsingElement(hyperLinkFibrousFood);
			clickElementUsingJavaScript(hyperLinkFibrousFood);
			pageLoad();
			System.out.println("hyperLinkFibrousFood clicked successfully");
		} else {
			System.out.println("hyperLinkFibrousFood is not presented in the page");
			throw new Exception("hyperLinkFibrousFood is not presented in the page");
		}
	}
	
	public void clickHyperLinkRightProducts() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkRightProducts)) {
			scrollDownUsingElement(hyperLinkRightProducts);
			clickElementUsingJavaScript(hyperLinkRightProducts);
			pageLoad();
			System.out.println("hyperLinkRightProducts clicked successfully");
		} else {
			System.out.println("hyperLinkRightProducts is not presented in the page");
			throw new Exception("hyperLinkRightProducts is not presented in the page");
		}
	}
	
	public void clickHyperLinkHealthyLivingBlog() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHealthyLivingBlog)) {
			scrollDownUsingElement(hyperLinkHealthyLivingBlog);
			clickElementUsingJavaScript(hyperLinkHealthyLivingBlog);
			pageLoad();
			System.out.println("hyperLinkHealthyLivingBlog clicked successfully");
		} else {
			System.out.println("hyperLinkHealthyLivingBlog is not presented in the page");
			throw new Exception("hyperLinkHealthyLivingBlog is not presented in the page");
		}
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			clickElementUsingJavaScript(relatedArticleOne);
			pageLoad();
			System.out.println("relatedArticleOne clicked successfully");
		} else {
			System.out.println("relatedArticleOne is not presented in the page");
			throw new Exception("relatedArticleOne is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			clickElementUsingJavaScript(relatedArticleTwo);
			pageLoad();
			System.out.println("relatedArticleTwo clicked successfully");
		} else {
			System.out.println("relatedArticleTwo is not presented in the page");
			throw new Exception("relatedArticleTwo is not presented in the page");
		}
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			clickElementUsingJavaScript(relatedArticleThree);
			pageLoad();
			System.out.println("relatedArticleThree clicked successfully");
		} else {
			System.out.println("relatedArticleThree is not presented in the page");
			throw new Exception("relatedArticleThree is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreOne)) {
			scrollDownUsingElement(relatedArticleReadMoreOne);
			clickElementUsingJavaScript(relatedArticleReadMoreOne);
			pageLoad();
			System.out.println("relatedArticleReadMoreOne clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreOne is not presented in the page");
			throw new Exception("relatedArticleReadMoreOne is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreTwo)) {
			scrollDownUsingElement(relatedArticleReadMoreTwo);
			clickElementUsingJavaScript(relatedArticleReadMoreTwo);
			pageLoad();
			System.out.println("relatedArticleReadMoreTwo clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreTwo is not presented in the page");
			throw new Exception("relatedArticleReadMoreTwo is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreThree)) {
			scrollDownUsingElement(relatedArticleReadMoreThree);
			clickElementUsingJavaScript(relatedArticleReadMoreThree);
			pageLoad();
			System.out.println("relatedArticleReadMoreThree clicked successfully");
		} else {
			System.out.println("relatedArticleReadMoreThree is not presented in the page");
			throw new Exception("relatedArticleReadMoreThree is not presented in the page");
		}
	}
	
	

}
