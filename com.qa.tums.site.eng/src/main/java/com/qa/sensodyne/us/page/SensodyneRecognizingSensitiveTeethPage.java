package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneRecognizingSensitiveTeethPage extends BaseClass{

	public SensodyneRecognizingSensitiveTeethPage() {
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
	
	@FindBy(xpath = "//h2[text()='That Shock of Pain Could Be Tooth Sensitivity']//following::a[text()='Learn How']")
	private static WebElement learMore;

	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/recognizing-sensitive-teeth/brushing-flossing-cause-sensitive-teeth/']//self::a[text()='Myth vs Truth: Do Brushing & Flossing Cause Sensitive Teeth?']")
	private static WebElement mythVsTruth;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/recognizing-sensitive-teeth/tooth-sensitivity-after-dentist/']//self::a[text()='Sensitivity After a Trip to the Dentist']")
	private static WebElement sensitivityAfterATrip;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/recognizing-sensitive-teeth/cavity-vs-sensitivity/']//self::a[text()='Is It a Cavity or Sensitive Teeth?']")
	private static WebElement cavityOrSensitiveTeeth;
	
	@FindBy(xpath = "//*[@href='/en-us/oral-health-tips/recognizing-sensitive-teeth/sensodyne-vs-pronamel/']//self::a[text()='Sensodyne or Pronamel: Which Toothpaste Is for You?']")
	private static WebElement sensodyneOrPronamel;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Find the Right Toothpaste']")
	private static WebElement findTheRightToothPaste;
	
	@FindBy(xpath = "//*[@class='breadcrumb-list-item odd last is-current ']//self::a[text()='Recognizing Sensitive Teeth']")
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
	
	public void clickLearnMore() throws Exception{
		scrollDownUsingElement(learMore);
		clickElementUsingJavaScript(learMore);
		waitForPageLoadJava();
	}
	
	public void clickMythVsTruth() throws Exception{
		scrollDownUsingElement(mythVsTruth);
		clickElementUsingJavaScript(mythVsTruth);
		waitForPageLoadJava();
	}
	
	public void clickSensitivityAfterATrip() throws Exception{
		scrollDownUsingElement(sensitivityAfterATrip);
		clickElementUsingJavaScript(sensitivityAfterATrip);
		waitForPageLoadJava();
	}
	
	public void clickCavityOrSensitiveTeeth() throws Exception{
		scrollDownUsingElement(cavityOrSensitiveTeeth);
		clickElementUsingJavaScript(cavityOrSensitiveTeeth);
		waitForPageLoadJava();
	}
	
	public void clickSensodyneOrPronamel() throws Exception{
		scrollDownUsingElement(sensodyneOrPronamel);
		clickElementUsingJavaScript(sensodyneOrPronamel);
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
