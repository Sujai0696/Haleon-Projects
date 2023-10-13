package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneScienceOfSensodynePage extends BaseClass{
	
	public SensodyneScienceOfSensodynePage() {
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
	
	@FindBy(xpath = "//*[@title='All Articles']//self::a[@id='article-feature']")
	private static WebElement allArticle;
	
	@FindBy(xpath = "//*[@title='Whitening Sensitive Teeth']//self::a[@id='article-whitening']")
	private static WebElement whiteningSensitiveTeeth;
	
	@FindBy(xpath = "//*[@title='Managing Sensitive Teeth']//self::a[@id='article-managing']")
	private static WebElement managingSensitiveTeeth;
	
	@FindBy(xpath = "//*[@title='Sensodyne and Innovation']//self::a[@id='article-innovation']")
	private static WebElement sensodyneAndInnovation;
	
	@FindBy(xpath = "//*[@title='Recognizing Sensitive Teeth']//self::a[@id='article-recognizing']")
	private static WebElement recognizingSensitiveTeeth;
	
	@FindBy(xpath = "//*[@title='Sensitive Teeth and Gum Health']//self::a[@id='article-beyond']")
	private static WebElement beyondSensitiveTeeth;
	
	@FindBy(xpath = "(//a[text()='See It in Action'])[1]")
	private static WebElement seeItInActionOne;
	
	@FindBy(xpath = "(//a[text()='See It in Action'])[2]")
	private static WebElement seeItInActionTwo;
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Find the Right Toothpaste']")
	private static WebElement findTheRightToothpaste;
	
	
	
	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
			implicitWait();
			Assert.assertTrue(elementIsDisplayed(cookieClose));
		} catch (Exception e) {
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
	
	public void clickAllAriticle() throws Exception{
		implicitWait();
		elementToBeClickable(allArticle);
		clickElementUsingJavaScript(allArticle);
//		elementClick(allArticle);
	}
	
	public void clickWhiteningSensitiveTeeth() throws Exception{
		implicitWait();
		elementToBeClickable(whiteningSensitiveTeeth);
		clickElementUsingJavaScript(whiteningSensitiveTeeth);
//		elementClick(whiteningSensitiveTeeth);
	}
	
	public void clickManagingSensitiveTeeth() throws Exception{
		implicitWait();
		elementToBeClickable(managingSensitiveTeeth);
		clickElementUsingJavaScript(managingSensitiveTeeth);
//		elementClick(managingSensitiveTeeth);
	}
	
	public void clickSensodyneAndInnovation() throws Exception{
		implicitWait();
		elementToBeClickable(sensodyneAndInnovation);
		clickElementUsingJavaScript(sensodyneAndInnovation);
//		elementClick(sensodyneAndInnovation);
	}
	
	public void clickRecognizingSensitiveTeeth() throws Exception{
		implicitWait();
		elementToBeClickable(recognizingSensitiveTeeth);
		clickElementUsingJavaScript(recognizingSensitiveTeeth);
//		elementClick(recognizingSensitiveTeeth);
	}
	
	public void clickBeyondSensitiveTeeth() throws Exception{
		implicitWait();
		elementToBeClickable(beyondSensitiveTeeth);
		clickElementUsingJavaScript(beyondSensitiveTeeth);
//		elementClick(beyondSensitiveTeeth);
	}
	
	public void clickSeeItInActionOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeItInActionOne);
		clickElementUsingJavaScript(seeItInActionOne);
		pageLoad();
	}
	
	public void clickSeeItInActionTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeItInActionTwo);
		clickElementUsingJavaScript(seeItInActionTwo);
		pageLoad();
	}
	
	public void clickFindTheRightToothpaste() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findTheRightToothpaste);
		clickElementUsingJavaScript(findTheRightToothpaste);
		pageLoad();
	}

}
