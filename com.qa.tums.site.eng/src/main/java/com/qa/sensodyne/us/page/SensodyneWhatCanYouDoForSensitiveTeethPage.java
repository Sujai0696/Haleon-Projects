package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneWhatCanYouDoForSensitiveTeethPage extends BaseClass{
	
	public SensodyneWhatCanYouDoForSensitiveTeethPage() {
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
	
	@FindBy(xpath = "//*[@class='btn']//self::a[text()='Back to the article list']")
	private static WebElement backToArticleList;
	
	@FindBy(xpath = "//a[text()='Academy of General Dentistry']")
	private static WebElement academyOfGeneralDentistry;
	
	@FindBy(xpath = "//a[text()='sensitive teeth.']")
	private static WebElement sensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='several reasons']")
	private static WebElement severalReasons;
	
	@FindBy(xpath = "//a[text()='when you eat certain foods']")
	private static WebElement whenYouEatCertainFoods;
	
	@FindBy(xpath = "//a[text()='Gingivitis']")
	private static WebElement gingivitis;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement sensodyneRapidReleif;
	
	@FindBy(xpath = "//a[text()='scrubbing too vigorously can increase the sensitivity of your teeth']")
	private static WebElement switchToAToothbrush;
	
	@FindBy(xpath = "//a[text()='enamel erosion']")
	private static WebElement enamelErosion;
	
	@FindBy(xpath = "//a[text()='check in with your dentist']")
	private static WebElement visitYourDentsitLink;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()=\"Do Your Teeth Hurt When It's Cold Out?\"]")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()=\"What To Know About Sensitive Teeth\"]")
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
	
	public void clickBackToTheArticleList() throws Exception{
		scrollDownUsingElement(backToArticleList);
		clickElementUsingJavaScript(backToArticleList);
	}
	
	public void clickAcademyOfGeneralDentistry() throws Exception{
		scrollDownUsingElement(academyOfGeneralDentistry);
		clickElementUsingJavaScript(academyOfGeneralDentistry);
		waitForPageLoadJava();
	}
	
	public void clickSensitiveTeeth() throws Exception{
		scrollDownUsingElement(sensitiveTeeth);
		clickElementUsingJavaScript(sensitiveTeeth);
		waitForPageLoadJava();
	}
	
	public void clickSeveralReasons() throws Exception{
		scrollDownUsingElement(severalReasons);
		clickElementUsingJavaScript(severalReasons);
		waitForPageLoadJava();
	}
	
	public void clickWhenYouEatCertainFoods() throws Exception{
		scrollDownUsingElement(whenYouEatCertainFoods);
		clickElementUsingJavaScript(whenYouEatCertainFoods);
		waitForPageLoadJava();
	}
	
	public void clickGingivitis() throws Exception{
		scrollDownUsingElement(gingivitis);
		clickElementUsingJavaScript(gingivitis);
		waitForPageLoadJava();
	}
	
	public void clickSensodyneRapidReleif() throws Exception{
		scrollDownUsingElement(sensodyneRapidReleif);
		clickElementUsingJavaScript(sensodyneRapidReleif);
		waitForPageLoadJava();
	}
	
	public void clickSwitchToAToothbrush() throws Exception{
		scrollDownUsingElement(switchToAToothbrush);
		clickElementUsingJavaScript(switchToAToothbrush);
		waitForPageLoadJava();
	}
	
	public void clickEnamelErosion() throws Exception{
		scrollDownUsingElement(enamelErosion);
		clickElementUsingJavaScript(enamelErosion);
		waitForPageLoadJava();
	}
	
	public void clickVisitYourDentsitLink() throws Exception{
		scrollDownUsingElement(visitYourDentsitLink);
		clickElementUsingJavaScript(visitYourDentsitLink);
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
