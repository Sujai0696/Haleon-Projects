package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class TumsAntacidproductsPages extends BaseClass{
	
	public TumsAntacidproductsPages() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[1]")
    private static WebElement homebreadcrumbs;
	
	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement productselector;		
	
	@FindBy(xpath="//ul[@class=\"filter-list-js\"]//li[2]")
    private static WebElement smoothies;		
	
	@FindBy(xpath="//ul[@class=\"filter-list-js\"]//li[3]")
    private static WebElement tablets;		
	
	@FindBy(xpath="//ul[@class=\"filter-list-js\"]//li[4]")
    private static WebElement chews;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	public void clickonhomebreadcrumbs() throws Throwable {
		clickElementUsingJavaScript(homebreadcrumbs);
}
	
	public void clickonproductselector() throws Throwable {
		clickElementUsingJavaScript(productselector);
}	
	public void clickonsmoothies() throws Throwable {
		clickElementUsingJavaScript(smoothies);
}	
	public void clickontablets() throws Throwable {
		clickElementUsingJavaScript(tablets);
}	
	public void clickonchews() throws Throwable {
		clickElementUsingJavaScript(chews);
}	
	
	
	
	
	
	
	
	
	
	

}
