package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltratesummerstrongshakePage extends BaseClass{
	
	public CaltratesummerstrongshakePage() {
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
    private static WebElement recipesbreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[4]")
    private static WebElement summerstrongshakebreadcrumbs;	
	
    @FindBy(xpath = "//div[@class=\"box component section max-content-width p-m-x-1 odd col-xs-12\"]//a[1]")
    private static WebElement calciumcarbonate;	
	
    @FindBy(xpath = "//div[@class=\"box component section max-content-width p-m-x-1 odd col-xs-12\"]//a[2]")
    private static WebElement vitaminD;	
	
    @FindBy(xpath = "//div[@class=\"box component section max-content-width p-m-x-1 odd col-xs-12\"]//a[2]")
    private static WebElement recipes;	
	
    @FindBy(xpath = "//div[@class=\"image component section switchable-image image-center-m first odd col-xs-12\"]")
    private static WebElement bonehealthImage;	
	
    @FindBy(xpath = "//span[text()='Maximize Your Calcium Absorption.*']")
    private static WebElement calciumabsorption;	
	
    @FindBy(xpath = "//a[@href=\"/bone-health-central/articles/vitamin-d-and-your-health/\"]")
    private static WebElement learnmore;	
	
    @FindBy(xpath = "(//div[@class=\"image component section switchable-image even last col-xs-12\"])[2]//child::img")
    private static WebElement caltratesoftchewsImage;
	
    @FindBy(xpath = "//a[text()='All Articles']")
    private static WebElement allarticles;
    
    @FindBy(xpath = "//a[text()='All Recipes']")
    private static WebElement allrecipes;
    
    @FindBy(xpath = "//a[text()='All Health Tips']")
    private static WebElement allhealthtips;
    
    @FindBy(xpath = "//a[text()='All Interactive Tools']")
    private static WebElement allinterativetools;
    
    //View by Topic//
    
    
    @FindBy(xpath = "(//a[text()='Calcium and Calcium Carbonate'])[2]")
    private static WebElement calciumcarbonateView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[4]")
    private static WebElement vitaminDView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosisView;
    
    @FindBy(xpath = "(//a[text()='Calcium Supplements'])[2]")
    private static WebElement calciumsupplementsView;
    
    
    
    
    
    
	
	
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
      		clickElementUsingJavaScript(Homebreadcrumbs);
      }
      	public void clickonbonehealthcentralbreadcrumbs() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(bonehealthcentralbreadcrumbs);
      }
      	public void clickonrecipesbreadcrumbs() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(recipesbreadcrumbs);
      }
      	public void clickonsummerstrongshakebreadcrumbs() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(summerstrongshakebreadcrumbs);
      }
      	public void clickoncalciumcarbonate() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(calciumcarbonate);
      }
      	public void clickonVitaminD() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(vitaminD);
      }
      	public void clickonrecipes() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(recipes);
      }
    	public void clickonBoneHealthImage() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(bonehealthImage);
      }
    	public void clickoncalciumabsorption() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(calciumabsorption);
      }
    	public void clickonlearnmore() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(learnmore);
      }
    	public void clickonCaltrafesoftchewsImage() throws Throwable {
      		waitForPageLoadJava();
      		clickElementUsingJavaScript(caltratesoftchewsImage);
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
