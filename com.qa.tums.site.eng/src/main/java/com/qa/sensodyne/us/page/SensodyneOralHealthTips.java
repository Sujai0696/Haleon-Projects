package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneOralHealthTips extends BaseClass{
	public SensodyneOralHealthTips() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//a[text()=1]")
	private static WebElement CarousalOneActive;
	
	@FindBy(xpath = "(//a[@href='/en-us/oral-health-tips/science-of-sensodyne/engineered-for-speed/'])[3]")
	private static WebElement CarousalOneBanner;
	
	@FindBy(xpath = "//a[text()=2]")
	private static WebElement CarousalTwo;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//a[text()=2]")
	private static WebElement CarousalTwoActive;
	
	@FindBy(xpath = "(//a[@href='/en-us/oral-health-tips/managing-sensitive-teeth/sensitivity-to-cold/'])[3]")
	private static WebElement CarousalTwoBanner;
	
	@FindBy(xpath = "//a[text()=3]")
	private static WebElement CarousalThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//a[text()=3]")
	private static WebElement CarousalThreeActive;
	
	@FindBy(xpath = "(//a[@href='/en-us/oral-health-tips/whitening-sensitive-teeth/home-whitening/'])[3]")
	private static WebElement CarousalThreeBanner;
	
	@FindBy(xpath = "//a[@title='All Articles' and @class='active']")
	private static WebElement AllArticleTab;
	
	@FindBy(xpath = "//a[@aria-describedby='lm01']")
	private static WebElement TwoBenefitsLearnMore;
	
	@FindBy(xpath = "//a[@aria-describedby='lm02']")
	private static WebElement TheImportanceOfGumHealthFindOutWhy;
	
	@FindBy(xpath = "//a[@aria-describedby='lm03']")
	private static WebElement HowToTreatGingivitisLearnMore;
	
	@FindBy(xpath = "//a[@aria-describedby='lm04']")
	private static WebElement BleedingGumsAndSensitivityLearnMore;
	
	@FindBy(xpath = "//a[@aria-label='Should You Rinse After Brushing?-Find Out']")
	private static WebElement ShouldYouRinseAfterBrushingFindOut;
	
	@FindBy(xpath = "//a[@aria-describedby='lm06']")
	private static WebElement WhiteningHome;
	
	@FindBy(xpath = "//a[@aria-describedby='lm07']")
	private static WebElement TipsForToothCheckThemOut;
	
	@FindBy(xpath = "//a[text()='The Science Behind Sensodyne Rapid Relief Toothpaste']")
	private static WebElement TheScienceBehindSensodyne;
	
	@FindBy(xpath = "//a[text()='6 Tips for Whitening Sensitive Teeth']")
	private static WebElement SixTipsForWhitening;
	
	@FindBy(xpath = "//a[text()='Get the Truth']")
	private static WebElement GetTheTruth;
	
	@FindBy(xpath = "//a[text()='Health Issues To Address Right Away']")
	private static WebElement HealthIssuesToAddress;
	
	@FindBy(xpath = "//a[text()='Unusual Resolutions To Make This Year']")
	private static WebElement UnusualResolutionsToMakeThisYear;
	
	@FindBy(xpath = "//a[text()='Is It a Cavity or Sensitive Teeth?']")
	private static WebElement IsItACavityOrSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Whitening Products and Their Impact on Sensitive Teeth']")
	private static WebElement WhiteningProductsAndTheirImpactOnSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Ingredients and How They Work']")
	private static WebElement SensodyneTrueWhiteIngredients;
	
	@FindBy(xpath = "//a[text()='Sensodyne or Pronamel: Which Toothpaste Is for You?']")
	private static WebElement SensodyneorPronamel;
	
	@FindBy(xpath = "//h3//a[text()='Read Our Tips']")
	private static WebElement HowToDealWithToothSensitivity;
	
	@FindBy(xpath = "//a[@aria-describedby='lm014']")
	private static WebElement ThatShockofPainCouldBeTooth;
	
	@FindBy(xpath = "//a[@aria-label='Sensitivity After a Trip to the Dentist-Learn More']")
	private static WebElement SensitivityAfterATrip;
	
	@FindBy(xpath = "//a[text()='Becoming Fast: Training for Speed']")
	private static WebElement BecomingFastTrainingForSpeed;
	
	@FindBy(xpath = "//a[text()='Speed of Sensation']")
	private static WebElement SpeedofSensation;
	
	@FindBy(xpath = "//a[text()='Get Helpful Tips']")
	private static WebElement GetHelpfulTips;
	
	@FindBy(xpath = "//a[text()='Ski Gear: Science, Style, and Speed']")
	private static WebElement SkiGearScienceStyleAndSpeed;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be a Bad Thing?']")
	private static WebElement CanHavingSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Should You Change Your Toothpaste Brand Over Time?']")
	private static WebElement ShouldYouChangeYour;
	
	@FindBy(xpath = "//a[text()='Do I Need To Floss?']")
	private static WebElement DoINeedToFloss;
	
	@FindBy(xpath = "//a[text()='Can I Brush My Teeth Too Much?']")
	private static WebElement CanIBrushMyTeethTooMuch;
	
	@FindBy(xpath = "//a[text()='Fall Treats and Your Oral Health']")
	private static WebElement FallTreatsAndYourOralHealth;
	
	@FindBy(xpath = "//a[text()='Oral Health Tips We Should All Be Following']")
	private static WebElement OralHealthTipsWeShouldAllBeFollowing;
	
	@FindBy(xpath = "//a[text()='Ways Holiday Stress Affects Your Body']")
	private static WebElement WaysHolidayStressAffectsYourBody;
	
	@FindBy(xpath = "//a[text()='What To Do If Teeth Hurt Post-Filling']")
	private static WebElement WhatToDoIfTeethHurtPostFilling;
	
	@FindBy(xpath = "//a[text()='What To Do About Tooth Sensitivity']")
	private static WebElement WhatToDoAboutToothSensitivity;
	
	@FindBy(xpath = "//a[text()='My Teeth Hurt; What Should I Do?']")
	private static WebElement MyTeethHurtWhatShoulIDo;
	
	@FindBy(xpath = "//a[text()='Are Whitening Kits Hurting My Teeth?']")
	private static WebElement AreWhiteningKitsHurtingMyTeeth;
	
	@FindBy(xpath = "//a[text()='A Dentist’s Tips on Flossing']")
	private static WebElement ADentistTipOnFlossing;
	
	@FindBy(xpath = "//a[text()='Things to Say to Increase Positivity']")
	private static WebElement ThingsToSayToIncreasePositivity;
	
	@FindBy(xpath = "//a[text()='What I Decided to Do About My Tooth Sensitivity']")
	private static WebElement WhatIDecidedToDoAboutMyToothSensitivity;
	
	@FindBy(xpath = "//a[text()='3 Nighttime Rituals to Reduce Stress']")
	private static WebElement ThreeNighttimeRitualsToReduceStress;
	
	@FindBy(xpath = "//a[text()='Do Your Teeth Hurt When It’s Cold Out?']")
	private static WebElement DoYourTeethHurtWhenItColdOut;
	
	@FindBy(xpath = "//a[text()='What To Know About Sensitive Teeth']")
	private static WebElement WhatToKnowAboutSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement CanYouBrushYourTeethTooHard;
	
	@FindBy(xpath = "//a[text()='How Long Should You Brush Your Teeth']")
	private static WebElement HowLongShouldYouBrushYourTeeth;
	
	@FindBy(xpath = "//a[text()='Delicious Fall Soup Recipes']")
	private static WebElement DeliciousFallSoupRecipes;
	
	@FindBy(xpath = "//a[text()='How to Remove Tartar from Teeth']")
	private static WebElement HowToRemoveTartarFromTeeth;
	
	@FindBy(xpath = "//a[text()='How to Remove Plaque from Teeth']")
	private static WebElement HowToRemovePlaquefromTeeth;
	
	@FindBy(xpath = "//a[text()='Find the Right Toothpaste']")
	private static WebElement FindTheRightToothpaste;
	
	public void clickCookieBtn() throws Exception {
		elementToBeClickable(cookieBtn);
		try {
			if (cookieBtn.isDisplayed()) {
				clickElementUsingJavaScript(cookieBtn);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickGigyaForm() throws Exception {
		elementToBeClickable(gigyaForm);
		try {
			if (gigyaForm.isDisplayed()) {
				clickElementUsingJavaScript(gigyaForm);
			}
		} catch (NoSuchElementException e) {

		}
	}

	public void clickFirstCaraousalBanner() throws Exception{
		visibilityOf(CarousalOneActive);
		clickElementUsingJavaScript(CarousalOneBanner);
	}
	public void clickSecondCaraousal() throws Exception{
		moveToElement(CarousalTwo);
		clickElementUsingJavaScript(CarousalTwo);
		visibilityOf(CarousalTwoActive);
		System.out.println("Clicked on 2nd Carousal");
		clickElementUsingJavaScript(CarousalTwoBanner);
	}
	public void clickThirdCaraousal() throws Exception{
		moveToElement(CarousalThree);
		clickElementUsingJavaScript(CarousalThree);
		visibilityOf(CarousalThreeActive);
		System.out.println("Clicked on 2nd Carousal");
		clickElementUsingJavaScript(CarousalThreeBanner);
	}
	
	public void clickTwoBenefitsLearnMore() throws Exception {
		moveToElement(TwoBenefitsLearnMore);
		clickElementUsingJavaScript(TwoBenefitsLearnMore);
	}
	public void clickTheImportanceOfGumHealthFindOutWhy() throws Exception {
		moveToElement(TheImportanceOfGumHealthFindOutWhy);
		clickElementUsingJavaScript(TheImportanceOfGumHealthFindOutWhy);
	}
	public void clickHowToTreatGingivitisLearnMore() throws Exception {
		moveToElement(HowToTreatGingivitisLearnMore);
		clickElementUsingJavaScript(HowToTreatGingivitisLearnMore);
	}
	public void clickBleedingGumsAndSensitivityLearnMore() throws Exception {
		moveToElement(BleedingGumsAndSensitivityLearnMore);
		clickElementUsingJavaScript(BleedingGumsAndSensitivityLearnMore);
	}
	public void clickShouldYouRinseAfterBrushingFindOut() throws Exception {
		moveToElement(ShouldYouRinseAfterBrushingFindOut);
		clickElementUsingJavaScript(ShouldYouRinseAfterBrushingFindOut);
	}
	public void clickWhiteningHome() throws Exception {
		moveToElement(WhiteningHome);
		clickElementUsingJavaScript(WhiteningHome);
	}
	public void clickTipsForToothCheckThemOut() throws Exception {
		moveToElement(TipsForToothCheckThemOut);
		clickElementUsingJavaScript(TipsForToothCheckThemOut);
	}
	public void clickTheScienceBehindSensodyne() throws Exception {
		moveToElement(TheScienceBehindSensodyne);
		clickElementUsingJavaScript(TheScienceBehindSensodyne);
	}
	public void clickSixTipsForWhitening() throws Exception {
		moveToElement(SixTipsForWhitening);
		clickElementUsingJavaScript(SixTipsForWhitening);
	}
	public void clickGetTheTruth() throws Exception {
		moveToElement(GetTheTruth);
		clickElementUsingJavaScript(GetTheTruth);
	}
	public void clickHealthIssuesToAddress() throws Exception {
		moveToElement(HealthIssuesToAddress);
		clickElementUsingJavaScript(HealthIssuesToAddress);
	}
	public void clickUnusualResolutionsToMakeThisYear() throws Exception {
		moveToElement(UnusualResolutionsToMakeThisYear);
		clickElementUsingJavaScript(UnusualResolutionsToMakeThisYear);
	}
	public void clickIsItACavityOrSensitiveTeeth() throws Exception {
		moveToElement(IsItACavityOrSensitiveTeeth);
		clickElementUsingJavaScript(IsItACavityOrSensitiveTeeth);
	}
	public void clickWhiteningProductsAndTheirImpactOnSensitiveTeeth() throws Exception {
		moveToElement(WhiteningProductsAndTheirImpactOnSensitiveTeeth);
		clickElementUsingJavaScript(WhiteningProductsAndTheirImpactOnSensitiveTeeth);
	}
	public void clickSensodyneTrueWhiteIngredients() throws Exception {
		moveToElement(SensodyneTrueWhiteIngredients);
		clickElementUsingJavaScript(SensodyneTrueWhiteIngredients);
	}
	public void clickSensodyneorPronamel() throws Exception {
		moveToElement(SensodyneorPronamel);
		clickElementUsingJavaScript(SensodyneorPronamel);
	}
	public void clickHowToDealWithToothSensitivity() throws Exception {
		moveToElement(HowToDealWithToothSensitivity);
		clickElementUsingJavaScript(HowToDealWithToothSensitivity);
	}
	public void clickThatShockofPainCouldBeTooth() throws Exception {
		moveToElement(ThatShockofPainCouldBeTooth);
		clickElementUsingJavaScript(ThatShockofPainCouldBeTooth);
	}
	public void clickSensitivityAfterATrip() throws Exception {
		moveToElement(SensitivityAfterATrip);
		clickElementUsingJavaScript(SensitivityAfterATrip);
	}
	public void clickBecomingFastTrainingForSpeed() throws Exception {
		moveToElement(BecomingFastTrainingForSpeed);
		clickElementUsingJavaScript(BecomingFastTrainingForSpeed);
	}
	public void clickSpeedofSensation() throws Exception {
		moveToElement(SpeedofSensation);
		clickElementUsingJavaScript(SpeedofSensation);
	}
	public void clickGetHelpfulTips() throws Exception {
		moveToElement(GetHelpfulTips);
		clickElementUsingJavaScript(GetHelpfulTips);
	}
	public void clickSkiGearScienceStyleAndSpeed() throws Exception {
		moveToElement(SkiGearScienceStyleAndSpeed);
		clickElementUsingJavaScript(SkiGearScienceStyleAndSpeed);
	}
	public void clickCanHavingSensitiveTeeth() throws Exception {
		moveToElement(CanHavingSensitiveTeeth);
		clickElementUsingJavaScript(CanHavingSensitiveTeeth);
	}
	public void clickShouldYouChangeYour() throws Exception {
		moveToElement(ShouldYouChangeYour);
		clickElementUsingJavaScript(ShouldYouChangeYour);
	}
	public void clickDoINeedToFloss() throws Exception {
		moveToElement(DoINeedToFloss);
		clickElementUsingJavaScript(DoINeedToFloss);
	}
	public void clickCanIBrushMyTeethTooMuch() throws Exception {
		moveToElement(CanIBrushMyTeethTooMuch);
		clickElementUsingJavaScript(CanIBrushMyTeethTooMuch);
	}
	public void clickFallTreatsAndYourOralHealth() throws Exception {
		moveToElement(FallTreatsAndYourOralHealth);
		clickElementUsingJavaScript(FallTreatsAndYourOralHealth);
	}
	public void clickOralHealthTipsWeShouldAllBeFollowing() throws Exception {
		moveToElement(OralHealthTipsWeShouldAllBeFollowing);
		clickElementUsingJavaScript(OralHealthTipsWeShouldAllBeFollowing);
	}
	public void clickWaysHolidayStressAffectsYourBody() throws Exception {
		moveToElement(WaysHolidayStressAffectsYourBody);
		clickElementUsingJavaScript(WaysHolidayStressAffectsYourBody);
	}
	public void clickWhatToDoIfTeethHurtPostFilling() throws Exception {
		moveToElement(WhatToDoIfTeethHurtPostFilling);
		clickElementUsingJavaScript(WhatToDoIfTeethHurtPostFilling);
	}
	public void clickWhatToDoAboutToothSensitivity() throws Exception {
		moveToElement(WhatToDoAboutToothSensitivity);
		clickElementUsingJavaScript(WhatToDoAboutToothSensitivity);
	}
	public void clickMyTeethHurtWhatShoulIDo() throws Exception {
		moveToElement(MyTeethHurtWhatShoulIDo);
		clickElementUsingJavaScript(MyTeethHurtWhatShoulIDo);
	}
	public void clickAreWhiteningKitsHurtingMyTeeth() throws Exception {
		moveToElement(AreWhiteningKitsHurtingMyTeeth);
		clickElementUsingJavaScript(AreWhiteningKitsHurtingMyTeeth);
	}
	public void clickADentistTipOnFlossing() throws Exception {
		moveToElement(ADentistTipOnFlossing);
		clickElementUsingJavaScript(ADentistTipOnFlossing);
	}
	public void clickThingsToSayToIncreasePositivity() throws Exception {
		moveToElement(ThingsToSayToIncreasePositivity);
		clickElementUsingJavaScript(ThingsToSayToIncreasePositivity);
	}
	public void clickWhatIDecidedToDoAboutMyToothSensitivity() throws Exception {
		moveToElement(WhatIDecidedToDoAboutMyToothSensitivity);
		clickElementUsingJavaScript(WhatIDecidedToDoAboutMyToothSensitivity);
	}
	public void clickThreeNighttimeRitualsToReduceStress() throws Exception {
		moveToElement(ThreeNighttimeRitualsToReduceStress);
		clickElementUsingJavaScript(ThreeNighttimeRitualsToReduceStress);
	}
	public void clickDoYourTeethHurtWhenItColdOut() throws Exception {
		moveToElement(DoYourTeethHurtWhenItColdOut);
		clickElementUsingJavaScript(DoYourTeethHurtWhenItColdOut);
	}
	public void clickWhatToKnowAboutSensitiveTeeth() throws Exception {
		moveToElement(WhatToKnowAboutSensitiveTeeth);
		clickElementUsingJavaScript(WhatToKnowAboutSensitiveTeeth);
	}
	public void clickCanYouBrushYourTeethTooHard() throws Exception {
		moveToElement(CanYouBrushYourTeethTooHard);
		clickElementUsingJavaScript(CanYouBrushYourTeethTooHard);
	}
	public void clickHowLongShouldYouBrushYourTeeth() throws Exception {
		moveToElement(HowLongShouldYouBrushYourTeeth);
		clickElementUsingJavaScript(HowLongShouldYouBrushYourTeeth);
	}
	public void clickDeliciousFallSoupRecipes() throws Exception {
		moveToElement(DeliciousFallSoupRecipes);
		clickElementUsingJavaScript(DeliciousFallSoupRecipes);
	}
	public void clickHowToRemoveTartarFromTeeth() throws Exception {
		moveToElement(HowToRemoveTartarFromTeeth);
		clickElementUsingJavaScript(HowToRemoveTartarFromTeeth);
	}
	public void clickHowToRemovePlaquefromTeeth() throws Exception {
		moveToElement(HowToRemovePlaquefromTeeth);
		clickElementUsingJavaScript(HowToRemovePlaquefromTeeth);
	}
	public void clickFindTheRightToothpaste() throws Exception {
		moveToElement(FindTheRightToothpaste);
		clickElementUsingJavaScript(FindTheRightToothpaste);
	}

}
