package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneManagingSensitiveTeethPage extends BaseClass{

	public SensodyneManagingSensitiveTeethPage() {
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
	
	@FindBy(xpath = "//h2[@id='deal-sensitivity']//following::a[@href='/en-us/oral-health-tips/managing-sensitive-teeth/sensitivity-to-cold/']")
	private static WebElement findOutOne;
	
	@FindBy(xpath = "//h2[@id='tips-tooth']//following::a[@href='/en-us/oral-health-tips/managing-sensitive-teeth/sensitivity-to-hot/']")
	private static WebElement checkThemOut;
	
	@FindBy(xpath = "//h2[@id='tooth-pain']//following::a[@href='/en-us/oral-health-tips/managing-sensitive-teeth/crown-tooth-pain/']")
	private static WebElement findOutTwo;
	
	@FindBy(xpath = "//h2[@id='tooth-pain']//following::a[@href='/en-us/oral-health-tips/managing-sensitive-teeth/understanding-tooth-sensitivity-after-root-canal/']")
	private static WebElement findOutThree;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Find the Right Toothpaste']")
	private static WebElement findTheRightToothPaste;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::a[text()='Managing Sensitive Teeth']")
	private static WebElement breadCrumb;
	
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
	
	public void clickFindOutOne() throws Exception{
		scrollDownUsingElement(findOutOne);
		clickElementUsingJavaScript(findOutOne);
		waitForPageLoadJava();
	}
	
	public void clickCheckThemOut() throws Exception{
		scrollDownUsingElement(checkThemOut);
		clickElementUsingJavaScript(checkThemOut);
		waitForPageLoadJava();
	}
	
	public void clickFindOutTwo() throws Exception{
		scrollDownUsingElement(findOutTwo);
		clickElementUsingJavaScript(findOutTwo);
		waitForPageLoadJava();
	}
	
	public void clickFindOutThree() throws Exception{
		scrollDownUsingElement(findOutThree);
		clickElementUsingJavaScript(findOutThree);
		waitForPageLoadJava();
	}
	
	public void clickFindTheRightToothPaste() throws Exception{
		scrollDownUsingElement(findTheRightToothPaste);
		clickElementUsingJavaScript(findTheRightToothPaste);
		waitForPageLoadJava();
	}
	
	public void clickBreadCrumb() throws Exception{
		scrollDownUsingElement(breadCrumb);
		clickElementUsingJavaScript(breadCrumb);
		waitForPageLoadJava();
	}
	
	
}
