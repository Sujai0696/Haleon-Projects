package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListBrTagPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	public CheckListBrTagPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "br")
	private static List<WebElement> brTag;
	
	
	public void verifyBrTag(String path) throws Exception{
		implicitWait();
		launchURL(path);
		implicitWait();
//		Thread.sleep(3000);
		String currentURL = driver.getCurrentUrl();
		try {
			System.out.println("No of Br tag is "+brTag.size()+"--->"+ currentURL );
			
			if(brTag.size()>8) {
				log.fail(currentURL+"  :br Tag Size---> "+brTag.size());
				System.out.println("Failed: Br tag size is more than Eight--->"+brTag.size()+" :--->"+ currentURL );
				Assert.assertTrue(false, "Failed: Br tag is more than Eight---> : "+currentURL+"");

			}
			else {
				log.pass(currentURL+"  :br Tag Size---> "+brTag.size());
				System.out.println("Passed: Br tag size is less than Eight--->"+brTag.size()+" :--->"+ currentURL );
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

}
