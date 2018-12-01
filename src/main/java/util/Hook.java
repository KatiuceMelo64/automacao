package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	protected static WebDriver driver;
	
	@Before
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@After
	public void after() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return  driver;
		
	}
	
}
