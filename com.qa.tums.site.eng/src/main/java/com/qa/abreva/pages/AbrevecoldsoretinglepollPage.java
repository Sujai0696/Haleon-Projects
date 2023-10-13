package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevecoldsoretinglepollPage extends BaseClass{
	
	public AbrevecoldsoretinglepollPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
		
	@FindBy(xpath = "//a[text()='Lip Care']")
	private static WebElement lipcare;
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare_txt;
	
	@FindBy(xpath = "//span[text()='GET COUPON']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//h1[text()='Abreva Coupons']")
	private static WebElement getcoupons_txt;
	
	@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
	private static WebElement BuyNow1;
	
	@FindBy(xpath = "//h2[text()='Oral Care Pump']")
	private static WebElement BuyNow1_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow1_Close;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Methods//
	
			public void clickonCookieBtn() throws Exception {
				waitForPageLoadJava();
				if(isElementPresent(cookieBtn)) {
					elementToBeClickable(cookieBtn);
					try {
						if(cookieBtn.isDisplayed()) {
							clickElementUsingJavaScript(cookieBtn);
						}
						implicitWait();
						visibilityOf(cookieClose);
						Assert.assertTrue(elementIsDisplayed(cookieClose));
					}
					catch (Exception e) {
						
					}
				}else {
					System.out.println("Dismiss is not presented");
					throw new Exception("Unable to click on cookie Pop-up");
				}
				}
			public void clickonlipcare() throws Exception {	
				waitForPageLoadJava();
				moveToElement(lipcare);
				clickElementUsingJavaScript(lipcare);
				visibilityOf(lipcare_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(lipcare_txt));
				pageLoad();
			}	
			public void clickonGetCoupons() throws Exception {	
				waitForPageLoadJava();
			//	scrollDownUsingElement(getcoupons);
				if (isElementPresent(getcoupons)) {
					clickElementUsingJavaScript(getcoupons);
					scrollDownUsingElement(getcoupons_txt);
					visibilityOf(getcoupons_txt);
					boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(getcoupons_txt));
				} else {
					throw new Exception("Get Coupons is not present on Page");
				}
				
				pageLoad();
			}
			public void clickonBuyNow1() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(BuyNow1);
				//moveToElement(BuyNow1);
				clickElementUsingJavaScript(BuyNow1);
				//scrollDownUsingElement(weatherwinter_txt);
				visibilityOf(BuyNow1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNow1_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(BuyNow1_txt));
				clickElementUsingJavaScript(BuyNow1_Close);
				pageLoad();
			}
	
	
	
	
	
	
	

}
