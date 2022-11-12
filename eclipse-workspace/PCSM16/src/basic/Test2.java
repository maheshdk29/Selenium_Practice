package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.getPageSource();
		String actualpagesource = driver.getPageSource();
		//System.out.println(element);
		String expectedpagesource = "Administrator:	Username: admin\r\n"
				+ "Password: manager\r\n"
				+ "Regular User:	Username: trainee\r\n"
				+ "Password: trainee\r\n"
				+ "";
		if(actualpagesource.contains(expectedpagesource)) {
			System.out.println("pass: text is present in html");
		}
		else {
			System.out.println("fail: text is not present in html");
		}
	}

}
