package com.leaftaps.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public MyLeadsPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
}
	public CreateLead clickCreateLead() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
	return new CreateLead(driver);
	}
}