package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("keepLoggedInLabel"));
		//System.out.println(element.isSelected());
		
		if(element.isSelected()) {
			System.out.println("true: checkbox is selected");
		}else {
			System.out.println("false: checkbox is not selected");
		}
		
		element.click();
		if(element.isSelected()) {
			System.out.println("true: checkbox is selected");
		}else {
			System.out.println("false: checkbox is not selected");
		}
		

	}

}
