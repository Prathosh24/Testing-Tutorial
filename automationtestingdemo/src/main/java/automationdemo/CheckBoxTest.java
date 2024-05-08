package automationdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd=new EdgeDriver();
		wd.get("https://www.sugarcrm.com/au/request-demo");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement locator1=wd.findElement(By.xpath("//a[text()='Details']"));
		String tagname=locator1.getTagName();
		String text=locator1.getText();
		Dimension size=locator1.getSize();
		System.out.println("TagName: "+tagname);
		System.out.println("Text: "+text); 
		System.out.println(size);
		
		
		locator1.click();
		
		WebElement checkboxS=wd.findElement(By.cssSelector("input#CybotCookiebotDialogBodyLevelButtonNecessaryInline"));
		if (checkboxS.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
		
		WebElement checkboxSE=wd.findElement(By.cssSelector("input#CybotCookiebotDialogBodyLevelButtonPreferencesInline"));
		if (checkboxSE.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
		
		WebElement checkboxEn=wd.findElement(By.cssSelector("input#CybotCookiebotDialogBodyLevelButtonNecessaryInline"));
		if (checkboxEn.isEnabled()) {
            System.out.println("Checkbox is disabled");
        } else {
            System.out.println("Checkbox is enabled");
        }
		
		WebElement checkboxNE=wd.findElement(By.cssSelector("input#CybotCookiebotDialogBodyLevelButtonPreferencesInline"));
		if (checkboxNE.isEnabled()) {
            System.out.println("Checkbox is disabled");
        } else {
            System.out.println("Checkbox is enabled");
        }
		
		WebElement elementDisp=wd.findElement(By.cssSelector("button#CybotCookiebotDialogDetailBodyContentCookieContainerUnclassified"));
		if (elementDisp.isDisplayed()) {
            System.out.println("element is displayed");
        } else {
            System.out.println("element is not displayed");
        }
		
		WebElement elementNDisp=wd.findElement(By.cssSelector("button#CybotCookiebotDialogDetailBodyContentCookieContainerUnclassified"));
		if (elementNDisp.isDisplayed()) {
            System.out.println("element is displayed.");
        } else {
            System.out.println("element is not displayed.");
        }
		
		
		WebElement locator=wd.findElement(By.id("CybotCookiebotDialogBodyLevelButtonPreferencesInline"));
		
		String attributeval1=locator.getAttribute("class");
		String attributeval2=locator.getAttribute("data-target");
//		String attributeval3=locator.getAttribute("");
		System.out.println("Attribute1: "+attributeval1);
		System.out.println("Attribute2: "+attributeval2);
//		System.out.println(attributeval3);
		String tagname1 = locator.getTagName();
		System.out.println("TagName: "+tagname1);
        


		
	}
	

}
