package com.bilgin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bilgin.utilities.Driver;


public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath ="//input[@name='q']")
	public WebElement serachBox;
	
		
	public void aramaYap() {
		serachBox.sendKeys("Bilgin Yigit");
	}

}
