package com.leaftaps.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
}	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(property.getProperty("homePage.leads.linktext"))).click();
		return new MyLeadsPage(driver);
	}

}