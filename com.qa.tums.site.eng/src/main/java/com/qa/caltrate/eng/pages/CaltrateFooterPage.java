package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateFooterPage extends BaseClass{
	
	public CaltrateFooterPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "(//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage list-footer list-center-nod-m text-center first odd component col-xs-12\"]//a)[1]")
    private static WebElement Contactus;
    
    @FindBy(xpath = "(//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage list-footer list-center-nod-m text-center first odd component col-xs-12\"]//a)[2]")
    private static WebElement SiteMap;
		
    @FindBy(xpath = "(//div[@class=\"richTextEnhanced richText section richTextHyperlinkedImage list-footer list-center-nod-m text-center first odd component col-xs-12\"]//a)[3]")
    private static WebElement Quality;
	
    @FindBy(xpath = "//div[@class=\"parametrizedhtml component section rounded-circle d-icon icons-with-link first odd last col-xs-12 reference-icons-with-link-v01\"]//a")
    private static WebElement facebook;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
  	
  	
  	
  	public void clickonContactus() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Contactus);
  }
  	public void clickonSiteMap() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(SiteMap);
  }
  	public void clickonQuality() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(Quality);
  }
  	public void clickonFacebook() throws Throwable {
  		waitForPageLoadJava();
  		clickElementUsingJavaScript(facebook);
  }
	
	
	
	

}
