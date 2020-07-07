package com.sophos.Capacitacion1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Driver {

	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void navegadorGoogle() {
		
		String rutaDriver = ".\\src\\main\\java\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		
	}
	
	public void buscarDato() {
		
		WebElement  cajaBuscar=driver.findElement(By.name("q"));
		cajaBuscar.click();
		cajaBuscar.sendKeys("Sophos Chronus");
		cajaBuscar.submit();
		esperar();
	}
	
	public void esperar() {
		
		try {Thread.sleep(5000);
		}catch(Exception e) {e.printStackTrace();};
			
	}
	
	public void cerrarNavegador() {
		
		driver.close();
	}
	
}
