package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHFsaHsaEligibilityPage extends BaseClass{
	
	public PrepHFsaHsaEligibilityPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		

	@FindBy(xpath = "//div[@class='breadcrumbs component section max-content-width first odd last col-xs-12']//a[text()='FSA & HSA Eligibility']")
	private static WebElement fsa_hsaBreadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement fsa_hsa_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//span[text()='Can I Use My Flexible Spending Account (FSA) or Health Savings Account (HSA) to Purchase Preparation H Products?']")
	private static WebElement flexibleaccountsaving;	
	
	@FindBy(xpath = "//a[@href='#accordion-content-211167555-0']")
	private static WebElement flexibleaccountsaving_Active;
	
	@FindBy(xpath = "//span[text()='Using My FSA to Purchase Preparation H Products']")
	private static WebElement prepartionproduct;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
	private static WebElement prepartionproduct_Active;
	
	@FindBy(xpath = "//span[text()='Using My HSA to Purchase Preparation H Products']")
	private static WebElement prepartionHSAproduct;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
	private static WebElement prepartionHSAproduct_Active;
	
	@FindBy(xpath = "//span[text()='Questions about Preparation H Products? Learn More in Our FAQ Center.']")
	private static WebElement moreFAQCenter;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
	private static WebElement moreFAQCenter_Active;
	
	@FindBy(xpath = "//span[text()='FSA and HSA Frequently Asked Questions']")
	private static WebElement fsahsafrequentlyasked;
	
	
	@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
	private static WebElement fsahsafrequentlyasked_Active;
	
	@FindBy(xpath = "//a[text()='products']")
	private static WebElement products;
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointments;
	
	@FindBy(xpath = "//a[text()='Suppositories']")
	private static WebElement suppostories;
	
	@FindBy(xpath = "//a[text()='Soothing Relief Cleansing & Cooling Wipes']")
	private static WebElement soothingreliefcleansing;
	
	@FindBy(xpath = "//a[text()='FAQ page']")
	private static WebElement faqpage;
	
	
	
	
	
	//Methods//
	
			public void clickonCookieBtn() throws Exception {
				waitForPageLoadJava();
				if(isElementPresent(cookieBtn)) {
					elementToBeClickable(cookieBtn);
					try {
						if(cookieBtn.isDisplayed()) {
							clickElementUsingJavaScript(cookieBtn);
						}
						implicitWait();
						visibilityOf(cookieClose);
						Assert.assertTrue(elementIsDisplayed(cookieClose));
					}
					catch (Exception e) {
						
					}
				}else {
					System.out.println("Dismiss is not presented");
					throw new Exception("Unable to click on cookie Pop-up");
				}
				}
			
			
				public void clickonHomeBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(HomeBreadcrumbs);
					if (isElementPresent(HomeBreadcrumbs)) {
						clickElementUsingJavaScript(HomeBreadcrumbs);
						pageLoad();
					} else {
						throw new Exception("HomeBreadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonFsaHsaEligibility_Breadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(fsa_hsaBreadcrumbs);
					if (isElementPresent(fsa_hsaBreadcrumbs)) {
						visibilityOf(fsa_hsa_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(fsa_hsa_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(fsa_hsa_txt_Breadcrumbs));
						System.out.println(getElementText(fsa_hsa_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("fsa_hsa_txt_Breadcrumbs are not Present on Page");
					}
					
				}	
				public void clickonflexiblesavingaccounts() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(flexibleaccountsaving);
					if (isElementPresent(flexibleaccountsaving)) {
						clickElementUsingJavaScript(flexibleaccountsaving);
						visibilityOf(flexibleaccountsaving_Active);
						boolean elementIsDisplayed=elementIsDisplayed(flexibleaccountsaving_Active);
						Assert.assertTrue(elementIsDisplayed(flexibleaccountsaving_Active));
						System.out.println(getElementText(flexibleaccountsaving_Active));
						System.out.println(getElementText(flexibleaccountsaving));
						clickElementUsingJavaScript(flexibleaccountsaving);
						pageLoad();
					} else {
						throw new Exception("flexibleaccountsaving are not Present on Page");
					}
					
				}	
				public void clickonPrepartionProducts() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(prepartionproduct);
					if (isElementPresent(prepartionproduct)) {
						clickElementUsingJavaScript(prepartionproduct);
						visibilityOf(prepartionproduct_Active);
						boolean elementIsDisplayed=elementIsDisplayed(prepartionproduct_Active);
						Assert.assertTrue(elementIsDisplayed(prepartionproduct_Active));
						System.out.println(getElementText(prepartionproduct));
						clickElementUsingJavaScript(products);
						pageLoad();
					} else {
						throw new Exception("prepartionproduct are not Present on Page");
					}
					
				}	
				public void clickonPrepartionHSAProducts() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(prepartionHSAproduct);
					if (isElementPresent(prepartionHSAproduct)) {
						clickElementUsingJavaScript(prepartionHSAproduct);
						visibilityOf(prepartionHSAproduct_Active);
						boolean elementIsDisplayed=elementIsDisplayed(prepartionHSAproduct_Active);
						Assert.assertTrue(elementIsDisplayed(prepartionHSAproduct_Active));
						System.out.println(getElementText(prepartionHSAproduct));
						clickElementUsingJavaScript(ointments);
						implicitWait();
//						moveToElement(suppostories);
//						clickElementUsingJavaScript(suppostories);
//						implicitWait();
//						moveToElement(soothingreliefcleansing);
//						clickElementUsingJavaScript(soothingreliefcleansing);
						pageLoad();
					} else {
						throw new Exception("prepartionHSAproduct are not Present on Page");
					}
					
				}	
				public void clickonmoreFAQCenter() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(moreFAQCenter);
					if (isElementPresent(moreFAQCenter)) {
						clickElementUsingJavaScript(moreFAQCenter);
						visibilityOf(moreFAQCenter_Active);
						boolean elementIsDisplayed=elementIsDisplayed(moreFAQCenter_Active);
						Assert.assertTrue(elementIsDisplayed(moreFAQCenter_Active));
						System.out.println(getElementText(moreFAQCenter));
						clickElementUsingJavaScript(faqpage);
						pageLoad();
					} else {
						throw new Exception("moreFAQCenter are not Present on Page");
					}
					
				}	
				public void clickonFrequentlyaskedFAQ() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(fsahsafrequentlyasked);
					if (isElementPresent(fsahsafrequentlyasked)) {
						clickElementUsingJavaScript(fsahsafrequentlyasked);
						visibilityOf(fsahsafrequentlyasked_Active);
						boolean elementIsDisplayed=elementIsDisplayed(fsahsafrequentlyasked_Active);
						Assert.assertTrue(elementIsDisplayed(fsahsafrequentlyasked_Active));
						System.out.println(getElementText(fsahsafrequentlyasked));
						clickElementUsingJavaScript(fsahsafrequentlyasked);
						pageLoad();
					} else {
						throw new Exception("fsahsafrequentlyasked are not Present on Page");
					}
					
				}	
	
	
	
	
	

}
