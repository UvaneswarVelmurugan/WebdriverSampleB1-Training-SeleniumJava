package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement menu=driver.findElement(By.xpath("//span[contains(text(), 'My Account')]"));
		WebElement submenu=driver.findElement(By.xpath("//ul//a[contains(text(), 'Register')]"));
		actions.moveToElement(menu).perform();
		actions.click();
		actions.click(submenu).perform();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Uvaneswar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Velmurugan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("uvaneswarvelmurugan@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Uvaneswar@632");
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']")).click();
		
		

	}

}
