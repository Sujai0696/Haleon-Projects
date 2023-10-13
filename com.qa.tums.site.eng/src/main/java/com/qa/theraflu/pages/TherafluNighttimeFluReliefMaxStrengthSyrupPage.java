package com.qa.theraflu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TherafluNighttimeFluReliefMaxStrengthSyrupPage extends BaseClass{
	
	public TherafluNighttimeFluReliefMaxStrengthSyrupPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home' and @href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Products' and @href='/products/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Nighttime Flu Relief Max Strength Syrup']")
	private static WebElement breadcrumbThree;
	
	
	@FindBy(xpath = "//button[text()='Write a review ']")
	private static WebElement btnWriteAReview;
	
	@FindBy(xpath = "//span[text()='My Review for THERAFLU MAX STRENGTH RELIEF NT 8.3OZ']")
	private static WebElement txtReview;
	
	@FindBy(xpath = "//button[@name='Cancel']")
	private static WebElement btnReviewClose;
	
	@FindBy(xpath = "//div[@class='bv-mbox-overlay bv-hiding bv-mbox-overlay-hide']")
	private static WebElement btnReviewCloseVerify;
	
	
	@FindBy(xpath = "//span[@class='ps-button-label' and text()='BUY NOW']")
	private static WebElement buyNow;

	@FindBy(xpath = "//div[contains(@class,'ps-open')]")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//a[@tabindex='0' and @aria-hidden='false']")
	private static WebElement buyNowCloseVerify;
	
	@FindBy(xpath = "//a[@href='/coupon/' and text()='GET COUPON']")
	private static WebElement getCoupon;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail odd first']")
	private static WebElement imgOne;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail odd first is-active ']")
	private static WebElement imgActiveOne;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail odd first is-active']")
	private static WebElement imgDummmyActiveOne;
	
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail even ']")
	private static WebElement imgTwo;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail even is-active']")
	private static WebElement imgActiveTwo;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail odd']")
	private static WebElement imgThree;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail odd is-active']")
	private static WebElement imgActiveThree;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail even last']")
	private static WebElement imgFour;
	
	@FindBy(xpath = "//li[@class='imageGallery-thumbnail even last is-active']")
	private static WebElement imgActiveFour;
	
	
	
	@FindBy(xpath = "//span[text()='Product Benefits']//ancestor::header[@class='accordion-head']")
	private static WebElement AccOne;
	
	@FindBy(xpath = "//span[text()='Product Benefits']//ancestor::li[@class='accordion-slide is-active first odd']")
	private static WebElement AccActiveOne;
	
	@FindBy(xpath = "//span[text()='Product Benefits']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement AccCloseOne;
	
	
	
	@FindBy(xpath = "//span[text()='Directions for Use']//ancestor::header[@class='accordion-head']")
	private static WebElement AccTwo;
	
	@FindBy(xpath = "//span[text()='Directions for Use']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement AccActiveTwo;
	
	@FindBy(xpath = "//span[text()='Directions for Use']//ancestor::li[@class='accordion-slide even']")
	private static WebElement AccCloseTwo;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::header[@class='accordion-head']")
	private static WebElement AccThree;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement AccActiveThree;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement AccCloseThree;
	
	@FindBy(xpath = "//span[text()='Product warnings/Advisory Information']//ancestor::header[@class='accordion-head']")
	private static WebElement AccFour;
	
	@FindBy(xpath = "//span[text()='Product warnings/Advisory Information']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement AccActiveFour;
	
	@FindBy(xpath = "//span[text()='Product warnings/Advisory Information']//ancestor::li[@class='accordion-slide even']")
	private static WebElement AccCloseFour;
	
	@FindBy(xpath = "//span[text()='FSA/HSA Eligibility']//ancestor::header[@class='accordion-head']")
	private static WebElement AccFive;
	
	@FindBy(xpath = "//span[text()='FSA/HSA Eligibility']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement AccActiveFive;
	
	@FindBy(xpath = "//span[text()='FSA/HSA Eligibility']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement AccCloseFive;
	
	@FindBy(xpath = "//h3[text()='Daytime Flu Relief Max Strength Hot Liquid Powder']//ancestor::div[@class='box component section flex flex-col p-d-1 p-m-1 align-content-flex-start-d anchor-box last-down first odd last col-xs-12']")
	private static WebElement featuredProductsOne;
	
	@FindBy(xpath = "//h3[text()='Day/Night Flu Relief Max Strength Caplets Value Pack']//ancestor::div[@class='box component section flex flex-col p-d-1 p-m-1 align-content-flex-start-d anchor-box last-down first odd last col-xs-12']")
	private static WebElement featuredProductsTwo;
	
	@FindBy(xpath = "//h3[text()='Day/ Night Flu Relief Max Strength Syrup Value Pack']//ancestor::div[@class='box component section flex flex-col p-d-1 p-m-1 align-content-flex-start-d anchor-box last-down first odd last col-xs-12']")
	private static WebElement featuredProductsThree;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("breadcrumbTwo clicked successfully");
		} else {
			System.out.println("breadcrumbTwo is not presented in the page");
			throw new Exception("breadcrumbTwo is not presented in the page");
		}
	}
	

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickWriteReview() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnWriteAReview)) {
			scrollDownUsingElement(btnWriteAReview);
			clickElementUsingJavaScript(btnWriteAReview);
			visibilityOf(txtReview);
			Assert.assertTrue(elementIsDisplayed(txtReview));
			clickElementUsingJavaScript(btnReviewClose);
			visibilityOf(btnReviewCloseVerify);
			Assert.assertTrue(elementIsDisplayed(btnReviewCloseVerify));
			System.out.println("Write Review verified successfully");
		} else {
			System.out.println("Write Review is not presented in the page");
			throw new Exception("Write Review is not presented in the page");
		}
	}
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			clickElementUsingJavaScript(buyNow);
			visibilityOf(buyNowText);
			Assert.assertTrue(elementIsDisplayed(buyNowText));
			clickElementUsingJavaScript(buyNowClose);
			visibilityOf(buyNowCloseVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseVerify));
			System.out.println("Buy Now verified successfully");
		} else {
			System.out.println("Buy Now is not presented in the page");
			throw new Exception("Buy Now is not presented in the page");
		}
	}
	
	public void clickGetCoupon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(getCoupon)) {
			scrollDownUsingElement(getCoupon);
			clickElementUsingJavaScript(getCoupon);
			pageLoad();
			System.out.println("getCoupon clicked successfully");
		} else {
			System.out.println("getCoupon is not presented in the page");
			throw new Exception("getCoupon is not presented in the page");
		}
	}
	
	public void clickImgCarousel() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(imgActiveOne)) {
			scrollDownUsingElement(imgActiveOne);
			clickElementUsingJavaScript(imgTwo);
			visibilityOf(imgActiveTwo);
			Assert.assertTrue(elementIsDisplayed(imgActiveTwo));
			pageLoad();
			clickElementUsingJavaScript(imgThree);
			visibilityOf(imgActiveThree);
			Assert.assertTrue(elementIsDisplayed(imgActiveThree));
			pageLoad();
			clickElementUsingJavaScript(imgFour);
			visibilityOf(imgActiveFour);
			Assert.assertTrue(elementIsDisplayed(imgActiveFour));
			pageLoad();
			clickElementUsingJavaScript(imgOne);
			visibilityOf(imgDummmyActiveOne);
			Assert.assertTrue(elementIsDisplayed(imgDummmyActiveOne));
			System.out.println("Image section verified successfully");
		} else {
			System.out.println("Image Active One is not presented in the page");
			throw new Exception("Image Active One is not presented in the page");
		}
		
	}
	
	
	public void clickAllAcc() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(AccActiveOne)) {
			scrollDownUsingElement(AccActiveOne);
			clickElementUsingJavaScript(AccOne);
			visibilityOf(AccCloseOne);
			Assert.assertTrue(elementIsDisplayed(AccCloseOne));
			System.out.println("Accordion One verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccTwo);
			clickElementUsingJavaScript(AccTwo);
			visibilityOf(AccActiveTwo);
			Assert.assertTrue(elementIsDisplayed(AccActiveTwo));
			clickElementUsingJavaScript(AccTwo);
			visibilityOf(AccCloseTwo);
			Assert.assertTrue(elementIsDisplayed(AccCloseTwo));
			System.out.println("Accordion Two verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccThree);
			clickElementUsingJavaScript(AccThree);
			visibilityOf(AccActiveThree);
			Assert.assertTrue(elementIsDisplayed(AccActiveThree));
			clickElementUsingJavaScript(AccThree);
			visibilityOf(AccCloseThree);
			Assert.assertTrue(elementIsDisplayed(AccCloseThree));
			System.out.println("Accordion Three verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccFour);
			clickElementUsingJavaScript(AccFour);
			visibilityOf(AccActiveFour);
			Assert.assertTrue(elementIsDisplayed(AccActiveFour));
			clickElementUsingJavaScript(AccFour);
			visibilityOf(AccCloseFour);
			Assert.assertTrue(elementIsDisplayed(AccCloseFour));
			System.out.println("Accordion Four verified Successfully");
			
			pageLoad();
			scrollDownUsingElement(AccFive);
			clickElementUsingJavaScript(AccFive);
			visibilityOf(AccActiveFive);
			Assert.assertTrue(elementIsDisplayed(AccActiveFive));
			clickElementUsingJavaScript(AccFive);
			visibilityOf(AccCloseFive);
			Assert.assertTrue(elementIsDisplayed(AccCloseFive));
			System.out.println("Accordion Five verified Successfully");
			
			
		} else {
			System.out.println("Acc Active One is not presented in the page");
			throw new Exception("Acc Active One is not presented in the page");
		}
	}
	
	public void clickFeaturedProductsOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredProductsOne)) {
			scrollDownUsingElement(featuredProductsOne);
			clickElementUsingJavaScript(featuredProductsOne);
			pageLoad();
			System.out.println("featuredProductsOne clicked successfully");
		} else {
			System.out.println("featuredProductsOne is not presented in the page");
			throw new Exception("featuredProductsOne is not presented in the page");
		}
	}
	
	public void clickFeaturedProductsTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredProductsTwo)) {
			scrollDownUsingElement(featuredProductsTwo);
			clickElementUsingJavaScript(featuredProductsTwo);
			pageLoad();
			System.out.println("featuredProductsTwo clicked successfully");
		} else {
			System.out.println("featuredProductsTwo is not presented in the page");
			throw new Exception("featuredProductsTwo is not presented in the page");
		}
	}
	
	public void clickFeaturedProductsThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(featuredProductsThree)) {
			scrollDownUsingElement(featuredProductsThree);
			clickElementUsingJavaScript(featuredProductsThree);
			pageLoad();
			System.out.println("featuredProductsThree clicked successfully");
		} else {
			System.out.println("featuredProductsThree is not presented in the page");
			throw new Exception("featuredProductsThree is not presented in the page");
		}
	}

}
