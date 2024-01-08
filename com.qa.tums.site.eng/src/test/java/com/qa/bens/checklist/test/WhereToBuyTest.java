package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.WhereToBuyPage;
import com.qa.tums.eng.util.DataProviderCode;

public class WhereToBuyTest extends BaseClass{
	
	WhereToBuyPage wtb;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		wtb = new WhereToBuyPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyBuyNowBtn(String path) throws Exception {
		wtb.getBuyNowCount(path);
		System.out.println("---->**************************************************<----");
		
	}

}
