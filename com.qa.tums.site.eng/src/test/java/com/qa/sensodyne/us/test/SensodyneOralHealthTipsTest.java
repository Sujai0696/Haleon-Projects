package com.qa.sensodyne.us.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.us.page.SensodyneOralHealthTips;

public class SensodyneOralHealthTipsTest extends BaseClass{
	SensodyneOralHealthTips ssy;
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyneConfig.properties").getProperty("browser"));
		launchTwoUrl();	
	}
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneOralHealthTipsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyneConfig.properties").getProperty("SensodyneOralHealthTipsLiveUrl"));
	}
	@Test(priority = 1, enabled = true)
	private void cookieButton() throws Exception {
	ssy =new SensodyneOralHealthTips();
	switchingTab(firstTab);
	ssy.clickCookieBtn();
	ssy.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Preprod URL");
	switchingTab(secondTab);
	ssy.clickCookieBtn();
	ssy.clickGigyaForm();
	System.out.println("Cookie Button and Gigya Form clicked successfully in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyTwoBenefitsLearnMore() throws Exception{
		switchingTab(firstTab);
		ssy.clickTwoBenefitsLearnMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickTwoBenefitsLearnMore();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 3)
	private void verifyTheImportanceOfGumHealthFindOutWhy() throws Exception{
		switchingTab(firstTab);
		ssy.clickTheImportanceOfGumHealthFindOutWhy();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickTheImportanceOfGumHealthFindOutWhy();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 4)
	private void verifyHowToTreatGingivitisLearnMore() throws Exception{
		switchingTab(firstTab);
		ssy.clickHowToTreatGingivitisLearnMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHowToTreatGingivitisLearnMore();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 5)
	private void verifyBleedingGumsAndSensitivityLearnMore() throws Exception{
		switchingTab(firstTab);
		ssy.clickBleedingGumsAndSensitivityLearnMore();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickBleedingGumsAndSensitivityLearnMore();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 6)
	private void verifyShouldYouRinseAfterBrushingFindOut() throws Exception{
		switchingTab(firstTab);
		ssy.clickShouldYouRinseAfterBrushingFindOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickShouldYouRinseAfterBrushingFindOut();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 7)
	private void verifyWhiteningHome() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhiteningHome();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhiteningHome();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 8)
	private void verifyTipsForToothCheckThemOut() throws Exception{
		switchingTab(firstTab);
		ssy.clickTipsForToothCheckThemOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickTipsForToothCheckThemOut();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 9)
	private void verifyTheScienceBehindSensodyne() throws Exception{
		switchingTab(firstTab);
		ssy.clickTheScienceBehindSensodyne();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickTheScienceBehindSensodyne();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 10)
	private void verifySixTipsForWhitening() throws Exception{
		switchingTab(firstTab);
		ssy.clickSixTipsForWhitening();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSixTipsForWhitening();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 11)
	private void verifyGetTheTruth() throws Exception{
		switchingTab(firstTab);
		ssy.clickGetTheTruth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickGetTheTruth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 12)
	private void verifyHealthIssuesToAddress() throws Exception{
		switchingTab(firstTab);
		ssy.clickHealthIssuesToAddress();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHealthIssuesToAddress();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 13)
	private void verifyUnusualResolutionsToMakeThisYear() throws Exception{
		switchingTab(firstTab);
		ssy.clickUnusualResolutionsToMakeThisYear();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickUnusualResolutionsToMakeThisYear();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 14)
	private void verifyIsItACavityOrSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickIsItACavityOrSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickIsItACavityOrSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 15)
	private void verifyWhiteningProductsAndTheirImpactOnSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhiteningProductsAndTheirImpactOnSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhiteningProductsAndTheirImpactOnSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 16)
	private void verifySensodyneTrueWhiteIngredients() throws Exception{
		switchingTab(firstTab);
		ssy.clickSensodyneTrueWhiteIngredients();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSensodyneTrueWhiteIngredients();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 17)
	private void verifySensodyneorPronamel() throws Exception{
		switchingTab(firstTab);
		ssy.clickSensodyneorPronamel();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSensodyneorPronamel();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 18)
	private void verifyHowToDealWithToothSensitivity() throws Exception{
		switchingTab(firstTab);
		ssy.clickHowToDealWithToothSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHowToDealWithToothSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 19)
	private void verifyThatShockofPainCouldBeTooth() throws Exception{
		switchingTab(firstTab);
		ssy.clickThatShockofPainCouldBeTooth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickThatShockofPainCouldBeTooth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 20)
	private void verifySensitivityAfterATrip() throws Exception{
		switchingTab(firstTab);
		ssy.clickSensitivityAfterATrip();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSensitivityAfterATrip();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 21)
	private void verifyBecomingFastTrainingForSpeed() throws Exception{
		switchingTab(firstTab);
		ssy.clickBecomingFastTrainingForSpeed();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickBecomingFastTrainingForSpeed();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 22)
	private void verifySpeedofSensation() throws Exception{
		switchingTab(firstTab);
		ssy.clickSpeedofSensation();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSpeedofSensation();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 23)
	private void verifyGetHelpfulTips() throws Exception{
		switchingTab(firstTab);
		ssy.clickGetHelpfulTips();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickGetHelpfulTips();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 24)
	private void verifySkiGearScienceStyleAndSpeed() throws Exception{
		switchingTab(firstTab);
		ssy.clickSkiGearScienceStyleAndSpeed();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickSkiGearScienceStyleAndSpeed();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 25)
	private void verifyCanHavingSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickCanHavingSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickCanHavingSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 26)
	private void verifyShouldYouChangeYour() throws Exception{
		switchingTab(firstTab);
		ssy.clickShouldYouChangeYour();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickShouldYouChangeYour();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 27)
	private void verifyDoINeedToFloss() throws Exception{
		switchingTab(firstTab);
		ssy.clickDoINeedToFloss();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickDoINeedToFloss();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 28)
	private void verifyCanIBrushMyTeethTooMuch() throws Exception{
		switchingTab(firstTab);
		ssy.clickCanIBrushMyTeethTooMuch();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickCanIBrushMyTeethTooMuch();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 29)
	private void verifyFallTreatsAndYourOralHealth() throws Exception{
		switchingTab(firstTab);
		ssy.clickFallTreatsAndYourOralHealth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickFallTreatsAndYourOralHealth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 30)
	private void verifyOralHealthTipsWeShouldAllBeFollowing() throws Exception{
		switchingTab(firstTab);
		ssy.clickOralHealthTipsWeShouldAllBeFollowing();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickOralHealthTipsWeShouldAllBeFollowing();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}

	@Test(priority = 31)
	private void verifyWaysHolidayStressAffectsYourBody() throws Exception{
		switchingTab(firstTab);
		ssy.clickWaysHolidayStressAffectsYourBody();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWaysHolidayStressAffectsYourBody();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 32)
	private void verifyWhatToDoIfTeethHurtPostFilling() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhatToDoIfTeethHurtPostFilling();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhatToDoIfTeethHurtPostFilling();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 33)
	private void verifyWhatToDoAboutToothSensitivity() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhatToDoAboutToothSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhatToDoAboutToothSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 34)
	private void verifyMyTeethHurtWhatShoulIDo() throws Exception{
		switchingTab(firstTab);
		ssy.clickMyTeethHurtWhatShoulIDo();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickMyTeethHurtWhatShoulIDo();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 35)
	private void verifyAreWhiteningKitsHurtingMyTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickAreWhiteningKitsHurtingMyTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickAreWhiteningKitsHurtingMyTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 36)
	private void verifyADentistTipOnFlossing() throws Exception{
		switchingTab(firstTab);
		ssy.clickADentistTipOnFlossing();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickADentistTipOnFlossing();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 37)
	private void verifyThingsToSayToIncreasePositivity() throws Exception{
		switchingTab(firstTab);
		ssy.clickThingsToSayToIncreasePositivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickThingsToSayToIncreasePositivity();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 38)
	private void verifyWhatIDecidedToDoAboutMyToothSensitivity() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhatIDecidedToDoAboutMyToothSensitivity();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhatIDecidedToDoAboutMyToothSensitivity();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 39)
	private void verifyThreeNighttimeRitualsToReduceStress() throws Exception{
		switchingTab(firstTab);
		ssy.clickThreeNighttimeRitualsToReduceStress();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickThreeNighttimeRitualsToReduceStress();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 40)
	private void verifyDoYourTeethHurtWhenItColdOut() throws Exception{
		switchingTab(firstTab);
		ssy.clickDoYourTeethHurtWhenItColdOut();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickDoYourTeethHurtWhenItColdOut();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority =41)
	private void verifyWhatToKnowAboutSensitiveTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickWhatToKnowAboutSensitiveTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickWhatToKnowAboutSensitiveTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 42)
	private void verifyCanYouBrushYourTeethTooHard() throws Exception{
		switchingTab(firstTab);
		ssy.clickCanYouBrushYourTeethTooHard();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickCanYouBrushYourTeethTooHard();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 43)
	private void verifyHowLongShouldYouBrushYourTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickHowLongShouldYouBrushYourTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHowLongShouldYouBrushYourTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 44)
	private void verifyDeliciousFallSoupRecipes() throws Exception{
		switchingTab(firstTab);
		ssy.clickDeliciousFallSoupRecipes();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickDeliciousFallSoupRecipes();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 45)
	private void verifyHowToRemoveTartarFromTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickHowToRemoveTartarFromTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHowToRemoveTartarFromTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 46)
	private void verifyHowToRemovePlaquefromTeeth() throws Exception{
		switchingTab(firstTab);
		ssy.clickHowToRemovePlaquefromTeeth();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickHowToRemovePlaquefromTeeth();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	@Test(priority = 47)
	private void verifyFindTheRightToothpaste() throws Exception{
		switchingTab(firstTab);
		ssy.clickFindTheRightToothpaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne",1, 0));
		switchingTab(secondTab);
		ssy.clickFindTheRightToothpaste();
		String liveUrl = compareUrl(excelRead("Sensodyne",1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for related article One :"+compareTwoText);
	}
	

}
