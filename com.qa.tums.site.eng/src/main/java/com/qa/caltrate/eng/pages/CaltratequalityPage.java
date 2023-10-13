package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltratequalityPage extends BaseClass{
	
	public CaltratequalityPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement qualitybreadcrumbs;	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
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
     	public void clickonqualitybreadcrumbs() throws Throwable {
     		waitForPageLoadJava();
     		elementClick(qualitybreadcrumbs);
     }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
