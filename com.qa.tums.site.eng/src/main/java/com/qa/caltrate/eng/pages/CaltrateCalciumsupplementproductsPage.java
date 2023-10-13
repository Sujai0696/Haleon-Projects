package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateCalciumsupplementproductsPage extends BaseClass{
	
	public CaltrateCalciumsupplementproductsPage() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Homebreadcrumbs;	
	
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
    private static WebElement Productsbreadcrumbs;	
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3/\"])[3]")
    private static WebElement Caltrate600D3;	
	
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[1]")
    private static WebElement Caltrate600D3_img;	
	
    @FindBy(xpath = "(//a[text()='BUY NOW'])[1]")
    private static WebElement Caltrate600D3_Buynow;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-soft-chews/\"])[3]")
    private static WebElement Caltrate600D3softchews;
	
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[2]")
    private static WebElement Caltrate600D3softchews_img;
	
    @FindBy(xpath = "(//a[text()='BUY NOW'])[2]")
    private static WebElement Caltrate600D3softchews_BuyNow;
	
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/gummy-bites/\"])[3]")
    private static WebElement Caltrategummybites;
	
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[3]")
    private static WebElement Caltrategummybites_img;
	
    @FindBy(xpath = "(//a[text()='BUY NOW'])[3]")
    private static WebElement Caltrategummybites_BuyNow;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals/\"])[3]")
    private static WebElement caltrate600D3Minerals;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[4]")
    private static WebElement caltrate600D3Minerals_img;
    
    @FindBy(xpath = "(//a[text()='BUY NOW'])[4]")
    private static WebElement caltrate600D3Minerals_BuyNow;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-chewables/\"])[3]")
    private static WebElement caltrate600D3Mineralschewables;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[5]")
    private static WebElement caltrate600D3Mineralschewables_img;
    
    @FindBy(xpath = "(//a[text()='BUY NOW'])[5]")
    private static WebElement caltrate600D3Mineralschewables_BuyNow;
    
    @FindBy(xpath = "(//a[@href=\"/calcium-supplement-products/600d3-plus-minerals-minis/\"])[3]")
    private static WebElement caltrate600D3MineralsMinis;
    
    @FindBy(xpath = "(//div[@class=\"image component section p-d-b-2 p-d-x-2 p-m-b-1 switchable-image title-center-d title-center-m odd col-xs-12\"])[6]")
    private static WebElement caltrate600D3MineralsMinis_img;
    
    @FindBy(xpath = "(//a[text()='BUY NOW'])[6]")
    private static WebElement caltrate600D3MineralsMinis_BuyNow;
    
    
    
    
    
    
    

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
	
	
	
	public void clickonHomebreadcrumbs() throws Throwable {
		elementClick(Homebreadcrumbs);
}
	public void clickonProductsbreadcrumbs() throws Throwable {
		elementClick(Productsbreadcrumbs);
}
	public void clickonCaltrate600D3() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3);
}
	public void clickonCaltrate600D3_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3_img);
}
	public void clickonCaltrate600D3_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3_Buynow);
}
	public void clickonCaltrate600D3softchews() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3softchews);
}
	public void clickonCaltrate600D3softchews_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3softchews_img);
}
	public void clickonCaltrate600D3softchews_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrate600D3softchews_BuyNow);
}
	public void clickonCaltrategummybites() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrategummybites);
}
	public void clickonCaltrategummybites_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrategummybites_img);
}
	public void clickonCaltrategummybites_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(Caltrategummybites_BuyNow);
}
	public void clickonCaltrate600D3Minerals() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Minerals);
}
	public void clickonCaltrate600D3Minerals_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Minerals_img);
}
	public void clickonCaltrate600D3Minerals_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Minerals_BuyNow);
}
	public void clickonCaltrate600D3Mineralschewables() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Mineralschewables);
}
	public void clickonCaltrate600D3Mineralschewables_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Mineralschewables_img);
}
	public void clickonCaltrate600D3Mineralschewables_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3Mineralschewables_BuyNow);
}
	public void clickonCaltrate600D3MineralsMinis() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3MineralsMinis);
}
	public void clickonCaltrate600D3MineralsMinis_img() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3MineralsMinis_img);
}
	public void clickonCaltrate600D3MineralsMinis_BuyNow() throws Throwable {
		waitForPageLoadJava();
		clickElementUsingJavaScript(caltrate600D3MineralsMinis_BuyNow);
}
	
	
	
	
	
	

}
