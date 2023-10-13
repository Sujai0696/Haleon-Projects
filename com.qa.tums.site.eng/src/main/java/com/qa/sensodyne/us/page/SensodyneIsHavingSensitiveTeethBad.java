package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneIsHavingSensitiveTeethBad extends BaseClass {
	public SensodyneIsHavingSensitiveTeethBad() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement BackToTheArticleList;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief']")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement FiveOralHealthTipsEveryoneShouldFollow;
	
	@FindBy(xpath = "//*[text()=\"Can You Brush Your Teeth Too Hard?\"]")
	private static WebElement CanYouBrushYourTeethTooHard;
	
	@FindBy(xpath = "//*[text()=\"Do Your Teeth Hurt When It's Cold Out?\"]")
	private static WebElement DoYourTeethHurtWhenItsColdOut;
	
	@FindBy(xpath = "//*[text()='What To Know About Sensitive Teeth']")
	private static WebElement WhatToKnowAboutSensitiveTeeth;
	
	
	
	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				elementClick(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() throws Exception {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				elementClick(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}
	public void clickBackToTheArticleList() throws Exception {
		moveToElement(BackToTheArticleList);
		clickElementUsingJavaScript(BackToTheArticleList);
	}
	
	public void clickSensodyneRapidRelief() throws Exception {
		moveToElement(SensodyneRapidRelief);
		clickElementUsingJavaScript(SensodyneRapidRelief);
	}
	
	public void clickFiveOralHealthTipsEveryoneShouldFollow() throws Exception {
		moveToElement(FiveOralHealthTipsEveryoneShouldFollow);
		clickElementUsingJavaScript(FiveOralHealthTipsEveryoneShouldFollow);
	}
	
	public void clickCanYouBrushYourTeethTooHard() throws Exception {
		moveToElement(CanYouBrushYourTeethTooHard);
		clickElementUsingJavaScript(CanYouBrushYourTeethTooHard);
	}
	
	public void clickDoYourTeethHurtWhenItsColdOut() throws Exception {
		moveToElement(DoYourTeethHurtWhenItsColdOut);
		clickElementUsingJavaScript(DoYourTeethHurtWhenItsColdOut);
	}
	
	public void clickWhatToKnowAboutSensitiveTeeth() throws Exception {
		moveToElement(WhatToKnowAboutSensitiveTeeth);
		clickElementUsingJavaScript(WhatToKnowAboutSensitiveTeeth);
	}
	
	

}
