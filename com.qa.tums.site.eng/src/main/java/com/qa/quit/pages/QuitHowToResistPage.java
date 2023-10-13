package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class QuitHowToResistPage extends BaseClass{
	
	public QuitHowToResistPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='social situations' and @href='/quit-smoking-tips/social-smoking.html']")
	private static WebElement ghyperLinkOne;
	

}
