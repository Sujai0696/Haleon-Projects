package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneCovid19_Pages extends BaseClass{
	
	public SensodyneCovid19_Pages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
    private static WebElement wheretobuy;
		
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
    private static WebElement Covid19;
		
    @FindBy(xpath = "(//header[@class=\"accordion-head\"])[1]")
    private static WebElement Dentalemergency;
	
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement Dentalemergency_open;
	
    @FindBy(xpath = "//header[@class=\"accordion-head\"]")
    private static WebElement considerdentalemergency;
	
    @FindBy(xpath = "//header[@class=\"accordion-head active\"]")
    private static WebElement considerdentalemergency_open;
	
    @FindBy(xpath = "//a[text()='Find Your Toothpaste']")
    private static WebElement findyourtoothpaste;
	
    @FindBy(xpath = "//a[text()='Get Your Coupon']")
    private static WebElement getyourcoupon;
	
    
    
    
  //Methods//
    
  	public void clickCookieBtn() throws Exception {
          elementToBeClickable(cookieBtn);
          try {
              if (cookieBtn.isDisplayed()) {
                  elementClick(cookieBtn);
              }
              visibilityOf(cookieClose);
              Assert.assertTrue(elementIsDisplayed(cookieClose));
              elementClick(cookieClose);
          } catch (Exception e) {
          }
      }
      public void clickGigyaForm() throws Exception {
          elementToBeClickable(gigyaForm);
          try {
              if (gigyaForm.isDisplayed()) {
                  elementClick(gigyaForm);
              }
              visibilityOf(gigyaClose);
              implicitWait();
              Assert.assertTrue(elementIsDisplayed(gigyaClose));
              elementClick(gigyaClose);
          } catch (Exception e) {
         }
      }
      
      public void  clickCovid19Breadcrumbs() throws Exception {
      	moveToElement(Covid19);
      	clickElementUsingJavaScript(Covid19);
      }
      public void  clickOnDentalemergency() throws Exception {
        	
        	clickElementUsingJavaScript(Dentalemergency);
        	visibilityOf(Dentalemergency_open);
        	boolean elementIsDisplayed=elementIsDisplayed(Dentalemergency_open);
        	Assert.assertTrue(elementIsDisplayed);
        	clickElementUsingJavaScript(Dentalemergency_open);
        }
      public void  clickOnConsiderDentalemergency() throws Exception {
      	
      	clickElementUsingJavaScript(considerdentalemergency);
      	visibilityOf(considerdentalemergency_open);
      	boolean elementIsDisplayed=elementIsDisplayed(considerdentalemergency_open);
      	Assert.assertTrue(elementIsDisplayed);
      	clickElementUsingJavaScript(considerdentalemergency_open);
      }
	  public void ClickOnfindyourToothpaste() throws Exception {
		  clickElementUsingJavaScript(findyourtoothpaste);
	  }
	  public void ClickOngetyourcoupon() throws Exception {
		  clickElementUsingJavaScript(getyourcoupon);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
