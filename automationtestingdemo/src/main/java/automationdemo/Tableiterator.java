package automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tableiterator {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Echo Dot (3rd Gen)')]")).click();
	//	driver.findElement(By.className("a-bordered a-horizontal-stripes a-spacing-micro a-size-small ucc-comparison-table"));
		
        WebElement comparisonTable = driver.findElement(By.xpath("//table[contains(@class, 'a-bordered') and contains(@class, 'a-horizontal-stripes')]"));

		 java.util.List<WebElement> rows = comparisonTable.findElements(By.tagName("tr"));

	        // Iterate through each row
	        for (WebElement row : rows) {
	            // Get all cells in the current row
	            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

	            // Iterate through each cell and print the text
	            for (WebElement cell : cells) {
	                System.out.print(cell.getText() + "\t");
	            }
	            System.out.println();  // Move to the next line for the next row
	        }

	        // Close the browser
	        driver.quit();
	}	
}
