package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singleSel = new Select(driver.findElement(By.id("select.demo")));
		singleSel.selectByValue("Tuesday");
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(1);
			mulSel.selectByVisibleText("Texas");
			mulSel.selectByValue("New York");
			List<WebElement> items = mulSel.getAllSelectedOptions();
			System.out.println("Number of Selected Options : "+items.size());
			mulSel.deselectByIndex(1);
		}
	
	}

}
