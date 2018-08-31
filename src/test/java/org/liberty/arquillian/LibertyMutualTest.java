package org.liberty.arquillian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LibertyMutualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.firefox.marionette","C:\\workspace\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\workspace\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.libertymutual.com/";
        String expectedTitle = "Liberty Mutual | Insurance for Auto, Home & Life";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //String tagName = driver.findElement(By.id("email")).getTagName();
        //WebElement tagName = driver.findElement(By.xpath("//button[contains(.,'Auto')]"));
        //System.out.println(tagName);

       
        //close Fire fox
        //driver.close();


	}

}
