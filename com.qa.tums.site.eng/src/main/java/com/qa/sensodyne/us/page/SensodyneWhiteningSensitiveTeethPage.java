package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneWhiteningSensitiveTeethPage extends BaseClass{

	public SensodyneWhiteningSensitiveTeethPage() {
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

	@FindBy(xpath = "//h2[@id='that-shock1']//following::a[text()='Learn How']")
	private static WebElement learnHow;

	@FindBy(xpath = "//a[text()='Myth vs Truth: Do Brushing & Flossing Cause Sensitive Teeth?']")
	private static WebElement mythVsTruth;

	@FindBy(xpath = "//a[text()='Sensitivity After a Trip to the Dentist']")
	private static WebElement sensitivityAfterATrip;

	@FindBy(xpath = "//a[text()='Get Helpful Tips']")
	private static WebElement getHelpfulTips;

	@FindBy(xpath = "//a[text()='Sensitive Teeth Pain Relief']")
	private static WebElement sensitiveTeethPainReleif;

	@FindBy(xpath = "//a[text()='How to Help Sensitive Teeth After Whitening']")
	private static WebElement howToHelpSensitiveTeeth;

	@FindBy(xpath = "//a[text()='Sensodyne True White Ingredients and How They Work']")
	private static WebElement sensodyneTrueWhite;

	@FindBy(xpath = "//a[text()='Teeth Sensitive to Sugar']")
	private static WebElement teethSensitiveToSugar;

	@FindBy(xpath = "//a[text()='Find the Right Toothpaste']")
	private static WebElement findTheRightToothPaste;



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

	public void clickLearnHow() throws Exception{
		scrollDownUsingElement(learnHow);
		clickElementUsingJavaScript(learnHow);
		Thread.sleep(3000);
	}

	public void clickMythVsTruthLink() throws Exception{
		scrollDownUsingElement(mythVsTruth);
		clickElementUsingJavaScript(mythVsTruth);
		waitForPageLoadJava();
	}

	public void clickSensitivityAfterATrip() throws Exception{
		scrollDownUsingElement(sensitivityAfterATrip);
		clickElementUsingJavaScript(sensitivityAfterATrip);
		waitForPageLoadJava();
	}

	public void clickGetHelpfulTips() throws Exception{
		scrollDownUsingElement(getHelpfulTips);
		clickElementUsingJavaScript(getHelpfulTips);
		waitForPageLoadJava();
	}

	public void clickSensitiveTeethPainReleif() throws Exception{
		scrollDownUsingElement(sensitiveTeethPainReleif);
		clickElementUsingJavaScript(sensitiveTeethPainReleif);
		waitForPageLoadJava();
	}

	public void clickHowToHelpSensitiveTeeth() throws Exception{
		scrollDownUsingElement(howToHelpSensitiveTeeth);			
		clickElementUsingJavaScript(howToHelpSensitiveTeeth);
		waitForPageLoadJava();
	}

	public void clickSensodyneTrueWhite() throws Exception{
		scrollDownUsingElement(sensodyneTrueWhite);
//		elementToBeClickable(sensodyneTrueWhite);
		clickElementUsingJavaScript(sensodyneTrueWhite);
		waitForPageLoadJava();
	}

	public void clickTeethSensitiveToSugar() throws Exception{
		scrollDownUsingElement(teethSensitiveToSugar);
//		elementToBeClickable(teethSensitiveToSugar);
		clickElementUsingJavaScript(teethSensitiveToSugar);
		waitForPageLoadJava();
	}

	public void clickFindTheRightToothPaste() throws Exception{
		scrollDownUsingElement(findTheRightToothPaste);
//		elementToBeClickable(findTheRightToothPaste);
		clickElementUsingJavaScript(findTheRightToothPaste);
		waitForPageLoadJava();
	}
}
