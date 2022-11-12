package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		
		driver.findElement(By.linkText("jdk-11.0.16_linux-aarch64_bin.deb")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("Download jdk-11.0.16_linux-aarch64_bin.deb"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		if(element.isEnabled()) {
			System.out.println("pass:Element is enable ");
		}
		else {
			System.out.println("Fail:Element is not enable ");
		}

	}

}
