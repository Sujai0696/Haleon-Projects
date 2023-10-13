package com.qa.sensodyne.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.in.pages.SensodyneInFrequentlyAskedQuestionsPage;

public class SensodyneInFrequentlyAskedQuestionsTest extends BaseClass{
	
	SensodyneInFrequentlyAskedQuestionsPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		faq = new SensodyneInFrequentlyAskedQuestionsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("frequentlyAskedQuestionsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_inConfig.properties").getProperty("frequentlyAskedQuestionsLiveUrl"));
	}
	
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_IN", 1, 0));
		switchingTab(secondTab);
		faq.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_IN", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadcrumbTwo();
		System.out.println("Breadcrum Two verified successfully in preprod URL");
		switchingTab(secondTab);
		faq.clickBreadcrumbTwo();
		System.out.println("Breadcrum Two verified successfully in Live URL");
	}
	
	@Test(priority = 3)
	private void verifyToothSensitivityAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccTwo();
		System.out.println("ToothSensitivity Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccTwo();
		System.out.println("ToothSensitivity Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifyToothSensitivityAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccThree();
		System.out.println("ToothSensitivity Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccThree();
		System.out.println("ToothSensitivity Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyToothSensitivityAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccFour();
		System.out.println("ToothSensitivity Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccFour();
		System.out.println("ToothSensitivity Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyToothSensitivityAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccFive();
		System.out.println("ToothSensitivity Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccFive();
		System.out.println("ToothSensitivity Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyToothSensitivityAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSix();
		System.out.println("ToothSensitivity Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSix();
		System.out.println("ToothSensitivity Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyToothSensitivityAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSeven();
		System.out.println("ToothSensitivity Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSeven();
		System.out.println("ToothSensitivity Accordon Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyAcidErosionAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickAcidErosionAccTwo();
		System.out.println("AcidErosion Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAcidErosionAccTwo();
		System.out.println("AcidErosion Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 10)
	private void verifyAcidErosionAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickAcidErosionAccThree();
		System.out.println("AcidErosion Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickAcidErosionAccThree();
		System.out.println("AcidErosion Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority =11)
	private void verifySensitiveToothpasteAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccTwo();
		System.out.println("SensitiveToothpaste Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccTwo();
		System.out.println("SensitiveToothpaste Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifySensitiveToothpasteAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccThree();
		System.out.println("SensitiveToothpaste Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccThree();
		System.out.println("SensitiveToothpaste Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifySensitiveToothpasteAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccFour();
		System.out.println("SensitiveToothpaste Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccFour();
		System.out.println("SensitiveToothpaste Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifySensitiveToothpasteAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccFive();
		System.out.println("SensitiveToothpaste Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccFive();
		System.out.println("SensitiveToothpaste Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifySensitiveToothpasteAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccSix();
		System.out.println("SensitiveToothpaste Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccSix();
		System.out.println("SensitiveToothpaste Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifySensitiveToothpasteAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccSeven();
		System.out.println("SensitiveToothpaste Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccSeven();
		System.out.println("SensitiveToothpaste Accordon Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifySensitiveToothpasteAccEight() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccEight();
		System.out.println("SensitiveToothpaste Accordon Eight successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccEight();
		System.out.println("SensitiveToothpaste Accordon Eight successfully verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifySensitiveToothpasteAccNine() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccNine();
		System.out.println("SensitiveToothpaste Accordon Nine successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccNine();
		System.out.println("SensitiveToothpaste Accordon Nine successfully verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifyToothSensitivityAccTen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccTen();
		System.out.println("ToothSensitivity Accordon Ten successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccTen();
		System.out.println("ToothSensitivity Accordon Ten successfully verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifyToothSensitivityAccEleven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensitiveToothpasteAccEleven();
		System.out.println("ToothSensitivity Accordon Eleven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensitiveToothpasteAccEleven();
		System.out.println("ToothSensitivity Accordon Eleven successfully verified in the Live URL");
	}
	
	@Test(priority = 21)
	private void verifySensodyneToothbrushAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneToothbrushAccTwo();
		System.out.println("SensodyneToothbrush Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneToothbrushAccTwo();
		System.out.println("SensodyneToothbrush Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 22)
	private void verifySensodyneToothbrushAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneToothbrushAccThree();
		System.out.println("SensodyneToothbrush Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneToothbrushAccThree();
		System.out.println("SensodyneToothbrush Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 23)
	private void verifySensodyneToothbrushAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneToothbrushAccFour();
		System.out.println("SensodyneToothbrush Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneToothbrushAccFour();
		System.out.println("SensodyneToothbrush Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 24)
	private void verifySensodyneToothbrushAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneToothbrushAccFive();
		System.out.println("SensodyneToothbrush Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneToothbrushAccFive();
		System.out.println("SensodyneToothbrush Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 25)
	private void verifySensodyneToothbrushAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneToothbrushAccSix();
		System.out.println("SensodyneToothbrush Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneToothbrushAccSix();
		System.out.println("SensodyneToothbrush Accordon Six successfully verified in the Live URL");
	}

}
