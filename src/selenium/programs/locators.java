package selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
	// System.setProperty("webdriver.chrome.driver", "C:\\SeamsNewRepo\\FirstJavaProject630\\Drivers\\chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "C:\\SeamsNewRepo\\FirstJavaProject630\\Drivers\\geckodriver.exe");
	// System.setProperty("webdriver.edge.driver", "C:\\SeamsNewRepo\\FirstJavaProject630\\Drivers\\msedgedriver.exe");
	// 1. Launch Chrome Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\neham\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	// 2. Maximize the Browser Window
	driver.manage().window().maximize();
	
	// 3. Enter Url and Launch the Application { URL = https://www.google.com/ }
	driver.get("https://www.google.com/&quot;");
	
	// 4. Get the title of WebSite
	System.out.println(driver.getTitle());
	
	// 5. Close the Browser
	driver.close();


}


}