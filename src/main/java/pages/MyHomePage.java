package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		//driver.findElementByLinkText("").sendKeys(uName);
		return new MyLeadsPage();
	}
	
	
	}
	