package selenium.programs;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	private static final Function ExpectedCondition = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		
		// 1. Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
		
		// 3. Launch the Application  { URL = https://opensource-demo.orangehrmlive.com/ }
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String URL ="https://opensource-demo.orangehrmlive.com/";
		driver.get("URL");
		// to navigate to WebSite
		driver.navigate().to("URL"); 
		// to go back previous website
		driver.navigate().back();
		// to get next website
		driver.navigate().forward();
		//to reload the website
		driver.navigate().refresh();
		
		// 4. Verify Application Login Page title
		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println(" Application Title as Expected");
			} else {
			System.out.println("Application Title is Wrongly updated");
			}
		
		// 5. Verify Login Page Header Text  { Header = LOGIN Panel }
		WebElement logInPanelHeading = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		if(logInPanelHeading.getText().equals("LOGIN Panel")) {
		System.out.println(" Application Header as Expected");
		} else {
		System.out.println("Application Header is Wrongly updated");
		}
		
		// 6. Verify Username and Password text boxes

		WebElement usernameTextbox = driver.findElement(By.xpath("//input[contains(@name,'Username')]"));
		WebElement passwordTextbox = driver.findElement(By.xpath("//input[contains(@name,'Password')]"));

		if (usernameTextbox.isDisplayed() && usernameTextbox.isEnabled()) {
		System.out.println(" Username Textbox is available to perform actions");
		} else {
		System.out.println(" Username Textbox is NOT available to perform actions");
		}

		if (passwordTextbox.isDisplayed() && passwordTextbox.isEnabled()) {
			System.out.println(" Password Textbox is available to perform actions");
			} else {
			System.out.println(" Password Textbox is NOT available to perform actions");
			}

		// 7. Enter Username and Password  {admin , admin123 }
		usernameTextbox.clear();
		passwordTextbox.clear();

		usernameTextbox.sendKeys("admin");
		passwordTextbox.sendKeys("admin123");

		if(usernameTextbox.getAttribute("value").equals("admin") && passwordTextbox.getAttribute("value").equals("admin123")) {
		System.out.println("Correct Text Entered");
		}else {
		System.out.println("Wrong Text Entered");
		}
		
		// 8. Click on Sign-In Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));

		if(loginButton.getAttribute("value").equals("LOGIN")) {
		System.out.println("Correct Label Updated");
		}else {
		System.out.println("Wrong Label Updated");
		}
		
		loginButton.click();
		
		//Java wait time- to hold execution process.
		Thread.sleep(10000);
		
		//Selenium wait
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(" "), 0));
		
		//Fluent wait
		Object withTimeUnit;
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS);
		fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(" "), 0)); 
		
	   //9.Click on admin menu button
		WebElement adminButton = driver.findElement(By.xpath("//a[@id=menu_admin_viewAdminModule"));
		adminButton.click();
		
		//10.Select option from user role dropdown(ESS)
		WebElement userRole = driver.findElement(By.xpath("//select[@id=searchSystemUser_userType"));
		Select s = new Select(userRole);
		//s.selectByIndex(2);
		//s.selectByValue("2");
		s.selectByVisibleText("ESS");
		
		//11.select all user checkbox
		WebElement selectAllCheckBox = driver.findElement(By.xpath("//input[@name=chkSelectAll"));
		if (!selectAllCheckBox.isSelected()) 
			selectAllCheckBox.click();
		
		//12.navigate to workshift URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/workshift");
		
		//13.click on add shift button
		WebElement addButton = driver.findElement(By.xpath("//input[@name=btnAdd"));
		addButton.click();
		
		//14.select multiple employees from available employee multi select dropdown
		WebElement shiftDetails = driver.findElement(By.xpath("//select[@id='workShift_availableEmp']"));
		Select sel = new Select(shiftDetails);
		if (sel.isMultiple()) {
			sel.selectByIndex(0);
			sel.selectByValue("3");
			sel.selectByVisibleText("Kallyani Bhute");
			
			sel.deselectByIndex(0);
			sel.deselectByValue("3");
			sel.deselectByVisibleText("Kallyani Bhute");
			
		//15.click on my info main button
		WebElement myInfo = driver.findElement(By.xpath("//b[text()='My Info']"));
		
		//16.click on Edit personal details button
		WebElement editDetails = driver.findElement(By.xpath("//input[@id='btnSave']"));
		editDetails.click();
		
		//17.select gender as female
		WebElement gender = driver.findElement(By.xpath("//lable[@for='personal_optGender_2']"));
        gender.click();
        
        //18.navigate to google page
        driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //19.verify the google Images link
		WebElement imagesLink = driver.findElement(By.xpath("//a[text()='Images']"));
        if (imagesLink.getAttribute("href").equals("https://www.google.co.in/imghp?hl=en&ogbl\\")) {
        		System.out.println("correct URL updated");
		}else {
    		System.out.println("wrong URL updated");
		}
    		WebElement imagesLink1 = null;
			imagesLink1.click();
    		if (driver.getCurrentUrl().equals("https://www.google.co.in/imghp?hl=en&ogbl\\")) {
				
			}else {
	    		System.out.println("wrong URL updated");
			}
    		
    		WebElement imagesLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
    		if (imagesLogo.isDisplayed()) {
        		System.out.println("correct URL updated");
    		}else {
        		System.out.println("wrong URL updated");
    		}
    		
    		//20.close browser
    		driver.close(); // to close current window
    		driver.quit();  // to close all windows opened by selenium together
		}
	}
}


