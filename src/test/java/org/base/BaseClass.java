package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static WebDriver driver;

    public void launchBrowser() {
        // 1. First, setup the driver
        WebDriverManager.chromedriver().setup();
        
        // 2. Second, CREATE the driver object (Ippo dhaan driver-ku memory kidaikum)
        driver = new ChromeDriver();
        
        // 3. Third, ippo dhaan manage() and timeouts() use pannanum
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void loadUrl(String url) {
        driver.get(url);
    }

    public void fillText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void btnClick(WebElement element) {
        element.click();
        System.out.println("success");
    }
}