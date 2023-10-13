package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListAltTextPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListAltTextTest extends BaseClass{
	
	CheckListAltTextPage at;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		at = new CheckListAltTextPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyLazyloaded(String path) throws Exception {
		at.getNotContainsAltText(path);
	}

}
