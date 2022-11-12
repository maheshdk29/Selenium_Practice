package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedtooltip = "Do not select if this computer is shared";
		//String expectedtooltip = driver.getPageSource();
		
		String actualtooltip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		System.out.println(actualtooltip);
		
		if(actualtooltip!=null) {
			if(expectedtooltip.contains(actualtooltip)) {
				System.out.println("Pass: Tooltip is same");
			}else {
				System.out.println("Fail: Tolltip is not same");
			}
		}else {
			System.out.println("Fail: actualtooltip attribute is not in source code");
		}
	}

}
