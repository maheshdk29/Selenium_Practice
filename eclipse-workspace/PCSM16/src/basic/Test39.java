package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test39 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
		//System.out.println(element.isSelected());
		
		if(element.isSelected()) {
			System.out.println("Pass: checkbox selected");
		}else {
			System.out.println("Fail: checkbox is not selected");
		}
		
		element.click();
		if(element.isSelected()) {
			System.out.println("Pass: checkbox selected");
		}else {
			System.out.println("Fail: checkbox is not selected");
		}
		
		
	}

}
