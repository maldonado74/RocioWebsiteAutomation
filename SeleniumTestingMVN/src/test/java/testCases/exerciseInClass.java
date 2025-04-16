package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exerciseInClass {

	static String browser = "chrome";
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if(browser.equals("chrome"))
		{
			//ChromeDriver driver = new ChromeDriver();
		 driver = new ChromeDriver();
			
		}else if(browser.equals("firefox"))
		{
		 driver = new FirefoxDriver();
			
		}else if(browser.equals("safari"))
		{
		 driver = new SafariDriver();
			
		}
		String url = "https://www.journeytoautomation.org/practice/auth";
		//driver.get("https://www.journeytoautomation.org/practice/auth");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[2]/button")).click(); //will click the next button of the email
		
		//WebElement pass = driver.findElement(By.id("password"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("fewrewfe");
		//password.sendKeys("fwerewf");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[2]/button[2]")).click();
		WebElement error = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[1]/div[3]"));

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				WebElement errorMsg = wait.until(ExpectedConditions.visibilityOf(error));
				//System.out.println(errorMsgPrint.getText());
				
		System.out.println(errorMsg.getText());
		
		/*Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofMinutes(5))
		            .pollingEvery(Duration.ofSeconds(20));
		            .ignoring(ElementNotInteractableException.class);
*/
		
		
		
		
		
		
		
		
		
		
		//WebElement errorMsg = driver.findElement(By.className("error-message"));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement errorMsgPrint = wait.until(ExpectedConditions..visibilityOf(errorMsg));
		//System.out.println(errorMsgPrint.getText());
		
		
		
		//String error = errorMsg.getText();
		//System.out.println(error);
		
		
		
		//Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 //   WebElement element = wait.until(
		 //                       ExpectedConditions.elementToBeClickable(By.id(item)));
		    
		//driver.findElement(By.id("password")).sendKeys("admin");
	}

}
