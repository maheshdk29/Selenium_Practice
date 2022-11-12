package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("username"));
		//System.out.println(element);
		
		if(element.isEnabled()) {
			System.out.println("Pass: Textfield is enable");
		}else {
			System.out.println("Fail: Textfield is not enable");
		}

	}

}
