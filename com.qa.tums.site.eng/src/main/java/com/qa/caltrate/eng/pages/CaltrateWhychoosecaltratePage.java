package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateWhychoosecaltratePage extends BaseClass{

	public CaltrateWhychoosecaltratePage() {
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
    private static WebElement whychoosecaltratebreadcrumbs;	
	
    @FindBy(xpath = "(//a[@href=\"/coupons/\"])[2]")
    private static WebElement getcoupons;	
	
    @FindBy(xpath = "(//a[@href=\"/where-to-buy/\"])[2]")
    private static WebElement wheretobuy;	
	
    @FindBy(xpath = "//div[@class=\"box component section flex cols-d-4 cols-m-1 flex-row max-content-width p-m-x-2 s-d-2 s-m-1 where-to-buy-wrapper even col-xs-12\"]")
    private static WebElement wheretobuyTxt;	
	
    @FindBy(xpath = "(//a[@href=\"/coupons/\"])[3]")
    private static WebElement getcouponslast;	
	
    @FindBy(xpath = "(//a[@href=\"/where-to-buy/\"])[3]")
    private static WebElement wheretobuylast;	
	
	
	
	
	
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
    	public void clickonProductsbreadcrumbs() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(Productsbreadcrumbs);
    }
    	public void clickonwhychoosecaltratebreadcrumbs() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(whychoosecaltratebreadcrumbs);
    }
    	public void clickongetcoupons() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(getcoupons);
    }
    	public void clickonwheretobuy() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(wheretobuy);
    		visibilityOf(wheretobuyTxt);
    		boolean elementIsDisplayed=elementIsDisplayed(wheretobuyTxt);
    		Assert.assertTrue(elementIsDisplayed);
    }
    	public void clickongetcouponslast() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(getcouponslast);
    }
    	public void clickonwheretobuylast() throws Throwable {
    		waitForPageLoadJava();
    		clickElementUsingJavaScript(wheretobuylast);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
