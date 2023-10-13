package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestVibrationMultiexpertPage extends BaseClass{
	
	public drbestVibrationMultiexpertPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//buynow-button[@finderpage='/content/cf-consumer-healthcare/oral-drbest/master/home/zahnbuersten/apothekensuche.html']")
		private static WebElement BuyNow1;				
	
		@FindBy(xpath = "//button[@class='bv-write-review bv-focusable bv-submission-button']")
		private static WebElement Review;	
	
		@FindBy(xpath = "//span[text()='Meine Bewertung für Dr.BEST Vibration Multiexpert Mittel']")
		private static WebElement Reviewtext;	
	
		@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
		private static WebElement ReviewClose;	
		
		@FindBy(xpath = "//a[@class='bv-rating-label bv-text-link bv-focusable']")
		private static WebElement Reviewslide;	
		
		
		
		
		
	
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
			
		public void clickonBuyNow1() throws Exception {
			waitForPageLoadJava();
			
			if (isElementPresent(BuyNow1)) {
				actionClick(BuyNow1);
			} else {
				throw new Exception("BuyNow is not Visible on Page");
			}
			pageLoad();
		}
		public void clickonReviewslider() throws Exception {
			waitForPageLoadJava();
			clickElementUsingJavaScript(Reviewslide);
			pageLoad();
		}
	
		public void clickonReview() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Review);
			clickElementUsingJavaScript(Review);
			visibilityOf(Reviewtext);
			boolean elementIsDisplayed=elementIsDisplayed(Reviewtext);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Reviewtext));
			clickElementUsingJavaScript(ReviewClose);
			pageLoad();
		}
	
	
	
	
	
	
	
	
	

}
