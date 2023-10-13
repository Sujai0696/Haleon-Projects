package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneSensitivityToHotPage extends BaseClass{
	
	public SensodyneSensitivityToHotPage() {
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
	
	@FindBy(xpath = "//a[text()='enamel wearing away over time']")
	private static WebElement enamelWearing;
	
	@FindBy(xpath = "//a[text()='contribute to enamel erosion']")
	private static WebElement enamelErosion;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement sensodyne;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Tips for Tooth Sensitivity to Cold']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement relatedArticleFour;
	
	@FindBy(xpath = "//a[text()='Tips for Tooth Sensitivity to Hot']")
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
	
	
	public void clickEnamelWearing() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(enamelWearing);
		clickElementUsingJavaScript(enamelWearing);
		pageLoad();
		
	}
	
	public void clickEnamelErosion() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(enamelErosion);
		clickElementUsingJavaScript(enamelErosion);
		pageLoad();
	}
	
	public void clickSensodyne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(sensodyne);
		clickElementUsingJavaScript(sensodyne);
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
		clickElementUsingJavaScript(breadCrumb);
		pageLoad();
	}

}
