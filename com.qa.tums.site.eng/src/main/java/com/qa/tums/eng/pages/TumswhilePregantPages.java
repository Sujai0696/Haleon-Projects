package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumswhilePregantPages extends BaseClass{
	
	
	public TumswhilePregantPages() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

	
	@FindBy(xpath="(//ol[@class=\"breadcrumbs-list breadcrumbs-without-separator\"])[2]//li[2]")
    private static WebElement HeartBurn101breadcrumbs;
	
	@FindBy(xpath="(//li[@class=\"breadcrumb-list-item odd last is-current \"])[2]")
    private static WebElement tumspregancy;	
	
	@FindBy(xpath="//img[@src=\"/content/dam/cf-consumer-healthcare/bp-tums/en_US/Articles/tums-and-pregnancy-video-thumb.jpg\"]//parent::div")
    private static WebElement youtubeplay;	
	
	@FindBy(xpath="(//div[@class=\"box component section default-style first odd last col-xs-12\"])[1]//child::iframe")
    private static WebElement iframe;
	
	@FindBy(xpath="//div[@class=\"html5-video-container\"]//child::video")
    private static WebElement playvideo;
    
	@FindBy(xpath="(//div[@class=\"ytp-cued-thumbnail-overlay-image\"])[1]")
    private static WebElement thumbnailIcon;
	
	@FindBy(xpath="//button[@title=\"Play (k)\"]//parent::div")
    private static WebElement pausebtn;
	
	@FindBy(xpath="//ul[@class=\"accordion-container\"]//li[1]")
    private static WebElement tumspregancyactive;
	
	@FindBy(xpath="//ul[@class=\"accordion-container\"]//li[1]")
    private static WebElement tumspregancyactive_open;
	
	@FindBy(xpath="//a[text()='#1 OB/GYN recommended brand of antacid']")
    private static WebElement recommendedbrand;
	
	@FindBy(xpath="//li[@class=\"accordion-slide even\"]")
    private static WebElement causesheartburn;
	
	@FindBy(xpath="//li[@class=\"accordion-slide even is-active\"]")
    private static WebElement causesheartburn_open;
	
	@FindBy(xpath="//li[@class=\"accordion-slide last odd\"]")
    private static WebElement safeduringpregancy;
	
	@FindBy(xpath="//li[@class=\"accordion-slide last odd is-active\"]")
    private static WebElement safeduringpregancy_open;
	
	@FindBy(xpath="//p[text()='Show References']")
    private static WebElement showreferences;
	
	@FindBy(xpath="//p[text()='Hide References']")
    private static WebElement hidereferences;
	
	@FindBy(xpath="//h2[text()='Learn More About Heartburn']")
    private static WebElement Header1;
	
	@FindBy(xpath="//a[text()='Heartburn Symptoms']")
    private static WebElement heartburnsymptoms;
	
	@FindBy(xpath="//a[text()='Heartburn Causes']")
    private static WebElement heartburncauses;
	
	@FindBy(xpath="//a[text()='Finding Relief']")
    private static WebElement findingrelief;
	
	@FindBy(xpath="//a[text()='What OB-GYNs Want You to Know About Heartburn and Pregnancy']")
    private static WebElement knowaboutheartburnpregancy;
	
	@FindBy(xpath="//a[text()='What Causes Heartburn During Pregnancy']")
    private static WebElement causesheartburnpregancy;
	
	@FindBy(xpath="//a[text()='Remedies For Pregnancy And Heartburn']")
    private static WebElement remediesforpregancy;
	
	@FindBy(xpath="//a[text()='How One Woman Dealt With Heartburn During Pregnancy']")
    private static WebElement dealwithheartburn;
	
	@FindBy(xpath="//a[text()='How to Stay Healthy During Pregnancy']")
    private static WebElement stayhealthy;
	
	@FindBy(xpath="//a[text()='Foods To Eat During Your Pregnancy']")
    private static WebElement foodduringpregancy;
	
	@FindBy(xpath="//a[text()='Is Heartburn an Early Pregnancy Sign?']")
    private static WebElement heartburnpregancyearlysign;
	
	@FindBy(xpath="//a[text()='Probiotics During Pregnancy']")
    private static WebElement probioticpregancy;
	
	@FindBy(xpath="//a[text()='See products']")
    private static WebElement seeproducts;
	
	
	
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
               // actionClick(cookieClose);
            } catch (Exception e) {
            }
       }else {
          System.out.println("Dismiss is not presented");
       }
	}
			public void clickonHeartburn101breadcrumbs() throws Throwable {
				clickElementUsingJavaScript(HeartBurn101breadcrumbs);
		}
			
			public void clickonTumspregancy() throws Throwable {
				clickElementUsingJavaScript(tumspregancy);
		}	
			public void clickonyoutube() throws Throwable {
				moveToElement(youtubeplay);
				clickElementUsingJavaScript(youtubeplay);
				System.out.println("Clicked on Video session");
				Thread.sleep(1000);
				switchToFrameUsingElement(iframe);
				System.out.println("frames display");
				actionClick(playvideo);
				//moveToElement(pausebtn);
				clickElementUsingJavaScript(thumbnailIcon);
				Thread.sleep(2000);
				Assert.assertTrue(elementIsDisplayed(thumbnailIcon));
				clickElementUsingJavaScript(pausebtn);
				System.out.println("Video is playing Successfully");
				frameSwitchingToDefaultContent();
				
				
			}
			
            public void clickonCantakeTumsonpregancy() throws Exception {
            	moveToElement(tumspregancyactive);
            	clickElementUsingJavaScript(tumspregancyactive);
            	boolean elementIsDisplayed=elementIsDisplayed(tumspregancyactive_open);
            	Assert.assertTrue(elementIsDisplayed);
            	clickElementUsingJavaScript(tumspregancyactive_open);
            }
	        public void clickonrecommendedbrand() throws Exception {
	        	moveToElement(recommendedbrand);
	        	clickElementUsingJavaScript(recommendedbrand);
	        }
	        public void clickoncausesheartburn() throws Exception {
            	moveToElement(causesheartburn);
            	clickElementUsingJavaScript(causesheartburn);
            	boolean elementIsDisplayed=elementIsDisplayed(causesheartburn_open);
            	Assert.assertTrue(elementIsDisplayed);
            	clickElementUsingJavaScript(causesheartburn_open);
            }
	        public void clickonsafeduringpregancy() throws Exception {
            	moveToElement(safeduringpregancy);
            	clickElementUsingJavaScript(safeduringpregancy);
            	boolean elementIsDisplayed=elementIsDisplayed(safeduringpregancy_open);
            	Assert.assertTrue(elementIsDisplayed);
            	clickElementUsingJavaScript(safeduringpregancy_open);
            }
	        public void clickonReferences() throws Exception {
            	moveToElement(showreferences);
            	clickElementUsingJavaScript(showreferences);
            	boolean elementIsDisplayed=elementIsDisplayed(hidereferences);
            	Assert.assertTrue(elementIsDisplayed);
            	clickElementUsingJavaScript(hidereferences);
            }
	        public void clickonheartburnsymptoms() throws Exception {
	        	scrollDownUsingElement(Header1);
	        	moveToElement(heartburnsymptoms);
	        	clickElementUsingJavaScript(heartburnsymptoms);
	        }
	        public void clickonheartburncauses() throws Exception {
	        	scrollDownUsingElement(Header1);
	        	moveToElement(heartburncauses);
	        	clickElementUsingJavaScript(heartburncauses);
	        }
	        public void clickonfindingrelief() throws Exception {
	        	scrollDownUsingElement(Header1);
	        	moveToElement(findingrelief);
	        	clickElementUsingJavaScript(findingrelief);
	        }
	        public void clickonKnowaboutheartburnpregancy() throws Exception {
	        	scrollDownUsingElement(knowaboutheartburnpregancy);
	        	clickElementUsingJavaScript(knowaboutheartburnpregancy);
	        }
	        public void clickoncausesheartburnpregancy() throws Exception {
	        	scrollDownUsingElement(causesheartburnpregancy);
	        	clickElementUsingJavaScript(causesheartburnpregancy);
	        }
	        public void clickondealwithheartburn() throws Exception {
	        	scrollDownUsingElement(dealwithheartburn);
	        	clickElementUsingJavaScript(dealwithheartburn);
	        }
	        public void clickonremediesduringpregancy() throws Exception {
	        	scrollDownUsingElement(remediesforpregancy);
	        	clickElementUsingJavaScript(remediesforpregancy);
	        }
	        public void clickonstayhealthy() throws Exception {
	        	scrollDownUsingElement(stayhealthy);
	        	clickElementUsingJavaScript(stayhealthy);
	        }
	        public void clickonfoodduringpregancy() throws Exception {
	        	scrollDownUsingElement(foodduringpregancy);
	        	clickElementUsingJavaScript(foodduringpregancy);
	        }
	        public void clickonearlypregancysign() throws Exception {
	        	scrollDownUsingElement(heartburnpregancyearlysign);
	        	clickElementUsingJavaScript(heartburnpregancyearlysign);
	        }
	        public void clickonprobioticpregancy() throws Exception {
	        	scrollDownUsingElement(probioticpregancy);
	        	clickElementUsingJavaScript(probioticpregancy);
	        }
	        public void clickonseeproducts() throws Exception {
	        	scrollDownUsingElement(seeproducts);
	        	clickElementUsingJavaScript(seeproducts);
	        }
	

}
