package com.qa.bens.checklist.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;
import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.H1TagVerificationPage;
import com.qa.tums.eng.util.DataProviderCode;
import com.qa.tums.eng.util.ExtentManager;
import com.qa.tums.eng.util.LogFile;

public class H1TagVerificationTest extends BaseClass{
	
	H1TagVerificationPage h1Tag;
	
	

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		h1Tag = new H1TagVerificationPage();
	}

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingTheH1Tag(String path) throws Exception {
		h1Tag.verifyH1Tag(path);
	}
}
