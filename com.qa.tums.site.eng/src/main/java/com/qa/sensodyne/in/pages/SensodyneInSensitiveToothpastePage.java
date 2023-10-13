package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneInSensitiveToothpastePage extends BaseClass{
	
	public SensodyneInSensitiveToothpastePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/products/sensodyne-rapid-relief-toothpaste.html']")
	private static WebElement prdtCardText;
	
	@FindBy(xpath = "//img[@alt='Sensodyne Rapid Relief toothpaste in Mint']//ancestor::a[@href='/products/sensodyne-rapid-relief-toothpaste.html']")
	private static WebElement prdtCardImg;
	
	@FindBy(xpath = "//a[@class='buy-hover' and text()='Buy Now ']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//div[@class='hover-content' and @style='display: block;']")
	private static WebElement buyNowVerify;
	
	@FindBy(xpath = "//a[@href='/where-to-buy.html']//img[@alt='Where to buy']")
	private static WebElement findYourStore;
	
	
	
	
	
	public void clickPrdtCardText() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardText)) {
			scrollDownUsingElement(prdtCardText);
			clickElementUsingJavaScript(prdtCardText);
			pageLoad();
			System.out.println("prdtCardText clicked successfully");
		} else {
			System.out.println("prdtCardText is not presented in the page");
			throw new Exception("prdtCardText is not presented in the page");
		}
	}
	
	public void clickPrdtCardImg() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardImg)) {
			scrollDownUsingElement(prdtCardImg);
			clickElementUsingJavaScript(prdtCardImg);
			pageLoad();
			System.out.println("prdtCardImg clicked successfully");
		} else {
			System.out.println("prdtCardImg is not presented in the page");
			throw new Exception("prdtCardImg is not presented in the page");
		}
	}
	
	public void clickPrdtCardBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			moveToElement(buyNow);
			actionClick(buyNow);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("prdtCardBuyNow verified successfully");
		} else {
			System.out.println("prdtCardBuyNow is not presented in the page");
			throw new Exception("prdtCardBuyNow is not presented in the page");
		}
	}
	
	public void clickFindYourStore() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(findYourStore)) {
			scrollDownUsingElement(findYourStore);
			clickElementUsingJavaScript(findYourStore);
			pageLoad();
			System.out.println("findYourStore clicked successfully");
		} else {
			System.out.println("findYourStore is not presented in the page");
			throw new Exception("findYourStore is not presented in the page");
		}
	}
	
	

}
