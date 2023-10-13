package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneWhatIsSlsToothpastePage extends BaseClass{
	
	public SensodyneWhatIsSlsToothpastePage() {
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
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening toothpaste']")
	private static WebElement sensodyneExtra;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpastes']")
	private static WebElement sensodyneToothpaste;
	
	@FindBy(xpath = "//a[text()='manage sensitive teeth']")
	private static WebElement manageSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpastes without SLS']")
	private static WebElement sensodyneToothpasteWithoutSls;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be A Bad Thing?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement relatedArticleFour;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']")
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
	
	
	public void clickSensodyneExtra() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneExtra);
		clickElementUsingJavaScript(sensodyneExtra);
		pageLoad();
	}
	
	public void clickSensodyneToothpaste() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneToothpaste);
		clickElementUsingJavaScript(sensodyneToothpaste);
		pageLoad();
	}
	
	public void clickManageSensitiveTeeth() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(manageSensitiveTeeth);
		clickElementUsingJavaScript(manageSensitiveTeeth);
		pageLoad();
	}
	
	public void clickSensodyneToothpasteWithoutSls() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyneToothpasteWithoutSls);
		clickElementUsingJavaScript(sensodyneToothpasteWithoutSls);
		pageLoad();
	}
	
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
		pageLoad();
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
		waitForPageLoadJava();
		pageLoad();
	}
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
		pageLoad();
	}
	
	public void clickRelatedArticleFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
		pageLoad();
	}
	
	public void clickBreadCrumb() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumb);
		clickElementUsingJavaScript(breadCrumb);
		pageLoad();
	}

}
