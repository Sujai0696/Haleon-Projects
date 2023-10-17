package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class CMXPage extends BaseClass{
	
	public CMXPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='javascript:;' and text()='Ohio']")
	private static WebElement txtOhio;
	
	@FindBy(xpath = "//a[text()='Liberty Township  -  AWS 1']")
	private static WebElement txtLiberty;
	
	
	@FindBy(xpath = "//span[normalize-space()='Sign In']")
	private static WebElement btnSignIn;
	
	@FindBy(xpath = "//input[@id='txtemail']")
	private static WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='password']")
	private static WebElement txtPwd;
	
	@FindBy(xpath = "//label[@title='Remember me']")
	private static WebElement btnRememberMe;
	
	@FindBy(xpath = "//a[@id='btnlogin']")
	private static WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='Testing']")
	private static WebElement txtTesting;
	
	
	
	
	
	
	public void clickLogin() throws Exception {
		waitForPageLoadJava();
		if (txtOhio.isDisplayed()) {
			scrollDownUsingElement(txtOhio);
			txtOhio.click();
			
			visibilityOf(txtLiberty);
			txtLiberty.click();
			
			Thread.sleep(5000);
			waitUntilElementClickable(btnSignIn);
//			visibilityOf(btnSignIn);
			moveToElement(btnSignIn);
			actionClick(btnSignIn);
			
			visibilityOf(txtEmail);
			scrollDownUsingElement(txtEmail);
			txtEmail.sendKeys("testdev9@mailinator.com");
			txtPwd.sendKeys("Test@123");
			btnRememberMe.click();
			btnLogin.click();
			
			
			Thread.sleep(5000);
			visibilityOf(txtTesting);
			Assert.assertTrue(txtTesting.isDisplayed());
			
			System.out.println("Page has login successfully");
		} else {
			System.out.println("Ohio is not prsented in the page");
			throw new Exception("Ohio is not prsented in the page");
		}
	}
	
	

}
