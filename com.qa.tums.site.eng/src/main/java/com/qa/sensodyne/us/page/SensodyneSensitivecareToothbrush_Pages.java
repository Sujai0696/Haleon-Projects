package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSensitivecareToothbrush_Pages extends BaseClass{
	
	public SensodyneSensitivecareToothbrush_Pages(){
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
	private static WebElement homeBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last \"]")
	private static WebElement ourproductsBreadCrumbs;		
		
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNow;		
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;		
	
	@FindBy(xpath = "//a[text()='click here']")
	private static WebElement clickhere;		
	
	@FindBy(xpath = "//div[@class=\"title-content\"]")
	private static WebElement youtubebtn;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframeYoutube;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement youtubePauseIcon;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Rapid Relief']")
	private static WebElement Popularproducts1;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement Popularproducts2;
	
	@FindBy(xpath = "//a[text()='Repair and Protect']")
	private static WebElement Popularproducts3;
	
	@FindBy(xpath = "//a[text()='Complete Protection']")
	private static WebElement Popularproducts4;
	
	@FindBy(xpath = "//span[text()='Fresh Mint']")
	private static WebElement Popularproducts5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
	private static WebElement findstore;
	
	
	//Methods//
	
			public void clickCookieBtn() throws Exception {
		        elementToBeClickable(cookieBtn);
		        try {
		            if (cookieBtn.isDisplayed()) {
		                elementClick(cookieBtn);
		            }
		            visibilityOf(cookieClose);
		            Assert.assertTrue(elementIsDisplayed(cookieClose));
		            elementClick(cookieClose);
		        } catch (Exception e) {
		        }
		    }
		    public void clickGigyaForm() throws Exception {
		        elementToBeClickable(gigyaForm);
		        try {
		            if (gigyaForm.isDisplayed()) {
		                elementClick(gigyaForm);
		            }
		            visibilityOf(gigyaClose);
		            implicitWait();
		            Assert.assertTrue(elementIsDisplayed(gigyaClose));
		            elementClick(gigyaClose);
		        } catch (Exception e) {
		       }
		    }
		    public void clickOnHomeBreadcrumbs() throws Exception {
		    	moveToElement(homeBreadCrumbs);
				clickElementUsingJavaScript(homeBreadCrumbs);
			}
		    public void clickOnourproductsBreadcrumbs() throws Exception {
		    	moveToElement(ourproductsBreadCrumbs);
				clickElementUsingJavaScript(ourproductsBreadCrumbs);
			}	
		    public void clickOnBuyNow() throws Exception {
		    	moveToElement(BuyNow);
				clickElementUsingJavaScript(BuyNow);
				visibilityOf(BuyNowClose);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(BuyNowClose);
			}	
		    public void clickOnclickhere() throws Exception {
		    	moveToElement(clickhere);
				clickElementUsingJavaScript(clickhere);
			}	
		    public void clickOnSensitiveToothbrushYoutubeLink() throws Exception{
				scrollDownUsingElement(youtubebtn);
				clickElementUsingJavaScript(youtubebtn);
				visibilityOf(iframeYoutube);
				switchToFrameUsingElement(iframeYoutube);
				moveToElement(btnYoutubeIcon);
				actionClick(btnYoutubeIcon);
				Thread.sleep(5000);
				//Assert.assertTrue(elementIsDisplayed(youtubePauseIcon));
				clickElementUsingJavaScript(btnYoutubeIcon);
				System.out.println("Video is playing Successfully");
				frameSwitchingToDefaultContent();
		    }
		    public void clickOnPopularProducts1() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Popularproducts1);
				clickElementUsingJavaScript(Popularproducts1);
			}	
		    public void clickOnPopularProducts2() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Popularproducts2);
				clickElementUsingJavaScript(Popularproducts2);
			}	
		    public void clickOnPopularProducts3() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Popularproducts3);
				clickElementUsingJavaScript(Popularproducts3);
			}	
		    public void clickOnPopularProducts4() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Popularproducts4);
				clickElementUsingJavaScript(Popularproducts4);
			}	
		    public void clickOnPopularProducts5() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(Popularproducts5);
				clickElementUsingJavaScript(Popularproducts5);
			}	
		    public void clickOnGetCoupons() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(getcoupons);
				clickElementUsingJavaScript(getcoupons);
			}	
		    public void clickOnfindstore() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(findstore);
				clickElementUsingJavaScript(findstore);
			}	
	
	
	
	
	
	
	
	
	
	

}
