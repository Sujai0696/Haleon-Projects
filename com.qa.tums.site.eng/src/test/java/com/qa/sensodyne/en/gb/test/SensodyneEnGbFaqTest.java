package com.qa.sensodyne.en.gb.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.en.gb.pages.SensodyneEnGbFaqPage;

public class SensodyneEnGbFaqTest extends BaseClass{
	
	SensodyneEnGbFaqPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_en_gbConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		faq = new	SensodyneEnGbFaqPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("faqPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_en_gbConfig.properties").getProperty("faqLiveUrl"));
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
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
		switchingTab(secondTab);
		faq.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
//	
//	@Test(priority = 3)
//	private void verifyBreadcrumbThree() throws Exception{
//		switchingTab(firstTab);
//		faq.clickBreadcrumbThree();
//		String preProdUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 0));
//		switchingTab(secondTab);
//		faq.clickBreadcrumbThree();
//		String liveUrl = compareUrl(excelRead("Sensodyne_EN_GB", 1, 1));
//		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
//		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three: "+compareTwoText);
//	}
	
	@Test(priority = 4)
	private void verifyToothSensitivityAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccTwo();
		System.out.println("ToothSensitivity Accordon two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccTwo();
		System.out.println("ToothSensitivity Accordon two successfully verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyToothSensitivityAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccThree();
		System.out.println("ToothSensitivity Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccThree();
		System.out.println("ToothSensitivity Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 6)
	private void verifyToothSensitivityAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccFour();
		System.out.println("ToothSensitivity Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccFour();
		System.out.println("ToothSensitivity Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 7)
	private void verifyToothSensitivityAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccFive();
		System.out.println("ToothSensitivity Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccFive();
		System.out.println("ToothSensitivity Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 8)
	private void verifyToothSensitivityAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSix();
		System.out.println("ToothSensitivity Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSix();
		System.out.println("ToothSensitivity Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 9)
	private void verifyToothSensitivityAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSeven();
		System.out.println("ToothSensitivity Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSeven();
		System.out.println("ToothSensitivity Accordon Seven successfully verified in the Live URL");
	}
	
	
	@Test(priority = 10)
	private void verifyHowSensodyneWorksAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccTwo();
		System.out.println("HowSensodyneWorks Accordon Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccTwo();
		System.out.println("HowSensodyneWorks AccordonTwo  successfully verified in the Live URL");
	}
	
	@Test(priority = 11)
	private void verifyHowSensodyneWorksAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccThree();
		System.out.println("HowSensodyneWorks Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccThree();
		System.out.println("HowSensodyneWorks Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 12)
	private void verifyHowSensodyneWorksAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccFour();
		System.out.println("HowSensodyneWorks Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccFour();
		System.out.println("HowSensodyneWorks Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 13)
	private void verifyHowSensodyneWorksAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccFive();
		System.out.println("HowSensodyneWorks Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccFive();
		System.out.println("HowSensodyneWorks Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 14)
	private void verifySensodyneIngredientsAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccTwo();
		System.out.println("SensodyneIngredients Accordon Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccTwo();
		System.out.println("SensodyneIngredients Accordon Two successfully verified in the Live URL");
	}
	
	@Test(priority = 15)
	private void verifySensodyneIngredientsAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccThree();
		System.out.println("SensodyneIngredients Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccThree();
		System.out.println("SensodyneIngredients Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 16)
	private void verifySensodyneIngredientsAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccFour();
		System.out.println("SensodyneIngredients Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccFour();
		System.out.println("SensodyneIngredients Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 17)
	private void verifySensodyneIngredientsAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccFive();
		System.out.println("SensodyneIngredients Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccFive();
		System.out.println("SensodyneIngredients Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 18)
	private void verifySensodyneIngredientsAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccSix();
		System.out.println("SensodyneIngredients Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccSix();
		System.out.println("SensodyneIngredients Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 19)
	private void verifySensodyneIngredientsAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccSeven();
		System.out.println("SensodyneIngredients Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccSeven();
		System.out.println("SensodyneIngredients Accordon Seven successfully verified in the Live URL");
	}
	
	@Test(priority = 20)
	private void verifySensodyneProductsAccTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccTwo();
		System.out.println("SensodyneProducts Accordon Two successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccTwo();
		System.out.println("SensodyneProducts Accordon Two successfully verified in the Live URL");
	}
	
	
	@Test(priority = 21)
	private void verifySensodyneProductsAccThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccThree();
		System.out.println("SensodyneProducts Accordon Three successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccThree();
		System.out.println("SensodyneProducts Accordon Three successfully verified in the Live URL");
	}
	
	@Test(priority = 22)
	private void verifySensodyneProductsAccFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccFour();
		System.out.println("SensodyneProducts Accordon Four successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccFour();
		System.out.println("SensodyneProducts Accordon Four successfully verified in the Live URL");
	}
	
	@Test(priority = 23)
	private void verifySensodyneProductsAccFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccFive();
		System.out.println("SensodyneProducts Accordon Five successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccFive();
		System.out.println("SensodyneProducts Accordon Five successfully verified in the Live URL");
	}
	
	@Test(priority = 24)
	private void verifySensodyneProductsAccSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccSix();
		System.out.println("SensodyneProducts Accordon Six successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccSix();
		System.out.println("SensodyneProducts Accordon Six successfully verified in the Live URL");
	}
	
	@Test(priority = 25)
	private void verifySensodyneProductsAccSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccSeven();
		System.out.println("SensodyneProducts Accordon Seven successfully verified in the Preprod URL");
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccSeven();
		System.out.println("SensodyneProducts Accordon Seven successfully verified in the Live URL");
	}
	
	
	
	
	
	

}
