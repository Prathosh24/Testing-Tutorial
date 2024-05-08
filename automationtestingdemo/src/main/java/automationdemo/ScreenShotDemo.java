package automationdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		takeScreenShot("homepage");
		// TODO Auto-generated method stub
		
	}
	public static void takeScreenShot(String ScreenShot) throws IOException {
		File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File("C:\\Users\\prath\\Documents\\shiash\\New folder\\automationtesting\\test-output\\"+ScreenShot+".jpg"));
	}

}
