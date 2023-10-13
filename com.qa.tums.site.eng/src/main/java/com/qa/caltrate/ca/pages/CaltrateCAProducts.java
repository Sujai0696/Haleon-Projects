package com.qa.caltrate.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class CaltrateCAProducts extends BaseClass{
	public CaltrateCAProducts() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[1]")
	private static WebElement Product1;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[2]")
	private static WebElement Product2;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[3]")
	private static WebElement Product3;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[4]")
	private static WebElement Product4;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[5]")
	private static WebElement Product5;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[6]")
	private static WebElement Product6;
	
	@FindBy(xpath = "(//*[text()='Caltrate Tablets']/../../../../../../following-sibling::div//div[@class='component-content middle'])[7]")
	private static WebElement Product7;
	
	@FindBy(xpath = "(//a[text()='Caltrate PLUS'])[2]")
	private static WebElement CaltratePLUS;
	
	@FindBy(xpath = "(//a[text()='Caltrate with Vitamin D'])[2]")
	private static WebElement CaltratewithVitaminD;

	@FindBy(xpath = "(//a[text()='Caltrate SELECT'])[2]")
	private static WebElement CaltrateSELECT;
	
	@FindBy(xpath = "(//a[text()='Caltrate'])[2]")
	private static WebElement Caltrate;
	
	@FindBy(xpath = "(//a[text()='Caltrate Gummies'])[2]")
	private static WebElement CaltrateGummies;
	
	@FindBy(xpath = "(//a[text()='Caltrate Soft Chews'])[2]")
	private static WebElement CaltrateSoftChews;
	
	@FindBy(xpath = "(//a[text()='Caltrate PLUS Chewables'])[2]")
	private static WebElement CaltratePLUSChewables;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate Plus']")
	private static WebElement LearnMoreAboutCaltratePlus;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate With Vitamin D']")
	private static WebElement LearnMoreAboutCaltrateWithVitaminD;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate Select']")
	private static WebElement LearnMoreAboutCaltrateSelect;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate']")
	private static WebElement LearnMoreAboutCaltrate;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate Gummies']")
	private static WebElement LearnMoreAboutCaltrateGummies;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate Soft Chews']")
	private static WebElement LearnMoreAboutCaltrateSoftChews;
	
	@FindBy(xpath = "//a[@title='Learn more about Caltrate Plus Chewables']")
	private static WebElement LearnMoreAboutCaltratePlusChewables;
	
	
	public void clickOnHomeIcon() throws Throwable {
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
	}
	public void clickOnProduct1() throws Throwable {
		moveToElement(Product1);
		clickElementUsingJavaScript(Product1);
	}
	
	public void clickOnProduct2() throws Throwable {
		moveToElement(Product2);
		clickElementUsingJavaScript(Product2);
	}
	public void clickOnProduct3() throws Throwable {
		moveToElement(Product3);
		clickElementUsingJavaScript(Product3);
	}
	public void clickOnProduct4() throws Throwable {
		moveToElement(Product4);
		clickElementUsingJavaScript(Product4);
	}
	public void clickOnProduct5() throws Throwable {
		moveToElement(Product5);
		clickElementUsingJavaScript(Product5);
	}
	public void clickOnProduct6() throws Throwable {
		moveToElement(Product6);
		clickElementUsingJavaScript(Product6);
	}
	public void clickOnProduct7() throws Throwable {
		moveToElement(Product7);
		clickElementUsingJavaScript(Product7);
	}
	public void clickOnCaltratePLUS() throws Throwable {
		moveToElement(CaltratePLUS);
		clickElementUsingJavaScript(CaltratePLUS);
	}
	public void clickOnCaltratewithVitaminD() throws Throwable {
		moveToElement(CaltratewithVitaminD);
		clickElementUsingJavaScript(CaltratewithVitaminD);
	}
	public void clickOnCaltrateSELECT() throws Throwable {
		moveToElement(CaltrateSELECT);
		clickElementUsingJavaScript(CaltrateSELECT);
	}
	public void clickOnCaltrate() throws Throwable {
		moveToElement(Caltrate);
		clickElementUsingJavaScript(Caltrate);
	}
	public void clickOnCaltrateGummies() throws Throwable {
		moveToElement(CaltrateGummies);
		clickElementUsingJavaScript(CaltrateGummies);
	}
	public void clickOnCaltrateSoftChews() throws Throwable {
		moveToElement(CaltrateSoftChews);
		clickElementUsingJavaScript(CaltrateSoftChews);
	}
	public void clickOnCaltratePLUSChewables() throws Throwable {
		moveToElement(CaltratePLUSChewables);
		clickElementUsingJavaScript(CaltratePLUSChewables);
	}
	public void clickOnLearnMoreAboutCaltratePlus() throws Throwable {
		moveToElement(LearnMoreAboutCaltratePlus);
		clickElementUsingJavaScript(LearnMoreAboutCaltratePlus);
	}
	public void clickOnLearnMoreAboutCaltrateWithVitaminD() throws Throwable {
		moveToElement(LearnMoreAboutCaltrateWithVitaminD);
		clickElementUsingJavaScript(LearnMoreAboutCaltrateWithVitaminD);
	}
	public void clickOnLearnMoreAboutCaltrateSelect() throws Throwable {
		moveToElement(LearnMoreAboutCaltrateSelect);
		clickElementUsingJavaScript(LearnMoreAboutCaltrateSelect);
	}
	public void clickOnLearnMoreAboutCaltrate() throws Throwable {
		moveToElement(LearnMoreAboutCaltrate);
		clickElementUsingJavaScript(LearnMoreAboutCaltrate);
	}
	public void clickOnLearnMoreAboutCaltrateGummies() throws Throwable {
		moveToElement(LearnMoreAboutCaltrateGummies);
		clickElementUsingJavaScript(LearnMoreAboutCaltrateGummies);
	}
	public void clickOnLearnMoreAboutCaltrateSoftChews() throws Throwable {
		moveToElement(LearnMoreAboutCaltrateSoftChews);
		clickElementUsingJavaScript(LearnMoreAboutCaltrateSoftChews);
	}
	public void clickOnLearnMoreAboutCaltratePlusChewables() throws Throwable {
		moveToElement(LearnMoreAboutCaltratePlusChewables);
		clickElementUsingJavaScript(LearnMoreAboutCaltratePlusChewables);
	}
	

}
