package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation;

public class Locators1 {

	public static void main(String[] args) {
		// 1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neham\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
		// 2. Maximize the Browser Window
		driver.manage().window().maximize();
		
		// 3. Enter Url and Launch the Application { URL = https://www.google.com/ }
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//identify user element using id locator
		WebElement usernameTextboxElement = driver.findElement(By.id("txtUsername"));
		
		//identify password element using name locator
		WebElement passwordTextboxElement = driver.findElement(By.name("txtPassword"));
		
		//identify login button element using classname locator
		WebElement loginButton = driver.findElement(By.className("button"));
		
		//identify logo element using tag name locator
		WebElement logo = driver.findElement(By.tagName("img"));
		
		//identifyy forgot password link using link text locator
		WebElement forgotPasswordLinkElement = driver.findElement(By.linkText("Forgot your password?"));
		
		//identifyy forgot password link using link text locator
		WebElement forgotPasswordLinkElement1 = driver.findElement(By.partialLinkText("Forgot"));
		
		//identify username Using css selector
		WebElement usernameCss = driver.findElement(By.cssSelector("input#txtUsername"));
		
		//identify login button element using css selector locator (class syntax)
		WebElement loginBtnCssElement = driver.findElement(By.cssSelector("input.Button"));
		
		//identify password page header element using css selector locator
		WebElement passwordCssElement = driver.findElement(By.cssSelector("input[type= 'password']"));
		
		
	}

}
