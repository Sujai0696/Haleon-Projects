package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListRenditionPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListRenditionTest extends BaseClass{
	
	CheckListRenditionPage at;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		at = new CheckListRenditionPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifygRednition(String path) throws Exception {
		at.getNotRedintion(path);
	}

}
