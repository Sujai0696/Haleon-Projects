package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsHeartburndietPages extends BaseClass{
	
	public TumsHeartburndietPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement heartburndiet;	
	
	@FindBy(xpath="//a[text()='Spicy foods']")
    private static WebElement spicyfood;
	
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
	
		public void clickonHeartburn101breadcrumbs() throws Throwable {
			clickElementUsingJavaScript(HeartBurn101breadcrumbs);
	}
		
		public void clickonheartburndiet() throws Throwable {
			clickElementUsingJavaScript(heartburndiet);
	}
		public void clickonspicyfood() throws Throwable {
			clickElementUsingJavaScript(spicyfood);
	}
		public void clickonseeproducts() throws Throwable {
			clickElementUsingJavaScript(seeproducts);
	}
	
	
	
	
	
	
	
	

}
