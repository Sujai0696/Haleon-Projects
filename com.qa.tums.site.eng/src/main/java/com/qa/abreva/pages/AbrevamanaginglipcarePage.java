package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevamanaginglipcarePage extends BaseClass{
	
	public AbrevamanaginglipcarePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "(//a[@href='/managing-lip-health/cold-sore-triggers/'])[3]")
		private static WebElement managingliphealth;		
	
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement managingliphealth_txt;
	
		@FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']")
		private static WebElement dealingcoldsores;
	
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsores_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/lip-care/']")
		private static WebElement lipcare;
	
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lipcare_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/cold-sores-and-stress/']")
		private static WebElement stresscoldsore;
	
		@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
		private static WebElement stresscoldsore_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/common-lip-problems/']")
		private static WebElement lipproblem;
	
		@FindBy(xpath = "//h1[text()='Common Lip Problems']")
		private static WebElement lipproblem_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/can-you-put-aloe-vera-on-cold-sores/']")
		private static WebElement aloveracoldsore;
	
		@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
		private static WebElement aloveracoldsore_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/why-do-i-keep-getting-cold-sores/']")
		private static WebElement recurringcoldsore;
		
		@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
		private static WebElement recurringcoldsore_txt;	
	
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/lip-care/the-cold-sore-tingle-poll/']")
		private static WebElement tinglepoll;	
	
		@FindBy(xpath = "//h2[text()='KNOCK OUT YOUR CHAPPED LIPS']")
		private static WebElement chappedlips;	
	
		@FindBy(xpath = "//h1[text()='Hydrate and Heal Chapped Lips']")
		private static WebElement chappedlips_txt;	
	
		@FindBy(xpath = "//h2[text()='WHERE CAN YOU GET A COLD SORE?']")
		private static WebElement wheregetcoldsore;	
	
		@FindBy(xpath = "//h1[text()='WHERE CAN YOU GET A COLD SORE?']")
		private static WebElement wheregetcoldsore_txt;	
	
		@FindBy(xpath = "//h2[text()='ABREVA VS. THE COMPETITION']")
		private static WebElement abrevavscompetition;	
		
		@FindBy(xpath = "//h1[text()='COMPARE ABREVA VS. OTHER COLD SORE TREATMENTS']")
		private static WebElement abrevavscompetition_txt;	
		
		@FindBy(xpath = "//h2[text()='LIP CARE VS. LIP HEALTH']")
		private static WebElement lipcareliphealth;	
		
		@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
		private static WebElement lipcareliphealth_txt;	
		
		@FindBy(xpath = "//h2[text()='FUEL YOUR LIPS']")
		private static WebElement fuelyourlips;	
		
		@FindBy(xpath = "//h1[text()='Foods for Healthy Lips']")
		private static WebElement fuelyourlips_txt;	
		
		@FindBy(xpath = "//a[@href='/managing-lip-health/lip-care/lysine-and-cold-sores/']")
		private static WebElement lysinecoldsores;	
		
		@FindBy(xpath = "//h1[text()='LYSINE FOR COLD SORE TREATMENT']")
		private static WebElement lysinecoldsores_txt;	
	
		@FindBy(xpath = "//h2[text()='FOODS FOR HEALTHY LIPS']")
		private static WebElement foodhealthylips;	
	
		@FindBy(xpath = "//h1[text()='Foods for Healthy Lips']")
		private static WebElement foodhealthylips_txt;	
		
		@FindBy(xpath = "//h2[text()='BUMPS ON LIPS']")
		private static WebElement bumpsonlips;	
		
		@FindBy(xpath = "//h1[text()='Managing Bumps on Lips']")
		private static WebElement bumpsonlips_txt;	
		
		@FindBy(xpath = "//h2[text()='HOW TO NOT TOUCH YOUR FACE']")
		private static WebElement nottouchface;	
		
		@FindBy(xpath = "//h1[text()='HOW NOT TO TOUCH YOUR FACE']")
		private static WebElement nottouchface_txt;	
		
		@FindBy(xpath = "//a[text()='TAKE THE QUIZ']")
		private static WebElement takequiz;	
	
		@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
		private static WebElement takequiz_txt;	
	
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
		public void clickonManaginglipHealth() throws Exception {	
			waitForPageLoadJava();
			//moveToElement(managingliphealth);
			clickElementUsingJavaScript(managingliphealth);
			visibilityOf(managingliphealth_txt);
			boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managingliphealth_txt));
			pageLoad();
		}
		public void clickonDealingcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealingcoldsores);
			clickElementUsingJavaScript(dealingcoldsores);
			visibilityOf(dealingcoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingcoldsores_txt));
			pageLoad();
		}
		public void clickonlipcare() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipcare);
			elementToBeClickable(lipcare);
			visibilityOf(lipcare_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcare_txt));
			pageLoad();
		}
		public void clickonStresscoldsore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(stresscoldsore);
			clickElementUsingJavaScript(stresscoldsore);
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
		public void clickonAloveracolssore() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aloveracoldsore);
			clickElementUsingJavaScript(aloveracoldsore);
			scrollDownUsingElement(aloveracoldsore_txt);
			visibilityOf(aloveracoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(aloveracoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(aloveracoldsore_txt));
			pageLoad();
		}
		public void clickonRecurringcoldsore() throws Exception {	
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
//		public void clickonTinglepoll() throws Exception {	
//			waitForPageLoadJava();
//			moveToElement(tinglepoll);
//			clickElementUsingJavaScript(tinglepoll);
//			pageLoad();
//		}
		public void clickonchappedlips() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(chappedlips);
			//scrollDownUsingElement(chappedlips_txt);
			visibilityOf(chappedlips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(chappedlips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(chappedlips_txt));
			pageLoad();
		}
		public void clickonwheregetcoldsore() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(wheregetcoldsore);
			//scrollDownUsingElement(chappedlips_txt);
			visibilityOf(wheregetcoldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(wheregetcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wheregetcoldsore_txt));
			pageLoad();
		}
		public void clickonAbrevavscompetion() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(abrevavscompetition);
			//scrollDownUsingElement(chappedlips_txt);
			visibilityOf(abrevavscompetition_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevavscompetition_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevavscompetition_txt));
			pageLoad();
		}
		public void clickonlipcareliphealth() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(lipcareliphealth);
			scrollDownUsingElement(lipcareliphealth_txt);
			visibilityOf(lipcareliphealth_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lipcareliphealth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcareliphealth_txt));
			pageLoad();
		}
		public void clickonfuelyourlips() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(fuelyourlips);
			scrollDownUsingElement(fuelyourlips_txt);
			visibilityOf(fuelyourlips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(fuelyourlips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fuelyourlips_txt));
			pageLoad();
		}
		public void clickonlysinecoldsores() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(lysinecoldsores);
			scrollDownUsingElement(lysinecoldsores_txt);
			visibilityOf(lysinecoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lysinecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lysinecoldsores_txt));
			pageLoad();
		}
		public void clickonfoodhealthylips() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(foodhealthylips);
			scrollDownUsingElement(foodhealthylips_txt);
			visibilityOf(foodhealthylips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(foodhealthylips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(foodhealthylips_txt));
			pageLoad();
		}
		public void clickonbumpsonlips() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(bumpsonlips);
			scrollDownUsingElement(bumpsonlips_txt);
			visibilityOf(bumpsonlips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(bumpsonlips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(bumpsonlips_txt));
			pageLoad();
		}
		public void clickonnottouchface() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(nottouchface);
			scrollDownUsingElement(nottouchface_txt);
			visibilityOf(nottouchface_txt);
			boolean elementIsDisplayed=elementIsDisplayed(nottouchface_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(nottouchface_txt));
			pageLoad();
		}
		public void clickontakequiz() throws Exception {	
			waitForPageLoadJava();
			//scrollDownUsingElement(chappedlips_txt);
			//moveToElement(chappedlips);
			clickElementUsingJavaScript(takequiz);
			scrollDownUsingElement(takequiz_txt);
			visibilityOf(takequiz_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takequiz_txt));
			pageLoad();
		}
		public void clickonBuyNow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(BuyNow);
			moveToElement(BuyNow);
			if (isElementPresent(BuyNow)) {
				elementToBeClickable(BuyNow);
				actionClick(BuyNow);
				visibilityOf(BuyNow_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(BuyNow_txt));
				clickElementUsingJavaScript(BuyNow_Close);
				pageLoad();
			} else {
				throw new Exception("Buy Now is not present on Page");
			}
			
		}		
	
	
	
	
	
	
	

}
