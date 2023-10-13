package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class Abreva5waysridcoldsorePage extends BaseClass{
	
	public Abreva5waysridcoldsorePage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section default-style first odd initialized']//a[@href='/managing-lip-health/cold-sore-triggers/']")
	private static WebElement managingliphealth;		
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement managingliphealth_txt;	

	@FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']")
	private static WebElement dealingcoldsore;	


	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsore_txt;	

	@FindBy(xpath = "//a[text()='LIP CARE ']")
	private static WebElement lipcare;	

	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare_txt;

	@FindBy(xpath = "//a[text()='STRESS AND COLD SORES ']")
	private static WebElement stresscoldsore;

	@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
	private static WebElement stresscoldsore_txt;

	@FindBy(xpath = "//a[text()='LIP PROBLEMS ']")
	private static WebElement lipproblem;

	@FindBy(xpath = "//h1[text()='Common Lip Problems']")
	private static WebElement lipproblem_txt;

	@FindBy(xpath = "//a[text()='CAN YOU PUT ALOE VERA ON COLD SORES? ']")
	private static WebElement aloeveracoldsores;

	@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
	private static WebElement aloeveracoldsores_txt;

	@FindBy(xpath = "//a[text()='RECURRING COLD SORES ']")
	private static WebElement recurringcoldsore;

	@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
	private static WebElement recurringcoldsore_txt;
	
	@FindBy(xpath = "//u[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsores;
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsores_txt;
	
	@FindBy(xpath = "//a[text()='cold sores']")
	private static WebElement coldsores;
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement coldsores_txt;
	
	@FindBy(xpath = "(//div[@class='richText component section spread-carousel-txt even last grid_4 omega']//h3[text()='1. HANDS OFF'])[1]")
	private static WebElement Bannertxt1;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next1;
	
	@FindBy(xpath = "(//h3[text()='2. COOL THAT COLD SORE DOWN WITH A COMPRESS'])[1]")
	private static WebElement Bannertxt2;
	
	@FindBy(xpath = "(//h3[text()='3. AVOID ACIDIC FOODS AND OPT FOR VITAMIN C TABLETS INSTEAD'])[1]")
	private static WebElement Bannertxt3;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next2;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next3;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next4;
	
	@FindBy(xpath = "(//h3[text()='4. TAKE THE PAIN AWAY'])[1]")
	private static WebElement Bannertxt4;
	
	@FindBy(xpath = "//span[text()='Next Slide']")
	private static WebElement next5;
	
	@FindBy(xpath = "//h3[text()='5. ACT EARLY AND APPLY ABREVA® OFTEN']")
	private static WebElement Bannertxt5;
	
	@FindBy(xpath = "//div[@class='box component section article-main-box article-spread-box even']")
	private static WebElement Youtubebtn;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement Youtubebtn_visibility;
	
	@FindBy(xpath = "//iframe[@class='ytv-ld-json']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement Youtubeplay;
	
	@FindBy(xpath = "//a[text()='A LITTLE PREVENTION GOES A LONG WAY']")
	private static WebElement RelatedArticle1;
	
	
	@FindBy(xpath = "//h1[text()='Cold and Flu Prevention']")
	private static WebElement RelatedArticle1_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORE CONFIDENCE']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//h1[text()='Cold Sores and Confidence']")
	private static WebElement RelatedArticle2_txt;
	
	@FindBy(xpath = "//a[text()='FUEL YOUR LIPS']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//h1[text()='Foods for Healthy Lips']")
	private static WebElement RelatedArticle3_txt;
	
	@FindBy(xpath = "//span[text()='GET COUPON']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "Abreva Coupons")
	private static WebElement getcoupons_txt;
	
	@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
	private static WebElement BuyNow;
	
	@FindBy(xpath = "//h2[text()='Oral Care Pump']")
	private static WebElement BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;
	
	
	
	
	
	
	
	
	
	
	
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
	public void clickonManagingliphealth() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managingliphealth);
		clickElementUsingJavaScript(managingliphealth);
		visibilityOf(managingliphealth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingliphealth_txt));
		pageLoad();
	}	
	public void clickonDealingColdSore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsore);
		clickElementUsingJavaScript(dealingcoldsore);
		visibilityOf(dealingcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(dealingcoldsore_txt));
		pageLoad();
	}	
	public void clickonLipCare() throws Exception {	
		waitForPageLoadJava();
		moveToElement(lipcare);
		clickElementUsingJavaScript(lipcare);
		visibilityOf(lipcare_txt);
		boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(lipcare_txt));
		pageLoad();
	}	
	public void clickonStressColdsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(stresscoldsore);
		clickElementUsingJavaScript(stresscoldsore);
		scrollDownUsingElement(stresscoldsore_txt);
		visibilityOf(stresscoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(stresscoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(stresscoldsore_txt));
		pageLoad();
	}	
	public void clickonLipProblem() throws Exception {	
		waitForPageLoadJava();
		moveToElement(lipproblem);
		clickElementUsingJavaScript(lipproblem);
		scrollDownUsingElement(lipproblem_txt);
		visibilityOf(lipproblem_txt);
		boolean elementIsDisplayed=elementIsDisplayed(lipproblem_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(lipproblem_txt));
		pageLoad();
	}	
	public void clickonAloeveracoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(aloeveracoldsores);
		clickElementUsingJavaScript(aloeveracoldsores);
		scrollDownUsingElement(aloeveracoldsores_txt);
		visibilityOf(aloeveracoldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(aloeveracoldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(aloeveracoldsores_txt));
		pageLoad();
	}	
	public void clickonRecurringcoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(recurringcoldsore);
		clickElementUsingJavaScript(recurringcoldsore);
		scrollDownUsingElement(recurringcoldsore_txt);
		visibilityOf(recurringcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(recurringcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(recurringcoldsore_txt));
		pageLoad();
	}		
	public void clickonDealingwithcoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsore);
		clickElementUsingJavaScript(dealingcoldsore);
		scrollDownUsingElement(dealingcoldsore_txt);
		visibilityOf(dealingcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(dealingcoldsore_txt));
		pageLoad();
	}		
	public void clickoncoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsores);
		clickElementUsingJavaScript(coldsores);
		scrollDownUsingElement(coldsores_txt);
		visibilityOf(coldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsores_txt));
		pageLoad();
	}		
	public void clickonBanner1() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Bannertxt1);
		visibilityOf(Bannertxt1);
		boolean elementIsDisplayed=elementIsDisplayed(Bannertxt1);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Bannertxt1));
		clickElementUsingJavaScript(next1);
		
		pageLoad();
	}		
	public void clickonBanner2() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Bannertxt1);
		//visibilityOf(Bannertxt1);
		clickElementUsingJavaScript(next1);
		//visibilityOf(Bannertxt2);
		boolean elementIsDisplayed=elementIsDisplayed(Bannertxt2);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Bannertxt2));
		
		
		pageLoad();
	}		
	public void clickonBanner3() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Bannertxt1);
		clickElementUsingJavaScript(next2);
		Thread.sleep(1000);
		clickElementUsingJavaScript(next3);
		boolean elementIsDisplayed=elementIsDisplayed(Bannertxt3);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Bannertxt3));
		pageLoad();
	}		
	public void clickonBanner4() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Bannertxt1);
		clickElementUsingJavaScript(next2);
		Thread.sleep(1000);
		clickElementUsingJavaScript(next3);
		Thread.sleep(1000);
		clickElementUsingJavaScript(next4);
		boolean elementIsDisplayed=elementIsDisplayed(Bannertxt4);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Bannertxt4));
		pageLoad();
	}		
	public void clickonBanner5() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Bannertxt1);
		clickElementUsingJavaScript(next2);
		Thread.sleep(1000);
		clickElementUsingJavaScript(next3);
		Thread.sleep(1000);
		clickElementUsingJavaScript(next4);
		Thread.sleep(2000);
		clickElementUsingJavaScript(next5);
		visibilityOf(Bannertxt5);
		boolean elementIsDisplayed=elementIsDisplayed(Bannertxt5);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Bannertxt5));
		pageLoad();
	}		
	public void clickonYoutube() throws Exception {	
		waitForPageLoadJava();
		//scrollDownUsingElement(Youtubebtn);
		clickElementUsingJavaScript(Youtubebtn);
		visibilityOf(iframe);
		switchToFrameUsingElement(iframe);
		visibilityOf(Youtubebtn_visibility);
		elementToBeClickable(Youtubebtn_visibility);
		//moveToElement(Youtubebtn_visibility);
		actionClick(Youtubebtn_visibility);
		Thread.sleep(1000);
		boolean elementIsDisplayed=elementIsDisplayed(Youtubebtn_visibility);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println("YouTube video is playing successfully");
		//actionClick(Youtubeplay);
		frameSwitchingToDefaultContent();
		pageLoad();
	}	
	public void clickonRelatedArticle1() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
		scrollDownUsingElement(RelatedArticle1_txt);
		visibilityOf(RelatedArticle1_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle1_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle1_txt));
		pageLoad();
	}		
	public void clickonRelatedArticle2() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
		scrollDownUsingElement(RelatedArticle2_txt);
		visibilityOf(RelatedArticle2_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle2_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle2_txt));
		pageLoad();
	}		
	public void clickonRelatedArticle3() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
		scrollDownUsingElement(RelatedArticle3_txt);
		visibilityOf(RelatedArticle3_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle3_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle3_txt));
		pageLoad();
	}		
	public void clickongetcoupons() throws Exception {	
		waitForPageLoadJava();
		//scrollDownUsingElement(getcoupons);
		if (isElementPresent(getcoupons)) {
			clickElementUsingJavaScript(getcoupons);
			scrollDownUsingElement(getcoupons_txt);
			visibilityOf(getcoupons_txt);
			boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getcoupons_txt));
			pageLoad();
		} else {
			throw new Exception("Get Coupons is not present on Preprod Page");
		}
		
	}		
	public void clickonBuyNow() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(BuyNow);
		clickElementUsingJavaScript(BuyNow);
		visibilityOf(BuyNow_txt);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(BuyNow_txt));
		clickElementUsingJavaScript(BuyNow_Close);
		pageLoad();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
