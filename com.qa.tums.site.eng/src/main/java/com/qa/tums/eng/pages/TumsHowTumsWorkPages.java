package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsHowTumsWorkPages extends BaseClass {
	public TumsHowTumsWorkPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
	
	@FindBy(xpath="//a[contains(text(),'Heartburn 101 ')]")
    private static WebElement heartburn;
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
    private static WebElement cookiesDismissButton;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/how-tums-work/\"])[2]")
    private static WebElement howtumswork;
	
	@FindBy(xpath = "//nav[@aria-label=\"Breadcrumb\"]//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement Bread_HomeIcon;

	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item even ']")
    private static WebElement Bread_Heartburn101;
	
	@FindBy(xpath = "(//a[@href=\"/about-heartburn/causes/foods-that-cause-heartburn/\"])[3]")
    private static WebElement spicyorfattyacids;
	
//	@FindBy(xpath = "(//div[@data-id=\"CG9xFyq04d8\"])[1]//child::img")
//    private static WebElement Youtubebtn;
//	
//	@FindBy(xpath = "(//div[@class=\"ytp-cued-thumbnail-overlay-image\"])[1]")
//    private static WebElement Iconyoutube;
//	
//	@FindBy(xpath = "//button[@title=\"Pause (k)\"]//parent::button")
//    private static WebElement youtubeplayer;
//	
//	@FindBy(xpath = "//div[@class=\"html5-video-container\"]//child::video")
//    private static WebElement video;
//	
//	@FindBy(xpath = "//div[@class=\"youtube-player content paragraphSystem universal\"]//child::iframe")
//    private static WebElement iframe;
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
	
	@FindBy(xpath = "//a[text()='TUMS antacids']")
    private static WebElement antacids;
	
	@FindBy(xpath = "//a[text()='See products']")
    private static WebElement seeproducts;
	
	
	
	
	
	
	
	
	
	//methods
	
	public void clickCookieBtn() throws Exception {
		//visibilityOf(cookieBtn);
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
		public void clickonheartburns() throws Throwable {
			moveToElement(heartburn);
	}
		public void clickonhowtumsswork() throws Throwable {
			scrollDownUsingElement(heartburn);
			moveToElement(howtumswork);
			clickElementUsingJavaScript(howtumswork);
		}
		public void clickOnHomeIcon() throws Throwable {
			//scrollDownUsingElement(heartburn);
			moveToElement(Bread_HomeIcon);
			elementClick(Bread_HomeIcon);
			//System.out.println("print on home icon");
		}
		
		public void clickOnHeartBurn101() throws Throwable {
			//scrollDownUsingElement(heartburn);
			moveToElement(Bread_Heartburn101);
			elementClick(Bread_Heartburn101);
		}
		public void clickOnspicyorfattyacids() throws Throwable {
			//scrollDownUsingElement(heartburn);
			moveToElement(spicyorfattyacids);
			clickElementUsingJavaScript(spicyorfattyacids);
		}
//		public void clickOnYoutubeLink() throws Throwable {
//			//scrollDownUsingElement(Youtubebtn);
//			moveToElement(Youtubebtn);
//			clickElementUsingJavaScript(Youtubebtn);
//			Thread.sleep(2000);
//			//actionClick(video);
//			switchToFrameUsingElement(iframe);
//			System.out.println("frames visible");
//			actionClick(video);
//			clickElementUsingJavaScript(video);
//			Thread.sleep(2000);
//			Assert.assertTrue(elementIsDisplayed(video));
//			clickElementUsingJavaScript(youtubeplayer);
//			System.out.println("Video is playing Successfully");
//			frameSwitchingToDefaultContent();
//			
//			
//		}
		
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
		public void clickOnantiacids() throws Throwable {
			//scrollDownUsingElement(heartburn);
			moveToElement(antacids);
			clickElementUsingJavaScript(antacids);
		}
		public void clickOnseeproducts() throws Throwable {
			//scrollDownUsingElement(heartburn);
			moveToElement(seeproducts);
			clickElementUsingJavaScript(seeproducts);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
