package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelWristPage extends BaseClass{
	
	public VoltarengelWristPage() {
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
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/']//self::a[text()='Exercises for Arthritis Pain Relief']")
    private static WebElement breadcrumbThree;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/wrist/']//self::a[text()='Wrist Exercises for Arthritis Pain Relief']")
    private static WebElement breadcrumbFour;
    
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/living-with-arthritis/managing-arthritis/work/']//self::a[text()='a day job']")
    private static WebElement hyperLinkADayJob;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/']//self::a[text()='arthritis pain']")
    private static WebElement hyperLinkArthritisPain;
    
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-voltaren/']//self::a[text()='Voltaren Arthritis Pain Gel']")
    private static WebElement hyperLinkVoltarenArthritisPainGel;
    
    @FindBy(xpath = "//a[@href='/understanding-pain/about-pain/']//self::a[text()='joint pain']")
    private static WebElement hyperLinkJointPain;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/']//self::a[text()='arthritis, exercise']")
    private static WebElement hyperLinkArthritisExercise;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//self::a[text()='help decrease your arthritis pain.']")
    private static WebElement hyperLinkHelpDecreaseYourArthritisPain;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
    private static WebElement showReference;
    
    @FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
    private static WebElement showReferenceClick;
    
    @FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferenceActive;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/natural-remedies/']//ancestor::strong[text()='READ MORE']")
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
	
	public void clickBreadcrumbFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			clickElementUsingJavaScript(breadcrumbFour);
			pageLoad();
			System.out.println("Breadcrumb Four clicked successfully");
		} else {
			System.out.println("Breadcrumb Four is not presented in the page");
			throw new Exception("Breadcrumb Four is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkADayJob() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkADayJob)) {
			scrollDownUsingElement(hyperLinkADayJob);
			clickElementUsingJavaScript(hyperLinkADayJob);
			pageLoad();
			System.out.println("Hyper Link A Day Job is clicked successfully");
		} else {
			System.out.println("Hyper Link A Day Job is not preseneted in the page");
			throw new Exception("Hyper Link A Day Job is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkArthritisPain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritisPain)) {
			scrollDownUsingElement(hyperLinkArthritisPain);
			clickElementUsingJavaScript(hyperLinkArthritisPain);
			pageLoad();
			System.out.println("Hyper Link Arthritis Pain is clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis Pain is not preseneted in the page");
			throw new Exception("Hyper Link Arthritis Pain is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkVoltarenArthritisPainGel() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkVoltarenArthritisPainGel)) {
			scrollDownUsingElement(hyperLinkVoltarenArthritisPainGel);
			clickElementUsingJavaScript(hyperLinkVoltarenArthritisPainGel);
			pageLoad();
			System.out.println("Hyper Link Voltaren Arthritis Pain Gel is clicked successfully");
		} else {
			System.out.println("Hyper Link Voltaren Arthritis Pain Gel is not preseneted in the page");
			throw new Exception("Hyper Link Voltaren Arthritis Pain Gel is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkJointPain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkJointPain)) {
			scrollDownUsingElement(hyperLinkJointPain);
			clickElementUsingJavaScript(hyperLinkJointPain);
			pageLoad();
			System.out.println("Hyper Link Joint Pain is clicked successfully");
		} else {
			System.out.println("Hyper Link Joint Pain is not preseneted in the page");
			throw new Exception("Hyper Link Joint Pain is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkArthritisExercise() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritisExercise)) {
			scrollDownUsingElement(hyperLinkArthritisExercise);
			clickElementUsingJavaScript(hyperLinkArthritisExercise);
			pageLoad();
			System.out.println("Hyper Link Arthritis Exercise is clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis Exercise is not preseneted in the page");
			throw new Exception("Hyper Link Arthritis Exercise is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkHelpDecreaseYourArthritisPain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHelpDecreaseYourArthritisPain)) {
			scrollDownUsingElement(hyperLinkHelpDecreaseYourArthritisPain);
			clickElementUsingJavaScript(hyperLinkHelpDecreaseYourArthritisPain);
			pageLoad();
			System.out.println("Hyper Link Help Decrease Your Arthritis Pain is clicked successfully");
		} else {
			System.out.println("Hyper Link Help Decrease Your Arthritis Pain is not preseneted in the page");
			throw new Exception("Hyper Link Help Decrease Your Arthritis Pain is not preseneted in the page");
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
