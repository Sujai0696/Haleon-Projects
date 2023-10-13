package com.qa.centrum.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumMultigummiesMenPage extends BaseClass{

	public CentrumMultigummiesMenPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//button[text()='Write a review ']")
	private static WebElement btnReview;
	
	@FindBy(xpath = "//span[text()='My Review for Centrum MultiGummies Men']")
	private static WebElement btnReviewText;
	
	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement btnReviewClose;
	
	@FindBy(xpath = "//*[text()='Buy Now']//self::a[contains(@class,'btn ps-widget btn-secondary')]")
	private static WebElement btnBuyNow;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies Men']")
	private static WebElement btnBuyNowText;
	
	@FindBy(xpath = "//div[@class='richText component section product-detail-buttons reset-margin-y even last col-xs-6']//ancestor::a[text()='Get Coupons']")
	private static WebElement getCoupons;
	
	@FindBy(xpath = "//span[text()='Product Benefits']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement productBenefitActive;
	
	@FindBy(xpath = "//span[text()='Vitamins & Minerals']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement openVitamin;
	
	@FindBy(xpath = "//span[text()='Vitamins & Minerals']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement closeVitamin;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[1]")
	private static WebElement viewSupplementVitamin;
	
	@FindBy(xpath = "//span[text()='Usage']//ancestor::li[@class='tabs-nav-item odd ']")
	private static WebElement openUsage;
	
	@FindBy(xpath = "//span[text()='Usage']//ancestor::li[@class='tabs-nav-item odd is-active']")
	private static WebElement closeUsage;
	
	@FindBy(xpath = "(//a[text()='View Supplement Facts'])[2]")
	private static WebElement viewSupplementUsage;
	
	@FindBy(xpath = "//span[text()='FAQs']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement openFAQ;
	
	@FindBy(xpath = "//span[text()='FAQs']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement closeFAQ;
	
	@FindBy(xpath = "//span[text()='Product Benefits']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement productBenefit;
	

	
	@FindBy(xpath = "//div[contains(@class,'box component section bg-color-white rounded flex')]")
	private static WebElement compareTab;
	
	@FindBy(xpath = "//a[@class='compare-button default-compare btn btn-primary btn-flexible']")
	private static WebElement compareButton;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-gummy f-immunity f-metabolism f-non-binary f-young-adults filter-item product-card product-orange first odd last']")
	private static WebElement relatedProductOne;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-50-59 f-60-100 f-brain-function f-eye-health f-general-wellness f-gummy f-heart f-male f-muscle-function f-seniors filter-item product-blue product-card box_1938611159_copy_']")
	private static WebElement relatedProductTwo;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-energy f-general-wellness f-immunity f-male f-metabolism f-muscle-function f-tablets f-young-adults filter-item product-blue product-card first odd last']")
	private static WebElement relatedProductThree;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-300 rounded p-d-x-1 p-d-y-1 p-m-1 anchor-box f-20-29 f-30-39 f-40-49 f-adults f-brain-function f-cellular-protection f-general-wellness f-gummy f-immunity f-non-binary f-physical-stress-relief f-young-adults filter-item product-card product-purple first odd last']")
	private static WebElement relatedProductFour;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum MultiGummies Adult']")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum MultiGummies Men 50+  90CT']")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum Men 40CT ']")
	private static WebElement buyNowThree;
	
	@FindBy(xpath = "//a[@data-gtm-product-name='Centrum MultiGummies Multi +Antioxidants 90CT']")
	private static WebElement buyNowFour;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies Adult']")
	private static WebElement buyNowCloseOne;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies MEN 50+  90CT']")
	private static WebElement buyNowCloseTwo;
	
	@FindBy(xpath = "//h2[text()='Centrum  MEN 40CT']")
	private static WebElement buyNowCloseThree;
	
	@FindBy(xpath = "//h2[text()='Centrum MultiGummies MULTI_ANTIOXIDANTS 90CT']")
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Products']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='Multivitamins']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Centrum MultiGummies Men Multivitamin']")
	private static WebElement breadcrumbFour;
	
	
	
	
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
		waitForPageLoadJava();
		if (isElementPresent(btnReview)) {
			scrollDownUsingElement(btnReview);
			clickElementUsingJavaScript(btnReview);
			visibilityOf(btnReviewText);
			Assert.assertTrue(elementIsDisplayed(btnReviewText));
			visibilityOf(btnReviewClose);
			clickElementUsingJavaScript(btnReviewClose);
			Assert.assertTrue(elementIsDisplayed(btnReview));
			System.out.println("Write a review verified");
		} else {
			System.out.println("Write a review not verified");
			throw new Exception("Write a review is not verified");
		}
	}
	
	public void clickBuyNowBtn() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnBuyNow)) {
			clickElementUsingJavaScript(btnBuyNow);
			visibilityOf(btnBuyNowText);
			Assert.assertTrue(elementIsDisplayed(btnBuyNowText));
			System.out.println("Buy Now verified");
			refreshWebPage();
		} else {
			System.out.println("Buy now is not verified");
			throw new Exception("unable to click on Buy now button");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupons);
		clickElementUsingJavaScript(getCoupons);
	}

	public void clickVitaminAndMinerals() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBenefitActive)) {
			scrollDownUsingElement(openVitamin);
			clickElementUsingJavaScript(openVitamin);
			visibilityOf(closeVitamin);
			Assert.assertTrue(elementIsDisplayed(closeVitamin));
			System.out.println(getElementText(closeVitamin));
			System.out.println("vitamin and mineral is verified");
			clickElementUsingJavaScript(viewSupplementVitamin);
		} else {
			System.out.println("vitamin and mineral is not verified");
			throw new Exception("unable to verify the vitamin and minerals");
		}
	}
	
	public void clickUsage() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(productBenefitActive)) {
			scrollDownUsingElement(openUsage);
			clickElementUsingJavaScript(openUsage);
			visibilityOf(closeUsage);
			Assert.assertTrue(elementIsDisplayed(closeUsage));
			System.out.println(getElementText(closeUsage));
			System.out.println("Usage is verified");
			clickElementUsingJavaScript(viewSupplementUsage);
		} else {
			System.out.println("Usage is not verified");
			throw new Exception("unable to verify the Usage");
		}
	}
	
	public void clickFAQ() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBenefitActive)) {
			scrollDownUsingElement(openFAQ);
			clickElementUsingJavaScript(openFAQ);
			visibilityOf(closeFAQ);
			Assert.assertTrue(elementIsDisplayed(closeFAQ));
			System.out.println(getElementText(closeFAQ));
			System.out.println("FAQ is verified");
		} else {
			System.out.println("FAQ is not verified");
			throw new Exception("unable to verify the FAQ");
		}
	}
	
	public void clickProductBenefits() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBenefitActive)) {
			scrollDownUsingElement(openFAQ);
			clickElementUsingJavaScript(openFAQ);
			visibilityOf(closeFAQ);
			clickElementUsingJavaScript(productBenefit);
			visibilityOf(productBenefitActive);
			Assert.assertTrue(elementIsDisplayed(productBenefitActive));
			System.out.println(getElementText(productBenefitActive));
			System.out.println("product benefits is verified");
		} else {
			System.out.println("product benefits is not verified");
			throw new Exception("unable to verify the product benefits");
		}
	}
	
	
	
	public void clickCompareTab() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareTab);
		clickElementUsingJavaScript(compareTab);
	}
	
	public void clickCompareButton() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareButton);
		clickElementUsingJavaScript(compareButton);
	}
	
	public void clickRelatedProductOne()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(relatedProductOne);
		clickElementUsingJavaScript(relatedProductOne);
	}
	
	public void clickRelatedProductTwo()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(relatedProductTwo);
		clickElementUsingJavaScript(relatedProductTwo);
	}
	
	public void clickRelatedProductThree()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(relatedProductThree);
		clickElementUsingJavaScript(relatedProductThree);
	}
	
	public void clickRelatedProductFour()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(relatedProductFour);
		clickElementUsingJavaScript(relatedProductFour);
	}
	
	public void clickBuyNowOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowOne)) {
			scrollDownUsingElement(buyNowOne);
			clickElementUsingJavaScript(buyNowOne);
			visibilityOf(buyNowCloseOne);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseOne));
			System.out.println(getElementText(buyNowCloseOne));
			
		} else {
			System.out.println("Buy now one is not verified");
			throw new Exception("Unable to click Product card buy now one");

		}
		
	}
	
	public void clickBuyNowTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowTwo)) {
			scrollDownUsingElement(buyNowTwo);
			clickElementUsingJavaScript(buyNowTwo);
			visibilityOf(buyNowCloseTwo);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseTwo));
			System.out.println(getElementText(buyNowCloseTwo));
			
		} else {
			System.out.println("Buy now Two is not verified");
			throw new Exception("Unable to click Product card buy now Two");

		}
		
	}
	
	public void clickBuyNowThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowThree)) {
			scrollDownUsingElement(buyNowThree);
			clickElementUsingJavaScript(buyNowThree);
			visibilityOf(buyNowCloseThree);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseThree));
			System.out.println(getElementText(buyNowCloseThree));
			
		} else {
			System.out.println("Buy now Three is not verified");
			throw new Exception("Unable to click Product card buy now Three");
		}
	}
	
	public void clickBuyNowFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowFour)) {
			scrollDownUsingElement(buyNowFour);
			clickElementUsingJavaScript(buyNowFour);
			visibilityOf(buyNowCloseFour);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseFour));
			System.out.println(getElementText(buyNowCloseFour));
			
		} else {
			System.out.println("Buy now Four is not verified");
			throw new Exception("Unable to click Product card buy now Four");
		}
	}
	
	public void clickCompareOne() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareOne);
		clickElementUsingJavaScript(compareOne);
	} 
	
	public void clickCompareTwo() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareTwo);
		clickElementUsingJavaScript(compareTwo);
	} 
	
	public void clickCompareThree() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareThree);
		clickElementUsingJavaScript(compareThree);
	} 
	
	public void clickCompareFour() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(compareFour);
		clickElementUsingJavaScript(compareFour);
	} 
	
	public void clickBrowseLinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(browseLinkOne);
		clickElementUsingJavaScript(browseLinkOne);
	}
	
	public void clickBrowseLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(browseLinkTwo);
		clickElementUsingJavaScript(browseLinkTwo);
	}
	
	public void clickBrowseLinkThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(browseLinkThree);
		clickElementUsingJavaScript(browseLinkThree);
	}
	
	public void clickBrowseLinkFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(browseLinkFour);
		clickElementUsingJavaScript(browseLinkFour);
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbOne);
		clickElementUsingJavaScript(breadcrumbOne);
		
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbTwo);
		clickElementUsingJavaScript(breadcrumbTwo);
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbThree);
		clickElementUsingJavaScript(breadcrumbThree);
	}
	
	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(breadcrumbFour);
		clickElementUsingJavaScript(breadcrumbFour);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
