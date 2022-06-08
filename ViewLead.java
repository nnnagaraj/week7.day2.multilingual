package com.leaftaps.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods {

	public ViewLead(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
	}

	public ViewLead verifyLeadID() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println(leadID);
		return this;
	}

}