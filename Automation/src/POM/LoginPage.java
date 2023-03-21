package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {  //load non static members is work of constructor
	PageFactory.initElements(driver, this); //init will load findby into constructor
	
	}
	//Element Identification
	
@FindBy(id = "email")
WebElement usernameTextField;

@FindBy(name="pwd")
WebElement passwordTextField;

@FindBy(xpath = "//div[text()='Login ']")
WebElement loginButton;

  //business logic - repetetive task we handle here

public void loginAction(String username, String password)
{
	usernameTextField.sendKeys(username);
	passwordTextField.sendKeys(password);
	loginButton.click();
}
}

