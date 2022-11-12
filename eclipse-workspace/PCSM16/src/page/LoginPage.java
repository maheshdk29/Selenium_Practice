package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(id="username")
	private WebElement usernametext;
	
	@FindBy(name="pwd")
	private WebElement passwordtext;
	
	public WebElement getUsernametext() {
		return usernametext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	//create Costructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//create method
	public HomePage Login(String usernamedata, String passworddata) {
		usernametext.sendKeys(usernamedata);
		passwordtext.sendKeys(passworddata);
		loginbutton.click();
		return new HomePage(driver);
		
	}

	@FindBy(id="loginButton")
	private WebElement loginbutton;

}
