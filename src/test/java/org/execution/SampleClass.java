package org.execution;
import org.base.BaseClass;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.pages.SearchPage;

public class SampleClass extends BaseClass {
	  public static void main(String[] args) {
	        SampleClass s = new SampleClass();
	        
	        // 1. Browser Setup
	        s.launchBrowser();
	        s.loadUrl("https://www.roblox.com/");

	        // 2. Home Page Action
	        HomePage hp = new HomePage();
	        hp.goToLoginPage();

	        // 3. Login Page Action
	        LoginPage lp = new LoginPage();
	        lp.loginToRoblox("vinothini8730", "dharshini");
	        
	        System.out.println("Login process completed!");
	        
	     // 3. Search Process
	        SearchPage sp = new SearchPage();
	        sp.searchAndClickGame("IT Girl");
	        sp.clickPlayAndDownload();
	  }
	}


