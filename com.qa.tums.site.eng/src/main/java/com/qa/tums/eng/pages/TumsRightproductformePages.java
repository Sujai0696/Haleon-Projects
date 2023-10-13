package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsRightproductformePages extends BaseClass{
	
	public TumsRightproductformePages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement whichtumsisrightforme;		
	
	@FindBy(xpath="//a[text()='TUMS Extra Strength 750']")
    private static WebElement tumsextrastrength;	
	
	@FindBy(xpath="//a[text()='TUMS Ultra Strength 1000']")
    private static WebElement tumsultrastrength;
	
	@FindBy(xpath="//a[text()='TUMS Sugar-Free']")
    private static WebElement tumsugarfree;
	
	@FindBy(xpath="//a[text()='TUMS Smoothies']")
    private static WebElement tumssmoothies;
	
	@FindBy(xpath="//a[text()='TUMS Chewy Delights']")
    private static WebElement tumsdelights;
	
	@FindBy(xpath="//a[text()='TUMS Chewy Bites']")
    private static WebElement tumschewybites;
	
	@FindBy(xpath="//a[text()='TUMS Chewy Bites Cooling Sensation']")
    private static WebElement tumschewybitescooling;
	
	@FindBy(xpath="//a[text()='TUMS Chewy Bites with Gas Relief']")
    private static WebElement tumschewybitesgasrelief;
	
	@FindBy(xpath="//a[text()='TUMS Naturals']")
    private static WebElement tumsnatural;
	
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
		
		public void clickonwhichtumsrightforme() throws Throwable {
			clickElementUsingJavaScript(whichtumsisrightforme);
	}
		public void clickonTumsextrastrength() throws Throwable {
			clickElementUsingJavaScript(tumsextrastrength);
	}
		public void clickonTumsultrastrength() throws Throwable {
			clickElementUsingJavaScript(tumsultrastrength);
	}
		public void clickonTumsugarfree() throws Throwable {
			clickElementUsingJavaScript(tumsugarfree);
	}
		public void clickonTumsdelight() throws Throwable {
			clickElementUsingJavaScript(tumsdelights);
	}
		public void clickonTumschewybittes() throws Throwable {
			clickElementUsingJavaScript(tumschewybites);
	}
		public void clickonchewybitescooling() throws Throwable {
			clickElementUsingJavaScript(tumschewybitescooling);
	}
		public void clickonchewybitesgarrelief() throws Throwable {
			clickElementUsingJavaScript(tumschewybitesgasrelief);
	}
	
		public void clickonTumsNatural() throws Throwable {
			clickElementUsingJavaScript(tumsnatural);
	}
	
		public void clickonseeproducts() throws Throwable {
			clickElementUsingJavaScript(seeproducts);
	}
	
	
	
	
	
	
	

}
