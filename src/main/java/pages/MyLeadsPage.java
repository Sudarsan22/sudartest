package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
}