package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.qa.baseClass.BaseClass;

public class Caltrate600D3PlusMinerals extends BaseClass {

	public Caltrate600D3PlusMinerals() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "//a[text()='Products']")
	private static WebElement Bread_Products;
	
	@FindBy(xpath = "//a[text()='BUY NOW']")
	private static WebElement BuyNowButton;
	
	@FindBy(xpath = "//a[text()='GET COUPONS']")
	private static WebElement GetCouponButton;
	
	@FindBy(xpath = "//a[text()='Product Labeling']")
	private static WebElement ProductLabeling;
	
	@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage text-color-3 title-h first odd component col-xs-12'])[1]")
	private static WebElement FirstProduct;
	
	@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage text-color-3 title-h first odd component col-xs-12'])[2]")
	private static WebElement SecondProduct;
	
	@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage text-color-3 title-h first odd component col-xs-12'])[3]")
	private static WebElement ThirdProduct;
	
	@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage title-h first odd component col-xs-12'])[1]")
	private static WebElement FourthProduct;
	
	@FindBy(xpath = "(//div[@class='richTextEnhanced richText section richTextHyperlinkedImage title-h first odd component col-xs-12'])[2]")
	private static WebElement FifthProduct;
	
	@FindBy(xpath = "(//div[@class='paragraphSystem content']//div[@class='component-content']//div[@class='component-content left'])[2]")
	private static WebElement FirstProductImage;
	
	@FindBy(xpath = "(//div[@class='paragraphSystem content']//div[@class='component-content']//div[@class='component-content left'])[3]")
	private static WebElement SecondProductImage;
	
	@FindBy(xpath = "(//div[@class='paragraphSystem content']//div[@class='component-content']//div[@class='component-content left'])[4]")
	private static WebElement ThirdProductImage;
	
	@FindBy(xpath = "(//div[@class='paragraphSystem content']//div[@class='component-content']//div[@class='component-content left'])[5]")
	private static WebElement FourthProductImage;
	
	@FindBy(xpath = "(//div[@class='paragraphSystem content']//div[@class='component-content']//div[@class='component-content left'])[6]")
	private static WebElement FifthProductImage;
	
	@FindBy(xpath = "//a[text()='VIEW ALL PRODUCTS']")
	private static WebElement ViewAllProduct;
	
	@FindBy(xpath = "//a[text()='FIND OUT']")
	private static WebElement FindOut;
	
	@FindBy(xpath = "//div[@class='box component section flex cols-d-2 flex-row max-w-d-40 p-m-y-2 s-d-3 anchor-box first odd last col-xs-12']")
	private static WebElement CalciumCarbonatevsCalciumCitrate;
	
	
	
	
	public void clickOnCookies() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("Dismiss is not presented");
			Assert.assertTrue(false);
		}
	}
	public void clickOnHomeIcon() throws Throwable {
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
	}
	public void clickOnBread_Products() throws Throwable {
		moveToElement(Bread_Products);
		clickElementUsingJavaScript(Bread_Products);
	}
	public void clickOnBuyNowButton() throws Throwable {
		moveToElement(BuyNowButton);
		clickElementUsingJavaScript(BuyNowButton);
	}
	public void clickOnGetCouponButton() throws Throwable {
		moveToElement(GetCouponButton);
		clickElementUsingJavaScript(GetCouponButton);
	}
	public void clickOnProductLabeling() throws Throwable {
		moveToElement(ProductLabeling);
		clickElementUsingJavaScript(ProductLabeling);
	}
	public void clickOnFirstProduct() throws Throwable {
		moveToElement(FirstProduct);
		clickElementUsingJavaScript(FirstProduct);
	}
	public void clickOnSecondProduct() throws Throwable {
		moveToElement(SecondProduct);
		clickElementUsingJavaScript(SecondProduct);
	}
	public void clickOnThirdProduct() throws Throwable {
		moveToElement(ThirdProduct);
		clickElementUsingJavaScript(ThirdProduct);
	}
	public void clickOnFourthProduct() throws Throwable {
		moveToElement(FourthProduct);
		clickElementUsingJavaScript(FourthProduct);
	}
	public void clickOnFifthProduct() throws Throwable {
		moveToElement(FifthProduct);
		clickElementUsingJavaScript(FifthProduct);
	}
	public void clickOnFirstProductImage() throws Throwable {
		moveToElement(FirstProductImage);
		clickElementUsingJavaScript(FirstProductImage);
	}
	public void clickOnSecondProductImage() throws Throwable {
		moveToElement(SecondProductImage);
		clickElementUsingJavaScript(SecondProductImage);
	}
	public void clickOnThirdProductImage() throws Throwable {
		moveToElement(ThirdProductImage);
		clickElementUsingJavaScript(ThirdProductImage);
	}
	public void clickOnFourthProductImage() throws Throwable {
		moveToElement(FourthProductImage);
		clickElementUsingJavaScript(FourthProductImage);
	}
	public void clickOnFifthProductImage() throws Throwable {
		moveToElement(FifthProductImage);
		clickElementUsingJavaScript(FifthProductImage);
	}
	public void clickOnViewAllProduct() throws Throwable {
		moveToElement(ViewAllProduct);
		clickElementUsingJavaScript(ViewAllProduct);
	}
	public void clickOnCalciumCarbonatevsCalciumCitrate() throws Throwable {
		moveToElement(CalciumCarbonatevsCalciumCitrate);
		clickElementUsingJavaScript(CalciumCarbonatevsCalciumCitrate);
	}
	public void clickOnFindOut() throws Throwable {
		moveToElement(FindOut);
		clickElementUsingJavaScript(FindOut);
	}

}
