package com.qa.centrum.eng.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.centrum.eng.pages.LearnWhyAreVitaminsImportantPage;

public class CentrumSampleLearnVitaminsImportantTest extends BaseClass{
	LearnWhyAreVitaminsImportantPage vi;

	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadProperties().getProperty("browser"));
		launchTwoUrl();
	}

	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		switchingTab(firstTab);
		launchURL("https://gskstaging15:Climate2022@centrum-wellness-com.preprod-cf65.ch.adobecqms.net/learn/why-are-vitamins-important/");
		switchingTab(secondTab);
		launchURL("https://www.centrum.com/learn/why-are-vitamins-important/");
	}


	@Test(priority = 0, enabled = true)
	private void cookieButton() throws Exception {
		vi = new LearnWhyAreVitaminsImportantPage();
		switchingTab(firstTab);
		vi.clickCookieBtn();
		vi.clickGigyaForm();
		System.out.println("Cookie Pop-Up and Gigya Form successfully verified in the Preprod URL");
		switchingTab(secondTab);
		vi.clickCookieBtn();
		vi.clickGigyaForm();
		System.out.println("Cookie Pop-Up and Gigya Form successfully verified in the Live URL");
	}


	@Test(priority = 1, enabled = true)
	private void verifySupportImmunity() throws Exception {
		vi = new LearnWhyAreVitaminsImportantPage();
		switchingTab(firstTab);
		vi.clickSupportImmunity();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSupportImmunity();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Support Immunity :"+compareTwoText);
	}

	@Test(priority = 2, enabled = true)
	private void verifyMaintainStrongBones() throws Exception {
		switchingTab(firstTab);
		vi.clickMaintainStrongBone();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMaintainStrongBone();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Maintain Strong Bones :"+compareTwoText);
	}


	@Test(priority = 3, enabled = true)
	private void verifyMeetingYourNutritionalNeeds() throws Exception {
		switchingTab(firstTab);
		vi.clickMeetingYourNutritionalNeeds();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMeetingYourNutritionalNeeds();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Meeting Your Nutritional Needs :"+compareTwoText);
	}


	@Test(priority = 4, enabled = true)
	private void verifyPaleo() throws Exception {
		switchingTab(firstTab);
		vi.clickPaleo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickPaleo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Paleo :"+compareTwoText);
	}
	
	@Test(priority = 5, enabled = true)
	private void verifyKeto() throws Exception {
		switchingTab(firstTab);
		vi.clickKeto();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickKeto();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Keto :"+compareTwoText);
	}
	
	@Test(priority = 6, enabled = true)
	private void verifyVegetarianLinkOne() throws Exception {
		switchingTab(firstTab);
		vi.clickVegetarianLinkOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegetarianLinkOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vegetarian Link One :"+compareTwoText);
	}

	@Test(priority = 7, enabled = true)
	private void verifyVegetarianLinkTwo() throws Exception {
		switchingTab(firstTab);
		vi.clickVegetarianLinkTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegetarianLinkTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vegetarian Link Two :"+compareTwoText);
	}
	
	@Test(priority = 8, enabled = true)
	private void verifyVegan() throws Exception {
		switchingTab(firstTab);
		vi.clickVegan();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickVegan();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Vegan :"+compareTwoText);
	}


	@Test(priority = 9, enabled = true)
	private void verifyOysters() throws Exception {
		switchingTab(firstTab);
		vi.clickOysters();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickOysters();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Oysters :"+compareTwoText);
	}

	@Test(priority = 10, enabled = true)
	private void verifyPinkSalmon() throws Exception {
		switchingTab(firstTab);
		vi.clickPinkSalmon();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickPinkSalmon();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Pink Salmon :"+compareTwoText);
	}

	@Test(priority = 11,enabled = true)
	private void verifyAlmonds() throws Exception {
		switchingTab(firstTab);
		vi.clickAlmonds();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickAlmonds();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Almonds :"+compareTwoText);
	}

	@Test(priority = 12,enabled = true)
	private void verifySpinach() throws Exception {
		switchingTab(firstTab);
		vi.clickSpinach();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSpinach();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Spinach :"+compareTwoText);
	}


	@Test(priority = 13,enabled =true)
	private void verifyHalibut() throws Exception {
		switchingTab(firstTab);
		vi.clickHalibut();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickHalibut();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Halibut :"+compareTwoText);
	}

	@Test(priority = 14, enabled = true)
	private void verifyAvocados() throws Exception {
		switchingTab(firstTab);
		vi.clickAvocados();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickAvocados();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Avocados :"+compareTwoText);
	}

	@Test(priority = 15, enabled = true)
	private void verifyChickPeas() throws Exception {
		switchingTab(firstTab);
		vi.clickChickPeas();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickChickPeas();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Chicpeas :"+compareTwoText);
	}

	@Test(priority = 16,enabled = true)
	private void verifyGreekYogurt() throws Exception {
		switchingTab(firstTab);
		vi.clickGreekYogurt();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickGreekYogurt();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for GreekYogurt:"+compareTwoText);
	}


	@Test(priority = 17, enabled = true)
	private void verifyShowReference() throws Exception {
		switchingTab(firstTab);
		vi.clickShowReference();
		System.out.println("Show Reference and Hide Reference are succesfully verified in the PreProd URL");
		switchingTab(secondTab);
		vi.clickShowReference();
		System.out.println("Show Reference and Hide Reference are succesfully verified in the Live URL");
	}

	@Test(priority = 18, enabled = true)
	private void verifyMultivitamins() throws Exception {
		switchingTab(firstTab);
		vi.clickMultivitamins();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickMultivitamins();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Multivitamins :"+compareTwoText);
	}


	@Test(priority = 19, enabled = true)
	private void verifyBenefitBlends() throws Exception {
		switchingTab(firstTab);
		vi.clickBenefitBlends();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickBenefitBlends();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for benefit Blends :"+compareTwoText);
	}


	@Test(priority = 20, enabled=true)
	private void verifyWholeFoodBlends() throws Exception {
		switchingTab(firstTab);
		vi.clickWholeFoodBlends();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickWholeFoodBlends();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Whole Food Blends :"+compareTwoText);
	}

	@Test(priority = 21, enabled = true)
	private void verifySeeAllProducts() throws Exception {
		switchingTab(firstTab);
		vi.clickSeeAllProducts();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickSeeAllProducts();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for SeeALL Products :"+compareTwoText);
	}

	@Test(priority = 22, enabled = true)
	private void verifyArticleOne() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article One :"+compareTwoText);

	}

	@Test(priority = 23, enabled = true)
	private void verifyArticleTwo() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Two :"+compareTwoText);

	}

	@Test(priority = 24, enabled = true)
	private void verifyArticleThree() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Three :"+compareTwoText);
	}

	@Test(priority = 25, enabled = true)
	private void verifyArticleFour() throws Exception {
		switchingTab(firstTab);
		vi.clickArticleFour();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickArticleFour();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Article Four :"+compareTwoText);
	}
	

	@Test(priority = 26)
	private void verifyBreadcrumbOne() throws Exception {
		switchingTab(firstTab);
		vi.clickBreadcrumbOne();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickBreadcrumbOne();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb One :"+compareTwoText);
	}
	
	@Test(priority = 27)
	private void verifyBreadcrumbTwo() throws Exception {
		switchingTab(firstTab);
		vi.clickBreadcrumbTwo();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickBreadcrumbTwo();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Two :"+compareTwoText);
	}
	
	@Test(priority = 28)
	private void verifyBreadcrumbThree() throws Exception {
		switchingTab(firstTab);
		vi.clickBreadcrumbThree();
		String preProdUrl = compareUrl(excelRead("Centrum", 1, 0));
		switchingTab(secondTab);
		vi.clickBreadcrumbThree();
		String liveUrl = compareUrl(excelRead("Centrum", 1, 1));
		boolean compareTwoText = compareTwoText(preProdUrl, liveUrl);
		System.out.println("PreProdUrl and LiveUrl are Same for Breadcrumb Three :"+compareTwoText);
	}
}
