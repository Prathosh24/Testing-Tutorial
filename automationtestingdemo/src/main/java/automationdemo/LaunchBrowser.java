package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
	//	driver.findElement(By.xpath("//a[@id='nav-hamburger-menu' ]")).click();
		
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute' and @id='nav-cart']")).click();   //cart
		
	//	driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_10']")).click();   //GIFT IDEAS

		driver.findElement(By.xpath("//a[text()='Home & Kitchen']")).click(); 	//HOME & KITCHEN
		
		driver.findElement(By.xpath("//span[text()='Prime']")).click();		//PRIME
		
		driver.findElement(By.xpath("//a[text()='New Releases']")).click();		//NEW RELEASES
		
		driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_6']")).click();		//ELECTRONICS
		
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_help']")).click();   //CUSTOMER SERVICE
	//	driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']")).click();
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();   //MOBILES
		driver.findElement(By.xpath("//a[@aria-label='Mobiles & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click();	 //MOBILES AND ACCESSORIES
		driver.findElement(By.xpath("//a[@aria-label='Laptops & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click();	//LAPTOPS AND ACCESSORIES
		driver.findElement(By.xpath("//a[@aria-label='TV & Home Entertainment, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click();		//TV&HOME ENTERTAINMENT
		driver.findElement(By.xpath("//A[@aria-label='Audio, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 		//AUIO
		driver.findElement(By.xpath("//A[@aria-label='Cameras, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 	//CAMERA
		driver.findElement(By.xpath("//A[@aria-label='Computer Peripherals, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 		//COMPUTER PHERIPERALS
		driver.findElement(By.xpath("//A[@aria-label='Smart Technology, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 		//SMART TECHNOLOGIES
		driver.findElement(By.xpath("//A[@aria-label='Musical Instruments, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 	//MUSISCAL INSTRUMENTS
		driver.findElement(By.xpath("//A[@aria-label='Office & Stationery, You are currently on a drop-down. To open this drop-down, Press Enter.']")).click(); 	//OFFICE & STATIONARY
		
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();		//TODAY'S DEALS
		
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2' and @data-csa-c-content-id='nav_cs_bestsellers']")).click();	//BESTSELLERS

		driver.findElement(By.xpath("//a[@data-csa-c-type='link' and @data-csa-c-slot-id='nav_cs_1']")).click();	//SELL

		driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();		//AMAZON MINI TV
		driver.findElement(By.xpath("//span[text()='Web Series']")).click();		//WEBSERIES
		driver.findElement(By.xpath("//span[@data-testid='appnavbar_menuitem_shortfilms']")).click();	//MOVIES
		driver.findElement(By.xpath("//span[@data-testid='appnavbar_menuitem_comedy']")).click();		//COMEDY
	}

}
