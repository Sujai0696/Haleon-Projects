package com.qa.eno.co.in.test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.eno.co.in.pages.EnoFruitSaltSachetPage;
import com.qa.eno.co.in.pages.EnoProductsPage;

public class EnoProductsTest extends BaseClass{
	
	EnoProductsPage pp;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("eno_co_inConfig.properties").getProperty("browser"));
		launchTwoUrl();
		
	}
	
	@BeforeMethod
	private void LaunchingTheUrl() throws IOException, Exception {
		pp = new EnoProductsPage();
		switchingTab(firstTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("productsPreProdUrl"));
		switchingTab(secondTab);
		launchURL(loadConfig("eno_co_inConfig.properties").getProperty("productsLiveUrl"));
	}
	
	@Test(priority = 0)
	private void verifySachetLemon() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickSachetLemon();
		System.out.println("Lemon Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickSachetLemon();
		System.out.println("Lemon Flavor is verified in the Live URL");
		
	}
	
	@Test(priority = 1)
	private void verifySachetCola() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickSachetCola();
		System.out.println("Cola Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickSachetCola();
		System.out.println("Cola Flavor is verified in the Live URL");
		
	}
	
	@Test(priority = 2)
	private void verifySachetOrange() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickSachetOrange();
		System.out.println("Orange Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickSachetOrange();
		System.out.println("Orange Flavor is verified in the Live URL");
	}
	
	@Test(priority = 3)
	private void verifySachetAjwain() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickSachetAjwain();
		System.out.println("Ajwain Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickSachetAjwain();
		System.out.println("Ajwain Flavor is verified in the Live URL");
	}
	
	@Test(priority = 4)
	private void verifySachetMusambi() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickSachetMusambi();
		System.out.println("Musambi Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickSachetMusambi();
		System.out.println("Musambi Flavor is verified in the Live URL");
	}
	
	@Test(priority = 5)
	private void verifyBottleLemon() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickBottleLemon();
		System.out.println("Lemon Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickBottleLemon();
		System.out.println("Lemon Flavor is verified in the Live URL");
		
	}
	
	@Test(priority = 6)
	private void verifyBottleOrange() throws Exception{
		switchingTab(firstTab);
		refreshWebPage();
		pp.clickBottleOrange();
		System.out.println("Orange Flavor is verified in the Preprod URL");
		switchingTab(secondTab);
		refreshWebPage();
		pp.clickBottleOrange();
		System.out.println("Orange Flavor is verified in the Live URL");
	}
	

}
