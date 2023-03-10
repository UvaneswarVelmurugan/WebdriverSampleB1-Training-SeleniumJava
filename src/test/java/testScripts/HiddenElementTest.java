package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("Agile Testing");
		System.out.println("Clear Button is Hidden");
//		driver.findElement(By.className("ui-input-clear ui-btn ui-icon-delete ui-btn-icon-notext ui-corner-all")).click();
//		driver.findElement(By.tagName("a href")).click();
		WebElement age = driver.findElement(By.className("ui-input-clear ui-btn ui-icon-delete ui-btn-icon-notext ui-corner-all"));
			age.click();
			System.out.println("Cleared text");


	}

}
