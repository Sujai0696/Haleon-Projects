package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelStressPage extends BaseClass{
	
	public VoltarengelStressPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "//h2[@class='footer__gigya-heading ']//self::h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
    @FindBy(xpath = "//a[@href='/']//self::a[normalize-space()='Homepage']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/']//self::a[text()='Living with Arthritis']")
    private static WebElement breadcrumbTwo;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/stress/']//self::a[text()='Stress and Arthritis']")
    private static WebElement breadcrumbThree;
    
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-arthritis/symptoms/']//self::a[text()='arthritis']")
    private static WebElement hyperLinkArthritis;
    
    @FindBy(xpath = "//a[@href='http://blog.arthritis.org/living-with-arthritis/stress-anxiety-arthritis/']//self::a[text()='Arthritis Foundation']")
    private static WebElement hyperLinkArthritisFoundation;
    
    @FindBy(xpath = "//a[@href='http://www.orthop.washington.edu/patient-care/articles/arthritis/stress-and-arthritis.html']//self::a[text()='certain chemicals']")
    private static WebElement hyperLinkCertainChemical;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/']//self::a[text()='exercising']")
    private static WebElement hyperLinkExercising;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/']//self::a[text()='control your pain']")
    private static WebElement hyperLinkControlYourPain;
    
    @FindBy(xpath = "//a[@href='/what-is-voltaren/']//self::a[text()='Voltaren']")
    private static WebElement hyperLinkVoltaren;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
    private static WebElement showReference;
    
    @FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
    private static WebElement showReferenceClick;
    
    @FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferenceActive;
    
    @FindBy(xpath = "//a[@href='/understanding-pain/arthritis-weather/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/effects-of-aging-on-the-body/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreTwo;
    
    @FindBy(xpath = "//a[@href='/samples-and-coupons/coupons/']//self::a[text()='Get Coupons']")
    private static WebElement getCoupons;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::button[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
    private static WebElement buyNow;
    
    @FindBy(xpath = "//div[contains(text(),'Shopping Bag')]/..//img[@alt='close cart icon']")
    private static WebElement buyNowCloseIcon;
    
    @FindBy(xpath = "//div[contains(@style,'background-color: initial;')]")
    private static WebElement verifyBuyNowClose;
    
    
    public void clickBuyNow() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(buyNow)) {
    		scrollDownUsingElement(buyNow);
    		clickElementUsingJavaScript(buyNow);
    		visibilityOf(buyNowCloseIcon);
    		Assert.assertTrue(elementIsDisplayed(buyNowCloseIcon));
    		clickElementUsingJavaScript(buyNowCloseIcon);
    		visibilityOf(verifyBuyNowClose);
    		Assert.assertTrue(elementIsDisplayed(verifyBuyNowClose));
    		System.out.println("Buy Now button successfully verified");
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
	}
    
    
    
    
    public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickBreadcrumbThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickHyperLinkArthritis() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritis)) {
			clickElementUsingJavaScript(hyperLinkArthritis);
			pageLoad();
			System.out.println("Hyper Link Arthritis clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis is not presented in the page");
			throw new Exception("Hyper Link Arthritis is not presented in the page");
		}
	}
	
	public void clickHyperLinkArthritisFoundation() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritisFoundation)) {
			clickElementUsingJavaScript(hyperLinkArthritisFoundation);
			pageLoad();
			System.out.println("Hyper Link Arthritis Foundation clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis Foundation is not presented in the page");
			throw new Exception("Hyper Link Arthritis Foundation is not presented in the page");
		}
	}
	
	public void clickHyperLinkCertainChemical() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkCertainChemical)) {
			clickElementUsingJavaScript(hyperLinkCertainChemical);
			pageLoad();
			System.out.println("Hyper Link Certain Chemical clicked successfully");
		} else {
			System.out.println("Hyper Link Certain Chemical is not presented in the page");
			throw new Exception("Hyper Link Certain Chemical is not presented in the page");
		}
	}
	
	public void clickHyperLinkExercising() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkExercising)) {
			clickElementUsingJavaScript(hyperLinkExercising);
			pageLoad();
			System.out.println("Hyper Link Exercising clicked successfully");
		} else {
			System.out.println("Hyper Link Exercising is not presented in the page");
			throw new Exception("Hyper Link Exercising is not presented in the page");
		}
	}
	
	public void clickHyperLinkControlYourPain() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkControlYourPain)) {
			clickElementUsingJavaScript(hyperLinkControlYourPain);
			pageLoad();
			System.out.println("Hyper Link Control Your Pain clicked successfully");
		} else {
			System.out.println("Hyper Link Control Your Pain is not presented in the page");
			throw new Exception("Hyper Link Control Your Pain is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkVoltaren() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkVoltaren)) {
			clickElementUsingJavaScript(hyperLinkVoltaren);
			pageLoad();
			System.out.println("Hyper Link Voltaren clicked successfully");
		} else {
			System.out.println("Hyper Link Voltaren is not presented in the page");
			throw new Exception("Hyper Link Voltaren is not presented in the page");
		}
	}
	
	
	
	
	
	
	
	public void clickShowReference() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(showReferenceClick)) {
			scrollDownUsingElement(showReferenceClick);
			clickElementUsingJavaScript(showReferenceClick);
			visibilityOf(showReferenceActive);
			Assert.assertTrue(elementIsDisplayed(showReferenceActive));
			clickElementUsingJavaScript(showReferenceClick);
			visibilityOf(showReferenceClick);
			Assert.assertTrue(elementIsDisplayed(showReference));
			System.out.println("Show reference is successfully verified");
		} else {
			System.out.println("Show Reference is not presented in the page");
			throw new Exception("Show Reference is not presented in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreOne)) {
			scrollDownUsingElement(relatedArticleReadMoreOne);
			clickElementUsingJavaScript(relatedArticleReadMoreOne);
			pageLoad();
			System.out.println("Related Article Read More One is clicked successfully");
		} else {
			System.out.println("Related Article Read More One is not preseneted in the page");
			throw new Exception("Related Article Read More One is not preseneted in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreTwo)) {
			scrollDownUsingElement(relatedArticleReadMoreTwo);
			clickElementUsingJavaScript(relatedArticleReadMoreTwo);
			pageLoad();
			System.out.println("Related Article Read More Two is clicked successfully");
		} else {
			System.out.println("Related Article Read More Two is not preseneted in the page");
			throw new Exception("Related Article Read More Two is not preseneted in the page");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(getCoupons)) {
			scrollDownUsingElement(getCoupons);
			clickElementUsingJavaScript(getCoupons);
			pageLoad();
			System.out.println("Get Coupons is clicked successfully");
		} else {
			System.out.println("Get Couponsis not preseneted in the page");
			throw new Exception("Get Coupons is not preseneted in the page");
		}
	}

}
