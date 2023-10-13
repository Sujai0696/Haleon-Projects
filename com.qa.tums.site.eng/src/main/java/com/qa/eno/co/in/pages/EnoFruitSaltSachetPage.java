package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoFruitSaltSachetPage extends BaseClass{
	
	public EnoFruitSaltSachetPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='1']//ancestor::li[@class='carousel-nav-item is-active lslide active']")
	private static WebElement flavourActiveOne;;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item lslide']//ancestor::a[normalize-space()='3']")
	private static WebElement flavourTwo;
	
	@FindBy(xpath = "//a[normalize-space()='3']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement flavourActiveTwo;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item lslide']//ancestor::a[normalize-space()='5']")
	private static WebElement flavourThree;
	
	@FindBy(xpath = "//a[normalize-space()='5']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement flavourActiveThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item lslide']//ancestor::a[normalize-space()='7']")
	private static WebElement flavourFour;
	
	@FindBy(xpath = "//a[normalize-space()='7']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement flavourActiveFour;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item lslide']//ancestor::a[normalize-space()='9']")
	private static WebElement flavourFive;
	
	@FindBy(xpath = "//a[normalize-space()='9']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement flavourActiveFive;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item lslide']//ancestor::a[normalize-space()='11']")
	private static WebElement flavourSix;
	
	@FindBy(xpath = "//a[normalize-space()='11']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement flavourActiveSix;
	
	
	
	@FindBy(xpath = "//p[text()='100 g Bottle']//ancestor::div[@class='box component section product-type_bottle product-types__type even']")
	private static WebElement bottle;
	
	@FindBy(xpath = "//p[text()='100 g Bottle']//ancestor::div[@class='box component section product-type_bottle product-types__type even product-types__type--active']")
	private static WebElement bottleActive;
	
	
	@FindBy(xpath = "//p[text()='5 g Sachet']//ancestor::div[@class='box component section product-type_sachet product-types__type product-types__type--active odd last col-xs-12']")
	private static WebElement sachetActive;	
	
	@FindBy(xpath = "//p[text()='5 g Sachet']//ancestor::div[@class='box component section product-type_sachet product-types__type odd last col-xs-12']")
	private static WebElement sachet;
	
	@FindBy(xpath = "//p[text()='5 g Sachet']//ancestor::div[@class='box component section product-type_sachet product-types__type odd last col-xs-12 product-types__type--active']")
	private static WebElement sachetActiveAgain;
	
	@FindBy(xpath = "//span[text()='Precautions']//ancestor::header[@class='accordion-head']")
	private static WebElement clickPrecautions;
	
	@FindBy(xpath = "//span[text()='Precautions']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement precautionsActive;
	
	@FindBy(xpath = "//span[text()='Precautions']//ancestor::li[@class='accordion-slide first last odd']")
	private static WebElement precautions;
	
	@FindBy(xpath = "//img[@title='Eno Lemon Flavour Sachet']")
	private static WebElement EnoSachetImg;
	
	@FindBy(xpath = "//a[text()='ENO Sachet']")
	private static WebElement EnoSachetText;
	
	@FindBy(xpath = "//img[@title='Eno Bottle - Lemon']")
	private static WebElement EnoBottleImg;
	
	@FindBy(xpath = "//a[text()='ENO Bottle']")
	private static WebElement EnoBottleText;
	
	
	
	
	
	public void clickFlavourTwoLemon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(flavourActiveOne)) {
			scrollDownUsingElement(flavourActiveOne);
			clickElementUsingJavaScript(flavourTwo);
			visibilityOf(flavourActiveTwo);
			Assert.assertTrue(elementIsDisplayed(flavourActiveTwo));
			System.out.println("Lemon flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickFlavourThreeCola() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(flavourActiveOne)) {
			scrollDownUsingElement(flavourActiveOne);
			clickElementUsingJavaScript(flavourThree);
			visibilityOf(flavourActiveThree);
			Assert.assertTrue(elementIsDisplayed(flavourActiveThree));
			System.out.println("Cola flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickFlavourFourOrange() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(flavourActiveOne)) {
			scrollDownUsingElement(flavourActiveOne);
			clickElementUsingJavaScript(flavourFour);
			visibilityOf(flavourActiveFour);
			Assert.assertTrue(elementIsDisplayed(flavourActiveFour));
			System.out.println("Orange flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickFlavourFiveLimao() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(flavourActiveOne)) {
			scrollDownUsingElement(flavourActiveOne);
			clickElementUsingJavaScript(flavourFour);
			visibilityOf(flavourActiveFour);
			Assert.assertTrue(elementIsDisplayed(flavourActiveFour));
			clickElementUsingJavaScript(flavourFive);
			visibilityOf(flavourActiveFive);
			Assert.assertTrue(elementIsDisplayed(flavourActiveFive));
			System.out.println("Limao flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickFlavourSixMusambi() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(flavourActiveOne)) {
			scrollDownUsingElement(flavourActiveOne);
			clickElementUsingJavaScript(flavourFour);
			visibilityOf(flavourActiveFour);
			Assert.assertTrue(elementIsDisplayed(flavourActiveFour));
			clickElementUsingJavaScript(flavourSix);
			visibilityOf(flavourActiveSix);
			Assert.assertTrue(elementIsDisplayed(flavourActiveSix));
			System.out.println("Musambi flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickBottleAndSachet() throws Exception{
		waitForPageLoadJava();
		refreshWebPage();
		if (isElementPresent(sachetActive)) {
			scrollDownUsingElement(sachetActive);
			clickElementUsingJavaScript(bottle);
			visibilityOf(bottleActive);
			Assert.assertTrue(elementIsDisplayed(bottleActive));
			clickElementUsingJavaScript(sachet);
			visibilityOf(sachetActiveAgain);
			Assert.assertTrue(elementIsDisplayed(sachetActiveAgain));
			System.out.println("Bottle and Sachet are verified successfully");
		} else {
			System.out.println("Bottle and Sachet are not verified");
			Assert.assertTrue(false, "Bottle and Sachet are not verified");
		}
	}
	
	public void clickPrecautions() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(clickPrecautions)) {
			scrollDownUsingElement(clickPrecautions);
			clickElementUsingJavaScript(clickPrecautions);
			visibilityOf(precautionsActive);
			Assert.assertTrue(elementIsDisplayed(precautionsActive));
			clickElementUsingJavaScript(clickPrecautions);
			visibilityOf(precautions);
			Assert.assertTrue(elementIsDisplayed(precautions));
			System.out.println("Precautions accordion verified successfully");
		} else {
			System.out.println("Precautions accordion not verified");
			Assert.assertTrue(false, "Precautions accordion not verified");

		}
	}
	
	public void clickEnoSachetImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(EnoSachetImg);
		clickElementUsingJavaScript(EnoSachetImg);
		pageLoad();
	}
	
	public void clickEnoSachetText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(EnoSachetText);
		clickElementUsingJavaScript(EnoSachetText);
		pageLoad();
	}
	
	public void clickEnoBottleImg() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(EnoBottleImg);
		clickElementUsingJavaScript(EnoBottleImg);
		pageLoad();
	}
	
	public void clickEnoBottleText() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(EnoBottleText);
		clickElementUsingJavaScript(EnoBottleText);
		pageLoad();
	}
	
	

}
