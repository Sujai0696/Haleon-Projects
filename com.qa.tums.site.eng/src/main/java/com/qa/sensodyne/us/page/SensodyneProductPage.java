package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneProductPage extends BaseClass{
	
	public SensodyneProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//div[normalize-space()='Sensitive Teeth Repair']")
	private static WebElement prdtFilterOne;
	
	@FindBy(xpath = "//div[normalize-space()='Sodium Lauryl Sulfate Free']")
	private static WebElement prdtFilterTwo;
	
	@FindBy(xpath = "//div[normalize-space()='Teeth Whitening']")
	private static WebElement prdtFilterThree;
	
	@FindBy(xpath = "//div[normalize-space()='Fast Sensitive Teeth Relief']")
	private static WebElement prdtFilterFour;
	
	@FindBy(xpath = "//div[normalize-space()='Enamel Strengthening']")
	private static WebElement prdtFilterFive;
	
	@FindBy(xpath = "//div[normalize-space()='Plaque and Gum Protection']")
	private static WebElement prdtFilterSix;
	
	@FindBy(xpath = "//div[normalize-space()='Multi-Benefit']")
	private static WebElement prdtFilterSeven;
	
	@FindBy(xpath = "//div[normalize-space()='Extra Fresh Breath']")
	private static WebElement prdtFilterEight;
	
	@FindBy(xpath = "//div[normalize-space()='Sensitive Teeth Repair']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveOne;
	
	@FindBy(xpath = "//div[normalize-space()='Sodium Lauryl Sulfate Free']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveTwo;
	
	@FindBy(xpath = "//div[normalize-space()='Teeth Whitening']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveThree;
	
	@FindBy(xpath = "//div[normalize-space()='Fast Sensitive Teeth Relief']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveFour;
	
	@FindBy(xpath = "//div[normalize-space()='Enamel Strengthening']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveFive;
	
	@FindBy(xpath = "//div[normalize-space()='Plaque and Gum Protection']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveSix;
	
	@FindBy(xpath = "//div[normalize-space()='Multi-Benefit']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveSeven;
	
	@FindBy(xpath = "//div[normalize-space()='Extra Fresh Breath']//self::div[@aria-current='true']")
	private static WebElement prdtFilterActiveEight;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Get Results']")
	private static WebElement getResult;
	
	@FindBy(xpath = "//*[text()='Sensodyne Nourish ']//self::a[@aria-label='Gum Protection-Sensodyne Nourish']")
	private static WebElement sensodyneNourish;
	
	@FindBy(xpath = "//strong[text()='Sensodyne Nourish Gently Soothing']")
	private static WebElement sensodyneNourishPrdtOne;
	
//	@FindBy(xpath = "//strong[text()='Sensodyne Nourish Gently Soothing']//ancestor::div[@class='box component section full-clickable-box prod-3 product-box even col-xs-6 col-sm-6 col-md-3']")
//	private static WebElement sensodyneNourishPrdtOne;
	
	@FindBy(xpath = "//strong[text()='Sensodyne Nourish Healthy White']")
	private static WebElement sensodyneNourishPrdtTwo;
	
	@FindBy(xpath = "(//strong[normalize-space()='Sensodyne Nourish Gently Soothing']//following::span[normalize-space()='Buy Now'])[1]")
	private static WebElement gentrlySoothingBuyNowOne;
	
	@FindBy(xpath = "//h2[text()='Sensodyne Nourish Gently Soothing 4.0 oz']")
	private static WebElement gentrlySoothingBuyNowTextOne;
	
	@FindBy(xpath = "(//input[@name='locationLoadingText']//following::span[@class='ps-lightbox-close'])[1]")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "(//strong[normalize-space()='Sensodyne Nourish Healthy White']//following::span[normalize-space()='Buy Now'])[1]")
	private static WebElement healthyWhiteBuyNowTwo;
	
	@FindBy(xpath = "//h2[text()='Sensodyne Nourish Healthy White 4.0 oz']")
	private static WebElement  healthyWhiteBuyNowText;
	
	
	@FindBy(xpath = "//a[text()='Sensodyne Natural White']")
	private static WebElement sensodyneNaturalWhite;
	
	@FindBy(xpath = "//strong[text()='Sensodyne Naturally']")
	private static WebElement sensodyneNaturalWhitePrdt;
	
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitivity & Gum']")
	private static WebElement sensitivityAndGum;
	
	@FindBy(xpath = "//strong[text()='Sensodyne Sensitivity Gum & Enamel']")
	private static WebElement sensitivityAndGumPrdtOne;
	
	@FindBy(xpath = "//strong[text()='Sensitivity & Gum']")
	private static WebElement sensitivityAndGumPrdtTwo;
	
	@FindBy(xpath = "(//a[@href='/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/'])[3]")
	private static WebElement sensitivityAndGumPrdtThree;
	
	@FindBy(xpath = "(//strong[contains(text(),'Sensitivity & Gum')])[4]")
	private static WebElement sensitivityAndGumPrdtFour;
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitive Care Toothbrush']")
	private static WebElement sensitiveCareToothBrush;
	
	@FindBy(xpath = "//strong[text()='Sensitive Care']")
	private static WebElement sensitiveCareToothBrushPrdt;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement sensodyneRapidRelief;
	
	@FindBy(xpath = "//a[@href='/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/']//strong[contains(text(),'Rapid Relief')]")
	private static WebElement sensodyneRapidReliefPrdtOne;
	
	@FindBy(xpath = "//a[@href='/en-us/products/sensodyne-rapid-relief-mint-toothpaste/']//strong[contains(text(),'Rapid Relief')]")
	private static WebElement sensodyneRapidReliefPrdtTwo;
	
	@FindBy(xpath = "//a[@aria-label='Rapid Relief Extra Fresh-Rapid Relief']//strong[contains(text(),'Rapid Relief')]")
	private static WebElement sensodyneRapidReliefPrdtThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Repair and Protect Deep Repair']")	
	private static WebElement repairAndProtect;
	
	@FindBy(xpath = "//a[@href='/en-us/products/sensodyne-repair-protect-whitening-toothpaste/']//strong[contains(text(),'Repair & Protect Deep Repair')]")
	private static WebElement repairAndProtectPrdtOne;
	
	@FindBy(xpath = "//a[@aria-label='Repair and Protect Extra Fresh-Repair & Protect Deep Repair']//strong[contains(text(),'Repair & Protect Deep Repair')]")
	private static WebElement repairAndProtectPrdtTwo;
	
	@FindBy(xpath = "//a[@aria-label='Repair and Protect-Repair & Protect Deep Repair']//strong[contains(text(),'Repair & Protect Deep Repair')]")
	private static WebElement repairAndProtectPrdtThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White']")
	private static WebElement trueWhiteToothpaste;
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
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
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	
	
	public void clickprdtFilter() throws Exception {
		
		waitForPageLoadJava();
		scrollDownUsingElement(prdtFilterOne);
		clickElementUsingJavaScript(prdtFilterOne);
		visibilityOf(prdtFilterActiveOne);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveOne));
		System.out.println(getElementText(prdtFilterOne));
		
		clickElementUsingJavaScript(prdtFilterTwo);
		visibilityOf(prdtFilterActiveTwo);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveTwo));
		System.out.println(getElementText(prdtFilterTwo));
		
		clickElementUsingJavaScript(prdtFilterThree);
		visibilityOf(prdtFilterActiveThree);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveThree));
		System.out.println(getElementText(prdtFilterThree));
		
		clickElementUsingJavaScript(prdtFilterFour);
		visibilityOf(prdtFilterActiveFour);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveFour));
		System.out.println(getElementText(prdtFilterFour));
		
		clickElementUsingJavaScript(prdtFilterFive);
		visibilityOf(prdtFilterActiveFive);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveFive));
		System.out.println(getElementText(prdtFilterFive));
		
		clickElementUsingJavaScript(prdtFilterSix);
		visibilityOf(prdtFilterActiveSix);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveSix));
		System.out.println(getElementText(prdtFilterSix));
		
		clickElementUsingJavaScript(prdtFilterSeven);
		visibilityOf(prdtFilterActiveSeven);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveSeven));
		System.out.println(getElementText(prdtFilterSeven));
		
		clickElementUsingJavaScript(prdtFilterEight);
		visibilityOf(prdtFilterActiveEight);
		Assert.assertTrue(elementIsDisplayed(prdtFilterActiveEight));
		System.out.println(getElementText(prdtFilterEight));
		
		elementToBeClickable(getResult);
		clickElementUsingJavaScript(getResult);
	}
	
	public void clickSensoyneNourish() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneNourish);
		clickElementUsingJavaScript(sensodyneNourish);
		pageLoad();
	}
	
	public void clickSensodyneNourishPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneNourishPrdtOne);
		clickElementUsingJavaScript(sensodyneNourishPrdtOne);
		pageLoad();
	}
	
	public void clickSensodyneNourishPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneNourishPrdtTwo);
		clickElementUsingJavaScript(sensodyneNourishPrdtTwo);
		pageLoad();
	}
	
	public void clickSensodyneNourishPrdtOneBuyNow() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(gentrlySoothingBuyNowOne);
		clickElementUsingJavaScript(gentrlySoothingBuyNowOne);
		visibilityOf(gentrlySoothingBuyNowTextOne);
		if (isElementPresent(gentrlySoothingBuyNowTextOne)) {
			clickElementUsingJavaScript(buyNowClose);
			System.out.println("Buy Now window closed successfully");
		} else {
			System.out.println("Buy Now window closed successfully");
			Assert.assertTrue(false);
		}
	}
	
	public void clickSensodyneNourishPrdtTwoBuyNow() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(healthyWhiteBuyNowTwo);
		clickElementUsingJavaScript(healthyWhiteBuyNowTwo);
		visibilityOf(healthyWhiteBuyNowText);
		if (isElementPresent(healthyWhiteBuyNowText)) {
			clickElementUsingJavaScript(buyNowClose);
			System.out.println("Buy Now window closed successfully");
		} else {
			System.out.println("Buy Now window closed successfully");
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickSensoyneNaturalWhite() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneNaturalWhite);
		clickElementUsingJavaScript(sensodyneNaturalWhite);
		pageLoad();
	}
	
	public void clickSensoyneNaturalWhitePrdt() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneNaturalWhitePrdt);
		clickElementUsingJavaScript(sensodyneNaturalWhitePrdt);
		pageLoad();
	}
	
	public void clickSensitivityAndGum() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGum);
		clickElementUsingJavaScript(sensitivityAndGum);
		pageLoad();
	}
	
	public void clickSensitivityAndGumPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtOne);
		clickElementUsingJavaScript(sensitivityAndGumPrdtOne);
		pageLoad();
	}
	
	public void clickSensitivityAndGumPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtTwo);
		clickElementUsingJavaScript(sensitivityAndGumPrdtTwo);
		pageLoad();
	}
	
	public void clickSensitivityAndGumPrdtThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtThree);
		clickElementUsingJavaScript(sensitivityAndGumPrdtThree);
		pageLoad();
	}
	
	public void clickSensitivityAndGumPrdtFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitivityAndGumPrdtFour);
		clickElementUsingJavaScript(sensitivityAndGumPrdtFour);
		pageLoad();
	}
	
	public void clickSensitiveCareToothBrush() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitiveCareToothBrush);
		clickElementUsingJavaScript(sensitiveCareToothBrush);
		pageLoad();
	}
	
	public void clickSensitiveCareToothBrushPrdt() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensitiveCareToothBrushPrdt);
		clickElementUsingJavaScript(sensitiveCareToothBrushPrdt);
		pageLoad();
	}
	
	public void clickSensodyneRapidRelief() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneRapidRelief);
		clickElementUsingJavaScript(sensodyneRapidRelief);
		pageLoad();
	}
	
	public void clickSensodyneRapidReliefPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneRapidReliefPrdtOne);
		clickElementUsingJavaScript(sensodyneRapidReliefPrdtOne);
		pageLoad();
	}
	
	public void clickSensodyneRapidReliefPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneRapidReliefPrdtTwo);
		clickElementUsingJavaScript(sensodyneRapidReliefPrdtTwo);
		pageLoad();
	}
	
	public void clickSensodyneRapidReliefPrdtThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneRapidReliefPrdtThree);
		clickElementUsingJavaScript(sensodyneRapidReliefPrdtThree);
		pageLoad();
	}
	
	
	public void clickRepairAndProtect() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtect);
		clickElementUsingJavaScript(repairAndProtect);
		pageLoad();
	}
	
	public void clickRepairAndProtectPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtect);
		clickElementUsingJavaScript(repairAndProtect);
		pageLoad();
	}
	
	public void clickRepairAndProtectPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtect);
		clickElementUsingJavaScript(repairAndProtect);
		pageLoad();
	}
	
	public void clickRepairAndProtectPrdtThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(repairAndProtect);
		clickElementUsingJavaScript(repairAndProtect);
		pageLoad();
	}
	
	public void clicktrueWhiteToothpaste() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(trueWhiteToothpaste);
		clickElementUsingJavaScript(trueWhiteToothpaste);
		pageLoad();
	}

}
