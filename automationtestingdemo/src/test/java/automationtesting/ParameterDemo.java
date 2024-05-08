package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterDemo {
	static WebDriver dr;
	//String Browser;
	
	@Test
	@Parameters({"browser"})
		public void testParam(String browser) {
			if(browser.equals("edge")) {
				//	WebDriverManager.edgedriver().setup();
					System.setProperty("webdriver.edge.driver", "C:\\Users\\prath\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				    dr =new EdgeDriver();
				}
				else if(browser.equals("chrome")) {
				//	WebDriverManager.chromedriver().setup();
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					 dr =new ChromeDriver();
				}
				else if(browser.equals("firefox")) {
				//	WebDriverManager.firefoxdriver().setup();
					System.setProperty("webdriver.firefox.driver", "C:\\Users\\prath\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
					 dr =new FirefoxDriver();
				}
				
				dr.manage().window().maximize();
				dr.get("https://www.saucedemo.com/v1/");
				System.out.println("Launching Browser");
	}
			@Parameters({"a","b"})	
			@Test
			
				public void addNum(int a,int b) {
					int c=a+b;
					System.out.println(c);
				}
			
			@Parameters({"a","b"})	
			@Test
			
				public void subNum(int a,int b) {
					int c=a-b;
					System.out.println(c);
				}
			@Parameters({"a","b"})	
			@Test
			
				public void subMulti(int a,int b) {
					int c=a*b;
					System.out.println(c);
				}
		}

