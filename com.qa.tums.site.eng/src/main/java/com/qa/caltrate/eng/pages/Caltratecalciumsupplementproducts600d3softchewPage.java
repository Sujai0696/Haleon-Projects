package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class Caltratecalciumsupplementproducts600d3softchewPage extends BaseClass{
	
	public Caltratecalciumsupplementproducts600d3softchewPage() {
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
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[3]")
    private static WebElement Caltratesoftchewbreadcrumbs;	
    
    @FindBy(xpath = "//a[text()='BUY NOW']")
    private static WebElement CaltratesoftchewBuyNow;	
    
    @FindBy(xpath = "//div[@class=\"box component section flex cols-d-4 cols-m-1 flex-row max-content-width p-m-x-2 s-d-2 s-m-1 where-to-buy-wrapper even col-xs-12\"]")
    private static WebElement CaltratesoftchewBuyNowTxt;	
    
    @FindBy(xpath = "//a[text()='GET COUPONS']")
    private static WebElement getcoupons;
    
    
    @FindBy(xpath = "//h1[@role=\"heading\"]")
    private static WebElement heading;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3/\"])[3]")
    private static WebElement caltrate600d3;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[1]")
    private static WebElement caltrate600d3_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/gummy-bites/\"])[3]")
    private static WebElement caltrategummybites;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[2]")
    private static WebElement caltrategummybites_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-minis/\"])[3]")
    private static WebElement caltrateplusmineralMinis;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[3]")
    private static WebElement caltrateplusmineralMinis_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals/\"])[3]")
    private static WebElement caltrateplusmineral;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[4]")
    private static WebElement caltrateplusmineral_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[3]")
    private static WebElement caltrateplusmineralchewables;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[5]")
    private static WebElement caltrateplusmineralchewables_img;
    
    @FindBy(xpath = "//a[text()='VIEW ALL PRODUCTS']")
    private static WebElement viewallproducts;
    
    @FindBy(xpath = "//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage p-m-x-1 text-center-m text-color-3 text-right-d first odd component col-xs-12\"]")
    private static WebElement caltrateforyourbones;
    
    @FindBy(xpath = "//div[@class=\"image component section switchable-image even last col-xs-12 col-md-5\"]")
    private static WebElement caltrateforyourbones_img;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/tools/caltrate-beyond-bones/\"]")
    private static WebElement readmore;
    
   
    
	//methods
  	
  	public void clickCookieBtn() throws Exception {
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
  		waitForPageLoadJava();
  		elementClick(Homebreadcrumbs);
  }
  	public void clickonProductsbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(Productsbreadcrumbs);
  }
  	public void clickonCaltratesoftchewbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(Caltratesoftchewbreadcrumbs);
  }
  	public void clickonCaltratesoftchewBuyNow() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(CaltratesoftchewBuyNow);
  		boolean elementIsDisplayed=elementIsDisplayed(CaltratesoftchewBuyNowTxt);
  		Assert.assertTrue(elementIsDisplayed);
  }
  	public void clickongetcoupons() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(getcoupons);
  }
  	public void clickoncaltrate600d3() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrate600d3);
  }
  	public void clickoncaltrate600d3_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrate600d3_img);
  }
  	public void clickoncaltrategummybites() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrategummybites);
  }
  	public void clickoncaltrategummybites_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrategummybites_img);
  }
  	public void clickoncaltrateplusmineralMinis() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineralMinis);
  }
  	public void clickoncaltrateplusmineralMinis_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineralMinis_img);
  }
	public void clickoncaltrateplusmineral() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineral);
  }
	public void clickoncaltrateplusmineral_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineral_img);
  }
	public void clickoncaltrateplusmineralchewables() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineralchewables);
  }
	public void clickoncaltrateplusmineralchewables_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusmineralchewables_img);
  }
	public void clickonviewallproducts() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(viewallproducts);
  }
	public void clickoncaltrateyourbones() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateforyourbones);
  }
	public void clickoncaltrateyourbones_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateforyourbones_img);
  }
	public void clickonreadmore() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(readmore);
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
