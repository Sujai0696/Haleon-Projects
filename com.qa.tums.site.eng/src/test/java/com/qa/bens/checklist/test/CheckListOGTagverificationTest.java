package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListOGTagverificationPage;
import com.qa.tums.eng.util.DataProviderCode;

public class CheckListOGTagverificationTest extends BaseClass{
	
	CheckListOGTagverificationPage ogTag;
	
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ogTag = new CheckListOGTagverificationPage();
	}


	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void findingOGTag(String path) throws Exception {
		ogTag.verifyingOGTag(path);
		System.out.println("---->**********************************************<----");
	}
	
	

}
