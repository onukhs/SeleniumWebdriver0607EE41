package utils;

import org.openqa.selenium.By;

public class LoginFlow extends TestBase {

    public void doLogin(String username) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
    }
}
