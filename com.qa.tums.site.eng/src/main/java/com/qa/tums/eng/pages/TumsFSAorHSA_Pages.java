package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsFSAorHSA_Pages extends BaseClass{
	

	public TumsFSAorHSA_Pages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement HSAorFSAbreadcrumbs;	
	
	@FindBy(xpath="(//h2[@class=\"accordion-title component\"])[1]")
    private static WebElement purchaseFSAorHSA;
	
	@FindBy(xpath="(//ul[@id=\"accordion-root-2113037462\"]//li[1])[2]")
    private static WebElement purchaseFSAorHSA_open;
	
	@FindBy(xpath="//span[text()='Using My FSA to Purchase TUMS Products']")
    private static WebElement myFSA;
	
	@FindBy(xpath="(//div[@class=\"richText component section default-style first odd last col-xs-12\"])[2]")
    private static WebElement myFSA_open;
	
	@FindBy(xpath="//span[text()='Using My HSA to Purchase TUMS Products']")
    private static WebElement myHSA ;
	
	@FindBy(xpath="(//div[@class=\"accordion-content-wrapper\"])[3]")
    private static WebElement myHSA_open;
	
	@FindBy(xpath="//a[text()='TUMS Chewy Bites']")
    private static WebElement Chewybites;
	
	@FindBy(xpath="//a[text()='TUMS Ultra Strength']")
    private static WebElement ultrastrength;
	
	@FindBy(xpath="//a[text()='TUMS Regular Strength']")
    private static WebElement Regularstrength;
	
	@FindBy(xpath="//span[text()='Questions about TUMS Products?']")
    private static WebElement questionproducts;
	
	@FindBy(xpath="(//div[@class=\"accordion-content-wrapper\"])[4]")
    private static WebElement questionproducts_open;
	
	@FindBy(xpath="//a[text()='Our FAQ Center']")
    private static WebElement ourFAQcenter;
	
	@FindBy(xpath="//a[@id=\"wheretobuy\"]")
    private static WebElement wheretobuy;
	
	@FindBy(xpath="//a[@id=\"getcoupons\"]")
    private static WebElement getcoupons;
	
	
	
	
	
	
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
				public void clickonHSAorFSAbreadcrumbs() throws Throwable {
					clickElementUsingJavaScript(HSAorFSAbreadcrumbs);
			}
				public void clickonPurchaseHSAorFSA() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					elementClick(purchaseFSAorHSA);
					visibilityOf(purchaseFSAorHSA_open);
					boolean elementIsDisplayed=elementIsDisplayed(purchaseFSAorHSA_open);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(purchaseFSAorHSA_open);
					
			}
				public void clickonmyFSA() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(myFSA);
					visibilityOf(myFSA_open);
					boolean elementIsDisplayed=elementIsDisplayed(myFSA_open);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(myFSA_open);
					
			}
				public void clickonmyHSA() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(myHSA);
					//visibilityOf(myHSA_open);
					boolean elementIsDisplayed=elementIsDisplayed(myHSA_open);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(myHSA_open);
					
			}
				public void clickonChewyBites() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(Chewybites);
				}
				public void clickonUltrastrength() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(ultrastrength);
				}
				public void clickonRegularstrength() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(Regularstrength);
				}
				public void clickonquestionproduct() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(questionproducts);
					//visibilityOf(myHSA_open);
					boolean elementIsDisplayed=elementIsDisplayed(questionproducts_open);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(questionproducts_open);
					
			}
				public void clickonOurFAQCenter() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(ourFAQcenter);
				}
				public void clickonwheretobuy() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(wheretobuy);
				}
				public void clickongetcoupons() throws Throwable {
					//moveToElement(purchaseFSAorHSA);
					clickElementUsingJavaScript(getcoupons);
				}
	
	
	
	
	

}
