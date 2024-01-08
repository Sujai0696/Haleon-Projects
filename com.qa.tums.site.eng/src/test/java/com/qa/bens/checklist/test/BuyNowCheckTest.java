package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BuyNowCheckPage;
import com.qa.tums.eng.util.DataProviderCode;

public class BuyNowCheckTest extends BaseClass{
	
	BuyNowCheckPage bn;
	
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		bn = new BuyNowCheckPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyBuyNowBtn(String path) throws Exception {
		bn.getBuyNowCount(path);
		System.out.println("---->**************************************************<----");
		
	}

}
