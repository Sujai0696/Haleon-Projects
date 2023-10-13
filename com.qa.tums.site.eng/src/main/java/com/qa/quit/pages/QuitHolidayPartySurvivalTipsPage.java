package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitHolidayPartySurvivalTipsPage extends BaseClass{
	
	public QuitHolidayPartySurvivalTipsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Quit.com' and @href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//a[text()='Support Hub' and @href='/support-hub.html']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='Holiday Party Survival Tips']//ancestor::li[@class='breadcrumb-list-item odd last is-current ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='Back' and @href='/support-hub.html']")
	private static WebElement linkBack;
	
	@FindBy(xpath = "//a[text()='other smokers' and @href='/quit-smoking-tips/social-smoking/how-to-resist.html']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[text()='tricks and tips' and @href='/quit-smoking-tips.html']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[text()='SIGN UP' and @href='/join-myquit.html']")
	private static WebElement btnSignUp;
	
	@FindBy(xpath = "//a[text()='GET SUPPORT' and @href='https://www.nicorette.com/support/']")
	private static WebElement btnGetSupport;
	
	@FindBy(xpath = "(//a[normalize-space()=\"What's Your Why?\" and @href='/support-hub.html'])")
	private static WebElement tabOne;
	
	@FindBy(xpath = "//a[text()='CRAVINGS' and @href='/support-hub.html']")
	private static WebElement tabTwo;
	
	@FindBy(xpath = "//a[text()='Inspiration' and @href='/support-hub.html']")
	private static WebElement tabThree;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img1 rel-art-purple even grid_4 alpha']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img2 rel-art-blue odd grid_4']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img3 rel-art-yellow even last grid_4']")
	private static WebElement relatedArticleThree;
	
	
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
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickLinkBack() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(linkBack)) {
			scrollDownUsingElement(linkBack);
			clickElementUsingJavaScript(linkBack);
			pageLoad();
			System.out.println("linkBack  clicked successfully");
		} else {
			System.out.println("linkBack  is not presented in the page");
			throw new Exception("linkBack  is not presented in the page");
		}
	}
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			 
			System.out.println("hyperLinkOne  clicked successfully");
		} else {
			System.out.println("hyperLinkOne  is not presented in the page");
			throw new Exception("hyperLinkOne  is not presented in the page");
		}
	}
	

	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo  clicked successfully");
		} else {
			System.out.println("hyperLinkTwo  is not presented in the page");
			throw new Exception("hyperLinkTwo  is not presented in the page");
		}
	}
	
	public void clickBtnSignUp() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnSignUp)) {
			scrollDownUsingElement(btnSignUp);
			clickElementUsingJavaScript(btnSignUp);
			pageLoad();
			System.out.println("btnSignUp  clicked successfully");
		} else {
			System.out.println("btnSignUp  is not presented in the page");
			throw new Exception("btnSignUp  is not presented in the page");
		}
	}
	
	public void clickBtnGetSupport() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnGetSupport)) {
			scrollDownUsingElement(btnGetSupport);
			clickElementUsingJavaScript(btnGetSupport);
			pageLoad();
			System.out.println("btnGetSupport  clicked successfully");
		} else {
			System.out.println("btnGetSupport  is not presented in the page");
			throw new Exception("btnGetSupport  is not presented in the page");
		}
	}
	
	public void clickTabOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabOne)) {
			scrollDownUsingElement(tabOne);
			clickElementUsingJavaScript(tabOne);
			pageLoad();
			System.out.println("tabOne  clicked successfully");
		} else {
			System.out.println("tabOne  is not presented in the page");
			throw new Exception("tabOne  is not presented in the page");
		}
	}
	
	public void clickTabTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabTwo)) {
			scrollDownUsingElement(tabTwo);
			clickElementUsingJavaScript(tabTwo);
			pageLoad();
			System.out.println("tabTwo  clicked successfully");
		} else {
			System.out.println("tabTwo  is not presented in the page");
			throw new Exception("tabTwo  is not presented in the page");
		}
	}
	
	
	public void clickTabThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabThree)) {
			scrollDownUsingElement(tabThree);
			clickElementUsingJavaScript(tabThree);
			pageLoad();
			System.out.println("tabThree  clicked successfully");
		} else {
			System.out.println("tabThree  is not presented in the page");
			throw new Exception("tabThree  is not presented in the page");
		}
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			
			clickElementUsingJavaScript(relatedArticleOne);
			pageLoad();
			System.out.println("relatedArticleOne  clicked successfully");
		} else {
			System.out.println("relatedArticleOne  is not presented in the page");
			throw new Exception("relatedArticleOne  is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			clickElementUsingJavaScript(relatedArticleTwo);
			pageLoad();
			System.out.println("relatedArticleTwo  clicked successfully");
		} else {
			System.out.println("relatedArticleTwo  is not presented in the page");
			throw new Exception("relatedArticleTwo  is not presented in the page");
		}
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			clickElementUsingJavaScript(relatedArticleThree);
			pageLoad();
			System.out.println("relatedArticleThree  clicked successfully");
		} else {
			System.out.println("relatedArticleThree  is not presented in the page");
			throw new Exception("relatedArticleThree  is not presented in the page");
		}
	}
}
