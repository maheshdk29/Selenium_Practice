package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String element = driver.findElement(By.id("username")).getAttribute("value");//true
		//String element = driver.findElement(By.id("username")).getAttribute("name");//false

		System.out.println(element.isEmpty());
		
		if(element.isEmpty()) {
			System.out.println("Pass:Element is empty");
		}else {
			System.out.println("Fail:Element is not empty");
		}
	}

}
