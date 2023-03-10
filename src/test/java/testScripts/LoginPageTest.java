package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//		driver.findElement(By.xpath("//input[@type='username']")).sendKeys("tomsmith");
//		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
//		driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
//		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("tomsmith");
		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.cssSelector("radius")).click();
		driver.findElement(By.tagName("button")).click();
		String strMsg  = driver.findElement(By.cssSelector(".flash.success")).getText();
		System.out.println(strMsg);
	}

}
