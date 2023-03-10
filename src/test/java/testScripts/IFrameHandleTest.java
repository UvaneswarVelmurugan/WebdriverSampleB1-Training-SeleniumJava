package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		WebElement para=driver.findElement(By.xpath("//body[@id='tinymce']"));
		para.clear();
		para.sendKeys("I am Uvaneswar and I am From Mechanical Background");

	}

}
