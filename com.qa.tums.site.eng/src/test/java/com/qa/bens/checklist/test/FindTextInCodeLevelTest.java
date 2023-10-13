package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BuyNowDisableGTMPage;
import com.qa.bens.checklist.page.FindTextInCodeLevelPage;
import com.qa.tums.eng.util.DataProviderCode;

public class FindTextInCodeLevelTest extends BaseClass{
	
	FindTextInCodeLevelPage cl;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		cl = new FindTextInCodeLevelPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyBeTotalAndCompresse(String path) throws Exception {
		cl.getBeTotalAndCompresse(path);
	}
	
	

}
