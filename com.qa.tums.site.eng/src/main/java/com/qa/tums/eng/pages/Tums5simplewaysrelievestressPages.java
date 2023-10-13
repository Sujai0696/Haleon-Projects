package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class Tums5simplewaysrelievestressPages extends BaseClass{
	
	public Tums5simplewaysrelievestressPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement fivewaysrelievestress;	
	
	@FindBy(xpath="//a[text()='stress can be detrimental']")
    private static WebElement stressdetrimental;	
	
	@FindBy(xpath="//a[text()='well-balanced diet']")
    private static WebElement wellbalanceddiet;	
	
	@FindBy(xpath="//a[text()='Daily workouts']")
    private static WebElement dailyworkouts;	
	
	@FindBy(xpath="//a[text()='heartburn triggers']")
    private static WebElement heartburntriggers;
	
	@FindBy(xpath="//a[text()='lifestyle changes to reduce heartburn']")
    private static WebElement lifestylechangeheartburn;
	
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
	
	public void clickonfivewaysrelievestress() throws Throwable {
		clickElementUsingJavaScript(fivewaysrelievestress);
}
	public void clickonstressditrimental() throws Throwable {
		clickElementUsingJavaScript(stressdetrimental);
}
	public void clickonwellbalanceddiet() throws Throwable {
		clickElementUsingJavaScript(wellbalanceddiet);
}
	public void clickondailyworkouts() throws Throwable {
		clickElementUsingJavaScript(dailyworkouts);
}
	public void clickonheartburntriggers() throws Throwable {
		clickElementUsingJavaScript(heartburntriggers);
}
	public void clickonlifestylechangeheartburn() throws Throwable {
		clickElementUsingJavaScript(lifestylechangeheartburn);
}
	public void clickonseeproducts() throws Throwable {
		clickElementUsingJavaScript(seeproducts);
}
	
	
	
	

}
