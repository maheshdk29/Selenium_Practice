package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//String element = driver.findElement(By.id("username")).getAttribute("value");//true
		//String element = driver.findElement(By.id("username")).getAttribute("name");//false
		String element = driver.findElement(By.id("username")).getAttribute("mahesh");
		System.out.println(element);
		
	}

}
