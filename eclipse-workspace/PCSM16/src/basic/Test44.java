package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle element = driver.findElement(By.id("username")).getRect();
		System.out.println("startX="+element.getX());
		System.out.println("endY="+element.getY());
		System.out.println("Width="+element.getWidth());
		System.out.println("Height="+element.getHeight());

	}

}
