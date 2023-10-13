package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateConversionunitPage extends BaseClass {
	
	public CaltrateConversionunitPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement bonehealthcentralbreadcrumbs;	
    	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[3]")
    private static WebElement healthtipsbreadcrumbs;		
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[4]")
    private static WebElement conversionunitsbreadcrumbs;	
		
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/health-tips/\"])[4]")
    private static WebElement healthtiptag;	
	
	//Bone Health Central//
    
    @FindBy(xpath = "//a[text()='All Articles']")
    private static WebElement allarticles;
    
    @FindBy(xpath = "//a[text()='All Recipes']")
    private static WebElement allrecipes;
    
    @FindBy(xpath = "//a[text()='All Health Tips']")
    private static WebElement allhealthtips;
    
    @FindBy(xpath = "//a[text()='All Interactive Tools']")
    private static WebElement allinterativetools;
    
    //View by Topic//
    
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/calcium-and-calcium-carbonate/\"])[3]")
    private static WebElement calciumcarbonateView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[3]")
    private static WebElement vitaminDView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosisView;
    
    @FindBy(xpath = "(//a[text()='Calcium Supplements'])[2]")
    private static WebElement calciumsupplementsView;
    
	
	
	
	
	
	
	
	
	
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
  	public void clickonBonehealthcentralbreadcrumbs() throws Throwable {
  		elementClick(bonehealthcentralbreadcrumbs);
  }
  	public void clickonHealthTipsbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(healthtipsbreadcrumbs);
  }
  	public void clickonConversionunitsbreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(conversionunitsbreadcrumbs);
  }
  	public void clickonHealthtiptag() throws Throwable {
  		waitForPageLoadJava();
  		elementClick(healthtiptag);
  }
	public void clickonAllArticles() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allarticles);
  }
	public void clickonAllRecipes() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allrecipes);
  }
	public void clickonAllHealthTips() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allhealthtips);
  }
	public void clickonAllInteractiveTools() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(allinterativetools);
  }
	public void clickonCalciumcarbonateView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumcarbonateView);
  }
	public void clickonvitaminDView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(vitaminDView);
  }
	public void clickonOsteoporsisView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(osteoporosisView);
  }
	public void clickoncalciumsupplementsView() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(calciumsupplementsView);
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
