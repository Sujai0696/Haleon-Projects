package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneGumHealthPage extends BaseClass{

	public SensodyneGumHealthPage() {
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
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/sensitivity-and-gum-ingredients/']//self::a[text()='Learn More']")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/improve-gum-health/']//self::a[text()='Find Out Why']")
	private static WebElement findOutWhy;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/gingivitis/']//self::a[text()='Learn More']")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "//*[@href='/en-us/understanding-tooth-sensitivity/bleeding-gums-and-sensitivity/']//self::a[text()='Learn More']")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/tooth-pain-causes/']//self::a[text()='Learn More']")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/what-is-a-filling/']//self::a[text()='Find Out']")
	private static WebElement findOutOne;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/brush-or-floss-first/']//self::a[text()='Find Out']")
	private static WebElement findOutTwo;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/tips-healthy-gum-teeth/']//self::a[text()='Learn More']")
	private static WebElement learnMoreFive;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/what-is-sls-toothpaste/']//self::a[text()='Learn More']")
	private static WebElement learnMoreSix;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/gum-health/remove-tartar-from-teeth/']//self::a[text()='Learn More']")
	private static WebElement learnMoreSeven;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Find the Right Toothpaste']")
	private static WebElement findTheRightToothPaste;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::a[text()='Sensitive Teeth and Gum Health']")
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
	
	public void clickLearnMoreOne() throws Exception{
		scrollDownUsingElement(learnMoreOne);
		clickElementUsingJavaScript(learnMoreOne);
		waitForPageLoadJava();
	}
	
	public void clickFindOutWhy() throws Exception{
		scrollDownUsingElement(findOutWhy);
		clickElementUsingJavaScript(findOutWhy);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreTwo() throws Exception{
		scrollDownUsingElement(learnMoreTwo);
		clickElementUsingJavaScript(learnMoreTwo);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreThree() throws Exception{
		scrollDownUsingElement(learnMoreThree);
		clickElementUsingJavaScript(learnMoreThree);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreFour() throws Exception{
		scrollDownUsingElement(learnMoreFour);
		clickElementUsingJavaScript(learnMoreFour);
		waitForPageLoadJava();
	}
	
	public void clickFindOutOne() throws Exception{
		scrollDownUsingElement(findOutOne);
		clickElementUsingJavaScript(findOutOne);
		waitForPageLoadJava();
	}
	
	public void clickFindOutTwo() throws Exception{
		scrollDownUsingElement(findOutTwo);
		clickElementUsingJavaScript(findOutTwo);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreFive() throws Exception{
		scrollDownUsingElement(learnMoreFive);
		clickElementUsingJavaScript(learnMoreFive);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreSix() throws Exception{
		scrollDownUsingElement(learnMoreSix);
		clickElementUsingJavaScript(learnMoreSix);
		waitForPageLoadJava();
	}
	
	public void clickLearnMoreSeven() throws Exception{
		scrollDownUsingElement(learnMoreSeven);
		clickElementUsingJavaScript(learnMoreSeven);
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
