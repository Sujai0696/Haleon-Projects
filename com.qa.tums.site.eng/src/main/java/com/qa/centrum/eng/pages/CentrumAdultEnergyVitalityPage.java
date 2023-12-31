package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumAdultEnergyVitalityPage extends BaseClass{
	
	public CentrumAdultEnergyVitalityPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "(//button[text()='Write a review '])[1]")
	private static WebElement btnReview;
	
	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement btnReviewClose;

	@FindBy(xpath = "(//a[@role='button'])[1]")
	private static WebElement btnBuyNow;
	
	@FindBy(xpath = "//div[@class='ps-header']")
	private static WebElement btnClose;
	
	@FindBy(xpath = "(//a[text()='Get Coupons'])[1]")
	private static WebElement getCoupons;
	
	@FindBy(xpath = "(//a[@role='tab'])[2]")
	private static WebElement openVitamin;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even is-active']")
	private static WebElement closeVitamin;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[1]")
	private static WebElement viewSupplementVitamin;
	
	@FindBy(xpath = "(//a[@role='tab'])[3]")
	private static WebElement openUsage;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd is-active']")
	private static WebElement closeUsage;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[2]")
	private static WebElement viewSupplementUsage;
	
	@FindBy(xpath = "(//a[@role='tab'])[4]")
	private static WebElement openFAQ;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	private static WebElement closeFAQ;
	
	@FindBy(xpath = "//p[text()='Energy & Vitality Capsule']")
	private static WebElement txtProduct;
	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white rounded flex')]")
	private static WebElement compareTab;
	
	@FindBy(xpath = "//a[@class='compare-button default-compare btn btn-primary btn-flexible']")
	private static WebElement compareButton;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-energy f-non-binary f-seniors f-tablets f-young-adults filter-item product-card product-orange box_1938611159_copy_']")
	private static WebElement relatedProductOne;
	
	@FindBy(xpath = "//div[@class='box component section f-collagen-formation f-joint-health bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-bone-health f-capsule f-non-binary f-seniors f-young-adults filter-item product-card product-green first odd last']")
	private static WebElement relatedProductTwo;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-gummy f-mental f-non-binary f-seniors f-young-adults filter-item product-card product-teal first odd last']")
	private static WebElement relatedProductThree;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-50-59 f-60-100 f-adults f-gummy f-non-binary f-seniors f-sleep f-young-adults filter-item product-card product-purple first odd last']")
	private static WebElement relatedProductFour;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum Specialist Energy Multivitamin']")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum Adult Movement & Strength Capsule 50ct']")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum Adult Gummy Focus & Clarity 30ct']")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum Adult Gummy Rest & Rejuvenate 50ct']")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//h2[text()='Centrum Specialist Energy Multivitamin']")
	private static WebElement buyNowCloseOne;
	
	@FindBy(xpath = "//h2[text()='Centrum Adult Movement & Strength Capsule 50ct']")
	private static WebElement buyNowCloseTwo;
	
	@FindBy(xpath = "//h2[text()='Centrum Adult Gummy Focus & Clarity 30ct']")
	private static WebElement buyNowCloseThree;
	
	@FindBy(xpath = "//h2[text()='Centrum Adult Gummy Rest & Rejuvenate 50ct']")
	private static WebElement buyNowCloseFour;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compareOne;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compareTwo;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compareThree;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compareFour;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[1]")
	private static WebElement browseLinkOne;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[2]")
	private static WebElement browseLinkTwo;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[3]")
	private static WebElement browseLinkThree;
	
	@FindBy(xpath = "(//div[contains(@class,'richText component section border rounded-pill anchor-box')])[4]")
	private static WebElement browseLinkFour;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
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
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	public void clickWriteAReviewBtn() throws Exception {
		clickElementUsingJavaScript(btnReview);
		visibilityOf(btnReviewClose);
		boolean elementIsDisplayed = elementIsDisplayed(btnReviewClose);
		Assert.assertTrue(elementIsDisplayed);
		elementClick(btnReviewClose);
	}
	
	public void clickBuyNowBtn() throws Exception{
		elementClick(btnBuyNow);
		visibilityOf(btnClose);
		boolean elementIsDisplayed = elementIsDisplayed(btnClose);
		Assert.assertTrue(elementIsDisplayed);
		refreshWebPage();
	}
	
	public void clickGetCoupons() throws Exception{
		visibilityOf(getCoupons);
		elementClick(getCoupons);
	}

	public void clickVitaminAndMinerals() throws Exception{
		scrollDownUsingElement(openVitamin);
		clickElementUsingJavaScript(openVitamin);
		boolean elementIsDisplayed = elementIsDisplayed(closeVitamin);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(viewSupplementVitamin);
	}
	
	public void clickUsage() throws Exception {
		scrollDownUsingElement(openUsage);
		clickElementUsingJavaScript(openUsage);
		boolean elementIsDisplayed = elementIsDisplayed(closeUsage);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(viewSupplementUsage);
	}
	
	public void clickFAQ() throws Exception{
		scrollDownUsingElement(openFAQ);
		clickElementUsingJavaScript(openFAQ);
		boolean elementIsDisplayed = elementIsDisplayed(closeFAQ);
		Assert.assertTrue(elementIsDisplayed);
	}
	
	public boolean txtProductVerification() throws Exception{
			boolean elementIsDisplayed = elementIsDisplayed(txtProduct);
			return elementIsDisplayed;
	}
	
	public void clickCompareTab() throws Exception {
		scrollDownUsingElement(compareTab);
		clickElementUsingJavaScript(compareTab);
	}
	
	public void clickCompareButton() throws Exception {
		scrollDownUsingElement(compareButton);
		clickElementUsingJavaScript(compareButton);
	}
	
	public void clickRelatedProductOne()throws Exception {
		scrollDownUsingElement(relatedProductOne);
		clickElementUsingJavaScript(relatedProductOne);
	}
	
	public void clickRelatedProductTwo()throws Exception {
		scrollDownUsingElement(relatedProductTwo);
		clickElementUsingJavaScript(relatedProductTwo);
	}
	
	public void clickRelatedProductThree()throws Exception {
		scrollDownUsingElement(relatedProductThree);
		clickElementUsingJavaScript(relatedProductThree);
	}
	
	public void clickRelatedProductFour()throws Exception {
		scrollDownUsingElement(relatedProductFour);
		clickElementUsingJavaScript(relatedProductFour);
	}
	
	public void clickBuyNowOne() throws Exception{
		scrollDownUsingElement(buyNowOne);
		clickElementUsingJavaScript(buyNowOne);
		visibilityOf(buyNowCloseOne);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowCloseOne);
		Assert.assertTrue(elementIsDisplayed);
		refreshWebPage();
	}
	
	public void clickBuyNowTwo() throws Exception{
		scrollDownUsingElement(buyNowTwo);
		clickElementUsingJavaScript(buyNowTwo);
//		elementClick(buyNowTwo);
		visibilityOf(buyNowCloseTwo);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowCloseTwo);
		Assert.assertTrue(elementIsDisplayed);
		refreshWebPage();
	}
	
	public void clickBuyNowThree() throws Exception{
		scrollDownUsingElement(buyNowThree);
		clickElementUsingJavaScript(buyNowThree);
//		elementClick(buyNowThree);
		visibilityOf(buyNowCloseThree);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowCloseThree);
		Assert.assertTrue(elementIsDisplayed);
		refreshWebPage();
	}
	
	public void clickBuyNowFour() throws Exception{
		scrollDownUsingElement(buyNowFour);
		clickElementUsingJavaScript(buyNowFour);
//		elementClick(buyNowFour);
		visibilityOf(buyNowCloseFour);
		boolean elementIsDisplayed = elementIsDisplayed(buyNowCloseFour);
		Assert.assertTrue(elementIsDisplayed);
		refreshWebPage();
	}
	
	public void clickCompareOne() throws Exception {
		scrollDownUsingElement(compareOne);
		clickElementUsingJavaScript(compareOne);
	} 
	
	public void clickCompareTwo() throws Exception {
		scrollDownUsingElement(compareTwo);
		clickElementUsingJavaScript(compareTwo);
	} 
	
	public void clickCompareThree() throws Exception {
		scrollDownUsingElement(compareThree);
		clickElementUsingJavaScript(compareThree);
	} 
	
	public void clickCompareFour() throws Exception {
		scrollDownUsingElement(compareFour);
		clickElementUsingJavaScript(compareFour);
	} 
	
	public void clickBrowseLinkOne() throws Exception{
		scrollDownUsingElement(browseLinkOne);
		clickElementUsingJavaScript(browseLinkOne);
	}
	
	public void clickBrowseLinkTwo() throws Exception{
		scrollDownUsingElement(browseLinkTwo);
		clickElementUsingJavaScript(browseLinkTwo);
	}
	
	public void clickBrowseLinkThree() throws Exception{
		scrollDownUsingElement(browseLinkThree);
		clickElementUsingJavaScript(browseLinkThree);
	}
	
	public void clickBrowseLinkFour() throws Exception{
		scrollDownUsingElement(browseLinkFour);
		clickElementUsingJavaScript(browseLinkFour);
	}

}
