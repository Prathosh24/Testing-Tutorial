package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver dr;
	public static void main(String[] args) {
		String Browser="firefox";
		if(Browser.equals("edge")) {
		//	WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", "C:\\Users\\prath\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		    dr =new EdgeDriver();
		}
		else if(Browser.equals("chrome")) {
		//	WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 dr =new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
		//	WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\prath\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			 dr =new FirefoxDriver();
		}
		
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		Select sc=new Select(dr.findElement(By.cssSelector("select.product_sort_container")));
		sc.selectByIndex(1);
		sc.selectByIndex(0);
		sc.selectByIndex(2);
		sc.selectByIndex(3);
		sc.selectByValue("az");
		sc.selectByValue("za");
		sc.selectByValue("hilo");
		sc.selectByValue("lohi");
		sc.selectByVisibleText("Name (A to Z)");
		sc.selectByVisibleText("Name (Z to A)");
		sc.selectByVisibleText("Price (low to high)");
		sc.selectByVisibleText("Price (high to low)");
		//
		
	}

}
