package com.qa.rinazina.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina extends BaseClass{
	public RinazinaPuoiDetergereUnLavaggioConSoluzioneSalina() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accetta tutti i cookie']")
	private static WebElement cookieBtn;
	
    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Home']")
	private static WebElement Bread_Home;
    
    @FindBy(xpath = "//a[text()='Consigli sulla salute nasale']")
	private static WebElement Bread_ConsigliSullaSaluteNasale;
    
    @FindBy(xpath = "//span[@class='button-light-blue']")
	private static WebElement PerSaperneDiPiùBtn;

    @FindBy(xpath = "//a[text()='Lavaggi nasali: a cosa servono e come farli. ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleOne;
    
    @FindBy(xpath = "//a[text()='Cos’è la sinusite: cause e aspetti scientifici alla base della sinusite. ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleTwo;
    
    @FindBy(xpath = "//a[text()='Polline, Allergia e Rinite: quali sono le correlazioni? ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleThree;
    
    @FindBy(xpath = "//a[text()='Naso sempre chiuso: cos’è e quali sono le cause della congestione nasale persistente? ']//ancestor::div[@class='article-teaser teaserClick']")
  	private static WebElement ArticleFour;

    
    public void clickonCookieBtn() throws Exception {
		waitForPageLoadJava();
		if(isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if(cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
		}
    public void clickOnBread_Home() throws Throwable {
		moveToElement(Bread_Home);
		clickElementUsingJavaScript(Bread_Home);
	}
    
    public void clickOnBread_ConsigliSullaSaluteNasale() throws Throwable {
		moveToElement(Bread_ConsigliSullaSaluteNasale);
		clickElementUsingJavaScript(Bread_ConsigliSullaSaluteNasale);
	}
    public void clickOnPerSaperneDiPiùBtn() throws Throwable {
		moveToElement(PerSaperneDiPiùBtn);
		clickElementUsingJavaScript(PerSaperneDiPiùBtn);
	}
    public void clickOnArticleOne() throws Throwable {
		moveToElement(ArticleOne);
		clickElementUsingJavaScript(ArticleOne);
	}
    public void clickOnArticleTwo() throws Throwable {
		moveToElement(ArticleTwo);
		clickElementUsingJavaScript(ArticleTwo);
	}
    public void clickOnArticleThree() throws Throwable {
		moveToElement(ArticleThree);
		clickElementUsingJavaScript(ArticleThree);
	}
    public void clickOnArticleFour() throws Throwable {
		moveToElement(ArticleFour);
		clickElementUsingJavaScript(ArticleFour);
	}

}
