package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.StyleTagVerificationPage;
import com.qa.tums.eng.util.DataProviderCode;

public class StyleTagVerficationTest extends BaseClass{
	
	StyleTagVerificationPage st;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		st = new StyleTagVerificationPage();
	}
	
//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test()
	private void findingStyleTag() throws Exception {
		st.verifyStyleTag();
		System.out.println("---->*********************************************************<----");
	}

}