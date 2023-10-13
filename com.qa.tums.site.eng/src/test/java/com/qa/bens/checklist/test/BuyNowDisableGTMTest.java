package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BuyNowDisableGTMPage;
import com.qa.tums.eng.util.DataProviderCode;

public class BuyNowDisableGTMTest extends BaseClass{
	
	BuyNowDisableGTMPage ff;
		@BeforeClass
		private void launchTheBrowser() throws Exception {
			browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
			ff = new BuyNowDisableGTMPage();
		}
		
//		dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
		
		@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
		private void verifygetBuyNowGTMTag(String path) throws Exception {
			ff.getNotDisableGTMTag(path);
		}

}
