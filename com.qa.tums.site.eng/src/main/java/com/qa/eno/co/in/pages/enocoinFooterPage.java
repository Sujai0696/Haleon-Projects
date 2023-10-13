package com.qa.eno.co.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class enocoinFooterPage extends BaseClass{

	public enocoinFooterPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='ABOUT ACIDITY']")
		private static WebElement AboutAcidity;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Acidity & Acid Reflux']")
		private static WebElement AcidityReflux;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Managing Acidity']")
		private static WebElement ManagingAcidity;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Other Digestive Conditions']")
		private static WebElement DigestiveConditions;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Digestive Wellness']")
		private static WebElement Digestivewellness;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='PRODUCTS']")
		private static WebElement Products;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='ENO Fruit Salt']")
		private static WebElement Fruitsalt;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='How Eno Works']")
		private static WebElement howEnoworks;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Our Story']")
		private static WebElement OurStory;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Latest Campaigns']")
		private static WebElement latestCampaigns;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='CONNECT WITH US']")
		private static WebElement connectwithus;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Contact Us']")
		private static WebElement contactUs;
	
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Frequently Asked Questions']")
		private static WebElement FAQ;
		
		@FindBy(xpath = "//div[@class='richText component section default-style first odd last']//child::a[text()='Where to Buy']")
		private static WebElement wheretoBuy;
		
		@FindBy(xpath = "//div[@class='richText component section footer-underline-left-br-com first odd col-md-8']//child::a[text()='Cookie Policy']")
		private static WebElement cookiepolicy;
		
		@FindBy(xpath = "//div[@class='richText component section footer-underline-left-br-com first odd col-md-8']//child::a[text()='Sitemap']")
		private static WebElement sitemap;
		
		
		//Methods//
		
		public void clickonaboutAcidity() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(AboutAcidity);
		clickElementUsingJavaScript(AboutAcidity);
		pageLoad();
		}
		public void clickonAcidityReflux() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(AcidityReflux);
			clickElementUsingJavaScript(AcidityReflux);
			pageLoad();
			}
		public void clickonManagingAcidity() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(ManagingAcidity);
			clickElementUsingJavaScript(ManagingAcidity);
			pageLoad();
			}
		public void clickonDigestiveConditions() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(DigestiveConditions);
			clickElementUsingJavaScript(DigestiveConditions);
			pageLoad();
			}
		public void clickonDigestiveWellness() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Digestivewellness);
			clickElementUsingJavaScript(Digestivewellness);
			pageLoad();
			}
		public void clickonProducts() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Products);
			clickElementUsingJavaScript(Products);
			pageLoad();
			}
		public void clickonEnoFruitsalts() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(Fruitsalt);
			clickElementUsingJavaScript(Fruitsalt);
			pageLoad();
			}
		public void clickonHowEnoWorks() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(howEnoworks);
			clickElementUsingJavaScript(howEnoworks);
			pageLoad();
			}
		public void clickonOurStory() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(OurStory);
			clickElementUsingJavaScript(OurStory);
			pageLoad();
			}
		public void clickonlatestCampaigns() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(latestCampaigns);
			clickElementUsingJavaScript(latestCampaigns);
			pageLoad();
			}
		public void clickonConnectwithUs() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(connectwithus);
			clickElementUsingJavaScript(connectwithus);
			pageLoad();
			}
		public void clickonContactUs() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(contactUs);
			clickElementUsingJavaScript(contactUs);
			pageLoad();
			}
		public void clickonFAQ() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(FAQ);
			clickElementUsingJavaScript(FAQ);
			pageLoad();
			}
		public void clickonWhereToBuy() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(wheretoBuy);
			clickElementUsingJavaScript(wheretoBuy);
			pageLoad();
			}
		public void clickonCookiePolicy() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(cookiepolicy);
			clickElementUsingJavaScript(cookiepolicy);
			pageLoad();
			}
		public void clickonSiteMap() throws Exception {
			waitForPageLoadJava();
			scrollDownUsingElement(sitemap);
			clickElementUsingJavaScript(sitemap);
			pageLoad();
			}
		
		
		
		
	
	
	
	

}
