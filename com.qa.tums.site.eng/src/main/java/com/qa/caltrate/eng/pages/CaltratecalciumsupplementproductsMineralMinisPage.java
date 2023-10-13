package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltratecalciumsupplementproductsMineralMinisPage extends BaseClass {
	
	public CaltratecalciumsupplementproductsMineralMinisPage() {
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
    private static WebElement Caltrateplusmineralminisbreadcrumbs;	
    
    @FindBy(xpath = "//a[text()='BUY NOW']")
    private static WebElement buynow;	
	
    @FindBy(xpath = "//div[@class=\"box component section flex cols-d-4 cols-m-1 flex-row max-content-width p-m-x-2 s-d-2 s-m-1 where-to-buy-wrapper even col-xs-12\"]")
    private static WebElement buynowTxt;	
	
    @FindBy(xpath = "//a[text()='GET COUPONS']")
    private static WebElement getcoupons;	
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[3]")
    private static WebElement tastingtablet;	
	
    @FindBy(xpath = "//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage text-center-d text-center-m first odd component col-xs-12\"]")
    private static WebElement heading;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[4]")
    private static WebElement caltratemineralchewables;	
	
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[1]")
    private static WebElement caltratemineralchewables_img;	
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3/\"])[3]")
    private static WebElement caltrate600d3;	
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[2]")
    private static WebElement caltrate600d3_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/gummy-bites/\"])[3]")
    private static WebElement calciumgummybites;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[3]")
    private static WebElement calciumgummybites_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-soft-chews/\"])[3]")
    private static WebElement caltratesoftchews;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[4]")
    private static WebElement caltratesoftchews_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals/\"])[3]")
    private static WebElement caltrateplusminerals;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-t-1 p-m-t-1 switchable-image odd last col-xs-12\"])[5]")
    private static WebElement caltrateplusminerals_img;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/\"])[4]")
    private static WebElement viewallproducts;
    
    @FindBy(xpath = "//div[@class=\"richText component section p-m-x-1 text-center-m text-color-3 text-right-d first odd col-xs-12\"]")
    private static WebElement VitaminD;
    
    @FindBy(xpath = "//div[@class=\"image component section switchable-image even last col-xs-12 col-md-5\"]")
    private static WebElement VitaminD_img;
    
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/benefits-vitamind3/\"]")
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
  	public void clickonCaltrateplusmineralminisbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(Caltrateplusmineralminisbreadcrumbs);
  }
  	public void clickonCaltrateplusmineralminisbuyNow() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(buynow);
  		visibilityOf(buynowTxt);
  		boolean elementIsDisplayed=elementIsDisplayed(buynowTxt);
  		Assert.assertTrue(elementIsDisplayed);
  }
  	public void clickongetcoupons() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(getcoupons);
  }
  	public void clickontastingtablet() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(tastingtablet);
  }
  	public void clickoncaltratemineralchewables() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltratemineralchewables);
  }
  	public void clickoncaltratemineralchewables_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltratemineralchewables_img);
  }
	public void clickoncaltrate600d3() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrate600d3);
  }
	public void clickoncaltrate600d3_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrate600d3_img);
  }
	public void clickoncalciumgummybites() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumgummybites);
  }
	public void clickoncalciumgummybites_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumgummybites_img);
  }
	public void clickoncaltratesoftchews() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltratesoftchews);
  }
	public void clickoncaltratesoftchews_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltratesoftchews_img);
  }
	public void clickoncaltratesplusmMinerals() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusminerals);
  }
	public void clickoncaltratesplusmMinerals_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltrateplusminerals_img);
  }
	public void clickonviewallproducts() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(viewallproducts);
  }
	public void clickonVitaminD() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(VitaminD);
  }
	public void clickonVitaminD_img() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(VitaminD_img);
  }
	public void clickonreadmore() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(readmore);
  }
	
	
	
	

}
