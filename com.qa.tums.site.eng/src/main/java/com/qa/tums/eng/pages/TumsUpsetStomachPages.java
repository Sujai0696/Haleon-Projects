package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class TumsUpsetStomachPages  extends BaseClass {
	
	public TumsUpsetStomachPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	
	@FindBy(xpath="//a[contains(text(),'Heartburn 101 ')]")
    private static WebElement heartburn;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even \"])[2]")
    private static WebElement upsetstomachHomeicon;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
    private static WebElement upsetstomachBreadcrumbs;
	
//	@FindBy(xpath = "(//a[@title='twitter'])[1]")
//	private static WebElement HeadTwitter;
//	
//	@FindBy(xpath = "(//a[@title='facebook'])[1]")
//	private static WebElement HeadFacebook;
//	
//	@FindBy(xpath = "(//a[@title='Email'])[1]")
//	private static WebElement email;
	
	@FindBy(xpath = "//a[text()='Indigestion and heartburn']")
	private static WebElement indigestionheart;
	
	@FindBy(xpath = "//a[text()='heartburn']")
	private static WebElement heartburns;
	
	@FindBy(xpath = "//a[text()='GERD']")
	private static WebElement gerd;
	
	@FindBy(xpath = "//a[@href=\"https://www.tums.com/amp/reasons-salad-upset-stomach.html\"]//self::a")
	private static WebElement trysalad;
	
	@FindBy(xpath = "//a[text()='See products']")
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
                actionClick(cookieClose);
            } catch (Exception e) {
            }
        }else {
            System.out.println("Dismiss is not presented");
        }
	}
	

	public void clickonupsetstomach() throws Throwable {
		moveToElement(upsetstomachHomeicon);
		clickElementUsingJavaScript(upsetstomachHomeicon);
}
	public void clickonupsetstomachBreadcrumbs() throws Throwable {
		moveToElement(upsetstomachBreadcrumbs);
		clickElementUsingJavaScript(upsetstomachBreadcrumbs);
}
	
//	
	public void clickonindigsetionheartbuen() throws Throwable {
		scrollDownUsingElement(indigestionheart);
		moveToElement(indigestionheart);
		clickElementUsingJavaScript(indigestionheart);
		
		}
	public void clickonheartburns() throws Throwable {
		scrollDownUsingElement(heartburns);
		moveToElement(heartburns);
		clickElementUsingJavaScript(heartburns);
		
		}
	public void clickongerd() throws Throwable {
		scrollDownUsingElement(gerd);
		moveToElement(gerd);
		clickElementUsingJavaScript(gerd);
		
		}
	public void clickontrysalad() throws Throwable {
		scrollDownUsingElement(trysalad);
		moveToElement(trysalad);
		clickElementUsingJavaScript(trysalad);
		
		}
	public void clickonseeproducts() throws Throwable {
		scrollDownUsingElement(seeproducts);
		moveToElement(seeproducts);
		clickElementUsingJavaScript(seeproducts);
		
		}
	
}