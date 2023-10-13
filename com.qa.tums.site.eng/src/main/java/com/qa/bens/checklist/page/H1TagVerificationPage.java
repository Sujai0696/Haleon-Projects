package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class H1TagVerificationPage extends BaseClass{

	public static LogFile lf = new LogFile();

	public H1TagVerificationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h1")
	private static List<WebElement> h1Tags;




	public void verifyH1Tag(String path) throws Exception{
		implicitWait();
		try {
			launchURL(path);
			implicitWait();
			pageLoad();
			System.out.println("Total value for a tags: "+ h1Tags.size());
//			Thread.sleep(1500);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			lf.info(currentUrl);
			if (h1Tags.size()==1) {
				System.out.println("Total H1 Tags---> "+h1Tags.size()+"---> "+currentUrl);
				lf.pass("Current URL contains only one H1 Tag");
				lf.pass("H1 Tag Size---> "+h1Tags.size());
//				compareTwoInt(h1Tags.size(), 1);
				System.out.println("****************************************************");
			} else {
				System.out.println("Current URL contains more than 1 H1 Tags : "+ currentUrl);
				lf.fail("Current URL contains more than 1 H1 Tags");
				lf.fail("H1 Tag Size---> "+h1Tags.size());
//				Assert.assertTrue(false, "Current URL contains more than 1 H1 Tags :"+currentUrl+"");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
