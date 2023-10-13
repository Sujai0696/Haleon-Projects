package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsheartburnduringpregancyPages extends BaseClass {
	
	public TumsheartburnduringpregancyPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement pregancydigestionremedies;	
	
	@FindBy(xpath="//u[text()='heartburn symptoms']")
    private static WebElement heartburnsymptoms;	
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/lifestyle-changes-to-reduce-heartburn/\"])[3]")
    private static WebElement lifestyle;	
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/heartburn-diet/\"])[3]")
    private static WebElement diet;	
	
	@FindBy(xpath="//a[text()='heartburn relief during pregnancy']")
    private static WebElement heartburnrelief;	
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/antacids/\"])[3]")
    private static WebElement antacids;	
	
	@FindBy(xpath="//a[text()='digestive issues']")
    private static WebElement digeastiveissues;	
	
	@FindBy(xpath="//a[text()='TUMS site']")
    private static WebElement tumsite;	
	
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
	
	public void clickonpregancydigestionremedies() throws Throwable {
		clickElementUsingJavaScript(pregancydigestionremedies);
}	
	public void clickonheartburnsymptoms() throws Throwable {
		clickElementUsingJavaScript(heartburnsymptoms);
}	
	public void clickondiet() throws Throwable {
		clickElementUsingJavaScript(diet);
}	
	public void clickonheartburnrelief() throws Throwable {
		clickElementUsingJavaScript(heartburnrelief);
}	
	public void clickonantacids() throws Throwable {
		clickElementUsingJavaScript(antacids);
}	
	public void clickondigestiveissues() throws Throwable {
		clickElementUsingJavaScript(digeastiveissues);
}	
	public void clickontumsite() throws Throwable {
		clickElementUsingJavaScript(tumsite);
}	
	public void clickonseeproducts() throws Throwable {
		clickElementUsingJavaScript(seeproducts);
}	
	
	
	
	

}
