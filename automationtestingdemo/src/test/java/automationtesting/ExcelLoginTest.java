package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ExcelLoginTest {

    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void loginTest(String username, String password) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        // Add assertions or further actions as needed

        driver.quit();
    }
}