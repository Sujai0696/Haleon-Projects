package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateOestoporosisMedicineEnoughPage extends BaseClass{
	
	public CaltrateOestoporosisMedicineEnoughPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[1]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li)[2]")
    private static WebElement Caltratehealthcarebreadcrumbs;		
	
    @FindBy(xpath = "(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li)[3]")
    private static WebElement OestoporosisEnoughbreadcrumbs;
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/osteoporosis-help-reduce-risk/\"])[1]")
    private static WebElement ReduceRiskOestoporosis;
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/osteoporosis-help-reduce-risk/\"])[2]")
    private static WebElement findouthow;
	
	//BoneHealth Center//
    
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
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/vitamin-d/\"])[4]")
    private static WebElement vitaminDView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/osteoporosis/\"])[3]")
    private static WebElement osteoporosisView;
    
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/calcium-supplements/\"])[3]")
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
  	public void clickonCaltrateHomeBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Homebreadcrumbs);
  }
  	
  	
  	public void clickonCaltrateHealthprofessionalsBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Caltratehealthcarebreadcrumbs);
  }	
  	public void clickonOestoporosisEnoughBreadcrumbs() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(OestoporosisEnoughbreadcrumbs);
  }	
  	public void clickonReduceRiskOestoporosis() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(ReduceRiskOestoporosis);
  }	
	public void clickonFindouthow() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(findouthow);
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
