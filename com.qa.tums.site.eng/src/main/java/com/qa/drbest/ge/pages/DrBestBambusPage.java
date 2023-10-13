package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class DrBestBambusPage extends BaseClass{
	
	
	public DrBestBambusPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()='Akzeptieren']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//h2[text()='Unsere Nachhaltigen aus Bambus']")
	private static WebElement scroll;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/drbest/master/products/Nature/Bambu-Interdent-Kids/Desktop_Product_Overview_DrBEST_Project-Panda_Bamboo-Brush-v2.jpg?auto=format')]")
	private static WebElement interdentKids;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/drbest/master/products/Nature/Bambus-Interdent/Desktop_Product_Overview_DrBEST_Project-Panda_Bamboo-Brush.jpg?auto=format')]")
	private static WebElement interdent;
	
	@FindBy(xpath = "//a[@href='/zahnbuersten/bambus-interdent-kids/']//self::a[text()='Mehr erfahren']")
	private static WebElement interdentKidsButton;
	
	@FindBy(xpath = "//a[@href='/zahnbuersten/bambus-interdent/']//self::a[text()='Mehr erfahren']")
	private static WebElement interdentButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			Assert.assertTrue(false);
		}
	}
	
	public void clickInterdentKids() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(scroll);
		clickElementUsingJavaScript(interdentKids);
		pageLoad();
	}
	
	public void clickInterdent() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(scroll);
		clickElementUsingJavaScript(interdent);
		pageLoad();
	}
	
	public void clickInterdentKidsButton() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(interdentKidsButton);
		clickElementUsingJavaScript(interdentKidsButton);
		pageLoad();
	}
	
	public void clickInterdentButton() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(interdentButton);
		clickElementUsingJavaScript(interdentButton);
		pageLoad();
	}
	
	


}
