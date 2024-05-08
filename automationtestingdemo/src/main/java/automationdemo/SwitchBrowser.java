package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBrowser {
	
	public static WebDriver dr;
	public static void main(String[] args) {
		String Browser="edge";
		switch(Browser){
			case "chrome":
				WebDriverManager.chromedriver().setup();
						 dr =new ChromeDriver();
			break;
			case "edge":
				WebDriverManager.edgedriver().setup();
					    dr =new EdgeDriver();
			break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
						 dr =new FirefoxDriver();
			default:
				System.out.println("Select a valid web browser");
				
		}
	
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.id("user-name")).sendKeys("locked_out_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		
		
	}
}
