package pages;

import org.openqa.selenium.By;

import projectBase.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage getName(String eFname) {
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(firstname.equals(eFname)) {
			System.out.println("First name is correct : "+firstname);
		}
		else {
			System.out.println("First name is incorrect : "+firstname);
		}			
		return this;
	}	

}