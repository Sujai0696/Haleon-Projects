package com.qa.theraflu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class TherafluTreatingColdFluPage extends BaseClass{
	
	public TherafluTreatingColdFluPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home' and @href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Health Hub']")
	private static WebElement breadcrumbTwo;
	
	
	@FindBy(xpath = "//a[@id='block-1' and @class='btn-alt-5 active' and text()='SYMPTOMS']")
	private static WebElement tabSecActiveOne;
	
	@FindBy(xpath = "//a[@id='block-1' and @class='btn-alt-5' and text()='SYMPTOMS']")
	private static WebElement tabSecOne;
	
	@FindBy(xpath = "//a[@id='block-2' and @class='btn-alt-5 ' and text()='COLDS']")
	private static WebElement tabSecTwo;
	
	@FindBy(xpath = "//a[@id='block-2' and @class='btn-alt-5 active' and text()='COLDS']")
	private static WebElement tabSecActiveTwo;
	
	@FindBy(xpath = "//a[@id='block-3' and @class='btn-alt-5' and text()='FLU']")
	private static WebElement tabSecThree;
	
	@FindBy(xpath = "//a[@id='block-3' and @class='btn-alt-5 active' and text()='FLU']")
	private static WebElement tabSecActiveThree;
	
	@FindBy(xpath = "//a[@id='block-4' and @class='btn-alt-5' and text()='PREVENTION TIPS']")
	private static WebElement tabSecFour;
	
	@FindBy(xpath = "//a[@id='block-4' and @class='btn-alt-5 active' and text()='PREVENTION TIPS']")
	private static WebElement tabSecActiveFour;
	
	
	
	
	
	
	
	

}
