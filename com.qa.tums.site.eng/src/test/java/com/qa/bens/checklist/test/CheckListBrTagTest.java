package com.qa.bens.checklist.test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListBrTagPage;
import com.qa.tums.eng.util.DataProviderCode;
import com.qa.tums.eng.util.LogFile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckListBrTagTest extends BaseClass{
	
	CheckListBrTagPage brTag;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		brTag = new CheckListBrTagPage();
	}

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingBrTag(String path) throws Exception {
		brTag.verifyBrTag(path);
		System.out.println("---->**********************************************<----");
	}
}
