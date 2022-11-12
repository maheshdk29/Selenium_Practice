package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	@FindBy(id="logoutLink")
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	//create Costructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//create method
	public LoginPage Home() {
		logoutbutton.click();
		return new LoginPage(driver);
	}

	

}
