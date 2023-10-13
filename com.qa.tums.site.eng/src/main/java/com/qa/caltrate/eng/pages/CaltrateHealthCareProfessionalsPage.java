package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class CaltrateHealthCareProfessionalsPage extends BaseClass{
	
	public CaltrateHealthCareProfessionalsPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//child::li)[1]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement Caltratehealthcarebreadcrumbs;	
	
    @FindBy(xpath = "//div[@class=\"image component section justify-center switchable-image image-center-m even last col-xs-12 col-md-5\"]//img")
    private static WebElement bonehealthImage;	
	
    @FindBy(xpath = "//div[@class=\"richText component section p-d-t-1 p-m-x-1 p-m-t-1 text-left-d text-center-m first odd col-xs-12\"]")
    private static WebElement osteoporsismedicineTxt;	
	
    @FindBy(xpath = "(//a[@href=\"/health-care-professionals/is-osteoporosis-medicine-enough/\"])[1]")
    private static WebElement ReadMore;	
	
    @FindBy(xpath = "(//a[@href=\"/health-care-professionals/is-osteoporosis-medicine-enough/\"])[2]")
    private static WebElement OestoporsosismedicineArticle;	
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/tools/\"])[3]")
    private static WebElement Interactivetool;	
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/articles/\"])[3]")
    private static WebElement Articles;	
	
    @FindBy(xpath = "(//a[@href=\"/bone-health-central/health-tips/\"])[3]")
    private static WebElement HealthTips;	
	
	
	
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
  	public void clickonBoneHealthImage() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(bonehealthImage);
  }
  	public void clickonOestoporosiscontent() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(osteoporsismedicineTxt);
  }
  	public void clickonReadMore() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(ReadMore);
  }
  	public void clickonOestoporosismedicineArticles() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(OestoporsosismedicineArticle);
  }
  	
	public void clickonInteractiveTool() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Interactivetool);
  }
	public void clickonArticles() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Articles);
  }
  	public void clickonHealthTips() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(HealthTips);
  }
	
	
	
	
	

}