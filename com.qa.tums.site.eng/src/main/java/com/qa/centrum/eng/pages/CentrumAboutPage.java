package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

import bsh.This;

public class CentrumAboutPage extends BaseClass{
	public CentrumAboutPage() {
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
	
	@FindBy(xpath = "//a[text()='About ']")
	private static WebElement aboutbtn;
	
	@FindBy(xpath = "//a[text()='science']")
	private static WebElement sciencebtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[1]")
	private static WebElement centrumAdultbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[2]")
	private static WebElement CentrumMultiGummiesbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[3]")
	private static WebElement CenturmMinisbtn;
	
	@FindBy(xpath = "(//div[contains(@class,'box component section bg-color-white border border-color-gray-300 rounded')])[4]")
	private static WebElement MultiGummiesbtn;
	
	@FindBy(xpath = "//img[@alt='Box of Centrum Adults Multivitamins']")
	WebElement scrollDown;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[1]")
	private static WebElement  buyNow1;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[1]")
	private static WebElement compare1;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[2]")
	private static WebElement buyNow2;
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[2]")
	private static WebElement compare2;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[3]")
	private static WebElement buyNow3;
	
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[3]")
	private static WebElement compare3;
	
	@FindBy(xpath = "(//div[@class='parametrizedhtml component section default-style first odd reference-buy-now-button'])[4]")
	private static WebElement buyNow4;
	
	
	@FindBy(xpath = "(//a[@class='compare-button default-compare'])[4]")
	private static WebElement compare4;
	
	@FindBy(xpath = "//h2[text()='Recommended Articles']")
	private static WebElement articleScrollDown;

	@FindBy(xpath = "//strong[text()='What’s Good for The Heart Is Good for The Brain']")
	private static WebElement article1;
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement article2;
	
	@FindBy(xpath = "//strong[text()='6 Simple Ways to Boost Your Energy']")
	private static WebElement article3;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement article4;
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='About']")
	private static WebElement breadcrumbTwo;
	
	
	
	
	
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
	
	public void clickAboutbtn() throws Exception {
		moveToElement(aboutbtn);
		elementClick(aboutbtn);
	}
	
	public void clickSciencebtn() throws Exception {
		elementClick(sciencebtn);
	}
	
	public void clickcentrumAdultbtn() throws Exception {
		scrollDownUsingElement(centrumAdultbtn);
		elementClick(centrumAdultbtn);
	}
	
	public void clickCentrumMultiGummiesAdult() throws Exception {
		scrollDownUsingElement(CentrumMultiGummiesbtn);
		elementClick(CentrumMultiGummiesbtn);
	}
	
	public void clickCenturmMinisbtn() throws Exception {
		scrollDownUsingElement(CenturmMinisbtn);
		clickElementUsingJavaScript(CenturmMinisbtn);
	}
	
	public void clickMultiGummiesWomen() throws Exception {
		scrollDownUsingElement(MultiGummiesbtn);
		clickElementUsingJavaScript(MultiGummiesbtn);
	}
	
	public void clickbuyNow1() throws Exception {
		scrollDownUsingElement(buyNow1);
		clickElementUsingJavaScript(buyNow1);
		
	}
	
	public void clickcompare1() throws Exception {
		scrollDownUsingElement(compare1);
		clickElementUsingJavaScript(compare1);
	}
	
	public void clickbuyNow2() throws Exception {
		scrollDownUsingElement(buyNow2);
		clickElementUsingJavaScript(buyNow2);
	}
	
	public void clickcompare2() throws Exception {
		scrollDownUsingElement(compare2);
		clickElementUsingJavaScript(compare2);
	}
	
	public void clickbuyNow3() throws Exception {
		scrollDownUsingElement(buyNow3);
		clickElementUsingJavaScript(buyNow3);
	}
	public void clickcompare3() throws Exception {
		scrollDownUsingElement(compare3);
		clickElementUsingJavaScript(compare3);
	}
	public void clickbuyNow4() throws Exception {
		scrollDownUsingElement(buyNow4);
		clickElementUsingJavaScript(buyNow4);
	}
	
	public void clickcompare4() throws Exception {
		scrollDownUsingElement(compare4);
		clickElementUsingJavaScript(compare4);
	}
	public void clickarticle1() throws Exception {
		scrollDownUsingElement(article1);
		clickElementUsingJavaScript(article1);
	}
	public void clickarticle2() throws Exception {
		scrollDownUsingElement(article2);
		clickElementUsingJavaScript(article2);
	}
	public void clickarticle3() throws Exception {
		scrollDownUsingElement(article3);
		clickElementUsingJavaScript(article3);
	}
	public void clickarticle4() throws Exception {
		scrollDownUsingElement(article4);
		clickElementUsingJavaScript(article4);
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

}


