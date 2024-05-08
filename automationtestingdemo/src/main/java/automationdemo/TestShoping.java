package automationdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestShoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver wd=new EdgeDriver();
		wd.get("https://tutorialsninja.com/demo");
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//a[text()='Cameras']")).click();
		wd.findElement(By.xpath("//a[text()='Laptops & Notebooks (5)']")).click();
		wd.findElement(By.xpath("//img[@title='MacBook' and @class='img-responsive']")).click();
		wd.findElement(By.cssSelector("button#button-cart")).click();
		wd.findElement(By.xpath("//button[@data-toggle='dropdown' and @data-loading-text='Loading...']")).click();
		
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//strong[text()='Checkout']")).click();
		wd.findElement(By.xpath("//input[@type='radio' and @value='guest']")).click();
		wd.findElement(By.cssSelector("input#button-account")).click();
		wd.findElement(By.id("input-payment-firstname")).sendKeys("PA");
		wd.findElement(By.id("input-payment-lastname")).sendKeys("Test");
		wd.findElement(By.id("input-payment-email")).sendKeys("patestcase@yopmail.com");
		wd.findElement(By.id("input-payment-telephone")).sendKeys("9999999999");
		
		wd.findElement(By.id("input-payment-company")).sendKeys("ABC company");
		wd.findElement(By.id("input-payment-address-1")).sendKeys("ABC Road");
		wd.findElement(By.id("input-payment-address-2")).sendKeys("DEF Nagar");
		wd.findElement(By.id("input-payment-city")).sendKeys("Bangalore");
		wd.findElement(By.id("input-payment-postcode")).sendKeys("560066");
		Select scd=new Select(wd.findElement(By.id("input-payment-country")));
		scd.selectByVisibleText("India");
	//	wd.findElement(By.id("input-payment-country")).sendKeys("India");
		Select scd1=new Select(wd.findElement(By.id("input-payment-zone")));
		scd1.selectByVisibleText("Karnataka");
	//	wd.findElement(By.id("input-payment-zone")).sendKeys("Karnataka");

		wd.findElement(By.cssSelector("input#button-guest")).click();
		
	//	wd.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Test Order");
	//	wd.findElement(By.cssSelector("input#button-payment-method")).click();
		
		wd.findElement(By.xpath("//textarea[@name='comment' and @class='form-control']")).sendKeys("Test Order");
		wd.findElement(By.xpath("//input[@type='checkbox' and @name='agree']")).click();
		wd.findElement(By.id("button-payment-method")).click();
	}

}
