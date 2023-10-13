package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.baseClass.BaseClass;

public class TumsduringpregancyPages extends BaseClass{
	
	public TumsduringpregancyPages() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement whatcausesheartburnbreadcrumbs;	
	
	@FindBy(xpath="//a[text()='heartburn']")
    private static WebElement heartburn;	
	
	@FindBy(xpath="//a[text()='spicy']")
    private static WebElement spicy;	
	
	@FindBy(xpath="//a[text()='heartburn during pregnancy']")
    private static WebElement heartburnduringpregancy;	
	
	@FindBy(xpath="//a[text()='TUMS']")
    private static WebElement tums;	
	
	@FindBy(xpath="//a[text()='See products']")
    private static WebElement seeproducts;	
	
	
	
	
	
	
	
	
	//methods
	
	
	public void clickCookieBtn() throws Exception {
        if (isElementPresent(cookieBtn)) {
            elementToBeClickable(cookieBtn);
            try {
                if (cookieBtn.isDisplayed()) {
                    clickElementUsingJavaScript(cookieBtn);
                }
               // implicitWait(10);
                actionClick(cookieClose);
                Assert.assertTrue(elementIsDisplayed(cookieClose));
            } catch (Exception e) {
            }
        }else {
            System.out.println("Dismiss is not presented");
        }
	}
	public void clickonHeartburn101breadcrumbs() throws Throwable {
		clickElementUsingJavaScript(HeartBurn101breadcrumbs);
}
	
	public void clickonwhatcausesheartburnbreadcrumbs() throws Throwable {
		clickElementUsingJavaScript(whatcausesheartburnbreadcrumbs);
}		
	public void clickonheartburn() throws Throwable {
		clickElementUsingJavaScript(heartburn);
}		
	public void clickonspicy() throws Throwable {
		clickElementUsingJavaScript(spicy);
}		
	public void clickonheartburnduringpregancy() throws Throwable {
		clickElementUsingJavaScript(heartburnduringpregancy);
}		
	public void clickontums() throws Throwable {
		clickElementUsingJavaScript(tums);
}		
	public void clickonseeproducts() throws Throwable {
		clickElementUsingJavaScript(seeproducts);
}		
	
	
	
	
	
	
	
	

}
