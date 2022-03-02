package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		        // 1. Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\neham\\eclipse-workspace\\hello\\drivers\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
				
				// 2. Maximize the Browser Window
				driver.manage().window().maximize();
				
				// 3. Enter Url and Launch the Application { URL = https://www.google.com/ }
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				//identify login panel header using absolute xpath locator
				WebElement loginPanelHeaderElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[1]"));
				
				//identify username element using relative xpath locator
				//tagName[@attribute = 'attribute value']
				WebElement loginPanel1 = driver.findElement(By.xpath("//div[@id = 'logInPanelHeading']"));
				
				//tagName[Text() = 'TextValue']
				WebElement loginPanel2 = driver.findElement(By.xpath("//div[Text() = 'LOGIN Panel']"));

				//tagName[contains(@Attribute,'PartialAttributeValue')]
				//tagName[starts-with(@Attribute,'PartialAttributeValue')]
				
				//tagName[contains(text(),'PartialTextValue')]
				//tagName[starts-with(text(),'PartialTextValue')]
				
				WebElement loginPanel3 = driver.findElement(By.xpath("//div[contains(@id,'Heading')]"));
				WebElement loginPanel4 = driver.findElement(By.xpath("//div[starts-with(@id,'login')]"));
				
				WebElement loginPanel5 = driver.findElement(By.xpath("//div[contains(@id,'Panel')]"));
				WebElement loginPanel6 = driver.findElement(By.xpath("//div[starts-with(text(),'LOGIN')]"));
                
				//tagName[(@Attribute = 'AttributeValue') and (@Attribute2 = 'AttributeValue2')]
				//tagName[@Attribute = 'AttributeValue') and (text() = 'TextValue')]
				//tagName[contains(@Attribute = 'PartialAttributeValue') and (text() = 'TextValue')]
				
				WebElement loginPanel7 = driver.findElement(By.xpath("//div[@id = 'logInPanelHeading') and (text() = 'LOGIN Panel')]"));
				WebElement loginPanel8 = driver.findElement(By.xpath("//div[contains(@id = 'Heading') and contains(text(), 'Panel')]"));  

				//using relationships
				WebElement ESS = driver.findElement(By.xpath("//tbody/child::tr[1]/child::td[3]"));  
                //using sibling
				WebElement ESS2 = driver.findElement(By.xpath("//td[text()='Ananya Dash']/preceding-sibling::td[text()='ESS']"));
	}
}
				
