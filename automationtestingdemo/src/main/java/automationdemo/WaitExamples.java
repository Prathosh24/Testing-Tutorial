package automationdemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExamples {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
    //    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");

		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofMillis(1000))
		            .ignoring(NoSuchElementException.class);	
		
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

}
}
