package org.pages;
	import org.base.BaseClass;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage extends BaseClass {
	    public HomePage() {
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[text()='Log In']")
	    private WebElement loginBtn;

	    public WebElement getLoginBtn() {
	        return loginBtn;
	    }

	    public void goToLoginPage() {
	        btnClick(getLoginBtn());
	    }
	}

