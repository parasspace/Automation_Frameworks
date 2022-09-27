package org.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

    static WebDriver driver;

    @Test
    public void verifyGoogle(){
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

}
