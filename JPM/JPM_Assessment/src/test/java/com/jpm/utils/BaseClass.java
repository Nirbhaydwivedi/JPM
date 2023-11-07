package com.jpm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	String browserName="";
	String url="";
	    public WebDriver implementBaseClass () throws IOException {
	        String pwd = System.getProperty("user.dir");
	        Properties prop = new Properties();
	        FileInputStream fis = new FileInputStream(pwd + "/src/test/java/com/jpm/utils/config.properties");
	        prop.load(fis);
	        browserName = prop.getProperty("Browser");
	        url = prop.getProperty("URL");
	       // if (driver == null) {
	            if (browserName.equalsIgnoreCase("chrome")) {
	                launchChromeBrowser();
	            } else if (browserName.equalsIgnoreCase("edge")) {
	                launchEdgeBrowser();
	            } else {
	                System.out.println("Invalid Browser");
	            }
	            driver.get(url);
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	        //}
	            return driver;

	    }
	    public void launchChromeBrowser()
	    {
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions options= new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("remote-allow-origin=*");
	        options.addArguments("disable-extensions");
	        options.addArguments("disable-infobars");
	        driver=new ChromeDriver(options);
	       
	    }

	    public void launchEdgeBrowser()
	    {
	        WebDriverManager.edgedriver().setup();
	        EdgeOptions options= new EdgeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("remote-allow-origin=*");
	        options.addArguments("disable-extensions");
	        options.addArguments("disable-infobars");
	        driver=new EdgeDriver(options);
	     

	    }
}
