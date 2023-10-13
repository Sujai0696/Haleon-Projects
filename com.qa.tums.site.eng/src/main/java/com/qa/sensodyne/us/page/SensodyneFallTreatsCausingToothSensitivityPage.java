package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneFallTreatsCausingToothSensitivityPage extends BaseClass{

	
	public SensodyneFallTreatsCausingToothSensitivityPage() {
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
	
	@FindBy(xpath = "//a[text()='take a moment and assess']")
	private static WebElement takeAMomentAndAssess;
	
	@FindBy(xpath = "//a[text()='really sweet']")
	private static WebElement reallySweet;
	
	@FindBy(xpath = "//a[text()='hot, cold, sweet, or acidic foods trigger the nerves']")
	private static WebElement hotColdLink;
	
	@FindBy(xpath = "//a[text()='gum disease']")
	private static WebElement gumDisease;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement sensodyneRapidReleif;
	
	@FindBy(xpath = "//a[text()='Ways holiday stress affects your body']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Delicious Fall Soup Recipes']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()=\"A Dentist’s Tips on Flossing\"]")
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
	
	public void clickTakeAMomentAndAssess() throws Exception{
		scrollDownUsingElement(takeAMomentAndAssess);
		clickElementUsingJavaScript(takeAMomentAndAssess);
		waitForPageLoadJava();
	}
	
	public void clickReallySweet() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(reallySweet);
		moveToElement(reallySweet);
		actionClick(reallySweet);
		pageLoad();
		
	}
	
	public void clickHotColdLink() throws Exception{
		scrollDownUsingElement(hotColdLink);
		clickElementUsingJavaScript(hotColdLink);
		waitForPageLoadJava();
	}
	
	public void clickGumDisease() throws Exception{
		scrollDownUsingElement(gumDisease);
		clickElementUsingJavaScript(gumDisease);
		waitForPageLoadJava();
	}
	
	public void clickSensodyneRapidReleif() throws Exception{
		scrollDownUsingElement(sensodyneRapidReleif);
		clickElementUsingJavaScript(sensodyneRapidReleif);
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

