package com.sophos.Capacitacion1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	WebDriver driver;
	
	public void navegadorGoogle() {
		
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		
		driver.get("https://www.eltiempo.com/");
		
	}
	
	public void cerrarNavegador() {
		
		driver.close();
	}
	
}
