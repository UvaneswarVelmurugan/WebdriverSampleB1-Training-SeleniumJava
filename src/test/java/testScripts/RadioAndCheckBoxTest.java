package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		WebElement age = driver.findElement(By.id("isAgeSelected"));
//		if(!age.isSelected()) {
//			age.click();
//		}
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("(//label[contains(text(), 'Female')])[1]")).click();

	}

}
