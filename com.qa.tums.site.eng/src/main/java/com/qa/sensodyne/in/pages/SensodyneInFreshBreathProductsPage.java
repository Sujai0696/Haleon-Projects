package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneInFreshBreathProductsPage extends BaseClass{
	
	public SensodyneInFreshBreathProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[text()='Fresh Mint']//ancestor::a[@href='/products/sensodyne-fresh-mint-toothpaste.html']")
	private static WebElement prdtCardTextOne;
	
	@FindBy(xpath = "//img[@alt='Sensodyne toothpaste in Fresh Mint']//ancestor::a[@href='/products/sensodyne-fresh-mint-toothpaste.html']")
	private static WebElement prdtCardImgOne;
	
	@FindBy(xpath = "////div[@class='box component section prod-12 product-box first odd col-xs-12 col-sm-6 col-md-3']//a[@class='buy-hover'][normalize-space()='Buy Now']")
	private static WebElement buyNowOne;
	
	@FindBy(xpath = "//div[@class='hover-content' and @style='display: block;']")
	private static WebElement buyNowVerify;
	
	
	@FindBy(xpath = "//strong[text()='Deep Clean']//ancestor::a[@href='/products/sensodyne-deep-clean-toothpaste.html']")
	private static WebElement prdtCardTextTwo;
	
	@FindBy(xpath = "//img[@alt='Sensodyne toothpaste in Deep Clean']//ancestor::a[@href='/products/sensodyne-deep-clean-toothpaste.html']")
	private static WebElement prdtCardImgTwo;
	
	@FindBy(xpath = "//div[@class='box component section prod-9 product-box even col-xs-12 col-sm-6 col-md-3 col-md-offset-0']//a[@class='buy-hover'][normalize-space()='Buy Now']")
	private static WebElement buyNowTwo;
	
	@FindBy(xpath = "//strong[text()='Fresh Gel']//ancestor::a[@href='/products/sensodyne-fresh-gel.html']")
	private static WebElement prdtCardTextThree;
	
	@FindBy(xpath = "//img[@alt='Sensodyne Nourish Naturally Fresh Toothpaste']//ancestor::a[@href='/products/sensodyne-fresh-gel.html']")
	private static WebElement prdtCardImgThree;
	
	@FindBy(xpath = "//div[@class='box component section prod-1 product-box odd col-xs-6 col-sm-6 col-md-6 col-lg-3']//a[@class='buy-hover'][normalize-space()='Buy Now']")
	private static WebElement buyNowThree;
	
	
	
	
	public void clickPrdtCardTextOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardTextOne)) {
			scrollDownUsingElement(prdtCardTextOne);
			clickElementUsingJavaScript(prdtCardTextOne);
			pageLoad();
			System.out.println("prdtCardTextOne clicked successfully");
		} else {
			System.out.println("prdtCardTextOne is not presented in the page");
			throw new Exception("prdtCardTextOne is not presented in the page");
		}
	}
	
	public void clickPrdtCardImgOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardImgOne)) {
			scrollDownUsingElement(prdtCardImgOne);
			clickElementUsingJavaScript(prdtCardImgOne);
			pageLoad();
			System.out.println("prdtCardImgOne clicked successfully");
		} else {
			System.out.println("prdtCardImgOne is not presented in the page");
			throw new Exception("prdtCardImgOne is not presented in the page");
		}
	}
	
	public void clickPrdtCardBuyNowOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowOne)) {
			scrollDownUsingElement(buyNowOne);
			moveToElement(buyNowOne);
			actionClick(buyNowOne);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("prdtCardBuyNowOne verified successfully");
		} else {
			System.out.println("prdtCardBuyNowOne is not presented in the page");
			throw new Exception("prdtCardBuyNowOne is not presented in the page");
		}
	}
	
	
	public void clickPrdtCardTextTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardTextTwo)) {
			scrollDownUsingElement(prdtCardTextTwo);
			clickElementUsingJavaScript(prdtCardTextTwo);
			pageLoad();
			System.out.println("prdtCardTextTwo clicked successfully");
		} else {
			System.out.println("prdtCardTextTwo is not presented in the page");
			throw new Exception("prdtCardTextTwo is not presented in the page");
		}
	}
	
	public void clickPrdtCardImgTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardImgTwo)) {
			scrollDownUsingElement(prdtCardImgTwo);
			clickElementUsingJavaScript(prdtCardImgTwo);
			pageLoad();
			System.out.println("prdtCardImgTwo clicked successfully");
		} else {
			System.out.println("prdtCardImgTwo is not presented in the page");
			throw new Exception("prdtCardImgTwo is not presented in the page");
		}
	}
	
	public void clickPrdtCardBuyNowTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowTwo)) {
			scrollDownUsingElement(buyNowTwo);
			moveToElement(buyNowTwo);
			actionClick(buyNowTwo);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("prdtCardBuyNowTwo verified successfully");
		} else {
			System.out.println("prdtCardBuyNowTwo is not presented in the page");
			throw new Exception("prdtCardBuyNowTwo is not presented in the page");
		}
	}
	
	public void clickPrdtCardTextThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardTextThree)) {
			scrollDownUsingElement(prdtCardTextThree);
			clickElementUsingJavaScript(prdtCardTextThree);
			pageLoad();
			System.out.println("prdtCardTextThree clicked successfully");
		} else {
			System.out.println("prdtCardTextThree is not presented in the page");
			throw new Exception("prdtCardTextThree is not presented in the page");
		}
	}
	
	public void clickPrdtCardImgThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(prdtCardImgThree)) {
			scrollDownUsingElement(prdtCardImgThree);
			clickElementUsingJavaScript(prdtCardImgThree);
			pageLoad();
			System.out.println("prdtCardImgThree clicked successfully");
		} else {
			System.out.println("prdtCardImgThree is not presented in the page");
			throw new Exception("prdtCardImgThree is not presented in the page");
		}
	}
	
	public void clickPrdtCardBuyNowThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowThree)) {
			scrollDownUsingElement(buyNowThree);
			moveToElement(buyNowThree);
			actionClick(buyNowThree);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("prdtCardBuyNowThree verified successfully");
		} else {
			System.out.println("prdtCardBuyNowThree is not presented in the page");
			throw new Exception("prdtCardBuyNowThree is not presented in the page");
		}
	}
	
	
	
	
	
	

}
