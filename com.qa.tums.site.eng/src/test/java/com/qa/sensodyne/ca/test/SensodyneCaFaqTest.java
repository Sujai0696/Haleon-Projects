package com.qa.sensodyne.ca.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.sensodyne.ca.pages.SensodyneCaFaqPage;

public class SensodyneCaFaqTest extends BaseClass{
	
	SensodyneCaFaqPage faq;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("sensodyne_caConfig.properties").getProperty("browser"));
		launchTwoUrl();
	}


	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		faq = new	SensodyneCaFaqPage();
		switchingTab(firstTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("faqPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("sensodyne_caConfig.properties").getProperty("faqLiveUrl"));
	}
	
	@Test(priority = 1)
	private void verifyBreadcrumbOne() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One: "+compareTwoText);
	}
	
	@Test(priority = 2)
	private void verifyBreadcrumbTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two: "+compareTwoText);
	}
	
	@Test(priority = 3)
	private void verifyToothSensitivityAccOneHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccOneHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccOneHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc One HL One: "+compareTwoText);
	}
	
	@Test(priority = 4)
	private void verifyToothSensitivityAccOneHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccOneHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccOneHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc One HL Two: "+compareTwoText);
	}
	
	@Test(priority = 5)
	private void verifyToothSensitivityAccOneHLThree() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccOneHLThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccOneHLThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc One HL Three: "+compareTwoText);
	}
	
	@Test(priority = 6)
	private void verifyToothSensitivityAccTwoHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccTwoHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccTwoHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Two HL One: "+compareTwoText);
	}
	
	@Test(priority = 7)
	private void verifyToothSensitivityAccTwoHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccTwoHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccTwoHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Two HL Two: "+compareTwoText);
	}
	
	@Test(priority = 8)
	private void verifyToothSensitivityAccFiveHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccFiveHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccFiveHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Five HL One: "+compareTwoText);
	}
	
	@Test(priority = 9)
	private void verifyToothSensitivityAccSevenHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSevenHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSevenHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Seven HL One: "+compareTwoText);
	}
	
	@Test(priority = 10)
	private void verifyToothSensitivityAccSevenHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccSevenHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccSevenHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Seven HL Two: "+compareTwoText);
	}
	
	@Test(priority =11)
	private void verifyToothSensitivityAccEightHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickToothSensitivityAccEightHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickToothSensitivityAccEightHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Tooth Sensitivity Acc Eight HL One: "+compareTwoText);
	}
	
	@Test(priority =12)
	private void verifyHowSensodyneWorksAccOneHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccOneHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccOneHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for How Sensodyne Works Acc One HL One: "+compareTwoText);
	}
	
	@Test(priority =13)
	private void verifyHowSensodyneWorksAccOneHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccOneHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccOneHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for How Sensodyne Works Acc One HL Two: "+compareTwoText);
	}
	
	@Test(priority =14)
	private void verifyHowSensodyneWorksAccTwoHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccTwoHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccTwoHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for How Sensodyne Works Acc Two HL One: "+compareTwoText);
	}
	
	@Test(priority =15)
	private void verifyHowSensodyneWorksAccTwoHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccTwoHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccTwoHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for How Sensodyne Works Acc Two HL Two: "+compareTwoText);
	}
	
	@Test(priority =16)
	private void verifyHowSensodyneWorksAccThreeHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickHowSensodyneWorksAccThreeHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickHowSensodyneWorksAccThreeHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for How Sensodyne Works Acc Three HL One: "+compareTwoText);
	}
	
	@Test(priority =17)
	private void verifySensodyneIngredientsAccOneHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccOneHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccOneHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc One HL One: "+compareTwoText);
	}
	
	@Test(priority =18)
	private void verifySensodyneIngredientsAccTwoHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccTwoHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccTwoHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Two HL One: "+compareTwoText);
	}
	
	@Test(priority =19)
	private void verifySensodyneIngredientsAccThreeHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccThreeHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccThreeHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Three HL One: "+compareTwoText);
	}
	
	@Test(priority =20)
	private void verifySensodyneIngredientsAccThreeHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccThreeHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccThreeHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Three HL Two: "+compareTwoText);
	}
	
	@Test(priority =21)
	private void verifySensodyneIngredientsAccThreeHLThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccThreeHLThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccThreeHLThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Three HL Three: "+compareTwoText);
	}
	
	@Test(priority =22)
	private void verifysensodyneIngredientsAccFourHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccFourHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccFourHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Four HL One: "+compareTwoText);
	}
	
	@Test(priority =23)
	private void verifysensodyneIngredientsAccFiveHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneIngredientsAccFiveHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneIngredientsAccFiveHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Ingredients Acc Five HL One: "+compareTwoText);
	}
	
	@Test(priority =24)
	private void verifySensodyneProductsAccOneHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL One: "+compareTwoText);
	}
	
	@Test(priority =25)
	private void verifySensodyneProductsAccOneHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Two: "+compareTwoText);
	}
	
	@Test(priority =26)
	private void verifySensodyneProductsAccOneHLThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Three: "+compareTwoText);
	}
	
	@Test(priority =27)
	private void verifySensodyneProductsAccOneHLFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Four: "+compareTwoText);
	}
	
	@Test(priority =28)
	private void verifySensodyneProductsAccOneHLFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Five: "+compareTwoText);
	}
	
	@Test(priority =29)
	private void verifySensodyneProductsAccOneHLSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Six: "+compareTwoText);
	}
	
	@Test(priority =30)
	private void verifySensodyneProductsAccOneHLSeven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLSeven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLSeven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Seven: "+compareTwoText);
	}
	
	@Test(priority =31)
	private void verifySensodyneProductsAccOneHLEight() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLEight();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLEight();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Eight: "+compareTwoText);
	}
	
	@Test(priority =32)
	private void verifySensodyneProductsAccOneHLNine() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLNine();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLNine();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Nine: "+compareTwoText);
	}
	
	@Test(priority =33)
	private void verifySensodyneProductsAccOneHLTen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLTen();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLTen();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Ten: "+compareTwoText);
	}
	
	@Test(priority =34)
	private void verifySensodyneProductsAccOneHLEleven() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLEleven();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLEleven();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Eleven: "+compareTwoText);
	}
	
	@Test(priority =35)
	private void verifySensodyneProductsAccOneHLTweleve() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLTweleve();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLTweleve();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Tweleve: "+compareTwoText);
	}
	
	@Test(priority =36)
	private void verifySensodyneProductsAccOneHLThirteen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLThirteen();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLThirteen();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Thirteen: "+compareTwoText);
	}
	
	@Test(priority =37)
	private void verifySensodyneProductsAccOneHLFourteen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLFourteen();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLFourteen();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Fourteen: "+compareTwoText);
	}
	
	@Test(priority =38)
	private void verifySensodyneProductsAccOneHLFifteen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLFifteen();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLFifteen();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Fifteen: "+compareTwoText);
	}
	
	@Test(priority =39)
	private void verifySensodyneProductsAccOneHLSixteen() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccOneHLSixteen();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccOneHLSixteen();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc One HL Sixteen: "+compareTwoText);
	}
	
	@Test(priority =40)
	private void verifySensodyneProductsAccTwoHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccTwoHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccTwoHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Two HL One: "+compareTwoText);
	}
	
	@Test(priority =41)
	private void verifySensodyneProductsAccThreeHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccThreeHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccThreeHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Three HL One: "+compareTwoText);
	}
	
	@Test(priority =42)
	private void verifySensodyneProductsAccThreeHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccThreeHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccThreeHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Three HL Two: "+compareTwoText);
	}
	
	@Test(priority =43)
	private void verifySensodyneProductsAccFourHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccFourHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccFourHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Four HL One: "+compareTwoText);
	}
	
	@Test(priority =44)
	private void verifySensodyneProductsAccSixHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccSixHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccSixHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Six HL One: "+compareTwoText);
	}
	
	@Test(priority =45)
	private void verifySensodyneProductsAccSixHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneProductsAccSixHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneProductsAccSixHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne Products Acc Six HL Two: "+compareTwoText);
	}
	
	@Test(priority =46)
	private void verifySensodyneAndWhiteningAccOneHLOne() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLOne();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLOne();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL One: "+compareTwoText);
	}
	
	@Test(priority =47)
	private void verifySensodyneAndWhiteningAccOneHLTwo() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLTwo();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLTwo();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL Two: "+compareTwoText);
	}
	
	@Test(priority =48)
	private void verifySensodyneAndWhiteningAccOneHLThree() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLThree();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLThree();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL Three: "+compareTwoText);
	}
	
	@Test(priority =49)
	private void verifySensodyneAndWhiteningAccOneHLFour() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLFour();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLFour();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL Four: "+compareTwoText);
	}
	
	@Test(priority =50)
	private void verifySensodyneAndWhiteningAccOneHLFive() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLFive();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLFive();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL Five: "+compareTwoText);
	}
	
	@Test(priority =51)
	private void verifySensodyneAndWhiteningAccOneHLSix() throws Exception{
		switchingTab(firstTab);
		faq.clickSensodyneAndWhiteningAccOneHLSix();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickSensodyneAndWhiteningAccOneHLSix();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Sensodyne And Whitening Acc One HL Six: "+compareTwoText);
	}
	
	@Test(priority =52)
	private void verifyFindYourToothpaste() throws Exception{
		switchingTab(firstTab);
		faq.clickFindYourToothpaste();
		String preProdUrl = compareUrl(excelRead("Sensodyne_CA", 1, 0));
		switchingTab(secondTab);
		faq.clickFindYourToothpaste();
		String liveUrl = compareUrl(excelRead("Sensodyne_CA", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Find Your Toothpaste: "+compareTwoText);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
