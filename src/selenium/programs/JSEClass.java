package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		WebElement interactionMenu = driver.findElement(By.xpath("//div[text()='Interactions']"));
		
		//method to scroll down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//method to perform click
		js.executeScript("arguments[0].scrollIntoView()", interactionMenu);
		interactionMenu.click();
		
		WebElement textBox = null;
		
		//method to enter information in text
		js.executeScript("arguments[0].value = 'text'", textBox);

		Thread.sleep(3000);
		driver.close();
		

	}

}
