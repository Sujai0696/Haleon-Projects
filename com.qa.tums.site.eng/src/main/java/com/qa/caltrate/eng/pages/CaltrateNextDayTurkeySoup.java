package com.qa.caltrate.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CaltrateNextDayTurkeySoup extends BaseClass{
	public CaltrateNextDayTurkeySoup() {
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
	
	@FindBy(xpath = "(//a[text()='Recipes'])[2]")
	private static WebElement Bread_Recipe;
	
//	@FindBy(xpath = "(//a[text()='Calcium and Calcium Carbonate'])[1]")
//	private static WebElement CalciumAndCalciumCarbonateLink;
	
	@FindBy(xpath = "(//a[text()='Recipes'])[3]")
	private static WebElement RecipesLink;

	@FindBy(xpath = "//a[text()='READ MORE']")
	private static WebElement ReadMore;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white p-d-2 p-m-2 box-shadow-df first odd last col-xs-12']")
	private static WebElement CALTRATE600D3PLUSMINERALSMINIS;
	
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
	
	@FindBy(xpath = "(//a[text()='Osteoporosis'])[2]")
	private static WebElement Osteoporosis;
	
	@FindBy(xpath = "//a[text()='Calcium Supplements']")
	private static WebElement CalciumSupplements;
	
	
	
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
	
	public void clickOnBread_Recipes() throws Throwable {
		moveToElement(Bread_Recipe);
		clickElementUsingJavaScript(Bread_Recipe);
	}
//	public void clickOnCalciumAndCalciumCarbonateLink() throws Throwable {
//		moveToElement(CalciumAndCalciumCarbonateLink);
//		clickElementUsingJavaScript(CalciumAndCalciumCarbonateLink);
//	}
	public void clickOnReadMore() throws Throwable {
		moveToElement(ReadMore);
		clickElementUsingJavaScript(ReadMore);
	}
	public void clickOnCALTRATE600D3PLUSMINERALSMINIS() throws Throwable {
		moveToElement(CALTRATE600D3PLUSMINERALSMINIS);
		clickElementUsingJavaScript(CALTRATE600D3PLUSMINERALSMINIS);
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
