package pages;

import projectBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage clickLink() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

	/*public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}*/
	
	
	
	
	
	
	
	
	
}
