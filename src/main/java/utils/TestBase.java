package utils;

import org.junit.After;
import org.junit.Before;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get("https://www.saucedemo.com/");

        System.out.println("INFO : Browser is opened");
    }

    @After
    public void shutDown() {
        driver.close();
        driver.quit();

        System.out.println("INFO : Browser is closed");
    }
}
