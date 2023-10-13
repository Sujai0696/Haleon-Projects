package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneHowLongShouldYouBrushYourTeethPage extends BaseClass{
	
	public SensodyneHowLongShouldYouBrushYourTeethPage() {
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
	
	@FindBy(xpath = "//a[text()='Sensodyne Sensitive Care']")
	private static WebElement sensodyneSensitiveCare;
	
	@FindBy(xpath = "//a[text()='oral health tips from Sensodyne']")
	private static WebElement oralHealthTips;
	
	@FindBy(xpath = "//a[text()='recognizing sensitive teeth']")
	private static WebElement recognizingSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='whitening sensitive teeth']")
	private static WebElement whiteningSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Bleeding Gums and Sensitivity']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Sensitivity After a Trip to the Dentist']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Two Benefits. One Toothpaste.']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement relatedArticleFour;
	
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
	
	public void clickSensodyneSensitiveCare() throws Exception{
		scrollDownUsingElement(sensodyneSensitiveCare);
		clickElementUsingJavaScript(sensodyneSensitiveCare);
		waitForPageLoadJava();
	}
	
	public void clickOralHealthTips() throws Exception{
		scrollDownUsingElement(oralHealthTips);
		clickElementUsingJavaScript(oralHealthTips);
		waitForPageLoadJava();
	}
	
	public void clickRecognizingSensitiveTeeth() throws Exception{
		scrollDownUsingElement(recognizingSensitiveTeeth);
		clickElementUsingJavaScript(recognizingSensitiveTeeth);
		waitForPageLoadJava();
	}
	
	public void clickWhiteningSensitiveTeeth() throws Exception{
		scrollDownUsingElement(whiteningSensitiveTeeth);
		clickElementUsingJavaScript(whiteningSensitiveTeeth);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleOne() throws Exception{
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
		waitForPageLoadJava();
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
		waitForPageLoadJava();

	}
	
	public void clickRelatedArticleThree() throws Exception{
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
		waitForPageLoadJava();

	}
	
	public void clickRelatedArticleFour() throws Exception{
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
		waitForPageLoadJava();
	}

}
