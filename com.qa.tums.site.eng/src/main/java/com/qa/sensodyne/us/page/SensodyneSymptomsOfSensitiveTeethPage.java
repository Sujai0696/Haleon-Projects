package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneSymptomsOfSensitiveTeethPage extends BaseClass{
	
	public SensodyneSymptomsOfSensitiveTeethPage() {
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
	
	@FindBy(xpath = "//a[text()='specific areas']")
	private static WebElement whyDoMyTeethHurtLink;
	
	@FindBy(xpath = "//a[text()='at-home whitening remedies']")
	private static WebElement teethWhiteningLink;
	
	@FindBy(xpath = "//a[text()='Learning the right techniques']")
	private static WebElement brushingAndFlossingLink;
	
	@FindBy(xpath = "//a[text()='tooth sensitivity after a filling']")
	private static WebElement dentalProcedures;
	
	@FindBy(xpath = "//a[text()='tooth pain caused by a cavity']")
	private static WebElement cavitiesAndToothDecay;
	
	@FindBy(xpath = "//img[contains(@src,'content/dam/cf-consumer-healthcare/sensodyne-v2/en_US/Articles/popsugar-articles/symptoms-of-sensitive-teeth/quiz-image.png?auto=format')]")
	private static WebElement takeQuiz;
	
	@FindBy(xpath = "//a[normalize-space()=\"Do Your Teeth Hurt When It's Cold Out?\"]")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='What I Decided to Do About My Tooth Sensitivity']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='What To Do About Tooth Sensitivity']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='What To Do If Teeth Hurt Post-Filling']")
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
	
	public void clickWhyDoMyTeethHurtLink() throws Exception{
		scrollDownUsingElement(whyDoMyTeethHurtLink);
		clickElementUsingJavaScript(whyDoMyTeethHurtLink);
		waitForPageLoadJava();
	}
	
	public void clickTeethWhiteningLink() throws Exception{
		scrollDownUsingElement(teethWhiteningLink);
		clickElementUsingJavaScript(teethWhiteningLink);
		waitForPageLoadJava();
	}
	
	public void clickBrushingAndFlossingLink() throws Exception{
		scrollDownUsingElement(brushingAndFlossingLink);
		clickElementUsingJavaScript(brushingAndFlossingLink);
		waitForPageLoadJava();
	}
	
	public void clickDentalProcedures() throws Exception{
		scrollDownUsingElement(dentalProcedures);
		clickElementUsingJavaScript(dentalProcedures);
		waitForPageLoadJava();
	}
	
	public void clickCavitiesAndToothDecay() throws Exception{
		scrollDownUsingElement(cavitiesAndToothDecay);
		clickElementUsingJavaScript(cavitiesAndToothDecay);
		waitForPageLoadJava();
	}
	
	public void clickTakeQuiz() throws Exception{
		scrollDownUsingElement(cavitiesAndToothDecay);
		clickElementUsingJavaScript(takeQuiz);
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
