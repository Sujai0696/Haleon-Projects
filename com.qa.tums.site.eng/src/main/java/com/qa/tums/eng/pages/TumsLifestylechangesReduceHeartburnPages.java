package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsLifestylechangesReduceHeartburnPages extends BaseClass{
	
	public TumsLifestylechangesReduceHeartburnPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[text()=' Lifestyle Changes to Reduce Heartburn '])[2]")
    private static WebElement Lifestylechangesbreadcrumbs;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/causes/foods-that-cause-heartburn/\"])[3]")
    private static WebElement foodcausesheartburn;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/causes/\"])[3]")
    private static WebElement heartburncauses;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/\"])[3]")
    private static WebElement antacid;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/heartburn-diet/\"])[3]")
    private static WebElement howdietcauseheartburn;
	
	@FindBy(xpath="//a[text()='great-tasting TUMS antacid products']")
    private static WebElement greattastingTums;
	
	@FindBy(xpath="//a[text()='where to buy TUMS']")
    private static WebElement WheretobuyTums;
	
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
	
	public void clickonlifestylechangesbreadcrumbs() throws Throwable {
		clickElementUsingJavaScript(Lifestylechangesbreadcrumbs);
}
	public void clickonfoodcausesheartburn() throws Throwable {
		clickElementUsingJavaScript(foodcausesheartburn);
}
	public void clickonheartburncauses() throws Throwable {
		clickElementUsingJavaScript(heartburncauses);
}
	public void clickonantacids() throws Throwable {
		clickElementUsingJavaScript(antacid);
}
	public void clickonhowdietcauseheartburn() throws Throwable {
		clickElementUsingJavaScript(howdietcauseheartburn);
}
	public void clickongreattastingtums() throws Throwable {
		clickElementUsingJavaScript(greattastingTums);
}
	public void clickonwheretobuytums() throws Throwable {
		clickElementUsingJavaScript(WheretobuyTums);
}
	public void clickonseeproducts() throws Throwable {
		clickElementUsingJavaScript(seeproducts);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
