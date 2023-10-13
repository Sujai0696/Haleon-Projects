package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneWhyTeethHurtBitingPage extends BaseClass{

	public SensodyneWhyTeethHurtBitingPage() {
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
	
	@FindBy(xpath = "//a[text()='Sensodyne website.']")
	private static WebElement sensodyneWebsiteLink;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be A Bad Thing?']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement relatedArticleFour;
	
	
	
	
	
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
	
	
	public void clickSensodyneWebsiteLink() throws Exception{
		scrollDownUsingElement(sensodyneWebsiteLink);
		clickElementUsingJavaScript(sensodyneWebsiteLink);
	}
	
	public void clickRelatedArticleOne() throws Exception{
		scrollDownUsingElement(relatedArticleOne);
		clickElementUsingJavaScript(relatedArticleOne);
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		scrollDownUsingElement(relatedArticleTwo);
		clickElementUsingJavaScript(relatedArticleTwo);
	}
	
	public void clickRelatedArticleThree() throws Exception{
		scrollDownUsingElement(relatedArticleThree);
		clickElementUsingJavaScript(relatedArticleThree);
	}
	
	public void clickRelatedArticleFour() throws Exception{
		scrollDownUsingElement(relatedArticleFour);
		clickElementUsingJavaScript(relatedArticleFour);
	}
	
	
	
	
	
	
	
	
}
