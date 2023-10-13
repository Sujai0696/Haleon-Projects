package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class TumsAntacidproductNaturalPages extends BaseClass {
	
	public TumsAntacidproductNaturalPages() {
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
		
	@FindBy(xpath="//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"]//li[3]")
    private static WebElement tumsnatural;	
	
	@FindBy(xpath="//button[text()='Write a review ']")
    private static WebElement review;	
	
	@FindBy(xpath="//span[text()='My Review for Naturals']")
    private static WebElement reviewtxt;
	
	@FindBy(xpath="//button[@class=\"bv-mbox-close bv-focusable\"]")
    private static WebElement reviewclose;
	
	@FindBy(xpath="//div[@class=\"parametrizedhtml component section default-style first odd col-xs-12 reference-buy-now-button\"]//following-sibling::a")
    private static WebElement BuyNowbtn;
	
	@FindBy(xpath="//h2[text()='TUMS Naturals Tablets Black Cherry & Watermelon, 56 ct']")
    private static WebElement BuyNowtxt;
	
	@FindBy(xpath="//span[@class=\"ps-lightbox-close\"]")
    private static WebElement BuyNowclose;
	
	@FindBy(xpath="//a[text()='Get Coupon']")
    private static WebElement getcoupon;
	
	@FindBy(xpath="//ul[@class=\"tabs-nav-list clearfix\"]//li[1]")
    private static WebElement productdetail;
	
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
	
//	@FindBy(xpath="(//div[@data-id=\"CG9xFyq04d8\"])[1]//child::img")
//    private static WebElement youtubebtn;
//	
//	@FindBy(xpath="//div[@class=\"youtube-player content paragraphSystem universal\"]//child::iframe")
//    private static WebElement iframe;
//	
////	@FindBy(xpath="//div[@class=\"ytp-cued-thumbnail-overlay\"]")
////    private static WebElement thumbnailicon;
//	
//	@FindBy(xpath="//div[@class=\"html5-video-container\"]//child::video")
//    private static WebElement video;
//	
//	@FindBy(xpath="//button[@title=\"Play (k)\"]//parent::button")
//    private static WebElement playbtn;
//	
	
	@FindBy(xpath = "//div[@data-title='How Does TUMS Work']//following::img[@alt='How Does TUMS Work']")
	private static WebElement youtubePlay;

	@FindBy(xpath = "//iframe[@title='The Science Behind TUMS']")
	private static WebElement iframe;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']//preceding::div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement youtubePlayVideo;

	@FindBy(xpath = "//video[@class='video-stream html5-main-video']//ancestor::div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//video[@class='video-stream html5-main-video']//ancestor::div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;

	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	private static WebElement youtubePauseVideo;
	
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
                //implicitWait(10);
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
		public void clickontumsnatural() throws Throwable {
			clickElementUsingJavaScript(tumsnatural);
	}	
		public void clickonTumsnaturalReview() throws Throwable {
			//moveToElement(BuyNowbtn);
			clickElementUsingJavaScript(review);
			visibilityOf(reviewtxt);
			boolean elementIsDisplayed=elementIsDisplayed(reviewtxt);
			Assert.assertTrue(elementIsDisplayed);
			elementClick(reviewclose);
	}	
		public void clickonTumsnaturalBuynow() throws Throwable {
			//moveToElement(BuyNowbtn);
			clickElementUsingJavaScript(BuyNowbtn);
			visibilityOf(BuyNowtxt);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNowtxt);
			Assert.assertTrue(elementIsDisplayed);
			elementClick(BuyNowclose);
	}	
		public void clickongetcoupons() throws Throwable {
			clickElementUsingJavaScript(getcoupon);
	}	
		public void clickonproductdetail() throws Throwable {
			moveToElement(productdetail);
			clickElementUsingJavaScript(productdetail);
	}	
		public void clickonDirection() throws Throwable {
			//moveToElement(Direction);
			scrollDownUsingElement(BuyNowbtn);
			clickElementUsingJavaScript(Direction);
			visibilityOf(Direction_open);
			boolean elementIsDisplayed=elementIsDisplayed(Direction_open);
			Assert.assertTrue(elementIsDisplayed);
	}	
		public void clickonWarning() throws Throwable {
			//moveToElement(Direction);
			scrollDownUsingElement(BuyNowbtn);
			elementClick(warning);
			visibilityOf(warning_open);
			boolean elementIsDisplayed=elementIsDisplayed(warning_open);
			Assert.assertTrue(elementIsDisplayed);	   
	}	
		public void clickonVarities() throws Throwable {
			//moveToElement(Direction);
			scrollDownUsingElement(BuyNowbtn);
			elementClick(varieties);
			visibilityOf(varieties_open);
			boolean elementIsDisplayed=elementIsDisplayed(varieties_open);
			Assert.assertTrue(elementIsDisplayed); 
	}	
		public void clickonseeproducts() throws Throwable {
			moveToElement(seeproducts);
			clickElementUsingJavaScript(seeproducts);
	}	
//		public void clickonYoutubelink() throws Throwable {
//			
//			scrollDownUsingElement(youtubebtn);
//			moveToElement(youtubebtn);
//			clickElementUsingJavaScript(youtubebtn);
//			//visibilityOf(iframe);
//			Thread.sleep(1000);
//			switchToFrameUsingElement(iframe);
//			System.out.println("Frameis display");
//			actionClick(video);
//			//clickElementUsingJavaScript(video);
//			Thread.sleep(1000);
//			boolean elementIsDisplayed=elementIsDisplayed(video);
//			Assert.assertTrue(elementIsDisplayed);
//			clickElementUsingJavaScript(playbtn);
//			frameSwitchingToDefaultContent();
//	}	
		public void clickonYouTubeLink() throws Throwable {
			visibilityOf(youtubePlay);
			if(isElementPresent(youtubePlay)) {
				scrollDownUsingElement(youtubePlay);
				clickElementUsingJavaScript(youtubePlay);
				visibilityOf(iframe);
				switchToFrameUsingElement(iframe);
				elementToBeClickable(youtubePlayVideo);
				moveToElement(youtubePlayVideo);
				actionClick(youtubePlayVideo);
				Thread.sleep(1000);
				visibilityOf(playingMode);
				Assert.assertTrue(elementIsDisplayed(playingMode));
				System.out.println("YouTube video is playing successfully");
				moveToElement(youtubePauseVideo);
				actionClick(youtubePauseVideo);
				visibilityOf(pausedMode);
				Assert.assertTrue(elementIsDisplayed(pausedMode));
				System.out.println("YouTube video is paused successfully");
			}
			else {
				System.out.println("Video is  not verified");
				Assert.assertTrue(false);
			}
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
