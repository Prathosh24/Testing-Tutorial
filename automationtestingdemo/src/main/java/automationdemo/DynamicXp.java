package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver wb=new EdgeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.amazon.in/");
		wb.findElement(By.xpath("(//a[@data-csa-c-content-id='nav_cs_mobiles']//preceding-sibling::a)[4]")).click();
		wb.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']//following::a[1]")).click();
						
				
	}

}
