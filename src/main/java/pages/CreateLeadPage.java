package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage enterCname(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		return this;
	}
	
	public CreateLeadPage enterfname(String Fname) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;
	}
	
	public CreateLeadPage enterlastName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}
	public ViewLeadPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

	
}