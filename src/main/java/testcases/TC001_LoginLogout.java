package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import projectBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="createlead";

	}
	@Test(dataProvider="fetchData")
	public void loginTestcase(String Cname, String Fname, String Lname,String uName, String password) {
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(password)
		.clickLogin()
		.clickLink()
		.clickLeads()
		.clickCreateLeads()
		.enterCname(Cname)
		.enterfname(Fname)
		.enterlastName(Lname)
		.clickSubmit()
		.getName(Fname);		
		
		
		
		
		
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		HomePage hp = new HomePage();
		hp.clickLogout();*/
	}
	
	
	
	
	
	
	
	
	
}
