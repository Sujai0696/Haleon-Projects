package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class Caltratecalciumsupplementproducts600d3Page extends BaseClass {
	
	public Caltratecalciumsupplementproducts600d3Page() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement Productsbreadcrumbs;	
    
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
    private static WebElement Caltrate600d3Productsbreadcrumbs;	
    
    @FindBy(xpath = "//a[text()='BUY NOW']")
    private static WebElement Caltrate600d3ProductsBuyNow;	
    
    @FindBy(xpath = "//a[text()='GET COUPONS']")
    private static WebElement getcoupons;	
    
    @FindBy(xpath = "//h1[@role=\"heading\"]")
    private static WebElement heading;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/gummy-bites/\"])[3]")
    private static WebElement caltrategummybites;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[1]")
    private static WebElement caltrategummybites_img;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-soft-chews/\"])[3]")
    private static WebElement caltrate600d3softchews;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[2]")
    private static WebElement caltrate600d3softchews_img;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-minis/\"])[3]")
    private static WebElement caltrate600d3plusmineralminis;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[3]")
    private static WebElement caltrate600d3plusmineralminis_img;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals/\"])[3]")
    private static WebElement caltrate600d3plusmineral;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[4]")
    private static WebElement caltrate600d3plusmineral_img;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[3]")
    private static WebElement caltrate600d3plusmineralchewables;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[5]")
    private static WebElement caltrate600d3plusmineralchewables_img;	
    
    @FindBy(xpath = "//a[text()='VIEW ALL PRODUCTS']")
    private static WebElement viewallproducts;	
    
    @FindBy(xpath = "//span[text()='The story of your bones: calcium at every age']")
    private static WebElement storybones;	
    
    @FindBy(xpath = "//div[@class=\"image component section switchable-image even last col-xs-12 col-md-5\"]")
    private static WebElement storybones_img;	
    
    @FindBy(xpath = "//a[text()='READ MORE']")
    private static WebElement readmore;
    
    

  	//methods
  	
  	public void clickCookieBtn() throws Exception {
  		//visibilityOf(cookieBtn);
          if (isElementPresent(cookieBtn)) {
              elementToBeClickable(cookieBtn);
              try {
                  if (cookieBtn.isDisplayed()) {
                      clickElementUsingJavaScript(cookieBtn);
                  }
                implicitWait();
                 actionClick(cookieClose);
                  Assert.assertTrue(elementIsDisplayed(cookieClose));
              } catch (Exception e) {
              }
          }else {
              System.out.println("Dismiss is not presented");
          }
  	}
  	
  	
  	
  	public void clickonHomebreadcrumbs() throws Throwable {
  		elementClick(Homebreadcrumbs);
  }
  	public void clickonProductsbreadcrumbs() throws Throwable {
  		elementClick(Productsbreadcrumbs);
  }
  	public void clickonCaltrate600d3Productsbreadcrumbs() throws Throwable {
  		elementClick(Caltrate600d3Productsbreadcrumbs);
  }
	public void clickonCaltrate600d3ProductsBuyNow() throws Throwable {
  		elementClick(Caltrate600d3ProductsBuyNow);
  }
	public void clickonCaltrate600d3ProductsCoupons() throws Throwable {
  		elementClick(getcoupons);
  }
	public void clickonCaltrategummybites() throws Throwable {
		waitForPageLoadJava();
		//scrollDownUsingElement(heading);
		clickElementUsingJavaScript(caltrategummybites);
  }
	public void clickonCaltrategummybites_img() throws Throwable {
		//scrollDownUsingElement(heading);
  		elementClick(caltrategummybites_img);
  }
	public void clickonCaltrate600d3softchews() throws Throwable {
  		elementClick(caltrate600d3softchews);
  }
	public void clickonCaltrate600d3softchews_img() throws Throwable {
  		elementClick(caltrate600d3softchews_img);
  }
	public void clickonCaltrate600d3plusmineralMins() throws Throwable {
  		elementClick(caltrate600d3plusmineralminis);
  }
	public void clickonCaltrate600d3plusmineralMins_img() throws Throwable {
  		elementClick(caltrate600d3plusmineralminis_img);
  }
	public void clickonCaltrate600d3plusmineral() throws Throwable {
  		elementClick(caltrate600d3plusmineral);
  }
	public void clickonCaltrate600d3plusmineral_img() throws Throwable {
  		elementClick(caltrate600d3plusmineral_img);
  }

	public void clickonCaltrate600d3plusmineralChewables() throws Throwable {
  		clickElementUsingJavaScript(caltrate600d3plusmineralchewables);
  }
	public void clickonCaltrate600d3plusmineralChewables_img() throws Throwable {
  		elementClick(caltrate600d3plusmineralchewables_img);
  }
	public void clickonviewallproducts() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(viewallproducts);
  }
	public void clickonstorybones() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(storybones);
  }
	public void clickonstorybones_img() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(storybones_img);
  }
	public void clickonreadmore() throws Throwable {
		waitForPageLoadJava();
  		clickElementUsingJavaScript(readmore);
  }
	
	
	
	
	
	
	
	
	
	
	
}
