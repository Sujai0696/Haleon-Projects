package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaCauseEAspettiScientificiPage extends BaseClass{
	
	public RinazinaCauseEAspettiScientificiPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Consigli sulla salute nasale']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili.']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//div[@class='richText component section margin-top-remove padding-22-left-dt odd last col-xs-12 col-md-6']//ancestor::a[@href='/prodotti/medicinali/rinazina-antiallergica-spray-nasale/']")
	private static WebElement unoSprayLink;
	
	
	@FindBy(xpath = "//a[text()='Sintomi e rimedi contro la rinite allergica. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='Polline, Allergia e Rinite: quali sono le correlazioni? ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='Lavaggi nasali: a cosa servono e come farli. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente? ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleFour;
	
	
	
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
		clickElementUsingJavaScript(breadcrumbOne);
		pageLoad();
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		clickElementUsingJavaScript(breadcrumbTwo);
		pageLoad();
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			Assert.assertTrue(elementIsDisplayed(breadcrumbThree));
			System.out.println(getElementText(breadcrumbThree)+": Breadcrumb verified successfully");
		} else {
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickUnoSprayLink() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(unoSprayLink);
		clickElementUsingJavaScript(unoSprayLink);
		pageLoad();
	}
	
	
	public void clickArticleOne() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleOne);
		clickElementUsingJavaScript(articleOne);
		pageLoad();
	}
	
	public void clickArticleTwo() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleTwo);
		clickElementUsingJavaScript(articleTwo);
		pageLoad();
	}
	
	public void clickArticleThree() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleThree);
		clickElementUsingJavaScript(articleThree);
		pageLoad();
	}
	
	public void clickArticleFour() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(articleFour);
		clickElementUsingJavaScript(articleFour);
		pageLoad();
	}

}
