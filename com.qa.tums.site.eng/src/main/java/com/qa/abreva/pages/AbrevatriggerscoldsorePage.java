package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevatriggerscoldsorePage extends BaseClass{
	
	public AbrevatriggerscoldsorePage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[text()='ABOUT COLD SORES ']")
		private static WebElement aboutcoldsores;
	
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement aboutcoldsores_txt;
	
		@FindBy(xpath = "//a[text()='HOW COLD SORES SPREAD ']")
		private static WebElement coldsoresspread;
	
		@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
		private static WebElement coldsoresspread_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE TRIGGERS ']")
		private static WebElement coldsorestriggers;
	
		@FindBy(xpath = "//div[@class='richText component section abreva-text first odd']//h1")
		private static WebElement coldsorestriggers_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']")
		private static WebElement coldsorestreatment;
	
		@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt first odd']//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement coldsorestreatment_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE MYTHS ']")
		private static WebElement coldsorestmyths;
	
		@FindBy(xpath = "//h1[text()='Cold Sore Facts and Myths']")
		private static WebElement coldsorestmyths_txt;
	
		@FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']")
		private static WebElement takecarelips;
		
		@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
		private static WebElement takecarelips_txt;
		
		@FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']")
		private static WebElement coldsorepimple;
		
		@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
		private static WebElement coldsorepimple_txt;
		
		@FindBy(xpath = "//a[text()='TYPES OF COLD SORE MEDICINE ']")
		private static WebElement typescoldsoremedicine;
		
		@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
		private static WebElement typescoldsoremedicine_txt;
		
		@FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']")
		private static WebElement coldsoreteens;
		
		@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
		private static WebElement coldsoreteens_txt;	
	
		@FindBy(xpath = "//a[text()='cold sores']")
		private static WebElement coldsore;
	
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement coldsore_txt;
	
		@FindBy(xpath = "//a[text()='cold sores or blisters']")
		private static WebElement coldsoreblisters;
	
		@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
		private static WebElement coldsoreblisters_txt;
	
		@FindBy(xpath = "//a[text()='triggered by psychological and environmental factors, such as stress']")
		private static WebElement psychologicalstress;
	
		@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
		private static WebElement psychologicalstress_txt;
	
		@FindBy(xpath = "//a[text()='relaxation techniques']")
		private static WebElement relaxationtechniques;
	
		@FindBy(xpath = "//h1[text()='Take It Easy: Relaxation Techniques']")
		private static WebElement relaxationtechniques_txt;
	
		@FindBy(xpath = "//a[text()='exercise']")
		private static WebElement exercise;
	
		@FindBy(xpath = "//h1[text()='Cold Sores and Exercise']")
		private static WebElement exercise_txt;
	
		@FindBy(xpath = "//a[text()='Getting good quality rest']")
		private static WebElement gettinggoodqualityrest;
	
		@FindBy(xpath = "//h1[text()='How to Get Better Sleep']")
		private static WebElement gettinggoodqualityrest_txt;
	
		@FindBy(xpath = "//a[text()='Cold weather can trigger cold sores']")
		private static WebElement coldweathersores;
		
		@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
		private static WebElement coldweathersores_txt;
		
		@FindBy(xpath = "//a[text()='Sun exposure']")
		private static WebElement sunexposure;
		
		@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
		private static WebElement sunexposure_txt;
		
		@FindBy(xpath = "//a[text()='Some women also experience outbreaks during pregnancy']")
		private static WebElement outbreakspregancy;
		
		@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
		private static WebElement outbreakspregancy_txt;
		
		@FindBy(xpath = "//a[text()='Visiting a dentist may trigger an outbreak of cold sores']")
		private static WebElement visitingdentist;
		
		@FindBy(xpath = "//h1[text()='Going to the Dentist with a Cold Sore']")
		private static WebElement visitingdentist_txt;
		
		@FindBy(xpath = "//a[text()='cold or the flu']")
		private static WebElement coldflu;
		
		@FindBy(xpath = "//h1[text()='Cold and Flu Prevention']")
		private static WebElement coldflu_txt;
		
		@FindBy(xpath = "(//a[@href='/cold-sore-products/abreva-cream/'])[3]")
		private static WebElement abrevacream1;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream_txt;
		
		@FindBy(xpath = "(//a[@href='/cold-sore-products/abreva-cream/'])[4]")
		private static WebElement abrevacream2;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream2_txt;
		
		
		@FindBy(xpath = "//a[text()='TAKE THE QUIZ']")
		private static WebElement takequiz;
		
		@FindBy(xpath = "//label[text()='In the winter']")
		private static WebElement q1;
		
		@FindBy(xpath = "//span[@class='formControl-radio optionSelected']")
		private static WebElement q1_active;
		
		@FindBy(xpath = "(//div[@class='imgContainer']//span[@class='formControl-radio optionSelected'])[2]")
		private static WebElement q2_active;
		
		@FindBy(xpath = "(//label[text()='Yes'])[1]")
		private static WebElement q2;
		
		@FindBy(xpath = "//span[@class='formControl-radio optionSelected']")
		private static WebElement q3_active;
		
		@FindBy(xpath = "//label[text()='Stressful on occasion']")
		private static WebElement q3;
		
		@FindBy(xpath = "//label[text()='Fairly stress free']")
		private static WebElement q3_act;
		
		@FindBy(xpath = "(//div[@class='imgContainer']//span[@class='formControl-radio optionSelected'])[2]")
		private static WebElement q4_active;
		
		@FindBy(xpath = "(//label[text()='Yes'])[2]")
		private static WebElement q4;
		
		@FindBy(xpath = "(//span[@class='formControl-radio optionSelected'])[3]")
		private static WebElement q5_active;
		
		@FindBy(xpath = "//label[text()='Rarely']")
		private static WebElement q5;
		
		@FindBy(xpath = "(//span[@class='formControl-radio optionSelected'])[4]")
		private static WebElement q6_active;
		
		@FindBy(xpath = "(//label[text()='Yes'])[3]")
		private static WebElement q6;
		
		@FindBy(xpath = "//a[text()='SEE YOUR RESULTS']")
		private static WebElement seeyourresults;
		
		@FindBy(xpath = "//a[text()='WRITE A REVIEW']")
		private static WebElement writereview;
		
		@FindBy(xpath = "//h1[text()='WRITE A REVIEW']")
		private static WebElement writereview_txt;
		
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
		public void clickonAboutcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aboutcoldsores);
			clickElementUsingJavaScript(aboutcoldsores);
			visibilityOf(aboutcoldsores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(aboutcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(aboutcoldsores_txt));
			pageLoad();
		}
		public void clickonColdsoresspread() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoresspread);
			clickElementUsingJavaScript(coldsoresspread);
			visibilityOf(coldsoresspread_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoresspread_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoresspread_txt));
			pageLoad();
		}
		public void clickonColdsorestriggers() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestriggers);
			elementToBeClickable(coldsorestriggers);
			visibilityOf(coldsorestriggers_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestriggers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestriggers_txt));
			pageLoad();
		}
		public void clickonColdsorestreatment() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestreatment);
			clickElementUsingJavaScript(coldsorestreatment);
			visibilityOf(coldsorestreatment_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestreatment_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestreatment_txt));
			pageLoad();
		}
		public void clickonColdsoresmyths() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorestmyths);
			clickElementUsingJavaScript(coldsorestmyths);
			visibilityOf(coldsorestmyths_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorestmyths_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorestmyths_txt));
			pageLoad();
		}
		public void clickontakecarelips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(takecarelips);
			clickElementUsingJavaScript(takecarelips);
			scrollDownUsingElement(takecarelips_txt);
			visibilityOf(takecarelips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takecarelips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takecarelips_txt));
			pageLoad();
		}
		public void clickoncoldsorevspimple() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorepimple);
			clickElementUsingJavaScript(coldsorepimple);
			scrollDownUsingElement(coldsorepimple_txt);
			visibilityOf(coldsorepimple_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorepimple_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorepimple_txt));
			pageLoad();
		}
		public void clickontypesofcoldsoresmedicine() throws Exception {	
			waitForPageLoadJava();
			moveToElement(typescoldsoremedicine);
			clickElementUsingJavaScript(typescoldsoremedicine);
			scrollDownUsingElement(typescoldsoremedicine_txt);
			visibilityOf(typescoldsoremedicine_txt);
			boolean elementIsDisplayed=elementIsDisplayed(typescoldsoremedicine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(typescoldsoremedicine_txt));
			pageLoad();
		}
		public void clickonColdsoresteens() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreteens);
			clickElementUsingJavaScript(coldsoreteens);
			scrollDownUsingElement(coldsoreteens_txt);
			visibilityOf(coldsoreteens_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreteens_txt));
			pageLoad();
		}
		public void clickonColdsore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(coldsore);
			moveToElement(coldsore);
			clickElementUsingJavaScript(coldsore);
			scrollDownUsingElement(coldsore_txt);
			visibilityOf(coldsore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsore_txt));
			pageLoad();
		}
		public void clickonColdsoreblisters() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(coldsoreblisters);
			moveToElement(coldsoreblisters);
			clickElementUsingJavaScript(coldsoreblisters);
			scrollDownUsingElement(coldsoreblisters_txt);
			visibilityOf(coldsoreblisters_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreblisters_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreblisters_txt));
			pageLoad();
		}
		public void clickonPsycologicalstress() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(psychologicalstress);
			moveToElement(psychologicalstress);
			clickElementUsingJavaScript(psychologicalstress);
			scrollDownUsingElement(psychologicalstress_txt);
			visibilityOf(psychologicalstress_txt);
			boolean elementIsDisplayed=elementIsDisplayed(psychologicalstress_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(psychologicalstress_txt));
			pageLoad();
		}
		public void clickonRelaxationTechniques() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(relaxationtechniques);
			moveToElement(relaxationtechniques);
			clickElementUsingJavaScript(relaxationtechniques);
			scrollDownUsingElement(relaxationtechniques_txt);
			visibilityOf(relaxationtechniques_txt);
			boolean elementIsDisplayed=elementIsDisplayed(relaxationtechniques_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(relaxationtechniques_txt));
			pageLoad();
		}
		public void clickonExercise() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(exercise);
			moveToElement(exercise);
			clickElementUsingJavaScript(exercise);
			scrollDownUsingElement(exercise_txt);
			visibilityOf(exercise_txt);
			boolean elementIsDisplayed=elementIsDisplayed(exercise_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(exercise_txt));
			pageLoad();
		}
	
		public void clickonGettinggoodqualityrest() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(gettinggoodqualityrest);
			moveToElement(gettinggoodqualityrest);
			clickElementUsingJavaScript(gettinggoodqualityrest);
			scrollDownUsingElement(gettinggoodqualityrest_txt);
			visibilityOf(gettinggoodqualityrest_txt);
			boolean elementIsDisplayed=elementIsDisplayed(gettinggoodqualityrest_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(gettinggoodqualityrest_txt));
			pageLoad();
		}
		public void clickonColdweathersores() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(coldweathersores);
			moveToElement(coldweathersores);
			clickElementUsingJavaScript(coldweathersores);
			scrollDownUsingElement(coldweathersores_txt);
			visibilityOf(coldweathersores_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldweathersores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldweathersores_txt));
			pageLoad();
		}
		public void clickonSunexposure() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(sunexposure);
			moveToElement(sunexposure);
			clickElementUsingJavaScript(sunexposure);
			scrollDownUsingElement(sunexposure_txt);
			visibilityOf(sunexposure_txt);
			boolean elementIsDisplayed=elementIsDisplayed(sunexposure_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(sunexposure_txt));
			pageLoad();
		}
		public void clickonOutbreakpregancy() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(outbreakspregancy);
			moveToElement(outbreakspregancy);
			clickElementUsingJavaScript(outbreakspregancy);
			scrollDownUsingElement(outbreakspregancy_txt);
			visibilityOf(outbreakspregancy_txt);
			boolean elementIsDisplayed=elementIsDisplayed(outbreakspregancy_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(outbreakspregancy_txt));
			pageLoad();
		}
		public void clickonVisitingDentist() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(visitingdentist);
			moveToElement(visitingdentist);
			clickElementUsingJavaScript(visitingdentist);
			scrollDownUsingElement(visitingdentist_txt);
			visibilityOf(visitingdentist_txt);
			boolean elementIsDisplayed=elementIsDisplayed(visitingdentist_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(visitingdentist_txt));
			pageLoad();
		}
		public void clickonColdflu() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(coldflu);
			moveToElement(coldflu);
			clickElementUsingJavaScript(coldflu);
			scrollDownUsingElement(coldflu_txt);
			visibilityOf(coldflu_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldflu_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldflu_txt));
			pageLoad();
		}
		public void clickonAbrevaCream() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(abrevacream1);
			moveToElement(abrevacream1);
			clickElementUsingJavaScript(abrevacream1);
			scrollDownUsingElement(abrevacream_txt);
			visibilityOf(abrevacream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacream_txt));
			pageLoad();
		}
		public void clickonAbrevaCream2() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(abrevacream2);
			moveToElement(abrevacream2);
			clickElementUsingJavaScript(abrevacream2);
			
			visibilityOf(abrevacream2_txt);
			boolean elementIsDisplayed=elementIsDisplayed(abrevacream2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacream2_txt));
			pageLoad();
		}
		public void clickonQuiz() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(takequiz);
			moveToElement(takequiz);
			clickElementUsingJavaScript(takequiz);
			scrollupUsingElement(q1);
			visibilityOf(q1);
			clickElementUsingJavaScript(q1);
			if (q1_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
			scrollupUsingElement(q2);
			visibilityOf(q2);
			clickElementUsingJavaScript(q2);
			if (q2_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
			scrollupUsingElement(q3);
			visibilityOf(q3);
			clickElementUsingJavaScript(q3);
			if (q3_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
			scrollupUsingElement(q4);
			visibilityOf(q4);
			clickElementUsingJavaScript(q4);
			if (q4_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
			scrollupUsingElement(q5);
			visibilityOf(q5);
			clickElementUsingJavaScript(q5);
			if (q5_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
		
			scrollupUsingElement(q6);
			visibilityOf(q6);
			clickElementUsingJavaScript(q6);
			if (q6_active.isDisplayed()) {
				Assert.assertTrue(true);
				
				
			} else {
				throw new Exception("Quiz Radio buttons anre not Clicable on Page");
			}
			clickElementUsingJavaScript(seeyourresults);
			pageLoad();
		}
			public void clickonWriteReview() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(writereview);
				moveToElement(writereview);
				clickElementUsingJavaScript(writereview);
				scrollDownUsingElement(writereview_txt);
				visibilityOf(writereview_txt);
				boolean elementIsDisplayed=elementIsDisplayed(writereview_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(writereview_txt));
				pageLoad();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

