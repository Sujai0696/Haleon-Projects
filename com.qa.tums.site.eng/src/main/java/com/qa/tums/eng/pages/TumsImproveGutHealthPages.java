package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class TumsImproveGutHealthPages extends BaseClass {
	public TumsImproveGutHealthPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="//a[contains(text(),'Heartburn 101 ')]")
    private static WebElement heartburn;
	

	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even \"])[2]")
    private static WebElement HomeiconBreadcrumbs;
	
	@FindBy(xpath="(//li[text()=' How to Improve Your Gut Health '])[2]")
    private static WebElement guthealthBreadcrumbs;
	
	@FindBy(xpath="//a[text()='See products']")
    private static WebElement seeproducts;
	
	
	
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
	
	public void clickonheartburns() throws Throwable {
		moveToElement(heartburn);
}
	

	public void clickonHomeiconBreadcrumbs() throws Throwable {
		//moveToElement(guthealth);
		//scrollPageInUpAndDown();
		clickElementUsingJavaScript(HomeiconBreadcrumbs);
		
}
	public void clickonguthealthBreadcrumbs() throws Throwable {
		//moveToElement(guthealth);
		//scrollPageInUpAndDown();
		clickElementUsingJavaScript(guthealthBreadcrumbs);
	
}
	public void clickonSeeproducts() throws Throwable {
		scrollDownUsingElement(seeproducts);
		moveToElement(seeproducts);
		//scrollPageInUpAndDown();
		clickElementUsingJavaScript(seeproducts);
	
}
}

