package com.qa.preph.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.preph.pages.PrephFrequentlyAskedQuestionsPage;

public class PrephFrequentlyAskedQuestionsTest extends BaseClass{
	
	PrephFrequentlyAskedQuestionsPage faq;
	
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		launchTwoUrl();
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		faq = new PrephFrequentlyAskedQuestionsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("frequentlyAskedQuestionsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("preph_Config.properties").getProperty("frequentlyAskedQuestionsLiveUrl"));
	}

	
	@Test(priority = 0)
	private void cookieButton() throws Exception {
		switchingTab(firstTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickCookieBtn();
		System.out.println("Cookie Button successfully verified in the Live URL");
	}
	
	@Test(priority = 2)
	private void verifyHemorrhoidsAccOne() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccTwo();
		System.out.println("Hemorrhoids Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccTwo();
		System.out.println("Hemorrhoids Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifyHemorrhoidsAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccThree();
		System.out.println("Hemorrhoids Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccThree();
		System.out.println("Hemorrhoids Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyHemorrhoidsAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccFour();
		System.out.println("Hemorrhoids Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccFour();
		System.out.println("Hemorrhoids Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyHemorrhoidsAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccFive();
		System.out.println("Hemorrhoids Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccFive();
		System.out.println("Hemorrhoids Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyHemorrhoidsAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccSix();
		System.out.println("Hemorrhoids Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccSix();
		System.out.println("Hemorrhoids Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyHemorrhoidsAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccSeven();
		System.out.println("Hemorrhoids Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccSeven();
		System.out.println("Hemorrhoids Accordon Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyHemorrhoidsAccEight() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccEight();
		System.out.println("Hemorrhoids Accordon Eight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccEight();
		System.out.println("Hemorrhoids Accordon Eight successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyHemorrhoidsAccNine() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccNine();
		System.out.println("Hemorrhoids Accordon Nine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccNine();
		System.out.println("Hemorrhoids Accordon Nine successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyHemorrhoidsAccTen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccTen();
		System.out.println("Hemorrhoids Accordon Ten successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccTen();
		System.out.println("Hemorrhoids Accordon Ten successfully verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyHemorrhoidsAccEleven() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccEleven();
		System.out.println("Hemorrhoids Accordon Eleven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccEleven();
		System.out.println("Hemorrhoids Accordon Eleven successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyHemorrhoidsAccTweleve() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccTweleve();
		System.out.println("Hemorrhoids Accordon Tweleve successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccTweleve();
		System.out.println("Hemorrhoids Accordon Tweleve successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyHemorrhoidsAccThirteen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccThirteen();
		System.out.println("Hemorrhoids Accordon Thirteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccThirteen();
		System.out.println("Hemorrhoids Accordon Thirteen successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifyHemorrhoidsAccFourteen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccFourteen();
		System.out.println("Hemorrhoids Accordon Fourteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccFourteen();
		System.out.println("Hemorrhoids Accordon Fourteen successfully verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifyHemorrhoidsAccFifteen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccFifteen();
		System.out.println("Hemorrhoids Accordon Fifteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccFifteen();
		System.out.println("Hemorrhoids Accordon Fifteen successfully verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifyHemorrhoidsAccSixteen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccSixteen();
		System.out.println("Hemorrhoids Accordon Sixteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccSixteen();
		System.out.println("Hemorrhoids Accordon Sixteen successfully verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifyHemorrhoidsAccSeventeen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccSeventeen();
		System.out.println("Hemorrhoids Accordon Seventeen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccSeventeen();
		System.out.println("Hemorrhoids Accordon Seventeen successfully verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifyHemorrhoidsAccEighteen() throws Exception{
		switchingTab(firstTab);
		faq.clickHemorrhoidsAccEighteen();
		System.out.println("Hemorrhoids Accordon Eighteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHemorrhoidsAccEighteen();
		System.out.println("Hemorrhoids Accordon Eighteen successfully verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifyProductsAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwo();
		System.out.println("Products Accordon Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwo();
		System.out.println("Products Accordon Two successfully verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifyProductsAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThree();
		System.out.println("Products Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThree();
		System.out.println("Products Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 21)
	private void verifyProductsAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccFour();
		System.out.println("Products Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccFour();
		System.out.println("Products Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 22)
	private void verifyProductsAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccFive();
		System.out.println("Products Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccFive();
		System.out.println("Products Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 23)
	private void verifyProductsAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccSix();
		System.out.println("Products Accordon SIx successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccSix();
		System.out.println("Products Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 24)
	private void verifyProductsAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccSeven();
		System.out.println("Products Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccSeven();
		System.out.println("Products Accordon Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 25)
	private void verifyProductsAccEight() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccEight();
		System.out.println("Products Accordon Eight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccEight();
		System.out.println("Products Accordon Eight successfully verified in the Live URL");
	}
	
	@Test(priority = 26)
	private void verifyProductsAccNine() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccNine();
		System.out.println("Products Accordon Nine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccNine();
		System.out.println("Products Accordon Nine successfully verified in the Live URL");
	}
	
	@Test(priority = 27)
	private void verifyProductsAccTen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTen();
		System.out.println("Products Accordon Ten successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTen();
		System.out.println("Products Accordon Ten successfully verified in the Live URL");
	}
	
	@Test(priority = 28)
	private void verifyProductsAccEleven() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccEleven();
		System.out.println("Products Accordon Eleven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccEleven();
		System.out.println("Products Accordon Eleven successfully verified in the Live URL");
	}
	
	@Test(priority = 29)
	private void verifyProductsAccTweleve() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTweleve();
		System.out.println("Products Accordon Tweleve successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTweleve();
		System.out.println("Products Accordon Tweleve successfully verified in the Live URL");
	}
	
	@Test(priority = 30)
	private void verifyProductsAccThirteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirteen();
		System.out.println("Products Accordon Thirteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirteen();
		System.out.println("Products Accordon Thirteen successfully verified in the Live URL");
	}
	
	@Test(priority = 31)
	private void verifyProductsAccFourteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccFourteen();
		System.out.println("Products Accordon Fourteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccFourteen();
		System.out.println("Products Accordon Fourteen successfully verified in the Live URL");
	}
	
	@Test(priority = 32)
	private void verifyProductsAccFifteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccFifteen();
		System.out.println("Products Accordon Fifteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccFifteen();
		System.out.println("Products Accordon Fifteen successfully verified in the Live URL");
	}
	
	@Test(priority = 33)
	private void verifyProductsAccSixteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccSixteen();
		System.out.println("Products Accordon Sixteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccSixteen();
		System.out.println("Products Accordon Sixteen successfully verified in the Live URL");
	}
	
	@Test(priority = 34)
	private void verifyProductsAccSeventeen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccSeventeen();
		System.out.println("Products Accordon Seventeen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccSeventeen();
		System.out.println("Products Accordon Seventeen successfully verified in the Live URL");
	}
	
	@Test(priority = 35)
	private void verifyProductsAccEighteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccEighteen();
		System.out.println("Products Accordon Eighteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccEighteen();
		System.out.println("Products Accordon Eighteen successfully verified in the Live URL");
	}
	
	@Test(priority = 36)
	private void verifyProductsAccNineteen() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccNineteen();
		System.out.println("Products Accordon Nineteen successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccNineteen();
		System.out.println("Products Accordon Nineteen successfully verified in the Live URL");
	}
	
	@Test(priority = 37)
	private void verifyProductsAccTwenty() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwenty();
		System.out.println("Products Accordon Twenty successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwenty();
		System.out.println("Products Accordon Twenty successfully verified in the Live URL");
	}
	
	@Test(priority = 38)
	private void verifyProductsAccTwentyOne() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyOne();
		System.out.println("Products Accordon TwentyOne successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyOne();
		System.out.println("Products Accordon TwentyOne successfully verified in the Live URL");
	}
	
	@Test(priority = 39)
	private void verifyProductsAccTwentyTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyTwo();
		System.out.println("Products Accordon TwentyTwo successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyTwo();
		System.out.println("Products Accordon TwentyTwo successfully verified in the Live URL");
	}
	
	@Test(priority = 40)
	private void verifyProductsAccTwentyThree() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyThree();
		System.out.println("Products Accordon TwentyThree successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyThree();
		System.out.println("Products Accordon TwentyThree successfully verified in the Live URL");
	}
	
	@Test(priority = 41)
	private void verifyProductsAccTwentyFour() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyFour();
		System.out.println("Products Accordon TwentyFour successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyFour();
		System.out.println("Products Accordon TwentyFour successfully verified in the Live URL");
	}
	
	@Test(priority = 42)
	private void verifyProductsAccTwentyFive() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyFive();
		System.out.println("Products Accordon TwentyFive successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyFive();
		System.out.println("Products Accordon TwentyFive successfully verified in the Live URL");
	}
	
	@Test(priority = 43)
	private void verifyProductsAccTwentySix() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentySix();
		System.out.println("Products Accordon TwentySix successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentySix();
		System.out.println("Products Accordon TwentySix successfully verified in the Live URL");
	}
	
	@Test(priority = 44)
	private void verifyProductsAccTwentySeven() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentySeven();
		System.out.println("Products Accordon TwentySeven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentySeven();
		System.out.println("Products Accordon TwentySeven successfully verified in the Live URL");
	}
	
	@Test(priority = 45)
	private void verifyProductsAccTwentyEight() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyEight();
		System.out.println("Products Accordon TwentyEight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyEight();
		System.out.println("Products Accordon TwentyEight successfully verified in the Live URL");
	}
	
	@Test(priority = 46)
	private void verifyProductsAccTwentyNine() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccTwentyNine();
		System.out.println("Products Accordon TwentyNine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccTwentyNine();
		System.out.println("Products Accordon TwentyNine successfully verified in the Live URL");
	}
	
	@Test(priority = 47)
	private void verifyProductsAccThirty() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirty();
		System.out.println("Products Accordon Thirty successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirty();
		System.out.println("Products Accordon Thirty successfully verified in the Live URL");
	}
	
	@Test(priority = 48)
	private void verifyProductsAccThirtyOne() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyOne();
		System.out.println("Products Accordon ThirtyOne successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyOne();
		System.out.println("Products Accordon ThirtyOne successfully verified in the Live URL");
	}
	
	@Test(priority = 49)
	private void verifyProductsAccThirtyTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyTwo();
		System.out.println("Products Accordon ThirtyTwo successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyTwo();
		System.out.println("Products Accordon ThirtyTwo successfully verified in the Live URL");
	}
	
	@Test(priority = 50)
	private void verifyProductsAccThirtyThree() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyThree();
		System.out.println("Products Accordon ThirtyThree successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyThree();
		System.out.println("Products Accordon ThirtyThree successfully verified in the Live URL");
	}
	
	@Test(priority = 51)
	private void verifyProductsAccThirtyFour() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyFour();
		System.out.println("Products Accordon ThirtyFour successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyFour();
		System.out.println("Products Accordon ThirtyFour successfully verified in the Live URL");
	}
	
	@Test(priority = 52)
	private void verifyProductsAccThirtyFive() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyFive();
		System.out.println("Products Accordon ThirtyFive successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyFive();
		System.out.println("Products Accordon ThirtyFive successfully verified in the Live URL");
	}
	
	@Test(priority = 53)
	private void verifyProductsAccThirtySix() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtySix();
		System.out.println("Products Accordon ThirtySix successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtySix();
		System.out.println("Products Accordon ThirtySix successfully verified in the Live URL");
	}
	
	@Test(priority = 54)
	private void verifyProductsAccThirtySeven() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtySeven();
		System.out.println("Products Accordon ThirtySeven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtySeven();
		System.out.println("Products Accordon ThirtySeven successfully verified in the Live URL");
	}
	
	@Test(priority = 55)
	private void verifyProductsAccThirtyEight() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyEight();
		System.out.println("Products Accordon ThirtyEight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyEight();
		System.out.println("Products Accordon ThirtyEight successfully verified in the Live URL");
	}
	
	@Test(priority = 56)
	private void verifyProductsAccThirtyNine() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccThirtyNine();
		System.out.println("Products Accordon ThirtyNine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccThirtyNine();
		System.out.println("Products Accordon ThirtyNine successfully verified in the Live URL");
	}
	
	@Test(priority = 57)
	private void verifyProductsAccFourty() throws Exception{
		switchingTab(firstTab);
		faq.clickProductsAccFourty();
		System.out.println("Products Accordon Fourty successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickProductsAccFourty();
		System.out.println("Products Accordon Fourty successfully verified in the Live URL");
	}
	
//	@Test(priority = 58)
//	private void verifyProductsAccOne() throws Exception{
//		switchingTab(firstTab);
//		faq.clickProductsAccOne();
//		System.out.println("Products Accordon One successfully verified in the Preprod URL");
//		switchingTab(secondTab);
//		faq.clickProductsAccOne();
//		System.out.println("Products Accordon One successfully verified in the Live URL");
//	}
	
	
	
	
	
	

}
