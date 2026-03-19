package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginSubmit;

    public void loginToRoblox(String user, String pass) {
        // 20 seconds explicit wait setup
        WebDriverWait wait = new WebDriverWait(driver, 20);
        
        try {
            // 1. Username field click panni type panra alavukku ready aagura varai wait pannu
            wait.until(ExpectedConditions.elementToBeClickable(username));
            
            // 2. Direct-ah type pannama, first click pannitu aprum type pannunga
            username.click();
            fillText(username, user);
            
            password.click();
            fillText(password, pass);
            
            wait.until(ExpectedConditions.elementToBeClickable(loginSubmit));
            btnClick(loginSubmit);
            
            System.out.println("Login details entered successfully!");
        } catch (Exception e) {
            System.out.println("Error occurs during login: " + e.getMessage());
        }
    }
}