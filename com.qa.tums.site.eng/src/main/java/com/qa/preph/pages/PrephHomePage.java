package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephHomePage extends BaseClass{
	
	public PrephHomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage m-m-t-1 p-d-r-4 p-m-x-1 p-m-y-2 text-left-d text-center-m first odd last component col-xs-12 col-md-8 col-lg-9']//a[text()='SEE ALL PRODUCTS']")
	private static WebElement productsbanner;		
		
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement productsbanner_txt;
	
	@FindBy(xpath = "(//ul[@class='lSPager lSpg']//li[@class='active']//child::a[text()='1'])[1]")
	private static WebElement Carousel1;
	
	@FindBy(xpath = "(//a[text()='SEE ALL PRODUCTS'])[2]")
	private static WebElement seeallproduct;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement seeallproduct_txt;
	
	@FindBy(xpath = "//ul[@class='lSPager lSpg']//child::li[@class='active']//a[text()='2']")
	private static WebElement Carousel2;
	
	@FindBy(xpath = "//a[text()='LEARN MORE']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "(//ul[@class='lSPager lSpg']//a[text()='3'])[1]")
	private static WebElement Carousel3;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement learnmore_txt;
	
	@FindBy(xpath = "//a[text()='GET RELIEF']")
	private static WebElement getrelief;
	
	@FindBy(xpath = "//h1[text()='Looking Into Your Rear View']")
	private static WebElement getrelief_txt;
	
	
	@FindBy(xpath = "//div[@class='richText component section p-d-x-2 p-d-t-4 p-m-x-1 p-m-t-3 text-center-d text-center-m first odd col-xs-12']//a[text()='SEE ALL PRODUCTS']")
	private static WebElement seeallproducts;
	
	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement seeallproducts_txt;
	
	@FindBy(xpath = "(//ul[@class='lSPager lSpg'])[2]//child::a[text()='1']")
	private static WebElement BannerCarousel1;
	
	@FindBy(xpath = "(//div[@class='lSSlideWrapper usingCss']//child::a[text()='Next'])[1]")
	private static WebElement bannercarousel_next;
	
	@FindBy(xpath = "//div[@class='richText component section m-m-t-1 p-d-x-2 p-m-x-2 text-center-d text-center-m first odd last col-xs-12']//a[text()='Medicated Wipes']")
	private static WebElement MedicatedWipes;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement MedicatedWipes_txt;
	
	@FindBy(xpath = "(//a[text()='Next'])[2]")
	private static WebElement bigCarousel_next1;
	
	@FindBy(xpath = "//a[text()='Rapid Relief with Lidocaine Cream']")
	private static WebElement rapidrelieflidocainecream;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief with Lidocaine Cream']")
	private static WebElement rapidrelieflidocainecream_txt;
	
	@FindBy(xpath = "(//a[text()='Next'])[2]")
	private static WebElement bigCarousel_next2;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_2;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_3;
	
	@FindBy(xpath = "//div[@class='richText component section m-m-t-1 p-d-x-2 p-m-x-2 text-center-d text-center-m first odd last col-xs-12']//a[text()='Totables']")
	private static WebElement totables;
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement totables_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_4;
	
	@FindBy(xpath = "//div[@class='richText component section m-m-t-1 p-d-x-2 p-m-x-2 text-center-d text-center-m first odd last col-xs-12']//a[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscreame;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscreame_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_5;
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointment;
	
	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement ointment_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_6;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage m-m-t-1 p-d-x-1 p-m-x-2 text-center-d text-center-m first odd last component col-xs-12']//a[text()='Medicated Wipes']")
	private static WebElement medicatedwipes1;
	
	@FindBy(xpath = "//h1[text()='Medicated Wipes']")
	private static WebElement medicatedwipes1_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_7;
	
	@FindBy(xpath = "//a[text()='Rapid Relief Spray']")
	private static WebElement rapidreliefsparay;
	
	@FindBy(xpath = "//h1[text()='Rapid Relief Spray with Lidocaine']")
	private static WebElement rapidreliefsparay_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_8;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage m-m-t-1 p-d-x-1 p-m-x-2 text-center-d text-center-m first odd last component col-xs-12']//a[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomcreame;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomcreame_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_9;
	
	@FindBy(xpath = "//a[text()='Cooling Gel']")
	private static WebElement coolinggel;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolinggel_txt;
	
	@FindBy(xpath = "(//li[@class='active'])[3]")
	private static WebElement carouseldot_10;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage m-m-t-1 p-d-x-1 p-m-x-2 text-center-d text-center-m first odd last component col-xs-12']//a[text()='Totables']")
	private static WebElement totable1;
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement totable1_txt;
	
	@FindBy(xpath = "//a[text()='READ ARTICLES']")
	private static WebElement readarticle;
	
	@FindBy(xpath = "//h2[@class='banner-title']")
	private static WebElement readarticle_txt;
	
	@FindBy(xpath = "//a[text()='WATCH VIDEOS']")
	private static WebElement watchvideos;
	
	@FindBy(xpath = "//div[@class='richText component section m-m-b-2 m-m-x-2 first odd col-xs-12 col-sm-6 col-lg-5']")
	private static WebElement watchvideos_txt;
	
	@FindBy(xpath = "//img[@title='Rapid Relief Spray with Lidocaine Video']")
	private static WebElement getcomfvideo;
	
	@FindBy(xpath = "//a[text()='Play Video ']")
	private static WebElement getcomfvideo_display;
	
	@FindBy(xpath = "(//div[@class='ytp-cued-thumbnail-overlay-image'])[1]")
	private static WebElement getcomfvideo_thumbnail;
	
	@FindBy(xpath = "(//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg'])[1]")
	private static WebElement getcomfvideo_playbtn;
	
	@FindBy(xpath = "(//iframe[@id='ytplayer'])[1]")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class='html5-video-player ytp-exp-bottom-control-flexbox ytp-fit-cover-video ytp-title-enable-channel-logo ytp-fine-scrubbing-exp ytp-embed ytp-embed-playlist playing-mode ytp-autohide']")
	private static WebElement videoplay;
	
	
	@FindBy(xpath = "//li[text()=' Sign up ']")
	private static WebElement signupBreadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Keep Your Caboose In the Know']")
	private static WebElement signup_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//input[@placeholder='First Name*']")
	private static WebElement firstname;	
	
	@FindBy(xpath = "//input[@placeholder='Last Name*']")
	private static WebElement lastname;	
	
	@FindBy(xpath = "//input[@placeholder='Email*']")
	private static WebElement email;	
	
	@FindBy(xpath = "//button[text()=' SIGN UP ']")
	private static WebElement submit;
	
	
	
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
		
		
			public void clickonCarousel() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(Carousel1);
				clickElementUsingJavaScript(Carousel1);
				moveToElement(productsbanner);
				clickElementUsingJavaScript(productsbanner);
				visibilityOf(productsbanner_txt);
				boolean elementIsDisplayed=elementIsDisplayed(productsbanner_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(productsbanner_txt));
				implicitWait();
				
				pageLoad();
			}	
			public void clickonCarouse2() throws Exception{
		    	waitForPageLoadJava();
//				//moveToElement(Carousel1);
//				clickElementUsingJavaScript(Carousel1);
//				implicitWait();
				//clickElementUsingJavaScript(Carousel2);
				//moveToElement(seeallproduct);
				clickElementUsingJavaScript(seeallproduct);
				visibilityOf(seeallproduct_txt);
				boolean elementIsDisplayed=elementIsDisplayed(seeallproduct_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(seeallproduct_txt));
				implicitWait();
				
				pageLoad();
			}	
			public void clickonCarouse3() throws Exception{
		    	waitForPageLoadJava();
				actionClick(Carousel3);
				implicitWait();
				clickElementUsingJavaScript(learnmore);
				visibilityOf(learnmore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(learnmore_txt));
				implicitWait();
				
				pageLoad();
			}	
			public void clickonGetRelief() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(getrelief);
		    	moveToElement(getrelief);
				clickElementUsingJavaScript(getrelief);
				visibilityOf(getrelief_txt);
				boolean elementIsDisplayed=elementIsDisplayed(getrelief_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(getrelief_txt));
				implicitWait();
				
				pageLoad();
			}	
			public void clickonSeeAllProducts() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(seeallproduct);
		    	moveToElement(seeallproduct);
				clickElementUsingJavaScript(seeallproduct);
				visibilityOf(seeallproduct_txt);
				boolean elementIsDisplayed=elementIsDisplayed(seeallproduct_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(seeallproduct_txt));
				implicitWait();
				
				pageLoad();
			}	
			public void clickonBannerCarouselarrow() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(BannerCarousel1);
		    	moveToElement(BannerCarousel1);
				clickElementUsingJavaScript(BannerCarousel1);
				implicitWait();
				clickElementUsingJavaScript(bannercarousel_next);
				implicitWait();
				
				pageLoad();
			}	
			public void clickonMedicatedWipes() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(MedicatedWipes);
		    	moveToElement(MedicatedWipes);
				clickElementUsingJavaScript(MedicatedWipes);
				visibilityOf(MedicatedWipes_txt);
				boolean elementIsDisplayed=elementIsDisplayed(MedicatedWipes_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(MedicatedWipes_txt));
				
				pageLoad();
			}	
			public void clickonRapidReliefCreame() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_2);
		    	scrollDownUsingElement(rapidrelieflidocainecream);
				clickElementUsingJavaScript(rapidrelieflidocainecream);
				visibilityOf(rapidrelieflidocainecream_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(rapidrelieflidocainecream_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(rapidrelieflidocainecream_txt));
				pageLoad();
			}	
			public void clickonTotables() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_3);
		    	scrollDownUsingElement(totables);
				clickElementUsingJavaScript(totables);
				visibilityOf(totables_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(totables_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(totables_txt));
				pageLoad();
			}	
			public void clickonMultisymptomsCreame() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_4);
		    	scrollDownUsingElement(multisymptomscreame);
				clickElementUsingJavaScript(multisymptomscreame);
				visibilityOf(multisymptomscreame_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(multisymptomscreame_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(multisymptomscreame_txt));
				pageLoad();
			}	
			public void clickonOintment() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_5);
		    	scrollDownUsingElement(ointment);
				clickElementUsingJavaScript(ointment);
				visibilityOf(ointment_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(ointment_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(ointment_txt));
				pageLoad();
			}	
			public void clickonMedicatedWipes1() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_6);
		    	scrollDownUsingElement(medicatedwipes1);
				clickElementUsingJavaScript(medicatedwipes1);
				visibilityOf(medicatedwipes1_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(medicatedwipes1_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(medicatedwipes1_txt));
				pageLoad();
			}	
			public void clickonRapidReliefSpray() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_7);
		    	scrollDownUsingElement(rapidreliefsparay);
				clickElementUsingJavaScript(rapidreliefsparay);
				visibilityOf(rapidreliefsparay_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(rapidreliefsparay_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(rapidreliefsparay_txt));
				pageLoad();
			}	
			public void clickonMultiSymptomscreame() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_8);
		    	scrollDownUsingElement(multisymptomcreame);
				clickElementUsingJavaScript(multisymptomcreame);
				visibilityOf(multisymptomcreame_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(multisymptomcreame_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(multisymptomcreame_txt));
				pageLoad();
			}	
			public void clickonCoolinggel() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_9);
		    	scrollDownUsingElement(coolinggel);
				clickElementUsingJavaScript(coolinggel);
				visibilityOf(coolinggel_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(coolinggel_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(coolinggel_txt));
				pageLoad();
			}	
			public void clickonTotable1() throws Exception{
		    	waitForPageLoadJava();
		    	clickElementUsingJavaScript(carouseldot_10);
		    	scrollDownUsingElement(totable1);
				clickElementUsingJavaScript(totable1);
				visibilityOf(totable1_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(totable1_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(totable1_txt));
				pageLoad();
			}	
	
			public void clickonReadArticle() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(readarticle);
		    	moveToElement(readarticle);
				clickElementUsingJavaScript(readarticle);
				visibilityOf(readarticle_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(readarticle_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(readarticle_txt));
				pageLoad();
			}	
			public void clickonwatchvideos() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(watchvideos);
		    	moveToElement(watchvideos);
				clickElementUsingJavaScript(watchvideos);
				visibilityOf(watchvideos_txt);
				boolean elementIsDisplayed1=elementIsDisplayed(watchvideos_txt);
				Assert.assertTrue(elementIsDisplayed1);
				System.out.println(getElementText(watchvideos_txt));
				pageLoad();
			}	
			
			public void clickonGetcomforvideo() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(getcomfvideo);
				clickElementUsingJavaScript(getcomfvideo);
				implicitWait();
				moveToElement(getcomfvideo_display);
				actionClick(getcomfvideo_display);
			//	visibilityOf(getcomfvideo_thumbnail);
				boolean elementIsDisplayed1=elementIsDisplayed(getcomfvideo_thumbnail);
				Assert.assertTrue(elementIsDisplayed1);
				clickElementUsingJavaScript(getcomfvideo_playbtn);
				switchToFrameUsingElement(iframe);
				clickElementUsingJavaScript(videoplay);
				frameSwitchingToDefaultContent();
				pageLoad();
			}	

			public void clickonSignupform() throws Exception{
		    	waitForPageLoadJava();
				//moveToElement(signupBreadcrumbs);
				firstname.sendKeys("yogita");
				String nameValue = firstname.getAttribute("value");
		        String expectedName = "yogita";
		        if (nameValue.equals(expectedName)) {
		            System.out.println("Name field verification passed.");
		        } else {
		            System.out.println("Name field verification failed.");
		        }
				//SurName//
		        lastname.sendKeys("Patil");
		        String surnameValue = lastname.getAttribute("value");
		        String expectedSurname = "Patil";
		        if (surnameValue.equals(expectedSurname)) {
		            System.out.println("Surname field verification passed.");
		        } else {
		            System.out.println("Surname field verification failed.");
		        }
		        //emails//
		        email.sendKeys("yogita.patil0515@gmail.com");
				String emailname=email.getAttribute("value");
				String expectedemailname="yogita.patil0515@gmail.com";
				if (emailname.equals(expectedemailname)) {
					System.out.println("Email is verified on form");
					
				} else {
					System.out.println("Email is not Verified on Form");
				}
				submit.click();
				
				
				
				
				
				
				
				
				
				
				
				
			}	
			
			
			
			
			
			
			
			
			
			
			
			

}
