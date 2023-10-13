package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumschewybitescoolingsensationPages extends BaseClass{
	
	public TumschewybitescoolingsensationPages() {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[1]")
    private static WebElement homebreadcrumbs;
	
	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[2]")
    private static WebElement productselector;		
		
	@FindBy(xpath="//li[@class=\"breadcrumb-list-item odd last is-current \"]")
    private static WebElement chewybitescoolingsensationbreadcrumbs;		
	
	@FindBy(xpath="//button[text()='Write a review ']")
    private static WebElement writereview;		
	
	@FindBy(xpath="//span[text()='My Review for Chewy Bites® Cooling Sensation']")
    private static WebElement writereviewTxt;		
	
	@FindBy(xpath="(//button[@class=\"bv-mbox-close bv-focusable\"]//parent::span)[1]")
    private static WebElement writereviewClose;	
	
	@FindBy(xpath="//div[@class=\"parametrizedhtml component section default-style first odd col-xs-12 reference-buy-now-button\"]//child::a")
    private static WebElement BuyNowBtn;
	
	@FindBy(xpath="//h2[text()='TUMS  Chewy Bites Cooling Sensation Fruit Fusion, 28 ct']//parent::div")
    private static WebElement BuyNowTxt;
	
	@FindBy(xpath="//span[@class=\"ps-lightbox-close\"]//parent::span")
    private static WebElement BuyNowClose;
	
	@FindBy(xpath="//a[text()='Get Coupon']")
    private static WebElement getcoupon;
	
	@FindBy(xpath="//img[@title=\"HSA / FSA Eligible Item*\"]")
    private static WebElement Header1;
	
	@FindBy(xpath="//span[text()='Product Details']")
    private static WebElement productdetail;
	
	@FindBy(xpath="//li[@class=\"tabs-nav-item odd first is-active\"]")
    private static WebElement productdetail_open;
	
	@FindBy(xpath="//li[@class=\"tabs-nav-item even is-active\"]")
    private static WebElement Direction_open;
	
	@FindBy(xpath="//span[text()='Directions']")
    private static WebElement Direction;
	
	@FindBy(xpath="//li[@class=\"tabs-nav-item odd is-active\"]")
    private static WebElement warning_open;
	
	@FindBy(xpath="//span[text()='Warnings']")
    private static WebElement warning;
	
	@FindBy(xpath="//li[@class=\"tabs-nav-item even last is-active\"]")
    private static WebElement varieties_open;
	
	@FindBy(xpath="//span[text()='Varieties']")
    private static WebElement varieties;
	
	@FindBy(xpath="//a[text()='See products']")
    private static WebElement seeproducts;
	
	@FindBy(xpath="(//div[@data-id=\"CG9xFyq04d8\"])[1]//child::img")
    private static WebElement youtubebtn;
	
	@FindBy(xpath="//div[@class=\"youtube-player content paragraphSystem universal\"]//child::iframe")
    private static WebElement iframe;
	
//	@FindBy(xpath="//div[@class=\"ytp-cued-thumbnail-overlay\"]")
//    private static WebElement thumbnailicon;
	
	@FindBy(xpath="//div[@class=\"html5-video-container\"]//child::video")
    private static WebElement video;
	
	@FindBy(xpath="//button[@title=\"Play (k)\"]//parent::button")
    private static WebElement playbtn;
	
	@FindBy(xpath="//a[text()='Read More']")
    private static WebElement readmore;
	
	@FindBy(xpath="//a[text()='Compare Antacid Providers']")
    private static WebElement compareAntacid;
	
	@FindBy(xpath="//a[text()='Try TUMS Chewy Bites Cooling Sensation']")
    private static WebElement coolingsensation;
	
	@FindBy(xpath="//a[text()='Heartburn 101']")
    private static WebElement heartburn101;
	
	
	
	
	//methods
	
			public void clickCookieBtn() throws Exception {
		        if (isElementPresent(cookieBtn)) {
		            elementToBeClickable(cookieBtn);
		            try {
		                if (cookieBtn.isDisplayed()) {
		                    clickElementUsingJavaScript(cookieBtn);
		                }
		                implicitWait();
		                actionClick(cookieClose);
		                Assert.assertTrue(elementIsDisplayed(cookieClose));
		            } catch (Exception e) {
		            }
		        }else {
		            System.out.println("Dismiss is not presented");
		        }
			}
				public void clickonhomebreadcrumbs() throws Throwable {
					clickElementUsingJavaScript(homebreadcrumbs);
			}
				
				public void clickonproductselector() throws Throwable {
					clickElementUsingJavaScript(productselector);
			}	
				public void clickonchewybitecoolingsensationbreadcrumbs() throws Throwable {
					clickElementUsingJavaScript(chewybitescoolingsensationbreadcrumbs);
			}	
				public void clickonReviewBtn() throws Throwable {
					clickElementUsingJavaScript(writereview);
					visibilityOf(writereviewTxt);
					boolean elementIsDisplayed=elementIsDisplayed(writereviewTxt);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(writereviewClose);
			}	
				public void clickonBuyNowBtn() throws Throwable {
					clickElementUsingJavaScript(BuyNowBtn);
					visibilityOf(BuyNowTxt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(BuyNowClose);
			}	
				public void clickongetcoupon() throws Throwable {
					clickElementUsingJavaScript(getcoupon);
			}	
				public void clickonproductdetail() throws Throwable {
					moveToElement(productdetail);
					clickElementUsingJavaScript(productdetail);
					visibilityOf(productdetail_open);
					boolean elementIsDisplayed=elementIsDisplayed(productdetail_open);
					Assert.assertTrue(elementIsDisplayed);
					
			}	
				public void clickonDirection() throws Throwable {
					//moveToElement(Direction);
					scrollDownUsingElement(Header1);
					clickElementUsingJavaScript(Direction);
					visibilityOf(Direction_open);
					boolean elementIsDisplayed=elementIsDisplayed(Direction_open);
					Assert.assertTrue(elementIsDisplayed);
			}	
				public void clickonWarning() throws Throwable {
					//moveToElement(Direction);
					scrollDownUsingElement(Header1);
					elementClick(warning);
					visibilityOf(warning_open);
					boolean elementIsDisplayed=elementIsDisplayed(warning_open);
					Assert.assertTrue(elementIsDisplayed);	   
			}	
				public void clickonVarities() throws Throwable {
					//moveToElement(Direction);
					scrollDownUsingElement(Header1);
					elementClick(varieties);
					visibilityOf(varieties_open);
					boolean elementIsDisplayed=elementIsDisplayed(varieties_open);
					Assert.assertTrue(elementIsDisplayed); 
			}	
				public void clickonseeproducts() throws Throwable {
					moveToElement(seeproducts);
					clickElementUsingJavaScript(seeproducts);
			}	
				public void clickonYoutubelink() throws Throwable {
					
					scrollDownUsingElement(youtubebtn);
					moveToElement(youtubebtn);
					clickElementUsingJavaScript(youtubebtn);
					//visibilityOf(iframe);
					Thread.sleep(1000);
					switchToFrameUsingElement(iframe);
					System.out.println("Frameis display");
					actionClick(video);
					//clickElementUsingJavaScript(video);
					Thread.sleep(1000);
					boolean elementIsDisplayed=elementIsDisplayed(video);
					Assert.assertTrue(elementIsDisplayed);
					clickElementUsingJavaScript(playbtn);
					frameSwitchingToDefaultContent();
			}	
				public void clickonreadmore() throws Throwable {
					moveToElement(readmore);
					clickElementUsingJavaScript(readmore);
			}	
				public void clickoncompareAnatacid() throws Throwable {
					moveToElement(compareAntacid);
					clickElementUsingJavaScript(compareAntacid);
			}	
				public void clickonCoolingsensation() throws Throwable {
					moveToElement(coolingsensation);
					clickElementUsingJavaScript(coolingsensation);
			}	
				public void clickonHeartburn101() throws Throwable {
					moveToElement(heartburn101);
					clickElementUsingJavaScript(heartburn101);
			}	
		
		
		
	
	
	
	
	
	
	
	
	
	
	

}
