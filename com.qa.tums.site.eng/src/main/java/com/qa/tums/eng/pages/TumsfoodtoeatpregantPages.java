package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsfoodtoeatpregantPages extends BaseClass{
	
	public TumsfoodtoeatpregantPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement foodtoeatpregancy;	
	
	@FindBy(xpath="//a[text()='foods to avoid early on in your pregnancy']")
    private static WebElement foodtoavoidpregancy;	
	
	@FindBy(xpath="//a[text()='occurrence of heartburn']")
    private static WebElement occuranceheartburn;	
	
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
			
			public void clickonfoodtoeatpregancy() throws Throwable {
				clickElementUsingJavaScript(foodtoeatpregancy);
		}		
			public void clickonfoodtoavoidtpregancy() throws Throwable {
				clickElementUsingJavaScript(foodtoavoidpregancy);
		}		
			public void clickonoccuranceheartburn() throws Throwable {
				clickElementUsingJavaScript(occuranceheartburn);
		}		
			public void clickonseeproducts() throws Throwable {
				clickElementUsingJavaScript(seeproducts);
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
