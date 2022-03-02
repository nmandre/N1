package selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button=[@id='doubleClickBtn']"));
		WebElement rightClickButton = driver.findElement(By.xpath("//button=[@id='rightClickBtn']"));
		
		Actions actions = new Actions(driver);
		
		//To perform double click button
		actions.doubleClick(doubleClickButton).build().perform();
		
		//To perform right click button
		actions.contextClick(rightClickButton).build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		WebElement source = driver.findElement(By.xpath("//div=[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div=[@id='simpleDropContainer']//div[@id='droppable]"));
		
		//To perform drag and drop operation
		actions.dragAndDrop(source, target).build().perform();
		WebElement revertMenu = driver.findElement(By.xpath("a[contains@id,'revertable']"));
		
		//To perform mouse hover actions
		actions.moveToElement(revertMenu).build();
		
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement imagesLink = driver.findElement(By.xpath("//a[text()='Images']"));
		actions.contextClick(imagesLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		driver.quit();
		


		


	}

}
