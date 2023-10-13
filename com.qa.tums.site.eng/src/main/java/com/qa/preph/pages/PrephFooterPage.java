package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephFooterPage extends BaseClass{
	
	public PrephFooterPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/contact-us/']")
	private static WebElement contactus;		
	
	@FindBy(xpath = "//h1[text()='CONTACT US']")
	private static WebElement contactus_txt;		
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage list-footer list-center-nod-m p-m-b-5 p-m-t-4 first odd component col-xs-12']//a[text()='Sitemap']")
	private static WebElement sitemap;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage p-d-b-3 p-d-t-3 p-m-b-1 p-m-t-2 text-center-d text-center-m head-alt first odd component']//h1")
	private static WebElement sitemap_txt;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage list-footer list-center-nod-m p-m-b-5 p-m-t-4 first odd component col-xs-12']//a[@href='/fsa-hsa-eligibility/']")
	private static WebElement fsahsa;
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement fsahsa_txt;
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
		public void clickonContactus() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(contactus);
			moveToElement(contactus);
			clickElementUsingJavaScript(contactus);
			visibilityOf(contactus_txt);
			boolean elementIsDisplayed=elementIsDisplayed(contactus_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(contactus_txt));
			pageLoad();
		}	
	
		public void clickonSitemap() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(sitemap);
			moveToElement(sitemap);
			clickElementUsingJavaScript(sitemap);
			visibilityOf(sitemap_txt);
			boolean elementIsDisplayed=elementIsDisplayed(sitemap_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(sitemap_txt));
			pageLoad();
		}	
		public void clickonFsaHsa() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(fsahsa);
			moveToElement(fsahsa);
			clickElementUsingJavaScript(fsahsa);
			visibilityOf(fsahsa_txt);
			boolean elementIsDisplayed=elementIsDisplayed(fsahsa_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fsahsa_txt));
			pageLoad();
		}	
	
	
	
	
	
	
	
	
	
	

}
