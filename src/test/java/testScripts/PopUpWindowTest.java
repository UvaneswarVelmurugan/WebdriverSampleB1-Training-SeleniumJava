package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win Handle : "+parentWin);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	    Set<String> tabs = driver.getWindowHandles();
	    System.out.println("Number of Windows : "+tabs.size());
	    for(String tab : tabs) {
	    	if(!tab.equalsIgnoreCase(parentWin)) {
	    		driver.switchTo().window(tab);
	    		driver.findElement(By.xpath("//span[contains(text(),'Java')])[1]")).click();
	    	}
	    }

	}

}
