package com.qa.sensodyne.us.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneSearchResult extends BaseClass{
	public SensodyneSearchResult() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//span[text()='Search Button']")
	private static WebElement SearchIcon;
	
	@FindBy(xpath = "(//input[@class='input-medium search-query'])[3]")
	private static WebElement SearchField;
	
	@FindBy(xpath = "(//button[@class='button'])[3]")
	private static WebElement SearchSubmit;
	
	@FindBy(xpath = "(//div[@class='searchResults-results']//a[@href])[1]")
	private static WebElement SearchedResult1;
	
	@FindBy(xpath = "//li[contains(@class,'searchResults-paginatio')]//a[@href]")
	private static WebElement Pagination;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement GetYourCoupon;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
	private static WebElement FindYourStore;
	
	@FindBy(xpath = "//span[@class='searchResults-numberLabel']")
	private static WebElement result;
	
	

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

	public void clickSearchIcon() throws Exception{
		moveToElement(SearchIcon);
		clickElementUsingJavaScript(SearchIcon);
	}
	public void clickSearchField() throws Exception{
		moveToElement(SearchField);
		clickElementUsingJavaScript(SearchField);
		SearchField.sendKeys("Sensodyne");
	}
	public void clickSearchSubmit() throws Exception{
		moveToElement(SearchSubmit);
		clickElementUsingJavaScript(SearchSubmit);
	}
	public void clickSearchedResult1() throws Exception{
		moveToElement(SearchedResult1);
		clickElementUsingJavaScript(SearchedResult1);
	}
	
		
	public void clickGetYourCoupon() throws Exception{
		moveToElement(GetYourCoupon);
		clickElementUsingJavaScript(GetYourCoupon);
	}
	public void clickFindYourStore() throws Exception{
		moveToElement(FindYourStore);
		clickElementUsingJavaScript(FindYourStore);
	}
	public String getResult() throws Exception{
		moveToElement(result);
		String resultText = result.getText();
		return resultText;
	}

}
