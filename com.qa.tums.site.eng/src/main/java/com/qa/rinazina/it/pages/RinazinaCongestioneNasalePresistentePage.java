package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaCongestioneNasalePresistentePage extends BaseClass{
	
	public RinazinaCongestioneNasalePresistentePage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente?']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[@href='/prodotti/senza-medicinali/rinazina-aquamarina-spray-nasale-ipertonico-con-eucalipto/']//ancestor::strong[normalize-space()='la congestione nasale']")
	private static WebElement nasoChiusoLink;
	
	@FindBy(xpath = "//a[@href='/prodotti/senza-medicinali/rinazina-aquamarina-spray-nasale-ipertonico-con-eucalipto/']//self::a[normalize-space()='Per saperne di più']")
	private static WebElement perSapereneDiLink;
	
	@FindBy(xpath = "//a[text()='Rinite allergica, cos’è: gli aspetti scientifici alla base della rinite allergica e di allergie simili. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleOne;
	
	@FindBy(xpath = "//a[text()='Sinusite: quali sono i sintomi e come alleviarli. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleTwo;
	
	@FindBy(xpath = "//a[text()='Gocce nasali per dare sollievo alla congestione nasale. ']//ancestor::div[@class='article-teaser teaserClick']")
	private static WebElement articleThree;
	
	@FindBy(xpath = "//a[text()='Russamento notturno: da cosa è provocato e quali possono essere i rimedi. ']//ancestor::div[@class='article-teaser teaserClick']")
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
	
	public void clickNasoChiusoLink() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(nasoChiusoLink);
		clickElementUsingJavaScript(nasoChiusoLink);
		pageLoad();
	}
	
	public void clickPerSapereneDiLink() throws  Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(perSapereneDiLink);
		clickElementUsingJavaScript(perSapereneDiLink);
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
