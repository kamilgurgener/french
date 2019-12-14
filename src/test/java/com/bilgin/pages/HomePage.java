package com.bilgin.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
	
	@FindBy(xpath ="//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")
	public WebElement searchButton;
	
	
	public void anasafya() {
		Driver.getDriver().navigate().to("https://www.google.com");
	}
		
	public void aramaYap() {
		serachBox.sendKeys("Bilgin Yigit");
	}
	
	public void enterSearchButton() {
		searchButton.click();
	}
	
	public void validateList() {
		List <WebElement> allBilgins = Driver.getDriver().findElements(By.xpath("//h3[@class='LC20lb']"));
		
		
		for (int j = 0; j < allBilgins.size(); j++) {
			assertTrue(allBilgins.get(j).getText().toLowerCase().contains("bilgin"));
			System.out.println(allBilgins.get(j).getText());
		}
		
	}
	

}
