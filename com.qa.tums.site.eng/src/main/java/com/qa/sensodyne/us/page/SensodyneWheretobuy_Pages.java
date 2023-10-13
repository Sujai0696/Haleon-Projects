package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneWheretobuy_Pages extends BaseClass{
	
	public SensodyneWheretobuy_Pages() {
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
	
    @FindBy(xpath = "//input[@class=\"ps-product-finder-textbox ps-float-box\"]")
    private static WebElement findspecificproduct;
	
    @FindBy(xpath = "//input[@class=\"ps-product-finder-textbox ps-float-box\"]")
    private static WebElement Sensodyne;
	
    @FindBy(xpath = "(//div[@class=\"ps-column-headers ps-float-box\"])//label[1]")
    private static WebElement BuyOnline;
	
    @FindBy(xpath = "(//div[@class=\"ps-column-headers ps-float-box\"])//label[2]")
    private static WebElement Buylocal;
	
    @FindBy(xpath = "(//div[@class=\"ps-input-holder ps-float-box\"])//child::input")
    private static WebElement search;
	
    @FindBy(xpath = "(//div[@class=\"ps-online-sellers ps-float-box\"])")
    private static WebElement retailers;
 
    @FindBy(xpath = "//a[text()='Explore Our Products']")
    private static WebElement exploreproducts;
	
    @FindBy(xpath = "//a[text()='Save $1']")
    private static WebElement save1;
    
    
    
	
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
    
    public void  clickOnwheretobuyBreadcrumbs() throws Exception {
    	moveToElement(wheretobuy);
    	clickElementUsingJavaScript(wheretobuy);
    }
    public void  clickOnfindspecificproduct() throws Exception {
    	moveToElement(findspecificproduct);
    	clickElementUsingJavaScript(findspecificproduct);
    	elementSendKeys(findspecificproduct, "Sensodyne");
    	clickElementUsingJavaScript(Sensodyne);
    }
    public void  clickOnBuyonline() throws Exception {
    	moveToElement(BuyOnline);
    	clickElementUsingJavaScript(BuyOnline);
    	boolean elementIsDisplayed=elementIsDisplayed(BuyOnline);
    	Assert.assertTrue(elementIsDisplayed);
    }
    public void  clickOnBuylocal() throws Exception {
    	moveToElement(Buylocal);
    	clickElementUsingJavaScript(Buylocal);
    	boolean elementIsDisplayed=elementIsDisplayed(Buylocal);
    	Assert.assertTrue(elementIsDisplayed);
    }
    public void  clickOnsearch() throws Exception {
    	moveToElement(search);
    	clickElementUsingJavaScript(search);
    	elementSendKeys(findspecificproduct, "Mumbai");
    	
    }
    public void  clickOnretailers() throws Exception {
    	clickElementUsingJavaScript(retailers);
    	boolean elementIsDisplayed=elementIsDisplayed(retailers);
    	Assert.assertTrue(elementIsDisplayed);
    }
    public void  clickOnexploreproducts() throws Exception {
    	clickElementUsingJavaScript(exploreproducts);
    }
    public void  clickOnsave1() throws Exception {
    	clickElementUsingJavaScript(save1);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
