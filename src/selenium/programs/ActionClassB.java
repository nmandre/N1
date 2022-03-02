package selenium.programs;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassB {


public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

Thread.sleep(3000);

driver.manage().window().maximize();

driver.get("https://demoqa.com/buttons&quot;");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

Actions action = new Actions(driver);

//to perform double click
action.doubleClick(doubleClickButton).build().perform();

//toperform right click
action.contextClick(rightClickButton).build().perform();

driver.navigate().to("https://demoqa.com/droppable&quot;");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement target = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));

//to perform drag and drop operation
action.dragAndDrop(source, target).build().perform();

WebElement revertMenu = driver.findElement(By.xpath("//a[contains(@id,'revertable')]"));

//to perform mouse hover action
action.moveToElement(revertMenu).build().perform();


driver.navigate().to("https://www.google.com/&quot;");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

WebElement imagesLink = driver.findElement(By.xpath("//a[text()='Images']"));
action.contextClick(imagesLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

driver.quit();




}


}