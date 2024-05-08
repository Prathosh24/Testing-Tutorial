package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActKi {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver wa=new EdgeDriver();
		wa.manage().window().maximize();
		wa.get("https://jqueryui.com/droppable/");
		Actions ac=new Actions(wa);
		
	//	WebElement locator=wa.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
	//	ac.moveToElement(locator).perform();
		WebElement xp=wa.findElement(By.xpath("//iframe[@class='demo-frame']"));
		wa.switchTo().frame(xp);
		WebElement dra=wa.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=wa.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(dra, drop).perform();
		
		//switchTo();
	}

}
