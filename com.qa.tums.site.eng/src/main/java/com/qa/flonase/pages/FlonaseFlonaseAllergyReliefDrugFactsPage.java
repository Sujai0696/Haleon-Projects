package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class FlonaseFlonaseAllergyReliefDrugFactsPage extends BaseClass{
	
	public FlonaseFlonaseAllergyReliefDrugFactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='About']")
	private static WebElement bannerImgLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/how-to-use/' and text()='How to use']")
	private static WebElement bannerImgLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/drug-facts/' and text()='Drug facts']")
	private static WebElement bannerImgLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/faqs/' and text()='FAQs']")
	private static WebElement bannerImgLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/reviews/' and text()='Read all reviews']")
	private static WebElement bannerImgLinkFive;
	

}
