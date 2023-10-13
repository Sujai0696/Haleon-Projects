package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.qa.baseClass.BaseClass;

public class TumsCauses extends BaseClass {

	public TumsCauses() {
		PageFactory.initElements(driver, this);
	}

//		@FindBy(xpath = "//button[text()='Accept Cookies']")
//		private static WebElement cookiesAcceptBtn;
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement heartburn101;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a")
	private static WebElement Bread_HomeIcon;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//a")
	private static WebElement Bread_Heartburn101;

	@FindBy(xpath = "//div[@class='richText-content']//a[contains(text(),'quick heartburn relief')]")
	private static WebElement QuickHeartburnRelief;

	@FindBy(xpath = "//div[@class='richText-content']//a[text()=\"TUMS\"]")
	private static WebElement Tums;

	// @FindBy(xpath = "//span[text()='Eating and
	// Exercise']/parent::a[@aria-expanded='true']")
	@FindBy(xpath = "//a[@aria-expanded='true']")
	private static WebElement accordion;

	@FindBy(xpath = "//a[@title='Eating and Exercise']")
	private static WebElement EatingAndExercise;

	@FindBy(xpath = "//span[text()='Foods That Cause Heartburn']")
	private static WebElement FoodsThatCauseHeartburn;

	@FindBy(xpath = "//span[text()='Heartburn Caused by Drink']")
	private static WebElement HeartburnCausedbyDrink;

	@FindBy(xpath = "//span[text()='Medications and Heartburn']")
	private static WebElement MedicationsandHeartburn;

	@FindBy(xpath = "//span[text()='Heartburn During Pregnancy']")
	private static WebElement HeartburnDuringPregnancy;

	@FindBy(xpath = "//span[text()='Lifestyle Causes']")
	private static WebElement LifestyleCauses;

	@FindBy(xpath = "//span[text()='Hiatal Hernia']")
	private static WebElement HiatalHernia;

	@FindBy(xpath = "//li[@class='accordion-slide first odd']")
	private static WebElement EatingAndExerciseClose;

	@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
	private static WebElement EatingAndExerciseOpen;

	@FindBy(xpath = "(//li[@class='accordion-slide even is-active'])[1]")
	private static WebElement EvenisActive;

	@FindBy(xpath = "(//li[@class='accordion-slide even'])[1]")
	private static WebElement FoodsThatCauseHeartburnClose;

	@FindBy(xpath = "//li[@class='accordion-slide odd']")
	private static WebElement HeartburnCausedbyDrinkClose;

	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
	private static WebElement oddisActive;

	@FindBy(xpath = "(//li[@class='accordion-slide even'])[2]")
	private static WebElement MedicationsandHeartburnClose;

	@FindBy(xpath = "(//li[@class='accordion-slide odd'])[2]")
	private static WebElement HeartburnDuringPregnancyClose;

	@FindBy(xpath = "(//li[@class='accordion-slide even'])[3]")
	private static WebElement LifestyleCausesClose;
//		
	@FindBy(xpath = "//li[@class='accordion-slide last odd']")
	private static WebElement HiatalHerniaClose;

	@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
	private static WebElement HiatalHerniaOpen;

	@FindBy(xpath = "//div[@class='richText-content']//p[text()='Show References']")
	private static WebElement Showreferences;

	@FindBy(xpath = "//div[@class='richText-content']//p[text()='Hide References']")
	private static WebElement Hidereferences;
//		
	@FindBy(xpath = "//a[text()='Heartburn Symptoms']")
	private static WebElement HeartburnSymptoms;

	@FindBy(xpath = "//a[text()='Finding Relief']")
	private static WebElement FindingRelief;

	@FindBy(xpath = "//a[text()='TUMS While Pregnant']")
	private static WebElement TUMSwhilePregnant;

	@FindBy(xpath = "//a[text()='What Causes Heartburn? A Checklist']")
	private static WebElement WhatCausesHeartburnAChecklist;

	@FindBy(xpath = "//a[text()='Acid Reflux vs. GERD']")
	private static WebElement AcidRefluxvsGERD;

	@FindBy(xpath = "//a[text()='The Difference Between Heartburn & Indigestion']")
	private static WebElement TheDifferenceBetweenHeartburnIndigestion;

	@FindBy(xpath = "//a[text()='What Behaviors Can Trigger Heartburn?']")
	private static WebElement WhatBehaviors;

	@FindBy(xpath = "//a[text()='What Behaviors Can Trigger Heartburn?']")
	private static WebElement WhatFoodsauseHeartburn;

	@FindBy(xpath = "//a[text()='Upset Stomach After Eating']")
	private static WebElement upsetStomach;

	@FindBy(xpath = "//a[text()='What is GERD? Symptoms, Treatment and Medication']")
	private static WebElement WhatisGRED;

	@FindBy(xpath = "//a[text()='Seven Surprising Heartburn Facts']")
	private static WebElement sevenSurprising;

	@FindBy(xpath = "//a[text()='A Guide to Common Digestive Problems']")
	private static WebElement aGuidetoCommon;

	// a[text()='See products']
	@FindBy(xpath = "//a[text()='See products']")
	private static WebElement seeProducts;

	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
//				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("Dismiss is not presented");
			Assert.assertTrue(false);
		}
	}

	public void clickOnHomeIcon() throws Throwable {
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
	}

	public void clickOnHeartBurn101() throws Throwable {
		moveToElement(Bread_Heartburn101);
		clickElementUsingJavaScript(Bread_Heartburn101);
	}

	public void clickOnQuickHeartbunRelief() throws Throwable {
		clickElementUsingJavaScript(QuickHeartburnRelief);
	}

	public void clickOnTUMS() throws Throwable {
		clickElementUsingJavaScript(Tums);
	}

//	public void clickOnCookies() throws Throwable {
//		implicitWait(3);
//		elementClick(cookiesAcceptBtn);
//
//	}

	public void clickOnEatingAndExercise_accordion() throws Throwable {
		moveToElement(EatingAndExercise);
		if (elementIsDisplayed(EatingAndExercise)) {
			// Thread.sleep(4000);
			clickElementUsingJavaScript(EatingAndExercise);
			Assert.assertTrue(elementIsDisplayed(EatingAndExerciseClose));
			System.out.println("Eating and exercise is closed");
			implicitWait();
			// Thread.sleep(4000);
			clickElementUsingJavaScript(EatingAndExercise);
			visibilityOf(EatingAndExerciseOpen);
			Assert.assertTrue(elementIsDisplayed(EatingAndExerciseOpen));
			System.out.println("Eating and exercise is opened");

		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}

	public void clickOnFoodsThatCauseHeartburn_accordion() throws Throwable {
		moveToElement(FoodsThatCauseHeartburn);
//	clickElementUsingJavaScript(FoodsThatCauseHeartburn);
//	if(elementIsDisplayed(EvenisActive)) {
//		System.out.println("Foods That Cause Heartburn is opened");
//		}
//	clickElementUsingJavaScript(FoodsThatCauseHeartburn);
//	if(elementIsDisplayed(FoodsThatCauseHeartburnClose)) {
//	System.out.println("Foods That Cause Heartburn is closed");
//	}
		if (elementIsDisplayed(FoodsThatCauseHeartburn)) {
			clickElementUsingJavaScript(FoodsThatCauseHeartburn);
			Assert.assertTrue(elementIsDisplayed(EvenisActive));
			System.out.println("Eating and exercise is opened");
			implicitWait();
			clickElementUsingJavaScript(FoodsThatCauseHeartburn);
			visibilityOf(FoodsThatCauseHeartburnClose);
			Assert.assertTrue(elementIsDisplayed(FoodsThatCauseHeartburnClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}

	public void clickOnHeartburnCausedbyDrink_accordion() throws Throwable {
		moveToElement(HeartburnCausedbyDrink);
		if (elementIsDisplayed(FoodsThatCauseHeartburn)) {
			clickElementUsingJavaScript(FoodsThatCauseHeartburn);
			Assert.assertTrue(elementIsDisplayed(EvenisActive));
			System.out.println("Eating and exercise is opened");
			implicitWait();
			clickElementUsingJavaScript(FoodsThatCauseHeartburn);
			visibilityOf(FoodsThatCauseHeartburnClose);
			Assert.assertTrue(elementIsDisplayed(FoodsThatCauseHeartburnClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}

	public void clickOnMedicationsandHeartburn_accordion() throws Throwable {
		moveToElement(MedicationsandHeartburn);
		if (elementIsDisplayed(MedicationsandHeartburn)) {
			clickElementUsingJavaScript(MedicationsandHeartburn);
			Assert.assertTrue(elementIsDisplayed(EvenisActive));
			System.out.println("Medications and Heartburn is opened");
			implicitWait();
			clickElementUsingJavaScript(MedicationsandHeartburn);
			visibilityOf(MedicationsandHeartburnClose);
			Assert.assertTrue(elementIsDisplayed(MedicationsandHeartburnClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}

	// moveToElement(MedicationsandHeartburn);
//	clickElementUsingJavaScript(MedicationsandHeartburn);
//	if(elementIsDisplayed(EvenisActive)) {
//		System.out.println("MedicationsandHeartburn is opened");
//		}
//	clickElementUsingJavaScript(MedicationsandHeartburn);
//	if(elementIsDisplayed(MedicationsandHeartburnClose)) {
//	System.out.println("MedicationsandHeartburn is closed");

	public void clickOnHeartburnDuringPregnancy_accordion() throws Throwable {
		moveToElement(HeartburnDuringPregnancy);
		if (elementIsDisplayed(HeartburnDuringPregnancy)) {
			clickElementUsingJavaScript(HeartburnDuringPregnancy);
			Assert.assertTrue(elementIsDisplayed(oddisActive));
			System.out.println("Heartburn During Pregnancy is opened");
			implicitWait();
			clickElementUsingJavaScript(HeartburnDuringPregnancy);
			visibilityOf(HeartburnDuringPregnancyClose);
			Assert.assertTrue(elementIsDisplayed(HeartburnDuringPregnancyClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}

		// moveToElement(HeartburnDuringPregnancy);
//	clickElementUsingJavaScript(HeartburnDuringPregnancy);
//	if(elementIsDisplayed(oddisActive)) {
//		System.out.println("HeartburnDuringPregnancy is opened");
//		}
//	clickElementUsingJavaScript(HeartburnDuringPregnancy);
//	if(elementIsDisplayed(HeartburnDuringPregnancyClose)) {
//	System.out.println("HeartburnDuringPregnancy is closed");
//	}
	}

	public void clickOnLifestyleCauses_accordion() throws Throwable {
		moveToElement(LifestyleCauses);
		if (elementIsDisplayed(LifestyleCauses)) {
			clickElementUsingJavaScript(LifestyleCauses);
			Assert.assertTrue(elementIsDisplayed(EvenisActive));
			System.out.println("Lifestyle Causes is opened");
			implicitWait();
			clickElementUsingJavaScript(LifestyleCauses);
			visibilityOf(LifestyleCausesClose);
			Assert.assertTrue(elementIsDisplayed(LifestyleCausesClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}
	}

	// moveToElement(LifestyleCauses);
//	clickElementUsingJavaScript(LifestyleCauses);
//	if(elementIsDisplayed(EvenisActive)) {
//		System.out.println("LifestyleCauses is opened");
//		}
//	clickElementUsingJavaScript(LifestyleCauses);
//	if(elementIsDisplayed(LifestyleCausesClose)) {
//	System.out.println("LifestyleCauses is closed");

	public void clickOnHiatalHernia_accordion() throws Throwable {
		moveToElement(HiatalHernia);
		if (elementIsDisplayed(HiatalHernia)) {
			clickElementUsingJavaScript(HiatalHernia);
			Assert.assertTrue(elementIsDisplayed(HiatalHerniaOpen));
			System.out.println("Hiatal Hernia is opened");
			implicitWait();
			clickElementUsingJavaScript(HiatalHernia);
			visibilityOf(HiatalHernia);
			Assert.assertTrue(elementIsDisplayed(HiatalHerniaClose));
		} else {
			System.out.println("Accordion is not active");
			Assert.assertTrue(false);
		}

		// moveToElement(HiatalHernia);
//	clickElementUsingJavaScript(HiatalHernia);
//	if(elementIsDisplayed(HiatalHerniaOpen)) {
//		System.out.println("HiatalHernia is opened");
//		}
//	clickElementUsingJavaScript(HiatalHernia);
//	if(elementIsDisplayed(HiatalHerniaClose)) {
//	System.out.println("HiatalHernia is closed");
//	}
	}

	public void clickOnShowReferences() throws Throwable {
		// moveToElement(Showreferences);
		clickElementUsingJavaScript(Showreferences);
		if (elementIsDisplayed(Hidereferences)) {
			System.out.println("Show references is clicked");
			clickElementUsingJavaScript(Hidereferences);
		}
		if (elementIsDisplayed(Showreferences)) {
			System.out.println("Hide references is clicked");
		}
	}

	public void clickOnHeartburnSymptoms() throws Throwable {
		// moveToElement(HeartburnSymptoms);
		clickElementUsingJavaScript(HeartburnSymptoms);

	}

	public void clickOnFindingRelief() throws Throwable {
		// moveToElement(FindingRelief);
		clickElementUsingJavaScript(FindingRelief);

	}

	public void clickOnTUMSwhilePregnant() throws Throwable {
		// moveToElement(TUMSwhilePregnant);
		clickElementUsingJavaScript(TUMSwhilePregnant);
	}

	public void clickOnWhatCausesHeartburnAChecklist() throws Throwable {
		// moveToElement(WhatCausesHeartburnAChecklist);
		clickElementUsingJavaScript(WhatCausesHeartburnAChecklist);

	}

	public void clickOnAcidRefluxvsGERD() throws Throwable {
		// moveToElement(AcidRefluxvsGERD);
		clickElementUsingJavaScript(AcidRefluxvsGERD);

	}

	public void clickOnTheDifferenceBetweenHeartburnIndigestion() throws Throwable {
		// moveToElement(TheDifferenceBetweenHeartburnIndigestion);
		clickElementUsingJavaScript(TheDifferenceBetweenHeartburnIndigestion);

	}

	public void clickOnWhatBehaviors() throws Throwable {
		// moveToElement(WhatBehaviors);
		clickElementUsingJavaScript(WhatBehaviors);

	}

	public void clickOnWhatFoodsauseHeartburn() throws Throwable {
		// moveToElement(WhatFoodsauseHeartburn);
		clickElementUsingJavaScript(WhatFoodsauseHeartburn);

	}

	public void clickOnWhatisGRED() throws Throwable {
		// moveToElement(WhatisGRED);
		clickElementUsingJavaScript(WhatisGRED);

	}

	public void clickOnupsetStomach() throws Throwable {
		// moveToElement(upsetStomach);
		clickElementUsingJavaScript(upsetStomach);

	}

	public void clickOnsevenSurprising() throws Throwable {
		// moveToElement(sevenSurprising);
		clickElementUsingJavaScript(sevenSurprising);

	}

	public void clickOnaGuidetoCommon() throws Throwable {
		// moveToElement(aGuidetoCommon);
		clickElementUsingJavaScript(aGuidetoCommon);

	}

	public void clickOnseeProducts() throws Throwable {
		// moveToElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);

	}

}