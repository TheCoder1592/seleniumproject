package com.timetracking.actitime.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void selectOption(WebElement element, String option)
	{
		Select select=new Select(element);
		select.selectByVisibleText(option);
	}
	public String getTextOnWebPage(WebDriver driver, WebElement element)
	{
		return element.getText();
		
	}
}
