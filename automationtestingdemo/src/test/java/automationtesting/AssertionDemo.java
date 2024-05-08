package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	static WebDriver driver;

	@Test
	public void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		SoftAssert sa=new SoftAssert();
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		String titleexpected="Swag Lab";
		String titleactual=driver.getTitle();
		sa.assertEquals(titleexpected, titleactual);
		System.out.println("statement running");
		sa.assertAll();
	}
		 @AfterMethod
		    public void tearDown() {
		        
		        driver.quit();
	}
}
