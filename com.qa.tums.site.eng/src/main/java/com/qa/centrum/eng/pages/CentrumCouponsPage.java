package com.qa.centrum.eng.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CentrumCouponsPage extends BaseClass{

	public CentrumCouponsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[@class='heading']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "(//input[@name='profile.firstName'])[1]")
	private static WebElement txtFirstName;

	@FindBy(xpath = "(//input[@name='profile.email'])[1]")
	private static WebElement txtEmail;

	@FindBy(xpath = "(//input[@name='profile.birthDay'])[1]")
	private static WebElement txtDate;
	
	@FindBy(xpath = "(//input[@name='profile.birthMonth'])[1]")
	private static WebElement txtMonth;
	
	@FindBy(xpath = "(//input[@name='profile.birthYear'])[1]")
	private static WebElement txtYear;

	@FindBy(xpath = "//button[normalize-space()='Submit']//self::button[@class='cmp-form-button form-submit']")
	private static WebElement btnSubmit;

	@FindBy(xpath = "//p[text()='Thanks for Signing Up!']")
	private static WebElement txtSigningUp;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private static WebElement btnOk;
	
	
	@FindBy(xpath = "//strong[text()='The ABCs of Vitamin D']")
	private static WebElement recommendedArticleOne;
	
	@FindBy(xpath = "//strong[text()='How to Take Vitamins and When You Should Take Them']")
	private static WebElement recommendedArticleTwo;
	
	
	
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
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}

	public void clickGigyaForm() {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void txtFirstName(String name) throws Exception{

		if (elementVisible(txtFirstName)) {
			elementSendKeys(txtFirstName, name);
		}
	}

	public void txtEmail(String email) throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtEmail)) {
			elementSendKeys(txtEmail, email);
		}
	}

	public void txtDate(String date) throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtDate)) {
			elementSendKeys(txtDate, date);
		}
	}
	
	public void txtMonth(String month) throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtMonth)) {
			elementSendKeys(txtMonth, month);
		}
	}
	
	public void txtYear(String year) throws Exception{
		scrollDownUsingElement(txtEmail);
		if (elementVisible(txtYear)) {
			elementSendKeys(txtYear, year);
		}
	}

	
	public void btnSubmit() throws Exception{
		scrollDownUsingElement(btnSubmit);
		if (isElementPresent(btnSubmit)) {
			clickElementUsingJavaScript(btnSubmit);
			visibilityOf(txtSigningUp);
			Assert.assertTrue(elementIsDisplayed(txtSigningUp));
			clickElementUsingJavaScript(btnOk);
		} else {
			System.out.println("submit button is not visibie in the page");
			throw new Exception("submit button is not visibie in the page");
		}
	}
	
	public void clickRecommendedArticleOne() throws Exception{
		scrollDownUsingElement(recommendedArticleOne);
		clickElementUsingJavaScript(recommendedArticleOne);
	}
	
	public void clickRecommendedArticleTwo() throws Exception{
		scrollDownUsingElement(recommendedArticleTwo);
		clickElementUsingJavaScript(recommendedArticleTwo);
	}
	
	
}
