package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

import page.HomePage;
import page.LoginPage;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		//02 LoginPage lp = new LoginPage(driver);
		//02 lp.Login("admin", "manager");
		
		new LoginPage(driver).Login("admin", "manager").Home();
		
		
		//01 PageFactory.initElements(driver, lp);
		//01 lp.getUsernametext().sendKeys("Pune");
		//01 driver.navigate().refresh();
		//01 lp.getUsernametext().sendKeys("admin");
		//01 lp.getPasswordtext().sendKeys("manager");
		//01 lp.getLoginbutton().click();
		
		//02 HomePage hp = new HomePage(driver);
		//02 hp.Home();
		//01 PageFactory.initElements(driver, hp);
		//01.hp.getLogoutbutton().click();

	}

}
