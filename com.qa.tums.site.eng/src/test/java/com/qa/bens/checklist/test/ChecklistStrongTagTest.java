package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListStrongTagPage;
import com.qa.tums.eng.util.DataProviderCode;

public class ChecklistStrongTagTest extends BaseClass{

	
	CheckListStrongTagPage st;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		st = new CheckListStrongTagPage();
	}


	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingStrongTag(String path) throws Exception {
		st.verifyStrongTag(path);
		System.out.println("*****************************************");
		
	}
}




