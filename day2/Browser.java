
package week3.day2;

import java.lang.StackWalker.Option;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	// Variables (State/Fields)
	String browserName="";
	String browserVersion="";
	
	

	// Common Methods (Behavior)
	public void openURL() {
		System.out.println(browserName + " is opening URL: " );
	}

	public void closeBrowser() {
		System.out.println(browserName + " (v" + browserVersion + ") is closing.");
	}

	public void navigateBack() {
		System.out.println(browserName + " is navigating back to the previous page.");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
