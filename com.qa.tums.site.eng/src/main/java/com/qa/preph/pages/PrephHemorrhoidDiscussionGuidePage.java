package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephHemorrhoidDiscussionGuidePage extends BaseClass{
	
	public PrephHemorrhoidDiscussionGuidePage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[normalize-space()='Hemorrhoid Discussion Guide']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='hemorrhoid discomfort']//self::a[@href='/learn-more/what-are-hemorrhoids/']")
	private static WebElement hyperLinkHemorrhoidDiscomfort;
	
	@FindBy(xpath = "//a[text()='hemorrhoid symptoms']//self::a[@href='/learn-more/hemorrhoid-symptoms/']")
	private static WebElement hyperLinkHemorrhoidSymptoms;
	
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
	
	public void clickHyperLinkHemorrhoidDiscomfort() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHemorrhoidDiscomfort)) {
			scrollDownUsingElement(hyperLinkHemorrhoidDiscomfort);
			clickElementUsingJavaScript(hyperLinkHemorrhoidDiscomfort);
			pageLoad();
			System.out.println("hyperLinkHemorrhoidDiscomfort clicked successfully");
		} else {
			System.out.println("hyperLinkHemorrhoidDiscomfort is not presented in the page");
			throw new Exception("hyperLinkHemorrhoidDiscomfort is not presented in the page");
		}
	}
	
	public void clickHyperLinkHemorrhoidSymptoms() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHemorrhoidSymptoms)) {
			scrollDownUsingElement(hyperLinkHemorrhoidSymptoms);
			clickElementUsingJavaScript(hyperLinkHemorrhoidSymptoms);
			pageLoad();
			System.out.println("hyperLinkHemorrhoidSymptoms clicked successfully");
		} else {
			System.out.println("hyperLinkHemorrhoidSymptoms is not presented in the page");
			throw new Exception("hyperLinkHemorrhoidSymptoms is not presented in the page");
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
