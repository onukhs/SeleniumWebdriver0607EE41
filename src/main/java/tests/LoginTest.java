package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.LoginFlow;


public class LoginTest extends LoginFlow {

    @Test
    public void successLoginTest() {
        doLogin("standard_user");
        driver.findElement(By.id("shopping_cart_container"));
    }

    @Test
    public void loginAsBlockedUserTest() {
        doLogin("locked_out_user");
        driver.findElement(By.xpath("//*[contains(text(), 'Epic sadface: Sorry, this user has been locked out.')]"));
    }

    @Test
    public void loginAsNonExistingUserTest() {
        doLogin("potato");
        driver.findElement(By.xpath("//*[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
    }
}
