package automationtesting;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginDp {
	static EdgeDriver dr;
	@Test(dataProvider="credentials")
	public static void launchBrowser(String username,String password) {
		
				System.setProperty("webdriver.edge.driver", "C:\\Users\\prath\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			    dr =new EdgeDriver();
			    dr.manage().window().maximize();
			    dr.get("https://www.saucedemo.com/v1/");
			    dr.findElement(By.cssSelector("input#user-name")).sendKeys(username);
			    dr.findElement(By.cssSelector("input#password")).sendKeys(password);
	}
	@DataProvider(name="credentials")
	public Object[][] credentials(){
		return new Object[][]{
		{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"problem_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"}
	};

	}
}
