package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    // 1. Search Box Locator 
    @FindBy(xpath = "//input[contains(@placeholder, 'Search')]")
    private WebElement searchBox;

    // 2. IT Girl Game Locator
    @FindBy(xpath = "(//div[contains(text(),'IT Girl')])[1]")
    private WebElement itGirlGame;

    // 3. Execution Method 
    public void searchAndClickGame(String gameName) {
        try {
            Thread.sleep(5000); 
            searchBox.click();
            searchBox.sendKeys(gameName, Keys.ENTER);
            System.out.println("Searching for: " + gameName);
            Thread.sleep(3000); 
            itGirlGame.click();
            System.out.println(gameName + " game selected!");
            
        } catch (Exception e) {
            System.out.println("Search process error: " + e.getMessage());
        }
    }

    @FindBy(xpath = "//button[contains(@class, 'PlayButton')] | //span[contains(@class, 'icon-common-play')]")
    private WebElement bluePlayBtn;
    
    @FindBy(xpath = "//button[@type='button' and contains(@class, 'btn-common-play-button')]")
    private WebElement greenPlayBtn;

    public void clickPlayAndDownload() {
        try {
            btnClick(bluePlayBtn);
            System.out.println("Blue Play button clicked!");
            Thread.sleep(5000); 
            btnClick(greenPlayBtn);
            System.out.println("Green Play button clicked! Download/Launch process started.");
            
        } catch (Exception e) {
            System.out.println("Play button click error: " + e.getMessage());
        }
    }
}

