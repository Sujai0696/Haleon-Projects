package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class EnoProductsPage extends BaseClass{
	
	public EnoProductsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::li[@class='carousel-nav-item is-active lslide active']")
	private static WebElement sachetRegularActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='3']")
	private static WebElement sachetLemon;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='3']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement sachetLemonActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='5']")
	private static WebElement sachetCola;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='5']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement sachetColaActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='7']")
	private static WebElement sachetOrange;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='7']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement sachetOrangeActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='9']")
	private static WebElement sachetAjwain;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='9']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement sachetAjwainActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='11']")
	private static WebElement sachetMusambi;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lsGrab lSSlide']//ancestor::a[text()='11']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement sachetMusambiActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lSSlide']//ancestor::a[text()='1']//ancestor::li[@class='carousel-nav-item is-active lslide active']")
	private static WebElement bottleRegularActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lSSlide']//ancestor::a[text()='3']")
	private static WebElement bottleLemon;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lSSlide']//ancestor::a[text()='3']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement bottleLemonActive;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lSSlide']//ancestor::a[text()='5']")
	private static WebElement bottleOrange;
	
	@FindBy(xpath = "//ul[@class='carousel-nav lightSlider lSSlide']//ancestor::a[text()='5']//ancestor::li[@class='carousel-nav-item lslide is-active']")
	private static WebElement bottleOrangeActive;
	
	
	
	
	public void clickSachetLemon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sachetRegularActive)) {
			scrollDownUsingElement(sachetRegularActive);
			clickElementUsingJavaScript(sachetLemon);
			visibilityOf(sachetLemonActive);
			Assert.assertTrue(elementIsDisplayed(sachetLemonActive));
			System.out.println("Lemon flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickSachetCola() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sachetRegularActive)) {
			scrollDownUsingElement(sachetRegularActive);
			clickElementUsingJavaScript(sachetCola);
			visibilityOf(sachetColaActive);
			Assert.assertTrue(elementIsDisplayed(sachetColaActive));
			System.out.println("Cola flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickSachetOrange() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sachetRegularActive)) {
			scrollDownUsingElement(sachetRegularActive);
			clickElementUsingJavaScript(sachetOrange);
			visibilityOf(sachetOrangeActive);
			Assert.assertTrue(elementIsDisplayed(sachetOrangeActive));
			System.out.println("Orange flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickSachetAjwain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sachetRegularActive)) {
			scrollDownUsingElement(sachetRegularActive);
			clickElementUsingJavaScript(sachetOrange);
			visibilityOf(sachetOrangeActive);
			Assert.assertTrue(elementIsDisplayed(sachetOrangeActive));
			clickElementUsingJavaScript(sachetAjwain);
			visibilityOf(sachetAjwainActive);
			Assert.assertTrue(elementIsDisplayed(sachetAjwainActive));
			System.out.println("Ajwain flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickSachetMusambi() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(sachetRegularActive)) {
			scrollDownUsingElement(sachetRegularActive);
			clickElementUsingJavaScript(sachetOrange);
			visibilityOf(sachetOrangeActive);
			Assert.assertTrue(elementIsDisplayed(sachetOrangeActive));
			clickElementUsingJavaScript(sachetMusambi);
			visibilityOf(sachetMusambiActive);
			Assert.assertTrue(elementIsDisplayed(sachetMusambiActive));
			System.out.println("Musambi flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickBottleLemon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bottleRegularActive)) {
			scrollDownUsingElement(bottleRegularActive);
			clickElementUsingJavaScript(bottleLemon);
			visibilityOf(bottleLemonActive);
			Assert.assertTrue(elementIsDisplayed(bottleLemonActive));
			System.out.println("Lemon flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
	public void clickBottleOrange() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bottleRegularActive)) {
			scrollDownUsingElement(bottleRegularActive);
			clickElementUsingJavaScript(bottleOrange);
			visibilityOf(bottleOrangeActive);
			Assert.assertTrue(elementIsDisplayed(bottleOrangeActive));
			System.out.println("Orange flavour clicked and verified successfully");
		} else {
			System.out.println("Flavour one is not active");
			throw new Exception("Flavour one is not active");
		}
	}
	
}
