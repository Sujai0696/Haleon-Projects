package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateHeaderPage extends BaseClass{
	
	public CaltrateHeaderPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//div[@class=\"richText component section p-m-b-1 first odd col-xs-12\"]//a")
    private static WebElement Coupons;		
	
    @FindBy(xpath = "(//div[@class=\"richText component section default-style even last col-xs-12\"])[1]//a")
    private static WebElement wheretobuy;	
	
    @FindBy(xpath = "//img[@title=\"Logo Title Text\"]")
    private static WebElement caltratelogo;	
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector first odd reference-language-selector\"]")
    private static WebElement USA;	
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section language-selector first odd reference-language-selector opened\"]")
    private static WebElement USAopen;	
	
    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private static WebElement search;	
	
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private static WebElement submit;	
	
	
	
	
	
	
	
	
	
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
  	
  	
  	
  	public void clickonCoupons() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Coupons);
  }
  	public void clickonWheretobuy() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(wheretobuy);
  }
  	public void clickonCaltratelogo() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(caltratelogo);
  }
  	public void clickonCaltrateUSA() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(USA);
  		visibilityOf(USAopen);
  		boolean elementIsDisplayed=elementIsDisplayed(USAopen);
  		Assert.assertTrue(elementIsDisplayed);
  		clickElementUsingJavaScript(USAopen);
  }
  	public void clickonCaltratesearch() throws Throwable {
  		waitForPageLoadJava();
//  		String expected_title = "Caltrate";
//		String actual_title = driver.getTitle();
//		Assert.assertEquals(actual_title, expected_title, "Title is correct");
  		
		clickElementUsingJavaScript(search);
		search.sendKeys("Caltrate");
		clickElementUsingJavaScript(submit);
  }
	
	
	
	
	
	
	
	

}
