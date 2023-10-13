package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class AbrevaOLDMoneyManagementTipsPage extends BaseClass{
	
	public AbrevaOLDMoneyManagementTipsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//span[text()='CREATE A BUDGET']//ancestor::li[@class='tabs-nav-item odd first']")
    private static WebElement tabSectionOne;
    
    @FindBy(xpath = "//span[text()='CREATE A BUDGET']//ancestor::li[@class='tabs-nav-item odd first is-active']")
    private static WebElement tabSectionOneActive;
    
    @FindBy(xpath = "//span[text()='FOLLOW THE 50\\30\\20 RULE']//ancestor::li[@class='tabs-nav-item even']")
    private static WebElement tabSectionTwo;
    
    @FindBy(xpath = "//span[text()='FOLLOW THE 50\\30\\20 RULE']//ancestor::li[@class='tabs-nav-item even is-active']")
    private static WebElement tabSectionTwoActive;
    
   
	
	

}
