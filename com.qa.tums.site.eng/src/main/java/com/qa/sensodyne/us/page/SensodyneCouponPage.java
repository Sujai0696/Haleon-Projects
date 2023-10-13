package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCouponPage extends BaseClass{

	public SensodyneCouponPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;

	@FindBy(xpath = "//input[@class='cmp-form-text__text input-name has-no-error'or@data-display-name='Please enter your First Name.']")
	private static WebElement txtFirstName;

	@FindBy(xpath = "//input[@class='cmp-form-text__text last-input-name has-no-error'or@data-display-name='Please enter your Last Name.']")
	private static WebElement txtLasteName;

	@FindBy(xpath = "//input[@class='cmp-form-text__text input-email has-no-error has-no-invalid-error'or@data-display-name='Please enter a valid Email Address.']")
	private static WebElement txtEmail;

	@FindBy(xpath = "//input[@class='cmp-form-text__text input-code has-no-error'or@data-display-name='Please enter a valid ZIP code.']")
	private static WebElement numZIPCode;

	@FindBy(xpath = "//input[@class='cmp-form-text__text input-day input-error']")
	private static WebElement dob;

	@FindBy(xpath = "//*[text()='Not at all bothered']//preceding::input[@class='cmp-cf-form-qa__field cmp-form-qa__field--radio']")
	private static WebElement rd1PreProd;

	@FindBy(xpath = "(//input[@value='Not at all bothered'])[2]")
	private static WebElement rd1Live;
	
	@FindBy(xpath = "(//*[text()='Not very bothered']//preceding::input[@class='cmp-cf-form-qa__field cmp-form-qa__field--radio'])[2]")
	private static WebElement rd2PreProd;
	
	@FindBy(xpath = "(//input[@value='Not very bothered'])[2]")
	private static WebElement rd2Live;
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//p[text()='*You can redeem a coupon up to 2 times within a year']")
	private static WebElement getCouponResult;
	
	
	




	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
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
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	
	public void firstName() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(txtFirstName);
		elementSendKeys(txtFirstName, "AAA");
		pageLoad();
	}
	
	public void lastName() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(txtLasteName);
		elementSendKeys(txtLasteName, "BBB");
		pageLoad();
	}
	
	public void email() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(txtEmail);
		elementSendKeys(txtEmail, "AAABBB@gmail.com");
		pageLoad();
	}
	
	public void zipCode() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(numZIPCode);
		elementSendKeys(numZIPCode, "AAABBB@gmail.com");
		pageLoad();
	}
	
	public void dob() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(dob);
		elementSendKeys(dob, "18061996");
		pageLoad();
	}
	

	public void radioButtonOne() throws Exception{
		waitForPageLoadJava();
		scrollPageInUpAndDown();
		if (isElementPresent(rd1PreProd)) {
			clickElementUsingJavaScript(rd1PreProd);
			if (rd1PreProd.isSelected()) {
				System.out.println("Radio button one is selectd in preprod");
			}
			else {
				System.out.println("Radio button one is not selectd in preprod");
				Assert.assertTrue(false);
			}
		} else if (isElementPresent(rd1Live)){
			clickElementUsingJavaScript(rd1Live);
			if (rd1Live.isSelected()) {
				System.out.println("Radio button one is selectd in Live");
			}else {
				System.out.println("Radio button one is not selectd in Live");
				Assert.assertTrue(false);
			}
		}
		pageLoad();
	}



	public void radioButtonTwo() throws Exception{
		waitForPageLoadJava();
		scrollPageInUpAndDown();
		if (isElementPresent(rd2PreProd)) {
			clickElementUsingJavaScript(rd2PreProd);
			if (rd2PreProd.isSelected()) {
				System.out.println("Radio button two is selectd in preprod");
			}
			else {
				System.out.println("Radio button two is not selectd in preprod");
				Assert.assertTrue(false);
			}
		} else if (isElementPresent(rd2Live)){
			clickElementUsingJavaScript(rd2Live);
			if (rd2Live.isSelected()) {
				System.out.println("Radio button two is selectd in Live");
			}else {
				System.out.println("Radio button two is not selectd in Live");
				Assert.assertTrue(false);
			}
		}
		pageLoad();
	}
	
















}
