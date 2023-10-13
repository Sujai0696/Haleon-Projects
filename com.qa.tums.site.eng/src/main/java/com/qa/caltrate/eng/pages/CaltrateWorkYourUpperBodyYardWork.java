package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateWorkYourUpperBodyYardWork extends BaseClass{
	public CaltrateWorkYourUpperBodyYardWork() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "//a[text()='Bone Health Central']")
	private static WebElement Bread_BoneHealthCentral;
	
	@FindBy(xpath = "(//a[text()='Health Tips'])[1]")
	private static WebElement Bread_HealthTip;
	
	@FindBy(xpath = "(//a[text()='Health Tips'])[2]")
	private static WebElement HealthTipLink;
	
	@FindBy(xpath = "//a[text()='All Articles']")
	private static WebElement AllArticles;
	
	@FindBy(xpath = "//a[text()='All Recipes']")
	private static WebElement AllRecipes;
	
	@FindBy(xpath = "//a[text()='All Health Tips']")
	private static WebElement AllHealthTips;
	
	@FindBy(xpath = "//a[text()='All Interactive Tools']")
	private static WebElement AllInteractiveTools;
	
	@FindBy(xpath = "//a[text()='Calcium and Calcium Carbonate']")
	private static WebElement CalciumAndCalciumCarbonate;
	
	@FindBy(xpath = "//a[text()='Vitamin D']")
	private static WebElement VitaminD;
	
	@FindBy(xpath = "//a[text()='Osteoporosis']")
	private static WebElement Osteoporosis;
	
	@FindBy(xpath = "//a[text()='Calcium Supplements']")
	private static WebElement CalciumSupplements;
	
	
	
	
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
	public void clickOnBread_BoneHealthCentral() throws Throwable {
		moveToElement(Bread_BoneHealthCentral);
		clickElementUsingJavaScript(Bread_BoneHealthCentral);
	}
	public void clickOnBread_HealthTip() throws Throwable {
		moveToElement(Bread_HealthTip);
		clickElementUsingJavaScript(Bread_HealthTip);
	}
	public void clickOnHealthTipLink() throws Throwable {
		moveToElement(HealthTipLink);
		clickElementUsingJavaScript(HealthTipLink);
	}
	public void clickOnAllArticles() throws Throwable {
		moveToElement(AllArticles);
		clickElementUsingJavaScript(AllArticles);
	}
	public void clickOnAllRecipes() throws Throwable {
		moveToElement(AllRecipes);
		clickElementUsingJavaScript(AllRecipes);
	}
	public void clickOnAllHealthTips() throws Throwable {
		moveToElement(AllHealthTips);
		clickElementUsingJavaScript(AllHealthTips);
	}
	public void clickOnAllInteractiveTools() throws Throwable {
		moveToElement(AllInteractiveTools);
		clickElementUsingJavaScript(AllInteractiveTools);
	}
	public void clickOnCalciumAndCalciumCarbonate() throws Throwable {
		moveToElement(CalciumAndCalciumCarbonate);
		clickElementUsingJavaScript(CalciumAndCalciumCarbonate);
	}
	public void clickOnVitaminD() throws Throwable {
		moveToElement(VitaminD);
		clickElementUsingJavaScript(VitaminD);
	}
	public void clickOnOsteoporosis() throws Throwable {
		moveToElement(Osteoporosis);
		clickElementUsingJavaScript(Osteoporosis);
	}
	public void clickOnCalciumSupplements() throws Throwable {
		moveToElement(CalciumSupplements);
		clickElementUsingJavaScript(CalciumSupplements);
	}
	
}
